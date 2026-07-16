package com.devmind.meteo.kmp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.devmind.meteo.kmp.services.Validators.isValidDecimal
import com.devmind.meteo.kmp.services.Validators.isValidEmail
import com.devmind.meteo.kmp.services.Validators.isValidNumber
import com.devmind.meteo.kmp.services.Validators.isValidPassword
import com.devmind.meteo.kmp.services.Validators.isValidPhone
import com.devmind.meteo.kmp.ui.PhonePreview
import com.devmind.meteo.kmp.ui.images.HomeIconComponent
import com.devmind.meteo.kmp.ui.images.SuccessState
import com.devmind.meteo.kmp.ui.images.WarningState
import com.devmind.meteo.kmp.ui.theme.AppColor
import com.devmind.meteo.kmp.ui.theme.Typography.defaultFont
import meteo_kmp.shared.generated.resources.*
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

enum class FormFieldState(
    val borderColor: Color,
) {
    VALID(AppColor.SuccessBackgroundColor),
    INVALID(AppColor.ErrorBackgroundColor),
    EMPTY(AppColor.InputBorderColor),
}

enum class FormFieldType {
    TEXT,
    PASSWORD,
    NUMBER,
    DECIMAL,
    EMAIL,
    PHONE,
    SELECT,
}

enum class FormFieldError(
    val message: StringResource,
) {
    REQUIRED(Res.string.validation_required),
    PASSWORD_INVALID(Res.string.validation_password_invalid),
    NUMBER_INVALID(Res.string.validation_number_invalid),
    DECIMAL_INVALID(Res.string.validation_decimal_invalid),
    EMAIL_INVALID(Res.string.validation_email_invalid),
    PHONE_INVALID(Res.string.validation_phone_invalid),
}

data class FormFieldSelectOption(
    val value: String,
    val displayValue: String = value,
    val label: @Composable () -> Unit = { Text(displayValue) },
    val selectedLabel: (@Composable () -> Unit)? = null,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormFieldComponent(
    value: String,
    label: String,
    type: FormFieldType = FormFieldType.TEXT,
    selectOptions: List<FormFieldSelectOption> = emptyList(),
    isRequired: Boolean = false,
    isReadOnly: Boolean = false,
    modifier: Modifier = Modifier,
    inputModifier: Modifier = Modifier,
    onValidationChange: (isValid: Boolean) -> Unit = {},
    updateState: (value: String) -> Unit = {},
) {
    var showSelectOptions by remember { mutableStateOf(false) }
    val selectedOption = selectOptions.firstOrNull { it.value == value }
    val displaySelectValue = selectedOption?.displayValue ?: value
    val error: (String) -> FormFieldError? = {
        val requiredError = isRequired && it.isBlank()
        if (requiredError) {
            FormFieldError.REQUIRED
        } else {
            when (type) {
                FormFieldType.EMAIL -> if (!it.isValidEmail()) FormFieldError.EMAIL_INVALID else null
                FormFieldType.PHONE -> if (!it.isValidPhone()) FormFieldError.PHONE_INVALID else null
                FormFieldType.NUMBER -> if (!it.isValidNumber()) FormFieldError.NUMBER_INVALID else null
                FormFieldType.DECIMAL -> if (!it.isValidDecimal()) FormFieldError.DECIMAL_INVALID else null
                FormFieldType.PASSWORD -> if (!it.isValidPassword()) FormFieldError.PASSWORD_INVALID else null
                else -> null
            }
        }
    }
    val errorMessage: String? =
        error(value)?.let {
            stringResource(it.message)
        }

    val isValid = error(value) == null

    LaunchedEffect(isValid) {
        onValidationChange(isValid)
    }

    Column(modifier = modifier) {
        Row {
            RegularText(
                text = label,
                modifier = Modifier.padding(bottom = 6.dp),
                fontWeight = FontWeight.Bold,
            )
            if (isRequired) {
                RegularText(
                    text = "*",
                    modifier = Modifier.padding(start = 4.dp, top = 4.dp),
                    fontWeight = FontWeight.Bold,
                    color = AppColor.ErrorBackgroundColor,
                )
            }
        }

        val state =
            if (isValid && value.isBlank()) {
                FormFieldState.EMPTY
            } else if (isValid) {
                FormFieldState.VALID
            } else {
                FormFieldState.INVALID
            }

        if (isReadOnly) {
            Text(
                text = value,
                modifier = inputModifier.fillMaxWidth().padding(vertical = 12.dp),
                style =
                    TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 18.sp,
                        fontFamily = defaultFont(FontWeight.Medium),
                    ),
            )
        } else if (type == FormFieldType.SELECT) {
            Box(modifier = inputModifier.fillMaxWidth()) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, state.borderColor),
                    modifier = Modifier.fillMaxWidth().heightIn(min = 56.dp),
                    color = Color.Transparent,
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Box(modifier = Modifier.padding(end = 8.dp)) {
                            if (selectedOption != null) {
                                selectedOption.selectedLabel?.invoke() ?: selectedOption.label()
                            } else {
                                Text(
                                    text = displaySelectValue,
                                    style =
                                        TextStyle(
                                            fontSize = 16.sp,
                                            lineHeight = 18.sp,
                                            fontFamily = defaultFont(FontWeight.Medium),
                                        ),
                                )
                            }
                        }
                        if (state != FormFieldState.EMPTY) {
                            Image(
                                imageVector = if (state == FormFieldState.INVALID) WarningState else SuccessState,
                                contentDescription = state.name,
                                modifier = Modifier.width(24.dp).height(24.dp),
                                colorFilter = ColorFilter.tint(color = state.borderColor),
                            )
                        }
                    }
                }
                Box(
                    modifier =
                        Modifier
                            .matchParentSize()
                            .clickable(enabled = selectOptions.isNotEmpty()) { showSelectOptions = true },
                )
                if (showSelectOptions) {
                    Dialog(onDismissRequest = { showSelectOptions = false }) {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = AlertDialogDefaults.containerColor,
                        ) {
                            LazyColumn(
                                modifier = Modifier.fillMaxSize().padding(16.dp),
                                verticalArrangement = Arrangement.spacedBy(12.dp),
                            ) {
                                items(selectOptions, key = { it.value }) { option ->
                                    val isSelected = option.value == value
                                    Row(
                                        modifier =
                                            Modifier
                                                .background(
                                                        if (isSelected) AppColor.SuccessBackgroundColor
                                                        else Color.Transparent,

                                                )
                                                .fillMaxWidth()
                                                .clickable {
                                                    updateState(option.value)
                                                    showSelectOptions = false
                                                }
                                                .padding(horizontal = 8.dp, vertical = 12.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Row(
                                            modifier = Modifier.padding(end = 8.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                        ) {
                                            option.label()
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
                errorMessage?.also {
                    DescriptionText(
                        it,
                        color = AppColor.ErrorBackgroundColor,
                    )
                }
            }
        } else {
            OutlinedTextField(
                value = value,
                onValueChange = updateState,
                modifier = inputModifier.fillMaxWidth(),
                isError = !isValid,
                shape = RoundedCornerShape(12.dp),
                textStyle =
                    TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 18.sp,
                        fontFamily = defaultFont(FontWeight.Medium),
                    ),
                trailingIcon = {
                    if (state != FormFieldState.EMPTY) {
                        Image(
                            imageVector = if (state == FormFieldState.INVALID) WarningState else SuccessState,
                            contentDescription = state.name,
                            modifier = Modifier.width(24.dp).height(24.dp),
                            colorFilter = ColorFilter.tint(color = state.borderColor),
                        )
                    }
                },
                singleLine = true,
                colors =
                    OutlinedTextFieldDefaults.colors().copy(
                        errorTextColor = state.borderColor,
                        unfocusedIndicatorColor = state.borderColor,
                        focusedIndicatorColor = state.borderColor,
                        focusedTrailingIconColor = state.borderColor,
                        unfocusedTrailingIconColor = state.borderColor,
                    ),
                visualTransformation =
                    when (type) {
                        FormFieldType.PASSWORD -> PasswordVisualTransformation()
                        else -> VisualTransformation.None
                    },
                keyboardOptions =
                    KeyboardOptions(
                        keyboardType =
                            when (type) {
                                FormFieldType.TEXT -> KeyboardType.Text
                                FormFieldType.PASSWORD -> KeyboardType.Password
                                FormFieldType.NUMBER -> KeyboardType.Number
                                FormFieldType.DECIMAL -> KeyboardType.Decimal
                                FormFieldType.EMAIL -> KeyboardType.Email
                                FormFieldType.PHONE -> KeyboardType.Phone
                                FormFieldType.SELECT -> KeyboardType.Text
                            },
                    ),
                supportingText = {
                    errorMessage?.also {
                        DescriptionText(
                            it,
                            color = AppColor.ErrorBackgroundColor,
                        )
                    }
                },
            )
        }
    }
}

@PhonePreview
@Composable
fun FormFieldComponentPreview() {
    LazyColumn(
        modifier = Modifier.padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        item {
            FormFieldComponent(value = "", label = "Label", isRequired = true)
        }
        item {
            FormFieldComponent(value = "Value", label = "Label", isReadOnly = true)
        }
        item {
            FormFieldComponent(value = "Value", label = "Label", isRequired = true)
        }
        item {
            FormFieldComponent(value = "Password", label = "Test label")
        }
        item {
            FormFieldComponent(value = "", label = "Test label")
        }
        item {
            FormFieldComponent(value = "123", label = "Number label", type = FormFieldType.NUMBER)
        }
        item {
            FormFieldComponent(value = "email", label = "Email label", type = FormFieldType.EMAIL)
        }
        item {
            FormFieldComponent(value = "passw", label = "Password label", type = FormFieldType.PASSWORD)
        }
        item {
            FormFieldComponent(
                value = "Option 1",
                label = "Select label",
                type = FormFieldType.SELECT,
                selectOptions =
                    listOf(
                        FormFieldSelectOption(value = "option-1", displayValue = "Option 1"),
                        FormFieldSelectOption(value = "option-2", displayValue = "Option 2"),
                        FormFieldSelectOption(
                            value = "option-3",
                            displayValue = "Option with image",
                            label = {
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Image(
                                        imageVector = HomeIconComponent,
                                        contentDescription = "Home",
                                        modifier = Modifier.width(20.dp).height(20.dp),
                                    )
                                    Text("Option with image")
                                }
                            },
                        ),
                    ),
            )
        }
    }
}

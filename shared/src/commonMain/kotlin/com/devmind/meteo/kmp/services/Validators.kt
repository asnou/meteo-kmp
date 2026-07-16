package com.devmind.meteo.kmp.services

object Validators {
    val EMAIL_ADDRESS_PATTERN =
        Regex(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+",
        )

    val PHONE_PATTERN =
        Regex(
            "(\\+[0-9]+[\\- \\.]*)?" + // +<digits><sdd>*
                    "(\\([0-9]+\\)[\\- \\.]*)?" + // (<digits>)<sdd>*
                    "([0-9][0-9\\- \\.]+[0-9])", // <digit><digit|sdd>+<digit>;
        )

    val HAS_UPPERCASE_PATTERN = Regex("[A-Z]+")

    val HAS_LOWERCASE_PATTERN = Regex("[a-z]+")

    val HAS_NUMERIC_PATTERN = Regex("[0-9]+")

    fun String.isValidEmail(): Boolean = EMAIL_ADDRESS_PATTERN.matches(this)

    fun String.isValidPhone(): Boolean = PHONE_PATTERN.matches(this)

    fun String.isValidNumber(): Boolean =
        try {
            toInt().let { true }
        } catch (_: Exception) {
            false
        }

    fun String.isValidDecimal(): Boolean =
        try {
            toDouble().let { true }
        } catch (_: Exception) {
            false
        }

    fun String.isValidPassword(): Boolean =
        this.length >= 8 &&
                HAS_UPPERCASE_PATTERN.containsMatchIn(this) &&
                HAS_LOWERCASE_PATTERN.containsMatchIn(this) &&
                HAS_NUMERIC_PATTERN.containsMatchIn(this)
}

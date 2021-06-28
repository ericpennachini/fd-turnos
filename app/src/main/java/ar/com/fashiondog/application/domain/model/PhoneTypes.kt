package ar.com.fashiondog.application.domain.model

enum class PhoneTypes {
    PERSONAL, WORK, HOME, OTHER;

    companion object {
        fun safeValueOf(value: String?): PhoneTypes? {
            return if (value != null) {
                valueOf(value)
            } else {
                null
            }
        }
    }
}
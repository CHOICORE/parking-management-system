package me.choicore.samples.pms.core.type

@JvmInline
value class LicensePlateNumber(
    val value: String,
) {
    init {
        require(value.isNotBlank()) { "License plate number must not be blank." }
    }
}

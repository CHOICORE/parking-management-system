package me.choicore.samples.pms.core.type

@JvmInline
value class Dong(
    val value: String,
) {
    init {
        require(value.isNotBlank() && value.length <= 8) { "동은 최소 1자, 최대 8자 이내여야 합니다." }
    }

    companion object {
        val UNKNOWN = Dong("-")
    }
}

package me.choicore.samples.pms.core.keygen

interface KeyGenerationStrategy {
    val keyGenerationMethod: KeyGenerationMethod
    val saltProvider: SaltProvider

    fun generate(context: KeyGenerationContext): String
}

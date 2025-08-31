package me.choicore.samples.pms.core.keygen

interface SaltProvider {
    fun salt(context: KeyGenerationContext): String
}

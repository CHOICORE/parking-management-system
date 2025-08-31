package me.choicore.samples.pms.core.keygen

object ClientBasedKeyGenerationStrategy : KeyGenerationStrategy {
    override val keyGenerationMethod: KeyGenerationMethod = KeyGenerationMethod.CLIENT_BASED
    override val saltProvider: SaltProvider =
        object : SaltProvider {
            override fun salt(context: KeyGenerationContext): String = "C"
        }

    override fun generate(context: KeyGenerationContext): String {
        TODO("Not yet implemented")
    }
}

package me.choicore.samples.pms.core.keygen

object ServerBasedKeyGenerationStrategy : KeyGenerationStrategy {
    override val keyGenerationMethod: KeyGenerationMethod = KeyGenerationMethod.SERVER_BASED
    override val saltProvider: SaltProvider =
        object : SaltProvider {
            override fun salt(keyGenerationContext: KeyGenerationContext): String = "S"
        }

    override fun generate(context: KeyGenerationContext): String {
        TODO("Not yet implemented")
    }
}

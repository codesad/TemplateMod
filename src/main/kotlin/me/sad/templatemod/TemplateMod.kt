package me.sad.templatemod

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import org.apache.logging.log4j.LogManager

@SideOnly(Side.CLIENT)
@Mod(modid = TemplateMod.MOD_ID)
class TemplateMod {
    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        LOGGER.info("TemplateMod initialized")
    }

    companion object {
        const val MOD_ID = "templatemod"
        @get:JvmName("getLogger")
        @JvmStatic
        val LOGGER = LogManager.getLogger(MOD_ID)!!
    }
}

package me.sad.templatemod.mixins;

import me.sad.templatemod.TemplateMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(at = @At("RETURN"), method = "<init>")
    private void init(GameConfiguration gameConfig, CallbackInfo ci) {
        TemplateMod.getLogger().info("Minecraft initialized");
    }
}

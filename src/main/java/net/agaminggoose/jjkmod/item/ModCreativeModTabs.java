package net.agaminggoose.jjkmod.item;

import net.agaminggoose.jjkmod.block.ModBlocks;
import net.agaminggoose.jjkmod.jjkmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, jjkmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JUJUTSUKRAFT = CREATIVE_MODE_TABS.register("jujutsukraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FINGER.get()))
                    .title(Component.translatable("creativetab.jjkmod.jujutsukraft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FINGER.get());
                        output.accept(ModItems.HANDLE.get());
                        output.accept(ModItems.SPOTTED_LEATHER.get());
                        output.accept(ModItems.WRAPPED_CLEAVER.get());
                        output.accept(ModBlocks.SLASHEDPILLAR.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

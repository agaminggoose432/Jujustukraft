package net.agaminggoose.jjkmod.item;

import net.agaminggoose.jjkmod.jjkmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, jjkmod.MOD_ID);

    public static final RegistryObject<Item> FINGER = ITEMS.register("finger",
            () -> new Item(new Item.Properties().stacksTo(20)));

    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPOTTED_LEATHER = ITEMS.register("spotted_leather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WRAPPED_CLEAVER = ITEMS.register("wrapped_cleaver",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

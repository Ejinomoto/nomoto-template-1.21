package net.ejinomoto.mymod.item;

import net.ejinomoto.mymod.Nomoto;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item Unico_Uni = RegisterItem("unico_uni", new Item (new Item.Settings()));

    private static Item RegisterItem(String name , Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Nomoto.MOD_ID,name), item);
    }

    public static void registerModItems(){
        Nomoto.LOGGER.info("Registering Mod Items for " + Nomoto.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(Unico_Uni);
        });
    }
}



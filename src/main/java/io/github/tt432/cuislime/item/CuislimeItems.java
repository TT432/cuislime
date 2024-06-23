package io.github.tt432.cuislime.item;

import io.github.tt432.cuislime.Cuislime;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author TT432
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CuislimeItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cuislime.MOD_ID);

    public static final RegistryObject<Item> SLIME_ENDOPLASM =
            ITEMS.register("slime_endoplasm", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_GELATIN =
            ITEMS.register("slime_gelatin", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_GELATIN_WITH_HONEY =
            ITEMS.register("slime_gelatin_with_honey", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_ISOBEYAKI =
            ITEMS.register("slime_isobeyaki", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_LARVA =
            ITEMS.register("slime_larva", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_POP =
            ITEMS.register("slime_pop", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_SKEWER =
            ITEMS.register("slime_skewer", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_TART =
            ITEMS.register("slime_tart", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> SLIME_TART_SLICE =
            ITEMS.register("slime_tart_slice", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
    public static final RegistryObject<Item> STARGAZY_SLIME =
            ITEMS.register("stargazy_slime", () -> new Item(new Item.Properties().tab(CuislimeItemGroup.TAB)));
}

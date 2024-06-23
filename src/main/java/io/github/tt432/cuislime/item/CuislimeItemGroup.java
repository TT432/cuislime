package io.github.tt432.cuislime.item;

import io.github.tt432.cuislime.Cuislime;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * @author TT432
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CuislimeItemGroup {
    public static final CreativeModeTab TAB = new CreativeModeTab(Cuislime.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return CuislimeItems.SLIME_LARVA.get().getDefaultInstance();
        }
    };
}

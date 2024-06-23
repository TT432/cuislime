package io.github.tt432.cuislime.data;

import io.github.tt432.cuislime.Cuislime;
import io.github.tt432.cuislime.item.CuislimeItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * @author TT432
 */
public class CuislimeItemModelProvider extends ItemModelProvider {
    public CuislimeItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Cuislime.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(CuislimeItems.SLIME_ENDOPLASM.get());
        basicItem(CuislimeItems.SLIME_GELATIN.get());
        basicItem(CuislimeItems.SLIME_GELATIN_WITH_HONEY.get());
        basicItem(CuislimeItems.SLIME_ISOBEYAKI.get());
        basicItem(CuislimeItems.SLIME_LARVA.get());
        basicItem(CuislimeItems.SLIME_POP.get());
        basicItem(CuislimeItems.SLIME_SKEWER.get());
        basicItem(CuislimeItems.SLIME_TART.get());
        basicItem(CuislimeItems.SLIME_TART_SLICE.get());
        basicItem(CuislimeItems.STARGAZY_SLIME.get());
    }
}

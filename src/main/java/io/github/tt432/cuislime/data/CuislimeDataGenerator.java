package io.github.tt432.cuislime.data;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author TT432
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CuislimeDataGenerator {
    @SubscribeEvent
    public static void onEvent(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(true, new CuislimeItemModelProvider(generator, existingFileHelper));
            generator.addProvider(true, new CuislimeEnUsLangProvider(generator));
            generator.addProvider(true, new CuislimeZhCnLangProvider(generator));
        }
    }
}

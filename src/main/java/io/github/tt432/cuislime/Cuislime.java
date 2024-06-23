package io.github.tt432.cuislime;

import io.github.tt432.cuislime.item.CuislimeItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Cuislime.MOD_ID)
public class Cuislime {
    public static final String MOD_ID = "cuislime";

    public Cuislime() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        CuislimeItems.ITEMS.register(bus);
    }
}

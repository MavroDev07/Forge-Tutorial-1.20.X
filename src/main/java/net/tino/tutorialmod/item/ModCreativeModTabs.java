package net.tino.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tino.tutorialmod.TutorialMod;
import net.tino.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
          DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativeTab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.COPPER_COIL_BLOCK.get());
                        pOutput.accept(ModBlocks.LV_MACHINE_CASING.get());
                        pOutput.accept(ModBlocks.LV_MACHINE_CONTROLER.get());
                        pOutput.accept(ModBlocks.LV_MACHINE_ITEM_OUTPUT.get());
                        pOutput.accept(ModBlocks.LV_MACHINE_ITEM_INPUT.get());
                        pOutput.accept(ModBlocks.LV_MACHINE_ENERGY_INPUT.get());
                    })
                    .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

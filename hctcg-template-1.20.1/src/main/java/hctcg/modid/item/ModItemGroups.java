package hctcg.modid.item;

import hctcg.modid.HCTCG;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Decks = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HCTCG.MOD_ID, "deck"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.deck"))
                    .icon(() -> new ItemStack(ModItems.Deck)).entries((displayContext, entries) -> {
                       entries.add(ModItems.Deck);
                       entries.add(ModItems.AdvantageChart);
                        entries.add(ModItems.Bdubs_Common);
                        entries.add(ModItems.Balanced_Item);
                        entries.add(ModItems.Balanced_Itemx2);
                        entries.add(ModItems.Bdubs_Rare);
                        entries.add(ModItems.Builder_item);
                        entries.add(ModItems.Builder_itemx2);
                        entries.add(ModItems.Cub_Common);
                        entries.add(ModItems.Cub_Rare);
                        entries.add(ModItems.Etho_Common);
                        entries.add(ModItems.Etho_Rare);
                        entries.add(ModItems.Etho_UltraRare);
                        entries.add(ModItems.Explorer_Item);
                        entries.add(ModItems.Explorer_Itemx2);
                        entries.add(ModItems.False_Common);
                        entries.add(ModItems.False_Rare);
                        entries.add(ModItems.Farm_Item);
                        entries.add(ModItems.Farm_Itemx2);
                        entries.add(ModItems.Gem_Common);
                        entries.add(ModItems.Gem_Rare);
                        entries.add(ModItems.Grian_Common);
                        entries.add(ModItems.Grian_Rare);
                        entries.add(ModItems.Hypno_Common);
                        entries.add(ModItems.Hypno_Rare);
                        entries.add(ModItems.Impulse_Common);
                        entries.add(ModItems.Impulse_Rare);
                        entries.add(ModItems.Iskall_Common);
                        entries.add(ModItems.Iskall_Rare);
                        entries.add(ModItems.Jevin_Common);
                        entries.add(ModItems.Jevin_Rare);
                        entries.add(ModItems.JoeHills_Common);
                        entries.add(ModItems.JoeHills_Rare);
                        entries.add(ModItems.Keralis_Common);
                        entries.add(ModItems.Keralis_Rare);
                        entries.add(ModItems.Mumbo_Common);
                        entries.add(ModItems.Mumbo_Rare);
                        entries.add(ModItems.Pearl_Common);
                        entries.add(ModItems.Pearl_Rare);
                        entries.add(ModItems.Prankster_Item);
                        entries.add(ModItems.Prankster_Itemx2);
                        entries.add(ModItems.Pvp_Item);
                        entries.add(ModItems.Pvp_Itemx2);
                        entries.add(ModItems.Redstone_Item);
                        entries.add(ModItems.Redstone_Itemx2);
                        entries.add(ModItems.Ren_Common);
                        entries.add(ModItems.Ren_Rare);
                        entries.add(ModItems.Scar_Common);
                        entries.add(ModItems.Scar_Rare);
                        entries.add(ModItems.Speedrunner_Item);
                        entries.add(ModItems.Speedrunner_Itemx2);
                        entries.add(ModItems.Stress_Common);
                        entries.add(ModItems.Stress_Rare);
                        entries.add(ModItems.Tango_Common);
                        entries.add(ModItems.Tango_Rare);
                        entries.add(ModItems.Terraform_Item);
                        entries.add(ModItems.Terraform_Itemx2);
                        entries.add(ModItems.TFC_Common);
                        entries.add(ModItems.TFC_Rare);
                        entries.add(ModItems.TFC_UltraRare);
                        entries.add(ModItems.Beef_Common);
                        entries.add(ModItems.Beef_Rare);
                        entries.add(ModItems.Beef_UltraRare);
                        entries.add(ModItems.Wels_Common);
                        entries.add(ModItems.Wels_Rare);
                        entries.add(ModItems.XB_Common);
                        entries.add(ModItems.XB_Rare);
                        entries.add(ModItems.X_Common);
                        entries.add(ModItems.X_Rare);
                        entries.add(ModItems.Zed_Common);
                        entries.add(ModItems.Zed_Rare);
                        entries.add(ModItems.Cleo_Common);
                        entries.add(ModItems.Cleo_Rare);
                       // entries.add(ModItems.AdvantageChart); [change item name like the one in "ModItems" to add it in this item group
                    }).build());
    public static void registerItemGroups(){
        HCTCG.LOGGER.info("Registering Item Groups for " + HCTCG.MOD_ID);
    }
}

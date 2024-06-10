package hctcg.modid.item;

import hctcg.modid.HCTCG;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
// when removing comments remove things in "[]"
// DO NOT FORGET TO ADD TEXTURES! (in en_us.json, add a .json file for it in models and add the .png in textures)
public class ModItems {
    public static final Item Deck = registerItem("deck", new Item(new FabricItemSettings()));
    public static final Item AdvantageChart = registerItem("advantage_chart", new Item(new FabricItemSettings()));
    public static final Item Bdubs_Common = registerItem("bdubs_common", new Item(new FabricItemSettings()));
    public static final Item Balanced_Item = registerItem("balanced_item", new Item(new FabricItemSettings()));
    public static final Item Balanced_Itemx2 = registerItem("balanced_itemx2", new Item(new FabricItemSettings()));
    public static final Item Bdubs_Rare = registerItem("bdubs_rare", new Item(new FabricItemSettings()));
    public static final Item Builder_item = registerItem("builder_item", new Item(new FabricItemSettings()));
    public static final Item Builder_itemx2 = registerItem("builder_itemx2", new Item(new FabricItemSettings()));
    public static final Item Cub_Common = registerItem("cubfan_common", new Item(new FabricItemSettings()));
    public static final Item Cub_Rare = registerItem("cubfan_rare", new Item(new FabricItemSettings()));
    public static final Item Doc_Common = registerItem("docm_common", new Item(new FabricItemSettings()));
    public static final Item Doc_Rare = registerItem("docm_rare", new Item(new FabricItemSettings()));
    public static final Item Etho_Common = registerItem("etho_common", new Item(new FabricItemSettings()));
    public static final Item Etho_Rare = registerItem("etho_rare", new Item(new FabricItemSettings()));
    public static final Item Etho_UltraRare = registerItem("etho_ur", new Item(new FabricItemSettings()));
    public static final Item Explorer_Item = registerItem("explorer_item", new Item(new FabricItemSettings()));
    public static final Item Explorer_Itemx2 = registerItem("explorer_itemx2", new Item(new FabricItemSettings()));
    public static final Item False_Common = registerItem("false_common", new Item(new FabricItemSettings()));
    public static final Item False_Rare = registerItem("false_rare", new Item(new FabricItemSettings()));
    public static final Item Farm_Item = registerItem("farm_item", new Item(new FabricItemSettings()));
    public static final Item Farm_Itemx2 = registerItem("farm_itemx2", new Item(new FabricItemSettings()));
    public static final Item Gem_Common = registerItem("gem_common", new Item(new FabricItemSettings()));
    public static final Item Gem_Rare = registerItem("gem_rare", new Item(new FabricItemSettings()));
    public static final Item Grian_Common = registerItem("grian_common", new Item(new FabricItemSettings()));
    public static final Item Grian_Rare = registerItem("grian_rare", new Item(new FabricItemSettings()));
    public static final Item Hypno_Common = registerItem("hypno_common", new Item(new FabricItemSettings()));
    public static final Item Hypno_Rare = registerItem("hypno_rare", new Item(new FabricItemSettings()));
    public static final Item Impulse_Common = registerItem("impulse_common", new Item(new FabricItemSettings()));
    public static final Item Impulse_Rare = registerItem("impulse_rare", new Item(new FabricItemSettings()));
    public static final Item Iskall_Common = registerItem("iskall_common", new Item(new FabricItemSettings()));
    public static final Item Iskall_Rare = registerItem("iskall_rare", new Item(new FabricItemSettings()));
    public static final Item Jevin_Common = registerItem("jevin_common", new Item(new FabricItemSettings()));
    public static final Item Jevin_Rare = registerItem("jevin_rare", new Item(new FabricItemSettings()));
    public static final Item JoeHills_Common = registerItem("joehills_common", new Item(new FabricItemSettings()));
    public static final Item JoeHills_Rare = registerItem("joehills_rare", new Item(new FabricItemSettings()));
    public static final Item Keralis_Common = registerItem("keralis_common", new Item(new FabricItemSettings()));
    public static final Item Keralis_Rare = registerItem("keralis_rare", new Item(new FabricItemSettings()));
    public static final Item Miner_Item = registerItem("miner_item", new Item(new FabricItemSettings()));
    public static final Item Miner_Itemx2 = registerItem("miner_itemx2", new Item(new FabricItemSettings()));
    public static final Item Mumbo_Common = registerItem("mumbo_common", new Item(new FabricItemSettings()));
    public static final Item Mumbo_Rare = registerItem("mumbo_rare", new Item(new FabricItemSettings()));
    public static final Item Pearl_Common = registerItem("pearl_common", new Item(new FabricItemSettings()));
    public static final Item Pearl_Rare = registerItem("pearl_rare", new Item(new FabricItemSettings()));
    public static final Item Prankster_Item = registerItem("prankster_item", new Item(new FabricItemSettings()));
    public static final Item Prankster_Itemx2 = registerItem("prankster_itemx2", new Item(new FabricItemSettings()));
    public static final Item Pvp_Item = registerItem("pvp_item", new Item(new FabricItemSettings()));
    public static final Item Pvp_Itemx2 = registerItem("pvp_itemx2", new Item(new FabricItemSettings()));
    public static final Item Redstone_Item = registerItem("redstone_item", new Item(new FabricItemSettings()));
    public static final Item Redstone_Itemx2 = registerItem("redstone_itemx2", new Item(new FabricItemSettings()));
    public static final Item Ren_Common = registerItem("ren_common", new Item(new FabricItemSettings()));
    public static final Item Ren_Rare = registerItem("ren_rare", new Item(new FabricItemSettings()));
    public static final Item Scar_Common = registerItem("scar_common", new Item(new FabricItemSettings()));
    public static final Item Scar_Rare = registerItem("scar_rare", new Item(new FabricItemSettings()));
    public static final Item Speedrunner_Item = registerItem("speedrunner_item", new Item(new FabricItemSettings()));
    public static final Item Speedrunner_Itemx2 = registerItem("speedrunner_itemx2", new Item(new FabricItemSettings()));
    public static final Item Stress_Common = registerItem("stress_common", new Item(new FabricItemSettings()));
    public static final Item Stress_Rare = registerItem("stress_rare", new Item(new FabricItemSettings()));
    public static final Item Tango_Common = registerItem("tango_common", new Item(new FabricItemSettings()));
    public static final Item Tango_Rare = registerItem("tango_rare", new Item(new FabricItemSettings()));
    public static final Item Terraform_Item = registerItem("terraform_item", new Item(new FabricItemSettings()));
    public static final Item Terraform_Itemx2 = registerItem("terraform_itemx2", new Item(new FabricItemSettings()));
    public static final Item TFC_Common = registerItem("tfc_common", new Item(new FabricItemSettings()));
    public static final Item TFC_Rare = registerItem("tfc_rare", new Item(new FabricItemSettings()));
    public static final Item TFC_UltraRare = registerItem("tfc_ur", new Item(new FabricItemSettings()));
    public static final Item Beef_Common = registerItem("vintagebeef_common", new Item(new FabricItemSettings()));
    public static final Item Beef_Rare = registerItem("vintagebeef_rare", new Item(new FabricItemSettings()));
    public static final Item Beef_UltraRare = registerItem("vintagebeef_ur", new Item(new FabricItemSettings()));
    public static final Item Wels_Common = registerItem("welsknight_common", new Item(new FabricItemSettings()));
    public static final Item Wels_Rare = registerItem("welsknight_rare", new Item(new FabricItemSettings()));
    public static final Item XB_Common = registerItem("xb_common", new Item(new FabricItemSettings()));
    public static final Item XB_Rare = registerItem("xb_rare", new Item(new FabricItemSettings()));
    public static final Item X_Common = registerItem("xisuma_common", new Item(new FabricItemSettings()));
    public static final Item X_Rare = registerItem("xisuma_rare", new Item(new FabricItemSettings()));
    public static final Item Zed_Common = registerItem("zedaph_common", new Item(new FabricItemSettings()));
    public static final Item Zed_Rare = registerItem("zedaph_rare", new Item(new FabricItemSettings()));
    public static final Item Cleo_Common = registerItem("zombiecleo_common", new Item(new FabricItemSettings()));
    public static final Item Cleo_Rare = registerItem("zombie_cleo_rare", new Item(new FabricItemSettings()));

    //public static final Item Deck = registerItem("deck", new Item(new FabricItemSettings())); [replace "Deck", "deck" with what you want to add that item]

    private static void addToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(Deck);
        entries.add(AdvantageChart); //texture bug!!
        entries.add(Bdubs_Common);
        entries.add(Balanced_Item); 
        entries.add(Balanced_Itemx2);
        entries.add(Bdubs_Rare);
        entries.add(Builder_item);
        entries.add(Builder_itemx2);
        entries.add(Cub_Common);
        entries.add(Cub_Rare);
        entries.add(Doc_Common);
        entries.add(Doc_Rare);
        entries.add(Etho_Common);
        entries.add(Etho_Rare);
        entries.add(Etho_UltraRare);
        entries.add(Explorer_Item);
        entries.add(Explorer_Itemx2);
        entries.add(False_Common);
        entries.add(False_Rare);
        entries.add(Farm_Item);
        entries.add(Farm_Itemx2);
        entries.add(Gem_Common);
        entries.add(Gem_Rare);
        entries.add(Grian_Common);
        entries.add(Gem_Rare);
        entries.add(Hypno_Common);
        entries.add(Hypno_Rare);
        entries.add(Impulse_Common);
        entries.add(Iskall_Common);
        entries.add(Iskall_Rare);
        entries.add(Jevin_Common);
        entries.add(Jevin_Rare);
        entries.add(JoeHills_Common);
        entries.add(JoeHills_Rare);
        entries.add(Keralis_Common);
        entries.add(Keralis_Rare);
        entries.add(Miner_Item);
        entries.add(Miner_Itemx2);
        entries.add(Mumbo_Common);
        entries.add(Mumbo_Rare);
        entries.add(Pearl_Common);
        entries.add(Pearl_Rare);
        entries.add(Prankster_Item);
        entries.add(Prankster_Itemx2);
        entries.add(Pvp_Item);
        entries.add(Pvp_Itemx2);
        entries.add(Redstone_Item);
        entries.add(Redstone_Itemx2);
        entries.add(Ren_Common);
        entries.add(Ren_Rare);
        entries.add(Scar_Common);
        entries.add(Scar_Rare);
        entries.add(Speedrunner_Item);
        entries.add(Speedrunner_Itemx2);
        entries.add(Stress_Common);
        entries.add(Stress_Rare);
        entries.add(Tango_Common);
        entries.add(Tango_Rare);
        entries.add(Terraform_Item);
        entries.add(Terraform_Itemx2);
        entries.add(TFC_Common);
        entries.add(TFC_Rare);
        entries.add(TFC_UltraRare);
        entries.add(Beef_Common);
        entries.add(Beef_Rare);
        entries.add(Beef_UltraRare);
        entries.add(Wels_Common);
        entries.add(Wels_Rare);
        entries.add(XB_Common);
        entries.add(XB_Rare);
        entries.add(X_Common);
        entries.add(X_Rare);
        entries.add(Zed_Common);
        entries.add(Zed_Rare);
        entries.add(Cleo_Common);
        entries.add(Cleo_Rare);
        //entries.add(Deck); [replace "Deck" with what you want]
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(HCTCG.MOD_ID, name), item);
    }
    public static void registerModItems (){
        HCTCG.LOGGER.info("Registering Mod Items for " + HCTCG.MOD_ID);

       //ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addToIngredientTabItemGroup); [removed cuz i do not want them in the tools creative tab]
    }}



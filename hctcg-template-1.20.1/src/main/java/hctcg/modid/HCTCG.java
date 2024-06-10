package hctcg.modid;

import hctcg.modid.item.ModItemGroups;
import hctcg.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HCTCG implements ModInitializer {
public static final String MOD_ID = "hctcg";
    public static final Logger LOGGER = LoggerFactory.getLogger("hctcg");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}
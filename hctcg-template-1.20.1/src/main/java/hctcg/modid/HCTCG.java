package hctcg.modid;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HCTCG implements ModInitializer {
public static final String MOD_ID = "hctcg";
    public static final Logger LOGGER = LoggerFactory.getLogger("hctcg");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}
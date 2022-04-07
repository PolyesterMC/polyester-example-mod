package net.polyestermc.examplemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInitializer {

	public static Logger LOGGER = LogManager.getLogger();
	public final static String MOD_NAME = "ExampleMod";

	@Override
	public void onInitialize() {
		log(Level.INFO, "Hello Polyester World!");
	}

	public static void log(Level level, String message) {
		LOGGER.log(level, "[" + MOD_NAME + "] " + message);
	}
}

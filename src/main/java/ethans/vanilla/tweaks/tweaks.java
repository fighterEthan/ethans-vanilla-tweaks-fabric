package ethans.vanilla.tweaks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class tweaks implements ModInitializer {

	private static Enchantment SHULKERSESSENCE = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("tweaks", "shulkers_essence"),
			new ShulkersEssence()
	);
	private static Enchantment MEDUSA = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("tweaks", "medusa"),
			new Medusa()
	);
	private static Enchantment LEECH = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("tweaks", "leech"),
			new Leech()
	);
	private static Enchantment POISONTIPPED = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("tweaks", "poison_tipped"),
			new PoisonTipped()
	);


	public static final Logger LOGGER = LoggerFactory.getLogger("tweaks");

	@Override
			public void onInitialize() {
	LOGGER.info("Hello Fabric world!");
	}
}

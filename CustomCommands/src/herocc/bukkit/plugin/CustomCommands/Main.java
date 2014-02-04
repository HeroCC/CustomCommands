/**
@author HeroCC
**/

package herocc.bukkit.plugin.CustomCommands;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	public static Main plugin;
	public final Logger log = Logger.getLogger("Minecraft");
	public String IN_GAME_PREFIX = "[CustomCommands] ";
	public String PREFIX = "[CustomCommands] ";
	
	@Override
	public void onEnable() {
		log.info(PREFIX + is now Enabled);
	}
	

	
}

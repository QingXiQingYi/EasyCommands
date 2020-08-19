package club.mcoc.easycommands;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.configuration.file.FileConfiguration;

public final class EasyCommands extends JavaPlugin {
    public FileConfiguration config = getConfig();
    public class PlayerCommandPreprocessEvent

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[EasyCommands]已经成功装载");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[EasyCommands]已经成功卸载");
    }
}

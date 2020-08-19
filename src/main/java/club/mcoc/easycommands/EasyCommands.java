package club.mcoc.easycommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public final class EasyCommands extends JavaPlugin {
    public FileConfiguration config = getConfig();//实例化配置文件类来使用

    /**
     * 加载
     */
    @Override
    public void onLoad() {

    }

    /**
     * 启用
     */
    @Override
    public void onEnable() {
        saveDefaultConfig();//判断配置文件是否存在，不存在就生成默认配置文件 config.yml
        //todo config setting
        // Plugin startup logic
        getLogger().info("[EasyCommands]已经成功装载");
        /*  String str = config.getString("String");  // 使用config.yml里的字符串，下同
            boolean bool = config.getBoolean("boolean"); //布尔值
            int i = config.getInt("int"); //整数
            long l = config.getLong("long"); //长整数
            double d = config.getDouble("double");
            Object obj = config.get("object");
        */
    }

    /**
     * 执行命令
     * @param sender
     * @param command
     * @param label
     * @param args
     * @return
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return super.onCommand(sender, command, label, args);
    }

    /**
     * Tab补全
     * @param sender
     * @param command
     * @param alias
     * @param args
     * @return
     */
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return super.onTabComplete(sender, command, alias, args);
    }

    /**
     * 禁用
     */
    @Override
    public void onDisable() {
        getLogger().info("[EasyCommands]已经成功卸载");
    }
}

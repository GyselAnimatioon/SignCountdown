package ch.gyselanimatioon.countdown;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static Main plugin = null;
	@Override
	public void onEnable() {
		plugin = this;
		Bukkit.getServer().getPluginManager().registerEvents(new SignUse(), this);
		new Updater();
	}
}

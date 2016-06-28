package ch.gyselanimatioon.countdown;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Sign;

public class Updater {

	public Updater() {
		// EVERY 5 SECONDS
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
			@Override
			public void run() {
				Location bLocation = new Location(Bukkit.getWorld("world"), 516, 55, -563);
				Sign sign = (Sign) bLocation.getBlock();
				long countdownEnde = 1467331200;
				long now = System.currentTimeMillis() / 1000;
				long timer = countdownEnde - now;
				long sekunden = timer;
				long minuten = (long) (timer / 60);
				long stunden = (long) (timer / 3600);
				sign.setLine(1, sekunden + " Sek.");
				sign.setLine(2, minuten + " Min.");
				sign.setLine(3, stunden + " Std.");
				sign.update();
			}
		}, 0L, 20L);
	}

}

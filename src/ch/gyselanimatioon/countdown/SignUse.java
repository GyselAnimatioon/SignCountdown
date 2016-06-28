package ch.gyselanimatioon.countdown;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignUse implements Listener {

	public SignUse() {
	}

	@EventHandler
	public void onSignUse(PlayerInteractEvent event) {
		Bukkit.broadcastMessage("event.");
		if (event.hasBlock() && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Bukkit.broadcastMessage("clickede.");
			if (event.getClickedBlock().getType() == Material.SIGN_POST || event.getClickedBlock().getType() == Material.WALL_SIGN) {
				Bukkit.broadcastMessage("sign.");
				Sign s = (Sign) event.getClickedBlock().getState();

				if(s.getLine(0).equalsIgnoreCase("countdown")) {
					Bukkit.broadcastMessage("countdown.");
					long countdownEnde = 1467331200;
					long now = System.currentTimeMillis() / 1000;
					long timer = countdownEnde - now;
					long sekunden = timer;
					long minuten = (long) (timer / 60);
					long stunden = (long) (timer / 3600);
					s.setLine(1, sekunden + " Sek.");
					s.setLine(2, minuten + " Min.");
					s.setLine(3, stunden + " Std.");
					s.update();
				}
			}
		}
	}
}

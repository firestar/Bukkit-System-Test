package com.firestar.systemtest;
import org.bukkit.event.player.*;

public class systemtestPlayerlistener extends PlayerListener {
		systemtest p;
		public systemtestPlayerlistener(systemtest plugin){
			p = plugin;
		}
		public boolean check(String key){
			if(p.event_disabled.containsKey(key)){
    			if(p.event_disabled.get(key)){
    				return true;
    			}else{
    				return false;
    			}
    		}else{
    			return false;
    		}
		}
		public void increase(String key){
			Integer c=p.information.get(key);
			p.information.put(key,(c+1));
		}
		public void onPlayerLogin(PlayerLoginEvent event) {
			increase("loggedattempt");
		}
		public void onPlayerJoin(PlayerEvent event) {
			increase("loggedin");
		}
		public void onPlayerQuit(PlayerEvent event) {
			increase("loggedout");
	    }
		public void onPlayerChat(PlayerChatEvent event) {
			increase("players_chat");
	    }
		public void onPlayerMove(PlayerMoveEvent event) {
			increase("players_move");
			if(check("players_move")){
	    		event.setCancelled(true);
	    	}
	    }
		public void onPlayerTeleport(PlayerMoveEvent event) {
			increase("players_teleport");
			if(check("players_teleport")){
	    		event.setCancelled(true);
	    	}
	    }
		public void onPlayerItem(PlayerItemEvent event) {
			increase("players_item");
			if(check("players_item")){
	    		event.setCancelled(true);
	    	}
	    }
		public void onPlayerEggThrow(PlayerEggThrowEvent event) {
			increase("players_egg");
	    }
}
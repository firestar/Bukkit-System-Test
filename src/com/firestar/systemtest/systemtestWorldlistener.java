package com.firestar.systemtest;

import org.bukkit.event.world.*;

public class systemtestWorldlistener extends WorldListener {
		systemtest p;
		public systemtestWorldlistener(systemtest plugin){
			p = plugin;
		}
		public void increase(String key){
			Integer c=p.information.get(key);
			p.information.put(key,(c+1));
		}
	    public void onChunkLoaded(ChunkLoadEvent event) {
	    	increase("chunk_loaded");
	    }
	    public void onChunkUnloaded(ChunkUnloadEvent event) {
	    	increase("chunk_unloaded");
	    }
}
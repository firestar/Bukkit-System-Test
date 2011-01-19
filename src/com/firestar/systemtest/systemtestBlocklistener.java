package com.firestar.systemtest;

import org.bukkit.event.block.*;

public class systemtestBlocklistener extends BlockListener {
		systemtest p;
		public systemtestBlocklistener(systemtest plugin){
			p = plugin;
		}
		public void increase(String key){
			Integer c=p.information.get(key);
			p.information.put(key,(c+1));
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
	    public void onBlockDamage(BlockDamageEvent event) {
	    	increase("block_damaged");
	    	if(check("block_damaged")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onBlockCanBuild(BlockCanBuildEvent event) {
	    	increase("block_canbuild");
	    }
	    public void onBlockFlow(BlockFromToEvent event) {
	    	increase("block_flow");
	    	if(check("block_flow")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onBlockIgnite(BlockIgniteEvent event) {
	    	increase("block_ignite");
	    	if(check("block_ignite")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onBlockPhysics(BlockPhysicsEvent event) {
	    	increase("block_physics");
	    	if(check("block_physics")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onBlockPlace(BlockPlaceEvent event) {
	    	increase("block_placed");
	    	if(check("block_placed")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onBlockInteract(BlockInteractEvent event) {
	    	increase("block_interact");
	    	if(check("block_interact")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onBlockRightClick(BlockRightClickEvent event) {
	    	increase("block_rightclick");
	    }
	    public void onBlockRedstoneChange(BlockFromToEvent event) {
	    	increase("redstone");
	    	if(check("redstone")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onLeavesDecay(LeavesDecayEvent event) {
	    	increase("leaves");
	    	if(check("leaves")){
	    		event.setCancelled(true);
	    	}
	    }
	}
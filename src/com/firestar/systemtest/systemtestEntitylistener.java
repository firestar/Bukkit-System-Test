package com.firestar.systemtest;

import org.bukkit.event.entity.*;

public class systemtestEntitylistener extends EntityListener {
		systemtest p;
		public systemtestEntitylistener(systemtest plugin){
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
	    public void onEntityDamageByBlock(EntityDamageByBlockEvent event) {
	    	increase("entity_damagedby_block");
	    	if(check("entity_damagedby_block")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
	    	increase("entity_damagedby_entity");
	    	if(check("entity_damagedby_entity")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onEntityDamageByProjectile(EntityDamageByProjectileEvent event) {
	    	increase("entity_damagedby_projectile");
	    	if(check("entity_damagedby_projectile")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onEntityCombust(EntityCombustEvent event) {
	    	increase("entity_combust");
	    	if(check("entity_combust")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onEntityDamage(EntityDamageEvent event) {
	    	increase("entity_damaged");
	    	if(check("entity_damaged")){
	    		event.setCancelled(true);
	    	}
	    }
	    public void onEntityExplode(EntityExplodeEvent event) {
	    	increase("entity_explode");
	    	if(check("entity_explode")){
	    		event.setCancelled(true);
	    	}
	    }
	}
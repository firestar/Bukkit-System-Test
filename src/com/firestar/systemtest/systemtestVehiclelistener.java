package com.firestar.systemtest;

import org.bukkit.event.vehicle.*;

public class systemtestVehiclelistener extends VehicleListener {
		systemtest p;
		public systemtestVehiclelistener(systemtest plugin){
			p = plugin;
		}
		public void increase(String key){
			Integer c=p.information.get(key);
			p.information.put(key,(c+1));
		}
	    public void onVehicleCreate(VehicleCreateEvent event) {
	    	increase("vehicle_create");
	    }
	    public void onVehicleDamage(VehicleDamageEvent event) {
	    	increase("vehicle_damage");
	    }
	    public void onVehicleBlockCollision(VehicleBlockCollisionEvent event) {
	    	increase("vehicle_collision_block");
	    }
	    public void onVehicleEntityCollision(VehicleEntityCollisionEvent event) {
	    	increase("vehicle_collision_entity");
	    }
	    public void onVehicleEnter(VehicleEnterEvent event) {
	    	increase("vehicle_enter");
	    }
	    public void onVehicleExit(VehicleExitEvent event) {
	    	increase("vehicle_exit");
	    }
	    public void onVehicleMove(VehicleMoveEvent event) {
	    	increase("vehicle_move");
	    }
}
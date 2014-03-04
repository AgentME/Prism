package me.botsko.prism.listeners;

import java.util.Map;
import java.util.Map.Entry;

import me.botsko.prism.Prism;
import me.botsko.prism.actionlibs.ActionFactory;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class PrismHopperEvents implements Listener {
	
	/**
	 * 
	 */
	private Prism plugin;

	/**
	 * 
	 * @param plugin
	 */
	public PrismHopperEvents( Prism plugin ){
		this.plugin = plugin;
	}
	
	
	/**
	 * 
	 * @param event
	 */
	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onInventoryPickupItem(final InventoryPickupItemEvent event){
		
		if( !plugin.getTrackHopperItemEvents() ) return;
		
		if( !Prism.getIgnore().event("item-pickup") ) return;
		
		// If hopper
		if( event.getInventory().getType().equals(InventoryType.HOPPER) ){
			Prism.actionsRecorder.addToQueue( ActionFactory.create("item-pickup", event.getItem().getItemStack(), event.getItem().getItemStack().getAmount(), -1, null, event.getItem().getLocation(), "hopper") );
		}
	}
	
	
	/**
	 * 
	 * @param event
	 */
	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onInventoryMoveItem(final InventoryMoveItemEvent event){
		
		if( !plugin.getTrackHopperItemEvents() ) return;
		
		if( !Prism.getIgnore().event("item-insert") ) return;
		
		if( event.getDestination() == null ) return;
		
		// Get container
		InventoryHolder ih = event.getDestination().getHolder();
		Location containerLoc = null;
		if(ih instanceof BlockState){
			BlockState eventChest = (BlockState) ih;
		    containerLoc = eventChest.getLocation();
		}
		
		if( containerLoc == null ) return;
		
		if( event.getSource().getType().equals(InventoryType.HOPPER) ){
			Prism.actionsRecorder.addToQueue( ActionFactory.create("item-insert", event.getItem(), event.getItem().getAmount(), 0, null, containerLoc, "hopper") );
		}
	}
}

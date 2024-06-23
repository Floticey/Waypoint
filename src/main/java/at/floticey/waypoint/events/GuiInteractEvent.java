package at.floticey.waypoint.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiInteractEvent implements Listener {

    @EventHandler
    public void interactEvent(InventoryClickEvent e) {

        if (e.getView().getTitle().equals(ChatColor.RESET + (ChatColor.BLUE + "Waypoints")) && e.getCurrentItem() != null) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();


        }
    }
}

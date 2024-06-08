package at.floticey.waypoint.gui;

import at.floticey.waypoint.Waypoint;
import at.floticey.waypoint.dto.WaypointConstructor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WaypointGUI {

    private int[] Frame_Slots = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 18, 27, 36, 45, 46, 47, 48, 49, 50, 51, 52, 53, 44, 35, 26, 17};
    private int MAX_SLOTS_PER_ROW = 7;
    private int MAX_SLOTS_PER_PAGE = 28;
    private Inventory inv;

    public void generateFrame() {
        if (this.inv == null) return;
        ItemStack frame = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta frameMeta = frame.getItemMeta();
        frameMeta.setDisplayName(ChatColor.RESET + " ");
        frame.setItemMeta(frameMeta);
        for (int i : Frame_Slots) {
            inv.setItem(i, frame);
        }
    }

    public void generateWaypoints() {
        int currentSlot = 10;
        int currentWaypointSlots = 0;
        for (WaypointConstructor waypointConstructor : Waypoint.waypointList) {
            ItemStack waypointItem = new ItemStack(Material.PAPER);
            ItemMeta waypointMeta = waypointItem.getItemMeta();
            waypointMeta.setDisplayName(ChatColor.RESET + (ChatColor.YELLOW + waypointConstructor.name));
            waypointItem.setItemMeta(waypointMeta);
            inv.setItem(currentSlot, waypointItem);
            currentWaypointSlots++;

            if (currentWaypointSlots % MAX_SLOTS_PER_PAGE == 0) {
                break;
            } else if (currentWaypointSlots % MAX_SLOTS_PER_ROW == 0) {
                currentSlot += 3;
            }
            else {
                currentSlot++;
            }
        }
    }

    public void openGUI(Player player) {
        this.inv = Bukkit.createInventory(player, 54, ChatColor.RESET + (ChatColor.BLUE + "Waypoints"));
        this.generateFrame();
        this.generateWaypoints();
        player.openInventory(inv);
    }
}

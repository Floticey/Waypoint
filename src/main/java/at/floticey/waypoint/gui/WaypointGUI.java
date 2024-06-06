package at.floticey.waypoint.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WaypointGUI {

    private int[] Frame_Slots = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 18, 27, 36, 45, 46, 47, 48, 49, 50, 51, 52, 53, 44, 35, 26, 17};

    private Inventory inv;

    public void generateFrame () {
        if (this.inv == null) return;
        ItemStack frame = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta frameMeta = frame.getItemMeta();
        frameMeta.setDisplayName(ChatColor.RESET + " ");
        frame.setItemMeta(frameMeta);
        for (int i : Frame_Slots) {
            inv.setItem(i, frame);
        }
    }

    public void openGUI () {
        //verbindet die einzelnen GUI Methoden
    }
}

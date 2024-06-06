package at.floticey.waypoint.commands;

import at.floticey.waypoint.Waypoint;
import at.floticey.waypoint.dto.WaypointConstructor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WaypointCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 1) {
                WaypointConstructor waypointConstructor = new WaypointConstructor(player.getUniqueId(), args[0], player.getLocation());
                Waypoint.waypointList.add(waypointConstructor);
                player.sendMessage("Waypoint " + ChatColor.GREEN + args[0] + ChatColor.RESET + " wurde gesetzt");
            } else {
                player.sendMessage("Missing argument " + ChatColor.RED + " <name>");
            }

        }

        return false;
    }
}

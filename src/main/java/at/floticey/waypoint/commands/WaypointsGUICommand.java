package at.floticey.waypoint.commands;

import at.floticey.waypoint.gui.WaypointGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WaypointsGUICommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;

            WaypointGUI waypointGUI = new WaypointGUI();
            waypointGUI.openGUI(player);
        }

        return false;
    }
}

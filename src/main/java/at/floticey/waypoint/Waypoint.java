package at.floticey.waypoint;

import at.floticey.waypoint.commands.WaypointCommand;
import at.floticey.waypoint.dto.WaypointConstructor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Waypoint extends JavaPlugin {

    public static List<WaypointConstructor> waypointList = new ArrayList<>();

    @Override
    public void onEnable() {

        getCommand("setwaypoint").setExecutor(new WaypointCommand());

    }
}

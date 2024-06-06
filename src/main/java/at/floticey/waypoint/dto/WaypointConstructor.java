package at.floticey.waypoint.dto;

import org.bukkit.Location;

import java.util.UUID;

public class WaypointConstructor {
    public UUID ownerUUID;
    public String name;
    public Location location;

    public WaypointConstructor(UUID ownerUUID, String name, Location location) {
        this.ownerUUID = ownerUUID;
        this.name = name;
        this.location = location;
    }
}

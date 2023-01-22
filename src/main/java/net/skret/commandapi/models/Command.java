package net.skret.commandapi.models;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class Command implements CommandExecutor {

    private final String name;
    private final String permission;
    private final boolean playerOnly;
    private final Map<String, Command> subCommands;

    public Command(String name, String permission, boolean playerOnly) {
        this.name = name;
        this.permission = permission;
        this.playerOnly = playerOnly;
        this.subCommands = new HashMap<>();
    }

    @Override
    public final boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {

        if (playerOnly && !(sender instanceof Player player)) {

        }

        return true;
    }
}

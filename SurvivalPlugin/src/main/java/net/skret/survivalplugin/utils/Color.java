package net.skret.survivalplugin.utils;

import org.bukkit.ChatColor;

public class Color {

    public static String color(String text) {
        return ChatColor.RESET + ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String strip(String text) {
        return ChatColor.stripColor(text);
    }

}

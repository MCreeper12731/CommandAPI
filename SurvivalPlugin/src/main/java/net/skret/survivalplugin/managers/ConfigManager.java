package net.skret.survivalplugin.managers;

import lombok.Getter;
import net.skret.survivalplugin.SurvivalPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class ConfigManager {

    private final SurvivalPlugin plugin;

    @Getter
    private FileConfiguration config;

    public ConfigManager(SurvivalPlugin plugin) {
        this.plugin = plugin;
        plugin.saveDefaultConfig();
        this.config = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder().getAbsoluteFile() + "/config.yml"));
    }

    public void reload() {
        this.config = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder().getAbsoluteFile() + "/config.yml"));

    }

}

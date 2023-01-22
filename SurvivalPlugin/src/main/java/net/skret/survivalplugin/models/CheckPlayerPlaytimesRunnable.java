package net.skret.survivalplugin.models;

import me.clip.placeholderapi.PlaceholderAPI;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import net.skret.survivalplugin.SurvivalPlugin;
import net.skret.survivalplugin.managers.RanksManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class CheckPlayerPlaytimesRunnable extends BukkitRunnable {

    private final LuckPerms luckPerms;
    private final SurvivalPlugin plugin;
    private final RanksManager ranksManager;

    public CheckPlayerPlaytimesRunnable(LuckPerms luckPerms, SurvivalPlugin plugin, RanksManager ranksManager) {
        this.luckPerms = luckPerms;
        this.plugin = plugin;
        this.ranksManager = ranksManager;
    }

    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            User user = luckPerms.getUserManager().getUser(player.getUniqueId());
            if (user == null) return;
            //int playtime = Integer.parseInt(PlaceholderAPI.setPlaceholders(player, "%statistic_time_played:hours%"));
            for (Rank rank : ranksManager.getPlaytimeRanks()) {

            }
        }
    }

    public void start() {
        this.runTaskTimerAsynchronously(plugin, 0L, 20L * 60L);
    }
}

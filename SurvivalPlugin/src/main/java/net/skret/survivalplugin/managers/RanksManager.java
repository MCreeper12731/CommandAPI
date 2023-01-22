package net.skret.survivalplugin.managers;

import lombok.Getter;
import net.skret.survivalplugin.models.Rank;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class RanksManager {

    @Getter
    private final List<Rank> playtimeRanks;

    public RanksManager(FileConfiguration config) {
        this.playtimeRanks = List.of(
                new Rank(config.getInt("god"), "god", 'f'     ),
                new Rank(config.getInt("highness"), "highness", 'f' ),
                new Rank(config.getInt("emperor"), "emperor", 'f'  ),
                new Rank(config.getInt("kingsmen"), "kingsmen", 'f' ),
                new Rank(config.getInt("guardian"), "guardian", 'f' ),
                new Rank(config.getInt("knight"), "knight", 'f'    ),
                new Rank(config.getInt("calvary"), "calvary", 'f'   ),
                new Rank(config.getInt("soldier"), "soldier", 'f'   ),
                new Rank(config.getInt("defender"), "defender", 'f'  ),
                new Rank(config.getInt("guard"), "guard", 'f'     ),
                new Rank(config.getInt("sentry"), "sentry", 'f'    ),
                new Rank(config.getInt("scout"), "scout", 'f'     ),
                new Rank(config.getInt("peon"), "peon", 'f'      ),
                new Rank(config.getInt("rat"), "rat", 'f'      ),
                new Rank(config.getInt("default"), "default", 'f'    )
        );
    }

}

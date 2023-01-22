package net.skret.survivalplugin.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Rank {

    private final int minPlaytime;
    private final String name;
    private final char color;

}

package io.papermc.lib.environments;

import io.papermc.lib.features.asyncchunks.AsyncChunksSalt;
import io.papermc.lib.features.asyncteleport.AsyncTeleportPaper;
import io.papermc.lib.features.bedspawnlocation.BedSpawnLocationPaper;

public class SaltEnvironment extends PaperEnvironment {

    public SaltEnvironment() {
        super();
        this.asyncChunksHandler = new AsyncChunksSalt();
        this.asyncTeleportHandler = new AsyncTeleportPaper();
        this.bedSpawnLocationHandler = new BedSpawnLocationPaper();
    }

    @Override
    public boolean isSalt() {
        return true;
    }
}
package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: GameServerIdReader.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GameServerIdReader extends MetadataReader<String> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    /* JADX INFO: compiled from: GameServerIdReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(@NotNull JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
        p.k(jsonStorage, "jsonStorage");
    }
}

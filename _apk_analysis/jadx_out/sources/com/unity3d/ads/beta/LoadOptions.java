package com.unity3d.ads.beta;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LoadOptions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class LoadOptions {

    @Nullable
    private final String adMarkup;

    @NotNull
    private final Map<String, String> extras;

    @NotNull
    private final String placementId;

    /* JADX INFO: compiled from: LoadOptions.kt */
    public static final class Builder {

        @Nullable
        private String adMarkup;

        @NotNull
        private final Map<String, String> extras;

        @NotNull
        private final String placementId;

        public Builder(@NotNull String str) {
            p.k(str, "placementId");
            this.placementId = str;
            this.extras = new LinkedHashMap();
        }

        @NotNull
        public final LoadOptions build() {
            return new LoadOptions(this.placementId, this.adMarkup, this.extras);
        }

        @NotNull
        public final Builder withAdMarkup(@NotNull String str) {
            p.k(str, "adMarkup");
            this.adMarkup = str;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> map) {
            p.k(map, "extras");
            this.extras.putAll(map);
            return this;
        }
    }

    public LoadOptions(@NotNull String str, @Nullable String str2, @NotNull Map<String, String> map) {
        p.k(str, "placementId");
        p.k(map, "extras");
        this.placementId = str;
        this.adMarkup = str2;
        this.extras = map;
    }

    public /* synthetic */ LoadOptions(String str, String str2, Map map, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? a.j() : map);
    }

    @Nullable
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }
}

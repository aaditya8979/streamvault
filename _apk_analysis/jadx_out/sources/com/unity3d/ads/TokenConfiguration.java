package com.unity3d.ads;

import java.util.Map;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TokenConfiguration.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class TokenConfiguration {

    @NotNull
    private final AdFormat adFormat;

    @NotNull
    private final Map<String, String> extras;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenConfiguration(@NotNull AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        p.k(adFormat, "adFormat");
    }

    public TokenConfiguration(@NotNull AdFormat adFormat, @NotNull Map<String, String> map) {
        p.k(adFormat, "adFormat");
        p.k(map, "extras");
        this.adFormat = adFormat;
        this.extras = map;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i10, i iVar) {
        this(adFormat, (i10 & 2) != 0 ? a.j() : map);
    }

    @NotNull
    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }
}

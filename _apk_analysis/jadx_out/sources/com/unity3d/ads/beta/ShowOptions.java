package com.unity3d.ads.beta;

import java.util.Map;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ShowOptions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ShowOptions {

    @NotNull
    private final Map<String, String> extras;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ShowOptions(@NotNull Map<String, String> map) {
        p.k(map, "extras");
        this.extras = map;
    }

    public /* synthetic */ ShowOptions(Map map, int i10, i iVar) {
        this((i10 & 1) != 0 ? a.j() : map);
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }
}

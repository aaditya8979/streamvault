package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4208q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<String, S0> f33282a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.q0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    @NotNull
    public final S0 a(@NotNull String str, @NotNull List<? extends NetworkSettings> list, int i10) {
        tn.p.k(str, "adUnitId");
        tn.p.k(list, Ne.f29986y0);
        S0 s02 = this.f33282a.get(str);
        if (s02 != null) {
            return s02;
        }
        S0 s03 = new S0(list, i10);
        this.f33282a.put(str, s03);
        return s03;
    }
}

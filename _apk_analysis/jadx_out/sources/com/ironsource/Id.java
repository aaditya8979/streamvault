package com.ironsource;

import com.ironsource.S7;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Id implements S7, S7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, LevelPlayReward> f29642a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, LevelPlayReward> f29643b = new LinkedHashMap();

    private final LevelPlayReward a(String str) {
        return this.f29643b.get(str);
    }

    private final LevelPlayReward b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f29642a.get(str);
    }

    @Override // com.ironsource.S7
    @Nullable
    public LevelPlayReward a(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "adUnitId");
        LevelPlayReward levelPlayRewardB = b(str);
        return levelPlayRewardB == null ? a(str2) : levelPlayRewardB;
    }

    @Override // com.ironsource.S7.a
    public void a(@NotNull String str, @NotNull String str2, int i10) {
        tn.p.k(str, "placement");
        tn.p.k(str2, IronSourceConstants.EVENTS_REWARD_NAME);
        this.f29642a.put(str, new LevelPlayReward(str2, i10));
    }

    @Override // com.ironsource.S7.a
    public void b(@NotNull String str, @NotNull String str2, int i10) {
        tn.p.k(str, "adUnitId");
        tn.p.k(str2, IronSourceConstants.EVENTS_REWARD_NAME);
        this.f29643b.put(str, new LevelPlayReward(str2, i10));
    }
}

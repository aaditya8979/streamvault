package com.unity3d.mediation.rewarded;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class LevelPlayReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53520b;

    public LevelPlayReward(@NotNull String str, int i10) {
        p.k(str, "name");
        this.f53519a = str;
        this.f53520b = i10;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = levelPlayReward.f53519a;
        }
        if ((i11 & 2) != 0) {
            i10 = levelPlayReward.f53520b;
        }
        return levelPlayReward.copy(str, i10);
    }

    @NotNull
    public final String component1() {
        return this.f53519a;
    }

    public final int component2() {
        return this.f53520b;
    }

    @NotNull
    public final LevelPlayReward copy(@NotNull String str, int i10) {
        p.k(str, "name");
        return new LevelPlayReward(str, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return p.f(this.f53519a, levelPlayReward.f53519a) && this.f53520b == levelPlayReward.f53520b;
    }

    public final int getAmount() {
        return this.f53520b;
    }

    @NotNull
    public final String getName() {
        return this.f53519a;
    }

    public int hashCode() {
        return (this.f53519a.hashCode() * 31) + Integer.hashCode(this.f53520b);
    }

    @NotNull
    public String toString() {
        return "LevelPlayReward(name=" + this.f53519a + ", amount=" + this.f53520b + ")";
    }
}

package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: classes4.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8835b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f8834a = str;
        this.f8835b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f8835b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f8834a;
    }

    @NonNull
    public String toString() {
        return "MaxReward{amount=" + this.f8835b + ", label=" + this.f8834a + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}

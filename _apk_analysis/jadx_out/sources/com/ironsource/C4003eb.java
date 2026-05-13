package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4003eb implements ImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LevelPlayImpressionDataListener f31585a;

    public C4003eb(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        tn.p.k(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f31585a = levelPlayImpressionDataListener;
    }

    @NotNull
    public final LevelPlayImpressionDataListener a() {
        return this.f31585a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4003eb) {
            return tn.p.f(this.f31585a, ((C4003eb) obj).f31585a);
        }
        return false;
    }

    public int hashCode() {
        return this.f31585a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(@NotNull Z8 z82) {
        tn.p.k(z82, "impressionData");
        this.f31585a.onImpressionSuccess(new LevelPlayImpressionData(z82.d()));
    }
}

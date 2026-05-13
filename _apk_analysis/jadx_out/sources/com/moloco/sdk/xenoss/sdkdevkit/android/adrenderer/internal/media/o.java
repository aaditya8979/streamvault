package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f48267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48268d;

    public o(int i10, boolean z10, double d10, int i11) {
        this.f48265a = i10;
        this.f48266b = z10;
        this.f48267c = d10;
        this.f48268d = i11;
    }

    public final int a() {
        return this.f48265a;
    }

    public final int b() {
        return this.f48268d;
    }

    public final double c() {
        return this.f48267c;
    }

    public final boolean d() {
        return this.f48266b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f48265a == oVar.f48265a && this.f48266b == oVar.f48266b && Double.compare(this.f48267c, oVar.f48267c) == 0 && this.f48268d == oVar.f48268d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f48265a) * 31) + Boolean.hashCode(this.f48266b)) * 31) + Double.hashCode(this.f48267c)) * 31) + Integer.hashCode(this.f48268d);
    }

    @NotNull
    public String toString() {
        return "MediaConfig(chunkSize=" + this.f48265a + ", isStreamingEnabled=" + this.f48266b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.f48267c + ", mediaCacheDiskCleanUpLimit=" + this.f48268d + ')';
    }
}

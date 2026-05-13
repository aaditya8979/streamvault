package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50685c;

    public a(boolean z10, boolean z11, boolean z12) {
        this.f50683a = z10;
        this.f50684b = z11;
        this.f50685c = z12;
    }

    public /* synthetic */ a(boolean z10, boolean z11, boolean z12, int i10, tn.i iVar) {
        this(z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public static /* synthetic */ a a(a aVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f50683a;
        }
        if ((i10 & 2) != 0) {
            z11 = aVar.f50684b;
        }
        if ((i10 & 4) != 0) {
            z12 = aVar.f50685c;
        }
        return aVar.b(z10, z11, z12);
    }

    @NotNull
    public final a b(boolean z10, boolean z11, boolean z12) {
        return new a(z10, z11, z12);
    }

    public final boolean c() {
        return this.f50685c;
    }

    public final boolean d() {
        return this.f50683a;
    }

    public final boolean e() {
        return this.f50684b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f50683a == aVar.f50683a && this.f50684b == aVar.f50684b && this.f50685c == aVar.f50685c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f50683a) * 31) + Boolean.hashCode(this.f50684b)) * 31) + Boolean.hashCode(this.f50685c);
    }

    @NotNull
    public String toString() {
        return "PlayingState(isPlaying=" + this.f50683a + ", isVisible=" + this.f50684b + ", hasMore=" + this.f50685c + ')';
    }
}

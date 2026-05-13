package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f48627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48628b;

    public b(@NotNull a aVar, boolean z10) {
        p.k(aVar, "orientation");
        this.f48627a = aVar;
        this.f48628b = z10;
    }

    public /* synthetic */ b(a aVar, boolean z10, int i10, i iVar) {
        this(aVar, (i10 & 2) != 0 ? true : z10);
    }

    @NotNull
    public final a a() {
        return this.f48627a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f48627a == bVar.f48627a && this.f48628b == bVar.f48628b;
    }

    public int hashCode() {
        return (this.f48627a.hashCode() * 31) + Boolean.hashCode(this.f48628b);
    }

    @NotNull
    public String toString() {
        return "OrientationSettings(orientation=" + this.f48627a + ", allowOrientationChange=" + this.f48628b + ')';
    }
}

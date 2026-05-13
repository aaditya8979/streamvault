package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final v f49975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f49976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final t f49977c;

    public y(@NotNull v vVar, @NotNull String str, @Nullable t tVar) {
        tn.p.k(vVar, "event");
        tn.p.k(str, "url");
        this.f49975a = vVar;
        this.f49976b = str;
        this.f49977c = tVar;
    }

    @NotNull
    public final v a() {
        return this.f49975a;
    }

    @Nullable
    public final t b() {
        return this.f49977c;
    }

    @NotNull
    public final String c() {
        return this.f49976b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f49975a == yVar.f49975a && tn.p.f(this.f49976b, yVar.f49976b) && tn.p.f(this.f49977c, yVar.f49977c);
    }

    public int hashCode() {
        int iHashCode = ((this.f49975a.hashCode() * 31) + this.f49976b.hashCode()) * 31;
        t tVar = this.f49977c;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "Tracking(event=" + this.f49975a + ", url=" + this.f49976b + ", offset=" + this.f49977c + ')';
    }
}

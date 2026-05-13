package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f49892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f49893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f49894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final k f49895e;

    public j(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @NotNull k kVar) {
        tn.p.k(kVar, "child");
        this.f49891a = str;
        this.f49892b = num;
        this.f49893c = str2;
        this.f49894d = str3;
        this.f49895e = kVar;
    }

    @Nullable
    public final String a() {
        return this.f49894d;
    }

    @NotNull
    public final k b() {
        return this.f49895e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return tn.p.f(this.f49891a, jVar.f49891a) && tn.p.f(this.f49892b, jVar.f49892b) && tn.p.f(this.f49893c, jVar.f49893c) && tn.p.f(this.f49894d, jVar.f49894d) && tn.p.f(this.f49895e, jVar.f49895e);
    }

    public int hashCode() {
        String str = this.f49891a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f49892b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f49893c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49894d;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f49895e.hashCode();
    }

    @NotNull
    public String toString() {
        return "Creative(id=" + this.f49891a + ", sequence=" + this.f49892b + ", adId=" + this.f49893c + ", apiFramework=" + this.f49894d + ", child=" + this.f49895e + ')';
    }
}

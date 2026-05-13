package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t f50520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final File f50521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f50522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f50523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f50524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f50525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final e f50526g;

    public f(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar, @NotNull File file, @Nullable Integer num, @NotNull String str, @Nullable String str2, @NotNull h hVar, @Nullable e eVar) {
        tn.p.k(file, "localMediaResource");
        tn.p.k(str, "networkMediaResource");
        tn.p.k(hVar, "tracking");
        this.f50520a = tVar;
        this.f50521b = file;
        this.f50522c = num;
        this.f50523d = str;
        this.f50524e = str2;
        this.f50525f = hVar;
        this.f50526g = eVar;
    }

    public static /* synthetic */ f b(f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar, File file, Integer num, String str, String str2, h hVar, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tVar = fVar.f50520a;
        }
        if ((i10 & 2) != 0) {
            file = fVar.f50521b;
        }
        File file2 = file;
        if ((i10 & 4) != 0) {
            num = fVar.f50522c;
        }
        Integer num2 = num;
        if ((i10 & 8) != 0) {
            str = fVar.f50523d;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = fVar.f50524e;
        }
        String str4 = str2;
        if ((i10 & 32) != 0) {
            hVar = fVar.f50525f;
        }
        h hVar2 = hVar;
        if ((i10 & 64) != 0) {
            eVar = fVar.f50526g;
        }
        return fVar.a(tVar, file2, num2, str3, str4, hVar2, eVar);
    }

    @NotNull
    public final f a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar, @NotNull File file, @Nullable Integer num, @NotNull String str, @Nullable String str2, @NotNull h hVar, @Nullable e eVar) {
        tn.p.k(file, "localMediaResource");
        tn.p.k(str, "networkMediaResource");
        tn.p.k(hVar, "tracking");
        return new f(tVar, file, num, str, str2, hVar, eVar);
    }

    @Nullable
    public final String c() {
        return this.f50524e;
    }

    @Nullable
    public final e d() {
        return this.f50526g;
    }

    @NotNull
    public final File e() {
        return this.f50521b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return tn.p.f(this.f50520a, fVar.f50520a) && tn.p.f(this.f50521b, fVar.f50521b) && tn.p.f(this.f50522c, fVar.f50522c) && tn.p.f(this.f50523d, fVar.f50523d) && tn.p.f(this.f50524e, fVar.f50524e) && tn.p.f(this.f50525f, fVar.f50525f) && tn.p.f(this.f50526g, fVar.f50526g);
    }

    @Nullable
    public final Integer f() {
        return this.f50522c;
    }

    @NotNull
    public final String g() {
        return this.f50523d;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t h() {
        return this.f50520a;
    }

    public int hashCode() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar = this.f50520a;
        int iHashCode = (((tVar == null ? 0 : tVar.hashCode()) * 31) + this.f50521b.hashCode()) * 31;
        Integer num = this.f50522c;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f50523d.hashCode()) * 31;
        String str = this.f50524e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f50525f.hashCode()) * 31;
        e eVar = this.f50526g;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    @NotNull
    public final h i() {
        return this.f50525f;
    }

    @NotNull
    public String toString() {
        return "Linear(skipOffset=" + this.f50520a + ", localMediaResource=" + this.f50521b + ", localMediaResourceBitrate=" + this.f50522c + ", networkMediaResource=" + this.f50523d + ", clickThroughUrl=" + this.f50524e + ", tracking=" + this.f50525f + ", icon=" + this.f50526g + ')';
    }
}

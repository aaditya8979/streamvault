package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Date;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f30007f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f30008g = "0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f30009h = "0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f30010i = "0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f30011j = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final O9 f30012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private W7 f30013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f30014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private EnumC4155n0 f30015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f30016e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public O(@NotNull O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        this.f30012a = o92;
        this.f30013b = W7.UnknownProvider;
        this.f30014c = "0";
        this.f30015d = EnumC4155n0.LOAD_REQUEST;
        this.f30016e = new Date().getTime() / 1000.0d;
    }

    public static /* synthetic */ O a(O o10, O9 o92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o92 = o10.f30012a;
        }
        return o10.a(o92);
    }

    @NotNull
    public final O9 a() {
        return this.f30012a;
    }

    @NotNull
    public final O a(@NotNull O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        return new O(o92);
    }

    public final void a(double d10) {
        this.f30016e = d10;
    }

    public final void a(@NotNull W7 w72) {
        tn.p.k(w72, "<set-?>");
        this.f30013b = w72;
    }

    public final void a(@NotNull EnumC4155n0 enumC4155n0) {
        tn.p.k(enumC4155n0, "<set-?>");
        this.f30015d = enumC4155n0;
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f30014c = str;
    }

    @NotNull
    public final IronSource.a b() {
        return this.f30012a.i() ? IronSource.a.BANNER : this.f30012a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    @NotNull
    public final String c() {
        String strE = this.f30012a.e();
        tn.p.j(strE, "adInstance.id");
        return strE;
    }

    @NotNull
    public final O9 d() {
        return this.f30012a;
    }

    @NotNull
    public final W7 e() {
        return this.f30013b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return tn.p.f(c(), o10.c()) && tn.p.f(g(), o10.g()) && b() == o10.b() && tn.p.f(i(), o10.i()) && this.f30013b == o10.f30013b && tn.p.f(this.f30014c, o10.f30014c) && this.f30015d == o10.f30015d;
    }

    @NotNull
    public final EnumC4155n0 f() {
        return this.f30015d;
    }

    @NotNull
    public final String g() {
        String strC = this.f30012a.c();
        return strC == null ? "0" : strC;
    }

    @NotNull
    public final String h() {
        return this.f30014c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f30013b, this.f30014c, this.f30015d, Double.valueOf(this.f30016e));
    }

    @NotNull
    public final String i() {
        String strG = this.f30012a.g();
        tn.p.j(strG, "adInstance.name");
        return strG;
    }

    public final double j() {
        return this.f30016e;
    }

    @NotNull
    public String toString() {
        String string = IronSourceVideoBridge.jsonObjectInit().put(f.b.f33716c, c()).put("advertiserBundleId", this.f30014c).put("adProvider", this.f30013b.ordinal()).put("adStatus", this.f30015d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f30016e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        tn.p.j(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }
}

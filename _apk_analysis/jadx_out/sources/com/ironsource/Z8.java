package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Z8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f30803c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f30804d = "auctionId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f30805e = "adUnit";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f30806f = "adFormat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f30807g = "mediationAdUnitName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f30808h = "mediationAdUnitId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f30809i = "country";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f30810j = "ab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f30811k = "segmentName";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f30812l = "placement";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f30813m = "adNetwork";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f30814n = "instanceName";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f30815o = "instanceId";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f30816p = "revenue";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f30817q = "precision";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f30818r = "encryptedCPM";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f30819s = "creativeId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f30820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final DecimalFormat f30821b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public Z8(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f30820a = levelPlayAdInfo;
        this.f30821b = new DecimalFormat("#.#####");
    }

    @NotNull
    public final String a() {
        return this.f30820a.getAb();
    }

    @NotNull
    public final String b() {
        return this.f30820a.getAdFormat();
    }

    @NotNull
    public final String c() {
        return this.f30820a.getAdNetwork();
    }

    @NotNull
    public final JSONObject d() {
        return this.f30820a.impressionData$mediationsdk_release();
    }

    @NotNull
    public final String e() {
        return this.f30820a.getAuctionId();
    }

    @NotNull
    public final String f() {
        return this.f30820a.getCountry();
    }

    @NotNull
    public final String g() {
        return this.f30820a.getCreativeId();
    }

    @NotNull
    public final String h() {
        return this.f30820a.getEncryptedCPM();
    }

    @NotNull
    public final String i() {
        return this.f30820a.getInstanceId();
    }

    @NotNull
    public final String j() {
        return this.f30820a.getInstanceName();
    }

    @NotNull
    public final String k() {
        return this.f30820a.getAdUnitId();
    }

    @NotNull
    public final String l() {
        return this.f30820a.getAdUnitName();
    }

    @NotNull
    public final String m() {
        return this.f30820a.getPlacementName();
    }

    @NotNull
    public final String n() {
        return this.f30820a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.f30820a.getImpressionRevenue$mediationsdk_release();
    }

    @NotNull
    public final String p() {
        return this.f30820a.getSegmentName();
    }

    @NotNull
    public String toString() {
        String strE = e();
        String strL = l();
        String strK = k();
        String strB = b();
        String strF = f();
        String strA = a();
        String strP = p();
        String strM = m();
        String strC = c();
        String strJ = j();
        String strI = i();
        o();
        return "auctionId: '" + strE + "', mediationAdUnitName: '" + strL + "', mediationAdUnitId: '" + strK + "', adFormat: '" + strB + "', country: '" + strF + "', ab: '" + strA + "', segmentName: '" + strP + "', placement: '" + strM + "', adNetwork: '" + strC + "', instanceName: '" + strJ + "', instanceId: '" + strI + "', revenue: " + this.f30821b.format(o()) + ", precision: '" + n() + "', encryptedCPM: '" + h() + "', creativeId: '" + g() + "'";
    }
}

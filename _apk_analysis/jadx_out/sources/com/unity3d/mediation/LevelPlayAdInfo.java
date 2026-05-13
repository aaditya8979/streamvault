package com.unity3d.mediation;

import ao.r;
import bo.a0;
import com.ironsource.Bb;
import com.ironsource.C4157n2;
import com.ironsource.C4228r4;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import java.util.Iterator;
import java.util.Map;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f53476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f53477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final C4157n2 f53478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdSize f53479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f53480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f53481g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(@NotNull LevelPlayAdInfo levelPlayAdInfo, @Nullable String str) {
        this(levelPlayAdInfo.f53475a, levelPlayAdInfo.f53476b, levelPlayAdInfo.f53477c, levelPlayAdInfo.f53478d, levelPlayAdInfo.f53479e, str, levelPlayAdInfo.f53481g);
        p.k(levelPlayAdInfo, "adInfo");
    }

    public LevelPlayAdInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable C4157n2 c4157n2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str4, @NotNull Map<String, ? extends Object> map) {
        p.k(str, f.b.f33716c);
        p.k(str2, "adUnitId");
        p.k(str3, "adFormat");
        p.k(map, "adapterData");
        this.f53475a = str;
        this.f53476b = str2;
        this.f53477c = str3;
        this.f53478d = c4157n2;
        this.f53479e = levelPlayAdSize;
        this.f53480f = str4;
        this.f53481g = map;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C4157n2 c4157n2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, i iVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : c4157n2, (i10 & 16) != 0 ? null : levelPlayAdSize, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? kotlin.collections.a.j() : map);
    }

    private final /* synthetic */ <T> T a(String str) {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        T t10 = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : (T) jSONObjectM.opt(str);
        p.q(2, "T");
        return t10;
    }

    private final String a() {
        return this.f53475a;
    }

    private final String b() {
        return this.f53476b;
    }

    private final String c() {
        return this.f53477c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C4157n2 c4157n2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = levelPlayAdInfo.f53475a;
        }
        if ((i10 & 2) != 0) {
            str2 = levelPlayAdInfo.f53476b;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = levelPlayAdInfo.f53477c;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            c4157n2 = levelPlayAdInfo.f53478d;
        }
        C4157n2 c4157n22 = c4157n2;
        if ((i10 & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f53479e;
        }
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        if ((i10 & 32) != 0) {
            str4 = levelPlayAdInfo.f53480f;
        }
        String str7 = str4;
        if ((i10 & 64) != 0) {
            map = levelPlayAdInfo.f53481g;
        }
        return levelPlayAdInfo.copy(str, str5, str6, c4157n22, levelPlayAdSize2, str7, map);
    }

    private final C4157n2 d() {
        return this.f53478d;
    }

    private final LevelPlayAdSize e() {
        return this.f53479e;
    }

    private final String f() {
        return this.f53480f;
    }

    private final Map<String, Object> g() {
        return this.f53481g;
    }

    @NotNull
    public final LevelPlayAdInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable C4157n2 c4157n2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str4, @NotNull Map<String, ? extends Object> map) {
        p.k(str, f.b.f33716c);
        p.k(str2, "adUnitId");
        p.k(str3, "adFormat");
        p.k(map, "adapterData");
        return new LevelPlayAdInfo(str, str2, str3, c4157n2, levelPlayAdSize, str4, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return p.f(this.f53475a, levelPlayAdInfo.f53475a) && p.f(this.f53476b, levelPlayAdInfo.f53476b) && p.f(this.f53477c, levelPlayAdInfo.f53477c) && p.f(this.f53478d, levelPlayAdInfo.f53478d) && p.f(this.f53479e, levelPlayAdInfo.f53479e) && p.f(this.f53480f, levelPlayAdInfo.f53480f) && p.f(this.f53481g, levelPlayAdInfo.f53481g);
    }

    @NotNull
    public final String getAb() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("ab");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAdFormat() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("adFormat");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f53477c : str;
    }

    @NotNull
    public final String getAdId() {
        return this.f53475a;
    }

    @NotNull
    public final String getAdNetwork() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("adNetwork");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @Nullable
    public final LevelPlayAdSize getAdSize() {
        return this.f53479e;
    }

    @NotNull
    public final String getAdUnitId() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f53476b : str;
    }

    @NotNull
    public final String getAdUnitName() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAuctionId() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("auctionId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCountry() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("country");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCreativeId() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("creativeId");
        if (!(objOpt instanceof String)) {
            objOpt = null;
        }
        String str = (String) objOpt;
        if (str != null) {
            return str;
        }
        Object obj = this.f53481g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    @NotNull
    public final String getEncryptedCPM() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("encryptedCPM");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("precision");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Double dValueOf = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : Double.valueOf(jSONObjectM.optDouble("revenue"));
        if (p.b(dValueOf, Double.NaN) || dValueOf == null) {
            return 0.0d;
        }
        return dValueOf.doubleValue();
    }

    @NotNull
    public final String getInstanceId() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("instanceId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getInstanceName() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("instanceName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPlacementName() {
        String str = this.f53480f;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPrecision() {
        Bb bbD;
        String strC;
        C4157n2 c4157n2 = this.f53478d;
        return (c4157n2 == null || (bbD = c4157n2.d()) == null || (strC = bbD.c()) == null) ? getImpressionPrecision$mediationsdk_release() : strC;
    }

    public final double getRevenue() {
        Bb bbD;
        C4157n2 c4157n2 = this.f53478d;
        return (c4157n2 == null || (bbD = c4157n2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : bbD.d();
    }

    @NotNull
    public final String getSegmentName() {
        JSONObject jSONObjectM;
        C4157n2 c4157n2 = this.f53478d;
        Object objOpt = (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) ? null : jSONObjectM.opt("segmentName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int iHashCode = ((((this.f53475a.hashCode() * 31) + this.f53476b.hashCode()) * 31) + this.f53477c.hashCode()) * 31;
        C4157n2 c4157n2 = this.f53478d;
        int iHashCode2 = (iHashCode + (c4157n2 == null ? 0 : c4157n2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f53479e;
        int iHashCode3 = (iHashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f53480f;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f53481g.hashCode();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0033 -> B:24:0x0046). Please report as a decompilation issue!!! */
    @NotNull
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectM;
        try {
            C4157n2 c4157n2 = this.f53478d;
            if (c4157n2 == null || (jSONObjectM = c4157n2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> itKeys = jSONObjectM.keys();
                p.j(itKeys, "it.keys()");
                jSONObject = new JSONObject(jSONObjectM, (String[]) SequencesKt___SequencesKt.U(r.g(itKeys)).toArray(new String[0]));
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e10);
            C4228r4.d().a(e10);
            jSONObject = new JSONObject();
        }
        try {
            String strOptString = jSONObject.optString("placement");
            p.j(strOptString, "placement");
            if (strOptString.length() > 0 && (str = this.f53480f) != null) {
                jSONObject.put("placement", a0.S(strOptString, d.f32403r, str, false, 4, null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e11) {
            IronLog.INTERNAL.error("failed to put impression values", e11);
            C4228r4.d().a(e11);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f53479e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }
}

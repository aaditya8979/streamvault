package com.inmobi.media;

import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3621o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC3547l1 f27721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f27722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f27723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f27724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WatermarkData f27725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdQualityControl f27726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte f27727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f27728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f27729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f27730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3440gi f27731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C3605n9 f27732t;

    public C3621o0(String str, boolean z10, long j10, boolean z11, String str2, String str3, String str4, String str5, AbstractC3547l1 abstractC3547l1, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b10, LinkedHashSet linkedHashSet, String str7, String str8, C3440gi c3440gi, C3605n9 c3605n9) {
        tn.p.k(str8, "landingScheme");
        this.f27713a = str;
        this.f27714b = z10;
        this.f27715c = j10;
        this.f27716d = z11;
        this.f27717e = str2;
        this.f27718f = str3;
        this.f27719g = str4;
        this.f27720h = str5;
        this.f27721i = abstractC3547l1;
        this.f27722j = str6;
        this.f27723k = linkedHashMap;
        this.f27724l = bool;
        this.f27725m = watermarkData;
        this.f27726n = adQualityControl;
        this.f27727o = b10;
        this.f27728p = linkedHashSet;
        this.f27729q = str7;
        this.f27730r = str8;
        this.f27731s = c3440gi;
        this.f27732t = c3605n9;
    }

    public static C3621o0 a(C3621o0 c3621o0, C3440gi c3440gi, int i10) {
        String str = c3621o0.f27713a;
        boolean z10 = c3621o0.f27714b;
        long j10 = c3621o0.f27715c;
        boolean z11 = c3621o0.f27716d;
        String str2 = c3621o0.f27717e;
        String str3 = c3621o0.f27718f;
        String str4 = c3621o0.f27719g;
        String str5 = c3621o0.f27720h;
        String str6 = c3621o0.f27722j;
        LinkedHashMap linkedHashMap = c3621o0.f27723k;
        Boolean bool = c3621o0.f27724l;
        WatermarkData watermarkData = (i10 & 4096) != 0 ? c3621o0.f27725m : null;
        AdQualityControl adQualityControl = c3621o0.f27726n;
        byte b10 = c3621o0.f27727o;
        LinkedHashSet linkedHashSet = c3621o0.f27728p;
        String str7 = c3621o0.f27729q;
        String str8 = c3621o0.f27730r;
        C3440gi c3440gi2 = (i10 & 524288) != 0 ? c3621o0.f27731s : c3440gi;
        C3605n9 c3605n9 = c3621o0.f27732t;
        tn.p.k(str8, "landingScheme");
        return new C3621o0(str, z10, j10, z11, str2, str3, str4, str5, null, str6, linkedHashMap, bool, watermarkData, adQualityControl, b10, linkedHashSet, str7, str8, c3440gi2, c3605n9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3621o0)) {
            return false;
        }
        C3621o0 c3621o0 = (C3621o0) obj;
        return tn.p.f(this.f27713a, c3621o0.f27713a) && this.f27714b == c3621o0.f27714b && this.f27715c == c3621o0.f27715c && this.f27716d == c3621o0.f27716d && tn.p.f(this.f27717e, c3621o0.f27717e) && tn.p.f(this.f27718f, c3621o0.f27718f) && tn.p.f(this.f27719g, c3621o0.f27719g) && tn.p.f(this.f27720h, c3621o0.f27720h) && tn.p.f(this.f27721i, c3621o0.f27721i) && tn.p.f(this.f27722j, c3621o0.f27722j) && tn.p.f(this.f27723k, c3621o0.f27723k) && tn.p.f(this.f27724l, c3621o0.f27724l) && tn.p.f(this.f27725m, c3621o0.f27725m) && tn.p.f(this.f27726n, c3621o0.f27726n) && this.f27727o == c3621o0.f27727o && tn.p.f(this.f27728p, c3621o0.f27728p) && tn.p.f(this.f27729q, c3621o0.f27729q) && tn.p.f(this.f27730r, c3621o0.f27730r) && tn.p.f(this.f27731s, c3621o0.f27731s) && tn.p.f(this.f27732t, c3621o0.f27732t);
    }

    public final int hashCode() {
        String str = this.f27713a;
        int iHashCode = (Boolean.hashCode(this.f27716d) + ((Long.hashCode(this.f27715c) + ((Boolean.hashCode(this.f27714b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f27717e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27718f;
        int iHashCode3 = (this.f27719g.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f27720h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC3547l1 abstractC3547l1 = this.f27721i;
        int iHashCode5 = (iHashCode4 + (abstractC3547l1 == null ? 0 : abstractC3547l1.hashCode())) * 31;
        String str5 = this.f27722j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.f27723k;
        int iHashCode7 = (this.f27724l.hashCode() + ((iHashCode6 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        WatermarkData watermarkData = this.f27725m;
        int iHashCode8 = (iHashCode7 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.f27726n;
        int iHashCode9 = (this.f27728p.hashCode() + ((Byte.hashCode(this.f27727o) + ((iHashCode8 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.f27729q;
        int iHashCode10 = (this.f27730r.hashCode() + ((Boolean.hashCode(false) + ((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        C3440gi c3440gi = this.f27731s;
        int iHashCode11 = (iHashCode10 + (c3440gi == null ? 0 : c3440gi.hashCode())) * 31;
        C3605n9 c3605n9 = this.f27732t;
        return Long.hashCode(-1L) + ((iHashCode11 + (c3605n9 != null ? c3605n9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f27713a;
        boolean z10 = this.f27714b;
        long j10 = this.f27715c;
        boolean z11 = this.f27716d;
        String str2 = this.f27717e;
        String str3 = this.f27718f;
        String str4 = this.f27719g;
        String str5 = this.f27720h;
        AbstractC3547l1 abstractC3547l1 = this.f27721i;
        String str6 = this.f27722j;
        LinkedHashMap linkedHashMap = this.f27723k;
        Boolean bool = this.f27724l;
        WatermarkData watermarkData = this.f27725m;
        AdQualityControl adQualityControl = this.f27726n;
        byte b10 = this.f27727o;
        return "AdMetaData(adType=" + str + ", isImmersiveMode=" + z10 + ", placementId=" + j10 + ", allowAutoRedirection=" + z11 + ", creativeId=" + str2 + ", creativeType=" + str3 + ", markupTypeAdUnit=" + str4 + ", adSize=" + str5 + ", adPodHandler=" + abstractC3547l1 + ", contentURL=" + str6 + ", telemetryManagerMap=" + linkedHashMap + ", isHardwareAccelerationDisabled=" + bool + ", watermarkData=" + watermarkData + ", adQualityControl=" + adQualityControl + ", placementType=" + ((int) b10) + ", viewabilityTrackers=" + this.f27728p + ", impressionId=" + this.f27729q + ", isInAppBrowser=false, landingScheme=" + this.f27730r + ", renderViewMetaData=" + this.f27731s + ", logger=" + this.f27732t + ", viewTouchTimestamp=-1)";
    }
}

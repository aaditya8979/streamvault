package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3307be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InMobiNativeImage f26859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f26861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f26863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaView f26865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f26866j;

    public C3307be(String str, String str2, InMobiNativeImage inMobiNativeImage, String str3, JSONObject jSONObject, String str4, Float f10, boolean z10, MediaView mediaView, View view) {
        tn.p.k(inMobiNativeImage, "iconImage");
        tn.p.k(jSONObject, "extras");
        this.f26857a = str;
        this.f26858b = str2;
        this.f26859c = inMobiNativeImage;
        this.f26860d = str3;
        this.f26861e = jSONObject;
        this.f26862f = str4;
        this.f26863g = f10;
        this.f26864h = z10;
        this.f26865i = mediaView;
        this.f26866j = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3307be)) {
            return false;
        }
        C3307be c3307be = (C3307be) obj;
        return tn.p.f(this.f26857a, c3307be.f26857a) && tn.p.f(this.f26858b, c3307be.f26858b) && tn.p.f(this.f26859c, c3307be.f26859c) && tn.p.f(this.f26860d, c3307be.f26860d) && tn.p.f(this.f26861e, c3307be.f26861e) && tn.p.f(this.f26862f, c3307be.f26862f) && tn.p.f(this.f26863g, c3307be.f26863g) && this.f26864h == c3307be.f26864h && tn.p.f(this.f26865i, c3307be.f26865i) && tn.p.f(this.f26866j, c3307be.f26866j);
    }

    public final int hashCode() {
        String str = this.f26857a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26858b;
        int iHashCode2 = (this.f26859c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f26860d;
        int iHashCode3 = (this.f26861e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f26862f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.f26863g;
        int iHashCode5 = (Boolean.hashCode(this.f26864h) + ((iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31)) * 31;
        MediaView mediaView = this.f26865i;
        int iHashCode6 = (iHashCode5 + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f26866j;
        return iHashCode6 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "NativePubData(title=" + this.f26857a + ", description=" + this.f26858b + ", iconImage=" + this.f26859c + ", ctaText=" + this.f26860d + ", extras=" + this.f26861e + ", sponsored=" + this.f26862f + ", adRating=" + this.f26863g + ", isVideo=" + this.f26864h + ", mediaView=" + this.f26865i + ", adChoiceIcon=" + this.f26866j + ")";
    }
}

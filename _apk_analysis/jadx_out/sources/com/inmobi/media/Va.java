package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: loaded from: classes9.dex */
public final class Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InlineParams f26494e;

    public /* synthetic */ Va(boolean z10, String str, boolean z11, int i10) {
        this(z10, (i10 & 2) != 0 ? "DEFAULT" : str, z11, false, null);
    }

    public Va(boolean z10, String str, boolean z11, boolean z12, InlineParams inlineParams) {
        tn.p.k(str, "landingScheme");
        this.f26490a = z10;
        this.f26491b = str;
        this.f26492c = z11;
        this.f26493d = z12;
        this.f26494e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Va)) {
            return false;
        }
        Va va2 = (Va) obj;
        return this.f26490a == va2.f26490a && tn.p.f(this.f26491b, va2.f26491b) && this.f26492c == va2.f26492c && this.f26493d == va2.f26493d && tn.p.f(this.f26494e, va2.f26494e);
    }

    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f26493d) + ((Boolean.hashCode(this.f26492c) + ((this.f26491b.hashCode() + (Boolean.hashCode(this.f26490a) * 31)) * 31)) * 31)) * 31;
        InlineParams inlineParams = this.f26494e;
        return iHashCode + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f26490a + ", landingScheme=" + this.f26491b + ", isCCTEnabled=" + this.f26492c + ", isPartialTabsEnabled=" + this.f26493d + ", inlineParams=" + this.f26494e + ")";
    }
}

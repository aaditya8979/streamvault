package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: loaded from: classes9.dex */
public final class Sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiNativeViewData f26319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f26320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f26321c;

    public Sg(InMobiNativeViewData inMobiNativeViewData, MediaView mediaView, View view) {
        tn.p.k(inMobiNativeViewData, "pubView");
        this.f26319a = inMobiNativeViewData;
        this.f26320b = mediaView;
        this.f26321c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sg)) {
            return false;
        }
        Sg sg2 = (Sg) obj;
        return tn.p.f(this.f26319a, sg2.f26319a) && tn.p.f(this.f26320b, sg2.f26320b) && tn.p.f(this.f26321c, sg2.f26321c);
    }

    public final int hashCode() {
        int iHashCode = this.f26319a.hashCode() * 31;
        MediaView mediaView = this.f26320b;
        int iHashCode2 = (iHashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f26321c;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.f26319a + ", mediaView=" + this.f26320b + ", adChoice=" + this.f26321c + ")";
    }
}

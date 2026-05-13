package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: loaded from: classes7.dex */
public final class A6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaView f25141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3542kl f25142b;

    public A6(MediaView mediaView, C3542kl c3542kl) {
        tn.p.k(mediaView, "mediaView");
        this.f25141a = mediaView;
        this.f25142b = c3542kl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A6)) {
            return false;
        }
        A6 a62 = (A6) obj;
        return tn.p.f(this.f25141a, a62.f25141a) && tn.p.f(this.f25142b, a62.f25142b);
    }

    public final int hashCode() {
        int iHashCode = this.f25141a.hashCode() * 31;
        C3542kl c3542kl = this.f25142b;
        return iHashCode + (c3542kl == null ? 0 : c3542kl.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.f25141a + ", vastBeaconData=" + this.f25142b + ")";
    }
}

package com.yandex.mobile.ads.nativeads;

import tn.p;
import yads.et3;
import yads.j02;
import yads.jt3;
import yads.kr3;
import yads.rt3;
import yads.tm;
import yads.w02;
import yads.y02;

/* JADX INFO: loaded from: classes12.dex */
public class d implements NativeAd, y02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f59218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f59219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rt3 f59220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tm f59221d;

    public /* synthetic */ d(w02 w02Var) {
        this(w02Var, new f(), new rt3(), new tm());
    }

    public d(w02 w02Var, f fVar, rt3 rt3Var, tm tmVar) {
        this.f59218a = w02Var;
        this.f59219b = fVar;
        this.f59220c = rt3Var;
        this.f59221d = tmVar;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        try {
            this.f59219b.getClass();
            this.f59218a.a(f.a(nativeAdViewBinder));
        } catch (j02 e10) {
            throw new NativeAdException(e10.f91067b, e10);
        } catch (Throwable th2) {
            throw new NativeAdException("Ad binding failed with unexpected exception", th2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && p.f(((d) obj).f59218a, this.f59218a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new et3(this.f59218a.getAdAssets());
    }

    public int hashCode() {
        return this.f59218a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.f59218a.a(nativeAdEventListener instanceof ClosableNativeAdEventListener ? new kr3((ClosableNativeAdEventListener) nativeAdEventListener) : nativeAdEventListener != null ? new jt3(nativeAdEventListener) : null);
    }
}

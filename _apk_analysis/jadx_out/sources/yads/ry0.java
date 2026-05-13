package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes6.dex */
public final class ry0 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0 f94646a;

    public ry0(zf0 zf0Var) {
        this.f94646a = zf0Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f94646a.a((ExtendedNativeAdView) viewGroup);
    }

    @Override // yads.zf0
    public final void c() {
        this.f94646a.c();
    }
}

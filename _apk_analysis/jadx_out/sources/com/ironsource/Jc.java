package com.ironsource;

import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Jc implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private A2 f29686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private WeakReference<C2> f29687b = new WeakReference<>(null);

    public final void a(@NotNull A2 a22) {
        tn.p.k(a22, "loadListener");
        this.f29686a = a22;
    }

    public final void a(@NotNull C2 c22) {
        tn.p.k(c22, "showListener");
        this.f29687b = new WeakReference<>(c22);
    }

    @Override // com.ironsource.Ic
    public void onBannerClick() {
        C2 c22 = this.f29687b.get();
        if (c22 != null) {
            c22.onBannerClick();
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.Ic
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadFail(@NotNull String str) {
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        A2 a22 = this.f29686a;
        if (a22 != null) {
            a22.onBannerLoadFail(str);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadSuccess(@NotNull O9 o92, @NotNull C4107k8 c4107k8) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(c4107k8, "adContainer");
        A2 a22 = this.f29686a;
        if (a22 != null) {
            a22.onBannerLoadSuccess(o92, c4107k8);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerShowSuccess() {
        C2 c22 = this.f29687b.get();
        if (c22 != null) {
            c22.onBannerShowSuccess();
        }
    }
}

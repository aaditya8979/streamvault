package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements AdShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AdShowListener f46645a;

    public f0(@Nullable AdShowListener adShowListener) {
        this.f46645a = adShowListener;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        AdShowListener adShowListener = this.f46645a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        AdShowListener adShowListener = this.f46645a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
        tn.p.k(molocoAdError, "molocoAdError");
        AdShowListener adShowListener = this.f46645a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        tn.p.k(molocoAd, "molocoAd");
        AdShowListener adShowListener = this.f46645a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }
}

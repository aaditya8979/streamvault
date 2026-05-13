package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements InterstitialAd, p0, FullscreenAd<InterstitialAdShowListener> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u<InterstitialAdShowListener> f46644b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull u<? super InterstitialAdShowListener> uVar) {
        tn.p.k(uVar, "fullscreenAd");
        this.f46644b = uVar;
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void show(@Nullable InterstitialAdShowListener interstitialAdShowListener) {
        this.f46644b.show(h.c(interstitialAdShowListener));
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f46644b.destroy();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46644b.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String str, @Nullable AdLoad.Listener listener) {
        tn.p.k(str, "bidResponseJson");
        this.f46644b.load(str, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.p0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46644b.setCreateAdObjectStartTime(j10);
    }
}

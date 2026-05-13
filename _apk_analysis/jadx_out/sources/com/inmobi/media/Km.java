package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes9.dex */
public final class Km implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f25823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lm f25824b;

    public Km(ExoPlayer exoPlayer, Lm lm2) {
        this.f25823a = exoPlayer;
        this.f25824b = lm2;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        this.f25823a.removeListener(this.f25824b);
        this.f25823a.stop();
        this.f25823a.clearMediaItems();
        return bn.r.f5635a;
    }
}

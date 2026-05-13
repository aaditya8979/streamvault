package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public final class Hm implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f25623a;

    public Hm(MediaPlayer mediaPlayer) {
        this.f25623a = mediaPlayer;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        this.f25623a.release();
        return bn.r.f5635a;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f17263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17264b;

    public j(r rVar, AudioTrack audioTrack) {
        this.f17264b = rVar;
        this.f17263a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f17263a.flush();
            this.f17263a.release();
        } finally {
            this.f17264b.f17288e.open();
        }
    }
}

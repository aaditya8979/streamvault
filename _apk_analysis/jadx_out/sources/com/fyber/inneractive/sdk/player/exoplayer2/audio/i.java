package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f17262b;

    public i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10) {
        this.f17262b = eventDispatcher;
        this.f17261a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17262b.listener.onAudioSessionId(this.f17261a);
    }
}

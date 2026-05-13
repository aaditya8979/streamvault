package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f18898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f18899e;

    public m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, int i11, int i12, float f10) {
        this.f18899e = eventDispatcher;
        this.f18895a = i10;
        this.f18896b = i11;
        this.f18897c = i12;
        this.f18898d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18899e.listener.onVideoSizeChanged(this.f18895a, this.f18896b, this.f18897c, this.f18898d);
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f18507c;

    public e(f fVar, int i10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, Object obj, long j10) {
        this.f18507c = fVar;
        this.f18505a = obj;
        this.f18506b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f18507c.f18509b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f18506b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18301b;

    public c(int i10, long j10) {
        this.f18300a = i10;
        this.f18301b = j10;
    }

    public static c a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, n nVar) {
        bVar.a(nVar.f18794a, 0, 8, false);
        nVar.e(0);
        return new c(nVar.b(), nVar.e());
    }
}

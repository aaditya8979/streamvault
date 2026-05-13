package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f18493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f18498h;

    public a(int i10, int i11, long j10, long j11, o oVar, h hVar, k kVar, Object obj) {
        hVar.getClass();
        this.f18498h = hVar;
        this.f18491a = kVar;
        this.f18492b = i10;
        this.f18493c = oVar;
        this.f18494d = i11;
        this.f18495e = obj;
        this.f18496f = j10;
        this.f18497g = j11;
    }

    public abstract long c();
}

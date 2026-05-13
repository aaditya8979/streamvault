package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f18675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f18676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f18677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f18678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f18679f;

    public d0(h hVar, Uri uri, c0 c0Var) {
        this.f18675b = hVar;
        this.f18674a = new k(uri, 0L, 0L, -1L, null, 1);
        this.f18676c = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f18678e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f18678e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        j jVar = new j(this.f18675b, this.f18674a);
        try {
            jVar.f18690a.a(jVar.f18691b);
            jVar.f18693d = true;
            this.f18677d = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g) this.f18676c).a(this.f18675b.a(), jVar);
        } finally {
            this.f18679f = jVar.f18695f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jVar);
        }
    }
}

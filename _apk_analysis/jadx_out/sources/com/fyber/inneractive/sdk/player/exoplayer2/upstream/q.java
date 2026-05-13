package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f18739c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f18737a = new w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18740d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18741e = 2000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18742f = true;

    public q(String str, m mVar) {
        this.f18738b = str;
        this.f18739c = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new p(this.f18738b, this.f18739c, this.f18740d, this.f18741e, this.f18742f, this.f18737a);
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f18719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f18720c;

    public o(Context context, m mVar, q qVar) {
        this.f18718a = context.getApplicationContext();
        this.f18719b = mVar;
        this.f18720c = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.f18718a, this.f18719b, this.f18720c.a());
    }
}

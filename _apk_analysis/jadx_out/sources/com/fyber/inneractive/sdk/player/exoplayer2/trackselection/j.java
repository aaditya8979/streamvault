package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f18597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f18598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t[] f18600d;

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.f18597a = zVar;
        this.f18598b = hVar;
        this.f18599c = fVar;
        this.f18600d = tVarArr;
    }

    public final boolean a(j jVar, int i10) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f18598b.f18595b[i10], jVar.f18598b.f18595b[i10]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f18600d[i10], jVar.f18600d[i10]);
    }
}

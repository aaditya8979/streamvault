package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f18646c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18647d;

    public h(int i10, String str, long j10) {
        this.f18644a = i10;
        this.f18645b = str;
        this.f18647d = j10;
    }

    public final m a(long j10) {
        m mVar = new m(this.f18645b, j10, -1L, -9223372036854775807L, null);
        m mVar2 = (m) this.f18646c.floor(mVar);
        if (mVar2 != null && mVar2.f18639b + mVar2.f18640c > j10) {
            return mVar2;
        }
        m mVar3 = (m) this.f18646c.ceiling(mVar);
        return mVar3 == null ? new m(this.f18645b, j10, -1L, -9223372036854775807L, null) : new m(this.f18645b, j10, mVar3.f18639b - j10, -9223372036854775807L, null);
    }
}

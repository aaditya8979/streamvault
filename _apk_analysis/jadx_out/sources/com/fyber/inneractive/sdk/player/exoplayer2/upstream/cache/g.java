package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f18642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18643f;

    public g(String str, long j10, long j11, long j12, File file) {
        this.f18638a = str;
        this.f18639b = j10;
        this.f18640c = j11;
        this.f18641d = file != null;
        this.f18642e = file;
        this.f18643f = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.f18638a.equals(gVar.f18638a)) {
            return this.f18638a.compareTo(gVar.f18638a);
        }
        long j10 = this.f18639b - gVar.f18639b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }
}

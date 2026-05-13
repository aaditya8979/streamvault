package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f17598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f17599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f17600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f17601o;

    public d(int i10, String str, long j10, long j11, boolean z10, int i11, int i12, int i13, long j12, boolean z11, boolean z12, c cVar, List list, List list2) {
        super(str);
        this.f17588b = i10;
        this.f17590d = j11;
        this.f17591e = z10;
        this.f17592f = i11;
        this.f17593g = i12;
        this.f17594h = i13;
        this.f17595i = j12;
        this.f17596j = z11;
        this.f17597k = z12;
        this.f17598l = cVar;
        this.f17599m = Collections.unmodifiableList(list);
        if (list.isEmpty()) {
            this.f17601o = 0L;
        } else {
            c cVar2 = (c) list.get(list.size() - 1);
            this.f17601o = cVar2.f17582d + cVar2.f17580b;
        }
        this.f17589c = j10 == -9223372036854775807L ? -9223372036854775807L : j10 >= 0 ? j10 : this.f17601o + j10;
        this.f17600n = Collections.unmodifiableList(list2);
    }
}

package com.inmobi.media;

import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f26281h;

    public S2(int i10, String str, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        tn.p.k(str, "url");
        this.f26274a = i10;
        this.f26275b = str;
        this.f26276c = map;
        this.f26277d = z10;
        this.f26278e = z11;
        this.f26279f = i11;
        this.f26280g = j10;
        this.f26281h = j11;
    }

    public /* synthetic */ S2(String str, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}

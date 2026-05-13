package com.inmobi.media;

import com.ironsource.Y5;

/* JADX INFO: renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3682qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27962f;

    public C3682qb(String str, long j10, int i10, long j11, boolean z10, int i11) {
        tn.p.k(str, Y5.c.f30724b);
        this.f27957a = str;
        this.f27958b = j10;
        this.f27959c = i10;
        this.f27960d = j11;
        this.f27961e = z10;
        this.f27962f = i11;
    }

    public /* synthetic */ C3682qb(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}

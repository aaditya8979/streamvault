package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17587i;

    public c(String str, long j10, int i10, long j11, boolean z10, String str2, String str3, long j12, long j13) {
        this.f17579a = str;
        this.f17580b = j10;
        this.f17581c = i10;
        this.f17582d = j11;
        this.f17583e = z10;
        this.f17584f = str2;
        this.f17585g = str3;
        this.f17586h = j12;
        this.f17587i = j13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        if (this.f17582d > l10.longValue()) {
            return 1;
        }
        return this.f17582d < l10.longValue() ? -1 : 0;
    }
}

package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3325c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f26919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26920k;

    public C3325c6(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f26910a = i10;
        this.f26911b = j10;
        this.f26912c = j11;
        this.f26913d = j12;
        this.f26914e = i11;
        this.f26915f = i12;
        this.f26916g = i13;
        this.f26917h = i14;
        this.f26918i = j13;
        this.f26919j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3325c6)) {
            return false;
        }
        C3325c6 c3325c6 = (C3325c6) obj;
        return this.f26910a == c3325c6.f26910a && this.f26911b == c3325c6.f26911b && this.f26912c == c3325c6.f26912c && this.f26913d == c3325c6.f26913d && this.f26914e == c3325c6.f26914e && this.f26915f == c3325c6.f26915f && this.f26916g == c3325c6.f26916g && this.f26917h == c3325c6.f26917h && this.f26918i == c3325c6.f26918i && this.f26919j == c3325c6.f26919j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26919j) + ((Long.hashCode(this.f26918i) + AbstractC3414fi.a(this.f26917h, AbstractC3414fi.a(this.f26916g, AbstractC3414fi.a(this.f26915f, AbstractC3414fi.a(this.f26914e, (Long.hashCode(this.f26913d) + ((Long.hashCode(this.f26912c) + ((Long.hashCode(this.f26911b) + (Integer.hashCode(this.f26910a) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f26910a + ", timeToLiveInSec=" + this.f26911b + ", processingInterval=" + this.f26912c + ", ingestionLatencyInSec=" + this.f26913d + ", minBatchSizeWifi=" + this.f26914e + ", maxBatchSizeWifi=" + this.f26915f + ", minBatchSizeMobile=" + this.f26916g + ", maxBatchSizeMobile=" + this.f26917h + ", retryIntervalWifi=" + this.f26918i + ", retryIntervalMobile=" + this.f26919j + ")";
    }
}

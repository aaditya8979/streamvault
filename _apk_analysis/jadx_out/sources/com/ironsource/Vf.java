package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public class Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f30604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30606c;

    public long a() {
        return Math.max(0L, this.f30604a - System.currentTimeMillis());
    }

    public void a(long j10) {
        this.f30604a = System.currentTimeMillis() + j10;
    }

    public void b() {
        this.f30604a = 0L;
        this.f30605b = 0L;
        this.f30606c = 0L;
    }

    public void b(long j10) {
        this.f30606c = j10;
        this.f30604a += j10 - this.f30605b;
    }

    public void c(long j10) {
        this.f30605b = j10;
        this.f30606c = 0L;
    }
}

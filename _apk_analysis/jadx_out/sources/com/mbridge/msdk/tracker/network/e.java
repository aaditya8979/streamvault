package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: DefaultRetryPolicy.java */
/* JADX INFO: loaded from: classes8.dex */
public class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40975d;

    public e() {
        this(2500, 1);
    }

    public e(int i10, int i11) {
        this(i10, 60000L, i11);
    }

    public e(int i10, long j10, int i11) {
        this.f40973b = j10;
        this.f40972a = i10;
        this.f40975d = i11;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f40973b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f40974c + 1;
        this.f40974c = i10;
        return i10 <= this.f40975d;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f40972a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f40974c;
    }
}

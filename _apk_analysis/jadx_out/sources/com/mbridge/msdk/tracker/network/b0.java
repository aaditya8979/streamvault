package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: VolleyError.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f40966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f40969d;

    public b0() {
        this.f40968c = 0;
        this.f40969d = "";
        this.f40966a = null;
    }

    public b0(q qVar) {
        this.f40968c = 0;
        this.f40969d = "";
        this.f40966a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f40968c = 0;
        this.f40969d = "";
        this.f40966a = null;
    }

    public b0(Throwable th2) {
        super(th2);
        this.f40968c = 0;
        this.f40969d = "";
        this.f40966a = null;
    }

    public void a(int i10) {
        this.f40968c = i10;
    }

    public void a(long j10) {
        this.f40967b = j10;
    }

    public abstract int d();

    public int g() {
        return this.f40968c;
    }
}

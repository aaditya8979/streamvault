package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: MBridgeVolleyManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f40988b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f40989a;

    private l() {
    }

    public static l a() {
        if (f40988b == null) {
            synchronized (l.class) {
                if (f40988b == null) {
                    f40988b = new l();
                }
            }
        }
        return f40988b;
    }

    public u b() {
        if (this.f40989a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f40989a = uVarA;
            uVarA.b();
        }
        return this.f40989a;
    }
}

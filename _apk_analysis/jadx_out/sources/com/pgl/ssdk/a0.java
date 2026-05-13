package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;

/* JADX INFO: loaded from: classes9.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3<a1> f51280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a4 f51281b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a0 f51282a = new a0();
    }

    private a0() {
        this.f51280a = a3.a(2);
    }

    public static a0 a() {
        return b.f51282a;
    }

    private a1 a(a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a1(handlerThread, aVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public a4 a(String str) {
        return b(null, str);
    }

    public a4 b() {
        if (this.f51281b == null) {
            synchronized (a0.class) {
                if (this.f51281b == null) {
                    this.f51281b = a("ssdk_net_handler");
                }
            }
        }
        return this.f51281b;
    }

    public a4 b(a4.a aVar, String str) {
        a1 a1Var = (a1) this.f51280a.a();
        if (a1Var == null) {
            return a(aVar, str);
        }
        a1Var.a(aVar);
        a1Var.a(str);
        return a1Var;
    }

    public a4 c() {
        if (this.f51281b == null) {
            synchronized (a0.class) {
                if (this.f51281b == null) {
                    this.f51281b = a("ssdk_handler");
                }
            }
        }
        return this.f51281b;
    }
}

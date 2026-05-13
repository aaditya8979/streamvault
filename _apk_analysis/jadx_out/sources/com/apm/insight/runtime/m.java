package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: NpthHandlerThread.java */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile p f7541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f7542b;

    public static p a() {
        if (f7541a == null) {
            b();
        }
        return f7541a;
    }

    private static HandlerThread b() {
        if (f7541a == null) {
            synchronized (m.class) {
                if (f7541a == null) {
                    p pVar = new p("default_npth_thread");
                    f7541a = pVar;
                    pVar.b();
                }
            }
        }
        return f7541a.c();
    }
}

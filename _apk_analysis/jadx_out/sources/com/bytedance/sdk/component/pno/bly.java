package com.bytedance.sdk.component.pno;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class bly implements ThreadFactory {
    public static volatile boolean yu;
    private final AtomicInteger fkw = new AtomicInteger(1);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12751lh;
    public final ThreadGroup ouw;
    public final String vt;

    public bly(int i10, String str) {
        this.f12751lh = i10;
        this.ouw = new ThreadGroup("csj_g_".concat(String.valueOf(str)));
        this.vt = "csj_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (yu) {
            return null;
        }
        Thread thread = new Thread(this.ouw, runnable, this.vt + this.fkw.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i10 = this.f12751lh;
        if (i10 > 10 || i10 <= 0) {
            this.f12751lh = 5;
        }
        thread.setPriority(this.f12751lh);
        return thread;
    }
}

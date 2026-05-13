package com.ironsource;

import java.lang.Thread;

/* JADX INFO: renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4195p4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f33209a;

    public C4195p4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f33209a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C4212q4 c4212q4 = new C4212q4(th2);
        if (c4212q4.d()) {
            new P5(c4212q4.b(), "" + System.currentTimeMillis(), Z7.f30785i).a();
        }
        this.f33209a.uncaughtException(thread, th2);
    }
}

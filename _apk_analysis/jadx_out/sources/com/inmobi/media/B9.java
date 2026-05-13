package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class B9 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25206b;

    public B9(String str, boolean z10) {
        tn.p.k(str, "name");
        this.f25205a = z10;
        this.f25206b = "TIM-" + str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        tn.p.k(runnable, "r");
        try {
            Thread thread = new Thread(runnable, this.f25206b);
            thread.setDaemon(this.f25205a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }
}

package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: IOSerialExecutor.java */
/* JADX INFO: loaded from: classes11.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f11555a;

    public static c a() {
        if (f11555a == null) {
            synchronized (c.class) {
                if (f11555a == null) {
                    f11555a = new c();
                }
            }
        }
        return f11555a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}

package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p000do.l0 f26292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Semaphore f26293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f26294c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("LogSingle", true));
        tn.p.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f26292a = kotlinx.coroutines.d.a(p000do.l1.c(executorServiceNewSingleThreadExecutor));
        f26293b = new Semaphore(1);
        f26294c = new AtomicBoolean(false);
    }
}

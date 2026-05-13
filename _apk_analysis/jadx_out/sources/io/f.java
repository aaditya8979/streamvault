package io;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Collection<p000do.i0> f71036a = SequencesKt___SequencesKt.U(ao.r.g(ServiceLoader.load(p000do.i0.class, p000do.i0.class.getClassLoader()).iterator()));

    @NotNull
    public static final Collection<p000do.i0> a() {
        return f71036a;
    }

    public static final void b(@NotNull Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}

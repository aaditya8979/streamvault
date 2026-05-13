package io.reactivex.disposables;

import bm.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;

/* JADX INFO: compiled from: Disposables.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static b a() {
        return EmptyDisposable.INSTANCE;
    }

    public static b b() {
        return c(Functions.f71325b);
    }

    public static b c(Runnable runnable) {
        fm.a.e(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }
}

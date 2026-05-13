package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: UiThreadHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class UiThreadHandler {

    @NotNull
    public static final UiThreadHandler INSTANCE = new UiThreadHandler();

    @NotNull
    private static final Handler INSTANCE$1 = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    @NotNull
    public static final Handler get() {
        return INSTANCE$1;
    }

    public static final boolean isMainThread() {
        return p.f(Thread.currentThread(), mainThread());
    }

    @NotNull
    public static final Thread mainThread() {
        return Looper.getMainLooper().getThread();
    }

    public final boolean postOnMainThread(@NotNull final a<r> aVar) {
        return INSTANCE$1.post(new Runnable() { // from class: tg.a
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        });
    }
}

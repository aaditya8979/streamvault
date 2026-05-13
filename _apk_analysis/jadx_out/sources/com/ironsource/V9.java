package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class V9 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Handler f30601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9(@NotNull String str) {
        super(str);
        tn.p.k(str, "name");
    }

    public static /* synthetic */ void a(V9 v92, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v92.a(runnable, j10);
    }

    public final void a() {
        this.f30601a = new Handler(getLooper());
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "task");
        a(this, runnable, 0L, 2, null);
    }

    public final void a(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "task");
        Handler handler = this.f30601a;
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }

    public final void b(@NotNull Runnable runnable) {
        tn.p.k(runnable, "task");
        Handler handler = this.f30601a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }
}

package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
final class F5 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Handler f29298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F5(@NotNull String str) {
        super(str);
        tn.p.k(str, "name");
    }

    public final void a() {
        this.f29298a = new Handler(getLooper());
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "task");
        Handler handler = this.f29298a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}

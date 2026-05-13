package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class V7 implements Tf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f30595c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final V9 f30597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final V9 f30598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final V9 f30599g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final V7 f30593a = new V7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Handler f30594b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final bn.g f30596d = kotlin.b.b(a.f30600a);

    public static final class a extends Lambda implements sn.a<C4095je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30600a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4095je invoke() {
            return new C4095je(0, null, null, 7, null);
        }
    }

    static {
        V9 v92 = new V9("isadplayer-background");
        v92.start();
        v92.a();
        f30597e = v92;
        V9 v93 = new V9("isadplayer-publisher-callbacks");
        v93.start();
        v93.a();
        f30598f = v93;
        V9 v94 = new V9("isadplayer-release");
        v94.start();
        v94.a();
        f30599g = v94;
    }

    private V7() {
    }

    public static /* synthetic */ void a(V7 v72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v72.b(runnable, j10);
    }

    private final C4095je b() {
        return (C4095je) f30596d.getValue();
    }

    public static /* synthetic */ void b(V7 v72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v72.c(runnable, j10);
    }

    public static /* synthetic */ void c(V7 v72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        v72.d(runnable, j10);
    }

    private final boolean f(Runnable runnable) {
        return f30595c && b().getQueue().contains(runnable);
    }

    @Nullable
    public final Looper a() {
        return f30597e.getLooper();
    }

    @Override // com.ironsource.Tf
    public void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "action");
        c(this, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Tf
    public void a(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "action");
        if (f30595c) {
            b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            f30599g.a(runnable, j10);
        }
    }

    public final void a(boolean z10) {
        f30595c = z10;
    }

    public final void b(@NotNull Runnable runnable) {
        tn.p.k(runnable, "action");
        a(this, runnable, 0L, 2, (Object) null);
    }

    public final void b(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "action");
        f30597e.a(runnable, j10);
    }

    @NotNull
    public final ThreadPoolExecutor c() {
        return b();
    }

    public final void c(@NotNull Runnable runnable) {
        tn.p.k(runnable, "action");
        b(this, runnable, 0L, 2, null);
    }

    public final void c(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "action");
        f30598f.a(runnable, j10);
    }

    public final void d(@NotNull Runnable runnable) {
        tn.p.k(runnable, "action");
        c(this, runnable, 0L, 2, null);
    }

    public final void d(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "action");
        f30594b.postDelayed(runnable, j10);
    }

    public final boolean d() {
        return f30595c;
    }

    public final void e(@NotNull Runnable runnable) {
        tn.p.k(runnable, "action");
        if (f(runnable)) {
            b().remove(runnable);
        } else {
            f30599g.b(runnable);
        }
    }
}

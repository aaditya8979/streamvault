package com.ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4341xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4341xf f34397a = new C4341xf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final bn.g f34398b = kotlin.b.b(a.f34399a);

    /* JADX INFO: renamed from: com.ironsource.xf$a */
    public static final class a extends Lambda implements sn.a<C4095je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34399a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4095je invoke() {
            return new C4095je(16, null, null, 6, null);
        }
    }

    private C4341xf() {
    }

    private final C4095je a() {
        return (C4095je) f34398b.getValue();
    }

    public static /* synthetic */ void a(C4341xf c4341xf, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4341xf.a(runnable, j10);
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "action");
        a(this, runnable, 0L, 2, null);
    }

    public final void a(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "action");
        a().schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}

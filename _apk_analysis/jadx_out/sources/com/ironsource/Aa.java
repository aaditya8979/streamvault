package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f28734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f28735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28736c;

    public Aa(@NotNull C4173o0 c4173o0) {
        tn.p.k(c4173o0, "adTools");
        this.f28734a = c4173o0;
        this.f28735b = "";
    }

    @NotNull
    public final C4173o0 a() {
        return this.f28734a;
    }

    public final void a(@NotNull C4028g0 c4028g0) {
        tn.p.k(c4028g0, "adProperties");
        this.f28734a.e().a(new C0(this.f28734a, c4028g0, null, 4, null));
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "runnable");
        this.f28734a.d(runnable);
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f28735b = str;
    }

    public final void a(boolean z10) {
        this.f28736c = z10;
    }

    @NotNull
    public final String b() {
        return this.f28735b;
    }

    public final void b(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        this.f28734a.e(runnable);
    }

    public final boolean c() {
        return this.f28736c;
    }

    public abstract boolean d();
}

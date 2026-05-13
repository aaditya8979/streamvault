package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Ce {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static Boolean f28891b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Ce f28890a = new Ce();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static Be f28892c = Be.NOT_INIT;

    private Ce() {
    }

    @NotNull
    public final synchronized Be a() {
        return f28892c;
    }

    public final synchronized void a(@NotNull Be be2) {
        tn.p.k(be2, "<set-?>");
        f28892c = be2;
    }

    public final void a(boolean z10) {
        f28891b = Boolean.valueOf(z10);
    }

    @NotNull
    public final Be b() {
        Boolean bool = f28891b;
        if (bool == null ? true : tn.p.f(bool, Boolean.FALSE)) {
            return Be.NOT_INIT;
        }
        if (tn.p.f(bool, Boolean.TRUE)) {
            return f28892c;
        }
        throw new NoWhenBranchMatchedException();
    }
}

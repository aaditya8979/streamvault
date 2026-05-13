package io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k2;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f71315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object[] f71316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final k2<Object>[] f71317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71318d;

    public r0(@NotNull kotlin.coroutines.d dVar, int i10) {
        this.f71315a = dVar;
        this.f71316b = new Object[i10];
        this.f71317c = new k2[i10];
    }

    public final void a(@NotNull k2<?> k2Var, @Nullable Object obj) {
        Object[] objArr = this.f71316b;
        int i10 = this.f71318d;
        objArr[i10] = obj;
        k2<Object>[] k2VarArr = this.f71317c;
        this.f71318d = i10 + 1;
        tn.p.i(k2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        k2VarArr[i10] = k2Var;
    }

    public final void b(@NotNull kotlin.coroutines.d dVar) {
        int length = this.f71317c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            k2<Object> k2Var = this.f71317c[length];
            tn.p.h(k2Var);
            k2Var.restoreThreadContext(dVar, this.f71316b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}

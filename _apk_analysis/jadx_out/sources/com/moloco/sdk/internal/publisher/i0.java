package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class i0<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public B<L> f46650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public A f46651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public h0 f46652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f46653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f46654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f46655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46656g;

    public i0(@Nullable B<L> b10, @Nullable A a10, @Nullable h0 h0Var, @Nullable kotlinx.coroutines.g gVar, @Nullable String str, @Nullable String str2, boolean z10) {
        this.f46650a = b10;
        this.f46651b = a10;
        this.f46652c = h0Var;
        this.f46653d = gVar;
        this.f46654e = str;
        this.f46655f = str2;
        this.f46656g = z10;
    }

    public /* synthetic */ i0(B b10, A a10, h0 h0Var, kotlinx.coroutines.g gVar, String str, String str2, boolean z10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : b10, (i10 & 2) != 0 ? null : a10, (i10 & 4) != 0 ? null : h0Var, (i10 & 8) != 0 ? null : gVar, (i10 & 16) != 0 ? null : str, (i10 & 32) == 0 ? str2 : null, (i10 & 64) != 0 ? false : z10);
    }

    @Nullable
    public final kotlinx.coroutines.g a() {
        return this.f46653d;
    }

    public final void b(@Nullable A a10) {
        this.f46651b = a10;
    }

    public final void c(@Nullable h0 h0Var) {
        this.f46652c = h0Var;
    }

    public final void d(@Nullable B<L> b10) {
        this.f46650a = b10;
    }

    public final void e(@Nullable String str) {
        this.f46655f = str;
    }

    public final void f(@Nullable kotlinx.coroutines.g gVar) {
        this.f46653d = gVar;
    }

    public final void g(boolean z10) {
        this.f46656g = z10;
    }

    @Nullable
    public final h0 h() {
        return this.f46652c;
    }

    public final void i(@Nullable String str) {
        this.f46654e = str;
    }

    @Nullable
    public final String j() {
        return this.f46655f;
    }

    @Nullable
    public final String k() {
        return this.f46654e;
    }

    @Nullable
    public final A l() {
        return this.f46651b;
    }

    @Nullable
    public final B<L> m() {
        return this.f46650a;
    }

    public final boolean n() {
        return this.f46656g;
    }
}

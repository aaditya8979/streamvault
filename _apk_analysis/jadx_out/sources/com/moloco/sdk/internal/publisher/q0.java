package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdShowListener;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class q0<T extends AdShowListener> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> f46949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public A f46950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public h0 f46951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.g f46952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public x0 f46953e;

    public q0(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVar, @Nullable A a10, @Nullable h0 h0Var, @Nullable kotlinx.coroutines.g gVar, @Nullable x0 x0Var) {
        this.f46949a = sVar;
        this.f46950b = a10;
        this.f46951c = h0Var;
        this.f46952d = gVar;
        this.f46953e = x0Var;
    }

    public /* synthetic */ q0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar, A a10, h0 h0Var, kotlinx.coroutines.g gVar, x0 x0Var, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : sVar, (i10 & 2) != 0 ? null : a10, (i10 & 4) != 0 ? null : h0Var, (i10 & 8) != 0 ? null : gVar, (i10 & 16) != 0 ? null : x0Var);
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> a() {
        return this.f46949a;
    }

    public final void b(@Nullable A a10) {
        this.f46950b = a10;
    }

    public final void c(@Nullable h0 h0Var) {
        this.f46951c = h0Var;
    }

    public final void d(@Nullable x0 x0Var) {
        this.f46953e = x0Var;
    }

    public final void e(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s<?, ?> sVar) {
        this.f46949a = sVar;
    }

    public final void f(@Nullable kotlinx.coroutines.g gVar) {
        this.f46952d = gVar;
    }

    @Nullable
    public final kotlinx.coroutines.g g() {
        return this.f46952d;
    }

    @Nullable
    public final h0 h() {
        return this.f46951c;
    }

    @Nullable
    public final x0 i() {
        return this.f46953e;
    }

    @Nullable
    public final A j() {
        return this.f46950b;
    }
}

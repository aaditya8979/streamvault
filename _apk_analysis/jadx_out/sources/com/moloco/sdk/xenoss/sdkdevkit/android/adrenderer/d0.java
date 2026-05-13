package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C4377a;
import com.moloco.sdk.internal.ortb.model.C4378b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class d0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f47707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final sn.p<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> f47713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final C4377a f47714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final C4378b f47715j;

    public d0() {
        this(false, null, 0, 0, 0, false, false, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(boolean z10, @Nullable Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, @NotNull sn.p<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> pVar, @Nullable C4377a c4377a, @Nullable C4378b c4378b) {
        tn.p.k(pVar, "VastRenderer");
        this.f47706a = z10;
        this.f47707b = bool;
        this.f47708c = i10;
        this.f47709d = i11;
        this.f47710e = i12;
        this.f47711f = z11;
        this.f47712g = z12;
        this.f47713h = pVar;
        this.f47714i = c4377a;
        this.f47715j = c4378b;
    }

    public /* synthetic */ d0(boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, sn.p pVar, C4377a c4377a, C4378b c4378b, int i13, tn.i iVar) {
        this((i13 & 1) != 0 ? true : z10, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? 5 : i10, (i13 & 8) != 0 ? 5 : i11, (i13 & 16) == 0 ? i12 : 5, (i13 & 32) != 0 ? false : z11, (i13 & 64) == 0 ? z12 : false, (i13 & 128) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.e(0L, null, null, null, null, null, null, null, null, null, null, 2047, null) : pVar, (i13 & 256) != 0 ? null : c4377a, (i13 & 512) == 0 ? c4378b : null);
    }

    @Nullable
    public final C4377a a() {
        return this.f47714i;
    }

    @Nullable
    public final C4378b b() {
        return this.f47715j;
    }

    public final boolean c() {
        return this.f47712g;
    }

    public final boolean d() {
        return this.f47711f;
    }

    public final int e() {
        return this.f47709d;
    }

    public final int f() {
        return this.f47710e;
    }

    @Nullable
    public final Boolean g() {
        return this.f47707b;
    }

    public final int h() {
        return this.f47708c;
    }

    public final boolean i() {
        return this.f47706a;
    }

    @NotNull
    public final sn.p<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> j() {
        return this.f47713h;
    }
}

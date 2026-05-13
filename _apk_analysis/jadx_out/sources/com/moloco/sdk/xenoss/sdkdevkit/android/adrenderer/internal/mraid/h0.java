package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f48367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rect f48368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Rect f48369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Rect f48370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Rect f48371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Rect f48372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Rect f48373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Rect f48374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Rect f48375i;

    public h0(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        Context applicationContext = context.getApplicationContext();
        tn.p.j(applicationContext, "getApplicationContext(...)");
        this.f48367a = applicationContext;
        this.f48368b = new Rect();
        this.f48369c = new Rect();
        this.f48370d = new Rect();
        this.f48371e = new Rect();
        this.f48372f = new Rect();
        this.f48373g = new Rect();
        this.f48374h = new Rect();
        this.f48375i = new Rect();
    }

    public final void a(int i10, int i11) {
        this.f48368b.set(0, 0, i10, i11);
        c(this.f48368b, this.f48369c);
    }

    public final void b(int i10, int i11, int i12, int i13) {
        this.f48372f.set(i10, i11, i12 + i10, i13 + i11);
        c(this.f48372f, this.f48373g);
    }

    public final void c(Rect rect, Rect rect2) {
        f fVar = f.f48352a;
        rect2.set(fVar.c(rect.left, this.f48367a), fVar.c(rect.top, this.f48367a), fVar.c(rect.right, this.f48367a), fVar.c(rect.bottom, this.f48367a));
    }

    @NotNull
    public final Rect d() {
        return this.f48373g;
    }

    public final void e(int i10, int i11, int i12, int i13) {
        this.f48374h.set(i10, i11, i12 + i10, i13 + i11);
        c(this.f48374h, this.f48375i);
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f48370d.set(i10, i11, i12 + i10, i13 + i11);
        c(this.f48370d, this.f48371e);
    }

    @NotNull
    public final Rect g() {
        return this.f48375i;
    }

    @NotNull
    public final Rect h() {
        return this.f48371e;
    }

    @NotNull
    public final Rect i() {
        return this.f48369c;
    }
}

package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import yads.u10;
import yads.v10;

/* JADX INFO: loaded from: classes4.dex */
public final class RoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u10 f51067a;

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, 8, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, @NotNull v10 v10Var) {
        super(context, attributeSet, i10);
        v10Var.getClass();
        this.f51067a = v10.a(context, this, attributeSet, i10);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i10, v10 v10Var, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new v10() : v10Var);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.f51067a;
        if (u10Var.f95478d != null && !u10Var.f95477c.isEmpty()) {
            canvas.clipPath(u10Var.f95477c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f51067a.a();
    }
}

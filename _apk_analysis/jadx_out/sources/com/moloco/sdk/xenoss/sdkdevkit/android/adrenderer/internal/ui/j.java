package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
public final class j extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final w0 f49023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImageButton f49025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public sn.l<? super a.AbstractC0696a.c, bn.r> f49026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull w0 w0Var, @NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f49023b = w0Var;
        this.f49024c = 12;
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(k.a(12, context), k.a(12, context)));
        imageButton.setImageResource(R$drawable.info_badge);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.a(this.f48944b, view);
            }
        });
        this.f49025d = imageButton;
        addView(imageButton);
        imageButton.setContentDescription("Ad Badge");
        imageButton.setTag("Ad Badge");
    }

    public /* synthetic */ j(w0 w0Var, Context context, AttributeSet attributeSet, int i10, int i11, tn.i iVar) {
        this(w0Var, context, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10);
    }

    public static final void a(j jVar, View view) {
        jVar.f49023b.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
    }

    public static final void b(j jVar, String str, View view) {
        jVar.f49023b.a(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @VisibleForTesting
    @NotNull
    public final ImageButton getAdButton() {
        return this.f49025d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            float f10 = getResources().getDisplayMetrics().density;
            this.f49025d.getLocationOnScreen(new int[2]);
            a.AbstractC0696a.c cVar = new a.AbstractC0696a.c(a.AbstractC0696a.c.EnumC0698a.f50951i, new a.AbstractC0696a.f(r4[0] / f10, r4[1] / f10), new a.AbstractC0696a.g(this.f49025d.getWidth() / f10, this.f49025d.getHeight() / f10));
            sn.l<? super a.AbstractC0696a.c, bn.r> lVar = this.f49026e;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void setOnButtonRenderedListener(@NotNull sn.l<? super a.AbstractC0696a.c, bn.r> lVar) {
        tn.p.k(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f49026e = lVar;
    }

    public final void setPrivacyUrl(@NotNull final String str) {
        tn.p.k(str, "url");
        this.f49025d.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.b(this.f48957b, str, view);
            }
        });
    }
}

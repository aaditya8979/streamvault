package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.hk;
import yads.iv2;
import yads.kj3;
import yads.lj3;
import yads.lv2;
import yads.x20;
import yads.yz2;

/* JADX INFO: loaded from: classes4.dex */
public class CustomizableMediaView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f51103f = R$layout.monetization_ads_internal_outstream_controls_default;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kj3 f51107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x20 f51108e;

    public CustomizableMediaView(@NotNull Context context) {
        this(context, null);
    }

    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            this.f51104a = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f51103f);
            this.f51107d = lj3.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f51104a = f51103f;
            this.f51107d = null;
        }
        addOnAttachStateChangeListener(new hk(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: zd.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(this.f98272b);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        x20 x20Var = customizableMediaView.f51108e;
        if (x20Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            lv2 lv2Var = (lv2) ((iv2) x20Var).f91020a.get();
            if (lv2Var != null) {
                yz2 yz2Var = lv2Var.f92125f;
                if (width < yz2Var.f97337b || height < yz2Var.f97338c) {
                    lv2Var.f92128i.setValue(lv2Var, lv2.f92122j[2], lv2Var.f92124e);
                }
            }
        }
    }

    public final void a(int i10) {
        this.f51104a = i10;
    }

    public final int getHeightMeasureSpec() {
        return this.f51106c;
    }

    @Nullable
    public final x20 getOnSizeChangedListener$mobileads_externalRelease() {
        return this.f51108e;
    }

    public final int getVideoControlsLayoutId() {
        return this.f51104a;
    }

    @Nullable
    public final kj3 getVideoScaleType() {
        return this.f51107d;
    }

    public final int getWidthMeasureSpec() {
        return this.f51105b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f51105b = i10;
        this.f51106c = i11;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        lv2 lv2Var;
        super.onSizeChanged(i10, i11, i12, i13);
        x20 x20Var = this.f51108e;
        if (x20Var == null || (lv2Var = (lv2) ((iv2) x20Var).f91020a.get()) == null) {
            return;
        }
        yz2 yz2Var = lv2Var.f92125f;
        if (i10 < yz2Var.f97337b || i11 < yz2Var.f97338c) {
            lv2Var.f92128i.setValue(lv2Var, lv2.f92122j[2], lv2Var.f92124e);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(@Nullable x20 x20Var) {
        this.f51108e = x20Var;
    }
}

package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.AttrRes;
import androidx.annotation.MainThread;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.d;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.bq3;
import yads.cq3;
import yads.l10;
import yads.pu3;
import yads.y02;

/* JADX INFO: loaded from: classes2.dex */
@MainThread
public final class NativeBannerView extends l10 {
    private final bq3 K;

    public NativeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        NativeTemplateAppearance nativeTemplateAppearanceBuild = new NativeTemplateAppearance.Builder().build();
        pu3 pu3Var = pu3.f93787a;
        super(context, attributeSet, i10, nativeTemplateAppearanceBuild, new cq3(context));
        this.K = new bq3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53151y, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAd(@NotNull NativeAd nativeAd) {
        this.K.getClass();
        if (!(nativeAd instanceof y02)) {
            throw new IllegalArgumentException("You should pass NativeAd received from native ad loader API.");
        }
        setAd(((d) ((y02) nativeAd)).f59218a);
    }
}

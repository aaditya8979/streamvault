package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.h0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class p0 extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    @Nullable
    public final Object a(@NotNull MotionEvent motionEvent, @NotNull com.moloco.sdk.internal.services.f0 f0Var, @Nullable String str, @Nullable String str2, @NotNull s sVar, @Nullable go.k<bn.r> kVar, @NotNull com.moloco.sdk.internal.h0 h0Var, @NotNull hn.c<? super bn.r> cVar) {
        Object objA;
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(cn.r.V(iArr), cn.r.o0(iArr), getHeight(), getWidth(), (int) (motionEvent.getX() + cn.r.V(iArr)), (int) (motionEvent.getY() + cn.r.o0(iArr)));
            if (str != null) {
                jn.a.a(h0.a.a(h0Var, str, System.currentTimeMillis(), null, 4, null));
            }
            if (str2 != null && (objA = f0Var.a(str2, aVar, sVar, kVar, cVar)) == in.a.g()) {
                return objA;
            }
        }
        return bn.r.f5635a;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.D, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}

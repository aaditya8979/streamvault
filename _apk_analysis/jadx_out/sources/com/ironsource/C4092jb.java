package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4092jb extends LevelPlayMediaView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092jb(@NotNull Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092jb(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092jb(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}

package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.inmobi.media.AbstractC3872y2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3872y2 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn.g f28563a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3872y2(Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f28563a = kotlin.b.b(new sn.a() { // from class: n9.lc
            @Override // sn.a
            public final Object invoke() {
                return AbstractC3872y2.a(this.f75489b);
            }
        });
    }

    public static final Ua a(AbstractC3872y2 abstractC3872y2) {
        return abstractC3872y2.d();
    }

    public abstract Ua d();

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final Ua getLandingPageHandler() {
        return (Ua) this.f28563a.getValue();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}

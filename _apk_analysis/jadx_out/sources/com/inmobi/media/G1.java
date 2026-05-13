package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class G1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f25505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Af f25510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(Context context) {
        super(context, null);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f25506b = -1;
        this.f25507c = -1;
        this.f25508d = -1;
        this.f25509e = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i10 == this.f25506b && i11 == this.f25507c && i14 == this.f25508d && i15 == this.f25509e) {
            return;
        }
        this.f25506b = i10;
        this.f25507c = i11;
        this.f25508d = i14;
        this.f25509e = i15;
        Af af2 = this.f25510f;
        if (af2 != null) {
            N7 n72 = ((B7) af2).f25203a;
            VideoViewPosition videoViewPosition = new VideoViewPosition();
            videoViewPosition.setX(i10);
            videoViewPosition.setY(i11);
            videoViewPosition.setWidth(F3.a(i14));
            videoViewPosition.setHeight(F3.a(i15));
            n72.a(new C3529k8(videoViewPosition));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f25505a;
        if (f10 > 0.0f) {
            float f11 = size;
            float f12 = size2;
            if (f11 / f12 > f10) {
                size = (int) (f12 * f10);
            } else {
                size2 = (int) (f11 / f10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void setOnPositionChangeListener(@Nullable Af af2) {
        this.f25510f = af2;
    }
}

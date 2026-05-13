package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lh extends com.bytedance.sdk.openadsdk.core.le.ra {
    public zih bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.pno f13130cf;
    public com.bytedance.sdk.openadsdk.core.le.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public zih f13131le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.yu f13132lh;
    public com.bytedance.sdk.openadsdk.core.le.yu ouw;
    public final ra pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.pno f13133ra;
    public com.bytedance.sdk.openadsdk.core.widget.lh ryl;
    public com.bytedance.sdk.openadsdk.core.le.pno tlj;
    public com.bytedance.sdk.openadsdk.core.le.lh vt;
    public PAGLogoView yu;

    public lh(Context context) {
        super(context);
        this.pno = new ra(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.ra, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract com.bytedance.sdk.openadsdk.core.le.yu getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.yu;
    }

    public abstract com.bytedance.sdk.openadsdk.core.le.pno getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.le.yu getBackImage() {
        return this.ouw;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getClickButton() {
        return this.fkw;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getContent() {
        return this.f13130cf;
    }

    public com.bytedance.sdk.openadsdk.core.widget.lh getDspAdChoice() {
        return this.ryl;
    }

    public zih getHostAppIcon() {
        return this.f13131le;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getHostAppName() {
        return this.f13133ra;
    }

    public zih getIconOnlyView() {
        return this.bly;
    }

    public com.bytedance.sdk.openadsdk.core.le.yu getImageView() {
        return this.f13132lh;
    }

    public com.bytedance.sdk.openadsdk.core.le.fkw getOverlayLayout() {
        return null;
    }

    public abstract rn getScoreBar();

    public com.bytedance.sdk.openadsdk.core.le.pno getTitle() {
        return this.tlj;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getTopCountDown() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.le.yu getTopSkip() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.le.lh getVideoContainer() {
        return this.vt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.ra, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}

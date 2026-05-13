package com.bytedance.sdk.component.adexpress.le;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cd;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class ra extends vpp {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private AnimatorSet f12380lh;
    private TextView ouw;
    private View vt;

    public ra(Context context) {
        super(context);
        this.f12380lh = new AnimatorSet();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(81);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(cd.ouw(context, 46.0f), cd.ouw(context, 32.0f)));
        linearLayout2.setBackground(com.bytedance.sdk.component.adexpress.yu.pno.ouw(0, Integer.valueOf(Color.parseColor("#99000000")), new int[]{cd.ouw(context, 40.0f)}, null, Integer.valueOf(cd.ouw(context, 1.0f)), Integer.valueOf(Color.parseColor("#88FFFFFF"))));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setBackground(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_splash_slide_up_10"));
        linearLayout2.addView(imageView);
        linearLayout.addView(linearLayout2);
        this.vt = linearLayout;
        addView(linearLayout);
        setClipChildren(false);
        this.ouw = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void ouw() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.vt, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.vt, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f12380lh.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f12380lh.setDuration(1000L);
        this.f12380lh.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void ouw(Context context) {
    }

    public final void setButtonText(String str) {
        if (this.ouw == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.ouw.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.le.vpp
    public final void vt() {
        this.f12380lh.cancel();
    }
}

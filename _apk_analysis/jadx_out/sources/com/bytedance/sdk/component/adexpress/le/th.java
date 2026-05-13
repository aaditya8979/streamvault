package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class th extends LinearLayout {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f12390cf;
    private TextView fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private TextView f12391le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private ImageView f12392lh;
    private TextView ouw;
    private LinearLayout pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ouw f12393ra;
    private JSONObject ryl;
    private int tlj;
    private TextView vt;
    private com.bytedance.sdk.component.utils.ex yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.le.th$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (th.this.f12392lh != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new vt((byte) 0));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.le.th.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        th.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.th.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                th.this.f12392lh.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                th.this.f12392lh.startAnimation(rotateAnimation);
            }
        }
    }

    public interface ouw {
    }

    public static class vt implements Interpolator {
        private vt() {
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }
    }

    public th(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.bly = i10;
        this.tlj = i11;
        this.f12390cf = i12;
        this.ryl = jSONObject;
        ouw(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public LinearLayout getShakeLayout() {
        return this.pno;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.yu == null) {
                getContext().getApplicationContext();
                this.yu = new com.bytedance.sdk.component.utils.ex();
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.le.th.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void ouw(View view) {
        addView(view);
        this.pno = (LinearLayout) findViewById(2097610727);
        this.f12392lh = (ImageView) findViewById(2097610725);
        this.ouw = (TextView) findViewById(2097610724);
        this.vt = (TextView) findViewById(2097610726);
        this.fkw = (TextView) findViewById(2097610723);
        this.f12391le = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.pno.setBackground(gradientDrawable);
    }

    public void setOnShakeViewListener(ouw ouwVar) {
        this.f12393ra = ouwVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.fkw.setText(str);
        } else {
            this.fkw.setVisibility(8);
            this.f12391le.setVisibility(8);
        }
    }
}

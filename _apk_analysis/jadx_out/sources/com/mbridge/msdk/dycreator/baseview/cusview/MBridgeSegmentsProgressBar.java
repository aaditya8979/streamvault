package com.mbridge.msdk.dycreator.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f36987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f36988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f36989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36990l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f36979a = "MBridgeSegmentsProgressBar";
        this.f36981c = 1;
        this.f36982d = 20;
        this.f36983e = 10;
        this.f36984f = 1;
        this.f36985g = -1711276033;
        this.f36986h = -1;
        this.f36987i = new ArrayList();
        this.f36990l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36979a = "MBridgeSegmentsProgressBar";
        this.f36981c = 1;
        this.f36982d = 20;
        this.f36983e = 10;
        this.f36984f = 1;
        this.f36985g = -1711276033;
        this.f36986h = -1;
        this.f36987i = new ArrayList();
        this.f36990l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36979a = "MBridgeSegmentsProgressBar";
        this.f36981c = 1;
        this.f36982d = 20;
        this.f36983e = 10;
        this.f36984f = 1;
        this.f36985g = -1711276033;
        this.f36986h = -1;
        this.f36987i = new ArrayList();
        this.f36990l = false;
    }

    @RequiresApi(api = 21)
    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f36979a = "MBridgeSegmentsProgressBar";
        this.f36981c = 1;
        this.f36982d = 20;
        this.f36983e = 10;
        this.f36984f = 1;
        this.f36985g = -1711276033;
        this.f36986h = -1;
        this.f36987i = new ArrayList();
        this.f36990l = false;
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f36989k, Integer.valueOf(i10), Integer.valueOf(this.f36980b)));
        } catch (Throwable th2) {
            sb2.append(this.f36980b);
            sb2.append("videos, the");
            sb2.append(i10);
            sb2.append(" is playing.");
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        return sb2;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f36990l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        try {
            if (this.f36981c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f36989k)) {
                    this.f36989k = this.f36990l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f36981c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f36989k)) {
                    this.f36989k = this.f36990l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f36987i.clear();
            removeAllViews();
            setBackground(getBackgroundDrawable());
            TextView textView = new TextView(getContext());
            this.f36988j = textView;
            textView.setTextColor(-1);
            this.f36988j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f36988j.setLayoutParams(layoutParams);
            if (this.f36981c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f36988j;
                int i10 = this.f36982d;
                textView2.setPadding(i10 / 2, 15, i10 / 2, 5);
            }
            if (this.f36981c == 2) {
                this.f36988j.setGravity(16);
                TextView textView3 = this.f36988j;
                int i11 = this.f36982d;
                textView3.setPadding(i11 / 2, 0, i11 / 2, 0);
            }
            try {
                int iA = i0.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (i0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f36988j.setCompoundDrawables(drawable, null, null, null);
                    this.f36988j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th3) {
                q0.b("MBridgeSegmentsProgressBar", th3.getMessage());
            }
            this.f36988j.setText(a(this.f36984f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i12 = 0; i12 < this.f36980b; i12++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(getSegmentLayerDrawable());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i13 = this.f36982d;
                layoutParams3.leftMargin = i13 / 2;
                layoutParams3.rightMargin = i13 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f36987i.add(progressBar);
            }
            int i14 = this.f36981c;
            if (i14 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f36988j);
                addView(linearLayout);
            } else {
                if (i14 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f36988j);
            }
        } catch (Throwable th4) {
            q0.b("MBridgeSegmentsProgressBar", th4.getMessage());
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f36983e);
        gradientDrawable.setColor(this.f36985g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f36983e);
        gradientDrawable2.setColor(this.f36986h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void init(int i10, int i11) {
        this.f36980b = i10;
        this.f36981c = i11;
        a();
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f36980b = i10;
        this.f36981c = i11;
        this.f36986h = i12;
        this.f36985g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f36980b = i10;
        this.f36981c = i11;
        this.f36986h = i12;
        this.f36985g = i13;
        this.f36982d = i14;
        this.f36983e = i15;
        a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setIndicatorText(String str) {
        this.f36989k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f36987i.size() == 0) {
                return;
            }
            if (i11 < this.f36987i.size()) {
                this.f36987i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f36984f) {
                this.f36984f = i12;
                TextView textView = this.f36988j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }
}

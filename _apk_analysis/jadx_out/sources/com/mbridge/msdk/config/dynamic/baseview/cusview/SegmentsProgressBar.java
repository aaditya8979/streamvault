package com.mbridge.msdk.config.dynamic.baseview.cusview;

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
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SegmentsProgressBar extends ComponentLinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<ProgressBar> f36552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f36553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f36554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36555l;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SegmentsProgressBar.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public SegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36544a = "MBridgeSegmentsProgressBar";
        this.f36546c = 1;
        this.f36547d = 20;
        this.f36548e = 10;
        this.f36549f = 1;
        this.f36550g = -1711276033;
        this.f36551h = -1;
        this.f36552i = new ArrayList();
        this.f36555l = false;
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f36554k, Integer.valueOf(i10), Integer.valueOf(this.f36545b)));
        } catch (Throwable th2) {
            sb2.append(this.f36545b);
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
            this.f36555l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        int i10 = this.f36546c;
        if (i10 == 1) {
            setOrientation(1);
            if (TextUtils.isEmpty(this.f36554k)) {
                this.f36554k = this.f36555l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
            }
        } else if (i10 == 2) {
            setOrientation(0);
            if (TextUtils.isEmpty(this.f36554k)) {
                this.f36554k = this.f36555l ? "广告 %s/%s" : "ADS %s/%s";
            }
        }
        this.f36552i.clear();
        removeAllViews();
        setBackground(getBackgroundDrawable());
        TextView textView = new TextView(getContext());
        this.f36553j = textView;
        textView.setTextColor(-1);
        this.f36553j.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f36553j.setLayoutParams(layoutParams);
        int i11 = this.f36546c;
        if (i11 == 1) {
            layoutParams.gravity = 5;
            TextView textView2 = this.f36553j;
            int i12 = this.f36547d / 2;
            textView2.setPadding(i12, 15, i12, 5);
        } else if (i11 == 2) {
            this.f36553j.setGravity(16);
            TextView textView3 = this.f36553j;
            int i13 = this.f36547d / 2;
            textView3.setPadding(i13, 0, i13, 0);
        }
        try {
            int iA = i0.a(getContext(), "mbridge_reward_video_icon", "drawable");
            if (i0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f36553j.setCompoundDrawables(drawable, null, null, null);
                this.f36553j.setCompoundDrawablePadding(5);
            }
        } catch (Throwable th3) {
            q0.b("MBridgeSegmentsProgressBar", th3.getMessage());
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
        linearLayout.setLayoutParams(layoutParams2);
        for (int i14 = 0; i14 < this.f36545b; i14++) {
            ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            progressBar.setProgressDrawable(getSegmentLayerDrawable());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
            int i15 = this.f36547d / 2;
            layoutParams3.leftMargin = i15;
            layoutParams3.rightMargin = i15;
            progressBar.setLayoutParams(layoutParams3);
            linearLayout.addView(progressBar);
            this.f36552i.add(progressBar);
        }
        int i16 = this.f36546c;
        if (i16 == 1) {
            setPadding(15, 10, 15, 25);
            addView(this.f36553j);
            addView(linearLayout);
        } else {
            if (i16 != 2) {
                addView(linearLayout);
                return;
            }
            setPadding(15, 0, 15, 25);
            layoutParams2.gravity = 16;
            layoutParams2.weight = 1.0f;
            addView(linearLayout);
            addView(this.f36553j);
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
        gradientDrawable.setCornerRadius(this.f36548e);
        gradientDrawable.setColor(this.f36550g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f36548e);
        gradientDrawable2.setColor(this.f36551h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new a());
        startAnimation(alphaAnimation);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void init(int i10, int i11) {
        this.f36545b = i10;
        this.f36546c = i11;
        a();
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f36545b = i10;
        this.f36546c = i11;
        this.f36551h = i12;
        this.f36550g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f36545b = i10;
        this.f36546c = i11;
        this.f36551h = i12;
        this.f36550g = i13;
        this.f36547d = i14;
        this.f36548e = i15;
        a();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setIndicatorText(String str) {
        this.f36554k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f36552i.isEmpty()) {
                return;
            }
            if (i11 < this.f36552i.size()) {
                this.f36552i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f36549f) {
                this.f36549f = i12;
                TextView textView = this.f36553j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            this.f36545b = Integer.parseInt(String.valueOf(map.get("count")));
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            this.f36545b = 1;
        }
        try {
            this.f36546c = Integer.parseInt(String.valueOf(map.get("style")));
        } catch (Throwable th3) {
            q0.b("MBridgeSegmentsProgressBar", th3.getMessage());
            this.f36546c = 0;
        }
        init(this.f36545b, this.f36546c);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        setProgress(str.contains("percent") ? Integer.parseInt(obj.toString()) : 0, str.contains("Index") ? Integer.parseInt(obj.toString()) : 0);
    }
}

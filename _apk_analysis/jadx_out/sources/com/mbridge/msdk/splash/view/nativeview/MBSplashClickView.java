package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f40111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f40112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f40113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f40114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f40115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f40116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f40117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f40118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f40119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f40121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f40122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f40123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f40124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Paint f40125r;

    public class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScaleAnimation f40126a;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a, reason: collision with other inner class name */
        public class RunnableC0504a implements Runnable {
            public RunnableC0504a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f40122o.startAnimation(a.this.f40126a);
            }
        }

        public a(ScaleAnimation scaleAnimation) {
            this.f40126a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f40122o.setVisibility(4);
            MBSplashClickView.this.f40122o.postDelayed(new RunnableC0504a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f40122o.setVisibility(0);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScaleAnimation f40129a;

        public b(ScaleAnimation scaleAnimation) {
            this.f40129a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f40122o.startAnimation(this.f40129a);
        }
    }

    public class c implements Animation.AnimationListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Animation f40132a;

            public a(Animation animation) {
                this.f40132a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f40121n.startAnimation(this.f40132a);
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f40121n.setVisibility(4);
            MBSplashClickView.this.f40121n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f40121n.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f40108a = "浏览第三方应用";
        this.f40109b = "View";
        this.f40110c = "打开第三方应用";
        this.f40111d = "Open";
        this.f40112e = "下载第三方应用";
        this.f40113f = "Install";
        this.f40114g = "mbridge_splash_btn_arrow_right";
        this.f40115h = "mbridge_splash_btn_circle";
        this.f40116i = "mbridge_splash_btn_finger";
        this.f40117j = "mbridge_splash_btn_go";
        this.f40118k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f40123p = new RectF();
        this.f40124q = new Paint();
        this.f40125r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40108a = "浏览第三方应用";
        this.f40109b = "View";
        this.f40110c = "打开第三方应用";
        this.f40111d = "Open";
        this.f40112e = "下载第三方应用";
        this.f40113f = "Install";
        this.f40114g = "mbridge_splash_btn_arrow_right";
        this.f40115h = "mbridge_splash_btn_circle";
        this.f40116i = "mbridge_splash_btn_finger";
        this.f40117j = "mbridge_splash_btn_go";
        this.f40118k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f40123p = new RectF();
        this.f40124q = new Paint();
        this.f40125r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40108a = "浏览第三方应用";
        this.f40109b = "View";
        this.f40110c = "打开第三方应用";
        this.f40111d = "Open";
        this.f40112e = "下载第三方应用";
        this.f40113f = "Install";
        this.f40114g = "mbridge_splash_btn_arrow_right";
        this.f40115h = "mbridge_splash_btn_circle";
        this.f40116i = "mbridge_splash_btn_finger";
        this.f40117j = "mbridge_splash_btn_go";
        this.f40118k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f40123p = new RectF();
        this.f40124q = new Paint();
        this.f40125r = new Paint();
        a();
    }

    @RequiresApi(api = 21)
    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f40108a = "浏览第三方应用";
        this.f40109b = "View";
        this.f40110c = "打开第三方应用";
        this.f40111d = "Open";
        this.f40112e = "下载第三方应用";
        this.f40113f = "Install";
        this.f40114g = "mbridge_splash_btn_arrow_right";
        this.f40115h = "mbridge_splash_btn_circle";
        this.f40116i = "mbridge_splash_btn_finger";
        this.f40117j = "mbridge_splash_btn_go";
        this.f40118k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f40123p = new RectF();
        this.f40124q = new Paint();
        this.f40125r = new Paint();
    }

    private void a() {
        this.f40124q.setAntiAlias(true);
        this.f40124q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f40125r.setAntiAlias(true);
        this.f40125r.setColor(-1);
    }

    private boolean a(String str) {
        str.hashCode();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f40120m = 3;
                break;
            case "Open":
            case "打开第三方应用":
                this.f40120m = 1;
                break;
            case "View":
            case "浏览第三方应用":
                this.f40120m = 2;
                break;
            default:
                return false;
        }
        return true;
    }

    private void b() {
        if (!a(this.f40119l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f40119l)) {
                this.f40119l = zContains ? "浏览第三方应用" : "View";
            }
            this.f40120m = 2;
        }
        setBgDrawable(this.f40120m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(15);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f40119l);
        this.f40121n = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = null;
        int identifier = 0;
        int i10 = this.f40120m;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 35.0f), v0.a(getContext(), 35.0f));
            layoutParams2.addRule(11);
            layoutParams2.addRule(15);
            layoutParams2.rightMargin = v0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams2.leftMargin = 20;
            layoutParams2.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 25.0f), v0.a(getContext(), 25.0f));
            layoutParams2.addRule(11);
            layoutParams2.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams2.topMargin = v0.a(getContext(), 18.0f);
            this.f40122o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams4.topMargin = v0.a(getContext(), 5.0f);
            this.f40122o.setLayoutParams(layoutParams4);
            this.f40122o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            addView(this.f40122o);
        }
        this.f40121n.setLayoutParams(layoutParams2);
        this.f40121n.setImageResource(identifier);
        addView(textView);
        addView(this.f40121n);
        invalidate();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.f40122o.setVisibility(4);
        this.f40121n.startAnimation(scaleAnimation);
        this.f40122o.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f40121n.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.f40121n.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i10) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f40123p, this.f40125r, 31);
        canvas.drawRoundRect(this.f40123p, 200.0f, 200.0f, this.f40125r);
        canvas.saveLayer(this.f40123p, this.f40124q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f40119l = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f40120m;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f40123p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}

package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BaitClickView extends ComponentRelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f36477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f36478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f36479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f36486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f36487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f36488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f36489m;

    public class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36490a;

        public a(int i10) {
            this.f36490a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f36478b.setImageResource(this.f36490a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f36478b.setImageBitmap(bitmap);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36492a;

        public b(int i10) {
            this.f36492a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f36477a.setImageResource(this.f36492a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f36477a.setImageBitmap(bitmap);
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f36478b != null) {
                BaitClickView.this.f36478b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f36478b != null) {
                BaitClickView.this.f36478b.setVisibility(0);
            }
        }
    }

    public class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnimationSet f36495a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f36478b != null) {
                    BaitClickView.this.f36478b.startAnimation(d.this.f36495a);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f36477a != null) {
                    BaitClickView.this.f36477a.startAnimation(BaitClickView.this.f36486j);
                }
            }
        }

        public d(AnimationSet animationSet) {
            this.f36495a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }
    }

    public class e implements Animation.AnimationListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f36477a != null) {
                    BaitClickView.this.f36477a.startAnimation(BaitClickView.this.f36486j);
                }
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36480d = "";
        this.f36481e = "";
        this.f36482f = "Click now for details";
        this.f36483g = 1;
        this.f36484h = 1342177280;
        this.f36485i = 0;
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f36486j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f36486j.setRepeatCount(1);
        this.f36486j.setAnimationListener(new e());
        ImageView imageView = this.f36477a;
        if (imageView != null) {
            imageView.startAnimation(this.f36486j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f36486j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f36486j.setRepeatCount(-1);
        this.f36486j.setRepeatMode(2);
        ImageView imageView = this.f36477a;
        if (imageView != null) {
            imageView.startAnimation(this.f36486j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f36487k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f36487k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f36488l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f36488l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f36487k);
        animationSet.addAnimation(this.f36488l);
        ImageView imageView2 = this.f36478b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f36489m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f36489m.setRepeatMode(2);
        this.f36489m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f36487k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f36487k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f36488l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f36488l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f36487k);
        animationSet.addAnimation(this.f36488l);
        ImageView imageView = this.f36477a;
        if (imageView != null) {
            imageView.startAnimation(this.f36489m);
        }
        ImageView imageView2 = this.f36478b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f36486j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f36486j.setRepeatCount(-1);
        this.f36486j.setRepeatMode(2);
        ImageView imageView = this.f36477a;
        if (imageView != null) {
            imageView.startAnimation(this.f36486j);
        }
    }

    private void e() {
        ImageView imageView = this.f36478b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f36486j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f36486j.setRepeatCount(1);
        this.f36486j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f36487k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f36487k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f36488l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f36488l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f36487k);
        animationSet.addAnimation(this.f36488l);
        this.f36487k.setAnimationListener(new c());
        this.f36486j.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.f36477a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f36486j);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f36482f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void init() {
        try {
            if (this.f36485i == 0) {
                setBackgroundColor(this.f36484h);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f36484h);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(v0.a(getContext(), this.f36485i));
                setBackground(gradientDrawable);
            }
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f36478b = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f36478b.setLayoutParams(layoutParams);
            int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f36481e)) {
                this.f36478b.setImageResource(iA3);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f36480d, new a(iA3));
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f36477a = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f36477a.setLayoutParams(layoutParams2);
            int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f36480d)) {
                this.f36477a.setImageResource(iA7);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f36480d, new b(iA7));
            }
            relativeLayout.addView(this.f36478b);
            relativeLayout.addView(this.f36477a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f36479c = new TextView(getContext());
            this.f36479c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f36479c.setText(this.f36482f);
            this.f36479c.setTextColor(-1);
            this.f36479c.setGravity(14);
            linearLayout.addView(this.f36479c);
            addView(linearLayout);
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }

    public void init(int i10) {
        this.f36483g = i10;
        init();
    }

    public void init(int i10, int i11) {
        this.f36484h = i10;
        this.f36483g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f36484h = i10;
        this.f36483g = i11;
        this.f36480d = str;
        this.f36481e = str2;
        this.f36482f = str3;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f36486j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f36487k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f36488l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f36489m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f36485i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e10) {
            q0.b("BaitClickView", e10.getMessage());
        }
    }

    public void startAnimation() {
        int i10 = this.f36483g;
        if (i10 == 2) {
            this.f36478b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f36478b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }
}

package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f40041v = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CampaignEx f40045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.splash.middle.d f40046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f40047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f40048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f40049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f40050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f40051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f40052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f40053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f40055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f40056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.mbridge.msdk.click.a f40057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f40058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f40059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f40060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnClickListener f40061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f40062u;

    public class a implements j {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int i10;
            int i11 = 0;
            if (BaseSplashPopView.this.f40044c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                int iA2 = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA;
                int iA3 = iA + v0.a(BaseSplashPopView.this.getContext(), 10.0f);
                i11 = iA2;
                i10 = iA3;
            } else {
                i10 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, i11, i10);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f40064a;

        public b(boolean z10) {
            this.f40064a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f40064a ? p0.b(bitmap) : p0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f40047f;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f40049h.setImageBitmap(a0.a(bitmap, 10));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.same.image.c {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f40048g.setImageBitmap(p0.a(bitmap, 1, 16));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f40053l != null) {
                if (BaseSplashPopView.this.f40054m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f40053l.setText(String.valueOf(BaseSplashPopView.this.f40054m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f40055n.postDelayed(baseSplashPopView.f40059r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f40054m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f40055n.removeCallbacks(baseSplashPopView2.f40059r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f40046e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f40042a, baseSplashPopView3.f40043b), 5);
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f40046e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f40042a, baseSplashPopView.f40043b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f40044c);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f40046e != null) {
                baseSplashPopView.b(baseSplashPopView.f40045d);
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f40054m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f40046e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f40042a, baseSplashPopView.f40043b), 4);
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f40073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CampaignEx f40075d;

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f40072a = str;
            this.f40073b = str2;
            this.f40074c = i10;
            this.f40075d = campaignEx;
        }

        public CampaignEx a() {
            return this.f40075d;
        }

        public String b() {
            return this.f40072a;
        }

        public String c() {
            return this.f40073b;
        }

        public int d() {
            return this.f40074c;
        }
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f40044c = 1;
        this.f40054m = -1;
        this.f40055n = new Handler();
        this.f40056o = false;
        this.f40058q = new a();
        this.f40059r = new e();
        this.f40060s = new f();
        this.f40061t = new g();
        this.f40062u = new h();
        this.f40044c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40044c = 1;
        this.f40054m = -1;
        this.f40055n = new Handler();
        this.f40056o = false;
        this.f40058q = new a();
        this.f40059r = new e();
        this.f40060s = new f();
        this.f40061t = new g();
        this.f40062u = new h();
        this.f40044c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40044c = 1;
        this.f40054m = -1;
        this.f40055n = new Handler();
        this.f40056o = false;
        this.f40058q = new a();
        this.f40059r = new e();
        this.f40060s = new f();
        this.f40061t = new g();
        this.f40062u = new h();
        this.f40044c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    @RequiresApi(api = 21)
    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f40044c = 1;
        this.f40054m = -1;
        this.f40055n = new Handler();
        this.f40056o = false;
        this.f40058q = new a();
        this.f40059r = new e();
        this.f40060s = new f();
        this.f40061t = new g();
        this.f40062u = new h();
        this.f40044c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f40044c = 1;
        this.f40054m = -1;
        this.f40055n = new Handler();
        this.f40056o = false;
        this.f40058q = new a();
        this.f40059r = new e();
        this.f40060s = new f();
        this.f40061t = new g();
        this.f40062u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f40043b = iVar.c();
        this.f40042a = iVar.b();
        this.f40044c = iVar.d();
        this.f40045d = iVar.a();
        this.f40046e = dVar;
        a();
    }

    private void a() {
        if (this.f40045d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f40044c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    private void a(String str, boolean z10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new b(z10));
    }

    private void b() {
        String language;
        this.f40050i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f40047f.getId());
        this.f40050i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            q0.b("MBSplashPopView", th2.getMessage());
            language = "ZH";
        }
        this.f40050i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f40050i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f40047f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f40047f.setId(generateViewId());
        this.f40047f.setLayoutParams(layoutParams2);
        this.f40047f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f40045d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f40045d.getIconUrl(), true);
        }
        this.f40053l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.f40053l.setId(generateViewId());
        this.f40053l.setTextSize(10.0f);
        this.f40053l.setTextColor(-1);
        this.f40053l.setGravity(17);
        this.f40053l.setMinWidth(v0.a(getContext(), 16.0f));
        this.f40053l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.f40053l.setLayoutParams(layoutParams3);
        this.f40053l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.f40053l);
        addView(this.f40047f);
        CampaignEx campaignEx2 = this.f40045d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f40045d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.f40045d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f40061t);
        this.f40053l.setOnClickListener(this.f40062u);
    }

    private void d() {
        this.f40049h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f40049h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f40049h.setId(generateViewId());
        this.f40049h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f40045d.getImageUrl());
        this.f40048g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f40048g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f40048g.setId(generateViewId());
        this.f40048g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f40045d.getImageUrl());
        this.f40047f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f40049h.getId());
        layoutParams3.topMargin = 20;
        this.f40047f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f40047f.setId(generateViewId());
        this.f40047f.setLayoutParams(layoutParams3);
        a(this.f40045d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f40047f.getId());
        layoutParams4.addRule(6, this.f40047f.getId());
        layoutParams4.addRule(8, this.f40047f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f40051j = textView;
        textView.setId(generateViewId());
        this.f40051j.setGravity(16);
        this.f40051j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f40051j.setTextSize(12.0f);
        this.f40051j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f40051j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f40051j.setMarqueeRepeatLimit(-1);
        this.f40051j.setSelected(true);
        this.f40051j.setSingleLine(true);
        this.f40051j.setText(this.f40045d.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f40052k = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f40051j.getId());
        layoutParams5.addRule(3, this.f40051j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.f40052k.setGravity(16);
        this.f40052k.setLayoutParams(layoutParams5);
        this.f40052k.setTextSize(8.0f);
        this.f40052k.setTextColor(-10066330);
        this.f40052k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f40052k.setMarqueeRepeatLimit(-1);
        this.f40052k.setSelected(true);
        this.f40052k.setSingleLine(true);
        this.f40052k.setText(this.f40045d.getAppDesc());
        relativeLayout.addView(this.f40051j);
        relativeLayout.addView(this.f40052k);
        addView(this.f40049h);
        addView(this.f40048g);
        addView(this.f40047f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f40045d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f40045d.getBidToken(), eVar, this.f40045d, this.f40043b).t(), this.f40045d.getLocalAllowTrackClick());
        setOnClickListener(this.f40061t);
    }

    private void e() {
        int iA = v0.a(getContext(), 4.0f);
        this.f40047f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f40047f.setId(generateViewId());
        this.f40047f.setLayoutParams(layoutParams);
        this.f40047f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f40047f.setPadding(iA, iA, iA, iA);
        a(this.f40045d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f40047f.getId());
        layoutParams2.addRule(6, this.f40047f.getId());
        layoutParams2.addRule(8, this.f40047f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f40051j = textView;
        textView.setId(generateViewId());
        this.f40051j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f40051j.setGravity(16);
        this.f40051j.setTextSize(12.0f);
        this.f40051j.setSelected(true);
        this.f40051j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f40051j.setMarqueeRepeatLimit(-1);
        this.f40051j.setSingleLine(true);
        this.f40051j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f40051j.setText(this.f40045d.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f40052k = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f40051j.getId());
        layoutParams3.addRule(3, this.f40051j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.f40052k.setGravity(16);
        this.f40052k.setLayoutParams(layoutParams3);
        this.f40052k.setTextSize(8.0f);
        this.f40052k.setTextColor(-10066330);
        this.f40052k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f40052k.setMarqueeRepeatLimit(-1);
        this.f40052k.setSelected(true);
        this.f40052k.setSingleLine(true);
        this.f40052k.setText(this.f40045d.getAppDesc());
        relativeLayout.addView(this.f40051j);
        relativeLayout.addView(this.f40052k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f40047f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f40045d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f40045d.getBidToken(), eVar, this.f40045d, this.f40043b).t(), this.f40045d.getLocalAllowTrackClick());
        setOnClickListener(this.f40061t);
    }

    private void f() {
        int iA = v0.a(getContext(), 4.0f);
        this.f40047f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f40047f.setId(generateViewId());
        this.f40047f.setLayoutParams(layoutParams);
        this.f40047f.setPadding(iA, iA, iA, iA);
        this.f40047f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f40045d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f40051j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f40047f.getId());
        layoutParams2.addRule(6, this.f40047f.getId());
        layoutParams2.addRule(8, this.f40047f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.f40051j.setLayoutParams(layoutParams2);
        this.f40051j.setGravity(16);
        this.f40051j.setTextSize(10.0f);
        this.f40051j.setSelected(true);
        this.f40051j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f40051j.setMarqueeRepeatLimit(-1);
        this.f40051j.setSingleLine(true);
        this.f40051j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f40051j.setText(this.f40045d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f40047f);
        addView(this.f40051j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f40045d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f40045d.getBidToken(), eVar, this.f40045d, this.f40043b).t(), this.f40045d.getLocalAllowTrackClick());
        setOnClickListener(this.f40061t);
    }

    public static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f40054m;
        baseSplashPopView.f40054m = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f40053l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.f40053l.setLayoutParams(layoutParams);
            this.f40053l.setText("");
            this.f40053l.setSelected(true);
            this.f40053l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f40041v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private void setBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new c());
    }

    private void setForegroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new d());
    }

    public void a(CampaignEx campaignEx) {
        if (this.f40057p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f40043b);
            this.f40057p = aVar;
            aVar.a(this.f40058q);
        }
        campaignEx.setCampaignUnitId(this.f40043b);
        this.f40057p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f40046e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f40042a, this.f40043b));
            this.f40046e.a(new MBridgeIds(this.f40042a, this.f40043b), 6);
        }
    }

    public void b(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f40043b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40046e != null) {
            postDelayed(this.f40060s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void pauseCountDown() {
        this.f40056o = true;
        if (this.f40053l != null) {
            this.f40055n.removeCallbacks(this.f40059r);
        }
    }

    public void reStartCountDown() {
        if (this.f40056o) {
            this.f40056o = false;
            int i10 = this.f40054m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.f40053l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f40055n.postDelayed(this.f40059r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f40055n.removeCallbacks(this.f40060s);
            this.f40055n.removeCallbacks(this.f40059r);
            this.f40059r = null;
            detachAllViewsFromParent();
            this.f40045d = null;
            this.f40046e = null;
        } catch (Exception e10) {
            q0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f40043b = iVar.c();
        this.f40042a = iVar.b();
        this.f40044c = iVar.d();
        this.f40045d = iVar.a();
        this.f40046e = dVar;
        a();
    }

    public void startCountDown() {
        this.f40055n.removeCallbacks(this.f40059r);
        CampaignEx campaignEx = this.f40045d;
        if (campaignEx == null || this.f40044c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f40054m = flbSkipTime;
        TextView textView = this.f40053l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f40055n.postDelayed(this.f40059r, 1000L);
        }
    }
}

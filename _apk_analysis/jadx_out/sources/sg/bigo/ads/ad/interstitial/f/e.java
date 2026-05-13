package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.graphics.PointF;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f.b;
import sg.bigo.ads.common.h;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes10.dex */
public class e extends d {
    private final a F;
    private final a G;
    private final AtomicBoolean H;
    private boolean I;
    private final b.a J;
    private boolean K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f80930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RoundedFrameLayout f80936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f80937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f80938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f80939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f80940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f80941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f80942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f80943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f80944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f80945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f80946r;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$10, reason: invalid class name */
    public class AnonymousClass10 implements ValueCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup.MarginLayoutParams f80948a;

        public AnonymousClass10(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f80948a = marginLayoutParams;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Integer num) {
            this.f80948a.topMargin = num.intValue();
            e.this.f80936h.requestLayout();
            e.this.f80936h.getMeasuredWidth();
            e eVar = e.this;
            eVar.f(eVar.f80931c - this.f80948a.topMargin);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$2, reason: invalid class name */
    public class AnonymousClass2 implements ValueCallback<Void> {
        public AnonymousClass2() {
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Void r12) {
            e.e(e.this);
        }
    }

    public class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f80961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f80962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f80963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f80964e;

        private a() {
            this.f80961b = ViewConfiguration.get(e.this.L).getScaledTouchSlop();
        }

        public /* synthetic */ a(e eVar, byte b10) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
            /*
                r2 = this;
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                boolean r3 = r3.f()
                r0 = 0
                if (r3 != 0) goto L9b
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                java.util.concurrent.atomic.AtomicBoolean r3 = sg.bigo.ads.ad.interstitial.f.e.c(r3)
                boolean r3 = r3.get()
                if (r3 != 0) goto L17
                goto L9b
            L17:
                int r3 = r4.getAction()
                r1 = 1
                if (r3 == 0) goto L6b
                if (r3 == r1) goto L39
                r0 = 2
                if (r3 == r0) goto L28
                r4 = 3
                if (r3 == r4) goto L65
                goto L9a
            L28:
                float r3 = r4.getRawY()
                int r3 = (int) r3
                int r4 = r2.f80964e
                int r4 = r3 - r4
                r2.f80964e = r3
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                r3.c(r4)
                goto L9a
            L39:
                float r3 = r4.getRawX()
                float r4 = r4.getRawY()
                float r0 = r2.f80962c
                float r0 = r0 - r3
                float r3 = java.lang.Math.abs(r0)
                int r0 = r2.f80961b
                float r0 = (float) r0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 >= 0) goto L65
                float r3 = r2.f80963d
                float r3 = r3 - r4
                float r3 = java.lang.Math.abs(r3)
                int r4 = r2.f80961b
                float r4 = (float) r4
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L65
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                int r4 = r3.f80933e
                sg.bigo.ads.ad.interstitial.f.e.c(r3, r4)
                goto L9a
            L65:
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                r3.g()
                goto L9a
            L6b:
                float r3 = r4.getRawX()
                r2.f80962c = r3
                float r3 = r4.getRawY()
                r2.f80963d = r3
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                boolean r3 = r3.f()
                if (r3 == 0) goto L85
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                sg.bigo.ads.ad.interstitial.f.b r3 = r3.f80930b
                if (r3 != 0) goto L92
            L85:
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                r3.f()
                sg.bigo.ads.ad.interstitial.f.e r3 = sg.bigo.ads.ad.interstitial.f.e.this
                boolean r3 = sg.bigo.ads.ad.interstitial.f.e.g(r3)
                if (r3 != 0) goto L93
            L92:
                return r0
            L93:
                float r3 = r4.getRawY()
                int r3 = (int) r3
                r2.f80964e = r3
            L9a:
                return r1
            L9b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.f.e.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public e(@NonNull Activity activity) {
        b bVar;
        int i10;
        super(activity);
        this.H = new AtomicBoolean(true);
        byte b10 = 0;
        this.I = false;
        this.J = new b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.1
            @Override // sg.bigo.ads.ad.interstitial.f.b.a
            public final boolean a() {
                if (e.this.u()) {
                    return false;
                }
                e.this.d(0);
                return true;
            }
        };
        this.K = true;
        LandingPageStyleConfig landingPageStyleConfig = ((d) this).f80922a;
        if (landingPageStyleConfig != null) {
            int i11 = landingPageStyleConfig.f83417a;
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    bVar = new b(landingPageStyleConfig.f83419c, i11, landingPageStyleConfig.f83421e, landingPageStyleConfig.f83422f);
                    break;
                default:
                    bVar = new b(0, 1, landingPageStyleConfig.f83421e, landingPageStyleConfig.f83422f);
                    break;
            }
        } else {
            bVar = null;
        }
        this.f80930b = bVar;
        int iA = sg.bigo.ads.common.utils.e.a(this.L, 20);
        this.f80932d = iA;
        LandingPageStyleConfig landingPageStyleConfig2 = ((d) this).f80922a;
        this.f80931c = ((landingPageStyleConfig2 == null || (i10 = landingPageStyleConfig2.f83420d) <= 0) ? sg.bigo.ads.common.utils.e.c(this.L) - sg.bigo.ads.common.utils.e.a(this.L, 48) : i10) - iA;
        this.f80933e = 0;
        this.f80934f = (int) (this.f80931c * (1.0f - (bVar != null ? bVar.e() : 1.0f)));
        this.f80935g = sg.bigo.ads.common.utils.e.a(activity, 3);
        this.F = new a(this, b10);
        this.G = new a(this, b10);
        activity.setTheme(R.style.LandingPageStyle);
        aF();
        Window window = this.L.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = this.f80931c;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        activity.overridePendingTransition(0, 0);
    }

    public static /* synthetic */ void d(e eVar) {
        if (eVar.H.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((eVar.f80931c - ((ViewGroup.MarginLayoutParams) eVar.f80936h.getLayoutParams()).topMargin) * 1.5f) / eVar.f80935g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.4
                @Override // sg.bigo.ads.common.a.a
                public final void a(float f10, float f11, int i10, int i11) {
                    e.this.f((int) (i11 - f11));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    e.this.H.set(true);
                }
            };
            aVar.setDuration(jAbs);
            eVar.f80936h.startAnimation(aVar);
        }
    }

    public static /* synthetic */ boolean e(e eVar) {
        eVar.K = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i10) {
        View view;
        int i11 = this.f80931c;
        int i12 = i11 - this.f80934f;
        int i13 = this.f80932d;
        if (i10 == i11 && (view = this.f80938j) != null && !this.I) {
            this.I = true;
            view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new b.a());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(e.this.f80936h, transitionSet);
                    e.this.f80938j.setVisibility(8);
                }
            }, 500L);
        }
        b bVar = this.f80930b;
        if (bVar != null) {
            bVar.a(i10, i12, i11, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        int iMax = Math.max(this.f80933e, Math.min(this.f80934f, i10));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f80936h.getLayoutParams();
        if (marginLayoutParams.topMargin == iMax) {
            return;
        }
        long jAbs = (long) Math.abs(((iMax - r1) * 2.0f) / this.f80935g);
        this.K = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.8
            @Override // sg.bigo.ads.common.utils.b.a
            public final void a(Object obj, Object obj2) {
                RoundedFrameLayout roundedFrameLayout = e.this.f80936h;
                if (obj == roundedFrameLayout && (obj2 instanceof PointF)) {
                    PointF pointF = (PointF) obj2;
                    roundedFrameLayout.getMeasuredWidth();
                    float f10 = pointF.x;
                    e.this.f((int) (r2.f80931c - pointF.y));
                }
            }
        });
        transitionSet.setDuration(jAbs);
        transitionSet.addListener((Transition.TransitionListener) new h() { // from class: sg.bigo.ads.ad.interstitial.f.e.9
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                super.onTransitionEnd(transition);
                e.e(e.this);
            }
        });
        TransitionManager.beginDelayedTransition(this.f80936h, transitionSet);
        marginLayoutParams.topMargin = iMax;
        this.f80936h.requestLayout();
    }

    private boolean x() {
        WebView webView = this.B;
        if (webView == null) {
            return false;
        }
        return webView.canGoForward();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str) {
        super.a(str);
        this.A.setEnabled(v());
        this.f80943o.setEnabled(x());
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str, boolean z10) {
        super.a(str, z10);
        this.A.setEnabled(v());
        this.f80943o.setEnabled(x());
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean a(MotionEvent motionEvent) {
        return this.F.onTouch(this.B, motionEvent);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ah() {
        super.ah();
        this.L.overridePendingTransition(0, 0);
        b bVar = this.f80930b;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        String host;
        ImageView imageView;
        super.b();
        this.f80936h = (RoundedFrameLayout) p(R.id.inter_landpage_webview_page);
        this.f80937i = (RelativeLayout) p(R.id.inter_webview_top_bar);
        this.f80939k = (LinearLayout) p(R.id.inter_webview_top_action_bar);
        this.f80940l = (ImageView) p(R.id.inter_webview_open);
        this.f80941m = (TextView) p(R.id.inter_webview_host);
        this.f80946r = (ImageView) p(R.id.inter_webview_safe);
        this.f80938j = p(R.id.inter_webview_top_indicator);
        this.f80942n = (RelativeLayout) p(R.id.inter_webview_bottom_bar);
        this.f80943o = (ImageView) p(R.id.inter_webview_forward);
        this.f80944p = (ImageView) p(R.id.inter_webview_copy);
        this.f80945q = (ImageView) p(R.id.inter_webview_refresh);
        this.f80940l.setOnClickListener(this);
        this.f80943o.setOnClickListener(this);
        this.f80944p.setOnClickListener(this);
        this.f80945q.setOnClickListener(this);
        View viewP = p(R.id.inter_webview_top_middle);
        int i10 = 8;
        this.f80940l.setVisibility(c() ? 8 : 0);
        this.f80943o.setVisibility(c() ? 8 : 0);
        this.f80944p.setVisibility(c() ? 8 : 0);
        this.f80945q.setVisibility(c() ? 8 : 0);
        this.f80942n.setVisibility(c() ? 8 : 0);
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setVisibility(c() ? 8 : 0);
        }
        View view = this.f80938j;
        if (view != null) {
            view.setVisibility(c() ? 8 : 0);
        }
        if (viewP != null) {
            viewP.setVisibility(c() ? 8 : 0);
        }
        b bVar = this.f80930b;
        if (bVar != null) {
            this.f80937i.setLayoutDirection(bVar.f() ? 1 : 0);
        }
        this.f80939k.setLayoutDirection(this.f80937i.getLayoutDirection());
        this.f84053z.setLayoutDirection(0);
        this.f80940l.setLayoutDirection(0);
        this.f84052y.setLayoutDirection(0);
        this.f84051x.setLayoutDirection(0);
        this.f80941m.setLayoutDirection(0);
        this.f84051x.setMaxLines(1);
        float fA = sg.bigo.ads.common.utils.e.a(this.L, 16);
        this.f80936h.a(fA, fA, 0.0f, 0.0f);
        this.f84051x.setVisibility(8);
        this.f80941m.setVisibility(8);
        String str = this.C;
        boolean zIsHttpsUrl = URLUtil.isHttpsUrl(str);
        try {
            host = Uri.parse(str).getHost();
        } catch (Exception unused) {
            host = "";
        }
        this.f80941m.setText(host);
        if (q.a((CharSequence) host)) {
            this.f80941m.setVisibility(8);
            imageView = this.f80946r;
        } else {
            this.f80941m.setVisibility(0);
            imageView = this.f80946r;
            if (zIsHttpsUrl) {
                i10 = 0;
            }
        }
        imageView.setVisibility(i10);
        this.f80937i.setOnTouchListener(this.G);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f80936h.getLayoutParams();
        b bVar2 = this.f80930b;
        if (bVar2 != null) {
            marginLayoutParams.topMargin = bVar2.g() ? this.f80933e : this.f80934f;
        }
        this.f80936h.requestLayout();
        u.a(this.f80936h, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.f.e.7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.d(e.this);
            }
        });
        b bVar3 = this.f80930b;
        if ((bVar3 == null || bVar3.d() != 0) && !c()) {
            Drawable progressDrawable = this.f84052y.getProgressDrawable();
            if (progressDrawable instanceof LayerDrawable) {
                Drawable drawable = ((ClipDrawable) ((LayerDrawable) progressDrawable).findDrawableByLayerId(android.R.id.progress)).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    b bVar4 = this.f80930b;
                    gradientDrawable.setColors(new int[]{bVar4 != null ? bVar4.d() : -1, -1312769});
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(final int i10) {
        sg.bigo.ads.api.core.d dVar = this.E;
        if (dVar != null && dVar.f81846d == 4) {
            super.b(i10);
            return;
        }
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.6
            @Override // java.lang.Runnable
            public final void run() {
                e.super.b(i10);
            }
        };
        if (this.H.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((this.f80931c - ((ViewGroup.MarginLayoutParams) this.f80936h.getLayoutParams()).topMargin) * 1.5f) / this.f80935g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0.0f, 1.0f);
                }

                @Override // sg.bigo.ads.common.a.a
                public final void a(float f10, float f11, int i11, int i12) {
                    e.this.f((int) (i12 - f11));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            };
            aVar.setFillAfter(true);
            aVar.setDuration(jAbs);
            this.f80936h.startAnimation(aVar);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(String str) {
        super.b(str);
        TextView textView = this.f84051x;
        if (textView != null) {
            textView.setVisibility(q.a((CharSequence) str) ? 8 : 0);
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean b(MotionEvent motionEvent) {
        b bVar = this.f80930b;
        return bVar != null ? bVar.a(motionEvent, this.J) || super.b(motionEvent) : super.b(motionEvent);
    }

    public final void c(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f80936h.getLayoutParams();
        int iMin = Math.min(Math.max(this.f80933e, marginLayoutParams.topMargin + i10), this.f80934f);
        marginLayoutParams.topMargin = iMin;
        this.f80936h.requestLayout();
        this.f80936h.getMeasuredWidth();
        f(this.f80931c - iMin);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d() {
        super.d();
        b bVar = this.f80930b;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e() {
        super.e();
        b bVar = this.f80930b;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final boolean f() {
        return ((ViewGroup.MarginLayoutParams) this.f80936h.getLayoutParams()).topMargin <= this.f80933e;
    }

    public final void g() {
        float f10 = ((ViewGroup.MarginLayoutParams) this.f80936h.getLayoutParams()).topMargin;
        int i10 = this.f80934f;
        if (f10 <= i10 * 0.8f) {
            i10 = 0;
        }
        g(i10);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.api.b.h
    public final int h() {
        b bVar = this.f80930b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f80919c;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, android.view.View.OnClickListener
    public void onClick(View view) {
        WebView webView;
        super.onClick(view);
        if (view == this.f80940l) {
            sg.bigo.ads.core.landing.a.a(this.L, this.C, (JSONArray) null);
            return;
        }
        if (view == this.f80943o) {
            WebView webView2 = this.B;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.B.goForward();
            return;
        }
        if (view == this.f80944p) {
            if (sg.bigo.ads.common.utils.c.g(this.L, this.C)) {
                Activity activity = this.L;
                Toast.makeText(activity, sg.bigo.ads.common.utils.a.a(activity, R.string.bigo_ad_link_copied, new Object[0]), 0).show();
                return;
            }
            return;
        }
        if (view != this.f80945q || (webView = this.B) == null) {
            return;
        }
        webView.reload();
    }
}

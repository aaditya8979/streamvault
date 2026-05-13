package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;
import yads.hb2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hb2 extends wo implements m11, vc2, ml3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f90342k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tn3 f90343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f90344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nl3 f90345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wc2 f90346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wz2 f90347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o11 f90348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n11 f90349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f90350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f90351j;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hb2(Context context, tn3 tn3Var, AttributeSet attributeSet, int i10) {
        tn3 tn3Var2 = (i10 & 2) != 0 ? new tn3() : tn3Var;
        attributeSet = (i10 & 4) != 0 ? null : attributeSet;
        Context applicationContext = context.getApplicationContext();
        this(context, tn3Var2, attributeSet, applicationContext, new nl3(), wc2.f96340h.a(applicationContext));
    }

    public hb2(Context context, tn3 tn3Var, AttributeSet attributeSet, Context context2, nl3 nl3Var, wc2 wc2Var) {
        super(context2, attributeSet);
        this.f90343b = tn3Var;
        this.f90344c = context2;
        this.f90345d = nl3Var;
        this.f90346e = wc2Var;
        this.f90347f = new wz2();
        a(context);
        if (f90342k) {
            return;
        }
        f90342k = true;
    }

    public static final void a(hb2 hb2Var) {
        hb2Var.e();
    }

    public void a() {
        wz2 wz2Var = this.f90347f;
        Runnable runnable = new Runnable() { // from class: bt.k2
            @Override // java.lang.Runnable
            public final void run() {
                hb2.a(this.f6113b);
            }
        };
        synchronized (wz2Var.f96568a) {
            if (wz2Var.f96569b) {
                return;
            }
            wz2Var.f96569b = true;
            bn.r rVar = bn.r.f5635a;
            runnable.run();
        }
    }

    public void a(int i10) {
        n11 n11Var = this.f90349h;
        if (n11Var != null) {
            n11Var.a(i10);
        }
    }

    public final void a(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        int i10 = 1;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        Object obj = dw2.f89000j;
        cw2.a();
        synchronized (dw2.f89000j) {
        }
        int iOrdinal = this.f90343b.f95300a.ordinal();
        if (iOrdinal == 0) {
            i10 = -1;
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                i10 = 3;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 2;
            }
        }
        settings.setCacheMode(i10);
        WebSettings settings2 = getSettings();
        if (ub.a(21)) {
            settings2.setMixedContentMode(2);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new l11(this, cs2.b()));
        setWebChromeClient(new i11());
    }

    public void a(Context context, String str) {
        o11 o11Var = this.f90348g;
        if (o11Var != null) {
            o11Var.a(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // yads.vc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.rc2 r2) {
        /*
            r1 = this;
            yads.rc2 r0 = yads.rc2.f94373c
            if (r2 != r0) goto L5
            goto L1a
        L5:
            yads.nl3 r2 = r1.f90345d
            r2.getClass()
            boolean r2 = yads.nl3.a(r1)
            if (r2 == 0) goto L1a
            yads.wc2 r2 = r1.f90346e
            boolean r2 = r2.a()
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hb2.a(yads.rc2):void");
    }

    public final void a(boolean z10) {
        if (this.f90350i != z10) {
            this.f90350i = z10;
            o11 o11Var = this.f90348g;
            if (o11Var != null) {
                o11Var.a(z10);
            }
        }
    }

    @Override // yads.wo
    public final String b() {
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + sn3.a();
    }

    @Override // yads.wo
    public final void c() {
        setHtmlWebViewListener(null);
        super.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o11 o11Var;
        if (motionEvent != null && motionEvent.getAction() == 0 && (o11Var = this.f90348g) != null) {
            o11Var.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void e();

    public final Context f() {
        return this.f90344c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f90351j = true;
        this.f90346e.a(this);
        this.f90345d.getClass();
        a(nl3.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f90351j = false;
        this.f90345d.getClass();
        a(nl3.a(this));
        this.f90346e.b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.f90345d.getClass();
        a(nl3.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f90345d.getClass();
        a(nl3.a(this));
    }

    public final void setHtmlWebViewErrorListener(@Nullable n11 n11Var) {
        this.f90349h = n11Var;
    }

    public void setHtmlWebViewListener(@Nullable o11 o11Var) {
        this.f90348g = o11Var;
    }
}

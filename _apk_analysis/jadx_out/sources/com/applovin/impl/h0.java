package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f8399i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f8403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f8404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f8405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f8406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HandlerThread f8407q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f8409s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f8400j = new WeakReference(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f8408r = new Runnable() { // from class: com.applovin.impl.va
        @Override // java.lang.Runnable
        public final void run() {
            this.f10554b.a();
        }
    };

    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.h0.d
        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / h0.this.f8397g;
                int i11 = height / h0.this.f8397g;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (h0.this.a(pixel)) {
                            bitmap.recycle();
                            h0.this.j();
                            h0.this.g();
                            return;
                        }
                        if (h0.this.f8403m == null) {
                            h0.this.f8403m = Integer.valueOf(pixel);
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.this.g();
            } catch (Exception e10) {
                h0.this.f8391a.D().a("BlackViewDetector", "onScreenshotCaptured", e10);
                h0.this.k();
            }
        }

        @Override // com.applovin.impl.h0.d
        public void a(boolean z10) {
            if (z10) {
                h0.this.k();
            } else {
                h0.this.g();
            }
        }
    }

    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f8411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap f8412b;

        public b(d dVar, Bitmap bitmap) {
            this.f8411a = dVar;
            this.f8412b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f8411a.a(this.f8412b);
                return;
            }
            com.applovin.impl.sdk.o unused = h0.this.f8392b;
            if (com.applovin.impl.sdk.o.a()) {
                h0.this.f8392b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f8411a.a(true);
        }
    }

    public interface c {
        void a(int i10, int i11);

        void a(int i10, int i11, int i12);
    }

    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public h0(com.applovin.impl.sdk.k kVar) {
        this.f8391a = kVar;
        this.f8392b = kVar.O();
        this.f8393c = ((Long) kVar.a(x4.f10761j6)).longValue();
        this.f8394d = ((Long) kVar.a(x4.f10752i6)).longValue();
        this.f8397g = ((Integer) kVar.a(x4.f10770k6)).intValue();
        this.f8398h = ((Integer) kVar.a(x4.f10779l6)).intValue();
        this.f8399i = ((Integer) kVar.a(x4.f10788m6)).intValue();
        this.f8395e = ((Integer) kVar.a(x4.f10836s6)).intValue();
        this.f8396f = ((Integer) kVar.a(x4.f10844t6)).intValue();
    }

    public static /* synthetic */ int a(h0 h0Var) {
        int i10 = h0Var.f8402l;
        h0Var.f8402l = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f8400j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l10 = (Long) this.f8391a.a(x4.f10820q6);
        if (l10.longValue() > 0 && (memoryInfoA = n7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY))) != null && memoryInfoA.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f8391a.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8392b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8392b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    private void a(View view, d dVar) {
        if (!o0.g()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
            }
            dVar.a(true);
            return;
        }
        Activity activityA = this.f8391a.e().a();
        if (activityA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
            }
            dVar.a(false);
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th2);
            }
            dVar.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.f8403m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4e
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f8403m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f8403m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f8399i
            if (r2 > r7) goto L4c
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f8399i
            if (r2 > r5) goto L4c
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f8399i
            if (r2 <= r5) goto L4e
        L4c:
            r2 = r3
            goto L4f
        L4e:
            r2 = r4
        L4f:
            int r5 = r8.f8398h
            if (r0 > r5) goto L5b
            if (r1 > r5) goto L5b
            if (r9 > r5) goto L5b
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r3 = r4
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h0.a(int):boolean");
    }

    private void c() {
        if (this.f8401k >= this.f8396f && !this.f8405o) {
            this.f8405o = true;
            h();
        }
        if (this.f8401k < this.f8395e || this.f8404n) {
            return;
        }
        this.f8404n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f8409s;
        if (cVar != null) {
            cVar.a(this.f8395e, this.f8401k, this.f8402l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f8409s;
        if (cVar != null) {
            cVar.a(this.f8401k, this.f8402l);
        }
    }

    public static /* synthetic */ int f(h0 h0Var) {
        int i10 = h0Var.f8401k;
        h0Var.f8401k = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f8409s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f8393c <= 0) {
            if (this.f8401k == 1) {
                if (!this.f8405o) {
                    this.f8405o = true;
                    h();
                }
                if (!this.f8404n) {
                    this.f8404n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f8406p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f8404n && this.f8405o) {
            k();
        } else {
            this.f8406p.postDelayed(this.f8408r, this.f8393c);
        }
    }

    private void h() {
        View view = (View) this.f8400j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8392b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ua
            @Override // java.lang.Runnable
            public final void run() {
                this.f10497b.d();
            }
        });
    }

    private void i() {
        View view = (View) this.f8400j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8392b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.xa
            @Override // java.lang.Runnable
            public final void run() {
                this.f10903b.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f8401k = 0;
        this.f8403m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f8400j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.a("BlackViewDetector", "Stopped monitoring view: " + this.f8400j.get());
            }
            this.f8400j.clear();
        }
        Handler handler = this.f8406p;
        if (handler != null) {
            handler.removeCallbacks(this.f8408r);
            this.f8406p = null;
        }
        if (this.f8409s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10648b.f();
                }
            });
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f8391a.a(x4.f10743h6)).booleanValue()) {
            View view2 = (View) this.f8400j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8392b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8392b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f8407q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f8407q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f8391a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f8409s = cVar;
                this.f8400j = new WeakReference(view);
                j();
                this.f8404n = false;
                this.f8405o = false;
                Handler handler = new Handler(this.f8407q.getLooper());
                this.f8406p = handler;
                handler.postDelayed(this.f8408r, this.f8394d);
            } catch (Throwable th2) {
                k();
                this.f8391a.D().a("BlackViewDetector", "maybeStartMonitoring", th2);
            }
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f8407q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f8407q = null;
        }
    }
}

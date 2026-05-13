package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8358a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f8362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f8363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f8364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f8365h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f8369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f8370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f8371n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8359b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f8360c = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference f8366i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f8367j = new WeakReference(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f8372o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f8361d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public g8(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f8358a = kVar.O();
        this.f8365h = ((Long) kVar.a(x4.f10879y1)).longValue();
        this.f8364g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f8362e = new Runnable() { // from class: com.applovin.impl.ra
            @Override // java.lang.Runnable
            public final void run() {
                this.f9785b.a(weakReference);
            }
        };
        this.f8363f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sa
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f9845b.a(view);
            }
        };
    }

    private void a() {
        this.f8361d.postDelayed(this.f8362e, this.f8365h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f8364g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f8367j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8358a.a(VisibilityTracker.TAG, "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.f8372o == Long.MIN_VALUE) {
            this.f8372o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f8372o >= this.f8371n;
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f8366i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f8363f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f8363f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8358a.a(VisibilityTracker.TAG, "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8358a.a(VisibilityTracker.TAG, "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f8366i.clear();
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f8360c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8360c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8360c.height());
        if (jPxToDp < this.f8368k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f8369l) {
            return false;
        }
        return (((float) ((long) (this.f8360c.width() * this.f8360c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f8370m;
    }

    private void c(View view) {
        View viewB = e8.b((View) this.f8364g.get());
        if (viewB == null) {
            viewB = e8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8358a.a(VisibilityTracker.TAG, "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f8366i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f8363f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8358a.k(VisibilityTracker.TAG, "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f8359b) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8358a.a(VisibilityTracker.TAG, "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.f8367j = weakReference;
            this.f8368k = i10;
            this.f8369l = f10;
            this.f8370m = f11;
            this.f8371n = j10;
            c((View) weakReference.get());
        }
    }

    public void a(h3 h3Var) {
        View viewS0;
        if (h3Var instanceof b3) {
            viewS0 = h3Var.y();
        } else if (!(h3Var instanceof d3)) {
            return;
        } else {
            viewS0 = ((d3) h3Var).s0();
        }
        a(h3Var.k0(), h3Var.m0(), h3Var.n0(), h3Var.o0(), viewS0);
    }

    public void b() {
        synchronized (this.f8359b) {
            this.f8361d.removeMessages(0);
            b((View) this.f8364g.get());
            this.f8372o = Long.MIN_VALUE;
            this.f8367j.clear();
        }
    }
}

package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f8215a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8216b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8217c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8218d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f8219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f8220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f8221g;

    public interface a {
        void a(int i10, int i11);
    }

    public e5(View view) {
        this.f8219e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f8220f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.z9
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f11077b.b();
            }
        };
        this.f8220f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f8216b) {
            this.f8218d = false;
            int iMin = -1;
            int iMax = -1;
            for (Map.Entry entry : this.f8215a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (iMin == -1 && iMax == -1) {
                        iMin = num.intValue();
                        iMax = num.intValue();
                    } else {
                        iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                        iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.f8221g;
            if (aVar != null) {
                aVar.a(iMin, iMax);
            }
        }
    }

    private void d() {
        if (this.f8218d) {
            return;
        }
        this.f8218d = true;
        this.f8217c.postDelayed(new Runnable() { // from class: com.applovin.impl.y9
            @Override // java.lang.Runnable
            public final void run() {
                this.f10976b.c();
            }
        }, 100L);
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f8221g = null;
        View view = (View) this.f8219e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f8220f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f8219e.clear();
        }
    }

    public void a(View view, int i10) {
        synchronized (this.f8216b) {
            this.f8215a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    public void a(a aVar) {
        this.f8221g = aVar;
    }

    public void b(View view) {
        synchronized (this.f8216b) {
            this.f8215a.remove(view);
        }
    }
}

package io.bidmachine.rendering.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import io.bidmachine.iab.utils.VisibilityTracker;
import io.bidmachine.rendering.internal.b0;
import io.bidmachine.rendering.model.VisibilityParams;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.ViewUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f70194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VisibilityParams f70195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0.a f70196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f70197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f70198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f70199f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f70200g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f70201h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f70202i = new AtomicBoolean(false);

    public class b implements n {
        private b() {
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public void onRun() {
            if (c0.this.c()) {
                return;
            }
            c0.this.d();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public void onThrows(Throwable th2) {
            super.onThrows(th2);
            c0.this.d();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public class c implements ViewTreeObserver.OnPreDrawListener {
        private c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c0.this.h();
            return true;
        }
    }

    public c0(View view, VisibilityParams visibilityParams, b0.a aVar) {
        this.f70194a = new WeakReference(view);
        this.f70195b = visibilityParams;
        this.f70196c = aVar;
        this.f70197d = new b();
        this.f70198e = new c();
    }

    private View a(View view) {
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
        }
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v9 */
    private boolean a(View view, float f10, boolean z10, boolean z11) {
        ?? r02 = view;
        try {
        } catch (Exception e10) {
            o.b(e10);
        }
        if (!view.isShown()) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: view visibility verification failed - %s", new Object[]{r02});
            return false;
        }
        if (UiUtils.isViewTransparent(view)) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: view transparent verification failed - %s", new Object[]{r02});
            return false;
        }
        if (!z10 && !view.hasWindowFocus()) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: window focus verification failed - %s", new Object[]{r02});
            return false;
        }
        float width = view.getWidth() * view.getHeight();
        if (width == 0.0f) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: view size verification failed - %s", new Object[]{r02});
            return false;
        }
        Rect rect = new Rect();
        if (!r02.getGlobalVisibleRect(rect)) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: global visibility verification failed - %s", new Object[]{r02});
            return false;
        }
        float fWidth = (rect.width() * rect.height()) / width;
        if (fWidth < f10) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: ad view not completely visible (%s / %s) - %s", new Object[]{Float.valueOf(fWidth), Float.valueOf(f10), r02});
            return false;
        }
        View viewA = a(view);
        if (viewA == null) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: content or root layout not found - %s", new Object[]{r02});
            return false;
        }
        Rect rect2 = new Rect();
        viewA.getGlobalVisibleRect(rect2);
        if (!Rect.intersects(rect, rect2)) {
            o.b(VisibilityTracker.TAG, "Show wasn't tracked: ad view is out of current window - %s", new Object[]{r02});
            return false;
        }
        if (!z11) {
            ViewGroup viewGroup = (ViewGroup) view.getRootView();
            ?? r62 = (ViewGroup) view.getParent();
            int i10 = 0;
            while (r62 != 0) {
                for (int iIndexOfChild = r62.indexOfChild(r02) + 1; iIndexOfChild < r62.getChildCount(); iIndexOfChild++) {
                    View childAt = r62.getChildAt(iIndexOfChild);
                    if (ViewUtils.isViewVisible(childAt)) {
                        Rect locationInWindow = UiUtils.getLocationInWindow(childAt);
                        if (Rect.intersects(rect, locationInWindow)) {
                            float notOverlappedAreaPercent = UiUtils.getNotOverlappedAreaPercent(rect, locationInWindow);
                            if (notOverlappedAreaPercent < f10) {
                                o.b(VisibilityTracker.TAG, "Show wasn't tracked: ad view is covered by another view (visible percent - %s / %s, ad view - %s, overlapping view - %s)", new Object[]{Float.valueOf(notOverlappedAreaPercent), Float.valueOf(f10), r02, childAt});
                                return false;
                            }
                            i10++;
                            if (i10 >= 3) {
                                o.b(VisibilityTracker.TAG, "Show wasn't tracked: ad view is covered by too many views (overlapping views count - %s, ad view - %s)", new Object[]{Integer.valueOf(i10), r02});
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (r62 != viewGroup) {
                    ?? r14 = r62;
                    r62 = (ViewGroup) r62.getParent();
                    r02 = r14;
                } else {
                    r62 = 0;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        View viewE = e();
        if (viewE == null) {
            stop();
            return true;
        }
        if (a(viewE, this.f70195b.getVisibilityPercent(), this.f70195b.getIsIgnoreWindowFocus(), this.f70195b.getIsIgnoreOverlap())) {
            f();
            return false;
        }
        g();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f70201h.set(false);
        h();
    }

    private void f() {
        if (this.f70202i.compareAndSet(false, true)) {
            this.f70196c.a();
        }
    }

    private void g() {
        if (this.f70202i.compareAndSet(true, false)) {
            this.f70196c.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f70201h.compareAndSet(false, true)) {
            UiUtils.cancelOnUiThread(this.f70197d);
            UiUtils.onUiThread(this.f70197d, 100L);
        }
    }

    @Override // io.bidmachine.rendering.internal.b0
    public void a() {
        stop();
        this.f70194a.clear();
    }

    @Override // io.bidmachine.rendering.internal.b0
    public boolean b() {
        return this.f70202i.get();
    }

    public View e() {
        return (View) this.f70194a.get();
    }

    @Override // io.bidmachine.rendering.internal.b0
    public void start() {
        synchronized (this.f70199f) {
            if (this.f70200g.compareAndSet(false, true)) {
                View viewE = e();
                if (viewE == null) {
                    stop();
                    return;
                }
                o.b(VisibilityTracker.TAG, "Start tracking - %s", viewE);
                ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f70198e);
                }
            }
        }
    }

    @Override // io.bidmachine.rendering.internal.b0
    public void stop() {
        synchronized (this.f70199f) {
            this.f70200g.set(false);
            View viewE = e();
            if (viewE != null) {
                o.b(VisibilityTracker.TAG, "Stop tracking - %s", viewE);
                ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f70198e);
                }
            }
            UiUtils.cancelOnUiThread(this.f70197d);
            this.f70201h.set(false);
            this.f70202i.set(false);
        }
    }
}

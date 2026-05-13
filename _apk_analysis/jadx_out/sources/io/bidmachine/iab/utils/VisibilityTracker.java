package io.bidmachine.iab.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidUtils;

/* JADX INFO: loaded from: classes10.dex */
public class VisibilityTracker {

    @NonNull
    public static final String TAG = "VisibilityTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f69436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f69437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callback f69438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f69439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f69440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f69441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f69442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f69443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnAttachStateChangeListener f69444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f69447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f69448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69449n;

    public interface Callback {
        void onVisibilityChanged(boolean z10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisibilityTracker.this.a();
            VisibilityTracker.this.f69447l = false;
        }
    }

    public class b implements ViewTreeObserver.OnPreDrawListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            VisibilityTracker.this.b();
            return true;
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            VisibilityTracker.this.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            VisibilityTracker.this.a();
        }
    }

    public VisibilityTracker(@NonNull Context context, @NonNull View view, @NonNull Callback callback) {
        this(context, view, callback, 0.1f);
    }

    public VisibilityTracker(@NonNull Context context, @NonNull View view, @NonNull Callback callback, float f10) {
        this.f69445j = false;
        this.f69446k = false;
        this.f69447l = false;
        this.f69448m = false;
        this.f69449n = false;
        this.f69436a = context;
        this.f69437b = view;
        this.f69438c = callback;
        this.f69439d = f10;
        this.f69440e = new Rect();
        this.f69441f = new Rect();
        this.f69442g = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (this.f69437b.getVisibility() != 0) {
            a(this.f69437b, "Visibility != View.VISIBLE");
            return;
        }
        if (this.f69437b.getParent() == null) {
            a(this.f69437b, "No parent");
            return;
        }
        if (!this.f69437b.getGlobalVisibleRect(this.f69440e)) {
            a(this.f69437b, "Can't get global visible rect");
            return;
        }
        if (Utils.isViewTransparent(this.f69437b)) {
            a(this.f69437b, "View is transparent (alpha = 0)");
            return;
        }
        float width = this.f69437b.getWidth() * this.f69437b.getHeight();
        if (width <= 0.0f) {
            a(this.f69437b, "Ad View width or height is zero, show wasn't tracked");
            return;
        }
        float fWidth = (this.f69440e.width() * this.f69440e.height()) / width;
        if (fWidth < this.f69439d) {
            a(this.f69437b, "Ad View is not completely visible (" + fWidth + "), show wasn't tracked");
            return;
        }
        View topmostView = MraidUtils.getTopmostView(this.f69436a, this.f69437b);
        if (topmostView == null) {
            a(this.f69437b, "Can't obtain root view");
            return;
        }
        topmostView.getGlobalVisibleRect(this.f69441f);
        if (!Rect.intersects(this.f69440e, this.f69441f)) {
            a(this.f69437b, "Ad View is out of current window, show wasn't tracked");
            return;
        }
        a(this.f69437b);
    }

    private void a(View view) {
        this.f69446k = false;
        a(true);
    }

    private void a(View view, String str) {
        if (!this.f69446k) {
            this.f69446k = true;
            MraidLog.d(TAG, str, new Object[0]);
        }
        a(false);
    }

    private void a(boolean z10) {
        if (this.f69445j != z10) {
            this.f69445j = z10;
            this.f69438c.onVisibilityChanged(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f69447l) {
            return;
        }
        this.f69447l = true;
        Utils.onUiThread(this.f69442g, 100L);
    }

    public boolean isVisible() {
        return this.f69445j;
    }

    public void release() {
        this.f69449n = true;
        this.f69448m = false;
        this.f69447l = false;
        this.f69437b.getViewTreeObserver().removeOnPreDrawListener(this.f69443h);
        this.f69437b.removeOnAttachStateChangeListener(this.f69444i);
        Utils.cancelOnUiThread(this.f69442g);
    }

    public void start() {
        if (this.f69449n || this.f69448m) {
            return;
        }
        this.f69448m = true;
        if (this.f69443h == null) {
            this.f69443h = new b();
        }
        if (this.f69444i == null) {
            this.f69444i = new c();
        }
        this.f69437b.getViewTreeObserver().addOnPreDrawListener(this.f69443h);
        this.f69437b.addOnAttachStateChangeListener(this.f69444i);
        a();
    }
}

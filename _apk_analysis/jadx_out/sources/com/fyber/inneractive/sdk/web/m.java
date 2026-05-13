package com.fyber.inneractive.sdk.web;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes4.dex */
public class m extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f19680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f19681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f19682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19684g;

    public m() {
        super(IAConfigManager.O.f15976v.a());
        this.f19678a = false;
        this.f19682e = new com.fyber.inneractive.sdk.util.g1();
    }

    public final void a() {
        if (IAConfigManager.O.f15975u.f16144b.a(false, "update_v_mth")) {
            com.fyber.inneractive.sdk.util.r.f19556b.post(new k(this));
        } else {
            b();
        }
    }

    public final void a(String str) {
        IAlog.a("injecting JS: %s", str);
        if (str != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadUrl(this, SafeDKWebAppInterface.f52902f.concat(str));
            } catch (Throwable th2) {
                IAlog.a("Failed to inject JS", th2, new Object[0]);
            }
        }
    }

    public final void a(boolean z10) {
        if (z10) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.e("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z10 = false;
                }
            } else {
                IAlog.e("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f19679b != z10) {
            this.f19679b = z10;
            l lVar = this.f19680c;
            if (lVar != null) {
                lVar.a(z10);
            }
        }
    }

    public final void b() {
        boolean z10 = false;
        IAlog.e("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f19678a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f19678a) {
                z10 = true;
            }
            a(z10);
            return;
        }
        boolean z11 = isShown() && this.f19678a;
        if (IAConfigManager.O.f15975u.f16144b.a(false, "ignore_w_f")) {
            z10 = z11;
        } else if (z11 && hasWindowFocus()) {
            z10 = true;
        }
        a(z10);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f19680c = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getHeightDp() {
        return this.f19684g;
    }

    public boolean getIsVisible() {
        return this.f19679b;
    }

    public com.fyber.inneractive.sdk.util.g1 getLastClickedLocation() {
        return this.f19682e;
    }

    public int getWidthDp() {
        return this.f19683f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19678a) {
            return;
        }
        this.f19678a = true;
        l lVar = this.f19680c;
        if (lVar != null) {
            lVar.b();
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19679b = false;
        if (this.f19678a) {
            this.f19678a = false;
            l lVar = this.f19680c;
            if (lVar != null) {
                lVar.c();
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, x10, y10, 0));
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, x10, y10, 0));
        }
        y0 y0Var = this.f19681d;
        if (y0Var != null) {
            y0Var.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            com.fyber.inneractive.sdk.util.g1 g1Var = this.f19682e;
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            g1Var.f19528a = x11;
            g1Var.f19529b = y11;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.e("onWindowFocusChanged with: %s", Boolean.valueOf(z10));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 8) {
            a(false);
        } else {
            a();
        }
    }

    public void setHeightDp(int i10) {
        this.f19684g = i10;
    }

    public void setListener(l lVar) {
        this.f19680c = lVar;
    }

    public void setTapListener(x0 x0Var) {
        this.f19681d = new y0(x0Var, IAConfigManager.O.f15976v.a());
    }

    public void setWidthDp(int i10) {
        this.f19683f = i10;
    }
}

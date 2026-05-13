package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.B7;
import com.ironsource.C3978d4;
import com.ironsource.C4228r4;
import com.ironsource.C4294v2;
import com.ironsource.Lb;
import com.ironsource.Qc;
import com.ironsource.sdk.controller.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes3.dex */
public class h extends FrameLayout implements Qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f33735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B7 f33736c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f33736c = Lb.U().i();
        this.f33734a = context;
        setClickable(true);
    }

    private void a() {
        ((Activity) this.f33734a).runOnUiThread(new a());
    }

    private void a(int i10, int i11) {
        try {
            Context context = this.f33734a;
            if (context != null) {
                int iZ = this.f33736c.z(context);
                if (iZ == 1) {
                    setPadding(0, i10, 0, i11);
                } else if (iZ == 2) {
                    setPadding(0, i10, i11, 0);
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    private void b() {
        ((Activity) this.f33734a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f33734a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f33736c.z(activity) == 1) {
                int i10 = rect.bottom - rect2.bottom;
                if (i10 > 0) {
                    return i10;
                }
                return 0;
            }
            int i11 = rect.right - rect2.right;
            if (i11 > 0) {
                return i11;
            }
            return 0;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return 0;
        }
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f33734a;
            if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return this.f33734a.getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
        return 0;
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f33734a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f33734a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public void a(v vVar) {
        this.f33735b = vVar;
        vVar.a(this);
        this.f33735b.E();
        this.f33734a = this.f33735b.p();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33735b.F();
        this.f33735b.b(true, C3978d4.i.Z);
    }

    @Override // com.ironsource.Qc
    public boolean onBackButtonPressed() {
        return C4294v2.a().a((Activity) this.f33734a);
    }

    @Override // com.ironsource.Qc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33735b.B();
        this.f33735b.b(false, C3978d4.i.Z);
        v vVar = this.f33735b;
        if (vVar != null) {
            vVar.a(v.EnumC0405v.Gone);
            this.f33735b.C();
            this.f33735b.D();
        }
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.ironsource.Qc
    public void onOrientationChanged(String str, int i10) {
    }
}

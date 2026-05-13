package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.A8;
import com.ironsource.B7;
import com.ironsource.C3921a1;
import com.ironsource.C3978d4;
import com.ironsource.C4024fe;
import com.ironsource.C4098k;
import com.ironsource.C4116l;
import com.ironsource.C4216q8;
import com.ironsource.C4228r4;
import com.ironsource.C4294v2;
import com.ironsource.C4300v8;
import com.ironsource.G5;
import com.ironsource.InterfaceC4153mg;
import com.ironsource.Lb;
import com.ironsource.Og;
import com.ironsource.Qc;
import com.ironsource.S9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ControllerActivity extends Activity implements Qc, InterfaceC4153mg {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f33534o = "ControllerActivity";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f33535p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f33536q = "removeWebViewContainerView | mContainer is null";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f33537r = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f33539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f33540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f33541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private B7 f33542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedCallback f33543f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33545h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3921a1 f33549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33551n;
    public int currentRequestedRotation = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33544g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f33546i = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f33547j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RelativeLayout.LayoutParams f33548k = new RelativeLayout.LayoutParams(-1, -1);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f33544g));
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f33546i.removeCallbacks(controllerActivity.f33547j);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f33546i.postDelayed(controllerActivity2.f33547j, 500L);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private View a(ViewGroup viewGroup) {
        return e() ? viewGroup.findViewById(1) : C4216q8.a().a(this.f33538a).getPresentingView();
    }

    private FrameLayout a(String str) {
        return !b(str) ? this.f33539b.r() : Og.a(getApplicationContext(), C4216q8.a().a(str).getPresentingView());
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f33543f = new OnBackInvokedCallback() { // from class: com.ironsource.sdk.controller.w
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    this.f34003a.g();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f33543f);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void a(String str, int i10) {
        if (str != null) {
            if (C3978d4.i.C.equalsIgnoreCase(str)) {
                j();
                return;
            }
            if (C3978d4.i.D.equalsIgnoreCase(str)) {
                k();
                return;
            }
            if (C3978d4.i.G.equalsIgnoreCase(str)) {
                if (this.f33542e.w(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private void b() {
        runOnUiThread(new d());
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        String str = f33534o;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f33539b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.EnumC0405v.Gone);
        this.f33539b.C();
        this.f33539b.D();
        this.f33539b.g(this.f33545h, "onDestroy");
    }

    private void d() {
        Intent intent = getIntent();
        a(intent.getStringExtra(C3978d4.i.A), intent.getIntExtra(C3978d4.i.B, 0));
    }

    private boolean e() {
        return this.f33538a == null;
    }

    private void f() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Logger.i(f33534o, "OnBackInvokedCallback");
        if (C4294v2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    private void h() {
        if (Build.VERSION.SDK_INT < 33 || this.f33543f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f33543f);
            Logger.i(f33534o, "OnBackInvokedCallback unregistered");
            this.f33543f = null;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e10);
        }
    }

    private void i() {
        ViewGroup viewGroup;
        try {
            if (this.f33540c == null) {
                throw new Exception(f33536q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f33541d.getParent();
            View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new Exception(f33537r);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.f33541d);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            A8.a(C4024fe.f31724s, new C4300v8().a(G5.A, e10.getMessage()).a());
            Logger.i(f33534o, "removeWebViewContainerView fail " + e10.getMessage());
        }
    }

    private void j() {
        int iK = this.f33542e.K(this);
        String str = f33534o;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iK == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iK != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void k() {
        int iK = this.f33542e.K(this);
        String str = f33534o;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iK == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iK != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53132f, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.ironsource.Qc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f33534o, "onBackPressed");
        if (C4294v2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.Qc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33542e = Lb.U().i();
        try {
            new C4116l(this).a();
            new C4098k(this).a();
            v vVar = (v) S9.b((Context) this).a().k();
            this.f33539b = vVar;
            vVar.r().setId(1);
            this.f33539b.a((Qc) this);
            this.f33539b.a((InterfaceC4153mg) this);
            Intent intent = getIntent();
            this.f33545h = intent.getStringExtra(C3978d4.i.f31349m);
            this.f33544g = intent.getBooleanExtra("immersive", false);
            this.f33538a = intent.getStringExtra("adViewId");
            this.f33550m = false;
            this.f33551n = intent.getBooleanExtra(C3978d4.i.f31376z0, false);
            if (this.f33544g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f33547j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f33540c = relativeLayout;
            setContentView(relativeLayout, this.f33548k);
            this.f33541d = a(this.f33538a);
            if (this.f33540c.findViewById(1) == null && this.f33541d.getParent() != null) {
                finish();
            }
            d();
            this.f33540c.addView(this.f33541d, this.f33548k);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String str = f33534o;
        Logger.i(str, "onDestroy");
        h();
        i();
        if (this.f33550m) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f33539b.x()) {
            this.f33539b.w();
            return true;
        }
        if (this.f33544g && (i10 == 25 || i10 == 24)) {
            this.f33546i.removeCallbacks(this.f33547j);
            this.f33546i.postDelayed(this.f33547j, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.Qc
    public void onOrientationChanged(String str, int i10) {
        a(str, i10);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f33534o, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f33539b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f33551n) {
                this.f33539b.B();
            }
            this.f33539b.b(false, C3978d4.i.Z);
            this.f33539b.g(this.f33545h, C3978d4.i.f31364t0);
        }
        if (isFinishing()) {
            this.f33550m = true;
            c();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f33534o, C3978d4.i.f31366u0);
        v vVar = this.f33539b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f33551n) {
                this.f33539b.F();
            }
            this.f33539b.b(true, C3978d4.i.Z);
            this.f33539b.g(this.f33545h, C3978d4.i.f31366u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.i(f33534o, "onStart");
        v vVar = this.f33539b;
        if (vVar != null) {
            vVar.g(this.f33545h, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(f33534o, "onStop");
        v vVar = this.f33539b;
        if (vVar != null) {
            vVar.g(this.f33545h, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f33534o, "onUserLeaveHint");
        v vVar = this.f33539b;
        if (vVar != null) {
            vVar.g(this.f33545h, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.InterfaceC4153mg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC4153mg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC4153mg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC4153mg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC4153mg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f33544g && z10) {
            runOnUiThread(this.f33547j);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            Logger.i(f33534o, "Rotation: Req = " + i10 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        if (z10) {
            f();
        } else {
            b();
        }
    }
}

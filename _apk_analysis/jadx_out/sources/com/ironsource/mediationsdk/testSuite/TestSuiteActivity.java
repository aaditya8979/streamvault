package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.ironsource.Cf;
import com.ironsource.Lf;
import com.ironsource.Qf;
import com.ironsource.V8;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.safedk.android.utils.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class TestSuiteActivity extends Activity implements V8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f32831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Qf f32832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Lf f32833c;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity) {
        p.k(testSuiteActivity, "this$0");
        testSuiteActivity.finish();
    }

    private final JSONObject b() {
        JSONObject jSONObjectJsonObjectInit;
        String strB = new Cf().b(this);
        if (strB != null) {
            try {
                jSONObjectJsonObjectInit = strB.length() == 0 ? IronSourceVideoBridge.jsonObjectInit() : IronSourceVideoBridge.jsonObjectInit(strB);
            } catch (Exception unused) {
                return IronSourceVideoBridge.jsonObjectInit();
            }
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity) {
        p.k(testSuiteActivity, "this$0");
        Qf qf2 = testSuiteActivity.f32832b;
        Qf qf3 = null;
        if (qf2 == null) {
            p.C("mWebViewWrapper");
            qf2 = null;
        }
        if (qf2.c().getParent() == null) {
            RelativeLayout relativeLayout = testSuiteActivity.f32831a;
            if (relativeLayout == null) {
                p.C("mContainer");
                relativeLayout = null;
            }
            Qf qf4 = testSuiteActivity.f32832b;
            if (qf4 == null) {
                p.C("mWebViewWrapper");
                qf4 = null;
            }
            relativeLayout.removeView(qf4.d());
            RelativeLayout relativeLayout2 = testSuiteActivity.f32831a;
            if (relativeLayout2 == null) {
                p.C("mContainer");
                relativeLayout2 = null;
            }
            Qf qf5 = testSuiteActivity.f32832b;
            if (qf5 == null) {
                p.C("mWebViewWrapper");
                qf5 = null;
            }
            relativeLayout2.addView(qf5.c(), testSuiteActivity.c());
            Qf qf6 = testSuiteActivity.f32832b;
            if (qf6 == null) {
                p.C("mWebViewWrapper");
            } else {
                qf3 = qf6;
            }
            qf3.b();
        }
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53132f, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f32831a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        p.C("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.V8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: t9.b
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(this.f85203b);
            }
        });
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f32831a = relativeLayout;
        setContentView(relativeLayout, c());
        Qf qf2 = new Qf(this, this, b(), a());
        this.f32832b = qf2;
        Lf lf2 = new Lf(qf2);
        this.f32833c = lf2;
        lf2.d();
        RelativeLayout relativeLayout2 = this.f32831a;
        Qf qf3 = null;
        if (relativeLayout2 == null) {
            p.C("mContainer");
            relativeLayout2 = null;
        }
        Qf qf4 = this.f32832b;
        if (qf4 == null) {
            p.C("mWebViewWrapper");
        } else {
            qf3 = qf4;
        }
        relativeLayout2.addView(qf3.d(), c());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Lf lf2 = this.f32833c;
        Qf qf2 = null;
        if (lf2 == null) {
            p.C("mNativeBridge");
            lf2 = null;
        }
        lf2.a();
        RelativeLayout relativeLayout = this.f32831a;
        if (relativeLayout == null) {
            p.C("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        Qf qf3 = this.f32832b;
        if (qf3 == null) {
            p.C("mWebViewWrapper");
        } else {
            qf2 = qf3;
        }
        qf2.a();
        super.onDestroy();
    }

    @Override // com.ironsource.V8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: t9.a
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(this.f85202b);
            }
        });
    }
}

package com.yandex.mobile.ads.common;

import android.content.res.Configuration;
import android.view.MotionEvent;
import androidx.activity.ComponentActivity;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Iterator;
import yads.a2;
import yads.b2;
import yads.c2;
import yads.fa2;
import yads.w1;

/* JADX INFO: loaded from: classes3.dex */
public final class AdActivity extends ComponentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fa2 f59109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f59110b;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53151y, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w1 w1Var = this.f59110b;
        if (w1Var == null || w1Var.f96251c.d()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f59110b;
        if (w1Var != null) {
            b2 b2Var = w1Var.f96252d;
            b2Var.getClass();
            int i10 = configuration.orientation;
            if (i10 != b2Var.f87879c) {
                Iterator it = b2Var.f87877a.iterator();
                if (it.hasNext()) {
                    a2.a(it.next());
                    throw null;
                }
                b2Var.f87879c = i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.common.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        w1 w1Var = this.f59110b;
        if (w1Var != null) {
            w1Var.f96251c.onAdClosed();
            w1Var.f96251c.g();
            w1Var.f96250b.removeAllViews();
        }
        fa2 fa2Var = this.f59109a;
        if (fa2Var != null) {
            fa2Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        w1 w1Var = this.f59110b;
        if (w1Var != null) {
            w1Var.f96251c.b();
            Iterator it = w1Var.f96252d.f87878b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).b();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        w1 w1Var = this.f59110b;
        if (w1Var != null) {
            w1Var.f96251c.a();
            Iterator it = w1Var.f96252d.f87878b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).a();
            }
        }
    }
}

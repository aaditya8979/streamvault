package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import kotlinx.coroutines.d;
import p000do.l0;
import yads.kc1;
import yads.mn;
import yads.xk3;
import yads.z10;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseActivity<T extends kc1> extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f59184a = z10.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kc1 f59185c;

    public BaseActivity() {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        if (lastNonConfigurationInstance instanceof mn) {
        }
    }

    public final l0 a() {
        return this.f59184a;
    }

    public final kc1 b() {
        kc1 kc1Var = this.f59185c;
        if (kc1Var != null) {
            return kc1Var;
        }
        kc1 kc1VarA = c().a();
        this.f59185c = kc1VarA;
        return kc1VarA;
    }

    public abstract xk3 c();

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53151y, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        mn mnVar = lastNonConfigurationInstance instanceof mn ? (mn) lastNonConfigurationInstance : null;
        if (mnVar != null) {
            kc1 kc1Var = mnVar.f92466a;
            this.f59185c = kc1Var instanceof kc1 ? kc1Var : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        kc1 kc1Var;
        super.onDestroy();
        d.e(this.f59184a, null, 1, null);
        if (isChangingConfigurations() || (kc1Var = this.f59185c) == null) {
            return;
        }
        d.e(kc1Var.f91550a, null, 1, null);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new mn(b());
    }
}

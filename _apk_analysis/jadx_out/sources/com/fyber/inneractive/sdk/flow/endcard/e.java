package com.fyber.inneractive.sdk.flow.endcard;

import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.n f16314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f16315c = new int[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f16316d = new g1();

    public e(int i10, com.fyber.inneractive.sdk.player.ui.n nVar) {
        this.f16313a = i10;
        this.f16314b = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/endcard/e;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.g.f53142p, view, motionEvent);
        return safedk_e_onTouch_09b2f5dae9685246cf1ab3a81f789e70(view, motionEvent);
    }

    public boolean safedk_e_onTouch_09b2f5dae9685246cf1ab3a81f789e70(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        view.getRootView().getLocationOnScreen(this.f16315c);
        float rawX = motionEvent.getRawX() - this.f16315c[0];
        float rawY = motionEvent.getRawY() - this.f16315c[1];
        g1 g1Var = this.f16316d;
        g1Var.f19528a = rawX;
        g1Var.f19529b = rawY;
        ((z) this.f16314b).a(this.f16313a, g1Var);
        return true;
    }
}

package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f19747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19750d;

    public y0(x0 x0Var, Context context) {
        this.f19747a = x0Var;
        this.f19750d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/y0;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.g.f53142p, view, motionEvent);
        return safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(view, motionEvent);
    }

    public boolean safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(View view, MotionEvent motionEvent) {
        if (this.f19747a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((i) this.f19747a).i();
                this.f19748b = motionEvent.getX();
                this.f19749c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((i) this.f19747a).i();
                this.f19749c = -1.0f;
                this.f19748b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f10 = this.f19748b;
                if (f10 >= 0.0f && this.f19749c >= 0.0f) {
                    float fRound = Math.round(Math.abs(f10 - motionEvent.getX()));
                    float fRound2 = Math.round(Math.abs(this.f19749c - motionEvent.getY()));
                    float f11 = this.f19750d;
                    if (fRound < f11 && fRound2 < f11) {
                        i iVar = (i) this.f19747a;
                        iVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (iVar.f19641l != null) {
                            IAlog.e("Native click detected in time. Processing pending click", new Object[0]);
                            iVar.f19641l.d();
                            d dVar = iVar.f19642m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar);
                            }
                            iVar.f19641l = null;
                            iVar.i();
                        } else {
                            if (iVar.f19643n != null) {
                                com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(iVar.f19643n, IAConfigManager.O.f15975u.f16144b.a("click_timeout", 1000, 1000));
                            }
                            iVar.f19639j = true;
                        }
                    }
                    this.f19748b = -1.0f;
                    this.f19749c = -1.0f;
                }
            }
        }
        return false;
    }
}

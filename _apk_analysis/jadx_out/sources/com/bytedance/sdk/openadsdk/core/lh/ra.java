package com.bytedance.sdk.openadsdk.core.lh;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ra extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ryl.ouw f13626lh;
    private final String ouw;
    public lh vt;

    public ra(String str, com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar) {
        this(str, ouwVar, null);
    }

    public ra(String str, com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, lh lhVar) {
        this.ouw = str;
        this.f13626lh = ouwVar;
        this.vt = lhVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.lh, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/lh/ra;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(g.f53147u, view, motionEvent);
        return safedk_ra_onTouch_b8fd0957ffbbfac2b071159c523f1e9c(view, motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.lh
    public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar = this.f13626lh;
        if (ouwVar != null) {
            ouwVar.f13939cf = this.ouw;
        }
        if (view != null) {
            if (view.getId() == rn.f14353lh) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == rn.f14364ra) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.ouw);
            }
        }
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.f13622uq = this.f13622uq;
            lhVar.f13620pd = this.f13620pd;
            lhVar.fvf = this.fvf;
            int i10 = this.fvf;
            lhVar.f13616bs = i10;
            lhVar.fak = i10;
            lhVar.ouw(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }

    public boolean safedk_ra_onTouch_b8fd0957ffbbfac2b071159c523f1e9c(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}

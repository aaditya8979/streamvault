package com.bytedance.sdk.openadsdk.core.cf.vt.lh;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.yu.cf;

/* JADX INFO: loaded from: classes8.dex */
public final class vt extends com.bytedance.adsdk.ugeno.yu.yu.lh {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private float f13563cf;

    public vt(Context context) {
        super(context);
        this.f13563cf = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                cf cfVar = this.ouw;
                if (cfVar != null) {
                    cfVar.ouw(this.f11914le, this.f11915lh.vt);
                }
                return true;
            }
            this.f13563cf = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("rate"), 100);
            float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fOuw + " mTargetProgress=" + this.f13563cf);
            if (fOuw >= this.f13563cf) {
                cf cfVar2 = this.ouw;
                if (cfVar2 != null) {
                    cfVar2.ouw(this.f11914le, this.f11915lh.vt);
                }
                return true;
            }
        }
        return false;
    }
}

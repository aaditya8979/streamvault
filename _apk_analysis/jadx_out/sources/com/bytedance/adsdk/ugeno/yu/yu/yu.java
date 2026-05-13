package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class yu extends lh implements com.bytedance.adsdk.ugeno.yu.ouw.yu {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yu.ouw.lh f11922cf;

    public yu(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.ouw.yu
    public final void ouw() {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.ouw.ouw(this.f11914le, this.f11915lh.vt);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        com.bytedance.adsdk.ugeno.yu.ouw.ouw ouwVar = this.vt.lgp;
        if (ouwVar == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.yu.ouw.lh lhVarOuw = ouwVar.ouw(this.f11914le);
        this.f11922cf = lhVarOuw;
        if (lhVarOuw != null) {
            lhVarOuw.ouw(this);
            return false;
        }
        String str = this.f11914le;
        com.bytedance.adsdk.ugeno.yu.ouw.vt vtVar = new com.bytedance.adsdk.ugeno.yu.ouw.vt();
        if (ouwVar.ouw.containsKey(str) && ouwVar.ouw.get(str) != null) {
            return false;
        }
        ouwVar.ouw.put(str, vtVar);
        return false;
    }
}

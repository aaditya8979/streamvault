package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class ra extends lh {
    public ra(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[0]), 0);
            Map<String, String> map = this.fkw;
            if (map == null || map.isEmpty() || iOuw == com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("type"), 0)) {
                this.ouw.ouw(this.f11914le, this.f11915lh.vt);
            }
        }
        return false;
    }
}

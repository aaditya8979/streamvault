package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class vt extends com.bytedance.adsdk.ugeno.bly.le.vt {
    private String qni;
    private String smu;

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        if (str.equals("before")) {
            this.qni = str2;
        } else if (str.equals("after")) {
            this.smu = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt
    public final void ryl(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.smu) || TextUtils.equals(this.smu, "null")) {
            this.smu = "";
        }
        if (TextUtils.isEmpty(this.qni) || TextUtils.equals(this.qni, "null")) {
            this.qni = "";
        }
        String str2 = this.qni + str + this.smu;
        ((com.bytedance.adsdk.ugeno.bly.le.vt) this).ouw = str2;
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setText(str2);
        try {
            float f10 = this.fvf ? this.jae : this.ksc;
            float f11 = this.f11812bs ? this.f11831od : this.ksc;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).getPaint().measureText(((com.bytedance.adsdk.ugeno.bly.le.vt) this).ouw);
            if (fMeasureText >= 0.0f) {
                yu((int) (f10 + fMeasureText + f11));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        super.vt();
        if (TextUtils.isEmpty(this.smu) || TextUtils.equals(this.smu, "null")) {
            this.smu = "";
        }
        if (TextUtils.isEmpty(this.qni) || TextUtils.equals(this.qni, "null")) {
            this.qni = "";
        }
        String str = this.qni + this.smu;
        ((com.bytedance.adsdk.ugeno.bly.le.vt) this).ouw = str;
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setText(str);
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setGravity(17);
    }
}

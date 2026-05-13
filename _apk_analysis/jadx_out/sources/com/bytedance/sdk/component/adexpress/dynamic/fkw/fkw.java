package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.vt;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fkw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw f12226lh;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.vt ouw;
    public vt vt;
    private com.bytedance.sdk.component.adexpress.dynamic.yu.pno yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f12227lh;
        public float ouw;
        public float vt;
    }

    public fkw(double d10, int i10, double d11, String str, mwh mwhVar) {
        this.vt = new vt(d10, i10, d11, str, mwhVar);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.yu.bly ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar, vt.lh lhVar, vt.lh lhVar2) {
        float fMin = leVar.mt;
        float f10 = leVar.zvq;
        float f11 = leVar.xdk;
        float f12 = leVar.myk;
        boolean z10 = leVar.lso;
        boolean z11 = leVar.f12310ub;
        boolean z12 = leVar.f12287cj;
        boolean z13 = leVar.pv;
        if (!z10) {
            if (z11) {
                float f13 = this.f12226lh.ouw;
                fMin = ((f13 != 0.0f ? Math.min(f13, lhVar.ouw) : lhVar.ouw) - f11) - lhVar2.ouw;
            } else {
                fMin = 0.0f;
            }
        }
        if (!z12) {
            if (z13) {
                float f14 = this.f12226lh.vt;
                if (f14 == 0.0f) {
                    f14 = lhVar.vt;
                }
                f10 = (f14 - f12) - lhVar2.vt;
            } else {
                f10 = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.yu.bly(fMin, f10);
    }

    private static com.bytedance.sdk.component.adexpress.dynamic.yu.bly ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar, com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = vtVar.ouw;
        float f15 = vtVar.vt;
        float f16 = leVar.mt;
        float f17 = leVar.zvq;
        float f18 = leVar.xdk;
        float f19 = leVar.myk;
        boolean z10 = leVar.lso;
        boolean z11 = leVar.f12310ub;
        boolean z12 = leVar.f12287cj;
        boolean z13 = leVar.pv;
        String str = leVar.ux;
        float f20 = vtVar.f12340lh;
        float f21 = vtVar.yu;
        if (TextUtils.equals(str, "0")) {
            if (z10) {
                f14 = vtVar.ouw + f16;
            } else if (z11) {
                f14 = ((vtVar.ouw + f20) - f18) - f10;
            }
            if (z12) {
                f13 = vtVar.vt;
                f15 = f13 + f17;
            } else if (z13) {
                f12 = vtVar.vt;
                f15 = ((f12 + f21) - f19) - f11;
            }
        } else if (TextUtils.equals(str, "1")) {
            f14 = vtVar.ouw + ((f20 - f10) / 2.0f);
            if (z12) {
                f13 = vtVar.vt;
                f15 = f13 + f17;
            } else if (z13) {
                f12 = vtVar.vt;
                f15 = ((f12 + f21) - f19) - f11;
            }
        } else if (TextUtils.equals(str, "2")) {
            f15 = vtVar.vt + ((f21 - f11) / 2.0f);
            if (z10) {
                f14 = vtVar.ouw + f16;
            } else if (z11) {
                f14 = ((vtVar.ouw + f20) - f18) - f10;
            }
        } else if (TextUtils.equals(str, ExifInterface.GPS_MEASUREMENT_3D)) {
            f14 = vtVar.ouw + ((f20 - f10) / 2.0f);
            f15 = vtVar.vt + ((f21 - f11) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.yu.bly(f14, f15);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.vt ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt r36, float r37) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.fkw.fkw.ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt, float):com.bytedance.sdk.component.adexpress.dynamic.yu.vt");
    }

    private void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar) {
        if (vtVar == null) {
            return;
        }
        ko.vt("DynamicCanvas", "native parser: type = " + vtVar.f12339le.bly.ouw + "; width = " + vtVar.f12340lh + "; height = " + vtVar.yu + "; x = " + vtVar.ouw + "; y = " + vtVar.vt);
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.vt>> list = vtVar.f12341ra;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.vt> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.vt> it = list2.iterator();
                while (it.hasNext()) {
                    ouw(it.next());
                }
            }
        }
    }

    public final void ouw() {
        this.vt.ouw();
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        if (pnoVar != null) {
            this.yu = pnoVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 = this.yu;
        float f10 = pnoVar2.f12330le;
        float f11 = pnoVar2.f12332ra;
        float f12 = TextUtils.equals(pnoVar2.bly.f12282lh.f12305rn, "fixed") ? f11 : 65536.0f;
        this.vt.ouw();
        this.vt.ouw(pnoVar2, f10, f12);
        vt.lh lhVarOuw = this.vt.ouw(pnoVar2);
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar = new com.bytedance.sdk.component.adexpress.dynamic.yu.vt();
        vtVar.ouw = 0.0f;
        vtVar.vt = 0.0f;
        if (lhVarOuw != null) {
            f10 = lhVarOuw.ouw;
        }
        vtVar.f12340lh = f10;
        if (lhVarOuw != null) {
            f11 = lhVarOuw.vt;
        }
        vtVar.yu = f11;
        vtVar.fkw = "root";
        vtVar.bly = 1280.0f;
        vtVar.f12339le = pnoVar2;
        pnoVar2.vt = 0.0f;
        pnoVar2.f12331lh = 0.0f;
        pnoVar2.f12330le = f10;
        pnoVar2.f12332ra = f11;
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVarOuw = ouw(vtVar, 0.0f);
        this.ouw = vtVarOuw;
        ouw(vtVarOuw);
    }
}

package com.bytedance.sdk.openadsdk.core.lh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.ryl;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class vt extends lh {
    private static int vt = Integer.MIN_VALUE;
    public ko bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final String f13627cf;
    public String ex;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public cf f13628jg;
    public int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public ouw f13629ko;
    public WeakReference<View> mwh;
    private boolean ouw;
    public Context pno;
    public Map<String, Object> qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public PAGNativeAd f13630rn;
    public final int ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public WeakReference<Activity> f13631tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f13632th;
    public final vpp tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f13633vm;
    public com.bytedance.sdk.openadsdk.core.bly.vt vpp;
    public com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh zih;
    public com.bytedance.sdk.openadsdk.core.yu.ouw zin;

    public interface ouw {
        void ouw(View view, int i10);
    }

    public vt(@NonNull Context context, @NonNull vpp vppVar, @NonNull String str, int i10) {
        this.f13633vm = false;
        this.jqy = 0;
        this.ouw = false;
        this.pno = context;
        this.tlj = vppVar;
        this.f13627cf = str;
        this.ryl = i10;
    }

    public vt(@NonNull Context context, @NonNull vpp vppVar, @NonNull String str, int i10, byte b10) {
        this(context, vppVar, str, i10);
        this.ouw = true;
    }

    private static int ouw(Context context) {
        if (vt == Integer.MIN_VALUE) {
            vt = com.bytedance.sdk.component.utils.vpp.fkw(context, "btn_native_creative");
        }
        return vt;
    }

    private static boolean ouw(View view, vpp vppVar, boolean z10) {
        if (view != null && vppVar != null) {
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.ouw.qbp;
                String strValueOf = String.valueOf(view.getTag(i10));
                if (view.getTag(i10) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z10;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (vt(view)) {
                return vppVar.lai != 1 || z10;
            }
            if (vppVar.ajl == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    public static boolean vt(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || ouw(view.getContext()) == view.getId() || rn.yw == view.getId() || rn.zu == view.getId();
    }

    public final void lh() {
        this.f13633vm = true;
    }

    public final void lh(int i10) {
        this.fvf = i10;
    }

    public cf ouw(float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, long j10, long j11, View view, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        cf.ouw ouwVar = new cf.ouw();
        ouwVar.f13644le = f10;
        ouwVar.fkw = f11;
        ouwVar.yu = f12;
        ouwVar.f13645lh = f13;
        ouwVar.vt = j10;
        ouwVar.ouw = j11;
        ouwVar.f13646ra = osn.ouw(view);
        ouwVar.pno = osn.lh(view);
        ouwVar.bly = this.fvf;
        ouwVar.tlj = this.f13616bs;
        ouwVar.f13641cf = this.fak;
        ouwVar.ryl = sparseArray;
        ouwVar.mwh = bly.ouw().tlj ? 1 : 2;
        ouwVar.zih = str;
        ouwVar.f13642jg = f14;
        ouwVar.f13643ko = i10;
        ouwVar.f13647rn = f15;
        ouwVar.f13649vm = i11;
        ouwVar.f13648th = jSONObject;
        ouwVar.qbp = jSONObject2;
        return ouwVar.ouw();
    }

    public final void ouw(int i10) {
        this.fak = i10;
    }

    public final void ouw(View view) {
        if (view == null) {
            return;
        }
        this.mwh = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.lh
    public void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
        int i10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        ryl rylVar;
        if (this.pno == null) {
            this.pno = zih.ouw();
        }
        if ((this.ouw || !ouw(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.pno != null) {
            ko koVar = this.bly;
            if (koVar != null) {
                int i11 = koVar.pno;
                JSONObject jSONObject3 = koVar.bly;
                JSONObject jSONObject4 = koVar.mwh;
                z11 = koVar.f13669jg;
                i10 = i11;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i10 = -1;
                z11 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j10 = this.f13622uq;
            long j11 = this.f13620pd;
            WeakReference<View> weakReference = this.mwh;
            cf cfVarOuw = ouw(f10, f11, f12, f13, sparseArray, j10, j11, weakReference == null ? null : weakReference.get(), this.ex, osn.bly(this.pno), osn.cf(this.pno), osn.tlj(this.pno), i10, jSONObject, jSONObject2);
            this.f13628jg = cfVarOuw;
            if (ouw(cfVarOuw, this.qbp)) {
                return;
            }
            if (this.zih != null) {
                if (this.qbp == null) {
                    this.qbp = new HashMap();
                }
                this.qbp.put("duration", Long.valueOf(this.zih.rn()));
            }
            vpp vppVar = this.tlj;
            if (this.ouw || z11) {
                com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f13628jg, this.f13627cf, true, this.qbp, z10 ? 1 : 2);
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = vppVar.sd();
                if (yuVarSd == null || vppVar.cd() || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.zih;
                yuVar.le(lhVar != null ? lhVar.rn() : 0L);
                return;
            }
            ouw ouwVar = this.f13629ko;
            if (ouwVar != null) {
                ouwVar.ouw(view, -1);
            }
            if (ouw(view, z10)) {
                boolean zVt = od.vt(vppVar);
                String strOuw = zVt ? this.f13627cf : uoy.ouw(this.ryl);
                if (view != null) {
                    try {
                        if (Boolean.TRUE.equals(view.getTag(520093762))) {
                            com.bytedance.sdk.openadsdk.core.uoy.ouw(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                Activity activityOuw = view != null ? com.bytedance.sdk.component.utils.vt.ouw(view) : null;
                boolean zOuw = com.bytedance.sdk.openadsdk.core.uoy.ouw(activityOuw == null ? this.pno : activityOuw, vppVar, this.ryl, this.f13630rn, this.zin, strOuw, this.f13632th, zVt, 0);
                com.bytedance.sdk.openadsdk.core.uoy.ouw(false);
                if (zOuw || vppVar == null || (rylVar = vppVar.f13768kn) == null || rylVar.f13710lh != 2) {
                    if (vppVar != null && !zOuw && TextUtils.isEmpty(vppVar.osn) && com.bytedance.sdk.openadsdk.yu.vt.ouw(this.f13627cf)) {
                        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this.pno, this.f13627cf).ouw(vppVar);
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click", vppVar, this.f13628jg, this.f13627cf, zOuw, this.qbp, z10 ? 1 : 2);
                }
            }
        }
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar) {
        this.zih = lhVar;
    }

    public final void ouw(PAGNativeAd pAGNativeAd) {
        this.f13630rn = pAGNativeAd;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.vt vtVar) {
        this.vpp = vtVar;
    }

    public final void ouw(ouw ouwVar) {
        this.f13629ko = ouwVar;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.yu.ouw ouwVar) {
        this.zin = ouwVar;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar) {
        this.f13632th = lhVar;
    }

    public final void ouw(Map<String, Object> map) {
        Map<String, Object> map2 = this.qbp;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.qbp);
        }
        this.qbp = map;
    }

    public final boolean ouw(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
        if (this.vpp == null) {
            return false;
        }
        ko.ouw ouwVar = new ko.ouw();
        ouwVar.f13677le = f10;
        ouwVar.fkw = f11;
        ouwVar.yu = f12;
        ouwVar.f13678lh = f13;
        ouwVar.vt = this.f13622uq;
        ouwVar.ouw = this.f13620pd;
        ko.ouw ouwVarOuw = ouwVar.ouw(sparseArray);
        ouwVarOuw.f13676ko = z10;
        this.vpp.ouw(view, i10, ouwVarOuw.ouw());
        return true;
    }

    public final boolean ouw(View view, boolean z10) {
        return ouw(view, this.tlj, z10);
    }

    public boolean ouw(cf cfVar, Map<String, Object> map) {
        return false;
    }

    public final void vt(int i10) {
        this.f13616bs = i10;
    }

    public final void yu(int i10) {
        this.jqy = i10;
    }
}

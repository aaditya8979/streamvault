package com.bytedance.sdk.openadsdk.core.cf.le;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.ironsource.C4157n2;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ra extends yu {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private float f13513bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private float f13514cd;
    private boolean fvf;
    private com.bytedance.adsdk.ugeno.vt.lh jae;
    private com.bytedance.adsdk.ugeno.vt.lh ksc;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.fkw f13515od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private float f13516pd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.vt.lh f13517tc;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private boolean f13518uq;

    public ra(Context context, vpp vppVar, boolean z10, ouw ouwVar, ViewGroup viewGroup) {
        super(context, vppVar, z10, ouwVar, viewGroup);
        this.f13518uq = false;
        this.fvf = true;
        if (TextUtils.equals(this.vpp, "fullscreen_interstitial_ad")) {
            this.f13514cd = this.fkw.myk();
        } else if (TextUtils.equals(this.vpp, "rewarded_video")) {
            this.f13514cd = this.fkw.ng();
        }
    }

    private void jg() {
        cf cfVar = new cf();
        HashMap map = new HashMap();
        map.put("image_info", this.f13529le.f12457ra);
        map.put("cache_dir", this.f13529le.tlj);
        cfVar.yu = map;
        cfVar.ouw = this.vt;
        cfVar.vt = this.yu;
        cfVar.f11632lh = this.ex;
        this.ouw.ouw("ad", cfVar);
    }

    private int ko() {
        jg();
        try {
            ryl rylVar = this.ouw;
            JSONObject jSONObject = this.ex;
            com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f13530lh;
            rylVar.ouw(jSONObject, lhVar);
            rylVar.ouw(lhVar);
            if (this.f13530lh != null) {
                if (TextUtils.equals(this.vpp, "rewarded_video")) {
                    this.f13517tc = this.f13530lh.le("RVCountdown");
                    this.ksc = this.f13530lh.le("RVSkipView");
                } else {
                    this.f13517tc = this.f13530lh.le("FVCountdown");
                    this.ksc = this.f13530lh.le("FVSkipView");
                }
                mwh();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
                return 0;
            }
            this.f13529le.f13507cd.vt();
            this.f13529le.f13507cd.lh();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private void mwh() {
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.f13517tc;
        if (lhVar != null) {
            lhVar.vt(8);
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVar2 = this.ksc;
        if (lhVar2 != null) {
            lhVar2.vt(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int ryl() {
        /*
            r5 = this;
            r5.jg()
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw
            r0.ouw(r5)
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw
            r0.ouw = r5
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.fkw
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r0.ptd
            if (r3 != r4) goto L22
            org.json.JSONObject r0 = r0.jvj
            if (r0 == 0) goto L22
            java.lang.String r3 = "click_trigger_type"
            int r4 = r0.optInt(r3, r2)
        L22:
            if (r4 != r1) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            if (r1 == 0) goto L31
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw
            com.bytedance.sdk.openadsdk.core.cf.le.lh r1 = new com.bytedance.sdk.openadsdk.core.cf.le.lh
            r1.<init>()
            r0.vt = r1
        L31:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.fkw
            com.bytedance.sdk.openadsdk.core.model.pd r0 = r0.lht
            if (r0 != 0) goto L4e
            java.lang.String r1 = r5.vpp     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            boolean r1 = com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(r1)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r1 == 0) goto L40
            goto L4e
        L40:
            com.bytedance.adsdk.ugeno.core.ryl r0 = r5.ouw     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r1 = r5.yu     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r3 = r5.ex     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r4 = 0
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.ouw(r1, r3, r4)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.f13530lh = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            goto L5e
        L4e:
            org.json.JSONObject r0 = r5.ouw(r0)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.core.ryl r1 = r5.ouw     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r3 = r5.yu     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            org.json.JSONObject r4 = r5.ex     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.vt.lh r0 = r1.ouw(r3, r4, r0)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.f13530lh = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L5e:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f13530lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 == 0) goto L99
            java.lang.String r1 = "RVCountdown"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r1)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.f13517tc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 != 0) goto L76
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f13530lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r1 = "FVCountdown"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r1)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.f13517tc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L76:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f13530lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r1 = "RVSkipView"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r1)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.ksc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 != 0) goto L8c
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f13530lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r1 = "FVSkipView"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r1)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.ksc = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L8c:
            com.bytedance.adsdk.ugeno.vt.lh<android.view.View> r0 = r5.f13530lh     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            java.lang.String r1 = "ProgressBar"
            com.bytedance.adsdk.ugeno.vt.lh r0 = r0.le(r1)     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.jae = r0     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r5.mwh()     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        L99:
            boolean r0 = r5 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            if (r0 != 0) goto Lab
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r0 = r5.f13529le     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.core.vm r0 = r0.f13507cd     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r0.vt()     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.sdk.openadsdk.core.cf.le.ouw r0 = r5.f13529le     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            com.bytedance.adsdk.ugeno.core.vm r0 = r0.f13507cd     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
            r0.lh()     // Catch: java.lang.Throwable -> Lac java.lang.NoClassDefFoundError -> Laf java.lang.UnsatisfiedLinkError -> Lb2
        Lab:
            return r2
        Lac:
            r0 = 141(0x8d, float:1.98E-43)
            return r0
        Laf:
            r0 = 140(0x8c, float:1.96E-43)
            return r0
        Lb2:
            r0 = 139(0x8b, float:1.95E-43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ra.ryl():int");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f13530lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("VideoV3");
    }

    public final void cf() {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f13530lh, C4157n2.f33013v, new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final int fkw() {
        if (!this.f13529le.fvf) {
            return ryl();
        }
        qbp.ouw("UGenRender", "renderWidget: only update data");
        return ko();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public JSONObject ouw() {
        JSONObject jSONObjectOuw = this.f13529le.ouw();
        if (jSONObjectOuw != null) {
            return jSONObjectOuw.optJSONObject("xTemplate");
        }
        return null;
    }

    public JSONObject ouw(pd pdVar) {
        if (pdVar != null) {
            return pdVar.fkw;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final void ouw(long j10, long j11) {
        super.ouw(j10, j11);
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f13530lh, "videoProgress", Long.valueOf(j10), Long.valueOf(j11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x014e A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:78:0x0117, B:96:0x0158, B:83:0x013a, B:85:0x0140, B:88:0x0147, B:91:0x014e), top: B:115:0x0117 }] */
    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.adsdk.ugeno.core.ko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh r14, com.bytedance.adsdk.ugeno.yu.le.ouw r15) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ra.ouw(com.bytedance.adsdk.ugeno.vt.lh, com.bytedance.adsdk.ugeno.yu.le$ouw):void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final void ouw(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        this.f13515od = fkwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final com.bytedance.adsdk.ugeno.vt.lh pno() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f13530lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("Playable");
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setSoundMute(boolean z10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.dynamic.yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTime(java.lang.CharSequence r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.ra.setTime(java.lang.CharSequence, int, int, boolean):void");
    }

    public final void tlj() {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f13530lh, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final JSONObject yu() {
        return this.f13529le.ouw();
    }
}

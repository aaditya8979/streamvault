package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bly;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ouw {

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.top.lh f13256an;
    public int bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public final rn f13257bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public final tlj f13258cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final AtomicBoolean f13259cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public boolean f13260cj;
    public com.bytedance.sdk.openadsdk.component.reward.vt.vt coz;
    public boolean euf;

    @NonNull
    public final ko ex;
    public final com.bytedance.sdk.openadsdk.component.reward.view.ryl ey;
    public final mwh fak;
    public final String fkw;
    public final com.bytedance.sdk.openadsdk.core.mwh.yu.vt fqk;
    public com.bytedance.sdk.openadsdk.mwh.bly fvf;
    public boolean fwd;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    @Nullable
    public com.bytedance.sdk.openadsdk.activity.pno f13261gh;
    public final Context hun;
    public final com.bytedance.sdk.openadsdk.component.reward.view.tlj jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public final AtomicBoolean f13262jg;
    public final AtomicBoolean jqy;

    @NonNull
    public final Activity jvy;
    public long kfa;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public boolean f13263kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public final AtomicBoolean f13264ko;
    public final pno ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final int f13265le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f13266lh;
    public final boolean lso;
    public boolean lvd;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    public boolean f13267mq;
    public boolean mt;
    public final AtomicBoolean mwh;
    public long myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.common.jg f13268ng;
    public boolean njr;
    public boolean npr;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public final cf f13269od;
    public boolean odc;
    public final fkw osn;
    public final int ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public final lh f13270pd;
    public int pno;
    public boolean pv;
    public final AtomicBoolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final boolean f13271ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final AtomicBoolean f13272rn;
    public final com.bytedance.sdk.openadsdk.component.reward.view.bly rrs;
    public final AtomicBoolean ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.utils.jg f13273sd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public final yu f13274tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public final AtomicBoolean f13275th;
    public final AtomicBoolean tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public String f13276ub;
    public int ucs;

    @NonNull
    public final ryl uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public final le f13277uq;
    public final jae ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public float f13278vh;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    public boolean f13279vi;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public final AtomicBoolean f13280vm;
    public final AtomicBoolean vpp;
    public vpp vt;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    public int f13281wp;
    public boolean xdk;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    public boolean f13282xn;
    public com.bytedance.sdk.openadsdk.component.reward.tlj ycd;
    public int yhj;
    public int yib;
    public final boolean yu;
    public long yw;
    public final AtomicBoolean zih;
    public final AtomicBoolean zin;
    public final boolean zjp;
    public boolean zvq;

    public ouw(@NonNull Activity activity, jae jaeVar, @NonNull vpp vppVar, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, int i10, boolean z10) {
        this(activity, jaeVar, vppVar, vtVar, i10, z10, null);
    }

    public ouw(@NonNull Activity activity, jae jaeVar, @NonNull vpp vppVar, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, int i10, boolean z10, @Nullable ouw ouwVar) {
        this.pno = 0;
        this.bly = 0;
        this.tlj = new AtomicBoolean(false);
        this.f13259cf = new AtomicBoolean(false);
        this.ryl = new AtomicBoolean(false);
        this.mwh = new AtomicBoolean(false);
        this.f13262jg = new AtomicBoolean(false);
        this.f13264ko = new AtomicBoolean(false);
        this.f13272rn = new AtomicBoolean(false);
        this.zih = new AtomicBoolean(false);
        this.f13280vm = new AtomicBoolean(false);
        this.f13275th = new AtomicBoolean(false);
        this.qbp = new AtomicBoolean(false);
        this.zin = new AtomicBoolean(false);
        this.vpp = new AtomicBoolean(false);
        this.jqy = new AtomicBoolean(false);
        this.pv = false;
        this.ucs = 1;
        this.myk = 0L;
        this.f13261gh = null;
        this.odc = true;
        this.npr = false;
        this.f13282xn = false;
        this.jvy = activity;
        this.fqk = vtVar;
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        this.hun = contextOuw;
        this.vt = vppVar;
        this.ouw = i10;
        this.f13279vi = ouwVar != null;
        this.lvd = i10 == 0 || i10 == 1;
        this.lso = i10 == 0 || i10 == 2;
        this.ux = jaeVar;
        this.zjp = z10;
        boolean z11 = vppVar.yiz.getDurationSlotType() == 7;
        this.yu = z11;
        this.fkw = z11 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.fwd = vppVar.lh();
        this.f13271ra = th.mwh(vppVar);
        int iFqk = vppVar.fqk();
        this.f13265le = iFqk;
        com.bytedance.sdk.openadsdk.core.zih.yu();
        this.f13260cj = com.bytedance.sdk.openadsdk.core.settings.cf.ryl(String.valueOf(iFqk));
        com.bytedance.sdk.openadsdk.core.settings.cf.vt();
        this.f13266lh = com.bytedance.sdk.openadsdk.core.settings.cf.tlj(String.valueOf(iFqk));
        this.f13269od = new cf(this);
        this.ey = i10 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.mwh(this) : vppVar.lh() ? new com.bytedance.sdk.openadsdk.component.reward.view.ryl(this) : new com.bytedance.sdk.openadsdk.component.reward.view.cf(this);
        this.rrs = new com.bytedance.sdk.openadsdk.component.reward.view.bly(this);
        this.ex = new ko(this);
        this.f13274tc = new yu(this);
        this.ksc = new pno(this, vppVar);
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar != null ? ouwVar.jae : new com.bytedance.sdk.openadsdk.component.reward.view.tlj(this);
        this.jae = tljVar;
        tljVar.f13367ra = this;
        this.f13257bs = new rn(this);
        this.fak = new mwh(this);
        this.uoy = new ryl(this);
        this.osn = new fkw(this);
        this.f13258cd = new tlj(this);
        le leVar = ouwVar != null ? ouwVar.f13277uq : new le(this);
        this.f13277uq = leVar;
        leVar.ouw = this;
        this.f13270pd = new lh(this);
        this.fvf = new com.bytedance.sdk.openadsdk.mwh.bly(contextOuw);
        this.f13273sd = com.bytedance.sdk.openadsdk.utils.bly.ouw(activity, new bly.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ouw.1
            @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
            public final View ouw() {
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = ouw.this.ey;
                if (rylVar != null) {
                    return rylVar.tlj();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
            public final void vt() {
                ryl rylVar = ouw.this.uoy;
                if (rylVar != null) {
                    rylVar.yu();
                }
            }
        });
    }

    public final Map<String, Object> lh() {
        vpp vppVar;
        HashMap map = new HashMap();
        if (this.jae != null && (vppVar = this.vt) != null && vppVar.rn() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.jae.fkw()));
            JSONObject jSONObjectOuw = this.jae.ouw((JSONObject) null);
            if (jSONObjectOuw != null) {
                Iterator<String> itKeys = jSONObjectOuw.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectOuw.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public final long ouw() {
        return this.yw + (SystemClock.elapsedRealtime() - this.kfa);
    }

    public final void ouw(boolean z10) {
        this.xdk = z10;
        this.uoy.yu(z10);
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        return !this.euf || (pnoVar = this.f13261gh) == null || !(pnoVar instanceof com.bytedance.sdk.openadsdk.activity.fkw) || ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar).ouw;
    }
}

package com.bytedance.sdk.openadsdk.core.cf.yu;

import android.app.Activity;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.sdk.openadsdk.core.cf.ouw.vt;
import com.bytedance.sdk.openadsdk.core.cf.ra.yu;
import com.bytedance.sdk.openadsdk.core.cf.yu.ouw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class vt implements rn, ouw.InterfaceC0230ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f13578lh = 8;
    private String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private JSONObject f13579cf;
    private final Activity fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private float f13580jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private float f13581ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final vpp f13582le;
    private String mwh;
    public com.bytedance.sdk.openadsdk.core.cf.ra.ouw ouw;
    private String pno;
    private boolean qbp = true;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.cf.pno.ouw f13583ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private float f13584rn;
    private final com.bytedance.sdk.openadsdk.core.cf.ra.vt ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private long f13585th;
    private String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private long f13586vm;
    public View vt;
    private ouw yu;
    private float zih;

    public vt(Activity activity, vpp vppVar, com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar, String str, com.bytedance.sdk.openadsdk.core.cf.ra.vt vtVar) {
        this.fkw = activity;
        this.mwh = str;
        this.f13582le = vppVar;
        this.ryl = vtVar;
        this.f13583ra = ouwVar;
    }

    public static /* synthetic */ void ouw(vt vtVar, JSONObject jSONObject, JSONObject jSONObject2) {
        ouw ouwVar = vtVar.yu;
        ouwVar.ouw = vtVar;
        ouwVar.vt = vtVar;
        vtVar.ryl.ouw();
        ouw ouwVar2 = vtVar.yu;
        yu yuVar = new yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.vt.2
            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
            public final void ouw(int i10, String str) {
                if (vt.this.ryl != null) {
                    vt.this.ryl.ouw(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
            public final void ouw(lh<View> lhVar) {
                if (vt.this.ryl != null) {
                    vt.this.ryl.ouw(lhVar);
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ouwVar2.ouw(jSONObject, jSONObject2, yuVar);
        } else {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.ouw.1

                /* JADX INFO: renamed from: lh */
                public final /* synthetic */ yu f13577lh;
                public final /* synthetic */ JSONObject ouw;
                public final /* synthetic */ JSONObject vt;

                public AnonymousClass1(JSONObject jSONObject3, JSONObject jSONObject22, yu yuVar2) {
                    jSONObject = jSONObject3;
                    jSONObject = jSONObject22;
                    yuVar = yuVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw(jSONObject, jSONObject, yuVar);
                }
            });
        }
    }

    public final void ouw() {
        if (this.f13582le == null) {
            this.ryl.ouw(1, "material is null", "net");
            return;
        }
        if (this.f13583ra == null) {
            this.ryl.ouw(1, "material ugen template is null", "net");
            return;
        }
        this.yu = new ouw(this.fkw);
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = this.f13583ra;
        this.tlj = ouwVar.f13554lh;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.vt;
        this.f13579cf = this.f13582le.ouw(true);
        this.ryl.ouw(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.tlj, this.pno, this.bly, "", new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.vt.1
            @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
            public final void ouw(int i10, String str, String str2) {
                vt.this.ryl.ouw(i10, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
            public final void ouw(JSONObject jSONObject, String str) {
                vt vtVar = vt.this;
                vt.ouw(vtVar, jSONObject, vtVar.f13579cf);
                vt.this.ryl.vt(str);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.yu.ouw.InterfaceC0230ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(com.bytedance.adsdk.ugeno.core.mwh r15) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.yu.vt.ouw(com.bytedance.adsdk.ugeno.core.mwh):void");
    }

    @Override // com.bytedance.adsdk.ugeno.core.rn
    public final void ouw(lh lhVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13586vm = System.currentTimeMillis();
            this.f13580jg = motionEvent.getRawX();
            this.f13581ko = motionEvent.getRawY();
            this.qbp = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.f13580jg) >= f13578lh || Math.abs(motionEvent.getRawY() - this.f13581ko) >= f13578lh) {
                this.qbp = false;
                return;
            }
            return;
        }
        this.f13584rn = motionEvent.getRawX();
        this.zih = motionEvent.getRawY();
        if (Math.abs(this.f13584rn - this.f13580jg) >= f13578lh || Math.abs(this.zih - this.f13581ko) >= f13578lh) {
            this.qbp = false;
        }
        this.f13585th = System.currentTimeMillis();
    }
}

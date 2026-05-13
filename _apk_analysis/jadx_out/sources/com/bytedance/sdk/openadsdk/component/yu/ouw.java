package com.bytedance.sdk.openadsdk.component.yu;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.uq;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.ironsource.C4157n2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw {
    public static void ouw(vpp vppVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportCacheLoss json error", e10);
        }
        lh.lh(vppVar, "cache_loss", jSONObject);
    }

    public static void ouw(vpp vppVar, int i10, int i11, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f10);
            lh.ouw(jSONObject, i11, i10);
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportSkip json error", e10);
        }
        lh.ouw(vppVar, "skip", i10, jSONObject);
    }

    public static void ouw(vpp vppVar, int i10, uq uqVar) {
        JSONObject jSONObject = new JSONObject();
        long j10 = 0;
        try {
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (uqVar != null) {
                uqVar.ouw(fak.ouw());
                ouw(jSONObject, vppVar);
                jSONObject.put("client_start_time", uqVar.vt);
                jSONObject.put("sever_time", uqVar.yu);
                jSONObject.put("network_time", uqVar.f13745lh);
                jSONObject.put("client_end_time", uqVar.fkw);
                jSONObject.put("download_resource_duration", uqVar.f13746ra);
                jSONObject.put("resource_source", uqVar.pno);
                jSONObject.put("is_bidding", uqVar.bly ? 1 : 0);
                if (uqVar.bly) {
                    jSONObject.put("load_wait_time", uqVar.tlj);
                }
                j10 = uqVar.f13744le;
            }
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportLoadNetDuration json error", e10);
        }
        lh.ouw(vppVar, "load_net_duration", j10, jSONObject);
    }

    public static void ouw(vpp vppVar, long j10, float f10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j10 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e10) {
            qbp.ouw("TTAppOpenAdReport", "reportDestroy json error", e10);
        }
        lh.lh(vppVar, "destroy", jSONObject);
    }

    public static void ouw(vpp vppVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4157n2.f33012u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        lh.ouw(vppVar, "download_image_duration", j10, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(org.json.JSONObject r1, com.bytedance.sdk.openadsdk.core.model.vpp r2) {
        /*
            java.lang.String r0 = "is_icon_only"
            if (r2 == 0) goto Lc
            boolean r2 = r2.ra()     // Catch: org.json.JSONException -> L11
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "TTAppOpenAdReport"
            com.bytedance.sdk.component.utils.qbp.lh(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.model.vpp):void");
    }

    public static void vt(vpp vppVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", vppVar.f13788sd.f11284lh);
            jSONObject.put("video_duration", vppVar.f13788sd.yu);
            jSONObject.put(C4157n2.f33012u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        lh.ouw(vppVar, "download_video_duration", j10, jSONObject);
    }
}

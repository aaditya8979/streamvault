package com.bytedance.sdk.openadsdk.yu.fkw.ouw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.fkw;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.jg;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.le;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.mwh;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.pno;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {
    private static final Map<com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw, ko> ouw = Collections.synchronizedMap(new WeakHashMap());

    public static void fkw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        if (ouwVar == null || ouwVar2 == null) {
            return;
        }
        if (ouwVar2.ryl <= 0) {
            com.bytedance.sdk.component.utils.ko.lh("TTAD.VideoEventManager", "Cancel log report when buffer count is 0");
            return;
        }
        ko koVar = ouw.get(ouwVar);
        if (koVar == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.f14416lh;
        mwh mwhVar = new mwh();
        mwhVar.ouw = ouwVar2.vt;
        mwhVar.f14419lh = j10;
        mwhVar.vt = ouwVar2.ryl;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = mwhVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        ouw(ouwVarOuw, "play_buffer", (JSONObject) null, (ra) null);
    }

    public static void lh(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f14416lh;
        jg jgVar = new jg(ouwVar2.f14414jg);
        jgVar.ouw = ouwVar2.vt;
        jgVar.vt = j11;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = jgVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "play_error", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    public static /* synthetic */ long ouw(lh lhVar) {
        if (lhVar == null) {
            return 0L;
        }
        vt vtVar = lhVar.le() ? lhVar.vt : lhVar.ouw;
        if (vtVar != null) {
            return Double.valueOf(vtVar.yu * 1000.0d).longValue();
        }
        return 0L;
    }

    private static com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouw(vpp vppVar, String str, int i10, lh lhVar) {
        JSONObject jSONObject = new JSONObject();
        if (i10 > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i10));
            } catch (JSONException e10) {
                qbp.ouw("TTAD.VideoEventManager", "", e10);
            }
        }
        if (vppVar != null) {
            vt vtVar = vppVar.f13788sd;
            if (vtVar != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, vtVar.fkw);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(vtVar.f11284lh));
                jSONObject.put("video_url", vtVar.f11285ra);
                jSONObject.put("player_type", lhVar.f11275rn);
                jSONObject.put("video_encode_type", lhVar.le() ? 1 : 0);
            }
            jSONObject.put("play_time", lhVar.jqy);
            jSONObjectJsonObjectInit = lhVar.ouw() ? PangleVideoBridge.jsonObjectInit(lhVar.ex.toString()) : null;
            if (jSONObjectJsonObjectInit == null) {
                jSONObjectJsonObjectInit = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObjectJsonObjectInit.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", vppVar.cy);
        }
        return new com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw(vppVar, uoy.ouw(vppVar), jSONObject, jSONObjectJsonObjectInit);
    }

    public static com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouw(vpp vppVar, String str, lh lhVar) {
        return ouw(vppVar, str, -1, lhVar);
    }

    public static void ouw(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, final ko.ouw ouwVar2, ra raVar) {
        ko koVar;
        if (context == null || ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        final lh lhVar = koVar.yu;
        final vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        if (!ouwVar2.mwh) {
            com.bytedance.sdk.openadsdk.rn.lh.ouw();
            com.bytedance.sdk.openadsdk.rn.lh.ouw("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.2
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("service_duration", ouw.ouw(lhVar));
                    jSONObject.put("player_duration", ouwVar2.f14416lh);
                    jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                    jSONObject.put("url", lhVar.pno());
                    jSONObject.put("path", ouw.vt(lhVar));
                    jSONObject.put("player_type", lhVar.f11275rn);
                    yu yuVar = new yu();
                    yuVar.ouw = "pangle_video_play_state";
                    vpp vppVar2 = vppVar;
                    yuVar.yu = vppVar2 != null ? vppVar2.uoy() : 0;
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
        pno pnoVar = new pno(lhVar);
        pnoVar.f14422lh = ouwVar2.f14417ra ? 1 : 0;
        pnoVar.vt = CacheDirFactory.getICacheDir(vppVar.f13789sm).vt(lhVar);
        pnoVar.ouw = SystemClock.elapsedRealtime() - koVar.ouw;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = pnoVar;
        JSONObject jSONObjectVt = ouwVarOuw.vt();
        try {
            jSONObjectVt.put("is_received_video_not_playing_info", ouwVar2.yu ? 1 : 0);
            jSONObjectVt.put("new_media_source", com.bykv.vk.openvk.ouw.ouw.vt.ouw.le());
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouwVarOuw.yu = ouwVar2.mwh;
        ouw(ouwVarOuw, "feed_play", (JSONObject) null, raVar);
    }

    public static void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f14416lh;
        if (j11 <= 0 || j10 <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ra raVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ra();
        raVar.ouw = ouwVar2.vt;
        raVar.vt = j11;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = raVar;
        ouw(ouwVar2, vppVar, ouwVarOuw.vt());
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_pause", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2, ra raVar) {
        if (ouwVar == null || ouwVar2 == null) {
            return;
        }
        fkw(ouwVar, ouwVar2);
        ko koVar = ouw.get(ouwVar);
        if (koVar == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f14416lh;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.yu yuVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.yu();
        yuVar.vt = ouwVar2.vt;
        yuVar.ouw = j11;
        yuVar.f14427lh = ouwVar2.tlj;
        yuVar.yu = ouwVar2.f14413cf;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = yuVar;
        ouw(ouwVar2, vppVar, ouwVarOuw.vt());
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_break", jSONObject, raVar);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, boolean z10, String str) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        try {
            ouwVarOuw.ouw().put("is_mute", z10 ? 1 : 0);
            ouwVarOuw.vt().put(TypedValues.TransitionType.S_FROM, str);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouw(ouwVarOuw, "mute_state_change", (JSONObject) null, (ra) null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(1:8)(2:10|(10:12|14|29|15|(1:17)(1:18)|19|23|(1:26)|27|28)(1:13))|9|14|29|15|(0)(0)|19|23|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.VideoEventManager", "", r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp r11, com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw r12, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh r13) {
        /*
            if (r11 == 0) goto L64
            if (r12 == 0) goto L64
            if (r13 != 0) goto L8
            goto L64
        L8:
            java.lang.String r7 = com.bytedance.sdk.openadsdk.utils.ex.ouw()
            boolean r0 = r13.yu
            r8 = 1
            if (r0 == 0) goto L14
            r0 = 3
        L12:
            r9 = r0
            goto L24
        L14:
            int r0 = r11.f13789sm
            com.bykv.vk.openvk.ouw.ouw.ouw.ouw.vt r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            boolean r0 = r0.ouw(r13)
            if (r0 == 0) goto L22
            r9 = r8
            goto L24
        L22:
            r0 = 2
            goto L12
        L24:
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko r10 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0 = r10
            r3 = r7
            r4 = r9
            r5 = r13
            r6 = r11
            r0.<init>(r1, r3, r4, r5, r6)
            java.util.Map<com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw, com.bytedance.sdk.openadsdk.yu.fkw.vt.ko> r0 = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw
            r0.put(r12, r10)
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw r11 = ouw(r11, r7, r9, r13)
            org.json.JSONObject r12 = r11.ouw()
            r0 = 0
            java.lang.String r1 = "is_mute"
            boolean r2 = r13.f11268cf     // Catch: org.json.JSONException -> L4d
            if (r2 == 0) goto L48
            r2 = r8
            goto L49
        L48:
            r2 = r0
        L49:
            r12.put(r1, r2)     // Catch: org.json.JSONException -> L4d
            goto L55
        L4d:
            r12 = move-exception
            java.lang.String r1 = "TTAD.VideoEventManager"
            java.lang.String r2 = ""
            com.bytedance.sdk.component.utils.qbp.ouw(r1, r2, r12)
        L55:
            int r12 = r13.f11275rn
            r13 = -1
            if (r12 != r13) goto L5b
            goto L5c
        L5b:
            r8 = r0
        L5c:
            r11.yu = r8
            java.lang.String r12 = "play_start"
            r13 = 0
            ouw(r11, r12, r13, r13)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.model.vpp, com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh):void");
    }

    private static void ouw(ko.ouw ouwVar, vpp vppVar, JSONObject jSONObject) {
        if (vppVar != null) {
            try {
                cd cdVar = vppVar.f13793tj;
                if (cdVar != null) {
                    jSONObject.put("speed_type", cdVar.vt);
                    jSONObject.put("speed", cdVar.ouw);
                    jSONObject.put("speed_duration", ouwVar.f14415le);
                }
            } catch (Throwable th2) {
                qbp.ouw("TTAD.VideoEventManager", "", th2);
            }
        }
    }

    public static void ouw(com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("load_video_error", ouwVar);
    }

    private static void ouw(final com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar, String str, final JSONObject jSONObject, final ra raVar) {
        if (ouwVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (ouwVar.yu && !TextUtils.isEmpty(ouwVar.vt)) {
            String str2 = ouwVar.vt;
            str2.hashCode();
            if (str2.equals("stream") || str2.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str3 = str;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), ouwVar.ouw, ouwVar.vt, str3, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                ra raVar2;
                try {
                    JSONObject jSONObjectOuw = ouwVar.ouw();
                    com.bytedance.sdk.openadsdk.yu.fkw.vt.lh lhVar = ouwVar.f14421lh;
                    if (lhVar != null) {
                        lhVar.ouw(jSONObjectOuw);
                    }
                    if (("feed_play".equals(str3) || "feed_over".equals(str3) || "feed_break".equals(str3)) && (raVar2 = raVar) != null) {
                        raVar2.ouw(jSONObjectOuw);
                    }
                    return jSONObjectOuw;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar2 = ouwVar;
                com.bytedance.sdk.openadsdk.yu.fkw.vt.lh lhVar = ouwVar2.f14421lh;
                if (lhVar != null) {
                    lhVar.ouw(ouwVar2);
                }
                return ouwVar.vt();
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                return jSONObject;
            }
        });
    }

    public static /* synthetic */ String vt(lh lhVar) {
        return new File(lhVar.f11272lh, lhVar.bly()).getAbsolutePath();
    }

    public static void vt(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f14416lh;
        if (j11 <= 0 || j10 <= 0) {
            return;
        }
        fkw fkwVar = new fkw();
        fkwVar.ouw = ouwVar2.vt;
        fkwVar.vt = j11;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = fkwVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_continue", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void vt(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2, ra raVar) {
        if (ouwVar == null) {
            return;
        }
        fkw(ouwVar, ouwVar2);
        ko koVar = ouw.get(ouwVar);
        if (koVar == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f14416lh;
        le leVar = new le();
        leVar.vt = ouwVar2.vt;
        leVar.ouw = j11;
        leVar.f14418lh = ouwVar2.f14413cf;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = leVar;
        JSONObject jSONObjectVt = ouwVarOuw.vt();
        ouw(ouwVar2, vppVar, jSONObjectVt);
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            jSONObjectVt.put("surface_texture_updated", ouwVar2.fkw ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "feed_over", jSONObject, raVar);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouw.remove(ouwVar);
    }

    public static void vt(com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("load_video_cancel", ouwVar);
    }

    public static void yu(com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw ouwVar, ko.ouw ouwVar2) {
        ko koVar;
        if (ouwVar == null || (koVar = ouw.get(ouwVar)) == null) {
            return;
        }
        lh lhVar = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (lhVar == null || vppVar == null) {
            return;
        }
        long j10 = ouwVar2.ouw;
        long j11 = ouwVar2.f14416lh;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.vt vtVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.vt();
        vtVar.ouw = ouwVar2.vt;
        vtVar.vt = j11;
        vtVar.f14426lh = ouwVar2.pno;
        vtVar.yu = ouwVar2.bly;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f14412lh, lhVar);
        ouwVarOuw.f14421lh = vtVar;
        ouwVarOuw.yu = ouwVar2.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j10);
            jSONObject.put("percent", ouwVar2.ouw());
            ouw(ouwVarOuw, "endcard_skip", jSONObject, (ra) null);
        } catch (JSONException e10) {
            qbp.ouw("TTAD.VideoEventManager", "", e10);
        }
        ouw.remove(ouwVar);
    }
}

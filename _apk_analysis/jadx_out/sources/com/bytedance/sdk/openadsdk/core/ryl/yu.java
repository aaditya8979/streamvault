package com.bytedance.sdk.openadsdk.core.ryl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import com.bytedance.sdk.openadsdk.core.ryl.vt.vt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class yu {

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f13970ko;
    private boolean qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private long f13974rn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f13975th;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private boolean f13976vm;
    private String vpp;
    private vpp zih;
    private String zin;
    private final AtomicBoolean mwh = new AtomicBoolean(false);

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final AtomicBoolean f13969jg = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> vt = new ArrayList();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13972lh = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> yu = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> fkw = new ArrayList();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13971le = new ArrayList();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13973ra = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> pno = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> bly = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> tlj = new ArrayList();

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.vt> f13968cf = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.ouw> ryl = new ArrayList();

    private JSONArray fkw() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.core.ryl.vt.ouw ouwVar : this.ryl) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", ouwVar.vt);
            jSONObject.put("trackingMilliseconds", ouwVar.ouw);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private String lh() {
        if (this.vpp == null) {
            this.vpp = UUID.randomUUID().toString();
        }
        return this.vpp;
    }

    private void ouw(final le leVar, final int i10) {
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                le leVar2 = leVar;
                if (leVar2 != null) {
                    leVar2.ouw(i10);
                }
            }
        });
    }

    private void ouw(String str) {
        try {
            if (this.f13970ko) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean ouw(long j10, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar) {
        return ouw(j10, list, ouwVar, null);
    }

    private boolean ouw(long j10, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, lh.vt vtVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2;
        vpp vppVar = this.zih;
        String str = null;
        if (vppVar != null && (vtVar2 = vppVar.f13788sd) != null) {
            str = vtVar2.f11285ra;
        }
        return com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(vppVar, list, ouwVar, j10, str, vtVar, lh());
    }

    private void ryl(List<com.bytedance.sdk.openadsdk.core.ryl.vt.vt> list) {
        this.f13968cf.addAll(list);
        Collections.sort(this.f13968cf);
    }

    private JSONArray yu() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.core.ryl.vt.vt vtVar : this.f13968cf) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", vtVar.vt);
            jSONObject.put("trackingFraction", vtVar.ouw);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final void bly(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.ouw.addAll(list);
    }

    public final void cf(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.tlj.addAll(list);
    }

    public final void fkw(long j10) {
        if (!ouw(j10, this.f13973ra, null, this.f13970ko ? null : new lh.vt("skip", this.zih)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_skip", (JSONObject) null);
    }

    public final void fkw(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.f13971le.addAll(list);
    }

    public final void le(long j10) {
        if (!ouw(j10, this.pno, null, new lh.vt(this.f13970ko ? "click" : "clickTracking", this.zih)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_video_click", (JSONObject) null);
    }

    public final void le(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.f13973ra.addAll(list);
    }

    public final void lh(long j10) {
        if (!ouw(j10, this.fkw, null, new lh.vt(this.f13970ko ? "video_progress" : "complete", this.zih, 1.0f)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_complete", (JSONObject) null);
    }

    public final void lh(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.yu.addAll(list);
    }

    public final void ouw() {
        if (this.mwh.compareAndSet(false, true)) {
            if (!ouw(0L, this.vt, null, new lh.vt(this.f13970ko ? "show_impression" : "impression", this.zih)) || this.f13970ko) {
                return;
            }
            com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_impression", (JSONObject) null);
        }
    }

    public final void ouw(long j10) {
        if (!ouw(j10, this.f13972lh, null, this.f13970ko ? null : new lh.vt(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.zih, j10)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_pause", (JSONObject) null);
    }

    public final void ouw(long j10, long j11, le leVar) {
        lh.vt vtVar;
        if (System.currentTimeMillis() - this.f13974rn >= 1000 && j10 >= 0 && j11 > 0) {
            this.f13974rn = System.currentTimeMillis();
            float f10 = j10 / j11;
            List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> arrayList = new ArrayList<>();
            int i10 = 0;
            while (true) {
                if (i10 >= this.f13968cf.size()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.ryl.vt.vt vtVar2 = this.f13968cf.get(i10);
                if (vtVar2.ouw <= f10 && !vtVar2.f13958lh) {
                    arrayList.add(vtVar2);
                }
                i10++;
            }
            for (int i11 = 0; i11 < this.ryl.size(); i11++) {
                com.bytedance.sdk.openadsdk.core.ryl.vt.ouw ouwVar = this.ryl.get(i11);
                if (ouwVar.ouw <= j10 && !ouwVar.f13958lh) {
                    arrayList.add(ouwVar);
                }
            }
            if (f10 >= 0.25f && !this.f13976vm) {
                ouw("firstQuartile");
                this.f13976vm = true;
                if (leVar != null) {
                    ouw(leVar, 6);
                }
                if (this.f13970ko) {
                    f10 = 0.25f;
                    vtVar = null;
                } else {
                    vtVar = new lh.vt("firstQuartile", this.zih, 0.25f);
                    f10 = 0.25f;
                }
            } else if (f10 >= 0.5f && !this.f13975th) {
                ouw(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                this.f13975th = true;
                if (leVar != null) {
                    ouw(leVar, 7);
                }
                vtVar = !this.f13970ko ? new lh.vt(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.zih, 0.5f) : null;
                f10 = 0.5f;
            } else if (f10 < 0.75f || this.qbp) {
                vtVar = null;
            } else {
                ouw("thirdQuartile");
                this.qbp = true;
                if (leVar != null) {
                    ouw(leVar, 8);
                }
                vtVar = !this.f13970ko ? new lh.vt("thirdQuartile", this.zih, 0.75f) : null;
                f10 = 0.75f;
            }
            if (f10 < 0.03f) {
                f10 = 0.0f;
            }
            if (!this.f13970ko && !arrayList.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.ryl.vt.lh lhVar = arrayList.get(0);
                if ((lhVar instanceof com.bytedance.sdk.openadsdk.core.ryl.vt.ouw) && ((com.bytedance.sdk.openadsdk.core.ryl.vt.ouw) lhVar).ouw == 0) {
                    com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_start", (JSONObject) null);
                    vtVar = new lh.vt("start", this.zih, f10);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ouw(j10, arrayList, null, vtVar != null ? vtVar : new lh.vt("video_progress", this.zih, f10));
        }
    }

    public final void ouw(vpp vppVar) {
        this.zih = vppVar;
        this.zin = vppVar.vt();
        this.f13970ko = vppVar.cd();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar) {
        if (!ouw(-1L, this.ouw, ouwVar, this.f13970ko ? null : new lh.vt("error", this.zih, 0.0f)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_error", (JSONObject) null);
    }

    public final void ouw(yu yuVar) {
        bly(yuVar.ouw);
        ouw(yuVar.vt);
        vt(yuVar.f13972lh);
        lh(yuVar.yu);
        yu(yuVar.fkw);
        fkw(yuVar.f13971le);
        le(yuVar.f13973ra);
        ra(yuVar.pno);
        tlj(yuVar.bly);
        cf(yuVar.tlj);
        ryl(yuVar.f13968cf);
        pno(yuVar.ryl);
    }

    public final void ouw(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        ryl(Collections.singletonList(new vt.ouw(str, f10).ouw()));
    }

    public final void ouw(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.vt.addAll(list);
    }

    public final void ouw(JSONObject jSONObject) {
        bly(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("errorTrackers")));
        ouw(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("impressionTrackers")));
        vt(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("pauseTrackers"), true));
        lh(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("resumeTrackers"), true));
        yu(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("completeTrackers")));
        fkw(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("closeTrackers")));
        le(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("skipTrackers")));
        ra(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("clickTrackers")));
        tlj(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("muteTrackers"), true));
        cf(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("unMuteTrackers"), true));
        ryl(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt(jSONObject.optJSONArray("fractionalTrackers")));
        pno(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.lh(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public final void pno(long j10) {
        if (!ouw(j10, this.tlj, null, this.f13970ko ? null : new lh.vt(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.zih, j10)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_unmute", (JSONObject) null);
    }

    public final void pno(List<com.bytedance.sdk.openadsdk.core.ryl.vt.ouw> list) {
        this.ryl.addAll(list);
        Collections.sort(this.ryl);
    }

    public final void ra(long j10) {
        if (!ouw(j10, this.bly, null, this.f13970ko ? null : new lh.vt(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.zih, j10)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_mute", (JSONObject) null);
    }

    public final void ra(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.pno.addAll(list);
    }

    public final void tlj(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.bly.addAll(list);
    }

    public final JSONObject vt() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.ouw));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.vt));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f13972lh));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.yu));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.fkw));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f13971le));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f13973ra));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.pno));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.bly));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.tlj));
        jSONObject.put("fractionalTrackers", yu());
        jSONObject.put("absoluteTrackers", fkw());
        return jSONObject;
    }

    public final void vt(long j10) {
        if (!ouw(j10, this.yu, null, this.f13970ko ? null : new lh.vt(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.zih, j10)) || this.f13970ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_resume", (JSONObject) null);
    }

    public final void vt(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.f13972lh.addAll(list);
    }

    public final void yu(long j10) {
        if (this.f13969jg.compareAndSet(false, true)) {
            ouw(j10, this.f13971le, (com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw) null);
        }
    }

    public final void yu(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.fkw.addAll(list);
    }
}

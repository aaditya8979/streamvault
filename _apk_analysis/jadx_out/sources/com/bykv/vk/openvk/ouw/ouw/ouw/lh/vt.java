package com.bykv.vk.openvk.ouw.ouw.ouw.lh;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vt {
    public String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f11280cf;
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11283le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f11284lh;
    public int ouw;
    public String pno;
    private double qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f11285ra;
    public int ryl;
    public String tlj;
    public int vt;
    public double yu;
    public float mwh = -1.0f;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f11281jg = 0;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f11282ko = 0;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public int f11286rn = 0;
    public int zih = 0;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f11288vm = 307200;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f11287th = 1;

    public final JSONObject lh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.ouw);
            jSONObject.put("cover_url", this.f11283le);
            jSONObject.put("cover_width", this.vt);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.pno);
            jSONObject.put("file_hash", ouw());
            jSONObject.put("resolution", this.fkw);
            jSONObject.put("size", this.f11284lh);
            jSONObject.put("video_duration", this.yu);
            jSONObject.put("video_url", this.f11285ra);
            jSONObject.put("playable_download_url", this.bly);
            jSONObject.put("if_playable_loading_show", this.f11281jg);
            jSONObject.put("remove_loading_page_type", this.f11282ko);
            jSONObject.put("fallback_endcard_judge", this.f11280cf);
            jSONObject.put("video_preload_size", vt());
            jSONObject.put("reward_video_cached_type", this.f11286rn);
            jSONObject.put("execute_cached_type", this.zih);
            jSONObject.put("endcard_render", this.ryl);
            jSONObject.put("replay_time", this.f11287th);
            jSONObject.put("play_speed_ratio", this.mwh);
            double d10 = this.qbp;
            if (d10 > 0.0d) {
                jSONObject.put("start", d10);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String ouw() {
        if (TextUtils.isEmpty(this.tlj)) {
            this.tlj = com.bykv.vk.openvk.ouw.ouw.ouw.ra.vt.ouw(this.f11285ra);
        }
        return this.tlj;
    }

    public final void ouw(int i10) {
        this.f11287th = Math.min(4, Math.max(1, i10));
    }

    public final int vt() {
        if (this.f11288vm < 0) {
            this.f11288vm = 307200;
        }
        long j10 = this.f11288vm;
        long j11 = this.f11284lh;
        if (j10 > j11) {
            this.f11288vm = (int) j11;
        }
        return this.f11288vm;
    }

    public final boolean yu() {
        return this.f11286rn == 0;
    }
}

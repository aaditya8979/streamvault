package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam.GAMConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class le {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13686ra;
    public String ouw = "";
    public String vt = "";

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13685lh = "";
    public String yu = "";
    public double fkw = -1.0d;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13684le = -1;

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", this.vt);
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, this.f13686ra);
            jSONObject.put("comment_num", this.f13684le);
            jSONObject.put(DownloadModel.DOWNLOAD_URL, this.ouw);
            jSONObject.put("package_name", this.f13685lh);
            jSONObject.put(GAMConfig.KEY_SCORE, this.fkw);
            jSONObject.put("app_category", this.yu);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.yu(e10.toString(), new Object[0]);
        }
        return jSONObject;
    }
}

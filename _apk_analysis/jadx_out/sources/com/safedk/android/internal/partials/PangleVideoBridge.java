package com.safedk.android.internal.partials;

import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PangleSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class PangleVideoBridge {
    public static JSONObject jsonObjectInit(String str) throws JSONException {
        Logger.d("PangleVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PangleVideoBridge;->jsonObjectInit(Ljava/lang/String;)Lorg/json/JSONObject;");
        if (str.startsWith("{\"adMarkup\"")) {
            int iHashCode = str.hashCode();
            if (f.a(iHashCode)) {
                CreativeInfoManager.a(str, iHashCode);
            }
            return new JSONObject(str);
        }
        if (str.startsWith("{\"creatives\"") || str.startsWith("{\"interaction_type\"")) {
            k.b("VideoBridge", "message is: " + str);
            CreativeInfoManager.a(g.f53147u, "@!1:ad_fetch@!", str, (Map<String, List<String>>) null);
        } else if (str.contains("{\"app_log_url\"")) {
            k.b("VideoBridge", "message is: " + str);
            SafeDK safeDK = SafeDK.getInstance();
            boolean z10 = false;
            if (str.contains("\"tag\":\"fullscreen_interstitial_ad\"") || str.contains("\"tag\":\"rewarded_video\"")) {
                if (str.contains("\"label\":\"feed_over\"") || str.contains("\"label\":\"skip\"") || (str.contains("\"label\":\"endcard_page_info\"") && str.contains("\"track_name\\\":\\\"endcard_pageview\\\""))) {
                    CreativeInfoManager.onVideoCompleted(g.f53147u, null);
                    z10 = true;
                }
            } else if (str.contains("\"tag\":\"landingpage_direct\",\"label\":\"load_finish\"") || (str.contains("\"tag\":\"landingpage_direct\"") && str.contains("\"event\":\"progress_load_finish\""))) {
                CreativeInfoManager.onVideoCompleted(g.f53147u, null);
                if (safeDK != null && safeDK.y() != null) {
                    safeDK.y().g(g.f53147u, "landingpage_direct");
                }
                z10 = true;
            }
            if (z10 && safeDK != null && safeDK.y() != null) {
                safeDK.y().l(g.f53147u);
            }
        } else if (k.v(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("track_name");
            if (!TextUtils.isEmpty(strOptString) && strOptString.equals("endcard_pageview")) {
                Logger.d("VideoBridge", "json object init - found endcard for sdk: ");
                CreativeInfoManager.f(g.f53147u);
            } else if (!TextUtils.isEmpty(jSONObject.optString("video_url")) && !TextUtils.isEmpty(jSONObject.optString("total_duration"))) {
                Logger.d("VideoBridge", "json object init - video ended for sdk: ");
                CreativeInfoManager.onVideoCompleted(g.f53147u, null);
            }
        }
        return new JSONObject(str);
    }
}

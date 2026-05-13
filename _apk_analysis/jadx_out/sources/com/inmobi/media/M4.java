package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public abstract class M4 {
    public static JSONArray a(L4 l42, List list) {
        tn.p.k(l42, "it");
        tn.p.k(list, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list2 = L4.f25845j;
        tn.p.k(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "key");
        tn.p.k(list, "skipList");
        if (!list.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(l42.f25846a);
        }
        tn.p.k("bid", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("bid")) {
            jSONArray.put(l42.f25847b);
        }
        tn.p.k("its", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("its")) {
            jSONArray.put(l42.f25848c);
        }
        tn.p.k("vtm", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("vtm")) {
            jSONArray.put(l42.f25849d);
        }
        tn.p.k("plid", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("plid")) {
            jSONArray.put(l42.f25850e);
        }
        tn.p.k("catid", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("catid")) {
            jSONArray.put(l42.f25851f);
        }
        tn.p.k("hcd", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("hcd")) {
            jSONArray.put(l42.f25852g);
        }
        tn.p.k("hsv", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("hsv")) {
            jSONArray.put(l42.f25853h);
        }
        tn.p.k("hcv", "key");
        tn.p.k(list, "skipList");
        if (!list.contains("hcv")) {
            jSONArray.put(l42.f25854i);
        }
        return jSONArray;
    }
}

package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.C4266t8;
import com.ironsource.C4351y8;
import com.ironsource.I5;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class B8 {
    public static I5 a(JSONObject jSONObject) {
        return new I5.a(jSONObject.optString(G5.f29403r)).b().b(jSONObject.optBoolean("enabled")).a(new C4368z8()).a(a()).a(false).a();
    }

    public static C4266t8.e a(Y4 y42, C4266t8.e eVar) {
        return (y42 == null || y42.g() == null || y42.g().get("rewarded") == null) ? eVar : Boolean.parseBoolean(y42.g().get("rewarded")) ? C4266t8.e.RewardedVideo : C4266t8.e.Interstitial;
    }

    public static C4351y8 a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C4351y8.a aVar = new C4351y8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.c(map.get("sessionid"));
        }
        aVar.a(context);
        return aVar.d(str).a(str2).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", G5.L));
        arrayList.add(new Pair<>(G5.M, G5.N));
        return arrayList;
    }

    public static boolean a(Y4 y42) {
        if (y42 == null || y42.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(y42.g().get("inAppBidding"));
    }
}

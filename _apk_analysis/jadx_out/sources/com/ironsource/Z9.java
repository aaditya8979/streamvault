package com.ironsource;

import com.ironsource.C4266t8;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f30822a = "ManRewInst_";

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(O9 o92) {
        return o92.i() ? C4266t8.e.Banner.toString() : o92.n() ? C4266t8.e.RewardedVideo.toString() : C4266t8.e.Interstitial.toString();
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f30822a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }
}

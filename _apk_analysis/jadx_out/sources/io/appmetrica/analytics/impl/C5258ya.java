package io.appmetrica.analytics.impl;

import com.safedk.android.analytics.events.CrashEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5258ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f68034a;

    static {
        HashSet hashSet = new HashSet();
        f68034a = hashSet;
        hashSet.add("get_ad");
        hashSet.add(CrashEvent.f52788e);
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return AbstractC4832hb.a(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

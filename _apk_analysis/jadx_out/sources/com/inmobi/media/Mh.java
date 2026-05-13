package com.inmobi.media;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f25968a = {tn.t.i(new PropertyReference1Impl(Mh.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String str, String str2) {
        tn.p.k(str, "browser");
        tn.p.k(str2, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", str);
        jSONObject.put("event", str2);
        return jSONObject;
    }
}

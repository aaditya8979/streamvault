package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4050h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31835a = "SSA_CORE.SDKController.runFunction";

    public static String a(C4068i4 c4068i4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f31835a, c4068i4.b(), a(c4068i4.c()), b(c4068i4));
    }

    private static String a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? "" : jSONObject.toString();
    }

    private static String b(C4068i4 c4068i4) {
        return (c4068i4.d() == null || c4068i4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c4068i4.d(), c4068i4.a());
    }
}

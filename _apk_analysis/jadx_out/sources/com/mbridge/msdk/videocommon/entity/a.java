package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* JADX INFO: compiled from: AdParams.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42363b;

    public a(String str, String str2) {
        this.f42362a = str;
        this.f42363b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}

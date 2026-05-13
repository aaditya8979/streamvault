package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f9838f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9839a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f9841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f9842d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f9840b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9843e = System.currentTimeMillis();

    public s7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f9839a = kVar;
        this.f9841c = jSONObject;
        this.f9842d = jSONObject2;
    }

    public List a() {
        return this.f9840b;
    }

    public JSONObject b() {
        return this.f9841c;
    }

    public long c() {
        return this.f9843e;
    }

    public int d() {
        return this.f9840b.size();
    }

    public JSONObject e() {
        return this.f9842d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f9841c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f9838f;
    }

    public int g() {
        return n7.c(JsonUtils.getInt(this.f9841c, "video_completion_percent", -1));
    }
}

package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: OpenAppModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<Object, Object> f36412d;

    public a(Map<String, Object> map) {
        a(map);
    }

    public Context a() {
        return this.f36409a;
    }

    public void a(Context context) {
        this.f36409a = context;
    }

    public void a(String str) {
        this.f36410b = str;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("target_name");
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get("scheme");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("extra");
            if (obj3 instanceof Map) {
                b((Map<Object, Object>) obj3);
            }
        }
    }

    public Map<Object, Object> b() {
        return this.f36412d;
    }

    public void b(String str) {
        this.f36411c = str;
    }

    public void b(Map<Object, Object> map) {
        this.f36412d = map;
    }

    public String c() {
        return this.f36410b;
    }

    public String d() {
        return this.f36411c;
    }
}

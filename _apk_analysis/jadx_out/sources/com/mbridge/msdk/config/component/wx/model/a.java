package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: WXMiniAppModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36464f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public String a() {
        return this.f36463e;
    }

    public void a(Context context) {
        this.f36459a = context;
    }

    public void a(String str) {
        this.f36463e = str;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("app_id");
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get("user_name");
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get("path");
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(DomainCampaignEx.KEY_BIND_ID);
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get("universal_link");
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f36459a;
    }

    public void b(String str) {
        this.f36464f = str;
    }

    public String c() {
        return this.f36461c;
    }

    public void c(String str) {
        this.f36461c = str;
    }

    public String d() {
        return this.f36462d;
    }

    public void d(String str) {
        this.f36462d = str;
    }

    public String e() {
        return this.f36460b;
    }

    public void e(String str) {
        this.f36460b = str;
    }
}

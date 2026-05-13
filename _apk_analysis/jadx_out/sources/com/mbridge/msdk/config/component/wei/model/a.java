package com.mbridge.msdk.config.component.wei.model;

import androidx.multidex.MultiDexExtractor;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: WebViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSession f36449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Map<String, Object>> f36452i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public AdSession a() {
        return this.f36449f;
    }

    public void a(String str) {
        this.f36447d = str;
    }

    public void a(List<Map<String, Object>> list) {
        this.f36452i = list;
    }

    public void a(Map<String, Object> map) {
        b bVarA;
        if (map != null) {
            Object obj = map.get("url");
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && (bVarA = com.mbridge.msdk.config.component.common.file.a.a(strValueOf, 1, null)) != null && bVarA.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(strValueOf, bVarA.d()));
                }
                d(strValueOf);
            }
            Object obj2 = map.get("html_code");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("action");
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get("view_tag");
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get("js_interaction");
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }

    public String b() {
        return this.f36447d;
    }

    public void b(String str) {
        this.f36446c = str;
    }

    public String c() {
        return this.f36451h;
    }

    public void c(String str) {
        this.f36445b = str;
    }

    public String d() {
        return this.f36446c;
    }

    public void d(String str) {
        this.f36444a = str;
    }

    public List<Map<String, Object>> e() {
        return this.f36452i;
    }

    public void e(String str) {
        this.f36448e = str;
    }

    public String f() {
        return this.f36445b;
    }

    public String g() {
        return this.f36444a;
    }

    public String h() {
        return this.f36448e;
    }

    public boolean i() {
        return this.f36450g;
    }
}

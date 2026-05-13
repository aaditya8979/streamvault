package com.mbridge.msdk.config.component.nori.model;

import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: NetworkRequestModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f36280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f36281b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f36283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f36284e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f36287h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f36291l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36282c = "HTTP";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36285f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36286g = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f36288i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f36289j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36290k = 9377;

    public a(Map<String, Object> map) {
        a(map);
    }

    public Map<String, Object> a() {
        return this.f36287h;
    }

    public void a(int i10) {
        this.f36285f = i10;
    }

    public void a(long j10) {
        this.f36289j = j10;
    }

    public void a(String str) {
        this.f36288i = str;
    }

    public void a(List<String> list) {
        this.f36280a = list;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get("urls");
                if (obj instanceof List) {
                    b((List<String>) obj);
                } else if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj.toString());
                    b(arrayList);
                }
                Object obj2 = map.get("scheme");
                if (obj2 != null) {
                    c(String.valueOf(obj2));
                }
                Object obj3 = map.get("method");
                if (obj3 != null) {
                    a(String.valueOf(obj3));
                }
                Object obj4 = map.get("body");
                if (obj4 instanceof Map) {
                    b((Map<String, Object>) obj4);
                }
                Object obj5 = map.get("port");
                if (obj5 != null) {
                    c(Integer.parseInt(String.valueOf(obj5)));
                }
                Object obj6 = map.get("macro");
                if (obj6 instanceof Map) {
                    d((Map) obj6);
                }
                Object obj7 = map.get("retry");
                if (obj7 != null) {
                    try {
                        a(Integer.parseInt(String.valueOf(obj7)));
                    } catch (Exception e10) {
                        q0.b("NetworkRequestModel", e10.getMessage());
                    }
                }
                Object obj8 = map.get("retry_interval");
                if (obj8 != null) {
                    try {
                        b(Integer.parseInt(String.valueOf(obj8)));
                    } catch (Exception e11) {
                        q0.b("NetworkRequestModel", e11.getMessage());
                    }
                }
                Object obj9 = map.get("timeout");
                if (obj9 != null) {
                    try {
                        a(Long.parseLong(String.valueOf(obj9)));
                    } catch (Exception e12) {
                        q0.b("NetworkRequestModel", e12.getMessage());
                    }
                }
                Object obj10 = map.get("header");
                if (obj10 instanceof Map) {
                    c((Map<String, Object>) obj10);
                }
                Object obj11 = map.get("host_to_stop");
                if (obj11 instanceof List) {
                    a((List<String>) obj11);
                } else if (obj11 instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj11.toString());
                    a(arrayList2);
                }
                Object obj12 = map.get("request_type");
                if (obj12 != null) {
                    b(String.valueOf(obj12));
                }
            } catch (Exception e13) {
                q0.b("NetworkRequestModel", e13.getMessage(), e13);
            }
        }
    }

    public Map<String, Object> b() {
        return this.f36284e;
    }

    public void b(int i10) {
        this.f36286g = i10;
    }

    public void b(String str) {
        this.f36291l = str;
    }

    public void b(List<String> list) {
        this.f36281b = list;
    }

    public void b(Map<String, Object> map) {
        this.f36287h = map;
    }

    public List<String> c() {
        return this.f36280a;
    }

    public void c(int i10) {
        this.f36290k = i10;
    }

    public void c(String str) {
        this.f36282c = str;
    }

    public void c(Map<String, Object> map) {
        this.f36284e = map;
    }

    public Map<String, String> d() {
        return this.f36283d;
    }

    public void d(Map<String, String> map) {
        this.f36283d = map;
    }

    public String e() {
        return this.f36288i;
    }

    public String f() {
        return this.f36291l;
    }

    public int g() {
        return this.f36285f;
    }

    public int h() {
        return this.f36286g;
    }

    public String i() {
        return this.f36282c;
    }

    public int j() {
        return this.f36290k;
    }

    public long k() {
        return this.f36289j;
    }

    public List<String> l() {
        return this.f36281b;
    }
}

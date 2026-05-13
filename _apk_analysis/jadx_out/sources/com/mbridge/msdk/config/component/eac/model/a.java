package com.mbridge.msdk.config.component.eac.model;

import java.util.Map;

/* JADX INFO: compiled from: ForEachModel.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f35968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35970c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public String a() {
        return this.f35970c;
    }

    public void a(Object obj) {
        this.f35968a = obj;
    }

    public void a(String str) {
        this.f35970c = str;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("iteration_data");
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get("execute_condition");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("end_condition");
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f35969b;
    }

    public void b(String str) {
        this.f35969b = str;
    }

    public Object c() {
        return this.f35968a;
    }
}

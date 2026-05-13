package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4189og {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33165b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33166c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f33164a = new a();

    /* JADX INFO: renamed from: com.ironsource.og$a */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C4089j8.f32054k, Boolean.valueOf(C4189og.this.f33165b == 0));
            put(C4089j8.f32055l, Boolean.valueOf(C4189og.this.f33166c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4089j8.f32056m, bool);
            put(C4089j8.f32057n, bool);
        }
    }

    public JSONObject a() {
        return new JSONObject(this.f33164a);
    }

    public void a(String str, int i10, boolean z10) {
        if (this.f33164a.containsKey(str)) {
            this.f33164a.put(str, Boolean.valueOf(i10 == 0));
        }
        this.f33164a.put(C4089j8.f32056m, Boolean.valueOf(z10));
        this.f33164a.put(C4089j8.f32057n, Boolean.valueOf((this.f33164a.get(C4089j8.f32055l).booleanValue() || this.f33164a.get(C4089j8.f32054k).booleanValue()) && this.f33164a.get(C4089j8.f32056m).booleanValue()));
    }
}

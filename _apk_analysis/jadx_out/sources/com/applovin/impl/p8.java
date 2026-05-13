package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p8 f9551f = new p8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8 f9552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f9556e;

    private p8() {
        this.f9552a = null;
        this.f9553b = "";
        this.f9554c = Collections.emptyMap();
        this.f9555d = "";
        this.f9556e = Collections.emptyList();
    }

    public p8(String str, Map map, p8 p8Var) {
        this.f9552a = p8Var;
        this.f9553b = str;
        this.f9554c = Collections.unmodifiableMap(map);
        this.f9556e = new ArrayList();
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f9556e.size());
        for (p8 p8Var : this.f9556e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                arrayList.add(p8Var);
            }
        }
        return arrayList;
    }

    public Map a() {
        return this.f9554c;
    }

    public p8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f9556e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            p8 p8Var = (p8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
            arrayList.addAll(p8Var.b());
        }
        return null;
    }

    public List b() {
        return Collections.unmodifiableList(this.f9556e);
    }

    public p8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (p8 p8Var : this.f9556e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
        }
        return null;
    }

    public String c() {
        return this.f9553b;
    }

    public String d() {
        return this.f9555d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f9553b + "', text='" + this.f9555d + "', attributes=" + this.f9554c + '}';
    }
}

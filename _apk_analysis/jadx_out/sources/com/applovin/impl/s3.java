package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f9810c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f9811d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s3 f9812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s3 f9813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s3 f9814g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f9816b;

    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9820a;

        a(String str) {
            this.f9820a = str;
        }

        public String b() {
            return this.f9820a;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f9812e = a("ars", aVar, a.INSTALL);
        f9813f = a("ar", aVar);
        f9814g = a("ttdasi_ms", aVar);
    }

    private s3(String str, Set set) {
        this.f9815a = str;
        this.f9816b = set;
    }

    public static s3 a(String str) {
        return (s3) f9811d.get(str);
    }

    private static s3 a(String str, a... aVarArr) {
        Set set = f9810c;
        if (set.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        s3 s3Var = new s3(str, new HashSet(Arrays.asList(aVarArr)));
        set.add(str);
        f9811d.put(str, s3Var);
        return s3Var;
    }

    public String a() {
        return this.f9815a;
    }

    public boolean a(a aVar) {
        return this.f9816b.contains(aVar);
    }

    public boolean a(Object obj) {
        return obj instanceof s3;
    }

    public Set b() {
        return this.f9816b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!s3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = s3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = s3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = strA == null ? 43 : strA.hashCode();
        Set setB = b();
        return ((iHashCode + 59) * 59) + (setB != null ? setB.hashCode() : 43);
    }

    public String toString() {
        return this.f9815a;
    }
}

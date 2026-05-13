package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class u2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e3 f10465d;

    public u2(String str, String str2, boolean z10, e3 e3Var) {
        this.f10462a = str;
        this.f10463b = str2;
        this.f10464c = z10;
        this.f10465d = e3Var;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u2 u2Var) {
        return this.f10463b.compareToIgnoreCase(u2Var.f10463b);
    }

    public String a() {
        return this.f10463b;
    }

    public List b() {
        List listL = this.f10465d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f10462a) : listL;
    }

    public String c() {
        return this.f10462a;
    }

    public e3 d() {
        return this.f10465d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u2 u2Var = (u2) obj;
        String str = this.f10462a;
        if (str == null ? u2Var.f10462a != null : !str.equals(u2Var.f10462a)) {
            return false;
        }
        String str2 = this.f10463b;
        if (str2 == null ? u2Var.f10463b == null : str2.equals(u2Var.f10463b)) {
            return this.f10464c == u2Var.f10464c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f10462a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10463b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f10464c ? 1 : 0);
    }
}

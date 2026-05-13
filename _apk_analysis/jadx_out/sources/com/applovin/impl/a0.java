package com.applovin.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes9.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7611g;

    public a0(String str) {
        this(str, -1);
    }

    public a0(String str, int i10) {
        this.f7609e = str;
        this.f7610f = i10;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        boolean z10 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f7611g = z10;
        if (z10) {
            this.f7605a = a(strArrSplit[0]);
            this.f7606b = a(strArrSplit[1]);
            this.f7607c = a(strArrSplit[2]);
            this.f7608d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f7605a = "";
        this.f7606b = "";
        this.f7607c = "";
        this.f7608d = "";
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public String a() {
        return this.f7608d;
    }

    public boolean a(a0 a0Var) {
        if (!a0Var.b().equals(this.f7605a) || !a0Var.c().equals(this.f7606b) || !a0Var.e().equals(this.f7607c)) {
            return false;
        }
        if (a0Var.a().equals("")) {
            return true;
        }
        return a0Var.a().equals(this.f7608d);
    }

    public boolean a(Object obj) {
        return obj instanceof a0;
    }

    public String b() {
        return this.f7605a;
    }

    public String c() {
        return this.f7606b;
    }

    public String d() {
        return this.f7609e;
    }

    public String e() {
        return this.f7607c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!a0Var.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = a0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = a0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = a0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = a0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int f() {
        return this.f7610f;
    }

    public boolean g() {
        return this.f7605a.equals("applovin.com");
    }

    public boolean h() {
        return this.f7611g;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strE = e();
        int iHashCode3 = (iHashCode2 * 59) + (strE == null ? 43 : strE.hashCode());
        String strA = a();
        return (iHashCode3 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }
}

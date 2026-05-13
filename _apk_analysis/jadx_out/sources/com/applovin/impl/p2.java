package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9509d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9513d;

        public a a(int i10) {
            this.f9513d = i10;
            return this;
        }

        public a a(String str) {
            this.f9511b = str;
            return this;
        }

        public p2 a() {
            return new p2(this.f9510a, this.f9511b, this.f9512c, this.f9513d);
        }

        public a b(int i10) {
            this.f9512c = i10;
            return this;
        }

        public a b(String str) {
            this.f9510a = str;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f9510a + ", signature=" + this.f9511b + ", responseCode=" + this.f9512c + ", nonce=" + this.f9513d + ")";
        }
    }

    public p2(String str, String str2, int i10, int i11) {
        this.f9506a = str;
        this.f9507b = str2;
        this.f9508c = i10;
        this.f9509d = i11;
    }

    public static a a() {
        return new a();
    }

    public boolean a(Object obj) {
        return obj instanceof p2;
    }

    public int b() {
        return this.f9509d;
    }

    public int c() {
        return this.f9508c;
    }

    public String d() {
        return this.f9507b;
    }

    public String e() {
        return this.f9506a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p2Var.a(this) || c() != p2Var.c() || b() != p2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = p2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = p2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int iC = ((c() + 59) * 59) + b();
        String strE = e();
        int iHashCode = (iC * 59) + (strE == null ? 43 : strE.hashCode());
        String strD = d();
        return (iHashCode * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }
}

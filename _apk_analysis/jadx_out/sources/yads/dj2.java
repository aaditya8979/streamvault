package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class dj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f88875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f88876e;

    public dj2(String str, String str2, String str3, String str4, String str5) {
        this.f88872a = str;
        this.f88873b = str2;
        this.f88874c = str3;
        this.f88875d = str4;
        this.f88876e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        dj2 dj2Var = (dj2) obj;
        return ib3.a(this.f88872a, dj2Var.f88872a) && ib3.a(this.f88873b, dj2Var.f88873b) && ib3.a(this.f88874c, dj2Var.f88874c) && ib3.a(this.f88875d, dj2Var.f88875d) && ib3.a(this.f88876e, dj2Var.f88876e);
    }

    public final int hashCode() {
        String str = this.f88872a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f88873b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f88874c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f88875d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f88876e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}

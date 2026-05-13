package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class Nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26049b;

    public Nj(String str, String str2) {
        tn.p.k(str, "tableName");
        tn.p.k(str2, "tableSchema");
        this.f26048a = str;
        this.f26049b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nj)) {
            return false;
        }
        Nj nj2 = (Nj) obj;
        return tn.p.f(this.f26048a, nj2.f26048a) && tn.p.f(this.f26049b, nj2.f26049b);
    }

    public final int hashCode() {
        return this.f26049b.hashCode() + (this.f26048a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.f26048a + ", tableSchema=" + this.f26049b + ")";
    }
}

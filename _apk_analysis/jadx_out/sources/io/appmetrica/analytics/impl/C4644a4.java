package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4644a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f66333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66334c;

    public C4644a4(String str, Integer num, String str2) {
        this.f66332a = str;
        this.f66333b = num;
        this.f66334c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4644a4.class != obj.getClass()) {
            return false;
        }
        C4644a4 c4644a4 = (C4644a4) obj;
        if (!this.f66332a.equals(c4644a4.f66332a)) {
            return false;
        }
        Integer num = this.f66333b;
        if (num == null ? c4644a4.f66333b != null : !num.equals(c4644a4.f66333b)) {
            return false;
        }
        String str = this.f66334c;
        String str2 = c4644a4.f66334c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f66332a.hashCode() * 31;
        Integer num = this.f66333b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f66334c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}

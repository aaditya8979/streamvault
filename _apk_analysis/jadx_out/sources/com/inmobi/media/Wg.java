package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26544a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26545b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wg)) {
            return false;
        }
        Wg wg2 = (Wg) obj;
        return this.f26544a == wg2.f26544a && this.f26545b == wg2.f26545b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26545b) + (Integer.hashCode(this.f26544a) * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.f26544a + ", noOfSubscriptions=" + this.f26545b + ")";
    }
}

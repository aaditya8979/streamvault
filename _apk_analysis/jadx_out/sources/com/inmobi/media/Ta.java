package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f26351b;

    public Ta(int i10) {
        this.f26350a = i10;
        this.f26351b = null;
    }

    public Ta(int i10, Integer num) {
        this.f26350a = i10;
        this.f26351b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ta)) {
            return false;
        }
        Ta ta2 = (Ta) obj;
        return this.f26350a == ta2.f26350a && tn.p.f(this.f26351b, ta2.f26351b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f26350a) * 31;
        Integer num = this.f26351b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f26350a + ", errorCode=" + this.f26351b + ")";
    }
}

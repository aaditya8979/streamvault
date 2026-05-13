package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class L5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25857c;

    public L5(int i10, int i11, float f10) {
        this.f25855a = i10;
        this.f25856b = i11;
        this.f25857c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5)) {
            return false;
        }
        L5 l52 = (L5) obj;
        return this.f25855a == l52.f25855a && this.f25856b == l52.f25856b && Float.compare(this.f25857c, l52.f25857c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25857c) + AbstractC3414fi.a(this.f25856b, Integer.hashCode(this.f25855a) * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f25855a + ", height=" + this.f25856b + ", density=" + this.f25857c + ")";
    }
}

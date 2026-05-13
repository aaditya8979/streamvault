package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class Mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25971c;

    public Mi(int i10, int i11, int i12) {
        this.f25969a = i10;
        this.f25970b = i11;
        this.f25971c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mi)) {
            return false;
        }
        Mi mi2 = (Mi) obj;
        return this.f25969a == mi2.f25969a && this.f25970b == mi2.f25970b && this.f25971c == mi2.f25971c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25971c) + AbstractC3414fi.a(this.f25970b, Integer.hashCode(this.f25969a) * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.f25969a + ", minor=" + this.f25970b + ", patch=" + this.f25971c + ")";
    }
}

package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91378b;

    public jv(int i10, String str) {
        this.f91377a = str;
        this.f91378b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return tn.p.f(this.f91377a, jvVar.f91377a) && this.f91378b == jvVar.f91378b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91378b) + (this.f91377a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickQrcode(url=" + this.f91377a + ", sizeInPx=" + this.f91378b + ")";
    }
}

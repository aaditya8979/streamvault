package y8;

import k8.j;

/* JADX INFO: compiled from: FinderPattern.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f87371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j[] f87372c;

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f87370a = i10;
        this.f87371b = iArr;
        float f10 = i13;
        this.f87372c = new j[]{new j(i11, f10), new j(i12, f10)};
    }

    public j[] a() {
        return this.f87372c;
    }

    public int[] b() {
        return this.f87371b;
    }

    public int c() {
        return this.f87370a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f87370a == ((c) obj).f87370a;
    }

    public int hashCode() {
        return this.f87370a;
    }
}

package a6;

import java.util.Arrays;

/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f3591b;

    public n() {
        this(32);
    }

    public n(int i10) {
        this.f3591b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f3590a;
        long[] jArr = this.f3591b;
        if (i10 == jArr.length) {
            this.f3591b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f3591b;
        int i11 = this.f3590a;
        this.f3590a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f3590a) {
            return this.f3591b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f3590a);
    }

    public int c() {
        return this.f3590a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f3591b, this.f3590a);
    }
}

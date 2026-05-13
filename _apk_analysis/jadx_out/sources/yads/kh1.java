package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class kh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f91594b;

    public kh1() {
        this(0);
    }

    public kh1(int i10) {
        this.f91594b = new long[32];
    }

    public final long a(int i10) {
        if (i10 >= 0 && i10 < this.f91593a) {
            return this.f91594b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f91593a);
    }

    public final void a(long j10) {
        int i10 = this.f91593a;
        long[] jArr = this.f91594b;
        if (i10 == jArr.length) {
            this.f91594b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f91594b;
        int i11 = this.f91593a;
        this.f91593a = i11 + 1;
        jArr2[i11] = j10;
    }

    public final long[] a() {
        return Arrays.copyOf(this.f91594b, this.f91593a);
    }
}

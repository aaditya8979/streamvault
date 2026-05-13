package s7;

import java.util.Arrays;

/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f79523b;

    public r() {
        this(32);
    }

    public r(int i10) {
        this.f79523b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f79522a;
        long[] jArr = this.f79523b;
        if (i10 == jArr.length) {
            this.f79523b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f79523b;
        int i11 = this.f79522a;
        this.f79522a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f79522a) {
            return this.f79523b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f79522a);
    }

    public int c() {
        return this.f79522a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f79523b, this.f79522a);
    }
}

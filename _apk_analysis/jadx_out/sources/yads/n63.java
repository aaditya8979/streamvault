package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class n63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f92756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f92757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92759d;

    public n63() {
        this(0);
    }

    public n63(int i10) {
        this.f92756a = new long[10];
        this.f92757b = b();
    }

    public static Object[] b() {
        return new Object[10];
    }

    public final synchronized Object a(long j10) {
        return a(j10, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, boolean r14) {
        /*
            r11 = this;
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r0
        L7:
            int r4 = r11.f92759d
            if (r4 <= 0) goto L3b
            long[] r5 = r11.f92756a
            int r6 = r11.f92758c
            r7 = r5[r6]
            long r7 = r12 - r7
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 >= 0) goto L21
            if (r14 != 0) goto L3b
            long r9 = -r7
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 < 0) goto L21
            goto L3b
        L21:
            if (r4 <= 0) goto L35
            java.lang.Object[] r1 = r11.f92757b
            r3 = r1[r6]
            r1[r6] = r0
            int r6 = r6 + 1
            int r1 = r1.length
            int r6 = r6 % r1
            r11.f92758c = r6
            int r4 = r4 + (-1)
            r11.f92759d = r4
            r1 = r7
            goto L7
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.n63.a(long, boolean):java.lang.Object");
    }

    public final synchronized void a() {
        this.f92758c = 0;
        this.f92759d = 0;
        Arrays.fill(this.f92757b, (Object) null);
    }

    public final synchronized void a(Object obj, long j10) {
        if (this.f92759d > 0) {
            if (j10 <= this.f92756a[((this.f92758c + r0) - 1) % this.f92757b.length]) {
                a();
            }
        }
        int length = this.f92757b.length;
        if (this.f92759d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            Object[] objArr = new Object[i10];
            int i11 = this.f92758c;
            int i12 = length - i11;
            System.arraycopy(this.f92756a, i11, jArr, 0, i12);
            System.arraycopy(this.f92757b, this.f92758c, objArr, 0, i12);
            int i13 = this.f92758c;
            if (i13 > 0) {
                System.arraycopy(this.f92756a, 0, jArr, i12, i13);
                System.arraycopy(this.f92757b, 0, objArr, i12, this.f92758c);
            }
            this.f92756a = jArr;
            this.f92757b = objArr;
            this.f92758c = 0;
        }
        int i14 = this.f92758c;
        int i15 = this.f92759d;
        Object[] objArr2 = this.f92757b;
        int length2 = (i14 + i15) % objArr2.length;
        this.f92756a[length2] = j10;
        objArr2[length2] = obj;
        this.f92759d = i15 + 1;
    }

    public final synchronized Object c() {
        Object obj;
        int i10 = this.f92759d;
        obj = null;
        if (i10 != 0) {
            if (i10 <= 0) {
                throw new IllegalStateException();
            }
            Object[] objArr = this.f92757b;
            int i11 = this.f92758c;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            this.f92758c = (i11 + 1) % objArr.length;
            this.f92759d = i10 - 1;
            obj = obj2;
        }
        return obj;
    }
}

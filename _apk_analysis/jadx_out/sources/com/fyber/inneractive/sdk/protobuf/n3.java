package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n3 f19194f = new n3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f19197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19199e;

    public n3() {
        this(0, new int[8], new Object[8], true);
    }

    public n3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f19198d = -1;
        this.f19195a = i10;
        this.f19196b = iArr;
        this.f19197c = objArr;
        this.f19199e = z10;
    }

    public static n3 a(n3 n3Var, n3 n3Var2) {
        int i10 = n3Var.f19195a + n3Var2.f19195a;
        int[] iArrCopyOf = Arrays.copyOf(n3Var.f19196b, i10);
        System.arraycopy(n3Var2.f19196b, 0, iArrCopyOf, n3Var.f19195a, n3Var2.f19195a);
        Object[] objArrCopyOf = Arrays.copyOf(n3Var.f19197c, i10);
        System.arraycopy(n3Var2.f19197c, 0, objArrCopyOf, n3Var.f19195a, n3Var2.f19195a);
        return new n3(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final int a() {
        int iB;
        int i10 = this.f19198d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f19195a; i11++) {
            int i12 = this.f19196b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iB = b0.b(i13) + b0.a(((Long) this.f19197c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f19197c[i11]).getClass();
                iB = b0.b(i13) + 8;
            } else if (i14 == 2) {
                iB = b0.a((s) this.f19197c[i11]) + b0.b(i13);
            } else if (i14 == 3) {
                iA = ((n3) this.f19197c[i11]).a() + (b0.b(i13) * 2) + iA;
            } else {
                if (i14 != 5) {
                    int i15 = n1.f19193a;
                    throw new IllegalStateException(new m1());
                }
                ((Integer) this.f19197c[i11]).getClass();
                iB = b0.b(i13) + 4;
            }
            iA = iB + iA;
        }
        this.f19198d = iA;
        return iA;
    }

    public final void a(int i10, Object obj) {
        if (!this.f19199e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f19195a;
        int[] iArr = this.f19196b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f19196b = Arrays.copyOf(iArr, i12);
            this.f19197c = Arrays.copyOf(this.f19197c, i12);
        }
        int[] iArr2 = this.f19196b;
        int i13 = this.f19195a;
        iArr2[i13] = i10;
        this.f19197c[i13] = obj;
        this.f19195a = i13 + 1;
    }

    public final void a(c0 c0Var) {
        if (this.f19195a == 0) {
            return;
        }
        c0Var.getClass();
        for (int i10 = 0; i10 < this.f19195a; i10++) {
            int i11 = this.f19196b[i10];
            Object obj = this.f19197c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c0Var.f19107a.b(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c0Var.f19107a.a(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c0Var.f19107a.a(i12, (s) obj);
            } else if (i13 == 3) {
                c0Var.f19107a.c(i12, 3);
                ((n3) obj).a(c0Var);
                c0Var.f19107a.c(i12, 4);
            } else {
                if (i13 != 5) {
                    int i14 = n1.f19193a;
                    throw new RuntimeException(new m1());
                }
                c0Var.f19107a.a(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean a(int i10, w wVar) throws m1 {
        int iT;
        if (!this.f19199e) {
            throw new UnsupportedOperationException();
        }
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            a(i10, Long.valueOf(wVar.l()));
            return true;
        }
        if (i12 == 1) {
            a(i10, Long.valueOf(wVar.i()));
            return true;
        }
        if (i12 == 2) {
            a(i10, wVar.e());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 == 5) {
                a(i10, Integer.valueOf(wVar.h()));
                return true;
            }
            int i13 = n1.f19193a;
            throw new m1();
        }
        n3 n3Var = new n3();
        do {
            iT = wVar.t();
            if (iT == 0) {
                break;
            }
        } while (n3Var.a(iT, wVar));
        wVar.a((i11 << 3) | 4);
        a(i10, n3Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        int i10 = this.f19195a;
        if (i10 == n3Var.f19195a) {
            int[] iArr = this.f19196b;
            int[] iArr2 = n3Var.f19196b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f19197c;
                    Object[] objArr2 = n3Var.f19197c;
                    int i12 = this.f19195a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f19195a;
        int i11 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f19196b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f19197c;
        int i15 = this.f19195a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}

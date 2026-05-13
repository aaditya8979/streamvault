package e7;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes10.dex */
public interface c0 {

    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f60841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f60842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f60843c;

        public a(int i10) {
            this(i10, new Random());
        }

        public a(int i10, Random random) {
            this(a(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f60842b = iArr;
            this.f60841a = random;
            this.f60843c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f60843c[iArr[i10]] = i10;
            }
        }

        public static int[] a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // e7.c0
        public c0 cloneAndClear() {
            return new a(0, new Random(this.f60841a.nextLong()));
        }

        @Override // e7.c0
        public c0 cloneAndInsert(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f60841a.nextInt(this.f60842b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f60841a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f60842b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f60842b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f60841a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // e7.c0
        public c0 cloneAndRemove(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f60842b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f60842b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f60841a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // e7.c0
        public int getFirstIndex() {
            int[] iArr = this.f60842b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // e7.c0
        public int getLastIndex() {
            int[] iArr = this.f60842b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // e7.c0
        public int getLength() {
            return this.f60842b.length;
        }

        @Override // e7.c0
        public int getNextIndex(int i10) {
            int i11 = this.f60843c[i10] + 1;
            int[] iArr = this.f60842b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // e7.c0
        public int getPreviousIndex(int i10) {
            int i11 = this.f60843c[i10] - 1;
            if (i11 >= 0) {
                return this.f60842b[i11];
            }
            return -1;
        }
    }

    c0 cloneAndClear();

    c0 cloneAndInsert(int i10, int i11);

    c0 cloneAndRemove(int i10, int i11);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i10);

    int getPreviousIndex(int i10);
}

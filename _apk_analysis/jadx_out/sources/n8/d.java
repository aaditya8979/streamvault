package n8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: HighLevelEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f75263b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f75264c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f75265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f75266e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f75267a;

    /* JADX INFO: compiled from: HighLevelEncoder.java */
    public class a implements Comparator<f> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.e() - fVar2.e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f75265d = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f75265d[0][i10] = (i10 - 65) + 2;
        }
        f75265d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f75265d[1][i11] = (i11 - 97) + 2;
        }
        f75265d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f75265d[2][i12] = (i12 - 48) + 2;
        }
        int[] iArr2 = f75265d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f75265d[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f75265d[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f75266e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f75266e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr) {
        this.f75267a = bArr;
    }

    public static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            boolean z10 = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.g(fVar)) {
                    z10 = false;
                    break;
                }
                if (fVar.g(fVar2)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    public static void d(f fVar, int i10, int i11, Collection<f> collection) {
        f fVarC = fVar.c(i10);
        collection.add(fVarC.h(4, i11));
        if (fVar.f() != 4) {
            collection.add(fVarC.i(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(fVarC.h(2, 16 - i11).h(2, 1));
        }
        if (fVar.d() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    public static Collection<f> f(Iterable<f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o8.a a() {
        /*
            r8 = this;
            n8.f r0 = n8.f.f75271e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L8:
            byte[] r3 = r8.f75267a
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = r1
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = r1
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.e(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            n8.d$a r1 = new n8.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            n8.f r0 = (n8.f) r0
            byte[] r1 = r8.f75267a
            o8.a r0 = r0.j(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.d.a():o8.a");
    }

    public final void c(f fVar, int i10, Collection<f> collection) {
        char c10 = (char) (this.f75267a[i10] & 255);
        boolean z10 = f75265d[fVar.f()][c10] > 0;
        f fVarC = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f75265d[i11][c10];
            if (i12 > 0) {
                if (fVarC == null) {
                    fVarC = fVar.c(i10);
                }
                if (!z10 || i11 == fVar.f() || i11 == 2) {
                    collection.add(fVarC.h(i11, i12));
                }
                if (!z10 && f75266e[fVar.f()][i11] >= 0) {
                    collection.add(fVarC.i(i11, i12));
                }
            }
        }
        if (fVar.d() > 0 || f75265d[fVar.f()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    public final Collection<f> e(Iterable<f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i10, linkedList);
        }
        return b(linkedList);
    }
}

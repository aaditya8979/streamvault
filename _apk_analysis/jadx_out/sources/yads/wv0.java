package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wv0 {
    public static aw0 a(jb2 jb2Var) {
        jb2Var.e(jb2Var.f91148b + 1);
        int iO = jb2Var.o();
        long j10 = ((long) jb2Var.f91148b) + ((long) iO);
        int i10 = iO / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jI = jb2Var.i();
            if (jI == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jI;
            jArrCopyOf2[i11] = jb2Var.i();
            jb2Var.e(jb2Var.f91148b + 2);
            i11++;
        }
        int i12 = jb2Var.f91148b;
        jb2Var.e(i12 + ((int) (j10 - ((long) i12))));
        return new aw0(jArrCopyOf, jArrCopyOf2);
    }
}

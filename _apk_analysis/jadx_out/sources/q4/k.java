package q4;

import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f77771a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153};

    public static boolean a(int i10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        for (int i11 : f77771a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(k4.h hVar) throws InterruptedException, IOException {
        return c(hVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
    
        r2 = r8 ? 1 : 0;
        r3 = true;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        r3 = true;
        r0 = r2 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        if (r10 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
    
        if (r23 != r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e4, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(k4.h r22, boolean r23) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.k.c(k4.h, boolean):boolean");
    }

    public static boolean d(k4.h hVar) throws InterruptedException, IOException {
        return c(hVar, false);
    }
}

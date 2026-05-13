package q6;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import s7.a0;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f77957a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f77957a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(i6.l lVar) throws IOException {
        return c(lVar, true, false);
    }

    public static boolean c(i6.l lVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long length = lVar.getLength();
        long j10 = -1;
        long j11 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j11 = length;
        }
        int i10 = (int) j11;
        a0 a0Var = new a0(64);
        boolean z17 = false;
        int i11 = 0;
        boolean z18 = false;
        while (i11 < i10) {
            a0Var.L(8);
            if (!lVar.peekFully(a0Var.d(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long jF = a0Var.F();
            int iN = a0Var.n();
            int i12 = 16;
            if (jF == 1) {
                lVar.peekFully(a0Var.d(), 8, 8);
                a0Var.O(16);
                jF = a0Var.w();
            } else {
                if (jF == 0) {
                    long length2 = lVar.getLength();
                    if (length2 != j10) {
                        jF = (length2 - lVar.getPeekPosition()) + ((long) 8);
                    }
                }
                i12 = 8;
            }
            long j12 = i12;
            if (jF < j12) {
                return z17;
            }
            i11 += i12;
            if (iN == 1836019574) {
                i10 += (int) jF;
                if (length != -1 && i10 > length) {
                    i10 = (int) length;
                }
            } else {
                if (iN == 1836019558 || iN == 1836475768) {
                    z12 = z17 ? 1 : 0;
                    z13 = true;
                    z14 = true;
                    break;
                }
                long j13 = length;
                if ((((long) i11) + jF) - j12 >= i10) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i13 = (int) (jF - j12);
                i11 += i13;
                if (iN != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i13 != 0) {
                        lVar.advancePeekPosition(i13);
                        z18 = z18;
                    }
                } else {
                    if (i13 < 8) {
                        return false;
                    }
                    a0Var.L(i13);
                    lVar.peekFully(a0Var.d(), 0, i13);
                    int i14 = i13 / 4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            z16 = z18;
                            break;
                        }
                        if (i15 == 1) {
                            a0Var.Q(4);
                        } else if (a(a0Var.n(), z11)) {
                            z16 = true;
                            break;
                        }
                        i15++;
                    }
                    if (!z16) {
                        return false;
                    }
                    z15 = false;
                    z18 = z16;
                }
                z17 = z15;
                length = j13;
            }
            j10 = -1;
            z18 = z18;
        }
        z12 = z17 ? 1 : 0;
        z13 = true;
        z14 = z12 ? 1 : 0;
        return (z18 && z10 == z14) ? z13 : z12;
    }

    public static boolean d(i6.l lVar, boolean z10) throws IOException {
        return c(lVar, false, z10);
    }
}

package com.facebook.ads.redexgen.core;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
public abstract class AbstractC1875Ik {
    public static String[] A00 = {"FTgkNuEfB21sdffM4MB", "AHdMCcfHPrYhHZuJq7ar8kaDD0", "m1AQBHavwMcQPTMSh8yPHqRX8TIuxSKu", "w1PNvsr2QHXMQttzrVJcJFpvqWAZZ2ue", "3yahnNe", "CLySAaMkPHNUkUwJF2Q2hF0h64PJDpTx", "AMIcFao4vlNbyapwbaOz2OEX2RJAnqn2", "UMo3DITmDXTtEPejAH8oJ9deLVPgGECA"};
    public static final int[] A01 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A00(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (A00[1].length() == 5) {
            throw new RuntimeException();
        }
        A00[1] = "W7vtI7n9AGcg3kiZwr1R4Wd";
        if (i10 == 1751476579 && z10) {
            return true;
        }
        int[] iArr = A01;
        if (A00[1].length() == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[6] = "p6Add4WRgBlZ7U9sigG7YhPBNKEcLx90";
        strArr[7] = "5Tff00eh7q1qfGppTlmWVovL6e7TawLb";
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(InterfaceC2995lN interfaceC2995lN) throws IOException {
        return A03(interfaceC2995lN, true, false);
    }

    public static boolean A02(InterfaceC2995lN interfaceC2995lN, boolean z10) throws IOException {
        return A03(interfaceC2995lN, false, z10);
    }

    public static boolean A03(InterfaceC2995lN interfaceC2995lN, boolean z10, boolean z11) throws IOException {
        long jA8G = interfaceC2995lN.A8G();
        long j10 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jA8G != -1 && jA8G <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j10 = jA8G;
        }
        int i10 = (int) j10;
        C4J c4j = new C4J(64);
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        while (i11 < i10) {
            int i12 = 8;
            c4j.A0d(8);
            if (!interfaceC2995lN.AGA(c4j.A0l(), 0, 8, true)) {
                break;
            }
            long jA0Q = c4j.A0Q();
            int iA0C = c4j.A0C();
            if (jA0Q == 1) {
                i12 = 16;
                interfaceC2995lN.AG9(c4j.A0l(), 8, 8);
                c4j.A0e(16);
                jA0Q = c4j.A0P();
            } else if (jA0Q == 0) {
                long jA8G2 = interfaceC2995lN.A8G();
                if (jA8G2 != -1) {
                    jA0Q = (jA8G2 - interfaceC2995lN.A8a()) + ((long) 8);
                }
            }
            if (jA0Q < i12) {
                return false;
            }
            i11 += i12;
            if (iA0C == 1836019574) {
                int i13 = (int) jA0Q;
                String[] strArr = A00;
                if (strArr[2].charAt(21) == strArr[5].charAt(21)) {
                    throw new RuntimeException();
                }
                A00[1] = "1NOCBl6uYr6a5zcz7K9cJi9";
                i10 += i13;
                if (jA8G != -1 && i10 > jA8G) {
                    i10 = (int) jA8G;
                }
            } else {
                if (iA0C == 1836019558 || iA0C == 1836475768) {
                    z13 = true;
                    break;
                }
                if ((((long) i11) + jA0Q) - ((long) i12) >= i10) {
                    break;
                }
                int i14 = (int) (jA0Q - ((long) i12));
                i11 += i14;
                if (iA0C == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    c4j.A0d(i14);
                    interfaceC2995lN.AG9(c4j.A0l(), 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            break;
                        }
                        if (i16 == 1) {
                            c4j.A0g(4);
                        } else if (A00(c4j.A0C(), z11)) {
                            z12 = true;
                            break;
                        }
                        i16++;
                    }
                    if (!z12) {
                        return false;
                    }
                } else if (i14 != 0) {
                    interfaceC2995lN.A3z(i14);
                }
            }
        }
        return z12 && z10 == z13;
    }
}

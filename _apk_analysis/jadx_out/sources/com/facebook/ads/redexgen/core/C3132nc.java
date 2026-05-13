package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3132nc extends C15434z {
    public static byte[] A02;
    public final int A00;
    public final AnonymousClass56 A01;

    static {
        A06();
    }

    public C3132nc(AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public C3132nc(IOException iOException, AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(iOException, A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public C3132nc(String str, AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(str, A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public C3132nc(String str, IOException iOException, AnonymousClass56 anonymousClass56, int i10, int i11) {
        super(str, iOException, A03(i10, i11));
        this.A01 = anonymousClass56;
        this.A00 = i11;
    }

    public static int A03(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static C3132nc A04(final IOException iOException, final AnonymousClass56 anonymousClass56, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC2836iY.A01(message).matches(A05(0, 26, 62))) ? 2001 : 2007;
        return i11 == 2007 ? new C3132nc(iOException, anonymousClass56) { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A00;
            public static String[] A01 = {"IiHFHpE70aCOc94efxOlf2iC0Ng8zMr5", "b3mzaytlZJgoRVhs4UINeaUr6S0G0E41", "6IHqdrhMw9UxFnoc7iMNxZeDC0DTO0yB", "go0dTVggBQ2s7heaJCrnqGQgIh6JhPx1", "bkC24C7HhnNqTiNutYzB4zMXotuBenI", "te5qRCwogDd297VgLok2fv8nwYFOdDR1", "xjDDw5bsf4CogqtV7hhNk6k9HWMs2JIA", "oLDdWjUmHvVvISH87gP40QDZoo9t6EZz"};

            static {
                A02();
            }

            {
                String strA01 = A01(0, 121, 4);
            }

            public static String A01(int i12, int i13, int i14) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i12, i12 + i13);
                int i15 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    if (A01[0].charAt(11) != 'O') {
                        throw new RuntimeException();
                    }
                    A01[2] = "31sOmOCDO5yq31NNiMqquOfpDH8J50WI";
                    if (i15 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i15] = (byte) ((bArrCopyOfRange[i15] ^ i14) ^ 39);
                    i15++;
                }
            }

            public static void A02() {
                A00 = new byte[]{96, 79, 70, 66, 81, 87, 70, 91, 87, 3, 107, 119, 119, 115, 3, 87, 81, 66, 69, 69, 74, 64, 3, 77, 76, 87, 3, 83, 70, 81, 78, 74, 87, 87, 70, 71, 13, 3, 112, 70, 70, 3, 75, 87, 87, 83, 80, 25, 12, 12, 71, 70, 85, 70, 79, 76, 83, 70, 81, 13, 66, 77, 71, 81, 76, 74, 71, 13, 64, 76, 78, 12, 68, 86, 74, 71, 70, 12, 87, 76, 83, 74, 64, 80, 12, 78, 70, 71, 74, 66, 12, 74, 80, 80, 86, 70, 80, 12, 64, 79, 70, 66, 81, 87, 70, 91, 87, 14, 77, 76, 87, 14, 83, 70, 81, 78, 74, 87, 87, 70, 71};
            }
        } : new C3132nc(iOException, anonymousClass56, i11, i10);
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{ExifInterface.MARKER_EOI, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }
}

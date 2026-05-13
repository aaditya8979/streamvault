package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1707Bw implements InterfaceC2638f8 {
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"HV3bjOQFG6hG19mK6btv5ZItymBNR4jb", "f8frJPlJVlZQfTmtqYpYtimfJzE", "snhVz6l74gACRZpxcVOl8ZhDE", "ioIXRoWDB2y5rIxXUVMK", "pJOGedThy6U23H0Dqr8MrVjxKTkAUTUw", "Z2sPBilUji", "eoagJWSpw9dhQ5uILEfDMJsGfxbL2OXR", "ioOrVGKFmPeoWtk9SUaiMK94AxkbTfSp"};
    public static final InterfaceC2637f6 A06;
    public static final String A07;
    public long A00 = 0;
    public final f7 A01;
    public final InterfaceC2643fD A02;

    static {
        A02();
        A07 = C1707Bw.class.getSimpleName();
        A06 = new C1708Bx();
        A03 = false;
    }

    public C1707Bw(f7 f7Var, InterfaceC2643fD interfaceC2643fD) {
        this.A01 = f7Var;
        this.A02 = interfaceC2643fD;
        new Thread(new RunnableC2639f9(this)).start();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            String[] strArr = A05;
            if (strArr[2].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "SjioWZFjItKuhqld4sWZUQTfHHPQcsy5";
            strArr2[4] = "wEt2AMMlWwKWRpacJrxPlGBsPjvVn5Jo";
            bArrCopyOfRange[i13] = (byte) (i14 - 117);
        }
        return new String(bArrCopyOfRange);
    }

    private void A01() {
        while (true) {
            synchronized (this) {
                if (this.A00 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    long jA5e = this.A02.A5e();
                    if (jA5e < this.A00) {
                        int i10 = (int) ((this.A00 - jA5e) / 1000000);
                        if (i10 >= 1) {
                            String.format(Locale.US, A00(92, 20, 70), Integer.valueOf(i10));
                            try {
                                this.A02.AJK(this, i10);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                    this.A00 = 0L;
                    this.A01.AI4();
                    long jA5e2 = this.A02.A5e();
                    if (0 != 0) {
                        throw new NullPointerException(A00(112, 13, 31));
                    }
                    synchronized (this) {
                        if (this.A00 < jA5e2) {
                            String.format(Locale.US, A00(21, 71, 15), Long.valueOf(jA5e2), Long.valueOf(this.A00));
                            this.A00 = 0L;
                        }
                    }
                }
            }
        }
    }

    public static void A02() {
        if (A05[0].charAt(9) == 'h') {
            throw new RuntimeException();
        }
        A05[7] = "NMMzHy25EZUbJzWBlBjuS5XjO6LPkHkX";
        A04 = new byte[]{-8, 33, 36, 21, 27, 32, 25, -46, 32, 23, ExifInterface.START_CODE, 38, -46, 37, 43, 32, 21, -46, 19, 38, -46, -47, -27, -10, -17, -92, -27, -9, -92, -14, -13, -92, -9, -3, -14, -25, -20, -10, -13, -14, -19, -2, -27, -8, -19, -13, -14, -92, -9, -25, -20, -23, -24, -7, -16, -23, -24, -78, -92, -48, -27, -9, -8, -92, -9, -3, -14, -25, -92, -27, -8, -92, -87, -24, -78, -92, -46, -23, -4, -8, -92, -9, -3, -14, -25, -92, -27, -8, -92, -87, -24, -78, 14, 39, 32, 32, 43, -37, 33, ExifInterface.START_CODE, 45, -37, -32, 31, -37, 40, 36, 39, 39, 36, 46, -23, 3, 2, -26, 9, 2, -38, -3, 2, -3, 7, -4, -7, -8};
    }

    public static /* synthetic */ void A03(C1707Bw c1707Bw) {
        c1707Bw.A01();
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2638f8
    public final synchronized void A6T(int i10) {
        long jA5e = this.A02.A5e() + (((long) i10) * 1000000 * ((long) (A03 ? 1 : 1000)));
        if (this.A00 == 0 || this.A00 > jA5e) {
            this.A00 = jA5e;
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2638f8
    public final synchronized void A6U() {
        this.A00 = this.A02.A5e();
        String str = A00(0, 21, 61) + this.A00;
        notifyAll();
    }
}

package com.facebook.ads.redexgen.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class a5 {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public MF A00;
    public MH A01;
    public AbstractC2804hy A02;
    public C2228Wh A03;
    public InterfaceC2242Wv A04;
    public InterfaceC2329a4 A05;
    public boolean A06;
    public boolean A07;
    public final N3 A08;
    public final C2529dL A09;
    public final US A0A;
    public final XH A0B;
    public final InterfaceC2260Xn A0C;
    public final C2602eX A0D;
    public final String A0E;

    static {
        A03();
        A0F = 0L;
    }

    public a5(C2529dL c2529dL, String str, C2602eX c2602eX, XH xh2, US us2, N3 n32) {
        this(c2529dL, str, c2602eX, xh2, us2, n32, new KF());
    }

    public a5(C2529dL c2529dL, String str, C2602eX c2602eX, XH xh2, US us2, N3 n32, InterfaceC2260Xn interfaceC2260Xn) {
        this.A06 = true;
        this.A09 = c2529dL;
        this.A0E = str;
        this.A0D = c2602eX;
        this.A0B = xh2;
        this.A0A = us2;
        this.A08 = n32;
        this.A0C = interfaceC2260Xn;
    }

    public a5(C2529dL c2529dL, String str, C2602eX c2602eX, XH xh2, US us2, N3 n32, InterfaceC2260Xn interfaceC2260Xn, InterfaceC2242Wv interfaceC2242Wv) {
        this.A06 = true;
        this.A09 = c2529dL;
        this.A0E = str;
        this.A0D = c2602eX;
        this.A0B = xh2;
        this.A0A = us2;
        this.A08 = n32;
        this.A0C = interfaceC2260Xn;
        this.A04 = interfaceC2242Wv;
    }

    private ME A00(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 33);
        ME meA0G = ME.A09;
        try {
            XP.A0Y(map, this.A02);
            Uri uriA00 = WQ.A00(str2);
            if (this.A01 == null) {
                this.A01 = MI.A01(this.A09, this.A0A, str, uriA00, new C2314Zp(map).A03(this.A0D).A02(this.A0B).A05(), this.A06, this.A07, this.A08);
                A02();
            }
            if (this.A01 instanceof C7Q) {
                ((C7Q) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                meA0G = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A07 && (this.A01 instanceof C7P)) {
                    meA0G = ME.A08;
                }
            }
            if (!(((this.A01 instanceof C7O) || (this.A01 instanceof C7Q)) && XP.A0e(this.A09, meA0G, map)) && meA0G != ME.A06) {
                if (this.A05 != null) {
                    this.A05.ACu();
                }
                this.A0C.A4b(this.A0E);
            }
        } catch (ActivityNotFoundException e10) {
            Log.e(strA01, A01(44, 20, 68) + str2, e10);
        } catch (Exception e11) {
            Log.e(strA01, A01(22, 22, 27), e11);
        }
        return meA0G;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    private void A02() {
        if (this.A01 == null || this.A01.A0E() != null || this.A00 == null) {
            return;
        }
        this.A01.A0F(this.A00);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, ExifInterface.MARKER_EOI, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    public static boolean A04(C2529dL c2529dL) {
        boolean zA2o = U7.A2o(c2529dL);
        int iA07 = U7.A07(c2529dL);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0F;
        if (zA2o && A0F > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final ME A05(String str, String str2, Map<String, String> map) {
        ME meA00 = ME.A09;
        new C2172Ua(str, this.A0A).A04(UZ.A0J, map);
        if (this.A0B.A09(this.A09)) {
            this.A0A.AAs(str, map);
        } else {
            meA00 = A00(str, str2, map);
            if (this.A02 != null && this.A02.A20().A0L() != null && this.A04 != null) {
                WX.A07(this.A09.A02(), this.A02.A20().A0L(), this.A04);
            }
        }
        return meA00;
    }

    public final MF A06() {
        if (this.A01 == null) {
            return null;
        }
        MF mfA0E = this.A01.A0E();
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
        strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
        return mfA0E;
    }

    public final void A07(MF mf2) {
        this.A00 = mf2;
        A02();
    }

    public final void A08(AbstractC2804hy abstractC2804hy) {
        this.A02 = abstractC2804hy;
    }

    public final void A09(C2228Wh c2228Wh) {
        this.A03 = c2228Wh;
    }

    public final void A0A(InterfaceC2242Wv interfaceC2242Wv) {
        this.A04 = interfaceC2242Wv;
    }

    public final void A0B(InterfaceC2329a4 interfaceC2329a4) {
        this.A05 = interfaceC2329a4;
    }

    public final void A0C(boolean z10) {
        this.A07 = z10;
    }
}

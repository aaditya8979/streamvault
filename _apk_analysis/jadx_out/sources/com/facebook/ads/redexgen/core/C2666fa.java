package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2666fa implements NX {
    public static byte[] A03;
    public static String[] A04 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};
    public RO A00;
    public C2529dL A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public C2666fa(RO ro2, C2529dL c2529dL, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = ro2;
        this.A01 = c2529dL;
        this.A02 = mediaCacheFlag;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[6].length() == 1) {
                throw new RuntimeException();
            }
            A04[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 88);
            i13++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-26, ExifInterface.MARKER_EOI, -20, ExifInterface.MARKER_APP1, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    @Override // com.facebook.ads.redexgen.core.NX
    public final void ADB(V1 v12) {
        AbstractC2207Vk.A00(new C2669fd(this, v12));
    }

    @Override // com.facebook.ads.redexgen.core.NX
    public final void AEJ(List<C2825iN> list) {
        SF sf2 = new SF(this.A01);
        String strA02 = A02(6, 7, 23);
        for (C2825iN c2825iN : list) {
            if (A02(6, 7, 23).equals(strA02)) {
                strA02 = c2825iN.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c2825iN.A0E().A0F() != null) {
                    sf2.A0c(new SD(c2825iN.A0E().A0F().getUrl(), c2825iN.A0E().A0F().getHeight(), c2825iN.A0E().A0F().getWidth(), c2825iN.A0G(), A02(0, 6, 32)));
                }
                if (c2825iN.A0E().A0E() != null) {
                    sf2.A0c(new SD(c2825iN.A0E().A0E().getUrl(), c2825iN.A0E().A0E().getHeight(), c2825iN.A0E().A0E().getWidth(), c2825iN.A0G(), A02(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c2825iN.A0E().A0b())) {
                    sf2.A0b(new SB(c2825iN.A0E().A0b(), c2825iN.A0G(), A02(0, 6, 32), c2825iN.A0E().A0A()));
                }
            }
        }
        sf2.A0X(new C2667fb(this, list), new S8(strA02, A02(0, 6, 32)));
    }
}

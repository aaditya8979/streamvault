package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15926w extends AbstractC2775hQ {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    static {
        A03();
    }

    public C15926w(C2529dL c2529dL, NT nt) {
        super(c2529dL, nt);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j10));
        return map;
    }

    public static void A03() {
        A00 = new byte[]{ExifInterface.START_CODE, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, ExifInterface.START_CODE, 47, 50, 107, 36, 57, 107, ExifInterface.START_CODE, 39, 57, 46, ExifInterface.START_CODE, 47, 50, 107, 47, 34, 56, 59, 39, ExifInterface.START_CODE, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> list, Map<String, String> map) {
        if (list != null) {
            boolean zIsEmpty = list.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (zIsEmpty) {
                return;
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                new AsyncTaskC2628ex(this.A0B, map).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2775hQ
    public final void A0P() {
        C2825iN c2825iN = (C2825iN) this.A01;
        if (!c2825iN.A0R()) {
            throw new IllegalStateException(A00(0, 36, 55));
        }
        MQ mq2 = this.A07;
        if (A01[3].charAt(25) != 'c') {
            throw new RuntimeException();
        }
        A01[4] = "SmlVqZ";
        if (mq2 != null) {
            this.A07.A0B(c2825iN);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2775hQ
    public final void A0R(MP mp2, TE te2, TC tc2, NU nu) {
        C2825iN c2825iN = (C2825iN) mp2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2772hN c2772hN = new C2772hN(this, nu, c2825iN, jCurrentTimeMillis, tc2);
        A0H().postDelayed(c2772hN, te2.A05().A05());
        c2825iN.A0L(this.A0B, new C2771hM(this, c2772hN, jCurrentTimeMillis, tc2), this.A09, nu, C2072Qc.A0K());
    }
}

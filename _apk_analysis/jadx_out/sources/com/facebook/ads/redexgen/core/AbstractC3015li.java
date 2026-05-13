package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3015li extends EK {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public EC A00;

    public static int A0Y(C7D[] c7dArr, C3172oH c3172oH, int[] iArr, boolean z10) throws C9Y {
        int length = c7dArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < c7dArr.length; i11++) {
            C7D c7d = c7dArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < c3172oH.A01; i12++) {
                iMax = Math.max(iMax, AnonymousClass76.A03(c7d.AJb(c3172oH.A08(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                i10 = iMax;
                z11 = z12;
            }
        }
        return length;
    }

    public static int[] A0Z(C7D c7d, C3172oH c3172oH) throws C9Y {
        int[] iArr = new int[c3172oH.A01];
        for (int i10 = 0; i10 < c3172oH.A01; i10++) {
            iArr[i10] = c7d.AJb(c3172oH.A08(i10));
        }
        return iArr;
    }

    public static int[] A0a(C7D[] c7dArr) throws C9Y {
        int[] iArr = new int[c7dArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iAJd = c7dArr[i10].AJd();
            String[] strArr = A01;
            if (strArr[4].charAt(23) == strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i10] = iAJd;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final EL A0b(C7D[] c7dArr, C3043mA c3043mA, C3053mL c3053mL, Timeline timeline) throws C9Y {
        int[] iArr = new int[c7dArr.length + 1];
        C3172oH[][] c3172oHArr = new C3172oH[c7dArr.length + 1][];
        int[][][] iArr2 = new int[c7dArr.length + 1][][];
        for (int i10 = 0; i10 < c3172oHArr.length; i10++) {
            c3172oHArr[i10] = new C3172oH[c3043mA.A01];
            iArr2[i10] = new int[c3043mA.A01][];
        }
        int[] iArrA0a = A0a(c7dArr);
        for (int i11 = 0; i11 < c3043mA.A01; i11++) {
            C3172oH c3172oHA05 = c3043mA.A05(i11);
            int iA0Y = A0Y(c7dArr, c3172oHA05, iArr, c3172oHA05.A02 == 5);
            int[] iArrA0Z = iA0Y == c7dArr.length ? new int[c3172oHA05.A01] : A0Z(c7dArr[iA0Y], c3172oHA05);
            int i12 = iArr[iA0Y];
            c3172oHArr[iA0Y][i12] = c3172oHA05;
            iArr2[iA0Y][i12] = iArrA0Z;
            iArr[iA0Y] = iArr[iA0Y] + 1;
        }
        C3043mA[] c3043mAArr = new C3043mA[c7dArr.length];
        String[] strArr = new String[c7dArr.length];
        int[] iArr3 = new int[c7dArr.length];
        int i13 = 0;
        while (true) {
            int length = c7dArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i13 >= length) {
                EC ec2 = new EC(strArr, iArr3, c3043mAArr, iArrA0a, iArr2, new C3043mA((C3172oH[]) AbstractC15184a.A1I(c3172oHArr[c7dArr.length], iArr[c7dArr.length])));
                Pair<C7G[], InterfaceC3016lj[]> pairA0d = A0d(ec2, iArr2, iArrA0a, c3053mL, timeline);
                return new EL((C7G[]) pairA0d.first, (InterfaceC3016lj[]) pairA0d.second, EH.A00(ec2, (EE[]) pairA0d.second), ec2);
            }
            int i14 = iArr[i13];
            c3043mAArr[i13] = new C3043mA((C3172oH[]) AbstractC15184a.A1I(c3172oHArr[i13], i14));
            iArr2[i13] = (int[][]) AbstractC15184a.A1I(iArr2[i13], i14);
            strArr[i13] = c7dArr[i13].getName();
            iArr3[i13] = c7dArr[i13].A9F();
            i13++;
        }
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final void A0c(Object obj) {
        this.A00 = (EC) obj;
    }

    public abstract Pair<C7G[], InterfaceC3016lj[]> A0d(EC ec2, int[][][] iArr, int[] iArr2, C3053mL c3053mL, Timeline timeline) throws C9Y;
}

package x8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: Code93Reader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f86834c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f86835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86836e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f86837a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f86838b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f86835d = iArr;
        f86836e = iArr[47];
    }

    public static void g(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        h(charSequence, length - 2, 20);
        h(charSequence, length - 1, 15);
    }

    public static void h(CharSequence charSequence, int i10, int i11) throws ChecksumException {
        int iIndexOf = 0;
        int i12 = 1;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i13)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        if (charSequence.charAt(i10) != f86834c[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(java.lang.CharSequence r9) throws com.google.zxing.FormatException {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r0) goto Lb3
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto Lac
            r5 = 100
            if (r4 > r5) goto Lac
            int r5 = r0 + (-1)
            if (r3 >= r5) goto La7
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L96;
                case 98: goto L4d;
                case 99: goto L3c;
                case 100: goto L2f;
                default: goto L2c;
            }
        L2c:
            r4 = r2
            goto La3
        L2f:
            if (r5 < r8) goto L37
            if (r5 > r7) goto L37
            int r5 = r5 + 32
            goto L9c
        L37:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L3c:
            if (r5 < r8) goto L43
            if (r5 > r6) goto L43
            int r5 = r5 + (-32)
            goto L9c
        L43:
            if (r5 != r7) goto L48
            r4 = 58
            goto La3
        L48:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L4d:
            if (r5 < r8) goto L56
            r4 = 69
            if (r5 > r4) goto L56
            int r5 = r5 + (-38)
            goto L9c
        L56:
            r4 = 70
            if (r5 < r4) goto L61
            r4 = 74
            if (r5 > r4) goto L61
            int r5 = r5 + (-11)
            goto L9c
        L61:
            r4 = 75
            if (r5 < r4) goto L6a
            if (r5 > r6) goto L6a
            int r5 = r5 + 16
            goto L9c
        L6a:
            r4 = 80
            if (r5 < r4) goto L75
            r4 = 84
            if (r5 > r4) goto L75
            int r5 = r5 + 43
            goto L9c
        L75:
            r4 = 85
            if (r5 != r4) goto L7a
            goto L2c
        L7a:
            r4 = 86
            if (r5 != r4) goto L81
            r4 = 64
            goto La3
        L81:
            r4 = 87
            if (r5 != r4) goto L88
            r4 = 96
            goto La3
        L88:
            r4 = 88
            if (r5 < r4) goto L91
            if (r5 > r7) goto L91
            r4 = 127(0x7f, float:1.78E-43)
            goto La3
        L91:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L96:
            if (r5 < r8) goto L9e
            if (r5 > r7) goto L9e
            int r5 = r5 + (-64)
        L9c:
            char r4 = (char) r5
            goto La3
        L9e:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        La3:
            r1.append(r4)
            goto Laf
        La7:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        Lac:
            r1.append(r4)
        Laf:
            int r3 = r3 + 1
            goto Lb
        Lb3:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.f.i(java.lang.CharSequence):java.lang.String");
    }

    public static char k(int i10) throws NotFoundException {
        int i11 = 0;
        while (true) {
            int[] iArr = f86835d;
            if (i11 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i11] == i10) {
                return f86834c[i11];
            }
            i11++;
        }
    }

    public static int l(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int iRound = Math.round((iArr[i13] * 9.0f) / i10);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < iRound; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= iRound;
            }
        }
        return i12;
    }

    @Override // x8.q
    public k8.i b(int i10, o8.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int iJ = aVar.j(j(aVar)[1]);
        int iL = aVar.l();
        int[] iArr = this.f86838b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f86837a;
        sb2.setLength(0);
        while (true) {
            q.e(aVar, iJ, iArr);
            int iL2 = l(iArr);
            if (iL2 < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cK = k(iL2);
            sb2.append(cK);
            int i11 = iJ;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int iJ2 = aVar.j(i11);
            if (cK == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (iJ2 == iL || !aVar.g(iJ2)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb2.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                g(sb2);
                sb2.setLength(sb2.length() - 2);
                float f10 = i10;
                return new k8.i(i(sb2), null, new k8.j[]{new k8.j((r14[1] + r14[0]) / 2.0f, f10), new k8.j(iJ + (i13 / 2.0f), f10)}, BarcodeFormat.CODE_93);
            }
            iJ = iJ2;
        }
    }

    public final int[] j(o8.a aVar) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        Arrays.fill(this.f86838b, 0);
        int[] iArr = this.f86838b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (l(iArr) == f86836e) {
                        return new int[]{i11, iJ};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            iJ++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

package x8;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: Code39Writer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends r {
    public static void h(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.e.i(java.lang.String):java.lang.String");
    }

    @Override // x8.r
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                str = i(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            } else {
                i10++;
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        h(148, iArr);
        int iB = r.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iB2 = iB + r.b(zArr, iB, iArr2, false);
        for (int i11 = 0; i11 < length; i11++) {
            h(d.f86829e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11))], iArr);
            int iB3 = iB2 + r.b(zArr, iB2, iArr, true);
            iB2 = iB3 + r.b(zArr, iB3, iArr2, false);
        }
        h(148, iArr);
        r.b(zArr, iB2, iArr, true);
        return zArr;
    }

    @Override // x8.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }
}

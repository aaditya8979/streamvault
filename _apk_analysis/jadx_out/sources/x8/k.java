package x8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: EAN8Writer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k extends y {
    @Override // x8.r
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + x.q(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!x.h(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        r.c(str);
        boolean[] zArr = new boolean[67];
        int iB = r.b(zArr, 0, x.f86867d, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            iB += r.b(zArr, iB, x.f86870g[Character.digit(str.charAt(i10), 10)], false);
        }
        int iB2 = iB + r.b(zArr, iB, x.f86868e, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            iB2 += r.b(zArr, iB2, x.f86870g[Character.digit(str.charAt(i11), 10)], true);
        }
        r.b(zArr, iB2, x.f86867d, true);
        return zArr;
    }

    @Override // x8.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.EAN_8);
    }
}

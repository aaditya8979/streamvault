package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.google.common.base.Strings;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2871jA {
    public static byte[] A00;
    public static String[] A01 = {"rIY6scqdx44s0lYhNsVasOWOliCxkCUS", "XG17z2bEBjC2W", "Vem1quc5hPIJuUrE", "UcFFOKOZJEGoXQOYNnqMCDDpRLrphEx7", "nkZ3L4NSKd4uHuOS6chXEBDQJqUE8doa", "6xQ37guYp3oV6tn7J9L0pQx9gviAFZKh", "Tb0XI9b9KZ2bW8CyI06iyuXMMlzfJONe", "u0lWMQq9JRx7ZEcoLF7IwO0fOB8k5dGw"};

    static {
        A0A();
    }

    public static int A00(int i10, int i11) {
        return A02(i10, i11, A06(167, 5, 127));
    }

    public static int A01(int i10, int i11) {
        return A03(i10, i11, A06(167, 5, 127));
    }

    public static int A02(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(A08(i10, i11, str));
        }
        return i10;
    }

    public static int A03(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(A09(i10, i11, str));
        }
        return i10;
    }

    public static <T> T A04(@CheckForNull T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException();
    }

    public static <T> T A05(@CheckForNull T t10, @CheckForNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A01;
            if (strArr[0].charAt(16) != strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "4hJwB50Ffda8q";
            strArr2[2] = "BvOy7f3XfmcoPFEY";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A07(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? A09(i10, i12, A06(187, 11, 96)) : (i11 < 0 || i11 > i12) ? A09(i11, i12, A06(105, 9, 59)) : Strings.A02(A06(114, 53, 123), Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static String A08(int i10, int i11, String str) {
        if (i10 < 0) {
            return Strings.A02(A06(77, 28, 114), str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return Strings.A02(A06(0, 35, 106), str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(A06(172, 15, 59) + i11);
    }

    public static String A09(int i10, int i11, String str) {
        if (i10 < 0) {
            return Strings.A02(A06(77, 28, 114), str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return Strings.A02(A06(35, 42, 111), str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(A06(172, 15, 59) + i11);
    }

    public static void A0A() {
        A00 = new byte[]{35, 117, 38, 46, 35, 117, 47, 38, 107, 115, 117, 114, 38, 100, 99, 38, 106, 99, 117, 117, 38, 114, 110, 103, 104, 38, 117, 111, 124, 99, 38, 46, 35, 117, 47, 38, 112, 35, 43, 38, 112, ExifInterface.START_CODE, 35, 110, 118, 112, 119, 35, 109, 108, 119, 35, 97, 102, 35, 100, 113, 102, 98, 119, 102, 113, 35, 119, 107, 98, 109, 35, 112, 106, 121, 102, 35, 43, 38, 112, ExifInterface.START_CODE, 59, 109, 62, 54, 59, 109, 55, 62, 115, 107, 109, 106, 62, 112, 113, 106, 62, 124, 123, 62, 112, 123, 121, 127, 106, 119, 104, 123, 50, 57, 51, 119, 62, 57, 51, 50, 47, 114, 121, 115, 55, 126, 121, 115, 114, 111, 55, 63, 50, 100, 62, 55, 122, 98, 100, 99, 55, 121, 120, 99, 55, 117, 114, 55, 123, 114, 100, 100, 55, 99, 127, 118, 121, 55, 100, 99, 118, 101, 99, 55, 126, 121, 115, 114, 111, 55, 63, 50, 100, 62, 122, 125, 119, 118, 107, 57, 50, 48, 54, 35, 62, 33, 50, 119, 36, 62, 45, 50, 109, 119, 127, 120, 109, 126, 120, 44, 101, 98, 104, 105, 116};
    }

    public static void A0B(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(A07(i10, i11, i12));
        }
    }

    public static void A0C(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void A0D(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void A0E(@CheckForNull boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A0F(@CheckForNull boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void A0G(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.A02(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void A0H(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.A02(str, Long.valueOf(j10)));
        }
    }
}

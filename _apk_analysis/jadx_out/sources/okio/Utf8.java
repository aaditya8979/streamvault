package okio;

import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i10) {
        if (i10 >= 0 && i10 < 32) {
            return true;
        }
        return 127 <= i10 && i10 < 160;
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i10, int i11, @NotNull l<? super Integer, r> lVar) {
        p.k(bArr, "<this>");
        p.k(lVar, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            lVar.invoke(65533);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if (!((b11 & 192) == 128)) {
            lVar.invoke(65533);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            lVar.invoke(65533);
            return 2;
        }
        lVar.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i10, int i11, @NotNull l<? super Integer, r> lVar) {
        p.k(bArr, "<this>");
        p.k(lVar, "yield");
        int i12 = i10 + 2;
        if (i11 <= i12) {
            lVar.invoke(65533);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((bArr[i13] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (!((b11 & 192) == 128)) {
            lVar.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i12];
        if (!((b12 & 192) == 128)) {
            lVar.invoke(65533);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i14 < 2048) {
            lVar.invoke(65533);
            return 3;
        }
        if (55296 <= i14 && i14 < 57344) {
            z = true;
        }
        if (z) {
            lVar.invoke(65533);
            return 3;
        }
        lVar.invoke(Integer.valueOf(i14));
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i10, int i11, @NotNull l<? super Integer, r> lVar) {
        p.k(bArr, "<this>");
        p.k(lVar, "yield");
        int i12 = i10 + 3;
        if (i11 <= i12) {
            lVar.invoke(65533);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((bArr[i13] & 192) == 128) {
                    int i14 = i10 + 2;
                    if (i11 > i14) {
                        if ((bArr[i14] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (!((b11 & 192) == 128)) {
            lVar.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if (!((b12 & 192) == 128)) {
            lVar.invoke(65533);
            return 2;
        }
        byte b13 = bArr[i12];
        if (!((b13 & 192) == 128)) {
            lVar.invoke(65533);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
        if (i15 > 1114111) {
            lVar.invoke(65533);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            z = true;
        }
        if (z) {
            lVar.invoke(65533);
            return 4;
        }
        if (i15 < 65536) {
            lVar.invoke(65533);
            return 4;
        }
        lVar.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf16Chars(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull sn.l<? super java.lang.Character, bn.r> r19) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, sn.l):void");
    }

    public static final void processUtf8Bytes(@NotNull String str, int i10, int i11, @NotNull l<? super Byte, r> lVar) {
        int i12;
        p.k(str, "<this>");
        p.k(lVar, "yield");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (p.m(cCharAt, 128) < 0) {
                lVar.invoke(Byte.valueOf((byte) cCharAt));
                i10++;
                while (i10 < i11 && p.m(str.charAt(i10), 128) < 0) {
                    lVar.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (p.m(cCharAt, 2048) < 0) {
                    lVar.invoke(Byte.valueOf((byte) ((cCharAt >> 6) | 192)));
                    lVar.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                } else {
                    boolean z10 = false;
                    if (55296 <= cCharAt && cCharAt < 57344) {
                        if (p.m(cCharAt, 56319) <= 0 && i11 > (i12 = i10 + 1)) {
                            char cCharAt2 = str.charAt(i12);
                            if (56320 <= cCharAt2 && cCharAt2 < 57344) {
                                z10 = true;
                            }
                            if (z10) {
                                int iCharAt = ((cCharAt << '\n') + str.charAt(i12)) - 56613888;
                                lVar.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                                lVar.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                                lVar.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                                lVar.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                                i10 += 2;
                            }
                        }
                        lVar.invoke((byte) 63);
                    } else {
                        lVar.invoke(Byte.valueOf((byte) ((cCharAt >> '\f') | 224)));
                        lVar.invoke(Byte.valueOf((byte) (((cCharAt >> 6) & 63) | 128)));
                        lVar.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                    }
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf8CodePoints(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull sn.l<? super java.lang.Integer, bn.r> r19) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, sn.l):void");
    }

    public static final long size(@NotNull String str) {
        p.k(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(@NotNull String str, int i10) {
        p.k(str, "<this>");
        return size$default(str, i10, 0, 2, null);
    }

    public static final long size(@NotNull String str, int i10, int i11) {
        int i12;
        p.k(str, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        long j10 = 0;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i12 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i12 = 3;
                } else {
                    int i13 = i10 + 1;
                    char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i10 = i13;
                    } else {
                        j10 += (long) 4;
                        i10 += 2;
                    }
                }
                j10 += (long) i12;
            }
            i10++;
        }
        return j10;
    }

    public static /* synthetic */ long size$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return size(str, i10, i11);
    }
}

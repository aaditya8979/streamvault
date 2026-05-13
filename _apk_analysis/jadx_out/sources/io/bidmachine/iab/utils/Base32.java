package io.bidmachine.iab.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public class Base32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f69344a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f69345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f69346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f69349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f69350f;

        private b() {
        }
    }

    private int a(int i10, int i11) {
        int i12 = i10 - Integer.MIN_VALUE;
        int i13 = i11 - Integer.MIN_VALUE;
        if (i12 < i13) {
            return -1;
        }
        return i12 == i13 ? 0 : 1;
    }

    private int a(b bVar) {
        if (bVar.f69346b != null) {
            return bVar.f69347c - bVar.f69348d;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    private void a(byte[] bArr, int i10, int i11, b bVar) {
        byte b10;
        if (bVar.f69349e) {
            return;
        }
        ?? r32 = 1;
        if (i11 < 0) {
            bVar.f69349e = true;
        }
        int i12 = 0;
        int i13 = i10;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            if (b11 == 61) {
                bVar.f69349e = r32;
                break;
            }
            byte[] bArrA = a(7, bVar);
            if (b11 >= 0) {
                byte[] bArr2 = f69344a;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i15 = (bVar.f69350f + r32) % 8;
                    bVar.f69350f = i15;
                    bVar.f69345a = (bVar.f69345a << 5) + ((long) b10);
                    if (i15 == 0) {
                        int i16 = bVar.f69347c;
                        bArrA[i16] = (byte) ((r12 >> 32) & 255);
                        bArrA[i16 + 1] = (byte) ((r12 >> 24) & 255);
                        bArrA[i16 + 2] = (byte) ((r12 >> 16) & 255);
                        bArrA[i16 + 3] = (byte) ((r12 >> 8) & 255);
                        bVar.f69347c = i16 + 5;
                        bArrA[i16 + 4] = (byte) (r12 & 255);
                    }
                }
            }
            i12++;
            i13 = i14;
            r32 = 1;
        }
        if (!bVar.f69349e || bVar.f69350f <= 0) {
            return;
        }
        byte[] bArrA2 = a(7, bVar);
        switch (bVar.f69350f) {
            case 1:
            case 2:
                int i17 = bVar.f69347c;
                bVar.f69347c = i17 + 1;
                bArrA2[i17] = (byte) ((bVar.f69345a >> 2) & 255);
                return;
            case 3:
                int i18 = bVar.f69347c;
                bVar.f69347c = i18 + 1;
                bArrA2[i18] = (byte) ((bVar.f69345a >> 7) & 255);
                return;
            case 4:
                bVar.f69345a = bVar.f69345a >> 4;
                int i19 = bVar.f69347c;
                bArrA2[i19] = (byte) ((r5 >> 12) & 255);
                bVar.f69347c = i19 + 2;
                bArrA2[i19 + 1] = (byte) (r3 & 255);
                return;
            case 5:
                bVar.f69345a = bVar.f69345a >> 1;
                int i20 = bVar.f69347c;
                bArrA2[i20] = (byte) ((r3 >> 17) & 255);
                bArrA2[i20 + 1] = (byte) ((r3 >> 9) & 255);
                bVar.f69347c = i20 + 3;
                bArrA2[i20 + 2] = (byte) (r9 & 255);
                return;
            case 6:
                bVar.f69345a = bVar.f69345a >> 6;
                int i21 = bVar.f69347c;
                bArrA2[i21] = (byte) ((r3 >> 22) & 255);
                bArrA2[i21 + 1] = (byte) ((r3 >> 14) & 255);
                bVar.f69347c = i21 + 3;
                bArrA2[i21 + 2] = (byte) (r9 & 255);
                return;
            case 7:
                bVar.f69345a = bVar.f69345a >> 3;
                int i22 = bVar.f69347c;
                bArrA2[i22] = (byte) ((r9 >> 27) & 255);
                bArrA2[i22 + 1] = (byte) ((r9 >> 19) & 255);
                bArrA2[i22 + 2] = (byte) ((r9 >> 11) & 255);
                bVar.f69347c = i22 + 4;
                bArrA2[i22 + 3] = (byte) (r5 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + bVar.f69350f);
        }
    }

    private void a(byte[] bArr, int i10, b bVar) {
        if (bVar.f69346b != null) {
            int iMin = Math.min(a(bVar), i10);
            System.arraycopy(bVar.f69346b, bVar.f69348d, bArr, 0, iMin);
            int i11 = bVar.f69348d + iMin;
            bVar.f69348d = i11;
            if (i11 >= bVar.f69347c) {
                bVar.f69346b = null;
            }
        }
    }

    private byte[] a(int i10, b bVar) {
        byte[] bArr = bVar.f69346b;
        if (bArr == null) {
            bVar.f69346b = new byte[Math.max(i10, 8192)];
            bVar.f69347c = 0;
            bVar.f69348d = 0;
        } else {
            int i11 = bVar.f69347c + i10;
            if (i11 - bArr.length > 0) {
                return a(bVar, i11);
            }
        }
        return bVar.f69346b;
    }

    private byte[] a(b bVar, int i10) {
        int length = bVar.f69346b.length * 2;
        if (a(length, i10) < 0) {
            length = i10;
        }
        if (a(length, 2147483639) > 0) {
            length = Math.max(i10, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = bVar.f69346b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        bVar.f69346b = bArr;
        return bArr;
    }

    @NonNull
    public String decode(@NonNull String str) {
        return decode(str.getBytes(Charset.forName("UTF-8")));
    }

    @NonNull
    public String decode(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        b bVar = new b();
        a(bArr, 0, bArr.length, bVar);
        a(bArr, 0, -1, bVar);
        int i10 = bVar.f69347c;
        byte[] bArr2 = new byte[i10];
        a(bArr2, i10, bVar);
        return new String(bArr2);
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes8.dex */
public final class ej extends ef {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1986 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1987 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f1988 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1989 = 49469135;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1990 = 120;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f1991 = {-78, -77, 118, 31, 111, 37, 39, 114, 35, 125, 18, -32, -55, 118, 32, -43, -55, 33, 30, 110, 38, 117, 20, -120, 35, -46, -68, 124, 32, 112, 18, -119, 44, ExifInterface.START_CODE, -118, 20, -32, -57, 34, 120, 37, 72, -79, 84, 7, 38, 33, -16, 41, -75, 100, 37, 39, -6, -7, 37, -8, 33, -6, -5, 31, -53, 106, 37, -75, 57, -6, ExifInterface.MARKER_APP1, 97, ExifInterface.START_CODE, 38, -53, 103, 33, -52, 95, 31, -5, 40, -3, 38, -52, 30, -117, 119, -71};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1992 = 1759777244;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1993;

    public ej(ed edVar, ed edVar2, ed edVar3, dm dmVar) {
        super(edVar, edVar2, dmVar);
        this.f1993 = edVar3;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6236(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1990;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1991;
                i14 = bArr != null ? (byte) (bArr[f1989 + i10] + i13) : (short) (f1988[f1989 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f1989 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f1992);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f1991;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f1988;
                        int i16 = o.f3016;
                        o.f3016 = i16 - 1;
                        o.f3019 = (char) (o.f3018 + (((short) (sArr[i16] + s10)) ^ o.f3017));
                    }
                    sb2.append(o.f3019);
                    o.f3018 = o.f3019;
                    o.f3020++;
                }
            }
            string = sb2.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m6237() {
        int i10 = f1986 + 57;
        f1987 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return this.f1993;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final boolean equals(Object obj) {
        if (!(this != obj)) {
            return true;
        }
        if (obj != null) {
            int i10 = f1986 + 77;
            f1987 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (ej.class == obj.getClass()) {
                if (!super.equals(obj)) {
                    int i11 = f1986 + 57;
                    f1987 = i11 % 128;
                    return (i11 % 2 == 0 ? '\t' : ' ') == '\t';
                }
                ed edVar = this.f1993;
                ed edVar2 = ((ej) obj).f1993;
                if (edVar != null) {
                    return edVar.equals(edVar2);
                }
                if ((edVar2 == null ? (char) 2 : 'U') != 2) {
                    return false;
                }
                int i12 = f1987 + 43;
                f1986 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final int hashCode() {
        int i10 = f1986 + 29;
        f1987 = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = super.hashCode() * 31;
        ed edVar = this.f1993;
        int iHashCode2 = 0;
        if (!(edVar == null)) {
            int i12 = f1987 + 17;
            f1986 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 7 : '[') == 7) {
                edVar.hashCode();
                throw null;
            }
            iHashCode2 = edVar.hashCode();
        } else {
            int i13 = f1986 + 75;
            f1987 = i13 % 128;
            int i14 = i13 % 2;
        }
        return iHashCode + iHashCode2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(m6236((-49469052) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (KeyEvent.keyCodeFromString("") + 104), TextUtils.getOffsetAfter("", 0) - 1759777212, (byte) (60 - TextUtils.getOffsetBefore("", 0)), TextUtils.lastIndexOf("", '0') - 120).intern());
        sb2.append(m6237().toString());
        String string = sb2.toString();
        int i10 = f1987 + 125;
        f1986 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[PHI: r1 r4 r13
      0x0056: PHI (r1v10 com.ironsource.adqualitysdk.sdk.i.dr) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dr), (r1v19 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r4v3 com.ironsource.adqualitysdk.sdk.i.dr) = (r4v2 com.ironsource.adqualitysdk.sdk.i.dr), (r4v7 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r13v4 java.lang.Object) = (r13v3 java.lang.Object), (r13v19 java.lang.Object) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[Catch: Exception -> 0x0179, PHI: r1 r4 r13
      0x007b: PHI (r1v12 com.ironsource.adqualitysdk.sdk.i.dr) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dr), (r1v19 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r4v5 com.ironsource.adqualitysdk.sdk.i.dr) = (r4v2 com.ironsource.adqualitysdk.sdk.i.dr), (r4v7 com.ironsource.adqualitysdk.sdk.i.dr) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r13v10 java.lang.Object) = (r13v3 java.lang.Object), (r13v19 java.lang.Object) binds: [B:14:0x0054, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {Exception -> 0x0179, blocks: (B:5:0x0020, B:7:0x0030, B:19:0x007b, B:24:0x0087, B:25:0x009a, B:30:0x00a6, B:33:0x00b4, B:34:0x00c7, B:36:0x00d1, B:37:0x00e3, B:39:0x016b, B:16:0x0060, B:13:0x0046), top: B:46:0x000e }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.dr mo6189(com.ironsource.adqualitysdk.sdk.i.du r13, com.ironsource.adqualitysdk.sdk.i.cq r14) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ej.mo6189(com.ironsource.adqualitysdk.sdk.i.du, com.ironsource.adqualitysdk.sdk.i.cq):com.ironsource.adqualitysdk.sdk.i.dr");
    }
}

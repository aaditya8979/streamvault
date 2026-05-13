package com.ironsource.adqualitysdk.sdk.i;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.adqualitysdk.sdk.i.hp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ho extends hp {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private int f2385;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<Class> f2386 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f2387;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Class f2388;

    public static class a extends hp.b implements cl {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2389 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2390 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f2391 = null;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2392 = {5, ExifInterface.START_CODE, ExifInterface.MARKER_EOI, -1, 11, -57, 51, 41, 43, -7, 60, -45, 46, 2, -51, 58, -59, 62, ExifInterface.MARKER_APP1, 20, -59, 60, 58, 10, 12, 14, -36, 25, -24, -5, 16, -54, ExifInterface.START_CODE, -6, -48, 39, -4, 8, -24, 5, 11, 13, -4, 18, -12, -12, 8, -40, 39, -26, 28, -4, -16, 1, -2, 0, -8, 8, -33, 20, -3, -2, 13, -97, 113, -105, -105, 117, -83, 72, -123, 127, -97, -109, 98, -99, 99, -101, 107, -68, 119, -98, -99, 10, -126, -112, 119, -117, 115, -113, 119, 121, -96, 103, -89, 99, -121, 115, -109, 126, 112, 7, -52, 60, 62, 56, 33, -27, 36, -48, -54, -56, 26, -49, 63, 60, -3, 64, -67, 65, -68, -3, -78, 73, -66, 89};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2393 = -661123836;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2394 = 8;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2395 = 1533351683;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ho f2396 = new ho();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m6355(int i10) {
            int i11 = f2389 + 95;
            f2390 = i11 % 128;
            int i12 = i11 % 2;
            this.f2396.f2385 = i10;
            int i13 = f2389 + 95;
            f2390 = i13 % 128;
            if (i13 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m6356(boolean z10, int i10) {
            int i11 = f2390 + 15;
            f2389 = i11 % 128;
            if ((i11 % 2 != 0 ? '7' : 'V') != 'V') {
                ho hoVar = this.f2396;
                hoVar.f2398 = z10;
                hoVar.f2400 = i10;
                int i12 = 18 / 0;
            } else {
                ho hoVar2 = this.f2396;
                hoVar2.f2398 = z10;
                hoVar2.f2400 = i10;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m6357(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f3015) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2394;
                int i14 = i12 + i13;
                boolean z10 = i14 == -1;
                if (z10) {
                    byte[] bArr = f2392;
                    i14 = bArr != null ? (byte) (bArr[f2393 + i10] + i13) : (short) (f2391[f2393 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3016 = ((i10 + i14) - 2) + f2393 + (z10 ? 1 : 0);
                    o.f3017 = b10;
                    char c10 = (char) (i11 + f2395);
                    o.f3019 = c10;
                    sb2.append(c10);
                    o.f3018 = o.f3019;
                    o.f3020 = 1;
                    while (o.f3020 < i14) {
                        byte[] bArr2 = f2392;
                        if (bArr2 != null) {
                            int i15 = o.f3016;
                            o.f3016 = i15 - 1;
                            o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                        } else {
                            short[] sArr = f2391;
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m6358() {
            int i10 = f2390 + 33;
            f2389 = i10 % 128;
            int i11 = i10 % 2;
            this.f2396.mo6354();
            int i12 = f2390 + 45;
            f2389 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 15 : '\"') == '\"') {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m6359(Class cls) {
            int i10 = f2389 + 79;
            f2390 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 22 : 'Y') == 22) {
                this.f2396.f2386.add(cls);
                throw null;
            }
            this.f2396.f2386.add(cls);
            int i11 = f2390 + 107;
            f2389 = i11 % 128;
            if ((i11 % 2 != 0 ? '\b' : '4') == '4') {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m6360(boolean z10) {
            int i10 = f2389 + 53;
            f2390 = i10 % 128;
            int i11 = i10 % 2;
            this.f2396.f2387 = z10;
            int i12 = f2390 + 25;
            f2389 = i12 % 128;
            if ((i12 % 2 != 0 ? 'U' : (char) 30) != 'U') {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0271  */
        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo4888(java.lang.String r20, java.util.List<java.lang.Object> r21, com.ironsource.adqualitysdk.sdk.i.ch r22) {
            /*
                Method dump skipped, instruction units count: 850
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ho.a.mo4888(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final a m6361(int i10) {
            int i11 = f2390 + 57;
            int i12 = i11 % 128;
            f2389 = i12;
            int i13 = i11 % 2;
            ho hoVar = this.f2396;
            hoVar.f2397 = i10 | hoVar.f2397;
            int i14 = i12 + 27;
            f2390 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final a m6362(int i10) {
            ho hoVar;
            int i11;
            int i12 = f2389 + 3;
            f2390 = i12 % 128;
            if ((i12 % 2 == 0 ? '!' : '?') != '?') {
                hoVar = this.f2396;
                i11 = i10 ^ hoVar.f2399;
            } else {
                hoVar = this.f2396;
                i11 = i10 | hoVar.f2399;
            }
            hoVar.f2399 = i11;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final a m6363(Class cls) {
            int i10 = f2389 + 35;
            f2390 = i10 % 128;
            int i11 = i10 % 2;
            this.f2396.f2388 = cls;
            int i12 = f2389 + 91;
            f2390 = i12 % 128;
            if (!(i12 % 2 == 0)) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ho m6364() {
            int i10 = f2389;
            int i11 = i10 + 15;
            f2390 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            ho hoVar = this.f2396;
            int i12 = i10 + 105;
            f2390 = i12 % 128;
            int i13 = i12 % 2;
            return hoVar;
        }
    }

    public ho() {
        super.mo6354();
        this.f2388 = null;
        this.f2385 = 0;
        this.f2387 = true;
        this.f2386.clear();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6349() {
        return this.f2387;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m6350() {
        return this.f2385;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Class m6351() {
        return this.f2388;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m6352() {
        return this.f2386;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6353(Class cls) {
        this.f2388 = cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo6354() {
        super.mo6354();
        this.f2388 = null;
        this.f2385 = 0;
        this.f2387 = true;
        this.f2386.clear();
    }
}

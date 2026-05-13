package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.i.ay;

/* JADX INFO: loaded from: classes8.dex */
public final class fx extends gl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2133 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2134 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2135 = {61, 17, -18, -53, 49, 53, -63, 16, 45, -119, 61, 49, 1, -119, 52, 52, 11, -8, -55, -56, -49, 60, -60, 63, 1, -5, -53, 55, -54, 50, 58, 11, -13, -52, 62, 68, -75, 104, -106, -78, 75, -69, 76, 64, 66, 101, -10, 66, 78, 126, -10, 75, 75, 116, -121, -74, -73, -80, 67, -69, 64, 126, -124, -76, 72, -75, 77, 69, 116, -116, -77, 65, -11, 4, 15, 5, 0, 0, 0};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2136 = -551801176;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2137 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2138 = 117;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2139 = 112251052;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m6280() {
        int i10 = f2133 + 1;
        f2134 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Prode.m4317();
                throw null;
            }
            if (!Prode.m4317()) {
                Class.forName(m6281(TextUtils.indexOf("", "") - 112251017, (short) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 551801275, (byte) ((Process.myPid() >> 22) + 77), (-79) - TextUtils.indexOf("", "")).intern());
                return true;
            }
            int i11 = f2133 + 97;
            f2134 = i11 % 128;
            int i12 = i11 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6281(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2138;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2135;
                i14 = bArr != null ? (byte) (bArr[f2139 + i10] + i13) : (short) (f2137[f2139 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f2139 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f2136);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f2135;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f2137;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        int i10 = f2134 + 63;
        f2133 = i10 % 128;
        int i11 = i10 % 2;
        if (!m6280()) {
            return new ay(mo6277());
        }
        ay.e eVar = new ay.e(mo6277());
        int i12 = f2133 + 87;
        f2134 = i12 % 128;
        int i13 = i12 % 2;
        return eVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2133 + 39;
        f2134 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6281((-112251052) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) TextUtils.indexOf("", "", 0, 0), 551801275 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (50 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.getDefaultSize(0, 0) - 81).intern();
        int i12 = f2133 + 43;
        f2134 = i12 % 128;
        if ((i12 % 2 == 0 ? '<' : '\r') == '\r') {
            return strIntern;
        }
        int i13 = 33 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2133 + 81;
        int i11 = i10 % 128;
        f2134 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 23;
        f2133 = i13 % 128;
        if ((i13 % 2 != 0 ? 'Y' : (char) 23) == 23) {
            return MobileAds.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2134 + 103;
        f2133 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6281((-112250980) - (Process.myPid() >> 22), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 551801272, (byte) (6 - Drawable.resolveOpacity(0, 0)), Gravity.getAbsoluteGravity(0, 0) - 112).intern();
        int i12 = f2134 + 121;
        f2133 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}

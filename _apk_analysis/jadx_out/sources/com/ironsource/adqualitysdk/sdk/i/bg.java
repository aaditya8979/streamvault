package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bg extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f809 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f810 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f811 = 47;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f812 = {-126, 124, -115, -124, 118, -116, 0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f813 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f814 = -1813798625;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f815 = -374900078;

    public bg(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4898(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f811;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f812;
                i14 = bArr != null ? (byte) (bArr[f814 + i10] + i13) : (short) (f813[f814 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f814 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f815);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f812;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f813;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﺙ */
    public final boolean mo4886() {
        int i10 = f809;
        int i11 = i10 + 23;
        f810 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 37;
        f810 = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo4887() {
        int i10 = f809 + 17;
        f810 = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        int i10 = f809 + 107;
        f810 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f809 + 103;
        f810 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m4898(1813798625 - Color.argb(0, 0, 0, 0), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 124), 374900146 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) View.resolveSize(0, 0), (-40) - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i12 = f809 + 65;
        f810 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return strIntern;
        }
        int i13 = 24 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo4814(String str) {
        int i10 = f810 + 107;
        int i11 = i10 % 128;
        f809 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 75;
        f810 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }
}

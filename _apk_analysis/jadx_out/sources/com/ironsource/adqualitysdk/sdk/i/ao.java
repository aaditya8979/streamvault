package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ao {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f360 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f361 = 64155;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f362 = 18699;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f363 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f364 = 45928;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f365 = 14739;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f368;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f370 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f369 = m4533("\uea90﵉蓐⥨\uf44a驹뛺깯", 6 - ((byte) KeyEvent.getModifierMetaStateMask())).intern();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f371 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f372 = "";

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f373 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, String> f366 = new HashMap();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f367 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4533(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3014) {
            char[] cArr2 = new char[cArr.length];
            n.f3013 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f3013;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f362)) ^ ((c11 >>> 5) + f361)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f364) ^ ((c12 + i12) ^ ((c12 << 4) + f365))));
                        i12 -= 40503;
                    }
                    int i14 = n.f3013;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f3013 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final void m4534() {
        int i10 = f360 + 119;
        int i11 = i10 % 128;
        f363 = i11;
        int i12 = i10 % 2;
        this.f367 = true;
        int i13 = i11 + 99;
        f360 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m4535() {
        int i10 = f360 + 113;
        f363 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 23 : '`') == '`') {
            return this.f367;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Map<String, String> m4536() {
        Map<String, String> map;
        int i10 = f363;
        int i11 = i10 + 41;
        f360 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 6 : (char) 28) != 6) {
            map = this.f366;
        } else {
            map = this.f366;
            int i12 = 57 / 0;
        }
        int i13 = i10 + 117;
        f360 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m4537() {
        int i10 = f363 + 53;
        int i11 = i10 % 128;
        f360 = i11;
        if ((i10 % 2 != 0 ? 'b' : '_') != '_') {
            throw null;
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f368;
        int i12 = i11 + 101;
        f363 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return iSAdQualityDeviceIdType;
        }
        int i13 = 93 / 0;
        return iSAdQualityDeviceIdType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m4538(String str) {
        int i10 = f363;
        int i11 = i10 + 101;
        f360 = i11 % 128;
        int i12 = i11 % 2;
        this.f369 = str;
        int i13 = i10 + 97;
        f360 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m4539() {
        int i10 = f360 + 87;
        f363 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 11 : '/') != 11) {
            return this.f371;
        }
        int i11 = 52 / 0;
        return this.f371;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m4540() {
        int i10 = f363;
        int i11 = i10 + 45;
        f360 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f372;
        int i13 = i10 + 95;
        f360 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4541(String str) {
        int i10 = f360 + 25;
        f363 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 21 : (char) 28;
        this.f370 = str;
        if (c10 != 21) {
            return;
        }
        int i11 = 87 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4542(boolean z10) {
        int i10 = f363;
        int i11 = i10 + 33;
        f360 = i11 % 128;
        int i12 = i11 % 2;
        this.f373 = z10;
        int i13 = i10 + 55;
        f360 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m4543() {
        String str;
        int i10 = f363 + 101;
        int i11 = i10 % 128;
        f360 = i11;
        int i12 = i10 % 2;
        str = this.f369;
        int i13 = i11 + 23;
        f363 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 22 : (char) 2) != 2) {
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4544(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i10 = f360 + 95;
        f363 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        this.f368 = iSAdQualityDeviceIdType;
        if (z10) {
            return;
        }
        int i11 = 13 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4545(Map<String, String> map) {
        int i10 = f363 + 9;
        int i11 = i10 % 128;
        f360 = i11;
        int i12 = i10 % 2;
        this.f366 = map;
        int i13 = i11 + 109;
        f363 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4546() {
        int i10 = f363 + 59;
        int i11 = i10 % 128;
        f360 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f370;
        int i12 = i11 + 1;
        f363 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4547(String str) {
        int i10 = f360 + 67;
        f363 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        this.f372 = str;
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4548(boolean z10) {
        int i10 = f360 + 25;
        f363 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'K' : ' ';
        this.f371 = z10;
        if (c10 != ' ') {
            int i11 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4549() {
        boolean z10;
        int i10 = f360 + 85;
        int i11 = i10 % 128;
        f363 = i11;
        if (!(i10 % 2 != 0)) {
            z10 = this.f373;
            int i12 = 75 / 0;
        } else {
            z10 = this.f373;
        }
        int i13 = i11 + 61;
        f360 = i13 % 128;
        if ((i13 % 2 != 0 ? 'O' : 'E') != 'O') {
            return z10;
        }
        throw null;
    }
}

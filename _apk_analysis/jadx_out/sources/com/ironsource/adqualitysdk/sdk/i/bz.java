package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetVersion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bz extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1203 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1204 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f1205 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1206 = 291822268;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f1207 = {-55, -64, 8, 49, -50, 47, -54, 8, 1, -9, 8, -2, -53, -2, 3, -8, -1, 44, -49, 15, -2, -11, 17, 13, -37, 44, -52, -1, 6, -10, 1, 13, 15, -30, 15, -2, -11, 17, 13, -37, 44, -51, 5, 11, -13, 13, -11, 17, 34, -51, 15, -2, -11, 17, 13, -37, 44, -30, 5, 11, -13, 13, -11, 17, 34, -51, 15, -2, -11, 17, 13, -37, 44, 31, -64, -1, 2, 0, -2, 12, 53, -70, 15, -2, -11, 17, -19, 70, -75, 12, 63, -63, -2, 12, -58, -19, 19, 29, -43, 10, 1, -5, 19, -58, -19, 19, 29, -43, 6, 5, -17, 52, -49, 35, -43, 11, -8, -11, 11, -11, 1, 1, 13, -15, 6, 37, -28, -14, 18, 31, -53, 35, -43, 11, -8, -11, 11, -11, 1, 1, 13, -15, 6, 37, -57, 35, -35, -1, 1, -14, 17, -22, 18, 19, -49, 13, -9, 9, -15, 1, 10, 29, -24, 35, -35, -1, 1, -14, 17, -22, 18, 19, -55, 18, -4, 19, -30, 15, -2, -11, 17, 13, -37, 44, -61, -21, 17, 22, -17, 35, -47, 13, -9, 9, -15, 1, 10, 29, -43, 18, -4, 19, -30, 15, -2, -11, 17, 13, -37, 44};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1208 = 29;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1209 = -279939345;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1210 = 67;

    public bz(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5437(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1210;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1207;
                i14 = bArr != null ? (byte) (bArr[f1209 + i10] + i13) : (short) (f1205[f1209 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f1209 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f1206);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f1207;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f1205;
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
    private static String m5438(Reward reward) {
        int i10 = f1203 + 99;
        f1204 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '!' : '\'';
        String str = reward.type;
        if (c10 == '!') {
            throw null;
        }
        int i11 = f1203 + 85;
        f1204 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            return str;
        }
        int i12 = 51 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5439(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f728) {
            char[] cArr2 = new char[i10];
            b.f726 = 0;
            while (true) {
                int i13 = b.f726;
                if (i13 >= i10) {
                    break;
                }
                b.f727 = cArr[i13];
                cArr2[b.f726] = (char) (b.f727 + i12);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f1208);
                b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i17 = b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5440(Reward reward) {
        int i10 = f1203 + 25;
        f1204 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5438(reward);
        }
        m5438(reward);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5439("￫\r\ufffe\u0000\ufffe\t\u0012￭�\u000b\ufffa\u0010\ufffe", 13 - (Process.myPid() >> 22), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 132 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bz.m5440((Reward) list.get(0));
            }
        });
        int i10 = f1203 + 125;
        f1204 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f1204 + 5;
        f1203 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                String str = (String) MyTargetVersion.class.getDeclaredField(m5439("\b\u0000\u0001\ufffb\u0005\u0004\ufff7", 7 - Color.blue(0), true, View.getDefaultSize(0, 0) + 1, 107 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).get(null);
                int i12 = f1203 + 81;
                f1204 = i12 % 128;
                int i13 = i12 % 2;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m6425().m6427().m6527(MyTargetVersion.class, m5437(Gravity.getAbsoluteGravity(0, 0) + 279939345, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 291822175, (byte) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) - 68).intern());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01e3  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bz.mo4814(java.lang.String):java.lang.Class");
    }
}

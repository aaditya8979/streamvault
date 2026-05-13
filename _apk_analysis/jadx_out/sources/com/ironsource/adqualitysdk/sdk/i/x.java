package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3185 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3186 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3187 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f3188 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f3189 = 203967174;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, u> f3192 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ac> f3190 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, z> f3191 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m7128(char c10, int i10, String str, String str2, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2695) {
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2697 = 0;
            while (true) {
                int i11 = j.f2697;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2696 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2697;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f3188) ^ ((long) f3189)) ^ ((long) f3185));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m7129(x xVar) {
        int i10 = f3187 + 81;
        f3186 = i10 % 128;
        char c10 = i10 % 2 != 0 ? ';' : (char) 31;
        Map<String, z> map = xVar.f3191;
        if (c10 != 31) {
            int i11 = 99 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m7130(JSONObject jSONObject) {
        int i10 = f3186 + 37;
        f3187 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '7' : (char) 19;
        String strM7132 = m7132(jSONObject);
        if (c10 == '7') {
            int i11 = 94 / 0;
        }
        int i12 = f3186 + 57;
        f3187 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM7132;
        }
        int i13 = 62 / 0;
        return strM7132;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m7131(x xVar) {
        int i10 = f3187;
        int i11 = i10 + 37;
        f3186 = i11 % 128;
        int i12 = i11 % 2;
        Map<String, ac> map = xVar.f3190;
        int i13 = i10 + 9;
        f3186 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7132(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jSONObject.optString(m7128((char) (32995 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "ఴ┛ᡝ࿎ዽ퍍Ƅ夾陊湣쿠ꖝꘈ\ue27e", "Წ\ud93a\ue374\ue180", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(m7128((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37335), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1335743573, "闲", "喙鷔흏鞑", "\u0000\u0000\u0000\u0000").intern());
        sb2.append(jSONObject.optString(m7128((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46574), KeyEvent.keyCodeFromString(""), "⏽꿐\uf517ﺸ叡悳呾낾翈嵶瀃\uf298⧝ɤ", "\u0099♂\uee71隵", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(jSONObject.optString(m7128((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 44505), TextUtils.lastIndexOf("", '0', 0, 0) - 1526815515, "뎈廿ਕЭ㐩뎄鱍\ueb46눝臭\ue16cᰴ唙", "\ue491ﺤ\ud8a4ꊭ", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(jSONObject.optString(m7128((char) (TextUtils.indexOf("", "", 0) + 12898), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 574562106, "躄⨧䆴\uf837䶗烂\ued2c\uebaa셆勿넻负풪\ueb04뻥", "㯻㼟戢⨲", "\u0000\u0000\u0000\u0000").intern()));
        String string = sb2.toString();
        int i10 = f3187 + 27;
        f3186 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m7133(x xVar) {
        int i10 = f3187 + 71;
        int i11 = i10 % 128;
        f3186 = i11;
        int i12 = i10 % 2;
        Map<String, u> map = xVar.f3192;
        int i13 = i11 + 81;
        f3187 = i13 % 128;
        if (i13 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7134() {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                ArrayList arrayList = new ArrayList(x.m7131(x.this).values());
                x.m7131(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ac) it.next()).m4364();
                }
            }
        });
        int i10 = f3187 + 107;
        f3186 = i10 % 128;
        if ((i10 % 2 != 0 ? '\r' : '>') != '\r') {
            return;
        }
        int i11 = 56 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7135(final JSONObject jSONObject, final l lVar, final jh jhVar, final is isVar) {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                String strM7130 = x.m7130(jSONObject);
                u uVar = (u) x.m7133(x.this).get(strM7130);
                if (uVar == null) {
                    uVar = new u(jSONObject, isVar);
                    x.m7133(x.this).put(strM7130, uVar);
                } else {
                    uVar.m7147(isVar);
                    uVar.m7108(jSONObject);
                }
                uVar.m7127((r) lVar);
                uVar.m7107((jg) jhVar);
            }
        });
        int i10 = f3186 + 77;
        f3187 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m7136() {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                ArrayList arrayList = new ArrayList(x.m7129(x.this).values());
                x.m7129(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).m7187();
                }
            }
        });
        int i10 = f3187 + 71;
        f3186 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m7137(JSONObject jSONObject, p pVar) {
        int i10 = f3187 + 89;
        f3186 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m7139(jSONObject, pVar, null);
        if (z10) {
            throw null;
        }
        int i11 = f3187 + 103;
        f3186 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7138() {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                ArrayList arrayList = new ArrayList(x.m7133(x.this).values());
                x.m7133(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).m7102();
                }
            }
        });
        int i10 = f3187 + 45;
        f3186 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7139(final JSONObject jSONObject, final p pVar, final it itVar) {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                String strM7130 = x.m7130(jSONObject);
                z zVar = (z) x.m7129(x.this).get(strM7130);
                if (zVar == null) {
                    zVar = new z(jSONObject, itVar);
                    x.m7129(x.this).put(strM7130, zVar);
                } else {
                    zVar.m7189(jSONObject, itVar);
                }
                zVar.m7127(pVar);
            }
        });
        int i10 = f3186 + 31;
        f3187 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m7140(final JSONObject jSONObject, final v vVar) {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                String strM7130 = x.m7130(jSONObject);
                ac acVar = (ac) x.m7131(x.this).get(strM7130);
                if (acVar == null) {
                    acVar = new ac(jSONObject);
                    x.m7131(x.this).put(strM7130, acVar);
                } else {
                    acVar.m4363(jSONObject);
                }
                acVar.m7127((r) vVar);
            }
        });
        int i10 = f3187 + 83;
        f3186 = i10 % 128;
        int i11 = i10 % 2;
    }
}

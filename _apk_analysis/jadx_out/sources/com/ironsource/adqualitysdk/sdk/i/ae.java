package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class ae {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f149 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f150 = -6192151443298679407L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f151 = {'E', 'r', 'o', ' ', 's', 'y', 'n', 'c', 'h', 'i', 'z', 'g', 'e', 'v', 't', 'd', 'l', 'a', 'T', 'u', 'F', 'G', 'H', 'I', 'J'};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f152 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f153 = 5;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private int f154;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f155;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private long f156;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Boolean f157 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long f158;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private long f159;

    public ae(int i10) {
        this.f154 = i10;
        ar.m4559().mo4583(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.1

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f160 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f161 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f162 = 3266625835755888475L;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4392(String str, int i11) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (h.f2306) {
                    char[] cArrM6319 = h.m6319(f162, cArr, i11);
                    h.f2307 = 4;
                    while (true) {
                        int i12 = h.f2307;
                        if (i12 < cArrM6319.length) {
                            h.f2305 = i12 - 4;
                            cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f162));
                            h.f2307++;
                        } else {
                            str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                        }
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4393() {
                as asVarMo4572 = ar.m4559().mo4572();
                long jM4633 = asVarMo4572.m4633();
                if ((jM4633 == 0 ? (char) 18 : '&') != 18) {
                    ae.m4384(ae.this, Boolean.TRUE);
                } else {
                    int i11 = f161 + 71;
                    f160 = i11 % 128;
                    int i12 = i11 % 2;
                    ae.m4384(ae.this, Boolean.FALSE);
                    jM4633 = asVarMo4572.m4635();
                    kd.m6948(m4392("ũꭟĽꡓ矅瑭ᚈ\ue9b1籶\uf7ec鐐法﯁焿ᆤ\uef42祎ﲨ黛懿\uf4b7總ᱏ\ue461爇", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), m4392("열淶얱᪼鍼닟ꑸം룪ㄑ⛷衯㼌랢ꍗ\u0be1뷄㨀Ⱘ蕎つ뢎꺿Ï뚞㿤⬜艱㔈ꉼ뗯ᶀꡳ\u20cd㙷鼔⻤", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), null, false);
                    int i13 = f161 + 51;
                    f160 = i13 % 128;
                    int i14 = i13 % 2;
                }
                ae.m4377(ae.this, asVarMo4572.m4634());
                ae.m4387(ae.this, asVarMo4572.m4635());
                ae aeVar = ae.this;
                ae.m4383(aeVar, jM4633 - ae.m4380(aeVar));
                ae aeVar2 = ae.this;
                ae.m4388(aeVar2, jM4633 - ae.m4386(aeVar2));
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ long m4377(ae aeVar, long j10) {
        int i10 = f152;
        int i11 = i10 + 109;
        f149 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        aeVar.f155 = j10;
        if (!z10) {
            throw null;
        }
        int i12 = i10 + 37;
        f149 = i12 % 128;
        if (i12 % 2 != 0) {
            return j10;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: JSONException -> 0x0117, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0117, blocks: (B:5:0x0015, B:17:0x0064, B:22:0x0072, B:25:0x00ed, B:30:0x00ff, B:31:0x0111, B:24:0x00bc, B:11:0x003c), top: B:34:0x0012 }] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4378(org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ae.m4378(org.json.JSONObject):void");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4379(JSONObject jSONObject, boolean z10) {
        long jOptLong;
        if ((jSONObject.has(m4390("\t\u0013µ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3, (byte) (66 - KeyEvent.keyCodeFromString(""))).intern()) ? 'I' : (char) 5) != 5) {
            int i10 = f152 + 117;
            f149 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (z10) {
                jOptLong = jSONObject.optLong(m4389("닡늒㩪鞸뾎鳮탻", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) + this.f158;
                int i11 = f149 + 91;
                f152 = i11 % 128;
                int i12 = i11 % 2;
            } else {
                jOptLong = jSONObject.optLong(m4390("\t\u0013µ", ExpandableListView.getPackedPositionGroup(0L) + 3, (byte) (66 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern()) + this.f156;
            }
            try {
                jSONObject.put(m4390("\t\u0013µ", TextUtils.lastIndexOf("", '0') + 4, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 66)).intern(), jOptLong);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ long m4380(ae aeVar) {
        int i10 = f152 + 53;
        int i11 = i10 % 128;
        f149 = i11;
        if (i10 % 2 == 0) {
            long j10 = aeVar.f155;
            throw null;
        }
        long j11 = aeVar.f155;
        int i12 = i11 + 25;
        f152 = i12 % 128;
        int i13 = i12 % 2;
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: JSONException -> 0x0114, TRY_ENTER, TryCatch #0 {JSONException -> 0x0114, blocks: (B:3:0x000a, B:12:0x0048, B:21:0x0055, B:52:0x00eb, B:53:0x00fb, B:54:0x0103, B:27:0x007e, B:35:0x0099, B:43:0x00cd, B:38:0x00b0), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4381(org.json.JSONObject r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ae.m4381(org.json.JSONObject, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m4382(org.json.JSONObject r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ae.f152
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ae.f149 = r1
            int r0 = r0 % 2
            r1 = 73
            if (r0 != 0) goto L11
            r0 = 49
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r2 = "增士䅧麜쒂闑\udc32"
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L2c
            int r0 = android.graphics.Color.green(r4)
            int r0 = r0 * r4
            java.lang.String r0 = m4389(r2, r0)
            java.lang.String r0 = r0.intern()
            boolean r0 = r5.has(r0)
            if (r0 != 0) goto L7c
            goto L48
        L2c:
            int r0 = android.graphics.Color.green(r3)
            int r0 = 1 - r0
            java.lang.String r0 = m4389(r2, r0)
            java.lang.String r0 = r0.intern()
            boolean r0 = r5.has(r0)
            r1 = 52
            if (r0 != 0) goto L45
            r0 = 89
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 == r1) goto L7c
        L48:
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.getTrimmedLength(r0)
            int r0 = 3 - r0
            int r1 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r1 = (byte) r1
            int r1 = r1 + 59
            byte r1 = (byte) r1
            java.lang.String r2 = "\u0013\t©"
            java.lang.String r0 = m4390(r2, r0, r1)
            java.lang.String r0 = r0.intern()
            boolean r5 = r5.has(r0)
            if (r5 == 0) goto L69
            goto L7c
        L69:
            int r5 = com.ironsource.adqualitysdk.sdk.i.ae.f152
            int r5 = r5 + 15
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ae.f149 = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L7b
            r5 = 28
            int r5 = r5 / r3
            return r3
        L79:
            r5 = move-exception
            throw r5
        L7b:
            return r3
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ae.m4382(org.json.JSONObject):boolean");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ long m4383(ae aeVar, long j10) {
        int i10 = f152 + 57;
        f149 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '\"' : 'E';
        aeVar.f158 = j10;
        if (c10 == '\"') {
            int i11 = 1 / 0;
        }
        return j10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m4384(ae aeVar, Boolean bool) {
        int i10 = f152 + 55;
        f149 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'X' : (char) 7;
        aeVar.f157 = bool;
        if (c10 == 'X') {
            int i11 = 68 / 0;
        }
        return bool;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m4385(JSONObject jSONObject) {
        int i10 = f149 + 63;
        f152 = i10 % 128;
        int i11 = i10 % 2;
        if (!(Math.abs((this.f159 - this.f155) - (jSONObject.optLong(m4390("\u0013\n{", 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 8)).intern()) - jSONObject.optLong(m4389("宭寘轷\u0a92ﳮ㠰", 1 - Gravity.getAbsoluteGravity(0, 0)).intern()))) > 10)) {
            int i12 = f149 + 93;
            f152 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        int i14 = f149 + 37;
        f152 = i14 % 128;
        if (i14 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m4386(ae aeVar) {
        int i10 = f152 + 23;
        f149 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 17 : 'J') == 'J') {
            return aeVar.f159;
        }
        long j10 = aeVar.f159;
        int i11 = 66 / 0;
        return j10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m4387(ae aeVar, long j10) {
        int i10 = f149;
        int i11 = i10 + 71;
        f152 = i11 % 128;
        int i12 = i11 % 2;
        aeVar.f159 = j10;
        int i13 = i10 + 5;
        f152 = i13 % 128;
        if (i13 % 2 == 0) {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m4388(ae aeVar, long j10) {
        int i10 = f149 + 1;
        int i11 = i10 % 128;
        f152 = i11;
        int i12 = i10 % 2;
        aeVar.f156 = j10;
        int i13 = i11 + 123;
        f149 = i13 % 128;
        if ((i13 % 2 == 0 ? 'D' : 'G') == 'G') {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4389(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f150, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f150));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4390(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f151;
            char c10 = f153;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2156 = 0;
                while (true) {
                    int i11 = g.f2156;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2155 = cArr[i11];
                    g.f2153 = cArr[g.f2156 + 1];
                    if (g.f2155 == g.f2153) {
                        cArr3[g.f2156] = (char) (g.f2155 - b10);
                        cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                    } else {
                        g.f2154 = g.f2155 / c10;
                        g.f2152 = g.f2155 % c10;
                        g.f2157 = g.f2153 / c10;
                        g.f2150 = g.f2153 % c10;
                        if (g.f2152 == g.f2150) {
                            g.f2154 = ((g.f2154 + c10) - 1) % c10;
                            g.f2157 = ((g.f2157 + c10) - 1) % c10;
                            int i12 = (g.f2154 * c10) + g.f2152;
                            int i13 = (g.f2157 * c10) + g.f2150;
                            int i14 = g.f2156;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2154 == g.f2157) {
                            g.f2152 = ((g.f2152 + c10) - 1) % c10;
                            g.f2150 = ((g.f2150 + c10) - 1) % c10;
                            int i15 = (g.f2154 * c10) + g.f2152;
                            int i16 = (g.f2157 * c10) + g.f2150;
                            int i17 = g.f2156;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2154 * c10) + g.f2150;
                            int i19 = (g.f2157 * c10) + g.f2152;
                            int i20 = g.f2156;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2156 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m4391(JSONObject jSONObject) {
        if ((!m4382(jSONObject) ? '\t' : (char) 17) != 17) {
            int i10 = f149 + 53;
            int i11 = i10 % 128;
            f152 = i11;
            int i12 = i10 % 2;
            if (!(this.f157 == null)) {
                int i13 = i11 + 89;
                f149 = i13 % 128;
                int i14 = i13 % 2;
                try {
                    m4378(jSONObject);
                    return true;
                } catch (Exception e10) {
                    kd.m6948(m4389("ꐀꑔᾬ\u09d4驔겢눷ʛ㱴ǵ⎜髮裸⠞㕈脡\ue6af剡伇\uef64ﵾ䒜曓헒쬦", KeyEvent.getDeadChar(0, 0) + 1).intern(), m4390("\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0007\b\u0006\u0003\u0001\u0007\u0005\u000e\u0005\u0007\r\u0001\r\u000e\u000b\u0007Ë", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, (byte) (87 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), e10, false);
                }
            }
        }
        return false;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bw;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;

/* JADX INFO: loaded from: classes11.dex */
public final class gq {

    public static class c extends gl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2237 = 66;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2238 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2239 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m6303(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2237);
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

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6274() {
            bw.a aVar = new bw.a(mo6277());
            int i10 = f2238 + 101;
            f2239 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 28 : 'E') == 'E') {
                return aVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6275() {
            int i10 = f2238 + 113;
            f2239 = i10 % 128;
            int i11 = i10 % 2;
            String strIntern = m6303("\u000f\u0003￫￤\ufff3\f\u0001\u0012\u0007\u0005\u0014\u000e￩￭ￎ\u000b\u0004\u0013\rￎ\f\u0001\u0012\u0007\u0005\u0014\u000e\t\rￎ\r", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31, true, TextUtils.indexOf("", "") + 2, TextUtils.indexOf((CharSequence) "", '0', 0) + 163).intern();
            int i12 = f2239 + 75;
            f2238 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 27 : '%') != 27) {
                return strIntern;
            }
            int i13 = 28 / 0;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6276() {
            int i10 = f2239 + 73;
            int i11 = i10 % 128;
            f2238 = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 65;
            f2239 = i13 % 128;
            int i14 = i13 % 2;
            return MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6277() {
            int i10 = f2238 + 105;
            f2239 = i10 % 128;
            String strIntern = (!(i10 % 2 == 0) ? m6303("￼\ufffa\t\u0003\ufffe\u0002\u0001\ufff6\u0007", TextUtils.getTrimmedLength("") + 9, true, TextUtils.getOffsetBefore("", 0) + 6, 173 - Color.blue(0)) : m6303("￼\ufffa\t\u0003\ufffe\u0002\u0001\ufff6\u0007", 12 >>> TextUtils.getTrimmedLength(""), false, 56 - TextUtils.getOffsetBefore("", 1), Color.blue(0) * 22603)).intern();
            int i11 = f2238 + 71;
            f2239 = i11 % 128;
            int i12 = i11 % 2;
            return strIntern;
        }
    }

    public static class d extends gl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2240 = 3189224698054276520L;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2241 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2242 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m6304(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2306) {
                char[] cArrM6319 = h.m6319(f2240, cArr, i10);
                h.f2307 = 4;
                while (true) {
                    int i11 = h.f2307;
                    if (i11 < cArrM6319.length) {
                        h.f2305 = i11 - 4;
                        cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f2240));
                        h.f2307++;
                    } else {
                        str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                    }
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6274() {
            bw.b bVar = new bw.b(mo6277());
            int i10 = f2242 + 71;
            f2241 = i10 % 128;
            int i11 = i10 % 2;
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6275() {
            int i10 = f2242 + 89;
            f2241 = i10 % 128;
            return m6304("竎违\uea9b窭\udb43祥Ʀ뮕갃쏷⬙\uecb2ퟪ굒牮핕弄瘦藏㿰\u2060徸꼉恉䮇⥱\uf68c䤾絝\uf2f1ᧀ", !(i10 % 2 != 0) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(1, 0)).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6276() {
            int i10 = f2242 + 11;
            f2241 = i10 % 128;
            if ((i10 % 2 != 0 ? 'W' : '%') != '%') {
                int i11 = 3 / 0;
            }
            return MBridgeSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6277() {
            int i10 = f2241 + 21;
            f2242 = i10 % 128;
            int i11 = (i10 % 2 == 0 ? 'Q' : 'B') != 'B' ? 1 : 0;
            return m6304("엯糮谔얂録य未\uf3beጪチ䶖\ua4cb棃", KeyEvent.getDeadChar(i11, i11)).intern();
        }
    }

    public gq() {
    }

    public gq(Context context) {
        context.getApplicationContext();
    }
}

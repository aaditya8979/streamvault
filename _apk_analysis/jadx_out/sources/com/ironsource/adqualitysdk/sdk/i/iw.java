package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class iw {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2634 = {'9', 'k', 'f', 'd', 'g', 'g', 'W', '\\', 'n', 'p', 's', 'u', 'l', 'Y', '*', 'a', 'g', 'a', 'g', 'h', 'B', 'J', 'q', 'G', 'H', 'o', 'q', 's', 'J', 'A', 'l', 't', 's', 'q', 'n', 'F', 'I', 'k', 'k', 's', 'm', 'l', 's', 'J', 'B', 'g', 'n', 'n', 'f', 'k', 'I', ':', 'S', 'O', '6', 'G', 'p', 'I', 'I', 'k', 'l', 'q', 'o', 'n', 'p', 'l', 'V', 'T', 'g', 'i', 'h', 'h', 'k', 'I', 'K', 'n', 'k', 'k', 'B', 'G', 'n', 'q', 'J', 'H', 'q', 'p', 'r', 'o', 'f', 'd', 'd', 277, 276, 262, 278, 274, 262, 243, 262, 268, 272, 279, 271, 266, 193, 272, 277, 193, 261, 262, 266, 275, 277, 193, 262, 271, 272, 262, 270, 272, 244, 271, 280, 272, 261, 277, 278, 265, 276, 193, 276, 258, 280, 193, 275, 262, 264, 258, 271, 258, 238, 268, 275, 272, 280, 277, 262, 239, 193, 271, 262, 265, 280, 193};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2635 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2636;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2637 = false;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final iv f2638;

    public interface e {
        /* JADX INFO: renamed from: ﾇ */
        iq mo6619();
    }

    public iw(Context context) {
        this.f2638 = new iv(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ iv m6612(iw iwVar) {
        int i10 = f2636 + 37;
        f2635 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        iv ivVar = iwVar.f2638;
        if (z10) {
            throw null;
        }
        return ivVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6613(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2470) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f2634, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2469 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2469;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2469 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2469 = 0;
                while (true) {
                    int i16 = i.f2469;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2469 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2469 = 0;
                while (true) {
                    int i17 = i.f2469;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2469 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6614(final iy iyVar, final e eVar) {
        int i10 = f2636 + 47;
        f2635 = i10 % 128;
        int i11 = i10 % 2;
        if (!(!this.f2637)) {
            k.m6886(m6613(new int[]{0, 14, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true).intern(), m6613(new int[]{91, 63, 161, 30}, null, true).intern());
            int i12 = f2636 + 5;
            f2635 = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            } else {
                throw null;
            }
        }
        jx.m6858(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2641 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f2642 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f2643 = -2129765469319968211L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m6620(final iy iyVar2, final e eVar2) {
                iw.m6612(iw.this).m6610(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo4470() {
                        iw.m6612(iw.this).m6608(this);
                        iw.m6615(iw.this, iyVar2, eVar2);
                    }
                });
                int i13 = f2641 + 55;
                f2642 = i13 % 128;
                int i14 = i13 % 2;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m6621(final iy iyVar2, e eVar2) {
                int i13 = f2641 + 79;
                f2642 = i13 % 128;
                int i14 = i13 % 2;
                if (!iw.m6612(iw.this).m6606()) {
                    int i15 = f2642 + 103;
                    f2641 = i15 % 128;
                    int i16 = i15 % 2;
                    m6620(iyVar2, eVar2);
                    return;
                }
                try {
                    final iq iqVarMo6619 = eVar2.mo6619();
                    if (iqVarMo6619 == null) {
                        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.3

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static int f2650 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static int f2651 = 1;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static long f2652 = 0;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static char f2653 = 55618;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static int f2654;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static String m6623(String str, char c10, String str2, int i17, String str3) {
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
                                    char[] cArr4 = (char[]) cArr.clone();
                                    char[] cArr5 = (char[]) cArr2.clone();
                                    cArr4[0] = (char) (c10 ^ cArr4[0]);
                                    cArr5[2] = (char) (cArr5[2] + ((char) i17));
                                    int length = cArr3.length;
                                    char[] cArr6 = new char[length];
                                    j.f2697 = 0;
                                    while (true) {
                                        int i18 = j.f2697;
                                        if (i18 < length) {
                                            int i19 = (i18 + 2) % 4;
                                            int i20 = (i18 + 3) % 4;
                                            int i21 = cArr4[i18 % 4] * 32718;
                                            char c11 = cArr5[i19];
                                            char c12 = (char) ((i21 + c11) % 65535);
                                            j.f2696 = c12;
                                            cArr5[i20] = (char) (((cArr4[i20] * 32718) + c11) / 65535);
                                            cArr4[i20] = c12;
                                            int i22 = j.f2697;
                                            cArr6[i22] = (char) (((((long) (c12 ^ cArr3[i22])) ^ f2652) ^ ((long) f2654)) ^ ((long) f2653));
                                            j.f2697 = i22 + 1;
                                        } else {
                                            str4 = new String(cArr6);
                                        }
                                    }
                                }
                                return str4;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4352() throws Exception {
                                int iM6593;
                                iq iqVar = iqVarMo6619;
                                if ((iqVar != null ? (char) 3 : 'a') != 3) {
                                    iM6593 = -1;
                                } else {
                                    iM6593 = iqVar.m6590().m6593();
                                    int i17 = f2650 + 61;
                                    f2651 = i17 % 128;
                                    int i18 = i17 % 2;
                                }
                                iy iyVar3 = iyVar2;
                                iq iqVar2 = iqVarMo6619;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m6623("堏\ud9a0\u007f覬ꂷ旆륐㍣睌샪죽ꨲ균㩖ᛀ墟柉\udc2aݾꞸ鴆뗚톕\ue753\ue0aa꽠粄뵶\ue40c䭝蹫꣎ߞ\ue7f3鮉坪䛬퍊쒨\ue2cf鮙솵㉬ﾕծ䘗\uda5eͼၫ頥솬笫鉣䱁\ue579틈떢⑥큚樂픒듭毴\uf175\u0b0d궝냫\ueece嶩", (char) (Color.argb(0, 0, 0, 0) + 4393), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0) - 1047993655, "즰裢⧁\uf111").intern());
                                sb2.append(iM6593);
                                iyVar3.mo4464(iqVar2, sb2.toString());
                                int i19 = f2650 + 93;
                                f2651 = i19 % 128;
                                if (!(i19 % 2 == 0)) {
                                } else {
                                    throw null;
                                }
                            }
                        });
                        return;
                    }
                    String strM6637 = ix.m6637(iqVarMo6619);
                    String strIntern = m6622("溩滧쀄핒詌儍䅼追䙲늗样噻㾠寿ヱ纅ᓐп", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m6622("\ud9d7\ud990ᘡ蹀屣綳ᩮꌔ\uf102擠㌽竽補跗毧刯ꎸ퉈聄╵筴窱뤅ﲊሠϵ톾ퟞ\u2d9d⠫ڿ꼬안煝㽴蚶鰒馞垚姣럪껔貆ㅈ亻\uf775ꕖ\u085d晑Ῠ", View.MeasureSpec.getSize(0) + 1).intern());
                    sb2.append(strM6637);
                    k.m6885(strIntern, sb2.toString());
                    t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() throws Exception {
                            iyVar2.mo4463(iqVarMo6619);
                        }
                    });
                } catch (Exception e10) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m6622("䝵䜠졘桗舛⊅ﱬﱠ澭뫜핹◊ᙲ叭跦ഏ㴇\u0c75昁穅\ue5d0ⓖ弉ꎽ貜\uddc9㟻裫댼\uf648\ue0a0\uf049寭꽡", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                    sb3.append(e10.getLocalizedMessage());
                    iyVar2.mo4464(null, sb3.toString());
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m6622(String str, int i13) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (h.f2306) {
                    char[] cArrM6319 = h.m6319(f2643, cArr, i13);
                    h.f2307 = 4;
                    while (true) {
                        int i14 = h.f2307;
                        if (i14 < cArrM6319.length) {
                            h.f2305 = i14 - 4;
                            cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f2643));
                            h.f2307++;
                        } else {
                            str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                        }
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                int i13 = f2641 + 57;
                f2642 = i13 % 128;
                int i14 = i13 % 2;
                m6621(iyVar, eVar);
                int i15 = f2642 + 1;
                f2641 = i15 % 128;
                int i16 = i15 % 2;
            }
        });
        int i13 = f2636 + 45;
        f2635 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return;
        }
        int i14 = 26 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m6615(iw iwVar, iy iyVar, e eVar) {
        int i10 = f2635 + 99;
        f2636 = i10 % 128;
        int i11 = i10 % 2;
        iwVar.m6614(iyVar, eVar);
        int i12 = f2636 + 101;
        f2635 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 94 / 0;
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6616(final String str, final JSONObject jSONObject, iy iyVar) {
        if (!TextUtils.isEmpty(str)) {
            m6614(iyVar, new e() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iw.e
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                public final iq mo6619() {
                    return ix.m6626(jSONObject, str);
                }
            });
            return;
        }
        int i10 = f2635 + 23;
        f2636 = i10 % 128;
        int i11 = i10 % 2;
        k.m6884(m6613(new int[]{0, 14, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true).intern(), m6613(new int[]{14, 77, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false).intern());
        int i12 = f2636 + 61;
        f2635 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6617() {
        int i10 = f2635 + 77;
        f2636 = i10 % 128;
        int i11 = i10 % 2;
        this.f2638.m6609();
        this.f2637 = true;
        int i12 = f2636 + 23;
        f2635 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final iv m6618() {
        int i10 = f2636;
        int i11 = i10 + 87;
        f2635 = i11 % 128;
        int i12 = i11 % 2;
        iv ivVar = this.f2638;
        int i13 = i10 + 115;
        f2635 = i13 % 128;
        int i14 = i13 % 2;
        return ivVar;
    }
}

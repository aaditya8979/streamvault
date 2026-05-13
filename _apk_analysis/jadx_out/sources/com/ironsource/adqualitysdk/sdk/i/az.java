package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class az {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f708 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f709 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f710 = 64;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f711 = -8838354928780161941L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f712 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f713 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f714 = {161, 163, 180, 159, 176, 181, 179, 165, 164, 182, 'z', 178, 175, 133, 174, 147};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private af f715;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ISAdQualityAdListener f716;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Handler f719;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<il> f718 = new HashSet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<String> f717 = new HashSet();

    public az(Handler handler, af afVar) {
        this.f715 = afVar;
        this.f719 = handler;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ af m4825(az azVar) {
        int i10 = f709 + 37;
        int i11 = i10 % 128;
        f708 = i11;
        int i12 = i10 % 2;
        af afVar = azVar.f715;
        int i13 = i11 + 99;
        f709 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return afVar;
        }
        int i14 = 6 / 0;
        return afVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m4826(az azVar, String str, JSONObject jSONObject) {
        int i10 = f708 + 53;
        f709 = i10 % 128;
        int i11 = i10 % 2;
        azVar.m4829(str, jSONObject);
        int i12 = f709 + 123;
        f708 = i12 % 128;
        if ((i12 % 2 == 0 ? 'T' : 'R') == 'R') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4827(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f711, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f711));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static double m4828() {
        int i10 = f708 + 57;
        f709 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m4559().mo4576();
            throw null;
        }
        if (!(ar.m4559().mo4576())) {
            return ar.m4559().mo4577();
        }
        int i11 = f709 + 83;
        f708 = i11 % 128;
        int i12 = i11 % 2;
        return 100.0d;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4829(final String str, JSONObject jSONObject) {
        m4831(str, jSONObject);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            String str2 = ih.f2566;
            jSONObjectJsonObjectInit.put(str2, jSONObject.remove(str2));
            String str3 = ih.f2519;
            jSONObjectJsonObjectInit.put(str3, jSONObject.remove(str3));
            int i10 = f709 + 83;
            f708 = i10 % 128;
            int i11 = i10 % 2;
        } catch (JSONException unused) {
        }
        this.f715.m4451(str, jSONObject, jSONObjectJsonObjectInit, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (ih.f2510.contains(str)) {
                    t.m7069(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            az.m4825(az.this).m4450();
                        }
                    });
                }
            }
        });
        int i12 = f709 + 101;
        f708 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4830(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3010) {
            char[] cArr2 = f714;
            int i11 = f710;
            if (f713) {
                int length = bArr.length;
                m.f3012 = length;
                char[] cArr3 = new char[length];
                m.f3011 = 0;
                while (m.f3011 < m.f3012) {
                    int i12 = m.f3011;
                    int i13 = m.f3012 - 1;
                    int i14 = m.f3011;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f3011 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f712) {
                int length2 = cArr.length;
                m.f3012 = length2;
                char[] cArr4 = new char[length2];
                m.f3011 = 0;
                while (m.f3011 < m.f3012) {
                    int i15 = m.f3011;
                    int i16 = m.f3012 - 1;
                    int i17 = m.f3011;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f3011 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f3012 = length3;
            char[] cArr5 = new char[length3];
            m.f3011 = 0;
            while (m.f3011 < m.f3012) {
                int i18 = m.f3011;
                int i19 = m.f3012 - 1;
                int i20 = m.f3011;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f3011 = i20 + 1;
            }
            return new String(cArr5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[PHI: r1
      0x004f: PHI (r1v15 org.json.JSONObject) = (r1v11 org.json.JSONObject), (r1v21 org.json.JSONObject) binds: [B:23:0x004c, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4831(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<com.ironsource.adqualitysdk.sdk.i.il> r1 = r5.f718
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            if (r1 == r3) goto L19
            return
        L19:
            int r1 = com.ironsource.adqualitysdk.sdk.i.az.f709
            int r1 = r1 + 69
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f708 = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L27
            r1 = r3
            goto L28
        L27:
            r1 = r2
        L28:
            if (r1 == r3) goto L37
            java.lang.Object r1 = r0.next()
            com.ironsource.adqualitysdk.sdk.i.il r1 = (com.ironsource.adqualitysdk.sdk.i.il) r1
            org.json.JSONObject r1 = r1.mo4712(r6, r7)
            if (r1 == 0) goto L66
            goto L4f
        L37:
            java.lang.Object r1 = r0.next()
            com.ironsource.adqualitysdk.sdk.i.il r1 = (com.ironsource.adqualitysdk.sdk.i.il) r1
            org.json.JSONObject r1 = r1.mo4712(r6, r7)
            r3 = 17
            int r3 = r3 / r2
            r2 = 32
            if (r1 == 0) goto L4a
            r3 = r2
            goto L4c
        L4a:
            r3 = 62
        L4c:
            if (r3 == r2) goto L4f
            goto L66
        L4f:
            int r2 = com.ironsource.adqualitysdk.sdk.i.az.f708
            int r2 = r2 + 107
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f709 = r3
            int r2 = r2 % 2
            com.ironsource.adqualitysdk.sdk.i.jz.m6871(r7, r1)
            int r1 = com.ironsource.adqualitysdk.sdk.i.az.f708
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f709 = r2
            int r1 = r1 % 2
        L66:
            int r1 = com.ironsource.adqualitysdk.sdk.i.az.f709
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.az.f708 = r2
            int r1 = r1 % 2
            goto Lb
        L71:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.az.m4831(java.lang.String, org.json.JSONObject):void");
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m4832(JSONObject jSONObject) {
        int i10 = f709 + 51;
        f708 = i10 % 128;
        int i11 = i10 % 2;
        m4841(m4827("౷阰ఖ僿\uda38葵졝慫㶿\ue842騎鋬潝㦜겨첉餗", View.MeasureSpec.getMode(0) + 1).intern(), jSONObject);
        int i12 = f709 + 41;
        f708 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final void m4833(JSONObject jSONObject) {
        int i10 = f709 + 61;
        f708 = i10 % 128;
        int i11 = i10 % 2;
        m4841(m4827("郧当邆ࢴ\u135b屽逖륣ꄸℰ쉙䫠\uf3cf\uf0f5\uf4fe", View.resolveSize(0, 0) + 1).intern(), jSONObject);
        int i12 = f708 + 13;
        f709 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final void m4834(JSONObject jSONObject) {
        int i10 = f708 + 59;
        f709 = i10 % 128;
        m4841(m4830((String) null, (i10 % 2 != 0 ? '<' : G5.T) != '<' ? 126 - TextUtils.indexOf((CharSequence) "", '0') : TextUtils.indexOf((CharSequence) "", '(') * 60, (int[]) null, "\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final void m4835(JSONObject jSONObject) {
        int i10 = f708 + 99;
        f709 = i10 % 128;
        m4841(m4830((String) null, (i10 % 2 != 0 ? ']' : '\n') != ']' ? (ViewConfiguration.getTouchSlop() >> 8) + 127 : (ViewConfiguration.getTouchSlop() % 100) * 81, (int[]) null, "\u0088\u0083\u0081\u0083\u0087\u0084\u0089\u0088\u008a\u0081\u0087\u0084\u0083\u0082\u0081").intern(), jSONObject);
        int i11 = f708 + 45;
        f709 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4836(il ilVar) {
        int i10 = f709 + 97;
        f708 = i10 % 128;
        int i11 = i10 % 2;
        this.f718.add(ilVar);
        int i12 = f708 + 77;
        f709 = i12 % 128;
        if ((i12 % 2 != 0 ? 'Y' : 'K') != 'Y') {
            return;
        }
        int i13 = 3 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4837(JSONObject jSONObject) {
        int i10 = f709 + 63;
        f708 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = jSONObject.optInt(ih.f2562);
        ISAdQualityAdListener iSAdQualityAdListener = this.f716;
        if ((iSAdQualityAdListener != null ? '\'' : (char) 16) != 16) {
            int i12 = f708 + 51;
            f709 = i12 % 128;
            if (!(i12 % 2 != 0)) {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(ih.f2566), ISAdQualityAdType.fromInt(iOptInt));
            } else {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(ih.f2566), ISAdQualityAdType.fromInt(iOptInt));
                int i13 = 35 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4838(JSONObject jSONObject) {
        int i10 = f709 + 91;
        f708 = i10 % 128;
        int i11 = i10 % 2;
        m4841(m4827("㙼肷㘝詥첿彲\u12c7멬ޣﻔ䂆䧭啐⼑瘯", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), jSONObject);
        int i12 = f708 + 83;
        f709 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4839(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f708;
        int i11 = i10 + 21;
        f709 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        this.f716 = iSAdQualityAdListener;
        if (z10) {
            throw null;
        }
        int i12 = i10 + 77;
        f709 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4840(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z10) {
        synchronized (this.f717) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m4830((String) null, 127 - Gravity.getAbsoluteGravity(0, 0), (int[]) null, "\u008b").intern());
            sb2.append(str2);
            String string = sb2.toString();
            if (!this.f717.contains(string) || z10 || ar.m4559().mo4580()) {
                this.f717.add(string);
                if (Math.random() * 100.0d >= m4828()) {
                    k.m6885(m4830((String) null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, (int[]) null, "\u008c\u0088\u0089\u008f\u0088\u0090\u0083\u008f\u0088\u008a\u008e").intern(), m4827("嶵䁈己鴲ొ㲪֗\ud988汸㸭埔⨮㺃\uefec愼瑇죁ꅸ낍䚝魷匼싆靻ꖌӹ\u0c65\ue159矉㘛忁㏃٥\ue83e槜簱탲駷묤乻\ue2d8䭌쪣飇굹紃ᓎ\ue936羢⻯♧㭣ু", 1 - TextUtils.indexOf("", "", 0, 0)).intern());
                    return;
                }
                JSONObject jSONObjectM4422 = af.m4422(str, str2, str3, str4, jSONObject);
                m4831(m4830((String) null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (int[]) null, "\u008c\u008d\u008c\u008c\u0088\u0084\u0085\u0083").intern(), jSONObjectM4422);
                this.f715.m4444(m4830((String) null, TextUtils.getOffsetBefore("", 0) + 127, (int[]) null, "\u008c\u008d\u008c\u008c\u0088\u0084\u0085\u0083").intern(), jSONObjectM4422);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4841(final String str, final JSONObject jSONObject) {
        this.f719.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                az.m4826(az.this, str, jSONObject);
            }
        });
        int i10 = f708 + 61;
        f709 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4842(JSONObject jSONObject) {
        int i10 = f708 + 75;
        f709 = i10 % 128;
        m4841(m4827("ل鋟إ芕\uded7喵ᨷ낫㞚\uecad䡤䌭敱㵹统", !(i10 % 2 == 0) ? View.MeasureSpec.getSize(1) * 0 : View.MeasureSpec.getSize(0) + 1).intern(), jSONObject);
        int i11 = f709 + 39;
        f708 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 77 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4843(JSONObject jSONObject) {
        int i10 = f709 + 3;
        f708 = i10 % 128;
        if ((i10 % 2 == 0 ? 'T' : '1') != '1') {
            throw null;
        }
        ISAdQualityAdListener iSAdQualityAdListener = this.f716;
        if ((iSAdQualityAdListener != null ? '_' : '4') == '_') {
            iSAdQualityAdListener.adClosed(jSONObject.optString(ih.f2566), ISAdQualityAdType.fromInt(jSONObject.optInt(ih.f2562)));
        }
        int i11 = f709 + 43;
        f708 = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4844(String str, String str2, String str3, String str4) {
        int i10 = f709 + 99;
        f708 = i10 % 128;
        int i11 = i10 % 2;
        m4840(str, str2, str3, str4, null, false);
        int i12 = f709 + 29;
        f708 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4845(JSONObject jSONObject) {
        int i10 = f708 + 47;
        f709 = i10 % 128;
        int i11 = i10 % 2;
        m4841(m4827("퓠嵊풁齻ᅂᢛߙﶅ\ue52f⌯喜ท럌\uf2ec挱", KeyEvent.keyCodeFromString("") + 1).intern(), jSONObject);
        int i12 = f709 + 85;
        f708 = i12 % 128;
        int i13 = i12 % 2;
    }
}

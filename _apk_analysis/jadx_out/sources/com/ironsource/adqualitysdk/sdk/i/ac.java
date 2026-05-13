package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.i.y;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ac extends y<View> implements View.OnLayoutChangeListener, jl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f130 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f131 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f132 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f133 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f134 = {369, 387, 392, 382, 393, 401, 368, 383, 347, 354, 379, 390, 396, 351, 314, 397, 398, 385, 400, 384, 391, 340, 358, 403, 399, 349, 386};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f135 = 282;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f136;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f137;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b f138;

    public class b extends y.c {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f139 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f140 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f141 = {166, 151, 168, 155, 164, 170, 140, 159, 173, 134, 156, 174, 160, 169, 138, 165, 127, 153, 171, 141, 152, 'y', 162, 172, 157};

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static boolean f142 = true;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static boolean f143 = true;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f144 = 54;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f145 = -2839741285697766634L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f146;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f147;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f148;

        public b(ac acVar) {
        }

        public b(ac acVar, JSONObject jSONObject) {
            m4372(jSONObject.optString(m4375("煥焒坡氒弜⥒꡶ᥢ鵔䬙䮡㖯ꦹ羵柽⇷됣汭ላ\ude59쁕耖ົ쪲\uecb4뒤", Color.red(0)).intern()));
            m4373(jSONObject.optString(m4375("埓垥\uecdd힢灞ؗ⟌雹믈\uf0a0擲먥輐쐪䢪깓銾", View.combineMeasuredStates(0, 0)).intern()));
            m4369(jSONObject.optString(m4376(null, 127 - TextUtils.indexOf("", ""), null, "\u008c\u0088\u008b\u0084\u0083\u008a\u0089\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()));
            m7164(jSONObject.optString(m4376(null, 175 - AndroidCharacter.getMirror('0'), null, "\u0086\u0092\u0084\u008d\u0085\u0091\u0090\u008f\u008e\u008d").intern()));
            m7166(false);
            m7162(!TextUtils.isEmpty(jSONObject.optString(m4376(null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, "\u0086\u0092\u0084\u008d\u0085\u0091\u0090\u008f\u008e\u008d").intern())) || jSONObject.optBoolean(m4376(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0086\u0085\u0084\u0088\u0097\u0096\u0089\u0084\u0088\u0087\u0095\u0084\u0094\u0084\u008e\u0093").intern()) || jSONObject.optBoolean(m4375("䎚䏯슲輪끣옪\ue1bc傩꾧\udedbꓭ籎魘\uea7e袛栫蛑殮ﵷ鞓\uf294ᗕ", View.getDefaultSize(0, 0)).intern()));
            m7168(jSONObject.optBoolean(m4376(null, View.getDefaultSize(0, 0) + 127, null, "\u0086\u0085\u0084\u0088\u0097\u0096\u0089\u0084\u0088\u0087\u0095\u0084\u0094\u0084\u008e\u0093").intern()));
            m7161(jSONObject.optBoolean(m4375("둰됅夸扝\ue330镹猘숟塐䕇\uf78f\ueee3沊燨", TextUtils.indexOf("", "", 0)).intern()));
            m7165(TextUtils.isEmpty(jSONObject.optString(m4375("⇥←䌸硜ἢ楢跼㳮췏彗\u0b80ဏ來", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) ? null : Arrays.asList(jSONObject.optString(m4375("⇥←䌸硜ἢ楢跼㳮췏彗\u0b80ဏ來", TextUtils.lastIndexOf("", '0') + 1).intern()).split(m4375("ㄏㄣ珏횟⇍", TextUtils.indexOf("", "", 0, 0)).intern())));
            m7169(jSONObject.optBoolean(m4375("䝇䜲ῖ⒳唜⍕\uef76幾ꭾΫ䆰犟龔㜇淠更舻", MotionEvent.axisFromString("") + 1).intern(), true));
            m7163(false);
            m7159(jSONObject.optBoolean(m4375("莑菼逶ꭕ롽츽춎粸澠豋곕偱孨룽肒䐈䛸ꬥ\uf56a뮡㊂", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern()));
            m7160(jSONObject.optBoolean(m4375("\udf97\udffe꿬钗쫯벳\uf4be䖳㎡뎩\ude58楗ݓ", View.getDefaultSize(0, 0)).intern()));
            m7167(jz.m6876(jSONObject.optJSONArray(m4376(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0084\u0083\u0090\u0085\u0099\u0091\u0090\u008f\u008e\u0089\u0084\u0088\u0098").intern())));
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m4369(String str) {
            int i10 = f139;
            int i11 = i10 + 15;
            f140 = i11 % 128;
            int i12 = i11 % 2;
            this.f147 = str;
            int i13 = i10 + 29;
            f140 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m4370(b bVar) {
            int i10 = f140 + 37;
            int i11 = i10 % 128;
            f139 = i11;
            int i12 = i10 % 2;
            String str = bVar.f148;
            int i13 = i11 + 49;
            f140 = i13 % 128;
            if (i13 % 2 == 0) {
                return str;
            }
            int i14 = 17 / 0;
            return str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m4371(b bVar) {
            int i10 = f139 + 9;
            int i11 = i10 % 128;
            f140 = i11;
            int i12 = i10 % 2;
            String str = bVar.f146;
            int i13 = i11 + 31;
            f139 = i13 % 128;
            int i14 = i13 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m4372(String str) {
            int i10 = f139 + 121;
            f140 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f148 = str;
                int i11 = 14 / 0;
            } else {
                this.f148 = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m4373(String str) {
            int i10 = f140;
            int i11 = i10 + 25;
            f139 = i11 % 128;
            int i12 = i11 % 2;
            this.f146 = str;
            int i13 = i10 + 33;
            f139 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m4374(b bVar) {
            int i10 = f139;
            int i11 = i10 + 21;
            f140 = i11 % 128;
            int i12 = i11 % 2;
            String str = bVar.f147;
            int i13 = i10 + 89;
            f140 = i13 % 128;
            if (i13 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4375(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2306) {
                char[] cArrM6319 = h.m6319(f145, cArr, i10);
                h.f2307 = 4;
                while (true) {
                    int i11 = h.f2307;
                    if (i11 < cArrM6319.length) {
                        h.f2305 = i11 - 4;
                        cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f145));
                        h.f2307++;
                    } else {
                        str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                    }
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4376(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f141;
                int i11 = f144;
                if (f142) {
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
                if (f143) {
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
    }

    public ac(JSONObject jSONObject) {
        super(null);
        this.f137 = new WeakHashMap<>();
        this.f138 = new b(this);
        m4363(jSONObject);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private View m4354(View view, String str) {
        int i10 = f130 + 125;
        int i11 = i10 % 128;
        f133 = i11;
        int i12 = i10 % 2;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i13 = i11 + 83;
        f130 = i13 % 128;
        int i14 = i13 % 2;
        ViewGroup viewGroup = (ViewGroup) view;
        int i15 = 0;
        while (true) {
            if ((i15 < viewGroup.getChildCount() ? ')' : '8') == '8') {
                return null;
            }
            View childAt = viewGroup.getChildAt(i15);
            if (childAt.getClass().getName().startsWith(str)) {
                return childAt;
            }
            View viewM4354 = m4354(childAt, str);
            if ((viewM4354 != null ? (char) 28 : ' ') == 28) {
                return viewM4354;
            }
            i15++;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static View m4355(View view) {
        int i10 = f130 + 19;
        int i11 = i10 % 128;
        f133 = i11;
        if ((i10 % 2 == 0 ? '6' : '\"') == '6') {
            int i12 = 91 / 0;
        }
        int i13 = i11 + 27;
        f130 = i13 % 128;
        int i14 = i13 % 2;
        return view;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4356(View view, List<WebView> list) {
        int i10 = f133 + 85;
        f130 = i10 % 128;
        int i11 = i10 % 2;
        ke.m6969(view, WebView.class, b.m4370(this.f138), true, false, null, this.f138.f3231, list);
        int i12 = f130 + 93;
        f133 = i12 % 128;
        if ((i12 % 2 == 0 ? '%' : 'J') == 'J') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private View m4357(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        while (true) {
            if (i10 >= viewGroup.getChildCount()) {
                return null;
            }
            int i11 = f130 + 125;
            f133 = i11 % 128;
            int i12 = i11 % 2;
            View childAt = viewGroup.getChildAt(i10);
            if (!(!cls.isAssignableFrom(childAt.getClass()))) {
                int i13 = f133 + 63;
                f130 = i13 % 128;
                int i14 = i13 % 2;
                return childAt;
            }
            View viewM4357 = m4357(childAt, cls);
            if ((viewM4357 != null ? (char) 31 : (char) 27) == 31) {
                int i15 = f130 + 35;
                f133 = i15 % 128;
                int i16 = i15 % 2;
                return viewM4357;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4358(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f134;
            int i11 = f135;
            if (f131) {
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
            if (f132) {
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4359() {
        int i10 = f133 + 73;
        f130 = i10 % 128;
        if ((i10 % 2 != 0 ? '5' : '&') == '5') {
            ji.m6743().m6750(this);
            throw null;
        }
        ji.m6743().m6750(this);
        int i11 = f130 + 23;
        f133 = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    private void m4360(View view) {
        if (!this.f137.containsKey(view)) {
            int i10 = f130 + 83;
            f133 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f137.put(view, Boolean.TRUE);
                mo7105(view, Integer.toHexString(view.hashCode()));
                throw null;
            }
            this.f137.put(view, Boolean.TRUE);
            mo7105(view, Integer.toHexString(view.hashCode()));
        }
        int i11 = f133 + 51;
        f130 = i11 % 128;
        if ((i11 % 2 != 0 ? 'F' : (char) 14) == 14) {
        } else {
            throw null;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = f130 + 27;
        f133 = i18 % 128;
        int i19 = i18 % 2;
        try {
            View viewM4357 = m4357(view, this.f136);
            if (viewM4357 != null) {
                int i20 = f133 + 103;
                f130 = i20 % 128;
                if ((i20 % 2 != 0 ? 'N' : '7') != 'N') {
                    m4360(viewM4357);
                    view.removeOnLayoutChangeListener(this);
                } else {
                    m4360(viewM4357);
                    view.removeOnLayoutChangeListener(this);
                    int i21 = 92 / 0;
                }
                int i22 = f133 + 33;
                f130 = i22 % 128;
                int i23 = i22 % 2;
            }
        } catch (Throwable th2) {
            kd.m6948(m4358((String) null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, (int[]) null, "\u008d\u0088\u008c\u0084\u0083\u008b\u008a\u0084\u0089\u0086\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m4358((String) null, Drawable.resolveOpacity(0, 0) + 127, (int[]) null, "\u0088\u0092\u0083\u008b\u009b\u009a\u0091\u0099\u0085\u0098\u008b\u0097\u0083\u0085\u008f\u0083\u0082\u008f\u008d\u0085\u008d\u008d\u008e").intern(), th2, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void mo4361(View view) {
        int i10 = f133 + 53;
        f130 = i10 % 128;
        if ((i10 % 2 != 0 ? '!' : 'E') == '!') {
            m4357(view, this.f136);
            throw null;
        }
        View viewM4357 = m4357(view, this.f136);
        if ((viewM4357 != null ? '[' : '^') == '[') {
            if ((this.f137.remove(viewM4357) != null ? (char) 5 : '8') != '8') {
                mo7103(view);
                int i11 = f130 + 103;
                f133 = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        int i13 = f133 + 27;
        f130 = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ void mo4362(View view, List list) {
        int i10 = f133 + 75;
        f130 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '2' : '1';
        m4356(view, (List<WebView>) list);
        if (c10 != '2') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4363(JSONObject jSONObject) {
        b bVar = new b(this, jSONObject);
        m7145(bVar);
        this.f138 = bVar;
        try {
            this.f136 = Class.forName(b.m4371(bVar));
            int i10 = f133 + 55;
            f130 = i10 % 128;
            char c10 = i10 % 2 != 0 ? ' ' : (char) 16;
            m4359();
            if (c10 == 16) {
            } else {
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            String strIntern = m4358((String) null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, (int[]) null, "\u008d\u0088\u008c\u0084\u0083\u008b\u008a\u0084\u0089\u0086\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m4358((String) null, KeyEvent.normalizeMetaState(0) + 127, (int[]) null, "\u008f\u0095\u0085\u008d\u0094\u008f\u0090\u0091\u0083\u0088\u0093\u0088\u008f\u0085\u0091\u008f\u0092\u0083\u0082\u0083\u0088\u0091\u0090\u0082\u008c\u008f\u008d\u0085\u008d\u008d\u008e").intern());
            sb2.append(b.m4371(bVar));
            sb2.append(m4358((String) null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (int[]) null, "\u008f\u0096").intern());
            sb2.append(e10.getLocalizedMessage());
            k.m6885(strIntern, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4364() {
        int i10 = f133 + 33;
        f130 = i10 % 128;
        int i11 = i10 % 2;
        m7127((r) null);
        ji.m6743().m6751(this);
        int i12 = f133 + 25;
        f130 = i12 % 128;
        if ((i12 % 2 != 0 ? '8' : '1') != '8') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void mo4365(View view) {
        View viewM4357 = m4357(view, this.f136);
        if ((viewM4357 != null ? (char) 28 : (char) 14) != 14) {
            m4360(viewM4357);
            return;
        }
        if (!TextUtils.isEmpty(b.m4374(this.f138))) {
            int i10 = f130 + 69;
            f133 = i10 % 128;
            if (i10 % 2 == 0) {
                m4354(view, b.m4374(this.f138));
                throw null;
            }
            View viewM4354 = m4354(view, b.m4374(this.f138));
            if ((viewM4354 != null ? (char) 27 : 'L') != 'L') {
                int i11 = f130 + 33;
                f133 = i11 % 128;
                int i12 = i11 % 2;
                viewM4354.addOnLayoutChangeListener(this);
            }
        }
        int i13 = f133 + 93;
        f130 = i13 % 128;
        if (i13 % 2 == 0) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final r<WebView, View> mo4366() {
        int i10 = f130 + 95;
        int i11 = i10 % 128;
        f133 = i11;
        if ((i10 % 2 == 0 ? 'a' : '2') != '2') {
            int i12 = 19 / 0;
        }
        int i13 = i11 + 5;
        f130 = i13 % 128;
        if (i13 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ View mo4367(View view) {
        int i10 = f133 + 101;
        f130 = i10 % 128;
        int i11 = i10 % 2;
        View viewM4355 = m4355(view);
        int i12 = f133 + 23;
        f130 = i12 % 128;
        int i13 = i12 % 2;
        return viewM4355;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final aa mo4368() {
        ad adVar = new ad();
        int i10 = f130 + 95;
        f133 = i10 % 128;
        int i11 = i10 % 2;
        return adVar;
    }
}

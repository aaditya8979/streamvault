package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.hp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class hr extends hp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Class f2407;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private int f2408;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f2409;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<Class> f2410;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<Class> f2411 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f2412;

    public static class c extends hp.b implements cl {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2413 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2414 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2415 = {'s', 'e', 't', 'R', 'u', 'r', 'n', 'T', 'y', 'p', 'o', 'F', 'i', 'd', 'k', 'M', 'h', 'a', 'f', 'E', 'x', 'c', 'l', 'v', 'w'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2416 = 4017479574797664034L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2417 = 5;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hr f2418 = new hr();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m6393(int i10) {
            int i11 = f2413 + 75;
            f2414 = i11 % 128;
            if ((i11 % 2 != 0 ? '$' : '+') == '$') {
                this.f2418.f2408 = i10;
                throw null;
            }
            this.f2418.f2408 = i10;
            int i12 = f2413 + 71;
            f2414 = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m6394(Class cls) {
            int i10 = f2414 + 93;
            f2413 = i10 % 128;
            int i11 = i10 % 2;
            this.f2418.f2411.add(cls);
            int i12 = f2413 + 1;
            f2414 = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m6395(List<Class> list) {
            int i10 = f2414 + 89;
            f2413 = i10 % 128;
            if ((i10 % 2 == 0 ? '\\' : 'O') != 'O') {
                this.f2418.f2410 = list;
                throw null;
            }
            this.f2418.f2410 = list;
            int i11 = f2413 + 1;
            f2414 = i11 % 128;
            if ((i11 % 2 != 0 ? 'J' : 'b') == 'b') {
                return this;
            }
            int i12 = 39 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m6396(int i10) {
            int i11 = f2414;
            int i12 = i11 + 67;
            f2413 = i12 % 128;
            int i13 = i12 % 2;
            hr hrVar = this.f2418;
            hrVar.f2397 = i10 | hrVar.f2397;
            int i14 = i11 + 99;
            f2413 = i14 % 128;
            int i15 = i14 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m6397(Class cls) {
            int i10 = f2413 + 33;
            f2414 = i10 % 128;
            if ((i10 % 2 != 0 ? 'J' : (char) 24) != 24) {
                this.f2418.f2407 = cls;
                throw null;
            }
            this.f2418.f2407 = cls;
            int i11 = f2414 + 85;
            f2413 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m6398(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2306) {
                char[] cArrM6319 = h.m6319(f2416, cArr, i10);
                h.f2307 = 4;
                while (true) {
                    int i11 = h.f2307;
                    if (i11 < cArrM6319.length) {
                        h.f2305 = i11 - 4;
                        cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f2416));
                        h.f2307++;
                    } else {
                        str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                    }
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m6399() {
            int i10 = f2414 + 115;
            f2413 = i10 % 128;
            int i11 = i10 % 2;
            this.f2418.mo6354();
            int i12 = f2414 + 123;
            f2413 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m6400(int i10) {
            int i11 = f2414 + 77;
            int i12 = i11 % 128;
            f2413 = i12;
            int i13 = i11 % 2;
            hr hrVar = this.f2418;
            hrVar.f2399 = i10 | hrVar.f2399;
            int i14 = i12 + 53;
            f2414 = i14 % 128;
            if (!(i14 % 2 != 0)) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m6401(boolean z10) {
            int i10 = f2414 + 55;
            f2413 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                this.f2418.f2409 = z10;
            } else {
                this.f2418.f2409 = z10;
                int i11 = 36 / 0;
            }
            int i12 = f2414 + 63;
            f2413 = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m6402(int i10) {
            int i11 = f2414 + 5;
            f2413 = i11 % 128;
            if (!(i11 % 2 == 0)) {
                this.f2418.f2412 = i10;
                return this;
            }
            this.f2418.f2412 = i10;
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m6403(boolean z10, int i10) {
            int i11 = f2413 + 37;
            int i12 = i11 % 128;
            f2414 = i12;
            int i13 = i11 % 2;
            hr hrVar = this.f2418;
            hrVar.f2398 = z10;
            hrVar.f2400 = i10;
            int i14 = i12 + 35;
            f2413 = i14 % 128;
            int i15 = i14 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hr m6404() {
            int i10 = f2414;
            int i11 = i10 + 57;
            f2413 = i11 % 128;
            int i12 = i11 % 2;
            hr hrVar = this.f2418;
            int i13 = i10 + 45;
            f2413 = i13 % 128;
            if ((i13 % 2 == 0 ? '*' : (char) 22) == 22) {
                return hrVar;
            }
            int i14 = 92 / 0;
            return hrVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m6405(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2151) {
                char[] cArr2 = f2415;
                char c10 = f2417;
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

        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo4888(String str, List<Object> list, ch chVar) {
            while (true) {
                byte b10 = 5;
                int iIntValue = -1;
                switch (str.hashCode()) {
                    case -2020212392:
                        if (!str.equals(m6398("ꔶꕗ幂\uec7a颏\ue104鉚ꖻ姛\ue59c雃ꄓ屈\ue624魗꺉僋\ueaac鿉\uaa38坱\uef6e鱱띻䯻", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case -600792781:
                        if (!str.equals(m6405("\u0004\n\u000e\u0007\u0010\u0000\u0001\u0011\u000b\u000e¨", View.getDefaultSize(0, 0) + 11, (byte) (53 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 94094958:
                        if ((str.equals(m6398("\uec8e\uecec恈댷噛\udf1f촚歑ၢ", View.getDefaultSize(0, 0)).intern()) ? ',' : 'a') == ',') {
                            int i10 = f2413 + 25;
                            f2414 = i10 % 128;
                            b10 = (i10 % 2 != 0 ? (char) 28 : '5') == 28 ? (byte) 101 : (byte) 10;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 108404047:
                        if (!str.equals(m6405("\u0006\u0000\u0001\u0002æ", View.getDefaultSize(0, 0) + 5, (byte) (TextUtils.lastIndexOf("", '0', 0) + 115)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 132643084:
                        if (!str.equals(m6398("衿蠌\udde2鞮㖕报\ue99eࢽ璂春\ued00ఞ焝斟\ue09cγ綆椪\ue413܆稺泔\ue7afᩡ暤", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                            b10 = -1;
                        }
                        b10 = 2;
                        break;
                    case 200590504:
                        if (!str.equals(m6398("⊲⋁㌀飾虀豇\ue6db뭔\ude59裂\ue274뿁\udbd0護\uefd2끗흉蟎\ueb70듛탦舷\ue8e8ꦨ챎麳\uf462ꨫ", Process.myTid() >> 22).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 387034026:
                        if ((str.equals(m6398("剸刋餹퉵㴢♾걐6꺓⋻꣰Ңꬻⅾꕑ\u0b31Ꞓⷠꇅ\u0fbdꀫ⠈", Color.green(0)).intern()) ? '#' : ';') == ';') {
                            b10 = -1;
                        } else {
                            b10 = 7;
                        }
                        break;
                    case 391966482:
                        if (!str.equals(m6398("\uf798\uf7f9锒Ꟍᵅ⩔\ud9ec\u206e\u0b7f⻜\udd69Ⓧ\u0ee1ⵅ탪⭀ɔ⇇푙⿕כ\u243cퟝ㊧ᥕ", TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern())) {
                            b10 = -1;
                        } else {
                            int i11 = f2413 + 1;
                            f2414 = i11 % 128;
                            if (i11 % 2 != 0) {
                                b10 = 2;
                            }
                        }
                        break;
                    case 393987200:
                        if (!str.equals(m6405("\u0001\u0002\u0003\u0004\u0002\u0003\u0000\t\u0007\b\t\u0005\u0002\u0006\u000b\f\u000b\u0007¿", 19 - View.combineMeasuredStates(0, 0), (byte) (91 - KeyEvent.keyCodeFromString(""))).intern())) {
                            b10 = -1;
                        } else {
                            int i12 = f2414 + 111;
                            f2413 = i12 % 128;
                            int i13 = i12 % 2;
                            b10 = 0;
                        }
                        break;
                    case 1423210564:
                        if (!str.equals(m6405("\u0012\f\n\u0012\u000b\u000e\r\u0011\u000b\u0002\n\u0005\u0005\f\u000f\u0018\u0016\u0017\u0003\u000eÆ", 20 - TextUtils.lastIndexOf("", '0'), (byte) (145 - AndroidCharacter.getMirror('0'))).intern())) {
                            b10 = -1;
                        } else {
                            int i14 = f2414 + 15;
                            f2413 = i14 % 128;
                            int i15 = i14 % 2;
                            b10 = 6;
                        }
                        break;
                    case 1773646829:
                        if (str.equals(m6398("获菄⃛豼᠗龜\uf24c┡罞鬃\uf6d1↔竂额כֿ⸓癜鐵\uffd9⪙燲釪", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                            int i16 = f2413 + 95;
                            f2414 = i16 % 128;
                            int i17 = i16 % 2;
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        return m6397((Class) cz.m5927(list, 0, Class.class));
                    case 1:
                        return m6395((List<Class>) cz.m5927(list, 0, List.class));
                    case 2:
                        return m6393(((Integer) cz.m5927(list, 0, Integer.class)).intValue());
                    case 3:
                        return m6402(((Integer) cz.m5927(list, 0, Integer.class)).intValue());
                    case 4:
                        return m6401(((Boolean) cz.m5927(list, 0, Boolean.class)).booleanValue());
                    case 5:
                        return m6400(((Integer) cz.m5927(list, 0, Integer.class)).intValue());
                    case 6:
                        return m6396(((Integer) cz.m5927(list, 0, Integer.class)).intValue());
                    case 7:
                        boolean zBooleanValue = ((Boolean) cz.m5927(list, 0, Boolean.class)).booleanValue();
                        if (list.size() > 1) {
                            int i18 = f2414 + 101;
                            f2413 = i18 % 128;
                            int i19 = i18 % 2;
                            iIntValue = ((Integer) cz.m5927(list, 1, Integer.class)).intValue();
                        }
                        return m6403(zBooleanValue, iIntValue);
                    case 8:
                        return m6394((Class) cz.m5927(list, 0, Class.class));
                    case 9:
                        return m6399();
                    case 10:
                        return m6404();
                }
            }
        }
    }

    public hr() {
        mo6354();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final int m6387() {
        return this.f2408;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m6388() {
        return this.f2410;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6389() {
        return this.f2409;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m6390() {
        return this.f2412;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Class m6391() {
        return this.f2407;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m6392() {
        return this.f2411;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* JADX INFO: renamed from: ﾒ */
    public final void mo6354() {
        super.mo6354();
        this.f2407 = null;
        this.f2412 = 0;
        this.f2409 = true;
        this.f2411.clear();
        this.f2410 = null;
        this.f2408 = -1;
    }
}

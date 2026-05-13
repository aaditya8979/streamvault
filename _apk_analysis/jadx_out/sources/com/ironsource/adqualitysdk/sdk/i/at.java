package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.ironsource.adqualitysdk.sdk.i.bb.AnonymousClass4;
import com.ironsource.adqualitysdk.sdk.i.bb.AnonymousClass5;
import com.ironsource.adqualitysdk.sdk.i.jc;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class at {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static char f445 = 4824;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static char f446 = 7412;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f447 = 0;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f448 = 1;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char[] f449 = {'a', 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 187, 217, 258, 261, 259, 245, 246, 263, 264, 255, 249, 215, 197, 231, 239, 248, 256, 251, 255, 259, 267, 225, '9', 'k', 'f', 'd', 'g', 'g', 'W', '_', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'Y', 187, 142, 188, 183, 184, 178, 188, 187, 174, 191, 'i', 187, 184, 189, 172, 174, 183, 183, 184, 172, 'i', 176, 183, 178, 173, 173, 170, 'i', 187, 184, 187, '2', 'k', 'r', 'r', '9', 'r', 'p', 'p', 'r', 'k', 'B', 'I', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'i', 'A', 'C', 'j', 'k', 'f', 'd', 'b', '@', 'I', 'p', 'p', 'r', '[', '2', 'c', 'k', '\"', 'D', 'H', 'G', 'A', 'G', 'I', '8', 130, 154, 150, 141, 147, 150, 151, 150, 'o', 316, 313, 308, 313};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f450 = 61156;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f451 = 55904;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ISAdQualityInitListener f452;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private az f453;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private iz f454;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private bb f458;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f459;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f462 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<cm> f463 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<gl> f461 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, JSONObject> f460 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, String> f464 = new HashMap();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private db f457 = new db();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private du f456 = du.m6181();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Map<String, aw> f455 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.at$2, reason: invalid class name */
    public class AnonymousClass2 extends ir {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private /* synthetic */ String f510;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private /* synthetic */ List f511;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final /* synthetic */ Runnable f512;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final /* synthetic */ Context f513;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f515;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final /* synthetic */ Map f516;

        public AnonymousClass2(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f515 = str;
            this.f513 = context;
            this.f510 = str2;
            this.f511 = list;
            this.f516 = map;
            this.f512 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4352() {
            if (ar.m4559().mo4589(this.f515, at.m4646(at.this))) {
                at.m4696(at.this, this.f513, this.f510, this.f515, this.f511, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        if (at.m4653(at.this)) {
                            t.m7070(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo4352() {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    at.m4670(at.this, anonymousClass2.f513, anonymousClass2.f516, anonymousClass2.f512);
                                }
                            }, ar.m4559().mo4562());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            at.m4681(at.this, this.f515, jSONObjectJsonObjectInit);
            at.m4645(at.this).put(this.f515, jSONObjectJsonObjectInit);
            t.m7070(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    at.m4670(at.this, anonymousClass2.f513, anonymousClass2.f516, anonymousClass2.f512);
                }
            }, ar.m4559().mo4562());
        }
    }

    public at(iz izVar, af afVar, String str, bb bbVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f454 = izVar;
        az azVar = new az(t.m7066(), afVar);
        this.f453 = azVar;
        kd.m6949(azVar);
        this.f453.m4836(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.at.3

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f520 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f521 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f522 = 3;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f523 = {'t', 'p', '_', 'e', 'r', 'o', 'u', 'v', 'w'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m4711(String str2, int i10, byte b10) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2151) {
                    char[] cArr2 = f523;
                    char c10 = f522;
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
                    str3 = new String(cArr3);
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.il
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final JSONObject mo4712(String str2, JSONObject jSONObject) {
                int i10 = f520 + 23;
                f521 = i10 % 128;
                int i11 = i10 % 2;
                if (!(str2.equals(m4711("\u0001\u0002\u0000\u0005\u009b\u009b\u0003\u0005", 8 - Color.green(0), (byte) (40 - ImageFormat.getBitsPerPixel(0))).intern()))) {
                    return null;
                }
                int i12 = f521 + 121;
                f520 = i12 % 128;
                boolean z10 = i12 % 2 != 0;
                at atVar = at.this;
                if (z10) {
                    return atVar.m4701();
                }
                atVar.m4701();
                throw null;
            }
        });
        this.f459 = str;
        this.f458 = bbVar;
        this.f452 = iSAdQualityInitListener;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m4641() {
        int i10 = f448 + 69;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        if ((ar.m4559().mo4563() ? 'G' : (char) 11) != 11) {
            if ((m4643() ? '7' : 'A') != 'A') {
                int i12 = f448 + 35;
                int i13 = i12 % 128;
                f447 = i13;
                int i14 = i12 % 2;
                int i15 = i13 + 61;
                f448 = i15 % 128;
                int i16 = i15 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized void m4642() {
        if (this.f458.m4867()) {
            m4703().adQualitySdkInitSuccess();
            int i10 = f448 + 71;
            f447 = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        int i12 = f448 + 97;
        f447 = i12 % 128;
        int i13 = i12 % 2;
        m4703().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m4688("\uf8f1\uf8a0秶\uf087牗ŕᓗ뮕㎘鐜讶ꆼ㎘鐜坤皷ㄡ雫瑇欎鐠쇯뺢⟭钅♧퍮똙\udb93皟\uf241摧睱轴\uec32䊤\u1af7ྺ秶\uf087冞襮슑㸑䠁ᓝ䱣⌮ᓥ︌昄㓧\uf443Ō", 53 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m4643() {
        boolean zMo4560;
        int i10 = f447 + 57;
        f448 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            ar.m4559().mo4560();
            throw null;
        }
        zMo4560 = ar.m4559().mo4560();
        int i11 = f448 + 115;
        f447 = i11 % 128;
        if ((i11 % 2 != 0 ? '-' : '\n') == '-') {
            throw null;
        }
        return zMo4560;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m4644() {
        int i10 = f448 + 71;
        f447 = i10 % 128;
        if ((i10 % 2 != 0 ? 'Z' : ':') != ':') {
            throw null;
        }
        return this.f460;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Map m4645(at atVar) {
        int i10 = f447 + 63;
        f448 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 29 : 'H') == 29) {
            atVar.m4644();
            throw null;
        }
        Map<String, JSONObject> mapM4644 = atVar.m4644();
        int i11 = f448 + 123;
        f447 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 25 : (char) 0) != 25) {
            return mapM4644;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ String m4646(at atVar) {
        int i10 = f448 + 15;
        int i11 = i10 % 128;
        f447 = i11;
        int i12 = i10 % 2;
        String str = atVar.f459;
        int i13 = i11 + 65;
        f448 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 20 : (char) 11) == 11) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Map<String, String> m4647() {
        Map<String, String> map;
        int i10 = f448 + 105;
        f447 = i10 % 128;
        if (i10 % 2 != 0) {
            map = this.f464;
            int i11 = 36 / 0;
        } else {
            map = this.f464;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized List<gl> m4648() {
        List<gl> list;
        int i10 = f447 + 63;
        f448 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            list = this.f461;
            int i11 = 59 / 0;
        } else {
            list = this.f461;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m4649(at atVar) {
        int i10 = f447 + 99;
        f448 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        atVar.m4677();
        if (z10) {
            int i11 = 71 / 0;
        }
        int i12 = f447 + 31;
        f448 = i12 % 128;
        if ((i12 % 2 == 0 ? '!' : '#') != '#') {
            int i13 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private synchronized List<cm> m4650() {
        List<cm> list;
        int i10 = f447 + 33;
        int i11 = i10 % 128;
        f448 = i11;
        int i12 = i10 % 2;
        list = this.f463;
        int i13 = i11 + 105;
        f447 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ List m4651(at atVar) {
        int i10 = f447 + 97;
        f448 = i10 % 128;
        if ((i10 % 2 == 0 ? 'L' : '!') == '!') {
            return atVar.m4648();
        }
        atVar.m4648();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<cm> m4652() {
        int i10 = f447 + 79;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f463 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f463);
        int i12 = f447 + 103;
        f448 = i12 % 128;
        int i13 = i12 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4653(at atVar) {
        int i10 = f447 + 35;
        f448 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'R' : '2';
        boolean zM4643 = atVar.m4643();
        if (c10 == 'R') {
            int i11 = 21 / 0;
        }
        return zM4643;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private cm m4654(Context context, String str, bd bdVar) {
        int i10 = f448 + 119;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        if (str == null) {
            return null;
        }
        cm cmVar = new cm(context, new dh(str, this.f456), this.f453, this.f457, bdVar);
        int i12 = f447 + 41;
        f448 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 11 : (char) 18) == 18) {
            return cmVar;
        }
        int i13 = 40 / 0;
        return cmVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ cm m4655(at atVar, Context context, String str, bd bdVar) {
        int i10 = f448 + 95;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        cm cmVarM4654 = atVar.m4654(context, str, bdVar);
        int i12 = f448 + 69;
        f447 = i12 % 128;
        int i13 = i12 % 2;
        return cmVarM4654;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ du m4656(at atVar, du duVar) {
        int i10 = f447 + 115;
        int i11 = i10 % 128;
        f448 = i11;
        char c10 = i10 % 2 == 0 ? 'C' : 'K';
        atVar.f456 = duVar;
        if (c10 != 'K') {
            throw null;
        }
        int i12 = i11 + 23;
        f447 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 11 : 'T') != 11) {
            return duVar;
        }
        int i13 = 77 / 0;
        return duVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4657(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f449, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m4658(at atVar) {
        int i10 = f447 + 23;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        List<cm> listM4650 = atVar.m4650();
        int i12 = f447 + 29;
        f448 = i12 % 128;
        if (i12 % 2 != 0) {
            return listM4650;
        }
        int i13 = 34 / 0;
        return listM4650;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m4659(String str) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(ih.f2521, str);
        } catch (JSONException e10) {
            k.m6906(m4657(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4688("녌茽㐘횢陥ᢼ\ued1b⎧牗ŕ쥤羙侨ᖯ玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3㎤\uf5e6휸\udd82\uea01椳迧\udb11ᩳ\ue7d7知췾썹斮", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36).intern(), e10);
        }
        int i10 = f448 + 47;
        f447 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m4660(Map<String, JSONObject> map) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (true) {
            if ((it.hasNext() ? 'W' : 'b') == 'b') {
                jSONObjectJsonObjectInit.put(m4657(new int[]{136, 4, 198, 1}, (String) null, true).intern(), jSONObjectJsonObjectInit2);
                return jSONObjectJsonObjectInit;
            }
            int i10 = f448 + 45;
            f447 = i10 % 128;
            if ((i10 % 2 != 0 ? '(' : (char) 25) != '(') {
                String str = (String) it.next();
                jSONObjectJsonObjectInit2.put(str.toLowerCase(), map.get(str));
            } else {
                String str2 = (String) it.next();
                jSONObjectJsonObjectInit2.put(str2.toLowerCase(), map.get(str2));
                int i11 = 40 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4661(final Context context, final gl glVar, final String str, final ir irVar) {
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                final String lowerCase = str.toLowerCase();
                at.m4685(at.this).m4868(lowerCase);
                t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f482 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static boolean f483 = true;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f484 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static boolean f485 = true;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f486 = {127, 171, 170, 161, 159, 176, 174, 137, 157, 163, 133, 165, 168, 182, '\\', 129};

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f487 = 60;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m4709(String str2, int i10, int[] iArr, String str3) throws UnsupportedEncodingException {
                        Object bytes = str3;
                        if (str3 != null) {
                            bytes = str3.getBytes("ISO-8859-1");
                        }
                        byte[] bArr = (byte[]) bytes;
                        Object charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (m.f3010) {
                            char[] cArr2 = f486;
                            int i11 = f487;
                            if (f483) {
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
                            if (f485) {
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        String strIntern = m4709(null, TextUtils.getTrimmedLength("") + 127, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m4709(null, 127 - TextUtils.indexOf("", ""), null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u008e\u008c\u008d\u0089\u008c\u0086\u008c\u0083\u008b").intern());
                        sb2.append(lowerCase);
                        k.m6901(strIntern, sb2.toString());
                        try {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            at.m4679(at.this, context, str, lowerCase, glVar, irVar);
                            int i10 = f484 + 73;
                            f482 = i10 % 128;
                            if (!(i10 % 2 != 0)) {
                                return;
                            }
                            int i11 = 94 / 0;
                        } catch (Throwable th2) {
                            t.m7076(at.m4685(at.this).new AnonymousClass4(lowerCase, ba.c.f765));
                            at.m4666(at.this).put(str, kd.m6957(th2).toString());
                            String strIntern2 = m4709(null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m4709(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u0086\u0089\u0084\u0087\u0085\u008f\u0087\u0082\u0087\u0087\u0090").intern());
                            sb3.append(lowerCase);
                            kd.m6956(strIntern2, sb3.toString(), th2, true, true, true);
                        }
                    }
                });
            }
        });
        int i10 = f447 + 51;
        f448 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return;
        }
        int i11 = 2 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4662(Context context, ir irVar) {
        int i10 = f448 + 15;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        m4661(context, bc.m4875(), bc.m4877(), irVar);
        int i12 = f447 + 89;
        f448 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 19 : 'N') != 19) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4663(Context context, String str, String str2, List<gl> list, ir irVar) {
        int i10 = f448 + 45;
        f447 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            list.iterator();
            throw null;
        }
        Iterator<gl> it = list.iterator();
        while (true) {
            if ((it.hasNext() ? '-' : '!') != '-') {
                break;
            }
            int i11 = f447 + 101;
            f448 = i11 % 128;
            if (i11 % 2 == 0) {
                m4686(context, str, str2, it.next(), irVar);
                int i12 = 79 / 0;
            } else {
                m4686(context, str, str2, it.next(), irVar);
            }
        }
        int i13 = f447 + 71;
        f448 = i13 % 128;
        if (!(i13 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4664(String str, bd bdVar) {
        if (bdVar != null) {
            int i10 = f447 + 57;
            f448 = i10 % 128;
            int i11 = i10 % 2;
            m4644().put(str, m4659(bdVar.m4893()));
            int i12 = f447 + 125;
            f448 = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4665(cm cmVar, String str) {
        int i10 = f448 + 107;
        f447 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean zM4683 = m4683(cmVar, str);
        if (z10) {
            int i11 = 2 / 0;
        }
        return zM4683;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m4666(at atVar) {
        int i10 = f448 + 95;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> mapM4647 = atVar.m4647();
        int i12 = f447 + 33;
        f448 = i12 % 128;
        int i13 = i12 % 2;
        return mapM4647;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m4667(cm cmVar) {
        int i10 = f448 + 125;
        f447 = i10 % 128;
        ?? r02 = i10 % 2 != 0 ? 79 : 80;
        try {
            if (r02 != 80) {
                JSONObject jSONObjectM4659 = m4659(cmVar.m5679());
                jSONObjectM4659.put(ih.f2519, cmVar.m5687());
                int i11 = 15 / 0;
                r02 = jSONObjectM4659;
            } else {
                JSONObject jSONObjectM46592 = m4659(cmVar.m5679());
                jSONObjectM46592.put(ih.f2519, cmVar.m5687());
                r02 = jSONObjectM46592;
            }
        } catch (JSONException e10) {
            k.m6906(m4657(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4688("녌茽㐘횢陥ᢼ\ued1b⎧牗ŕ쥤羙侨ᖯ玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3㎤\uf5e6휸\udd82\uea01椳迧\udb11ᩳ\ue7d7知췾썹斮", AndroidCharacter.getMirror('0') - 11).intern(), e10);
        }
        int i12 = f447 + 35;
        f448 = i12 % 128;
        int i13 = i12 % 2;
        return r02;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4668(final Context context, final String str, final String str2, final gl glVar, final cm cmVar, final boolean z10, final bd bdVar, final ir irVar) {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9

            /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
            private static int f567 = 1;

            /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
            private static int f569;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char[] f570 = {'C', 59730, 53780, 48089, 42129, 36434, 30490, 24772, 18842, 13160, 7171, 1521, 61117, 55422, 49459, 43745, 'I', 59731, 53779, 48067, 42141, 36432, 30466, 24770, 18834, 13132, 7180, 1528, 61180, ' ', 59727, 53791, 48090, 42139, 36421, 30475, 24715, 18827, 13130, 7180, 1521, 61113, 55418, 49442, 43772, 37794, 32045, 23773, 46507, 36590, 59169, 63593, 53921, 11263, 15479, '(', 59739, 53791, 48067, 42135, 36441, 30475, 24783, 18881};

            /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
            private static long f568 = 5621330307211979069L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4719(int i10, char c10, int i11) {
                String str3;
                synchronized (d.f1675) {
                    char[] cArr = new char[i11];
                    d.f1674 = 0;
                    while (true) {
                        int i12 = d.f1674;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f570[i10 + i12]) ^ (((long) i12) * f568)) ^ ((long) c10));
                            d.f1674 = i12 + 1;
                        } else {
                            str3 = new String(cArr);
                        }
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                int tapTimeout;
                char mode;
                int iIndexOf;
                if (cmVar != null) {
                    int i10 = f569 + 83;
                    f567 = i10 % 128;
                    if (i10 % 2 == 0) {
                        at.m4651(at.this).contains(glVar);
                        throw null;
                    }
                    if (!at.m4651(at.this).contains(glVar)) {
                        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.3

                            /* JADX INFO: renamed from: ﻐ */
                            private /* synthetic */ cm f769;

                            /* JADX INFO: renamed from: ﻛ */
                            private /* synthetic */ String f770;

                            /* JADX INFO: renamed from: ｋ */
                            private /* synthetic */ boolean f771;

                            public AnonymousClass3(String str3, cm cmVar2, boolean z11) {
                                str = str3;
                                cmVar = cmVar2;
                                z = z11;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4352() {
                                ba baVarM4864 = bb.m4864(bb.this, str);
                                if (baVarM4864 != null) {
                                    baVarM4864.m4858(cmVar);
                                }
                            }
                        });
                        if (!cmVar.m5674()) {
                            int i11 = f569 + 111;
                            f567 = i11 % 128;
                            int i12 = i11 % 2;
                            ir irVar2 = irVar;
                            if (irVar2 != null) {
                                t.m7071(irVar2);
                            }
                        }
                        if (at.m4699(cmVar)) {
                            String strIntern = m4719((-1) - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 16 - Color.argb(0, 0, 0, 0)).intern();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m4719((KeyEvent.getMaxKeyCode() >> 16) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 13).intern());
                            sb2.append(str);
                            sb2.append(m4719(Color.alpha(0) + 29, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                            if (z10) {
                                int i13 = f569 + 75;
                                f567 = i13 % 128;
                                int i14 = i13 % 2;
                                tapTimeout = 47 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                mode = (char) (Color.rgb(0, 0, 0) + 16801013);
                                iIndexOf = 8 - View.combineMeasuredStates(0, 0);
                            } else {
                                tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 55;
                                mode = (char) View.MeasureSpec.getMode(0);
                                iIndexOf = TextUtils.indexOf("", "", 0, 0) + 9;
                            }
                            sb2.append(m4719(tapTimeout, mode, iIndexOf).intern());
                            co.m5702(strIntern, sb2.toString());
                            bdVar.m4891();
                            if (cmVar.m5674()) {
                                int i15 = f569 + 113;
                                f567 = i15 % 128;
                                if (i15 % 2 == 0) {
                                    throw null;
                                }
                                ir irVar3 = irVar;
                                if ((irVar3 != null ? (char) 15 : '>') != '>') {
                                    t.m7071(irVar3);
                                }
                            }
                            if ((!s.m7027().m7054() ? 'A' : ';') == 'A') {
                                at.m4697(at.this, cmVar, str);
                                if (!at.m4672(at.this, cmVar.m5688())) {
                                    at.m4651(at.this).add(glVar);
                                    return;
                                }
                            }
                        } else {
                            t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9.1

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f580 = 136;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f581 = 0;

                                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                private static int f582 = 1;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static String m4720(String str3, int i16, boolean z11, int i17, int i18) {
                                    String str4;
                                    Object charArray = str3;
                                    if (str3 != null) {
                                        charArray = str3.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (b.f728) {
                                        char[] cArr2 = new char[i16];
                                        b.f726 = 0;
                                        while (true) {
                                            int i19 = b.f726;
                                            if (i19 >= i16) {
                                                break;
                                            }
                                            b.f727 = cArr[i19];
                                            cArr2[b.f726] = (char) (b.f727 + i18);
                                            int i20 = b.f726;
                                            cArr2[i20] = (char) (cArr2[i20] - f580);
                                            b.f726 = i20 + 1;
                                        }
                                        if (i17 > 0) {
                                            b.f729 = i17;
                                            char[] cArr3 = new char[i16];
                                            System.arraycopy(cArr2, 0, cArr3, 0, i16);
                                            int i21 = b.f729;
                                            System.arraycopy(cArr3, 0, cArr2, i16 - i21, i21);
                                            int i22 = b.f729;
                                            System.arraycopy(cArr3, i22, cArr2, 0, i16 - i22);
                                        }
                                        if (z11) {
                                            char[] cArr4 = new char[i16];
                                            b.f726 = 0;
                                            while (true) {
                                                int i23 = b.f726;
                                                if (i23 >= i16) {
                                                    break;
                                                }
                                                cArr4[i23] = cArr2[(i16 - i23) - 1];
                                                b.f726 = i23 + 1;
                                            }
                                            cArr2 = cArr4;
                                        }
                                        str4 = new String(cArr2);
                                    }
                                    return str4;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo4352() {
                                    int i16 = f582 + 95;
                                    f581 = i16 % 128;
                                    if (!(i16 % 2 == 0)) {
                                        int i17 = 68 / 0;
                                        if (at.m4666(at.this).containsKey(cmVar.m5688())) {
                                            return;
                                        }
                                    } else if (at.m4666(at.this).containsKey(cmVar.m5688())) {
                                        return;
                                    }
                                    t.m7076(at.m4685(at.this).new AnonymousClass4(cmVar.m5688(), ba.c.f762));
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    JSONObject jSONObjectM4689 = at.m4689(at.this, cmVar);
                                    try {
                                        jSONObjectM4689.put(m4720("\u0005\ufff3\b", 3 - Color.alpha(0), false, 1 - (Process.myTid() >> 22), Process.getGidForName("") + 247).intern(), false);
                                        int i18 = f582 + 89;
                                        f581 = i18 % 128;
                                        int i19 = i18 % 2;
                                    } catch (JSONException unused) {
                                    }
                                    at.m4645(at.this).put(cmVar.m5688(), jSONObjectM4689);
                                    String strM4866 = at.m4685(at.this).m4866(cmVar.m5688());
                                    at.m4666(at.this).put(cmVar.m5688(), strM4866);
                                    ISAdQualityInitListener iSAdQualityInitListenerM4703 = at.this.m4703();
                                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(cmVar.m5684());
                                    sb3.append(m4720("\u001b\n\u0017\u0018\u000e\u0014\u0013ￅￅ\u0018\t\u0010ￅ", '=' - AndroidCharacter.getMirror('0'), false, 8 - (KeyEvent.getMaxKeyCode() >> 16), 227 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                                    sb3.append(cmVar.m5679());
                                    sb3.append(m4720("\u000e\r\u0002\uffc1\u0014\u0005\f\uffc1\u0017\u0006\u0013\u0014\n\u0010\u000f\uffc1\uffc1\u0013\u0006\u0012\u0016\n\u0013\u0006\u0014\uffc1\ufff4\u0010\u0010", (ViewConfiguration.getScrollBarSize() >> 8) + 29, false, Process.getGidForName("") + 17, 231 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                                    sb3.append(cmVar.m5682());
                                    sb3.append(m4720("\u0012\t\u001b\t\u0016ￄ\u0013\u0016ￄ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, false, 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 228).intern());
                                    iSAdQualityInitListenerM4703.adQualitySdkInitFailed(iSAdQualityInitError, sb3.toString());
                                    kd.m6956(m4720("\t\b\b\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, false, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 237 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), strM4866, null, true, true, true);
                                    int i20 = f581 + 107;
                                    f582 = i20 % 128;
                                    int i21 = i20 % 2;
                                }
                            });
                        }
                    }
                }
                int i16 = f567 + 59;
                f569 = i16 % 128;
                int i17 = i16 % 2;
            }
        });
        int i10 = f448 + 25;
        f447 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4669(final Context context, final List<gl> list, final List<String> list2, final ir irVar) {
        int i10 = f448 + 91;
        f447 = i10 % 128;
        if (i10 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            int i11 = f447 + 93;
            f448 = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        gl glVarRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (!list.isEmpty()) {
            irVar = new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.14
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    t.m7072(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.14.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            at.m4687(at.this, context, list, list2, irVar);
                        }
                    }, ar.m4559().mo4562());
                }
            };
        }
        m4661(context, glVarRemove, strRemove, irVar);
        int i13 = f447 + 51;
        f448 = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        int i14 = 77 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m4670(at atVar, Context context, Map map, Runnable runnable) {
        int i10 = f447 + 3;
        f448 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '&' : '@';
        atVar.m4692(context, (Map<String, List<gl>>) map, runnable);
        if (c10 == '&') {
            int i11 = 30 / 0;
        }
        int i12 = f448 + 69;
        f447 = i12 % 128;
        if ((i12 % 2 != 0 ? '^' : '$') != '$') {
            int i13 = 58 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4671(String str, JSONObject jSONObject) {
        t.m7076(this.f458.new AnonymousClass5(str, ba.b.f753));
        if ((jSONObject != null ? '\\' : (char) 23) == '\\') {
            int i10 = f448 + 121;
            f447 = i10 % 128;
            int i11 = i10 % 2;
            try {
                jSONObject.put(m4657(new int[]{116, 3, 0, 3}, "\u0000\u0001\u0000", false).intern(), true);
                return;
            } catch (JSONException unused) {
            }
        }
        int i12 = f448 + 123;
        f447 = i12 % 128;
        if ((i12 % 2 != 0 ? 'G' : 'b') == 'b') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4672(at atVar, String str) {
        int i10 = f448 + 37;
        f447 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean zM4700 = atVar.m4700(str);
        if (z10) {
            int i11 = 12 / 0;
        }
        int i12 = f447 + 95;
        f448 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return zM4700;
        }
        int i13 = 44 / 0;
        return zM4700;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if ((r5.get(1) != null ? ')' : '\b') != ')') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r5.get(0) != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        return r5.get(0).mo6277();
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m4673(java.util.List<com.ironsource.adqualitysdk.sdk.i.gl> r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f447
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f448 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            r3 = 0
            if (r0 == r1) goto L56
            if (r5 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L55
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f448
            int r0 = r0 + 49
            int r4 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f447 = r4
            int r0 = r0 % 2
            r4 = 69
            if (r0 == 0) goto L32
            r0 = 92
            goto L33
        L32:
            r0 = r4
        L33:
            if (r0 == r4) goto L44
            java.lang.Object r0 = r5.get(r1)
            r1 = 41
            if (r0 == 0) goto L3f
            r0 = r1
            goto L41
        L3f:
            r0 = 8
        L41:
            if (r0 == r1) goto L4a
            goto L55
        L44:
            java.lang.Object r0 = r5.get(r2)
            if (r0 == 0) goto L55
        L4a:
            java.lang.Object r5 = r5.get(r2)
            com.ironsource.adqualitysdk.sdk.i.gl r5 = (com.ironsource.adqualitysdk.sdk.i.gl) r5
            java.lang.String r5 = r5.mo6277()
            return r5
        L55:
            return r3
        L56:
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.m4673(java.util.List):java.lang.String");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m4674(at atVar) {
        int i10 = f447 + 21;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        List<cm> listM4652 = atVar.m4652();
        int i12 = f448 + 57;
        f447 = i12 % 128;
        if (i12 % 2 == 0) {
            return listM4652;
        }
        int i13 = 43 / 0;
        return listM4652;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m4675(at atVar, List list) {
        int i10 = f448;
        int i11 = i10 + 67;
        f447 = i11 % 128;
        int i12 = i11 % 2;
        atVar.f463 = list;
        int i13 = i10 + 125;
        f447 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m4676(at atVar, Map map) {
        int i10 = f447;
        int i11 = i10 + 97;
        f448 = i11 % 128;
        char c10 = i11 % 2 == 0 ? '@' : 'b';
        atVar.f455 = map;
        if (c10 != 'b') {
            int i12 = 21 / 0;
        }
        int i13 = i10 + 3;
        f448 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return map;
        }
        int i14 = 16 / 0;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4677() {
        ArrayList<cm> arrayList = new ArrayList();
        for (cm cmVar : m4652()) {
            if (!(!m4700(cmVar.m5688()))) {
                int i10 = f447 + 17;
                f448 = i10 % 128;
                char c10 = i10 % 2 == 0 ? 'J' : (char) 7;
                arrayList.add(cmVar);
                if (c10 != 7) {
                    int i11 = 39 / 0;
                } else {
                    continue;
                }
            }
        }
        for (final cm cmVar2 : arrayList) {
            String strIntern = m4657(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m4657(new int[]{126, 10, 44, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", false).intern());
            sb2.append(cmVar2.m5684());
            sb2.append(m4688("玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3", 10 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
            k.m6897(strIntern, sb2.toString());
            String strM5688 = cmVar2.m5688();
            m4671(strM5688, m4644().get(strM5688));
            t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.8
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    cmVar2.m5683();
                }
            });
            m4650().remove(cmVar2);
        }
        int i12 = f447 + 111;
        f448 = i12 % 128;
        if ((i12 % 2 == 0 ? ')' : 'A') == ')') {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4678(final Context context) {
        int i10 = f447 + 75;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        if (!m4643()) {
            t.m7072(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            at.m4693(at.this);
                        }
                    });
                }
            }, ar.m4559().mo4566());
        }
        final Map<String, List<gl>> mapM4871 = bc.m4871();
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                at.m4676(at.this, ar.m4559().mo4581());
                at.m4670(at.this, context, mapM4871, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        if (at.m4653(at.this)) {
                            at.m4693(at.this);
                        }
                    }
                });
                ar.m4559().mo4583(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f502 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static int f503 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f504 = 18;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static boolean f505 = true;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f506 = {'U', 129, 128, 'w', 'u', 134, 132, '_', 's', 'y', 'V', '{', 133, 't', '~', '2', 140, 'v'};

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static boolean f507 = true;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m4710(String str, int i12, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                            char[] cArr2 = f506;
                            int i13 = f504;
                            if (f505) {
                                int length = bArr.length;
                                m.f3012 = length;
                                char[] cArr3 = new char[length];
                                m.f3011 = 0;
                                while (m.f3011 < m.f3012) {
                                    int i14 = m.f3011;
                                    int i15 = m.f3012 - 1;
                                    int i16 = m.f3011;
                                    cArr3[i14] = (char) (cArr2[bArr[i15 - i16] + i12] - i13);
                                    m.f3011 = i16 + 1;
                                }
                                return new String(cArr3);
                            }
                            if (f507) {
                                int length2 = cArr.length;
                                m.f3012 = length2;
                                char[] cArr4 = new char[length2];
                                m.f3011 = 0;
                                while (m.f3011 < m.f3012) {
                                    int i17 = m.f3011;
                                    int i18 = m.f3012 - 1;
                                    int i19 = m.f3011;
                                    cArr4[i17] = (char) (cArr2[cArr[i18 - i19] - i12] - i13);
                                    m.f3011 = i19 + 1;
                                }
                                return new String(cArr4);
                            }
                            int length3 = iArr.length;
                            m.f3012 = length3;
                            char[] cArr5 = new char[length3];
                            m.f3011 = 0;
                            while (m.f3011 < m.f3012) {
                                int i20 = m.f3011;
                                int i21 = m.f3012 - 1;
                                int i22 = m.f3011;
                                cArr5[i20] = (char) (cArr2[iArr[i21 - i22] - i12] - i13);
                                m.f3011 = i22 + 1;
                            }
                            return new String(cArr5);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4393() {
                        int i12 = f502 + 67;
                        f503 = i12 % 128;
                        int i13 = i12 % 2;
                        at.m4676(at.this, ar.m4559().mo4581());
                        k.m6901(m4710(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), m4710(null, TextUtils.getOffsetAfter("", 0) + 127, null, "\u008d\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u0090\u0092\u0084\u0091\u008c\u008f\u0089\u008c\u0086\u008c\u0083\u008c\u0090\u008a\u0083\u008c\u008f\u008e\u0089\u008d\u008c\u008b").intern());
                        at.m4649(at.this);
                        int i14 = f503 + 51;
                        f502 = i14 % 128;
                        if ((i14 % 2 != 0 ? 'D' : 'B') == 'B') {
                        } else {
                            throw null;
                        }
                    }
                });
            }
        });
        int i12 = f447 + 71;
        f448 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : (char) 4) != 'O') {
            return;
        }
        int i13 = 95 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m4679(at atVar, Context context, String str, String str2, gl glVar, ir irVar) {
        int i10 = f447 + 83;
        f448 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        atVar.m4686(context, str, str2, glVar, irVar);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m4680(at atVar, Context context, String str, String str2, List list, ir irVar) {
        int i10 = f448 + 5;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4663(context, str, str2, list, irVar);
        int i12 = f447 + 39;
        f448 = i12 % 128;
        if ((i12 % 2 == 0 ? 'V' : '\n') != 'V') {
            return;
        }
        int i13 = 27 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m4681(at atVar, String str, JSONObject jSONObject) {
        int i10 = f447 + 65;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4671(str, jSONObject);
        int i12 = f448 + 89;
        f447 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m4682(cm cmVar) {
        int i10 = f448 + 31;
        f447 = i10 % 128;
        if ((i10 % 2 != 0 ? '\"' : '\b') == '\"') {
            cmVar.m5682();
            throw null;
        }
        String strM5682 = cmVar.m5682();
        if (strM5682 == null || kc.m6935(IronSourceAdQuality.getSDKVersion(), strM5682) >= 0) {
            int i11 = f447 + 69;
            f448 = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }
        int i13 = f448 + 19;
        f447 = i13 % 128;
        if (i13 % 2 == 0) {
            return false;
        }
        int i14 = 54 / 0;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.kc.m6935(r5, r4.m5681()) <= 0 ? '%' : '\t') != '\t') goto L19;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m4683(com.ironsource.adqualitysdk.sdk.i.cm r4, java.lang.String r5) {
        /*
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [119, 7, 0, 0} // fill-array
            java.lang.String r1 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0001"
            r2 = 1
            java.lang.String r0 = m4657(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equals(r5)
            r1 = 0
            if (r0 != 0) goto L59
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f447
            int r0 = r0 + 85
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f448 = r3
            int r0 = r0 % 2
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L58
            java.lang.String r0 = r4.m5680()
            int r0 = com.ironsource.adqualitysdk.sdk.i.kc.m6935(r5, r0)
            r3 = 77
            if (r0 < 0) goto L36
            r0 = r3
            goto L38
        L36:
            r0 = 20
        L38:
            if (r0 == r3) goto L3b
            goto L58
        L3b:
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f448
            int r0 = r0 + 71
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f447 = r3
            int r0 = r0 % 2
            java.lang.String r4 = r4.m5681()
            int r4 = com.ironsource.adqualitysdk.sdk.i.kc.m6935(r5, r4)
            r5 = 9
            if (r4 > 0) goto L54
            r4 = 37
            goto L55
        L54:
            r4 = r5
        L55:
            if (r4 == r5) goto L58
            goto L59
        L58:
            return r1
        L59:
            int r4 = com.ironsource.adqualitysdk.sdk.i.at.f447
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f448 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L67
            r4 = r2
            goto L68
        L67:
            r4 = r1
        L68:
            if (r4 == 0) goto L70
            r4 = 13
            int r4 = r4 / r1
            return r2
        L6e:
            r4 = move-exception
            throw r4
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.m4683(com.ironsource.adqualitysdk.sdk.i.cm, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long m4684(jc.e eVar) {
        if (ar.m4559().mo4586()) {
            return 2000L;
        }
        if (eVar != null) {
            if (!(this.f454.m6647(eVar))) {
                int i10 = f448 + 111;
                f447 = i10 % 128;
                int i11 = i10 % 2;
                return 2000L;
            }
        }
        int i12 = f447 + 53;
        f448 = i12 % 128;
        if (i12 % 2 != 0) {
            return 0L;
        }
        int i13 = 91 / 0;
        return 0L;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ bb m4685(at atVar) {
        int i10 = f447 + 85;
        int i11 = i10 % 128;
        f448 = i11;
        char c10 = i10 % 2 == 0 ? '!' : 'I';
        bb bbVar = atVar.f458;
        if (c10 != 'I') {
            throw null;
        }
        int i12 = i11 + 95;
        f447 = i12 % 128;
        if (i12 % 2 == 0) {
            return bbVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4686(final Context context, final String str, final String str2, final gl glVar, final ir irVar) {
        int i10 = f448 + 57;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        jc.e eVarM6298 = glVar.m6298();
        if (eVarM6298 == null) {
            t.m7071(irVar);
            return;
        }
        final bd bdVarMo6274 = glVar.mo6274();
        m4664(str2, bdVarMo6274);
        t.m7076(this.f458.new AnonymousClass5(str2, ba.b.f752));
        final String strM6648 = this.f454.m6648(eVarM6298, new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.at.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4718(String str3) {
                at.m4695(at.this, context, str, str2, glVar, at.m4655(at.this, context, str3, bdVarMo6274), false, bdVarMo6274, irVar);
            }
        });
        t.m7072(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                cm cmVarM4655 = at.m4655(at.this, context, strM6648, bdVarMo6274);
                if (cmVarM4655 != null) {
                    at.m4695(at.this, context, str, str2, glVar, cmVarM4655, true, bdVarMo6274, irVar);
                } else {
                    t.m7071(irVar);
                }
            }
        }, m4684(eVarM6298));
        int i12 = f447 + 1;
        f448 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 13 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m4687(at atVar, Context context, List list, List list2, ir irVar) {
        int i10 = f447 + 67;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4669(context, (List<gl>) list, (List<String>) list2, irVar);
        int i12 = f447 + 65;
        f448 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4688(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f446)) ^ ((c11 >>> 5) + f445)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f450) ^ ((c12 + i12) ^ ((c12 << 4) + f451))));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m4689(at atVar, cm cmVar) {
        int i10 = f448 + 53;
        f447 = i10 % 128;
        if ((i10 % 2 != 0 ? 'M' : 'F') != 'M') {
            return m4667(cmVar);
        }
        m4667(cmVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4690(Context context, ir irVar) {
        m4669(context, new ArrayList(bc.m4873()), new ArrayList(bc.m4876()), irVar);
        int i10 = f447 + 25;
        f448 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4691(final Context context, final String str, final String str2, final List<gl> list, final ir irVar) {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.4

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f525 = 1;

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static char f526 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f527 = -1106430066;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static long f528;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f529;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4713(String str3, char c10, String str4, int i10, String str5) {
                String str6;
                Object charArray = str5;
                if (str5 != null) {
                    charArray = str5.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str4;
                if (str4 != null) {
                    charArray2 = str4.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str3;
                if (str3 != null) {
                    charArray3 = str3.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (j.f2695) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f528) ^ ((long) f527)) ^ ((long) f526));
                            j.f2697 = i15 + 1;
                        } else {
                            str6 = new String(cArr6);
                        }
                    }
                }
                return str6;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                String strIntern = m4713("闪䯵틕᱿囊䣥祑ᶛ뉞䶞㼣枹\udbcf뢪й毺", (char) (59326 - View.MeasureSpec.getSize(0)), "\u0000\u0000\u0000\u0000", Process.getGidForName("") + 1, "鐒ಗ빹훧").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m4713("灂\ued11紴㽌綃ᰶ觹\uf511㸯픢响샤㾼恉ᯢ闦뻯㚁\ue095⊂㴅굳\uee55", (char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", 16302 - AndroidCharacter.getMirror('0'), "纋먿䁩병").intern());
                sb2.append(str2);
                k.m6901(strIntern, sb2.toString());
                try {
                    at.m4680(at.this, context, str, str2, list, irVar);
                    int i10 = f525 + 95;
                    f529 = i10 % 128;
                    if (!(i10 % 2 != 0)) {
                    } else {
                        throw null;
                    }
                } catch (Throwable th2) {
                    if (at.m4685(at.this) != null) {
                        t.m7076(at.m4685(at.this).new AnonymousClass4(str2, ba.c.f765));
                    }
                    at.m4666(at.this).put(str, kd.m6957(th2).toString());
                    String strIntern2 = m4713("闪䯵틕᱿囊䣥祑ᶛ뉞䶞㼣枹\udbcf뢪й毺", (char) (59326 - View.getDefaultSize(0, 0)), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), "鐒ಗ빹훧").intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m4713("⤮䶢蠹蘸넾䴁溒曜⠷䋈멺㑹㚿葢냀딨ﶫ\ue72fꞑᇌ囷샲끌뙾祾", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", Color.blue(0) + 878080180, "됓噰怴扔").intern());
                    sb3.append(str2);
                    kd.m6956(strIntern2, sb3.toString(), th2, true, true, true);
                    int i11 = f529 + 97;
                    f525 = i11 % 128;
                    if ((i11 % 2 != 0 ? '8' : (char) 2) != '8') {
                        int i12 = 5 / 0;
                    }
                }
            }
        });
        int i10 = f448 + 77;
        f447 = i10 % 128;
        if ((i10 % 2 != 0 ? '9' : (char) 23) != 23) {
            int i11 = 64 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.t.m7071(new com.ironsource.adqualitysdk.sdk.i.at.AnonymousClass1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[PHI: r1 r2 r3
      0x0045: PHI (r1v19 java.lang.String) = (r1v14 java.lang.String), (r1v26 java.lang.String) binds: [B:24:0x0066, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r2v6 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>) = 
      (r2v4 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>)
      (r2v9 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>)
     binds: [B:24:0x0066, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v2 java.lang.String) binds: [B:24:0x0066, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4692(android.content.Context r14, java.util.Map<java.lang.String, java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>> r15, final java.lang.Runnable r16) {
        /*
            r13 = this;
            r0 = r15
        L1:
            r9 = 0
            r10 = 1
            if (r0 == 0) goto L7
            r1 = r9
            goto L8
        L7:
            r1 = r10
        L8:
            if (r1 == r10) goto L97
            int r1 = r15.size()
            r2 = 28
            if (r1 <= 0) goto L14
            r1 = 7
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 == r2) goto L97
            int r1 = com.ironsource.adqualitysdk.sdk.i.at.f447
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f448 = r2
            int r1 = r1 % 2
            r2 = 84
            if (r1 != 0) goto L27
            r1 = r2
            goto L29
        L27:
            r1 = 37
        L29:
            if (r1 == r2) goto L4b
            java.util.Set r1 = r15.keySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r15.remove(r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = m4673(r2)
            if (r3 == 0) goto L49
        L45:
            r11 = r13
            r5 = r1
            r6 = r2
            goto L69
        L49:
            r11 = r13
            goto L87
        L4b:
            java.util.Set r1 = r15.keySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r15.remove(r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = m4673(r2)
            r4 = 58
            int r4 = r4 / r9
            if (r3 == 0) goto L49
            goto L45
        L69:
            com.ironsource.adqualitysdk.sdk.i.bb r1 = r11.f458
            r1.m4868(r3)
            com.ironsource.adqualitysdk.sdk.i.at$2 r12 = new com.ironsource.adqualitysdk.sdk.i.at$2
            r1 = r12
            r2 = r13
            r4 = r14
            r7 = r15
            r8 = r16
            r1.<init>(r3, r4, r5, r6, r7, r8)
            com.ironsource.adqualitysdk.sdk.i.t.m7069(r12)
            boolean r1 = r13.m4643()
            if (r1 != 0) goto L83
            goto L84
        L83:
            r9 = r10
        L84:
            if (r9 == 0) goto L87
            return
        L87:
            int r1 = com.ironsource.adqualitysdk.sdk.i.at.f448
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f447 = r2
            int r1 = r1 % 2
            goto L1
        L93:
            r0 = move-exception
            r11 = r13
            r1 = r0
            throw r1
        L97:
            r11 = r13
            com.ironsource.adqualitysdk.sdk.i.at$1 r0 = new com.ironsource.adqualitysdk.sdk.i.at$1
            r1 = r16
            r0.<init>()
            com.ironsource.adqualitysdk.sdk.i.t.m7071(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.m4692(android.content.Context, java.util.Map, java.lang.Runnable):void");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4693(at atVar) {
        int i10 = f447 + 51;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4642();
        int i12 = f447 + 35;
        f448 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4694(at atVar, Context context) {
        int i10 = f448 + 115;
        f447 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        atVar.m4678(context);
        if (z10) {
            throw null;
        }
        int i11 = f447 + 31;
        f448 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4695(at atVar, Context context, String str, String str2, gl glVar, cm cmVar, boolean z10, bd bdVar, ir irVar) {
        int i10 = f447 + 23;
        f448 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '(' : (char) 0;
        atVar.m4668(context, str, str2, glVar, cmVar, z10, bdVar, irVar);
        if (c10 == '(') {
            throw null;
        }
        int i11 = f448 + 11;
        f447 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4696(at atVar, Context context, String str, String str2, List list, ir irVar) {
        int i10 = f448 + 17;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m4691(context, str, str2, list, irVar);
        int i12 = f448 + 77;
        f447 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m4697(at atVar, cm cmVar, String str) {
        int i10 = f448 + 63;
        f447 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        atVar.m4698(cmVar, str);
        if (z10) {
            return;
        }
        int i11 = 64 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4698(final cm cmVar, final String str) {
        final String strM5688 = cmVar.m5688();
        t.m7076(this.f458.new AnonymousClass5(strM5688, ba.b.f751));
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.5

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f536 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char f538 = 6;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f539;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f542 = {'e', 'x', 'D', 'I', 'S', 'A', 'B', 'L', 'E', 'C', 'o', 'n', 'c', 't', 'r', 'M', 'a', 'g', ' ', 'i', 's', 'd', 'b', 'l', 'w', 'f', 'm', 'h', 'v', 'K', 'y', 'u', 'p', 'j', 'k', 'q'};

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static long f537 = -4808731631170578171L;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f540 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static char f541 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4714(String str2, char c10, String str3, int i10, String str4) {
                String str5;
                Object charArray = str4;
                if (str4 != null) {
                    charArray = str4.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str3;
                if (str3 != null) {
                    charArray2 = str3.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str2;
                if (str2 != null) {
                    charArray3 = str2.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (j.f2695) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f537) ^ ((long) f540)) ^ ((long) f541));
                            j.f2697 = i15 + 1;
                        } else {
                            str5 = new String(cArr6);
                        }
                    }
                }
                return str5;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4715(String str2, int i10, byte b10) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2151) {
                    char[] cArr2 = f542;
                    char c10 = f538;
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
                    str3 = new String(cArr3);
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4716(Throwable th2) {
                t.m7076(at.m4685(at.this).new AnonymousClass4(strM5688, ba.c.f759));
                String strIntern = m4715("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", TextUtils.lastIndexOf("", '0') + 17, (byte) (93 - (Process.myTid() >> 22))).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m4714("蚤豸獒ꀜ犤킲睊숀\uf883\uf044渖鹸첹쿱䷥窨嵋鞅릎\ue4a8襣স\u2d68\uefee⒃‸슫뢅繋", (char) (KeyEvent.normalizeMetaState(0) + 25084), "餅⟤\uf40f뵃", (-540511747) - Process.getGidForName(""), "ﻛ족ﳟ깡").intern());
                sb2.append(strM5688);
                kd.m6956(strIntern, sb2.toString(), th2, true, true, true);
                int i10 = f536 + 1;
                f539 = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() throws Exception {
                int i10;
                int i11 = f536 + 29;
                f539 = i11 % 128;
                int i12 = i11 % 2;
                JSONObject jSONObjectM4689 = at.m4689(at.this, cmVar);
                jSONObjectM4689.put(m4715("\u0001\u0002", (ViewConfiguration.getEdgeSlop() >> 16) + 2, (byte) (19 - TextUtils.lastIndexOf("", '0', 0))).intern(), true);
                at.m4645(at.this).put(cmVar.m5688(), jSONObjectM4689);
                String strM5679 = cmVar.m5679();
                if (m4715("\u0003\u0004\u0005\u0000\u0007\b\u000e\b", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 90)).intern().equals(strM5679)) {
                    String strIntern = m4715("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (Color.argb(0, 0, 0, 0) + 93)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cmVar.m5684());
                    sb2.append(m4715("\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010\u0013\u0014\u0015\u0013\u0016\u0014\u0016\u000e\u0017\u0012\u0003\u0012", 22 - (Process.myTid() >> 22), (byte) (79 - Gravity.getAbsoluteGravity(0, 0))).intern());
                    k.m6901(strIntern, sb2.toString());
                    t.m7076(at.m4685(at.this).new AnonymousClass5(strM5688, ba.b.f753));
                } else if (at.m4672(at.this, strM5688)) {
                    String strIntern2 = m4715("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (92 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cmVar.m5684());
                    sb3.append(m4715("\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010\u0018\u001e\u000e\u0016\u0013\u0016\u0014\u0015\u0016\u001c\u0012\u0005\u0016\u0013\u001a\r\b\u001c\u0013\f\u0018\u0003\u0013\u0015\u0002\f\u0018\u0004Î", (ViewConfiguration.getPressedStateDuration() >> 16) + 39, (byte) (91 - TextUtils.lastIndexOf("", '0'))).intern());
                    k.m6901(strIntern2, sb3.toString());
                    t.m7076(at.m4685(at.this).new AnonymousClass5(strM5688, ba.b.f753));
                    jSONObjectM4689.put(m4714("埖픴䣐", (char) (42294 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "餅⟤\uf40f뵃", (-1437013406) - (ViewConfiguration.getWindowTouchSlop() >> 8), "扛壪㚪ﮥ").intern(), true);
                } else {
                    if (at.m4665(cmVar, strM5679)) {
                        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.5.2

                            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                            private static int f547 = 1;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static short[] f548 = null;

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static int f549 = 0;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static byte[] f550 = {-86, -116, 127, -121, 114, -116, -107, 90, -126, 122, -112, 127, 118, -127, 126, -83, -67, -19, -7, 3, -17, 25, -22, -25, 25, -23, 23, 91, -75, 31, 18, -27, 29, ExifInterface.MARKER_APP1, 18, 28, 16, 18, -4, 16, 65, -68, 17, -23, 3, -20, -27, 18, -19, 30, 81, -98, 119, -121, 121, -58, -5, -8, 13, 78, -74, -5, 2, -14, 5, 9, -21, 82, -86, 7, -1, 21, -6, -13, 4, -5, 8, 71, -75, -1, 80, -88, 15, -1, 1, 77, -67, -3, 1, -15, 4, 11, -10, 87, -86, 7, -7, 4, 41, -83, -16, -80, 76, -90, 88, -76, 66, -79, -68, 66, -78, 76, 0, -25, 74, -76, 73, 100, -92, 64, -72, 82, -67, -76, 67, -68, 79, 0, -90, 97, -105, -68, 99, 109, -101, 109, -118, 66, -117, 69, -49, -71, 107, -99, 95, -53, 105, 103, -111, 103, -128, 72, -127, 79, -126, 102, 69, -43, -107, 105, -125, 125, -111, 103, -108, -103, 103, -105, 105, 37, -41, -107, 111, 109, -99, 59, -48, -109, -97, 108, -111, 126, 108, -104, 35, -62, 111, -111, 108, 97, 41, -34, 65, -91, -40, 103, -97, 117, -102, -109, 100, -101, 104, 39};

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f551 = -2077917528;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static int f552 = -363816020;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static int f553 = 102;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static String m4717(int i13, short s10, int i14, byte b10, int i15) {
                                String string;
                                synchronized (o.f3015) {
                                    StringBuilder sb4 = new StringBuilder();
                                    int i16 = f553;
                                    int i17 = i15 + i16;
                                    boolean z10 = i17 == -1;
                                    if (z10) {
                                        byte[] bArr = f550;
                                        i17 = bArr != null ? (byte) (bArr[f552 + i13] + i16) : (short) (f548[f552 + i13] + i16);
                                    }
                                    if (i17 > 0) {
                                        o.f3016 = ((i13 + i17) - 2) + f552 + (z10 ? 1 : 0);
                                        o.f3017 = b10;
                                        char c10 = (char) (i14 + f551);
                                        o.f3019 = c10;
                                        sb4.append(c10);
                                        o.f3018 = o.f3019;
                                        o.f3020 = 1;
                                        while (o.f3020 < i17) {
                                            byte[] bArr2 = f550;
                                            if (bArr2 != null) {
                                                int i18 = o.f3016;
                                                o.f3016 = i18 - 1;
                                                o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i18] + s10)) ^ o.f3017));
                                            } else {
                                                short[] sArr = f548;
                                                int i19 = o.f3016;
                                                o.f3016 = i19 - 1;
                                                o.f3019 = (char) (o.f3018 + (((short) (sArr[i19] + s10)) ^ o.f3017));
                                            }
                                            sb4.append(o.f3019);
                                            o.f3018 = o.f3019;
                                            o.f3020++;
                                        }
                                    }
                                    string = sb4.toString();
                                }
                                return string;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo4716(Throwable th2) {
                                int i13 = f549 + 61;
                                f547 = i13 % 128;
                                int i14 = i13 % 2;
                                try {
                                    ((JSONObject) at.m4645(at.this).get(cmVar.m5688())).put(m4717(ExpandableListView.getPackedPositionType(0L) + 363816071, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 2077917633, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 124), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 103).intern(), false);
                                    int i15 = f547 + 43;
                                    f549 = i15 % 128;
                                    int i16 = i15 % 2;
                                } catch (JSONException e10) {
                                    k.m6906(m4717(363816019 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) Color.argb(0, 0, 0, 0), 2077917595 - Color.red(0), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 127), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 103).intern(), m4717(347038859 - Color.rgb(0, 0, 0), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2077917597, (byte) (5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-103) - Color.argb(0, 0, 0, 0)).intern(), e10);
                                }
                                t.m7076(at.m4685(at.this).new AnonymousClass4(strM5688, ba.c.f763));
                                String strIntern3 = m4717(363816019 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2077917595, (byte) ((-127) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) - 103).intern();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(m4717(363816119 - TextUtils.getTrimmedLength(""), (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 2077917598 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (73 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getLongPressTimeout() >> 16) - 103).intern());
                                sb4.append(cmVar.m5684());
                                sb4.append(m4717(363816138 - ((Process.getThreadPriority(0) + 20) >> 6), (short) (Process.myTid() >> 22), 2061140344 - Color.rgb(0, 0, 0), (byte) (67 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (-103) - View.MeasureSpec.getMode(0)).intern());
                                kd.m6956(strIntern3, sb4.toString(), th2, true, true, true);
                                String strIntern4 = m4717(Gravity.getAbsoluteGravity(0, 0) + 363816148, (short) (ViewConfiguration.getTapTimeout() >> 16), 2077917593 - View.resolveSize(0, 0), (byte) (TextUtils.getOffsetAfter("", 0) + 102), TextUtils.indexOf("", "", 0, 0) - 103).intern();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(m4717(363816160 - View.resolveSizeAndState(0, 0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2077917593, (byte) (108 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-103) - View.getDefaultSize(0, 0)).intern());
                                sb5.append(cmVar.m5684());
                                sb5.append(m4717(Color.rgb(0, 0, 0) + 380593429, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 2077917560 - TextUtils.getOffsetBefore("", 0), (byte) (100 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0) - 102).intern());
                                k.m6890(strIntern4, sb5.toString());
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4352() {
                                cmVar.m5685();
                                t.m7076(at.m4685(at.this).new AnonymousClass5(strM5688, ba.b.f750));
                                String strIntern3 = m4717(Gravity.getAbsoluteGravity(0, 0) + 363816020, (short) KeyEvent.getDeadChar(0, 0), 2077917595 - ExpandableListView.getPackedPositionType(0L), (byte) ((-128) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 103).intern();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(cmVar.m5684());
                                sb4.append(m4717(363816035 - ImageFormat.getBitsPerPixel(0), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2077917560 - View.MeasureSpec.getSize(0), (byte) (Color.alpha(0) + 18), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 103).intern());
                                k.m6901(strIntern3, sb4.toString());
                                int i13 = f547 + 123;
                                f549 = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i14 = 59 / 0;
                                }
                            }
                        });
                        at.m4658(at.this).add(cmVar);
                        i10 = f536 + 87;
                        f539 = i10 % 128;
                    } else {
                        jSONObjectM4689.put(m4714("ﬖ\uf343︾", (char) (19417 - Process.getGidForName("")), "餅⟤\uf40f뵃", 152449899 - TextUtils.getOffsetBefore("", 0), "殷ᘳ\uda09橋").intern(), false);
                        t.m7076(at.m4685(at.this).new AnonymousClass4(strM5688, ba.c.f764));
                        String strIntern3 = m4715("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (byte) (93 - TextUtils.getOffsetAfter("", 0))).intern();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(m4714("꺍봤\ue5db\ue9f9ԃ\ue601훎閼详篂\udfb4褮ꯚ䏣忯쵶庢ゃވ", (char) (61250 - MotionEvent.axisFromString("")), "餅⟤\uf40f뵃", 23545356 - Color.rgb(0, 0, 0), "\u0cd9杆䌂㣯").intern());
                        kd.m6956(strIntern3, sb4.toString(), null, true, true, true);
                        ISAdQualityInitListener iSAdQualityInitListenerM4703 = at.this.m4703();
                        ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(cmVar.m5684());
                        sb5.append(m4715("\u0016\u0000\u0005\u001a\u0016\u0018\u0002\f\u0015\u0014\u000b\u0006:", 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26)).intern());
                        sb5.append(cmVar.m5679());
                        sb5.append(m4715("\u0013\u0014\u0015\u0013\u0006\u000b\f\u0013\u0000\u0006\f\u0013\u0013 ÑÑ\b\u0010\f\u0001\u0016\u0013\u0012\"\u0013\f\u0018\u0003\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010", 37 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 97)).intern());
                        iSAdQualityInitListenerM4703.adQualitySdkInitFailed(iSAdQualityInitError, sb5.toString());
                        i10 = f539 + 17;
                        f536 = i10 % 128;
                    }
                    int i13 = i10 % 2;
                }
                jSONObjectM4689.remove(m4715("\u0001\u0002", 2 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (TextUtils.getOffsetBefore("", 0) + 20)).intern());
                int i14 = f539 + 103;
                f536 = i14 % 128;
                int i15 = i14 % 2;
            }
        });
        int i10 = f447 + 21;
        f448 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4699(cm cmVar) {
        int i10 = f448 + 101;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM4682 = m4682(cmVar);
        int i12 = f448 + 53;
        f447 = i12 % 128;
        if ((i12 % 2 != 0 ? ':' : '&') != ':') {
            return zM4682;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m4700(String str) {
        int i10 = f448 + 83;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        if ((this.f455.containsKey(str) ? (char) 28 : '&') != '&') {
            if ((this.f455.get(str).m4734(this.f459) ? (char) 17 : '+') != '+') {
                int i12 = f447 + 95;
                f448 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
        }
        int i14 = f447 + 99;
        f448 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m4701() {
        int i10 = f448 + 109;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        try {
            JSONObject jSONObjectM4660 = m4660(m4644());
            int i12 = f447 + 53;
            f448 = i12 % 128;
            int i13 = i12 % 2;
            return jSONObjectM4660;
        } catch (JSONException e10) {
            k.m6906(m4657(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4657(new int[]{52, 31, 73, 2}, (String) null, true).intern(), e10);
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4702(String str, List<Object> list) {
        int i10 = f447 + 1;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        Iterator<cm> it = m4652().iterator();
        while (true) {
            if (!it.hasNext()) {
                return;
            }
            int i12 = f447 + 31;
            f448 = i12 % 128;
            int i13 = i12 % 2;
            it.next().m5686(str, list);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m4703() {
        int i10 = f448 + 31;
        f447 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 25 : '+') != '+') {
            throw null;
        }
        return this.f452;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m4704(final Context context, final Runnable runnable) {
        int i10 = f448 + 15;
        f447 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f462) {
            t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.11
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    runnable.run();
                }
            });
            return;
        }
        String strIntern = m4688("휩\ue20e읜耄ᚎ摛뭇ꀯ蹲⼓玆蓑", 12 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m4657(new int[]{0, 36, 149, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern());
        sb2.append(IronSourceAdQuality.getSDKVersion());
        sb2.append(m4688("钂빴鶊浗鶊浗鶊浗鶊浗鶊浗鶊浗銠㱊", 15 - KeyEvent.keyCodeFromString("")).intern());
        k.m6897(strIntern, sb2.toString());
        ir irVar = new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.7
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.7.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        runnable.run();
                    }
                });
                at.m4694(at.this, context);
            }
        };
        if (!(m4641())) {
            m4662(context, irVar);
        } else {
            int i12 = f448 + 65;
            f447 = i12 % 128;
            if ((i12 % 2 != 0 ? ' ' : 'Z') != 'Z') {
                m4690(context, irVar);
                int i13 = 52 / 0;
            } else {
                m4690(context, irVar);
            }
        }
        this.f462 = true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4705(String str) {
        m4702(str, new ArrayList());
        int i10 = f447 + 91;
        f448 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return;
        }
        int i11 = 10 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4706(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f447 + 109;
        f448 = i10 % 128;
        int i11 = i10 % 2;
        this.f453.m4839(iSAdQualityAdListener);
        int i12 = f448 + 97;
        f447 = i12 % 128;
        if ((i12 % 2 != 0 ? '!' : '9') != '9') {
            int i13 = 64 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m4707() {
        Iterator it;
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        try {
            it = new HashSet(m4647().keySet()).iterator();
        } catch (JSONException e10) {
            k.m6906(m4657(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m4657(new int[]{87, 29, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern(), e10);
        }
        while (true) {
            if (!(it.hasNext())) {
                break;
            }
            int i10 = f448 + 105;
            f447 = i10 % 128;
            int i11 = i10 % 2;
            String str = (String) it.next();
            jSONObjectJsonObjectInit2.put(str, m4647().get(str));
            int i12 = f448 + 73;
            f447 = i12 % 128;
            int i13 = i12 % 2;
            return jSONObjectJsonObjectInit;
        }
        jSONObjectJsonObjectInit.put(m4657(new int[]{83, 4, 0, 0}, "\u0001\u0001\u0000\u0001", false).intern(), jSONObjectJsonObjectInit2);
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4708() {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.12
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                Iterator it = at.m4674(at.this).iterator();
                while (it.hasNext()) {
                    ((cm) it.next()).m5683();
                }
                at.m4658(at.this).clear();
                at.m4675(at.this, (List) null);
            }
        });
        t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.1
            public AnonymousClass1() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                bb.this.f767.clear();
                bb.this.f767 = null;
            }
        });
        this.f458 = null;
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.15
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() throws Exception {
                at.m4656(at.this, (du) null);
            }
        });
        int i10 = f447 + 1;
        f448 = i10 % 128;
        int i11 = i10 % 2;
    }
}

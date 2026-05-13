package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.AnyThread;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ah extends jq {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f270 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f271 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f277;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f278;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f279;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f280;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int f281;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f276 = {159890573, -910063818, -600115476, -2099468554, 1945981542, -1312134860, 24713813, -1411269694, 554228237, -1696758035, -462198900, -119245287, -1212623189, 1696824146, 229495467, -1073258516, 1695204960, 713848315};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f273 = 145;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f272 = 42117;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f275 = 13679;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f274 = 42951;

    public interface a {
        void onEventGenerated(JSONObject jSONObject);
    }

    public ah(Context context, ao aoVar, int i10, String str, long j10) {
        super(context, aoVar, j10);
        this.f277 = i10;
        this.f279 = 0;
        this.f281 = 1;
        this.f280 = str;
        HandlerThread handlerThread = new HandlerThread(m4474(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, 23 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
        handlerThread.start();
        this.f278 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ int m4473(ah ahVar) {
        int i10 = f270;
        int i11 = i10 + 7;
        f271 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ahVar.f279;
        ahVar.f279 = i13 + 1;
        int i14 = i10 + 3;
        f271 = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4474(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f276.clone();
            e.f1935 = 0;
            while (true) {
                int i11 = e.f1935;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1937 = (c10 << 16) + c11;
                    e.f1936 = (c12 << 16) + c13;
                    e.m6211(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1937 ^ iArr2[i13];
                        e.f1937 = i14;
                        e.f1936 = e.m6210(i14) ^ e.f1936;
                        int i15 = e.f1937;
                        e.f1937 = e.f1936;
                        e.f1936 = i15;
                    }
                    int i16 = e.f1937;
                    e.f1937 = e.f1936;
                    e.f1936 = i16;
                    e.f1936 = i16 ^ iArr2[16];
                    e.f1937 ^= iArr2[17];
                    int i17 = e.f1935;
                    int i18 = e.f1937;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1936;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m6211(iArr2);
                    int i20 = e.f1935;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1935 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int m4475() {
        int i10 = f270;
        int i11 = i10 + 59;
        f271 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.f279;
        if (!(i13 == 0)) {
            return i13;
        }
        int i14 = i10 + 17;
        f271 = i14 % 128;
        if (i14 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m4476(JSONObject jSONObject) {
        int i10 = f271 + 47;
        f270 = i10 % 128;
        int i11 = i10 % 2;
        ii iiVarM6739 = jf.m6732().m6739();
        try {
            jSONObject.put(m4478("堲ວｪ\uef12詘⸇滋燆ጮᣆ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8).intern(), jz.m6879(iiVarM6739.m6566(), iiVarM6739.m6565(), iiVarM6739.m6568(), iiVarM6739.m6567()));
            int i12 = f270 + 73;
            f271 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException e10) {
            k.m6906(m4474(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, 23 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), m4478("衬ᷙ焛ᷛ\udd79灦㽭䐨龯ⅾ뺃侶ↄ돤굃崽慝孔滋燆ܤ䴄慝孔\uf515ꋚ뮱\u0ee9ꄺ⭯", 29 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m4477(ah ahVar) {
        int i10 = f270 + 83;
        int i11 = i10 % 128;
        f271 = i11;
        boolean z10 = i10 % 2 != 0;
        int i12 = ahVar.f281;
        if (!z10) {
            throw null;
        }
        int i13 = i11 + 1;
        f270 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return i12;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4478(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f273)) ^ ((c11 >>> 5) + f275)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f272) ^ ((c12 + i12) ^ ((c12 << 4) + f274))));
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
    public static /* synthetic */ int m4479(ah ahVar) {
        int i10 = f270 + 125;
        int i11 = i10 % 128;
        f271 = i11;
        int i12 = i10 % 2;
        int i13 = ahVar.f281;
        ahVar.f281 = i13 + 1;
        int i14 = i11 + 121;
        f270 = i14 % 128;
        if (i14 % 2 == 0) {
            return i13;
        }
        int i15 = 90 / 0;
        return i13;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jq
    @AnyThread
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject mo4480(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        long jM6856;
        long jM6854;
        synchronized (this) {
            jM6856 = jx.m6856();
            jM6854 = jx.m6854();
        }
        JSONObject jSONObjectMo4480 = super.mo4480(jSONObject, z10, z11, z12);
        try {
            long jOptLong = jSONObjectMo4480.optLong(ih.f2557);
            jSONObjectMo4480.remove(ih.f2557);
            if (jOptLong != 0) {
                long j10 = jM6854 - (jM6856 - jOptLong);
                jSONObjectMo4480.put(m4474(new int[]{1638472619, -1359028187}, 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), jM6856);
                jSONObjectMo4480.put(m4478("뗌⓶ॄ㇘", ExpandableListView.getPackedPositionType(0L) + 3).intern(), jM6854);
                jM6856 = jOptLong;
                jM6854 = j10;
            }
            jSONObjectMo4480.put(m4474(new int[]{-738648929, 1604136994}, View.MeasureSpec.makeMeasureSpec(0, 0) + 3).intern(), jM6856);
            jSONObjectMo4480.put(m4474(new int[]{-355879610, -1461257667}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1).intern(), jM6854);
            jSONObjectMo4480.put(m4478("뗌⓶ꪪ斶", View.combineMeasuredStates(0, 0) + 4).intern(), this.f280);
            jSONObjectMo4480.put(m4474(new int[]{730762364, -520726139}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3).intern(), this.f277);
            jSONObjectMo4480.put(m4478("쥔䆷왅䲈", (ViewConfiguration.getTouchSlop() >> 8) + 3).intern(), m4475());
            if (ar.m4559().mo4560()) {
                jSONObjectMo4480.put(m4478("ꚍ듉凿ꆯ", Color.argb(0, 0, 0, 0) + 4).intern(), true);
            }
            ap apVarMo4571 = ar.m4559().mo4571();
            if (apVarMo4571 != null) {
                String strM4552 = apVarMo4571.m4552();
                if (!TextUtils.isEmpty(strM4552)) {
                    jSONObjectMo4480.put(m4478("␄瀻ॄ㇘", 3 - TextUtils.indexOf("", "", 0, 0)).intern(), strM4552);
                }
            }
            if (z11) {
                m4476(jSONObjectMo4480);
            }
        } catch (JSONException e10) {
            k.m6906(m4474(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, TextUtils.indexOf("", "") + 23).intern(), m4478("蟇ꀸ焛ᷛ\udd79灦ᚲ쏗ꃺ霻ඣ亏뺃侶\uf515ꋚ뮱\u0ee9ꄺ⭯뙾辉\ue98f\ue587", 24 - (Process.myPid() >> 22)).intern(), e10);
        }
        return jSONObjectMo4480;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4481(final JSONArray jSONArray, final boolean z10, final a aVar) {
        this.f278.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.3

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f282 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f283 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f284 = -5029551146765390489L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4483(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2041) {
                    f.f2039 = i10;
                    char[] cArr2 = new char[cArr.length];
                    f.f2040 = 0;
                    while (true) {
                        int i11 = f.f2040;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f284);
                            f.f2040++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v13 */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v16 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6, types: [org.json.JSONObject] */
            /* JADX WARN: Type inference failed for: r0v9, types: [org.json.JSONObject] */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() throws Exception {
                final ?? r02;
                String strIntern;
                JSONArray jSONArray2;
                int i10 = f283 + 19;
                f282 = i10 % 128;
                ?? r03 = i10 % 2 == 0 ? 1 : 0;
                try {
                    if (r03 != 0) {
                        JSONObject jSONObjectMo4480 = ah.this.mo4480(null, z10, true, true);
                        strIntern = m4483("\ued02櫖\ue28c穜\uf20f䯷", 34758 >>> (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1))).intern();
                        jSONArray2 = jSONArray;
                        r03 = jSONObjectMo4480;
                    } else {
                        JSONObject jSONObjectMo44802 = ah.this.mo4480(null, z10, false, false);
                        strIntern = m4483("\ued02櫖\ue28c穜\uf20f䯷", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34758).intern();
                        jSONArray2 = jSONArray;
                        r03 = jSONObjectMo44802;
                    }
                    r03.put(strIntern, jSONArray2);
                    r02 = r03;
                } catch (JSONException e10) {
                    k.m6906(m4483("\ued26㳪什颢ꪒ\uf47cٜ倱戌跙\udfcf\ue9c3㮭䖔靊ꅏ\uf339ᴑⳣ统袯\uda97\ue497", TextUtils.indexOf("", "", 0) + 53731).intern(), m4483("\ued22ᤆԳㄱ㵙⤘啶䆐䶚禭断釟鷭觷둍ꀟ갡\ud841쑟\uf07aﱖ\ue88dᒱ³", 62482 - ExpandableListView.getPackedPositionChild(0L)).intern(), e10);
                    r02 = r03;
                }
                t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.3.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        aVar.onEventGenerated(r02);
                    }
                });
            }
        });
        int i10 = f270 + 59;
        f271 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4482(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z10, final a aVar) {
        this.f278.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4

            /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
            private static int f291 = 0;

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f292 = 1;

            /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
            private static short[] f293 = null;

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f294 = 112;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static byte[] f295 = {2, 17, -19, 1, 20, -20, 0, 14, -14, 20, -17, -4, -8, 12, -13, 9, 8, 2, -1, -3, 2, 2, -17, -2, -9, -1, 1, 11, -5, 5, 10, -17, -4, 0, 0, 0, 0, 0, 0};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f296 = 287820270;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f297 = -1011925419;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m4484(int i10, short s10, int i11, byte b10, int i12) {
                String string;
                synchronized (o.f3015) {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f294;
                    int i14 = i12 + i13;
                    boolean z11 = i14 == -1;
                    if (z11) {
                        byte[] bArr = f295;
                        i14 = bArr != null ? (byte) (bArr[f297 + i10] + i13) : (short) (f293[f297 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f3016 = ((i10 + i14) - 2) + f297 + (z11 ? 1 : 0);
                        o.f3017 = b10;
                        char c10 = (char) (i11 + f296);
                        o.f3019 = c10;
                        sb2.append(c10);
                        o.f3018 = o.f3019;
                        o.f3020 = 1;
                        while (o.f3020 < i14) {
                            byte[] bArr2 = f295;
                            if (bArr2 != null) {
                                int i15 = o.f3016;
                                o.f3016 = i15 - 1;
                                o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                            } else {
                                short[] sArr = f293;
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

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() throws Exception {
                if (str.equals(m4484(1011925419 - Drawable.resolveOpacity(0, 0), (short) (Process.myPid() >> 22), (-287820154) - TextUtils.getTrimmedLength(""), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") - 98).intern())) {
                    int i10 = f292 + 29;
                    f291 = i10 % 128;
                    int i11 = i10 % 2;
                    ah.m4473(ah.this);
                }
                int iM4477 = ah.m4477(ah.this);
                ah.m4479(ah.this);
                JSONObject jSONObjectM6870 = jz.m6870(jSONObject);
                jSONObjectM6870.put(m4484((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1011925431, (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 287820160, (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 108).intern(), str);
                jSONObjectM6870.put(m4484(1011925435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 287820169, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-111) - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), iM4477);
                String strIntern = m4484(1011925435 - TextUtils.indexOf("", "", 0), (short) (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) - 287820154, (byte) (ViewConfiguration.getTouchSlop() >> 8), (-16777319) - Color.rgb(0, 0, 0)).intern();
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 != null) {
                    int i12 = f291 + 69;
                    f292 = i12 % 128;
                    int i13 = i12 % 2;
                    strIntern = jSONObject3.optString(ih.f2566);
                    String str2 = ih.f2519;
                    jSONObjectM6870.put(str2, jSONObject2.optString(str2, null));
                }
                if ((TextUtils.isEmpty(strIntern) ? (char) 26 : (char) 28) != 26) {
                    int i14 = f291 + 23;
                    f292 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    strIntern = m4484(TextUtils.indexOf((CharSequence) "", '0') + 1011925444, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 287820160, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-108) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
                }
                jSONObjectM6870.put(ih.f2564, strIntern);
                if (!jSONObjectM6870.has(ih.f2565)) {
                    int i16 = f291 + 79;
                    f292 = i16 % 128;
                    if (i16 % 2 == 0) {
                        jSONObjectM6870.put(ih.f2565, strIntern);
                        throw null;
                    }
                    jSONObjectM6870.put(ih.f2565, strIntern);
                }
                final JSONObject jSONObjectMo4480 = ah.this.mo4480(jSONObjectM6870, z10, true, str.equals(m4484((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1011925446, (short) (Process.getGidForName("") + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 287820154, (byte) ExpandableListView.getPackedPositionType(0L), (-105) - (ViewConfiguration.getTapTimeout() >> 16)).intern()));
                t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        aVar.onEventGenerated(jSONObjectMo4480);
                    }
                });
            }
        });
        int i10 = f271 + 117;
        f270 = i10 % 128;
        if ((i10 % 2 != 0 ? '1' : ']') != ']') {
            int i11 = 10 / 0;
        }
    }
}

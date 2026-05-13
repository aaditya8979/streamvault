package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
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
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.i.jz;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ar extends AnonymousClass4 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ar f383;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ar$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private JSONObject f384;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ax f385;

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        public final synchronized JSONObject m4593() {
            return this.f384;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        public final ax m4594() {
            return this.f385;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public synchronized void mo4595(JSONObject jSONObject) {
            this.f384 = jSONObject;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m4596(ax axVar) {
            this.f385 = axVar;
        }
    }

    public static class a extends ar {

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        private static int f386 = 1;

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static char f387 = 5;

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static int f388;

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private static char[] f389 = {'e', 'n', 'v', 'c', 'g', 'l', 't', 's', 'a', 'b', 'd', 'q', 'r', 'k', '.', 'm', 'o', 'f', 'i', 'h', 'R', 'C', 'p', 'U', 'T'};

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static int[] f390 = {-81983579, -2138919679, -2091503318, 1361753917, -1791869496, 2042201685, -849660709, 193592439, 18121261, 1108331668, 557020721, -1451000058, 935243444, -1090763053, -957734026, -1238215441, 1683544758, 378638243};

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private boolean f391;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private boolean f392;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private int f393;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private boolean f394;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private List f395;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private al f396;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private ap f397;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private List<av> f398;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<av> f399;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private av f400;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private c f401;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private iw f402;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private as f403;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private aq f404;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private au f405;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private Handler f406;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private final int f407;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private final int f408;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final int f409;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private je f410;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final int f411;

        public a() {
            super((byte) 0);
            m4606("\u0001\u0002£", 3 - View.resolveSize(0, 0), (byte) (46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern();
            m4607(new int[]{1346807643, -110320428}, 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
            m4606("\u0004\u0000\u0006\u0007", 4 - View.MeasureSpec.getMode(0), (byte) (86 - Color.alpha(0))).intern();
            m4606("\u0002\b\u0006\u0007", 4 - ExpandableListView.getPackedPositionGroup(0L), (byte) (Process.getGidForName("") + 62)).intern();
            m4607(new int[]{556728592, 2019290960}, 4 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
            m4606("\t\u0007\u0007\u0005", (ViewConfiguration.getTapTimeout() >> 16) + 4, (byte) ((-16777206) - Color.rgb(0, 0, 0))).intern();
            m4607(new int[]{-1424613954, 342081122}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4).intern();
            m4606("\b\u0006\u009f", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, (byte) (TextUtils.indexOf("", "") + 59)).intern();
            m4606("\b\t\f\u0006", 4 - TextUtils.indexOf("", ""), (byte) (89 - TextUtils.indexOf("", "", 0))).intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f407 = (int) timeUnit2.toMillis(5L);
            this.f411 = (int) timeUnit.toMillis(12L);
            this.f408 = (int) timeUnit2.toMillis(3L);
            this.f409 = (int) timeUnit2.toMillis(10L);
            this.f393 = 0;
            this.f395 = null;
            this.f391 = false;
        }

        /* JADX INFO: renamed from: K, reason: contains not printable characters */
        private synchronized void m4597() {
            int i10 = f386 + 69;
            f388 = i10 % 128;
            if ((i10 % 2 != 0 ? 'b' : (char) 6) == 'b') {
                throw null;
            }
            Handler handler = this.f406;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        a.this.m4621(true);
                        if (a.m4600(a.this) != null) {
                            a.m4600(a.this).mo4393();
                        }
                        Iterator it = new ArrayList(a.m4616(a.this)).iterator();
                        while (it.hasNext()) {
                            ((av) it.next()).mo4393();
                        }
                        a.m4616(a.this).clear();
                        Iterator it2 = new ArrayList(a.m4611(a.this)).iterator();
                        while (it2.hasNext()) {
                            ((av) it2.next()).mo4393();
                        }
                    }
                });
                int i11 = f388 + 125;
                f386 = i11 % 128;
                if (i11 % 2 == 0) {
                }
            }
        }

        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        private JSONObject m4598() {
            int i10 = f386 + 125;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            String strM6713 = this.f410.m6713(m4606("\r\u0002\u0015\u0006\u0012\u0013\t\u0013\b\r\u0004\u0012Ú", 13 - Color.argb(0, 0, 0, 0), (byte) (Gravity.getAbsoluteGravity(0, 0) + 117)).intern());
            if (strM6713 != null) {
                try {
                    return IronSourceVideoBridge.jsonObjectInit(strM6713);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            int i12 = f388 + 97;
            f386 = i12 % 128;
            if ((i12 % 2 == 0 ? ' ' : 'J') != ' ') {
                return jSONObjectJsonObjectInit;
            }
            int i13 = 55 / 0;
            return jSONObjectJsonObjectInit;
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        private int m4599() {
            int i10 = f388 + 19;
            f386 = i10 % 128;
            int iOptInt = i10 % 2 != 0 ? m4593().optInt(m4607(new int[]{-1302242163, -58660411}, ImageFormat.getBitsPerPixel(0) + 5).intern(), 3) : m4593().optInt(m4607(new int[]{-1302242163, -58660411}, 5 % ImageFormat.getBitsPerPixel(1)).intern(), 2);
            int i11 = f388 + 29;
            f386 = i11 % 128;
            if (i11 % 2 != 0) {
                return iOptInt;
            }
            int i12 = 24 / 0;
            return iOptInt;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ av m4600(a aVar) {
            int i10 = f388 + 5;
            f386 = i10 % 128;
            boolean z10 = i10 % 2 != 0;
            av avVar = aVar.f400;
            if (!z10) {
                int i11 = 49 / 0;
            }
            return avVar;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ int m4601(a aVar) {
            int i10 = f386 + 121;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            int iM4599 = aVar.m4599();
            int i12 = f386 + 61;
            f388 = i12 % 128;
            int i13 = i12 % 2;
            return iM4599;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ int m4602(a aVar) {
            int i10 = f388;
            int i11 = i10 + 71;
            f386 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = aVar.f393;
            aVar.f393 = i13 + 1;
            int i14 = i10 + 21;
            f386 = i14 % 128;
            if ((i14 % 2 == 0 ? '\t' : ':') == ':') {
                return i13;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ Handler m4603(a aVar) {
            int i10 = f388 + 29;
            f386 = i10 % 128;
            char c10 = i10 % 2 == 0 ? 'G' : '4';
            Handler handler = aVar.f406;
            if (c10 != '4') {
                int i11 = 78 / 0;
            }
            return handler;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ je m4604(a aVar) {
            int i10 = f386 + 55;
            int i11 = i10 % 128;
            f388 = i11;
            boolean z10 = i10 % 2 != 0;
            je jeVar = aVar.f410;
            if (z10) {
                throw null;
            }
            int i12 = i11 + 69;
            f386 = i12 % 128;
            if (!(i12 % 2 == 0)) {
                return jeVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ c m4605(a aVar) {
            int i10 = f388 + 75;
            int i11 = i10 % 128;
            f386 = i11;
            int i12 = i10 % 2;
            c cVar = aVar.f401;
            int i13 = i11 + 3;
            f388 = i13 % 128;
            if ((i13 % 2 != 0 ? 'J' : (char) 21) != 'J') {
                return cVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m4606(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2151) {
                char[] cArr2 = f389;
                char c10 = f387;
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m4607(int[] iArr, int i10) {
            String str;
            synchronized (e.f1934) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f390.clone();
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ void m4608(JSONObject jSONObject, long j10) {
            int i10 = f386 + 27;
            f388 = i10 % 128;
            char c10 = i10 % 2 != 0 ? '\f' : 'X';
            m4612(jSONObject, j10);
            if (c10 == '\f') {
                throw null;
            }
            int i11 = f386 + 5;
            f388 = i11 % 128;
            if ((i11 % 2 != 0 ? 'A' : (char) 11) == 11) {
            } else {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ av m4609(a aVar, av avVar) {
            int i10 = f386;
            int i11 = i10 + 89;
            f388 = i11 % 128;
            int i12 = i11 % 2;
            aVar.f400 = avVar;
            int i13 = i10 + 91;
            f388 = i13 % 128;
            int i14 = i13 % 2;
            return avVar;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private aw m4610(String str) {
            int i10 = f388;
            int i11 = i10 + 99;
            int i12 = i11 % 128;
            f386 = i12;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (str == null) {
                int i13 = i12 + 5;
                f388 = i13 % 128;
                if ((i13 % 2 != 0 ? 'L' : (char) 5) != 'L') {
                    return null;
                }
                throw null;
            }
            int i14 = i10 + 89;
            f386 = i14 % 128;
            if (i14 % 2 != 0) {
                return mo4581().get(str);
            }
            int i15 = 27 / 0;
            return mo4581().get(str);
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ List m4611(a aVar) {
            int i10 = f386 + 83;
            int i11 = i10 % 128;
            f388 = i11;
            char c10 = i10 % 2 != 0 ? 'M' : 'N';
            List<av> list = aVar.f399;
            if (c10 == 'M') {
                throw null;
            }
            int i12 = i11 + 57;
            f386 = i12 % 128;
            int i13 = i12 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static void m4612(JSONObject jSONObject, long j10) {
            if ((jSONObject.has(m4607(new int[]{-712133822, -224733627}, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? '3' : (char) 2) == '3') {
                int i10 = f386 + 63;
                f388 = i10 % 128;
                try {
                    if ((i10 % 2 != 0 ? (char) 29 : 'E') != 'E') {
                        jSONObject.put(m4607(new int[]{-712133822, -224733627}, TextUtils.getCapsMode("", 0, 0) * 2).intern(), (j10 / 2) | jSONObject.optLong(m4607(new int[]{-712133822, -224733627}, 5 / Color.green(1)).intern()));
                    } else {
                        jSONObject.put(m4607(new int[]{-712133822, -224733627}, 3 - TextUtils.getCapsMode("", 0, 0)).intern(), jSONObject.optLong(m4607(new int[]{-712133822, -224733627}, Color.green(0) + 3).intern()) + (j10 / 2));
                    }
                    int i11 = f386 + 91;
                    f388 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return;
                    } else {
                        throw null;
                    }
                } catch (JSONException unused) {
                }
            }
            int i12 = f386 + 31;
            f388 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 31 / 0;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean m4613(JSONObject jSONObject) {
            int iNormalizeMetaState;
            int i10;
            int i11 = f388 + 121;
            f386 = i11 % 128;
            if (i11 % 2 != 0) {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 6;
                i10 = 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            } else {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(1) * 49;
                i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            }
            boolean zHas = jSONObject.has(m4606("\u0007\u000b\r\u0017\u0007\b", iNormalizeMetaState, (byte) i10).intern());
            int i12 = f386 + 103;
            f388 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 2 : '\\') != 2) {
                return zHas;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ void m4614(a aVar) {
            int i10 = f386 + 79;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            aVar.m4597();
            int i12 = f386 + 25;
            f388 = i12 % 128;
            if ((i12 % 2 != 0 ? '=' : (char) 18) != '=') {
                return;
            }
            int i13 = 15 / 0;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static void m4615(JSONObject jSONObject) {
            int i10 = f386 + 69;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            jz.m6871(jSONObject, jSONObject.optJSONObject(m4606("\u0007\u000b\r\u0017\u0007\b", AndroidCharacter.getMirror('0') - '*', (byte) (7 - Color.argb(0, 0, 0, 0))).intern()));
            int i12 = f388 + 85;
            f386 = i12 % 128;
            int i13 = i12 % 2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ List m4616(a aVar) {
            int i10 = f388;
            int i11 = i10 + 7;
            f386 = i11 % 128;
            int i12 = i11 % 2;
            List<av> list = aVar.f398;
            int i13 = i10 + 13;
            f386 = i13 % 128;
            int i14 = i13 % 2;
            return list;
        }

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        public final int m4617() {
            JSONObject jSONObjectM4593;
            String strM4607;
            int i10 = f386 + 7;
            f388 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 24 : 'c') != 'c') {
                jSONObjectM4593 = m4593();
                strM4607 = m4607(new int[]{-810661301, -1583971185}, 4 / ExpandableListView.getPackedPositionChild(1L));
            } else {
                jSONObjectM4593 = m4593();
                strM4607 = m4607(new int[]{-810661301, -1583971185}, ExpandableListView.getPackedPositionChild(0L) + 4);
            }
            int iOptInt = jSONObjectM4593.optInt(strM4607.intern(), this.f411);
            int i11 = f388 + 103;
            f386 = i11 % 128;
            int i12 = i11 % 2;
            return iOptInt;
        }

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        public final int m4618() {
            int i10 = f386 + 87;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            int iOptInt = m4593().optInt(m4606("\u0002\ré", View.MeasureSpec.getMode(0) + 3, (byte) (Color.red(0) + 117)).intern(), this.f407);
            int i12 = f386 + 115;
            f388 = i12 % 128;
            int i13 = i12 % 2;
            return iOptInt;
        }

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        public final synchronized iw m4619() {
            iw iwVar;
            int i10 = f388;
            int i11 = i10 + 73;
            f386 = i11 % 128;
            if ((i11 % 2 == 0 ? '8' : '<') != '<') {
                iwVar = this.f402;
                int i12 = 99 / 0;
            } else {
                iwVar = this.f402;
            }
            int i13 = i10 + 99;
            f386 = i13 % 128;
            if (i13 % 2 != 0) {
                return iwVar;
            }
            int i14 = 45 / 0;
            return iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: リ */
        public final boolean mo4560() {
            int i10 = f388 + 97;
            f386 = i10 % 128;
            int i11 = i10 % 2;
            boolean zOptBoolean = m4593().optBoolean(m4607(new int[]{-1424613954, 342081122}, 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
            int i12 = f386 + 97;
            f388 = i12 % 128;
            int i13 = i12 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヮ */
        public final List mo4561() {
            if (this.f395 == null) {
                this.f395 = jz.m6881(m4593().optJSONArray(m4606("\t\u0007\u0007\u0005", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 10)).intern()), new jz.b<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final /* synthetic */ ISAdQualityAdType mo4626(JSONArray jSONArray, int i10) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i10));
                    }
                });
                int i10 = f386 + 47;
                f388 = i10 % 128;
                int i11 = i10 % 2;
            }
            List list = this.f395;
            int i12 = f388 + 79;
            f386 = i12 % 128;
            if ((i12 % 2 != 0 ? '@' : 'O') == '@') {
                return list;
            }
            int i13 = 5 / 0;
            return list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヶ */
        public final int mo4562() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m4593().optInt(m4606("\b\u0006\u009f", 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (TextUtils.getOffsetBefore("", 0) + 59)).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 丫 */
        public final boolean mo4563() {
            int i10 = f386 + 3;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            boolean zOptBoolean = m4593().optBoolean(m4606("\b\t\f\u0006", 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (KeyEvent.keyCodeFromString("") + 89)).intern());
            int i12 = f388 + 25;
            f386 = i12 % 128;
            int i13 = i12 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 乁 */
        public final long mo4564() {
            String strM6713 = this.f410.m6713(m4606("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", View.resolveSize(0, 0) + 37, (byte) (62 - ((Process.getThreadPriority(0) + 20) >> 6))).intern());
            if ((!TextUtils.isEmpty(strM6713) ? (char) 22 : 'L') != 22) {
                return 0L;
            }
            int i10 = f388 + 105;
            f386 = i10 % 128;
            if (i10 % 2 == 0) {
                Long.parseLong(strM6713);
                throw null;
            }
            long j10 = Long.parseLong(strM6713);
            int i11 = f388 + 97;
            f386 = i11 % 128;
            int i12 = i11 % 2;
            return j10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 爫 */
        public final String mo4565() {
            int i10 = f388 + 13;
            f386 = i10 % 128;
            int i11 = i10 % 2;
            if ((m4593() != null ? '\"' : (char) 18) == 18) {
                return null;
            }
            String strOptString = m4593().optString(m4607(new int[]{1356438421, 723423256}, 4 - View.MeasureSpec.getSize(0)).intern());
            if (TextUtils.isEmpty(strOptString) ? false : true) {
                return strOptString;
            }
            int i12 = f386 + 43;
            f388 = i12 % 128;
            int i13 = i12 % 2;
            String strM4743 = m4594().m4743();
            int i14 = f388 + 25;
            f386 = i14 % 128;
            int i15 = i14 % 2;
            return strM4743;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﬤ */
        public final int mo4566() {
            int i10 = f388 + 83;
            f386 = i10 % 128;
            int i11 = i10 % 2;
            int iOptInt = m4593().optInt(m4606("\u0002\b\u0006\u0007", 4 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 61)).intern(), this.f409);
            int i12 = f386 + 51;
            f388 = i12 % 128;
            int i13 = i12 % 2;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: טּ */
        public final synchronized void mo4567() {
            this.f406.removeCallbacksAndMessages(null);
            this.f406 = null;
            t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.4
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    a.m4616(a.this).clear();
                    a.m4611(a.this).clear();
                    a.m4609(a.this, (av) null);
                }
            });
            int i10 = f388 + 65;
            f386 = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: סּ */
        public final int mo4568() {
            JSONObject jSONObjectM4593;
            int trimmedLength;
            int scrollBarSize;
            int i10 = f386 + 19;
            f388 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 31 : '<') != 31) {
                jSONObjectM4593 = m4593();
                trimmedLength = TextUtils.getTrimmedLength("") + 4;
                scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 86;
            } else {
                jSONObjectM4593 = m4593();
                trimmedLength = 3 - TextUtils.getTrimmedLength("");
                scrollBarSize = 30 % (ViewConfiguration.getScrollBarSize() * 93);
            }
            return jSONObjectM4593.optInt(m4606("\u0004\u0000\u0006\u0007", trimmedLength, (byte) scrollBarSize).intern(), this.f408);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if (m4594() != null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        
            if ((m4594() != null ? 'I' : 'E') != 'I') goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f386 + 105;
            com.ironsource.adqualitysdk.sdk.i.ar.a.f388 = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        
            r0 = m4594().m4742();
            r1 = com.ironsource.adqualitysdk.sdk.i.ar.a.f386 + 77;
            com.ironsource.adqualitysdk.sdk.i.ar.a.f388 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        
            if ((r1 % 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        
            throw null;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ףּ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final org.json.JSONObject mo4569() {
            /*
                r4 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f388
                int r0 = r0 + 101
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f386 = r1
                int r0 = r0 % 2
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L10
                r0 = r1
                goto L11
            L10:
                r0 = r2
            L11:
                r3 = 0
                if (r0 == r2) goto L20
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m4594()
                r2 = 20
                int r2 = r2 / r1
                if (r0 == 0) goto L2e
                goto L39
            L1e:
                r0 = move-exception
                throw r0
            L20:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m4594()
                r1 = 73
                if (r0 == 0) goto L2a
                r0 = r1
                goto L2c
            L2a:
                r0 = 69
            L2c:
                if (r0 == r1) goto L39
            L2e:
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f386
                int r0 = r0 + 105
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f388 = r1
                int r0 = r0 % 2
                return r3
            L39:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m4594()
                org.json.JSONObject r0 = r0.m4742()
                int r1 = com.ironsource.adqualitysdk.sdk.i.ar.a.f386
                int r1 = r1 + 77
                int r2 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f388 = r2
                int r1 = r1 % 2
                if (r1 != 0) goto L4e
                return r0
            L4e:
                throw r3     // Catch: java.lang.Throwable -> L4f
            L4f:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ar.a.mo4569():org.json.JSONObject");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭖ */
        public final au mo4570() {
            int i10 = f386 + 55;
            f388 = i10 % 128;
            if ((i10 % 2 != 0 ? 'a' : '\\') == '\\') {
                return this.f405;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭴ */
        public final ap mo4571() {
            int i10 = f388 + 99;
            int i11 = i10 % 128;
            f386 = i11;
            int i12 = i10 % 2;
            ap apVar = this.f397;
            int i13 = i11 + 11;
            f388 = i13 % 128;
            int i14 = i13 % 2;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭸ */
        public final as mo4572() {
            int i10 = f388;
            int i11 = i10 + 49;
            f386 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            as asVar = this.f403;
            int i12 = i10 + 107;
            f386 = i12 % 128;
            if ((i12 % 2 == 0 ? 'B' : (char) 16) != 'B') {
                return asVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮉ */
        public final aq mo4573() {
            int i10 = f388 + 121;
            int i11 = i10 % 128;
            f386 = i11;
            if ((i10 % 2 == 0 ? (char) 11 : '^') == 11) {
                throw null;
            }
            aq aqVar = this.f404;
            int i12 = i11 + 107;
            f388 = i12 % 128;
            int i13 = i12 % 2;
            return aqVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮌ */
        public final String mo4574() {
            JSONObject jSONObjectM4593;
            int tapTimeout;
            int mode;
            int i10 = f386 + 13;
            f388 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                jSONObjectM4593 = m4593();
                tapTimeout = 3 - (ViewConfiguration.getTapTimeout() >> 16);
                mode = View.MeasureSpec.getMode(0) + 45;
            } else {
                jSONObjectM4593 = m4593();
                tapTimeout = (ViewConfiguration.getTapTimeout() << 125) * 3;
                mode = 70 - View.MeasureSpec.getMode(0);
            }
            String strOptString = jSONObjectM4593.optString(m4606("\u0001\u0002£", tapTimeout, (byte) mode).intern());
            int i11 = f388 + 83;
            f386 = i11 % 128;
            if ((i11 % 2 == 0 ? '4' : (char) 5) == 5) {
                return strOptString;
            }
            int i12 = 17 / 0;
            return strOptString;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮐ */
        public final double mo4575() {
            JSONObject jSONObjectM4593;
            String strM4607;
            int i10 = f388 + 113;
            f386 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                jSONObjectM4593 = m4593();
                strM4607 = m4607(new int[]{556728592, 2019290960}, TextUtils.getCapsMode("", 0, 0) + 4);
            } else {
                jSONObjectM4593 = m4593();
                strM4607 = m4607(new int[]{556728592, 2019290960}, 5 >>> TextUtils.getCapsMode("", 0, 0));
            }
            return jSONObjectM4593.optDouble(strM4607.intern(), 1.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱟ */
        public final boolean mo4576() {
            int i10 = f386 + 33;
            int i11 = i10 % 128;
            f388 = i11;
            int i12 = i10 % 2;
            boolean z10 = this.f392;
            int i13 = i11 + 19;
            f386 = i13 % 128;
            if (i13 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱡ */
        public final double mo4577() {
            int i10 = f386 + 89;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            double dOptDouble = m4593().optDouble(m4606("\u0005\u0001ì", 3 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (124 - View.resolveSizeAndState(0, 0, 0))).intern(), 5.0d);
            int i12 = f388 + 73;
            f386 = i12 % 128;
            if (i12 % 2 != 0) {
                return dOptDouble;
            }
            int i13 = 36 / 0;
            return dOptDouble;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﺙ */
        public final int mo4578() {
            int iM4744 = 3000;
            ax axVarM4594 = m4594();
            if (axVarM4594 != null) {
                int i10 = f388 + 23;
                f386 = i10 % 128;
                if ((i10 % 2 == 0 ? '1' : (char) 0) != '1') {
                    iM4744 = axVarM4594.m4744();
                } else {
                    iM4744 = axVarM4594.m4744();
                    int i11 = 30 / 0;
                }
            }
            int i12 = f388 + 17;
            f386 = i12 % 128;
            if ((i12 % 2 != 0 ? '0' : (char) 17) == '0') {
                return iM4744;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻏ */
        public final synchronized boolean mo4579() {
            int i10 = f386 + 101;
            int i11 = i10 % 128;
            f388 = i11;
            int i12 = i10 % 2;
            boolean z10 = this.f394;
            int i13 = i11 + 105;
            f386 = i13 % 128;
            if ((i13 % 2 == 0 ? 'C' : ']') != 'C') {
                return z10;
            }
            int i14 = 70 / 0;
            return z10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo4580() {
            JSONObject jSONObjectM4593;
            String strM4607;
            int i10 = f386 + 33;
            f388 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM4593 = m4593();
                strM4607 = m4607(new int[]{-1481378087, -1826599106}, 2 / Gravity.getAbsoluteGravity(0, 0));
            } else {
                jSONObjectM4593 = m4593();
                strM4607 = m4607(new int[]{-1481378087, -1826599106}, 3 - Gravity.getAbsoluteGravity(0, 0));
            }
            boolean zOptBoolean = jSONObjectM4593.optBoolean(strM4607.intern(), false);
            int i11 = f388 + 7;
            f386 = i11 % 128;
            int i12 = i11 % 2;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final Map<String, aw> mo4581() {
            Map<String, aw> map = new HashMap<>();
            try {
                String strOptString = m4593().optString(m4606("\r\u0000î", 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (KeyEvent.keyCodeFromString("") + 123)).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = jz.m6873(IronSourceVideoBridge.jsonObjectInit(strOptString), new jz.c<aw>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ aw mo4625(JSONObject jSONObject, String str) {
                            return new aw(jSONObject.optJSONObject(str));
                        }
                    });
                }
                int i10 = f386 + 9;
                f388 = i10 % 128;
                int i11 = i10 % 2;
            } catch (JSONException e10) {
                kd.m6948(m4606("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", AndroidCharacter.getMirror('0') - '$', (byte) (43 - MotionEvent.axisFromString(""))).intern(), m4607(new int[]{1461733317, 1044056902, 428215858, -1961072058, -65074011, -1059125625, 1581561942, -1481391031, -157161790, -1026405494, -2084764877, 218133828, -2117089186, 682257840, 1457645334, 2131892427}, (ViewConfiguration.getTouchSlop() >> 8) + 31).intern(), e10, false);
            }
            return map;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo4582(final Context context, final ao aoVar, boolean z10) {
            int i10 = f388 + 113;
            f386 = i10 % 128;
            int i11 = i10 % 2;
            if (z10) {
                t.m7070(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        if (!a.this.m4619().m6618().m6606()) {
                            a.m4605(a.this).mo4628();
                        } else {
                            if (a.this.mo4579()) {
                                return;
                            }
                            a.m4605(a.this).mo4627();
                        }
                    }
                }, ar.m4559().mo4568());
            }
            m4621(false);
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            try {
                jSONObjectJsonObjectInit = new jq(context, aoVar, mo4564()).mo4480(IronSourceVideoBridge.jsonObjectInit(), m4619().m6618().m6606(), true, false);
                int i12 = f386 + 49;
                f388 = i12 % 128;
                int i13 = i12 % 2;
            } catch (JSONException e10) {
                k.m6906(m4606("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", View.MeasureSpec.getMode(0) + 12, (byte) (44 - TextUtils.getOffsetAfter("", 0))).intern(), m4607(new int[]{1461733317, 1044056902, -518746095, 635703919, 1515719867, -1711267859, -1048964546, 160505427, -1977465801, 738556905, 1081323132, -1630142639, -138943661, 230175536}, Color.green(0) + 25).intern(), e10);
            }
            m4619().m6616(this.f396.m4512(m4606("\u0010\u0003\u0010\b", 4 - View.combineMeasuredStates(0, 0), (byte) (TextUtils.indexOf("", "") + 2)).intern()), jSONObjectJsonObjectInit, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3

                /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                private static int f415 = 1;

                /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
                private static short[] f416 = null;

                /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                private static int f417 = 0;

                /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                private static byte[] f418 = {86, 123, -122, 125, 122, -119, -58, 57, 122, 106, -120, -127, -121, 123, 118, -41, 34, -120, -123, 114, -118, 118, -123, -117, -121, -123, 107, -89, 100, -102, -88, 80, 87, -85, 96, -110, -85, 86, -83, -86, 89, -92, 10, 43, 5, -64, 34, -55, -64, 63, -98, 126, 51, 48, -63, -117, 116, 51, -50, 53, 50, -63, -114, 116, 52, -56, 56, -51, -62, 51, -118, 99, -50, 48, -51, -32, 0, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f419 = 117819832;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f420 = 17;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f421 = 25698;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f422 = -847945897;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static char f423 = 8251;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static char f424 = 37973;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char f425 = 31241;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m4622(String str, int i14) {
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
                            int i15 = n.f3013;
                            if (i15 < cArr.length) {
                                cArr3[0] = cArr[i15];
                                cArr3[1] = cArr[i15 + 1];
                                int i16 = 58224;
                                for (int i17 = 0; i17 < 16; i17++) {
                                    char c10 = cArr3[1];
                                    char c11 = cArr3[0];
                                    char c12 = (char) (c10 - (((c11 + i16) ^ ((c11 << 4) + f421)) ^ ((c11 >>> 5) + f423)));
                                    cArr3[1] = c12;
                                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + f425) ^ ((c12 + i16) ^ ((c12 << 4) + f424))));
                                    i16 -= 40503;
                                }
                                int i18 = n.f3013;
                                cArr2[i18] = cArr3[0];
                                cArr2[i18 + 1] = cArr3[1];
                                n.f3013 = i18 + 2;
                            } else {
                                str2 = new String(cArr2, 0, i14);
                            }
                        }
                    }
                    return str2;
                }

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private void m4623(int i14) {
                    synchronized (a.this) {
                        if (a.m4603(a.this) != null) {
                            t.m7072(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo4352() {
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    a.this.mo4582(context, aoVar, false);
                                }
                            }, i14);
                        }
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m4624(int i14, short s10, int i15, byte b10, int i16) {
                    String string;
                    synchronized (o.f3015) {
                        StringBuilder sb2 = new StringBuilder();
                        int i17 = f420;
                        int i18 = i16 + i17;
                        boolean z11 = i18 == -1;
                        if (z11) {
                            byte[] bArr = f418;
                            i18 = bArr != null ? (byte) (bArr[f419 + i14] + i17) : (short) (f416[f419 + i14] + i17);
                        }
                        if (i18 > 0) {
                            o.f3016 = ((i14 + i18) - 2) + f419 + (z11 ? 1 : 0);
                            o.f3017 = b10;
                            char c10 = (char) (i15 + f422);
                            o.f3019 = c10;
                            sb2.append(c10);
                            o.f3018 = o.f3019;
                            o.f3020 = 1;
                            while (o.f3020 < i18) {
                                byte[] bArr2 = f418;
                                if (bArr2 != null) {
                                    int i19 = o.f3016;
                                    o.f3016 = i19 - 1;
                                    o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i19] + s10)) ^ o.f3017));
                                } else {
                                    short[] sArr = f416;
                                    int i20 = o.f3016;
                                    o.f3016 = i20 - 1;
                                    o.f3019 = (char) (o.f3018 + (((short) (sArr[i20] + s10)) ^ o.f3017));
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

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4463(iq iqVar) {
                    int iM6593;
                    String strM6594;
                    float f10 = 0.0f;
                    try {
                        iM6593 = iqVar.m6590().m6593();
                        strM6594 = iqVar.m6590().m6594();
                    } catch (Exception e11) {
                        e = e11;
                    }
                    if (iM6593 >= 200) {
                        int i14 = f415 + 103;
                        f417 = i14 % 128;
                        int i15 = i14 % 2;
                        if (iM6593 <= 299) {
                            JSONObject jSONObjectM6589 = iqVar.m6589();
                            try {
                                if (!(!jSONObjectM6589.optBoolean(m4622("¦ﺧ䧢谖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3).intern()))) {
                                    int i16 = f415 + 61;
                                    f417 = i16 % 128;
                                    if ((i16 % 2 != 0 ? (char) 25 : 'G') != 'G') {
                                        s.m7027().m7057();
                                        throw null;
                                    }
                                    s.m7027().m7057();
                                }
                                k.m6887(m4622("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m4624((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 117819833, (short) (ViewConfiguration.getEdgeSlop() >> 16), 847945980 - (Process.myPid() >> 22), (byte) ((-123) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - KeyEvent.normalizeMetaState(0)).intern(), jSONObjectM6589);
                                JSONObject jSONObjectM6870 = jz.m6870(jSONObjectM6589);
                                a.this.m4620(jSONObjectM6870.optLong(m4622("鱨₰\udacb㍧", Color.rgb(0, 0, 0) + 16777220).intern(), 0L));
                                jSONObjectM6870.remove(m4624(((Process.getThreadPriority(0) + 20) >> 6) - 117819804, (short) View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 847946012, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 101), (-15) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                                a.m4604(a.this).m6711(m4624((-117819802) - ExpandableListView.getPackedPositionType(0L), (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 847946010 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (85 - Color.blue(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 4).intern(), jSONObjectM6870.toString(), null);
                                jSONObjectM6589.put(m4624((-117819790) - (Process.myTid() >> 22), (short) Color.argb(0, 0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 847946013, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 12), (-15) - (Process.myTid() >> 22)).intern(), jx.m6856());
                                jSONObjectM6589.put(m4622("鰏㋷", 2 - TextUtils.indexOf("", "", 0, 0)).intern(), jx.m6854());
                                a.m4608(jSONObjectM6589, iqVar.m6591());
                                a.this.mo4595(jSONObjectM6589);
                            } catch (Exception e12) {
                                e = e12;
                                f10 = 0.0f;
                                kd.m6955(m4622("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", (PointF.length(f10, f10) > f10 ? 1 : (PointF.length(f10, f10) == f10 ? 0 : -1)) + 12).intern(), m4622("ᶒ绽῞\ud964渀蠯䬺灁鑋괷蟾\uf6bd䦛狓嗇딳㇎躦ﾉ햄蝙헊뽶줫ӵ\udab6䦛狓涬\ude16뽶줫", View.resolveSize(0, 0) + 32).intern(), (Throwable) e, false, true);
                            }
                            a.m4614(a.this);
                            m4623(a.this.m4617());
                            return;
                        }
                    }
                    mo4464(iqVar, strM6594);
                    int i17 = f417 + 111;
                    f415 = i17 % 128;
                    if (i17 % 2 != 0) {
                    } else {
                        throw null;
                    }
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4464(iq iqVar, String str) {
                    int iM6593;
                    if (iqVar != null) {
                        int i14 = f417 + 21;
                        f415 = i14 % 128;
                        int i15 = i14 % 2;
                        iM6593 = iqVar.m6590().m6593();
                    } else {
                        iM6593 = -1;
                        int i16 = f415 + 117;
                        f417 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m4624((-117819790) - TextUtils.lastIndexOf("", '0', 0, 0), (short) ((Process.getThreadPriority(0) + 20) >> 6), 847945966 - TextUtils.getOffsetAfter("", 0), (byte) ((-51) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf("", "") + 17).intern());
                    sb2.append(iM6593);
                    k.m6890(m4622("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - ExpandableListView.getPackedPositionGroup(0L)).intern(), sb2.toString());
                    if (!(iM6593 != 403)) {
                        return;
                    }
                    int i18 = f417 + 99;
                    f415 = i18 % 128;
                    int i19 = i18 % 2;
                    if ((a.m4602(a.this) < a.m4601(a.this) ? 'L' : '^') != 'L') {
                        return;
                    }
                    m4623(a.this.m4618());
                }
            });
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo4583(final av avVar) {
            int i10 = f388 + 17;
            f386 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                throw null;
            }
            Handler handler = this.f406;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        a.m4611(a.this).add(avVar);
                        if (a.this.mo4579()) {
                            avVar.mo4393();
                        }
                    }
                });
            }
            int i11 = f388 + 1;
            f386 = i11 % 128;
            int i12 = i11 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo4584(iz izVar) {
            int i10 = f388 + 39;
            f386 = i10 % 128;
            int i11 = i10 % 2;
            m4594().m4746(izVar);
            int i12 = f386 + 113;
            f388 = i12 % 128;
            if (!(i12 % 2 != 0)) {
            } else {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass4
        /* JADX INFO: renamed from: ﻛ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized void mo4595(org.json.JSONObject r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                boolean r0 = m4613(r5)     // Catch: java.lang.Throwable -> L51
                r1 = 1
                if (r0 == 0) goto La
                r0 = 0
                goto Lb
            La:
                r0 = r1
            Lb:
                r2 = 0
                if (r0 == r1) goto L29
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f388     // Catch: java.lang.Throwable -> L51
                int r0 = r0 + 65
                int r3 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f386 = r3     // Catch: java.lang.Throwable -> L51
                int r0 = r0 % 2
                r3 = 46
                if (r0 != 0) goto L1d
                r1 = r3
            L1d:
                if (r1 == r3) goto L23
                m4615(r5)     // Catch: java.lang.Throwable -> L51
                goto L29
            L23:
                m4615(r5)     // Catch: java.lang.Throwable -> L51
                throw r2     // Catch: java.lang.Throwable -> L27
            L27:
                r5 = move-exception
                throw r5     // Catch: java.lang.Throwable -> L51
            L29:
                super.mo4595(r5)     // Catch: java.lang.Throwable -> L51
                com.ironsource.adqualitysdk.sdk.i.au r0 = r4.f405     // Catch: java.lang.Throwable -> L51
                r0.mo4595(r5)     // Catch: java.lang.Throwable -> L51
                com.ironsource.adqualitysdk.sdk.i.as r0 = r4.f403     // Catch: java.lang.Throwable -> L51
                r0.mo4595(r5)     // Catch: java.lang.Throwable -> L51
                com.ironsource.adqualitysdk.sdk.i.aq r0 = r4.f404     // Catch: java.lang.Throwable -> L51
                r0.mo4595(r5)     // Catch: java.lang.Throwable -> L51
                com.ironsource.adqualitysdk.sdk.i.ap r0 = r4.f397     // Catch: java.lang.Throwable -> L51
                r0.mo4595(r5)     // Catch: java.lang.Throwable -> L51
                int r5 = com.ironsource.adqualitysdk.sdk.i.ar.a.f388     // Catch: java.lang.Throwable -> L51
                int r5 = r5 + 27
                int r0 = r5 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f386 = r0     // Catch: java.lang.Throwable -> L51
                int r5 = r5 % 2
                if (r5 == 0) goto L4e
                monitor-exit(r4)
                return
            L4e:
                throw r2     // Catch: java.lang.Throwable -> L4f
            L4f:
                r5 = move-exception
                throw r5     // Catch: java.lang.Throwable -> L51
            L51:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ar.a.mo4595(org.json.JSONObject):void");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final void mo4585(Context context, iw iwVar, al alVar, c cVar, boolean z10) {
            this.f410 = new je(context, m4606("\u0007\u000b\r\b\u0004\u0005\r\b\u000e\n\f\u0003\n\u000b\u000e\u0013\n\u0002\u0010\u0011\u0005\u0001\u0001\u0012\u0002\u0010\u0013\u0003", 27 - ExpandableListView.getPackedPositionChild(0L), (byte) (View.MeasureSpec.getMode(0) + 72)).intern(), m4607(new int[]{-428506525, -193480751, 2108206326, -1894586225, 1815068023, 1149962225, 515620675, -1355112994, 831061069, -123686041}, 20 - KeyEvent.normalizeMetaState(0)).intern());
            this.f402 = iwVar;
            this.f394 = false;
            this.f392 = z10;
            this.f396 = alVar;
            this.f406 = new Handler(Looper.getMainLooper());
            ax axVar = new ax();
            this.f405 = new au(axVar);
            this.f403 = new as(axVar);
            this.f404 = new aq(axVar);
            this.f397 = new ap();
            mo4595(m4598());
            m4596(axVar);
            this.f401 = cVar;
            this.f398 = new ArrayList();
            this.f399 = new ArrayList();
            int i10 = f386 + 43;
            f388 = i10 % 128;
            if ((i10 % 2 != 0 ? '!' : 'I') != '!') {
            } else {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo4586() {
            int i10 = f386 + 25;
            f388 = i10 % 128;
            return !(i10 % 2 == 0) ? m4593().optBoolean(m4607(new int[]{626012635, -1984863808}, 2 % (KeyEvent.getMaxKeyCode() >>> 25)).intern(), false) : m4593().optBoolean(m4607(new int[]{626012635, -1984863808}, (KeyEvent.getMaxKeyCode() >> 16) + 4).intern(), true);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final String mo4587(String str) {
            aw awVarM4610 = m4610(str);
            if ((awVarM4610 != null ? (char) 20 : '6') != 20) {
                return null;
            }
            int i10 = f386 + 33;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            String strM4733 = awVarM4610.m4733();
            int i12 = f388 + 53;
            f386 = i12 % 128;
            if (i12 % 2 != 0) {
                return strM4733;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final void mo4588(final av avVar) {
            int i10 = f388 + 91;
            f386 = i10 % 128;
            int i11 = i10 % 2;
            Handler handler = this.f406;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        if (a.this.mo4579()) {
                            avVar.mo4393();
                        } else {
                            a.m4616(a.this).add(avVar);
                        }
                    }
                });
                int i12 = f388 + 29;
                f386 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = f386 + 91;
            f388 = i14 % 128;
            if ((i14 % 2 != 0 ? '4' : (char) 1) == 1) {
            } else {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo4589(String str, String str2) {
            int i10 = f386 + 113;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            aw awVarM4610 = m4610(str);
            if ((awVarM4610 != null ? '%' : '7') != '7') {
                if (!(!awVarM4610.m4734(str2))) {
                    return false;
                }
            }
            int i12 = f388 + 119;
            f386 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m4620(long j10) {
            int i10 = f388 + 65;
            f386 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 6 : (char) 31) != 31) {
                throw null;
            }
            if (!this.f391) {
                this.f410.m6717(m4606("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", 37 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (62 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), String.valueOf(j10));
                this.f391 = true;
            }
            int i11 = f386 + 99;
            f388 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4590(final av avVar) {
            int i10 = f386 + 49;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            Handler handler = this.f406;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        a.m4609(a.this, avVar);
                        if (a.this.mo4579()) {
                            avVar.mo4393();
                        }
                    }
                });
                int i12 = f386 + 75;
                f388 = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4591(JSONObject jSONObject) {
            int i10 = f386 + 105;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            mo4595(jSONObject);
            m4597();
            int i12 = f388 + 95;
            f386 = i12 % 128;
            int i13 = i12 % 2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final synchronized void m4621(boolean z10) {
            int i10 = f388 + 11;
            int i11 = i10 % 128;
            f386 = i11;
            if ((i10 % 2 == 0 ? 'P' : (char) 25) == 'P') {
                this.f394 = z10;
                throw null;
            }
            this.f394 = z10;
            int i12 = i11 + 79;
            f388 = i12 % 128;
            if ((i12 % 2 != 0 ? 'G' : ';') != ';') {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo4592() {
            int i10 = f386 + 55;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            boolean zOptBoolean = m4593().optBoolean(m4607(new int[]{-1202225691, -1025302518}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3).intern(), true);
            int i12 = f388 + 25;
            f386 = i12 % 128;
            int i13 = i12 % 2;
            return zOptBoolean;
        }
    }

    public interface c {
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo4627();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo4628();
    }

    private ar() {
    }

    public /* synthetic */ ar(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized ar m4559() {
        if (f383 == null) {
            f383 = new a();
        }
        return f383;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public abstract boolean mo4560();

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public abstract List mo4561();

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public abstract int mo4562();

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public abstract boolean mo4563();

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public abstract long mo4564();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public abstract String mo4565();

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public abstract int mo4566();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public abstract void mo4567();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public abstract int mo4568();

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public abstract JSONObject mo4569();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public abstract au mo4570();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public abstract ap mo4571();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public abstract as mo4572();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public abstract aq mo4573();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public abstract String mo4574();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public abstract double mo4575();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public abstract boolean mo4576();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public abstract double mo4577();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public abstract int mo4578();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public abstract boolean mo4579();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo4580();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract Map<String, aw> mo4581();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo4582(Context context, ao aoVar, boolean z10);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo4583(av avVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo4584(iz izVar);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo4585(Context context, iw iwVar, al alVar, c cVar, boolean z10);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo4586();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract String mo4587(String str);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo4588(av avVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo4589(String str, String str2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo4590(av avVar);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo4591(JSONObject jSONObject);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo4592();
}

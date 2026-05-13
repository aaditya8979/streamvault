package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bb;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends w<View, Activity> {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f3233 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3234 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f3235 = 186;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Class f3236;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jl f3241;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private View.OnLayoutChangeListener f3242;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private it f3243;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final Map<WebView, aa> f3244 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final Map<View, z> f3240 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final Map<View, View.OnLayoutChangeListener> f3238 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private c f3239 = new c();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final List<View> f3237 = new ArrayList();

    public class c {

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static int f3259 = 1;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private static char f3261 = 6;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private static int f3263;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private boolean f3266;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3270;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3271;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3272;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3273;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3274;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3275;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f3276;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f3277;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f3278;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3279;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private static char[] f3264 = {'a', 'd', 'V', 'i', 'e', 'w', 'C', 'l', 's', 'N', 'm', 'P', 'c', 'k', 'g', 'j', 'T', 'o', 'I', 'n', 't', 'u', 'W', 'b', 'h', 'r', 'f', 'x', 'S', 'A', 'E', 'v', 'J', 'p', 'K', 'q'};

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private static char[] f3260 = {'u', 35898, 6391, 42124, 12609, 48399, 18912, 54678, 25133, 61158, 31385, 1871, 37637, 8144, 43920, 14387, 'i', 35898, 6364, 42170, 12624, 48388, 18880, 54682, 25097, 61173, 'u', 35898, 6391, 42142, 12636, 48409, 18884, 54686, 25090, 61154, 'p', 35899, 6397, 42168, 12609, 48414, 18885, 54697, 25121, 61172, 31405, 1872, 37667, 8155, 43955, 14374, 50425, 20663, 56694, 26883, 62918, 33176, 3623, 39659, 'v', 35872, 6391, 42156, 12653, 48393, 18885, 'a', 35882, 6374, 42162, 12626, 48388, 18882, 54678, 25133, 61154, 31374, 1868, 37669, 8146, 43920, 14376, 50402, 20668, 'v', 35872, 6391, 42156, 12631, 48441, 18905, 54710, 25135, 61183, 31413, 1873, 37641};

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private static long f3262 = 7741231407589067849L;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private List<Integer> f3265 = new ArrayList();

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<String> f3267 = new ArrayList();

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private List<String> f3269 = new ArrayList();

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private List<String> f3268 = new ArrayList();

        public c() {
        }

        public c(JSONObject jSONObject) {
            m7203(jSONObject.optString(m7209("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0002\u0006\t\n\u0004\u0006u", KeyEvent.normalizeMetaState(0) + 15, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 16)).intern()));
            m7207(jSONObject.optString(m7209("\u0001\u0002\u0003\u0004\u0005\u0000\u0006\u0005\r\u000e\u0002\f\u008b", 12 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (39 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()));
            m7214(jSONObject.optString(m7209("\u000e\t\u0011\f\u0013\u0014\u0010\u0003\u000e\u0012", 10 - Drawable.resolveOpacity(0, 0), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27)).intern()));
            m7216(jSONObject.optBoolean(m7221(ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((Process.getThreadPriority(0) + 20) >> 6), 16 - (Process.myTid() >> 22)).intern()));
            jSONObject.optBoolean(m7209("\u0014\t\n\u001c\u0005\u0016\f\u001e\u001d\r\u0010\n\u0007\b\u0004\u0005\u0014\u0015", KeyEvent.normalizeMetaState(0) + 18, (byte) (51 - TextUtils.indexOf("", ""))).intern());
            m7218(jSONObject.optString(m7209("\u0013\u001b\b\u0006\u001c\u0001\u001b\u0002É", MotionEvent.axisFromString("") + 10, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 82)).intern()));
            m7212(jSONObject.optBoolean(m7221(Color.argb(0, 0, 0, 0) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 10).intern()));
            m7220(jSONObject.optBoolean(m7209("\u001d\u000e\u0018\r\n\"\u0001\u0016\u0005\u0019§§\u001f \u0001\u0016\u001a\u000e", 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59)).intern()));
            m7208(jSONObject.optBoolean(m7209("\u001c\u0001\u000f\u0012\u001a\u0007\u0001!Û", 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (TextUtils.lastIndexOf("", '0') + 119)).intern()));
            m7205(jSONObject.optBoolean(m7209("\u0014\t\u0002\"\u0001\u001e\u0002\u0006\r\u0018\t\u0003«", 13 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (55 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), true));
            m7198(jSONObject.optBoolean(m7221(Gravity.getAbsoluteGravity(0, 0) + 26, (char) TextUtils.indexOf("", "", 0, 0), 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()));
            m7196(jSONObject.optBoolean(m7221(36 - ExpandableListView.getPackedPositionType(0L), (char) TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 24).intern(), true));
            m7211(jz.m6876(jSONObject.optJSONArray(m7221((ViewConfiguration.getTouchSlop() >> 8) + 60, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 6 - TextUtils.lastIndexOf("", '0', 0)).intern())));
            m7219(jz.m6876(jSONObject.optJSONArray(m7221(67 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 18 - ExpandableListView.getPackedPositionGroup(0L)).intern())));
            m7215(jz.m6876(jSONObject.optJSONArray(m7221((-16777131) - Color.rgb(0, 0, 0), (char) View.MeasureSpec.getMode(0), Drawable.resolveOpacity(0, 0) + 13).intern())));
            m7204(jz.m6876(jSONObject.optJSONArray(m7209("\r\u0006\u0002\u0006\n\u0002\n\u000e\u0010#||\u0087", (Process.myPid() >> 22) + 13, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 23)).intern())));
        }

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        public static /* synthetic */ String m7191(c cVar) {
            int i10 = f3263 + 17;
            int i11 = i10 % 128;
            f3259 = i11;
            int i12 = i10 % 2;
            String str = cVar.f3276;
            int i13 = i11 + 51;
            f3263 = i13 % 128;
            if (!(i13 % 2 != 0)) {
                return str;
            }
            int i14 = 34 / 0;
            return str;
        }

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7192(c cVar) {
            int i10 = f3259;
            int i11 = i10 + 43;
            f3263 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = cVar.f3271;
            int i13 = i10 + 59;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return z10;
        }

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7193(c cVar) {
            int i10 = f3259 + 49;
            int i11 = i10 % 128;
            f3263 = i11;
            int i12 = i10 % 2;
            boolean z10 = cVar.f3278;
            int i13 = i11 + 121;
            f3259 = i13 % 128;
            if ((i13 % 2 == 0 ? 'G' : (char) 24) != 'G') {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7194(c cVar) {
            int i10 = f3259 + 79;
            f3263 = i10 % 128;
            char c10 = i10 % 2 != 0 ? 'V' : 'I';
            boolean z10 = cVar.f3273;
            if (c10 != 'I') {
                int i11 = 6 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        public static /* synthetic */ List m7195(c cVar) {
            int i10 = f3263 + 111;
            int i11 = i10 % 128;
            f3259 = i11;
            int i12 = i10 % 2;
            List<String> list = cVar.f3268;
            int i13 = i11 + 59;
            f3263 = i13 % 128;
            if ((i13 % 2 != 0 ? '[' : (char) 29) != '[') {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private c m7196(boolean z10) {
            int i10 = f3259;
            int i11 = i10 + 71;
            f3263 = i11 % 128;
            int i12 = i11 % 2;
            this.f3266 = z10;
            int i13 = i10 + 59;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ String m7197(c cVar) {
            int i10 = f3263 + 67;
            int i11 = i10 % 128;
            f3259 = i11;
            boolean z10 = i10 % 2 == 0;
            String str = cVar.f3279;
            if (z10) {
                throw null;
            }
            int i12 = i11 + 39;
            f3263 = i12 % 128;
            int i13 = i12 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private c m7198(boolean z10) {
            int i10 = f3263 + 73;
            int i11 = i10 % 128;
            f3259 = i11;
            int i12 = i10 % 2;
            this.f3273 = z10;
            int i13 = i11 + 1;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7199(c cVar) {
            int i10 = f3259;
            int i11 = i10 + 119;
            f3263 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = cVar.f3270;
            int i13 = i10 + 1;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return z10;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ String m7200(c cVar) {
            int i10 = f3259;
            int i11 = i10 + 1;
            f3263 = i11 % 128;
            int i12 = i11 % 2;
            String str = cVar.f3275;
            int i13 = i10 + 115;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7201(c cVar) {
            int i10 = f3263 + 37;
            f3259 = i10 % 128;
            boolean z10 = i10 % 2 == 0;
            boolean z11 = cVar.f3274;
            if (z10) {
                int i11 = 70 / 0;
            }
            return z11;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7202(c cVar) {
            int i10 = f3263 + 75;
            f3259 = i10 % 128;
            char c10 = i10 % 2 == 0 ? 'L' : '8';
            boolean z10 = cVar.f3266;
            if (c10 == 'L') {
                int i11 = 49 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m7203(String str) {
            int i10 = f3263;
            int i11 = i10 + 41;
            f3259 = i11 % 128;
            int i12 = i11 % 2;
            this.f3277 = str;
            int i13 = i10 + 91;
            f3259 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m7204(List<String> list) {
            int i10 = f3263 + 57;
            int i11 = i10 % 128;
            f3259 = i11;
            int i12 = i10 % 2;
            if ((list != null ? (char) 27 : '(') != '(') {
                this.f3268 = list;
                int i13 = i11 + 65;
                f3263 = i13 % 128;
                int i14 = i13 % 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m7205(boolean z10) {
            int i10 = f3259;
            int i11 = i10 + 65;
            f3263 = i11 % 128;
            if (!(i11 % 2 == 0)) {
                this.f3271 = z10;
                throw null;
            }
            this.f3271 = z10;
            int i12 = i10 + 69;
            f3263 = i12 % 128;
            if (i12 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ List m7206(c cVar) {
            int i10 = f3263 + 55;
            f3259 = i10 % 128;
            boolean z10 = i10 % 2 == 0;
            List<Integer> list = cVar.f3265;
            if (z10) {
                int i11 = 62 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m7207(String str) {
            int i10 = f3263 + 71;
            int i11 = i10 % 128;
            f3259 = i11;
            int i12 = i10 % 2;
            this.f3275 = str;
            int i13 = i11 + 103;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m7208(boolean z10) {
            int i10 = f3259 + 59;
            f3263 = i10 % 128;
            if ((i10 % 2 != 0 ? ':' : '2') != ':') {
                this.f3272 = z10;
            } else {
                this.f3272 = z10;
                int i11 = 34 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m7209(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2151) {
                char[] cArr2 = f3264;
                char c10 = f3261;
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
        public static /* synthetic */ List m7210(c cVar) {
            int i10 = f3259;
            int i11 = i10 + 25;
            f3263 = i11 % 128;
            char c10 = i11 % 2 != 0 ? (char) 23 : '@';
            List<String> list = cVar.f3267;
            if (c10 != '@') {
                int i12 = 52 / 0;
            }
            int i13 = i10 + 65;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m7211(List<Integer> list) {
            if ((list != null ? '.' : 'a') != 'a') {
                int i10 = f3263 + 39;
                f3259 = i10 % 128;
                char c10 = i10 % 2 == 0 ? 'c' : '+';
                this.f3265 = list;
                if (c10 != '+') {
                    int i11 = 74 / 0;
                }
            }
            int i12 = f3259 + 125;
            f3263 = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m7212(boolean z10) {
            int i10 = f3259;
            int i11 = i10 + 37;
            f3263 = i11 % 128;
            if (!(i11 % 2 == 0)) {
                this.f3270 = z10;
                throw null;
            }
            this.f3270 = z10;
            int i12 = i10 + 47;
            f3263 = i12 % 128;
            if ((i12 % 2 != 0 ? '%' : (char) 27) != '%') {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ List m7213(c cVar) {
            int i10 = f3263 + 85;
            f3259 = i10 % 128;
            boolean z10 = i10 % 2 != 0;
            List<String> list = cVar.f3269;
            if (!z10) {
                int i11 = 34 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m7214(String str) {
            int i10 = f3259 + 47;
            int i11 = i10 % 128;
            f3263 = i11;
            int i12 = i10 % 2;
            this.f3279 = str;
            int i13 = i11 + 35;
            f3259 = i13 % 128;
            if (i13 % 2 != 0) {
                return this;
            }
            int i14 = 15 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m7215(List<String> list) {
            int i10 = f3263 + 107;
            int i11 = i10 % 128;
            f3259 = i11;
            if ((i10 % 2 == 0 ? (char) 11 : 'U') == 11) {
                throw null;
            }
            if (list != null) {
                this.f3269 = list;
            }
            int i12 = i11 + 103;
            f3263 = i12 % 128;
            if (i12 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m7216(boolean z10) {
            int i10 = f3259 + 3;
            int i11 = i10 % 128;
            f3263 = i11;
            int i12 = i10 % 2;
            this.f3278 = z10;
            int i13 = i11 + 43;
            f3259 = i13 % 128;
            if (!(i13 % 2 == 0)) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7217(c cVar) {
            int i10 = f3263 + 87;
            int i11 = i10 % 128;
            f3259 = i11;
            int i12 = i10 % 2;
            boolean z10 = cVar.f3272;
            int i13 = i11 + 73;
            f3263 = i13 % 128;
            if (i13 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m7218(String str) {
            int i10 = f3259 + 51;
            f3263 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 17 : '\n') != 17) {
                this.f3276 = str;
            } else {
                this.f3276 = str;
                int i11 = 65 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m7219(List<String> list) {
            int i10 = f3263;
            int i11 = i10 + 23;
            f3259 = i11 % 128;
            if ((i11 % 2 == 0 ? (char) 16 : 'a') != 'a') {
                throw null;
            }
            if (list != null) {
                int i12 = i10 + 3;
                f3259 = i12 % 128;
                if (i12 % 2 == 0) {
                    this.f3267 = list;
                    int i13 = 47 / 0;
                } else {
                    this.f3267 = list;
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m7220(boolean z10) {
            int i10 = f3263 + 97;
            int i11 = i10 % 128;
            f3259 = i11;
            int i12 = i10 % 2;
            this.f3274 = z10;
            int i13 = i11 + 73;
            f3263 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m7221(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1675) {
                char[] cArr = new char[i11];
                d.f1674 = 0;
                while (true) {
                    int i12 = d.f1674;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f3260[i10 + i12]) ^ (((long) i12) * f3262)) ^ ((long) c10));
                        d.f1674 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m7222(c cVar) {
            int i10 = f3263 + 77;
            f3259 = i10 % 128;
            char c10 = i10 % 2 == 0 ? 'E' : '1';
            String str = cVar.f3277;
            if (c10 != 'E') {
                return str;
            }
            throw null;
        }
    }

    public z(JSONObject jSONObject, it itVar) {
        m7189(jSONObject, itVar);
        m7178();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m7170() {
        int i10 = f3234 + 71;
        int i11 = i10 % 128;
        f3233 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 33;
        f3234 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m7171(z zVar) {
        int i10 = f3234 + 111;
        int i11 = i10 % 128;
        f3233 = i11;
        int i12 = i10 % 2;
        List<View> list = zVar.f3237;
        int i13 = i11 + 17;
        f3234 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 24 : '(') != 24) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <E extends View> void m7172(Activity activity, View view, Class<E> cls, boolean z10, List<Integer> list, List<String> list2, List<E> list3) {
        int i10 = f3233 + 39;
        f3234 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 1 : (char) 23) != 23) {
            throw null;
        }
        if ((view != null ? (char) 6 : '5') != 6) {
            ke.m6964(activity, cls, z10, list, list2, list3);
            return;
        }
        ke.m6970(view, cls, false, z10, list, list2, list3);
        int i11 = f3233 + 73;
        f3234 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m7173(List<View> list) {
        int i10 = f3234 + 37;
        f3233 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if (!(i12 < list.size())) {
                int i13 = f3233 + 19;
                f3234 = i13 % 128;
                int i14 = i13 % 2;
                return;
            } else {
                int i15 = f3234 + 47;
                f3233 = i15 % 128;
                if (!(i15 % 2 != 0)) {
                    m7176(list.get(i12), this.f3239);
                    i12++;
                } else {
                    m7176(list.get(i12), this.f3239);
                    i12 += 81;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m7174(View view, List<String> list) {
        int i10 = f3234 + 91;
        f3233 = i10 % 128;
        int i11 = i10 % 2;
        if ((list != null) && !list.isEmpty()) {
            int i12 = f3234 + 121;
            f3233 = i12 % 128;
            int i13 = i12 % 2;
            String name = view.getClass().getPackage().getName();
            Iterator<String> it = list.iterator();
            while (true) {
                if ((it.hasNext() ? '(' : 'D') != '(') {
                    return false;
                }
                int i14 = f3234 + 71;
                f3233 = i14 % 128;
                int i15 = i14 % 2;
                String strM7182 = m7182(it.next());
                if ((!TextUtils.isEmpty(strM7182) ? '3' : (char) 11) != 11) {
                    int i16 = f3233 + 119;
                    f3234 = i16 % 128;
                    int i17 = i16 % 2;
                    if ((name.startsWith(strM7182) ? ';' : 'a') == ';') {
                        break;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ c m7175(z zVar) {
        int i10 = f3234 + 39;
        f3233 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        c cVar = zVar.f3239;
        if (!z10) {
            return cVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m7176(View view, c cVar) {
        if (!m7180(view)) {
            return;
        }
        if (c.m7199(cVar)) {
            int i10 = f3234 + 71;
            f3233 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f3240.get(view);
                throw null;
            }
            if (this.f3240.get(view) != null) {
                if (c.m7201(cVar)) {
                    mo4338(IronSourceVideoBridge.jsonObjectInit(), view, null);
                    return;
                }
                return;
            }
            this.f3240.put(view, this);
            mo4338(IronSourceVideoBridge.jsonObjectInit(), view, null);
            int i11 = f3233 + 81;
            f3234 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 8 / 0;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ke.m6970(view, WebView.class, false, c.m7217(cVar), c.m7206(cVar), c.m7213(cVar), arrayList);
        if (!(!(view instanceof WebView))) {
            arrayList.add((WebView) view);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                return;
            }
            int i13 = f3233 + 37;
            f3234 = i13 % 128;
            int i14 = i13 % 2;
            WebView webView = (WebView) it.next();
            if (this.f3240.get(webView) == null && webView.getClass().getName().startsWith(c.m7200(cVar))) {
                ab abVar = new ab();
                this.f3244.put(webView, abVar);
                abVar.m4337(c.m7197(cVar), TextUtils.isEmpty(c.m7191(cVar)) ? null : Arrays.asList(c.m7191(cVar).split(m7186((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 230 - Drawable.resolveOpacity(0, 0), 1 - KeyEvent.keyCodeFromString(""), "\u0000", false).intern())), c.m7192(cVar), c.m7193(cVar), c.m7194(cVar));
                abVar.m7127(m7184());
                abVar.m4340(webView);
                abVar.m4341(Integer.toHexString(webView.hashCode()));
                this.f3240.put(webView, this);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m7177(z zVar) {
        int i10 = f3234;
        int i11 = i10 + 27;
        f3233 = i11 % 128;
        int i12 = i11 % 2;
        Map<View, View.OnLayoutChangeListener> map = zVar.f3238;
        int i13 = i10 + 91;
        f3233 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7178() {
        this.f3242 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.z.4

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f3251 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f3252 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static boolean f3253 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static boolean f3254 = true;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f3255 = {323, 342, 338, 356, 302, 337, 352, 309, 334, 347, 345, 351, 306, 348, 269, 313, 358, 354, 353, 304, 341, 340};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f3256 = 237;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m7190(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f3255;
                    int i11 = f3256;
                    if (f3253) {
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
                    if (f3254) {
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

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                int i18 = f3251 + 121;
                f3252 = i18 % 128;
                try {
                    if (!(i18 % 2 == 0)) {
                        z.this.m7188(view);
                        throw null;
                    }
                    z.this.m7188(view);
                    int i19 = f3251 + 107;
                    f3252 = i19 % 128;
                    int i20 = i19 % 2;
                } catch (Throwable th2) {
                    kd.m6948(m7190(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u008c\u0083\u008b\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7190(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0083\u0096\u008a\u0089\u0095\u0094\u0093\u0092\u008e\u0091\u0089\u0090\u008a\u008e\u008f\u008a\u0082\u008f\u008c\u008e\u008c\u008c\u008d").intern(), th2, false);
                }
            }
        };
        this.f3241 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.z.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﻐ */
            public final void mo4361(View view) {
                view.removeOnLayoutChangeListener(z.m7181(z.this));
                z.m7177(z.this).remove(view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﻛ */
            public final void mo4365(View view) {
                view.addOnLayoutChangeListener(z.m7181(z.this));
                z.m7177(z.this).put(view, z.m7181(z.this));
            }
        };
        ji.m6743().m6750(this.f3241);
        int i10 = f3233 + 103;
        f3234 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m7179(z zVar, List list) {
        int i10 = f3233 + 101;
        f3234 = i10 % 128;
        int i11 = i10 % 2;
        zVar.m7173((List<View>) list);
        int i12 = f3233 + 39;
        f3234 = i12 % 128;
        if ((i12 % 2 == 0 ? 'Y' : 'L') != 'L') {
            int i13 = 96 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m7180(View view) {
        int i10 = f3233 + 45;
        f3234 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (!(this.f3243 != null)) {
            return true;
        }
        if ((m7174(view, c.m7195(this.f3239)) ? (char) 28 : (char) 1) != 1) {
            int i11 = f3234 + 27;
            f3233 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f3243.mo5775(view);
                throw null;
            }
            if (this.f3243.mo5775(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m7181(z zVar) {
        int i10 = f3234;
        int i11 = i10 + 125;
        f3233 = i11 % 128;
        int i12 = i11 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = zVar.f3242;
        int i13 = i10 + 93;
        f3233 = i13 % 128;
        int i14 = i13 % 2;
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7182(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List listAsList = Arrays.asList(str.split(m7186(TextUtils.indexOf((CharSequence) "", '0') + 4, (ViewConfiguration.getTouchSlop() >> 8) + 262, (ViewConfiguration.getScrollBarSize() >> 8) + 2, "￢\u000f\u0011", true).intern()));
        if ((listAsList.size() <= 3 ? '_' : '=') == '=') {
            String strJoin = TextUtils.join(m7186(View.MeasureSpec.getMode(0) + 1, 232 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, "\u0000", true).intern(), listAsList.subList(0, 3));
            int i10 = f3233 + 113;
            f3234 = i10 % 128;
            int i11 = i10 % 2;
            return strJoin;
        }
        int i12 = f3234;
        int i13 = i12 + 75;
        f3233 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 + 35;
        f3233 = i15 % 128;
        int i16 = i15 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m7183(Activity activity, View view, Class cls, boolean z10, List list, List list2, List list3) {
        int i10 = f3233 + 57;
        f3234 = i10 % 128;
        int i11 = i10 % 2;
        m7172(activity, view, cls, z10, list, list2, list3);
        int i12 = f3233 + 43;
        f3234 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<WebView, Activity> m7184() {
        bb.e eVar = new bb.e() { // from class: com.ironsource.adqualitysdk.sdk.i.z.5
            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo5779(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo5779(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo5780(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo5780(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo5782(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo5782(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo4338(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo4338(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo5785(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo5785(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo5788(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo5788(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo5789(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo5789(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo4343(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo4343(jSONObject, (WebView) obj, (Activity) obj2);
            }
        };
        int i10 = f3233 + 37;
        f3234 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 0 : (char) 28) != 0) {
            return eVar;
        }
        int i11 = 90 / 0;
        return eVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Class m7185(z zVar) {
        int i10 = f3234;
        int i11 = i10 + 33;
        f3233 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        Class cls = zVar.f3236;
        if (!z10) {
            throw null;
        }
        int i12 = i10 + 27;
        f3233 = i12 % 128;
        int i13 = i12 % 2;
        return cls;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7186(int i10, int i11, int i12, String str, boolean z10) {
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
                cArr2[b.f726] = (char) (b.f727 + i11);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f3235);
                b.f726 = i14 + 1;
            }
            if (i12 > 0) {
                b.f729 = i12;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m7187() {
        m7127((r) null);
        ji.m6743().m6751(this.f3241);
        HashSet hashSet = new HashSet(this.f3238.keySet());
        this.f3238.clear();
        Iterator it = hashSet.iterator();
        int i10 = f3233 + 65;
        f3234 = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            if ((it.hasNext() ? '\'' : '4') != '\'') {
                return;
            }
            ((View) it.next()).removeOnLayoutChangeListener(this.f3242);
            i10 = f3233 + 105;
            f3234 = i10 % 128;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ */
    public final /* synthetic */ String mo4339(Activity activity) {
        int i10 = f3234 + 69;
        f3233 = i10 % 128;
        int i11 = i10 % 2;
        String strM7170 = m7170();
        int i12 = f3234 + 11;
        f3233 = i12 % 128;
        if ((i12 % 2 != 0 ? 'D' : (char) 25) != 'D') {
            return strM7170;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7188(final View view) {
        try {
            if (this.f3236 == null) {
                int i10 = f3234 + 119;
                f3233 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f3236 = Class.forName(c.m7222(this.f3239));
                    throw null;
                }
                this.f3236 = Class.forName(c.m7222(this.f3239));
            }
            final Activity activityMo6753 = jj.m6752().mo6753();
            if (activityMo6753 == null) {
                return;
            }
            if ((!c.m7210(this.f3239).isEmpty() ? (char) 21 : 'P') == 21) {
                int i11 = f3233 + 117;
                f3234 = i11 % 128;
                int i12 = i11 % 2;
                Activity activityM6966 = ke.m6966(view);
                if ((activityM6966 != null ? '*' : (char) 18) != 18) {
                    int i13 = f3234 + 73;
                    f3233 = i13 % 128;
                    int i14 = i13 % 2;
                    if (c.m7210(this.f3239).contains(activityM6966.getClass().getName())) {
                        return;
                    }
                }
            }
            t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    z.m7171(z.this).clear();
                    z.m7183(activityMo6753, view, z.m7185(z.this), c.m7217(z.m7175(z.this)), c.m7206(z.m7175(z.this)), c.m7213(z.m7175(z.this)), z.m7171(z.this));
                    if (ke.m6961(view, z.m7185(z.this), null, c.m7206(z.m7175(z.this)), c.m7213(z.m7175(z.this)))) {
                        z.m7171(z.this).add(view);
                    }
                    final ArrayList arrayList = new ArrayList(z.m7171(z.this));
                    if (c.m7202(z.m7175(z.this))) {
                        t.m7069(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4352() {
                                z.m7179(z.this, arrayList);
                            }
                        });
                    } else {
                        z.m7179(z.this, arrayList);
                    }
                }
            });
        } catch (Throwable th2) {
            String strIntern = m7186(14 - TextUtils.getTrimmedLength(""), 285 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionChild(0L) + 12, "\u0001\u000b\ufffe￥\u0010\u0001\uffde\u0014\u0002\u0006\ufff3\u000f\u0002\t", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7186(19 - TextUtils.lastIndexOf("", '0'), AndroidCharacter.getMirror('0') + 233, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0015\u0006\b\uffc1\u0013\u0010\u0013\u0013￦\uffc1\u0014\u0014\u0002\r\u0004\uffc1\b\u000f\n\u0015", true).intern());
            sb2.append(c.m7222(this.f3239));
            sb2.append(m7186(2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 222 - View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1, "￼￼\t", false).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m6886(strIntern, sb2.toString());
            m7187();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m7189(JSONObject jSONObject, it itVar) {
        this.f3239 = new c(jSONObject);
        this.f3243 = itVar;
        int i10 = f3234 + 57;
        f3233 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }
}

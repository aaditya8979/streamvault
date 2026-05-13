package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.i.y;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends y<Activity> implements jg {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static byte[] f3118 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f3119 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f3120;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3121;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f3122;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3123;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3124;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String f3125;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private a f3126;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3127;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3128;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3129;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f3130;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3131;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jg f3132;

    public class a extends y.c {

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static short[] f3164 = null;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f3165 = 1;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f3166 = 0;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f3167 = 1045909691;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f3168 = -595238911;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f3170 = 115;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3171 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3172;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3173;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f3174;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f3175;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static byte[] f3169 = {-101, -8, 12, 19, -43, 5, 11, -13, 13, -11, 17, 34, -35, 3, -106, 27, -46, 18, -4, 19, -12, -3, -18, -98, -11, -9, 37, -37, 5, 11, -13, 13, -11, 17, 34, -51, 17, 2, -23, 19, -105, 17, -2, -5, -4, 37, -38, 27, ExifInterface.MARKER_APP1, 9, -106, 15, 3, 1, -13, 34, -28, -6, -3, -99, 6, 9, -4, -3, 41, -52, 18, -4, 19, -12, -3, 14, -14, -14, -2, -97, 6, 9, -4, -3, 41, -34, -8, -2, -3, 10, 37, ExifInterface.MARKER_APP1, -3, 14, -14, -14, -2, -105, 41, -23, -17, -2, -4, 51, -32, -14, -2, -106, 1, 4, 31, -30, 31, -33, 3, 4};

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static char f3163 = 6;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static char[] f3162 = {'w', 'e', 'b', 'V', 'i', 'C', 'l', 'a', 's', 'N', 'm', 'P', 'r', 'f', 'x', 'c', 't', 'k', 'o', 'D', 'y', ',', 'u', 'W', 'H', 'h', 'J', 'v', 'p', 'M', 'I', 'n', 'T', 'g', 'z', '{'};

        public a(u uVar, JSONObject jSONObject) {
            m7120(jSONObject.optString(m7116((short) ExpandableListView.getPackedPositionType(0L), (-1045909691) - KeyEvent.normalizeMetaState(0), Color.blue(0) - 116, 595239009 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) View.MeasureSpec.getMode(0)).intern()));
            m7113(jSONObject.optString(m7121((byte) (67 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0001\u0000\u0007\b¶¶\n\b\u0007\u0004\u0006\u0011\u0007\u0013\u0002\u0010", 22 - TextUtils.indexOf("", "")).intern()));
            m7119(jSONObject.optInt(m7116((short) TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1045909677, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 115, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 595239029, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), -1));
            m7111(jSONObject.optBoolean(m7116((short) (MotionEvent.axisFromString("") + 1), (-1062686884) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 117, 595239012 - Gravity.getAbsoluteGravity(0, 0), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()));
            m7110(jSONObject.optBoolean(m7121((byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50), "\t\r\u0011\u0004\b\u0007\b\u0000\t\r\u000e\u000b\u0006\u0015\u0019\u0007\u0007\b«", 19 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
            m7164(jSONObject.optString(m7116((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1045909651) - TextUtils.indexOf("", ""), (-116) - TextUtils.indexOf("", ""), 595239017 - TextUtils.indexOf("", "", 0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()));
            m7165(TextUtils.isEmpty(jSONObject.optString(m7116((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + (-1045909641), View.MeasureSpec.getMode(0) + (-116), 595239027 - MotionEvent.axisFromString(""), (byte) ExpandableListView.getPackedPositionType(0L)).intern())) ? null : Arrays.asList(jSONObject.optString(m7116((short) View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) - 1045909641, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 116, 595239028 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).split(m7121((byte) (TextUtils.indexOf("", "") + 69), "q", View.resolveSize(0, 0) + 1).intern())));
            m7166(jSONObject.optBoolean(m7121((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 105), "\u0014\n\u0005\u0013\u0002\u0003\u0004\u0005\u0002\u0001\u0019\u0006\u0007\u001a", TextUtils.indexOf("", "", 0) + 14).intern()));
            m7169(jSONObject.optBoolean(m7121((byte) (110 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0014\n\u0002\u0019\t\u0019\b\t\u0010\r\n\"â", (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern(), true));
            m7162(!TextUtils.isEmpty(jSONObject.optString(m7116((short) (KeyEvent.getMaxKeyCode() >> 16), (-1045909651) - Color.alpha(0), ExpandableListView.getPackedPositionChild(0L) + (-115), (ViewConfiguration.getPressedStateDuration() >> 16) + 595239017, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) || jSONObject.optBoolean(m7116((short) ((-1) - Process.getGidForName("")), MotionEvent.axisFromString("") + (-1045909631), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + (-117), 595239028 - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getScrollBarSize() >> 8)).intern()) || jSONObject.optBoolean(m7116((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + (-1045909616), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + (-117), 595239027 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (Process.myTid() >> 22)).intern()));
            m7168(jSONObject.optBoolean(m7116((short) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1045909632, (-116) - (KeyEvent.getMaxKeyCode() >> 16), 595239028 - TextUtils.getOffsetAfter("", 0), (byte) Color.blue(0)).intern()));
            m7161(jSONObject.optBoolean(m7116((short) ExpandableListView.getPackedPositionType(0L), (-1045909599) - ((byte) KeyEvent.getModifierMetaStateMask()), Color.rgb(0, 0, 0) + 16777100, TextUtils.indexOf((CharSequence) "", '0') + 595239029, (byte) TextUtils.indexOf("", "", 0, 0)).intern()));
            m7163(jSONObject.optBoolean(m7121((byte) (Color.blue(0) + 125), "\u0014\n\u0005\u0019\u0012\n\u0016\n\u0018\n\u0005\u0013\u0002\u0003\u0004\u0005\u0002\u0001ð", 19 - TextUtils.indexOf("", "")).intern()));
            m7159(jSONObject.optBoolean(m7121((byte) (Color.red(0) + 80), "\u0010\u001c\n\f\n\"\u0007\u0000\u001f \n\u000e\r\u0001\r\u0003Ã", TextUtils.getTrimmedLength("") + 17).intern()));
            m7160(jSONObject.optBoolean(m7116((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.red(0) - 1045909588, ExpandableListView.getPackedPositionChild(0L) - 115, 595239016 - ExpandableListView.getPackedPositionType(0L), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern()));
            m7167(jz.m6876(jSONObject.optJSONArray(m7121((byte) (TextUtils.lastIndexOf("", '0') + 113), "\u001c\u0003\u0002\u0001\u000e\u0002\u0018\u0000\" \u0018\u0012Õ", TextUtils.indexOf((CharSequence) "", '0', 0) + 14).intern())));
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private a m7110(boolean z10) {
            int i10 = f3165;
            int i11 = i10 + 97;
            f3166 = i11 % 128;
            int i12 = i11 % 2;
            this.f3171 = z10;
            int i13 = i10 + 33;
            f3166 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private a m7111(boolean z10) {
            int i10 = f3166 + 73;
            int i11 = i10 % 128;
            f3165 = i11;
            if (!(i10 % 2 != 0)) {
                this.f3173 = z10;
                throw null;
            }
            this.f3173 = z10;
            int i12 = i11 + 79;
            f3166 = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7112(a aVar) {
            int i10 = f3166;
            int i11 = i10 + 99;
            f3165 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = aVar.f3173;
            int i13 = i10 + 37;
            f3165 = i13 % 128;
            if ((i13 % 2 == 0 ? 'A' : 'P') != 'A') {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m7113(String str) {
            int i10 = f3166 + 55;
            f3165 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                this.f3174 = str;
            } else {
                this.f3174 = str;
                int i11 = 32 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ boolean m7114(a aVar) {
            int i10 = f3165;
            int i11 = i10 + 39;
            f3166 = i11 % 128;
            boolean z10 = i11 % 2 != 0;
            boolean z11 = aVar.f3171;
            if (z10) {
                throw null;
            }
            int i12 = i10 + 67;
            f3166 = i12 % 128;
            int i13 = i12 % 2;
            return z11;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m7115(a aVar) {
            int i10 = f3166 + 43;
            int i11 = i10 % 128;
            f3165 = i11;
            char c10 = i10 % 2 == 0 ? '>' : 'P';
            String str = aVar.f3172;
            if (c10 != 'P') {
                throw null;
            }
            int i12 = i11 + 59;
            f3166 = i12 % 128;
            if (!(i12 % 2 != 0)) {
                return str;
            }
            int i13 = 77 / 0;
            return str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m7116(short s10, int i10, int i11, int i12, byte b10) {
            String string;
            synchronized (o.f3015) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f3170;
                int i14 = i11 + i13;
                boolean z10 = i14 == -1;
                if (z10) {
                    byte[] bArr = f3169;
                    i14 = bArr != null ? (byte) (bArr[f3167 + i10] + i13) : (short) (f3164[f3167 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3016 = ((i10 + i14) - 2) + f3167 + (z10 ? 1 : 0);
                    o.f3017 = b10;
                    char c10 = (char) (i12 + f3168);
                    o.f3019 = c10;
                    sb2.append(c10);
                    o.f3018 = o.f3019;
                    o.f3020 = 1;
                    while (o.f3020 < i14) {
                        byte[] bArr2 = f3169;
                        if (bArr2 != null) {
                            int i15 = o.f3016;
                            o.f3016 = i15 - 1;
                            o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                        } else {
                            short[] sArr = f3164;
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

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m7117(a aVar) {
            int i10 = f3165 + 73;
            int i11 = i10 % 128;
            f3166 = i11;
            int i12 = i10 % 2;
            String str = aVar.f3174;
            int i13 = i11 + 79;
            f3165 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ int m7118(a aVar) {
            int i10 = f3166 + 19;
            int i11 = i10 % 128;
            f3165 = i11;
            int i12 = i10 % 2;
            int i13 = aVar.f3175;
            int i14 = i11 + 31;
            f3166 = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            return i13;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m7119(int i10) {
            int i11 = f3165 + 49;
            int i12 = i11 % 128;
            f3166 = i12;
            int i13 = i11 % 2;
            this.f3175 = i10;
            int i14 = i12 + 41;
            f3165 = i14 % 128;
            int i15 = i14 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m7120(String str) {
            int i10 = f3166 + 87;
            f3165 = i10 % 128;
            if ((i10 % 2 == 0 ? '?' : 'Z') != 'Z') {
                this.f3172 = str;
                int i11 = 26 / 0;
            } else {
                this.f3172 = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m7121(byte b10, String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2151) {
                char[] cArr2 = f3162;
                char c10 = f3163;
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
    }

    static {
        m7083();
        f3125 = m7094((short) (TextUtils.indexOf("", "") - 101), View.resolveSizeAndState(0, 0, 0) + 1587075894, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 88, (-829340426) - (KeyEvent.getMaxKeyCode() >> 16), (byte) View.MeasureSpec.getMode(0)).intern();
        int i10 = f3121 + 87;
        f3119 = i10 % 128;
        if ((i10 % 2 == 0 ? '^' : ',') != '^') {
        } else {
            throw null;
        }
    }

    public u(JSONObject jSONObject, is isVar) {
        super(isVar);
        this.f3129 = false;
        this.f3131 = false;
        this.f3127 = false;
        this.f3128 = false;
        m7108(jSONObject);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m7078() {
        int i10 = f3119;
        int i11 = i10 + 117;
        f3121 = i11 % 128;
        int i12 = i11 % 2;
        String str = f3125;
        int i13 = i10 + 121;
        f3121 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.u.a.m7112(r3.f3126) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.u.a.m7112(r3.f3126) ? '9' : 14) != '9') goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        return r3.f3130.isAssignableFrom(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.u.f3121 + 35;
        com.ironsource.adqualitysdk.sdk.i.u.f3119 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        return r3.f3130.equals(r4);
     */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m7079(android.app.Activity r4) {
        /*
            r3 = this;
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r0 = r3.f3130
            r1 = 26
            if (r0 == 0) goto Lc
            r0 = r1
            goto Le
        Lc:
            r0 = 64
        Le:
            r2 = 0
            if (r0 == r1) goto L2a
            int r4 = com.ironsource.adqualitysdk.sdk.i.u.f3119
            int r4 = r4 + 83
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3121 = r0
            int r4 = r4 % 2
            r0 = 1
            if (r4 == 0) goto L20
            r4 = r0
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == r0) goto L24
            return r2
        L24:
            r4 = 34
            int r4 = r4 / r2
            return r2
        L28:
            r4 = move-exception
            throw r4
        L2a:
            int r0 = com.ironsource.adqualitysdk.sdk.i.u.f3121
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3119 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L43
            com.ironsource.adqualitysdk.sdk.i.u$a r0 = r3.f3126
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.u.a.m7112(r0)
            r1 = 4
            int r1 = r1 / r2
            if (r0 == 0) goto L53
            goto L5a
        L41:
            r4 = move-exception
            throw r4
        L43:
            com.ironsource.adqualitysdk.sdk.i.u$a r0 = r3.f3126
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.u.a.m7112(r0)
            r1 = 57
            if (r0 == 0) goto L4f
            r0 = r1
            goto L51
        L4f:
            r0 = 14
        L51:
            if (r0 == r1) goto L5a
        L53:
            java.lang.Class r0 = r3.f3130
            boolean r4 = r0.isAssignableFrom(r4)
            return r4
        L5a:
            int r0 = com.ironsource.adqualitysdk.sdk.i.u.f3121
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3119 = r1
            int r0 = r0 % 2
            java.lang.Class r0 = r3.f3130
            boolean r4 = r0.equals(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.u.m7079(android.app.Activity):boolean");
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7080(u uVar) {
        int i10 = f3119 + 45;
        f3121 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean z11 = uVar.f3127;
        if (!z10) {
            return z11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private jg m7081() {
        int i10 = f3119;
        int i11 = i10 + 21;
        f3121 = i11 % 128;
        int i12 = i11 % 2;
        jg jgVar = this.f3132;
        int i13 = i10 + 45;
        f3121 = i13 % 128;
        if ((i13 % 2 != 0 ? '%' : '[') == '[') {
            return jgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m7082(Activity activity) {
        int i10 = f3119 + 71;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        String hexString = Integer.toHexString(activity.hashCode());
        int i12 = f3121 + 103;
        f3119 = i12 % 128;
        int i13 = i12 % 2;
        return hexString;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static void m7083() {
        f3124 = -1587075845;
        f3123 = 87;
        f3122 = 829340525;
        f3118 = new byte[]{-70, -115, 121, -120, 118, -115, -103, 100, -93, 72, -123, -117, 115, -115, 117, -111, -94, -55, 61, 35, 86, 83, 96, -95, 8, 82, -85, 19, 77, 96, 105, 54, 92, 120, 54, 98, -101, 16, 80, 92, 92, 87, 90, -104, 5, 90, 84, 87, -124, -48, 92, 109, 108, 122, 84, -120, 120, 40, 108, 86, -86, 40, 108, 86, 95, 106, 112, 98, 112, 81, 105, 114, 104, -104, 46, 103, 86, 98, 107, 97, 106, 100, 98, 110, -96, 38, 99, 113};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Class m7084(u uVar, Class cls) {
        int i10 = f3121 + 89;
        int i11 = i10 % 128;
        f3119 = i11;
        int i12 = i10 % 2;
        uVar.f3130 = cls;
        int i13 = i11 + 79;
        f3121 = i13 % 128;
        if ((i13 % 2 != 0 ? '\\' : '\'') != '\\') {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7085(u uVar) {
        int i10 = f3121 + 111;
        int i11 = i10 % 128;
        f3119 = i11;
        int i12 = i10 % 2;
        boolean z10 = uVar.f3131;
        int i13 = i11 + 17;
        f3121 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7086(u uVar, boolean z10) {
        int i10 = f3121;
        int i11 = i10 + 53;
        f3119 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 11 : '/';
        uVar.f3127 = z10;
        if (c10 == 11) {
            throw null;
        }
        int i12 = i10 + 35;
        f3119 = i12 % 128;
        int i13 = i12 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m7087(Activity activity) {
        int i10 = f3119 + 9;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        View viewFindViewById = activity.findViewById(R.id.content);
        int i12 = f3121 + 69;
        f3119 = i12 % 128;
        if ((i12 % 2 == 0 ? 'X' : 'Q') == 'Q') {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ a m7088(u uVar) {
        int i10 = f3119 + 125;
        int i11 = i10 % 128;
        f3121 = i11;
        int i12 = i10 % 2;
        a aVar = uVar.f3126;
        int i13 = i11 + 87;
        f3119 = i13 % 128;
        int i14 = i13 % 2;
        return aVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7089(u uVar, boolean z10) {
        int i10 = f3121 + 125;
        f3119 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '@' : 'L';
        uVar.f3131 = z10;
        if (c10 != '@') {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7090(ir irVar) {
        int i10 = f3121 + 33;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
        if (!a.m7114(this.f3126)) {
            t.m7069(irVar);
            return;
        }
        int i12 = f3121 + 71;
        f3119 = i12 % 128;
        int i13 = i12 % 2;
        t.m7076(irVar);
        int i14 = f3121 + 9;
        f3119 = i14 % 128;
        if (i14 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7091(u uVar) {
        int i10 = f3119 + 89;
        f3121 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean z11 = uVar.f3128;
        if (z10) {
            throw null;
        }
        return z11;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7092(u uVar, Activity activity) {
        int i10 = f3121 + 43;
        f3119 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        boolean zM7079 = uVar.m7079(activity);
        if (z10) {
            int i11 = 56 / 0;
        }
        return zM7079;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7093(u uVar, boolean z10) {
        int i10 = f3121 + 51;
        int i11 = i10 % 128;
        f3119 = i11;
        int i12 = i10 % 2;
        uVar.f3129 = z10;
        int i13 = i11 + 107;
        f3121 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7094(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f3123;
            int i14 = i11 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f3118;
                i14 = bArr != null ? (byte) (bArr[f3124 + i10] + i13) : (short) (f3120[f3124 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f3124 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i12 + f3122);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f3118;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f3120;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m7095(Activity activity, List<WebView> list) {
        int i10 = f3119 + 17;
        f3121 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 20 : ')') != ')') {
            ke.m6963(activity, WebView.class, a.m7118(this.f3126), a.m7117(this.f3126), true, false, null, this.f3126.f3231, list);
        } else {
            ke.m6963(activity, WebView.class, a.m7118(this.f3126), a.m7117(this.f3126), false, false, null, this.f3126.f3231, list);
        }
        int i11 = f3121 + 69;
        f3119 = i11 % 128;
        if ((i11 % 2 == 0 ? '\t' : ':') != '\t') {
            return;
        }
        int i12 = 9 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7096() {
        int i10 = f3121 + 27;
        int i11 = i10 % 128;
        f3119 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 31;
        f3121 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return false;
        }
        int i14 = 96 / 0;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7097(u uVar) {
        int i10 = f3121 + 11;
        f3119 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean z11 = uVar.f3129;
        if (z10) {
            return z11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m7098(u uVar, boolean z10) {
        int i10 = f3121 + 117;
        int i11 = i10 % 128;
        f3119 = i11;
        int i12 = i10 % 2;
        uVar.f3128 = z10;
        int i13 = i11 + 103;
        f3121 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ jg m7099(u uVar) {
        int i10 = f3119 + 7;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        jg jgVarM7081 = uVar.m7081();
        int i12 = f3119 + 65;
        f3121 = i12 % 128;
        int i13 = i12 % 2;
        return jgVarM7081;
    }

    /* JADX INFO: renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    public static /* synthetic */ String m7100(Activity activity) {
        int i10 = f3121 + 51;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
        String strM7082 = m7082(activity);
        int i12 = f3119 + 117;
        f3121 = i12 % 128;
        int i13 = i12 % 2;
        return strM7082;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        m7090(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    u.m7099(u.this).onActivityCreated(activity, bundle);
                    u.m7096();
                    u.m7089(u.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        u.m7093(u.this, false);
                        return;
                    }
                    u.m7093(u.this, bundle2.getBoolean(u.m7078()));
                    if (u.m7097(u.this)) {
                        u.m7089(u.this, true);
                    }
                    u.m7098(u.this, true);
                }
            }
        });
        int i10 = f3121 + 99;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        m7090(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            u.m7099(u.this).onActivityDestroyed(activity);
                        }
                    });
                    if (u.m7085(u.this) && u.m7097(u.this) && activity.isFinishing()) {
                        u.this.m7106(activity);
                    }
                }
            }
        });
        int i10 = f3121 + 19;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    u.m7099(u.this).onActivityPaused(activity);
                }
            }
        });
        int i10 = f3119 + 105;
        f3121 = i10 % 128;
        if ((i10 % 2 != 0 ? 'K' : 'F') == 'F') {
        } else {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        m7090(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.7
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.7.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            u.m7099(u.this).onActivityResumed(activity);
                        }
                    });
                    u.m7086(u.this, false);
                    u.m7089(u.this, true);
                    if ((!u.m7097(u.this) || u.m7091(u.this)) && !activity.isFinishing()) {
                        u uVar = u.this;
                        Activity activity2 = activity;
                        uVar.m7104(activity2, u.m7100(activity2));
                    }
                    u.m7098(u.this, false);
                }
            }
        });
        int i10 = f3121 + 119;
        f3119 = i10 % 128;
        if ((i10 % 2 == 0 ? '?' : '\b') == '\b') {
        } else {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m7090(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    u.m7099(u.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(u.m7078(), u.m7097(u.this));
                    }
                    u.m7086(u.this, true);
                }
            }
        });
        int i10 = f3121 + 79;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    u.m7099(u.this).onActivityStarted(activity);
                }
            }
        });
        int i10 = f3119 + 121;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        m7090(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.9.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            u.m7099(u.this).onActivityStopped(activity);
                        }
                    });
                    if (u.m7085(u.this) && !u.m7080(u.this) && activity.isFinishing()) {
                        u.this.m7106(activity);
                    }
                }
            }
        });
        int i10 = f3121 + 99;
        f3119 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 26 : '\'') != 26) {
            return;
        }
        int i11 = 99 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7101() {
        int i10 = f3119 + 19;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        jj.m6752().m6755(this);
        int i12 = f3119 + 25;
        f3121 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ﻐ */
    public final void mo4460(final Activity activity) {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    u.m7099(u.this).mo4460(activity);
                }
            }
        });
        int i10 = f3121 + 103;
        f3119 = i10 % 128;
        if (!(i10 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻐ */
    public final /* synthetic */ void mo4362(Activity activity, List list) {
        int i10 = f3121 + 43;
        f3119 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m7095(activity, (List<WebView>) list);
        if (!z10) {
            int i11 = 81 / 0;
        }
        int i12 = f3121 + 75;
        f3119 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m7102() {
        int i10 = f3121 + 71;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
        m7127((r) null);
        m7107((jg) null);
        jj.m6752().m6754(this);
        int i12 = f3121 + 33;
        f3119 = i12 % 128;
        if ((i12 % 2 == 0 ? 'F' : 'R') == 'R') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ void mo7103(Activity activity) {
        int i10 = f3121 + 11;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
        m7106(activity);
        int i12 = f3121 + 33;
        f3119 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ */
    public final r<WebView, Activity> mo4366() {
        int i10 = f3119;
        int i11 = i10 + 103;
        f3121 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 79;
        f3121 = i13 % 128;
        if ((i13 % 2 != 0 ? '\n' : ':') == ':') {
            return this;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ｋ */
    public final void mo4461(final Activity activity) {
        t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                if (u.m7092(u.this, activity)) {
                    u.m7099(u.this).mo4461(activity);
                }
            }
        });
        int i10 = f3121 + 85;
        f3119 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final void m7104(Activity activity, String str) {
        int i10 = f3119 + 57;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        if ((!this.f3129 ? 'O' : '`') == 'O') {
            this.f3129 = true;
            super.mo7105(activity, str);
            int i12 = f3119 + 19;
            f3121 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(ih.f2514, true);
        } catch (JSONException e10) {
            String strIntern = m7094((short) ((-128) - Drawable.resolveOpacity(0, 0)), View.resolveSize(0, 0) + 1587075845, TextUtils.getOffsetBefore("", 0) - 88, (-829340460) - Color.green(0), (byte) View.MeasureSpec.getSize(0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7094((short) ((ViewConfiguration.getScrollBarSize() >> 8) - 87), 1587075862 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 88, (-829340456) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) View.combineMeasuredStates(0, 0)).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m6886(strIntern, sb2.toString());
        }
        super.m7146(jSONObjectJsonObjectInit, activity, str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo7105(Activity activity, String str) {
        int i10 = f3119;
        char c10 = G5.T;
        int i11 = i10 + 61;
        f3121 = i11 % 128;
        int i12 = i11 % 2;
        m7104(activity, str);
        int i13 = f3119 + 125;
        f3121 = i13 % 128;
        if (i13 % 2 == 0) {
            c10 = 'Q';
        }
        if (c10 == 'Q') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7106(Activity activity) {
        int i10 = f3121 + 91;
        f3119 = i10 % 128;
        int i11 = i10 % 2;
        super.mo7103(activity);
        this.f3129 = false;
        int i12 = f3119 + 61;
        f3121 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return;
        }
        int i13 = 66 / 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ */
    public final /* synthetic */ View mo4367(Activity activity) {
        int i10 = f3119 + 17;
        f3121 = i10 % 128;
        Activity activity2 = activity;
        if (i10 % 2 != 0) {
            m7087(activity2);
            throw null;
        }
        View viewM7087 = m7087(activity2);
        int i11 = f3121 + 107;
        f3119 = i11 % 128;
        int i12 = i11 % 2;
        return viewM7087;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ */
    public final aa mo4368() {
        ab abVar = new ab();
        int i10 = f3121 + 49;
        f3119 = i10 % 128;
        if (i10 % 2 != 0) {
            return abVar;
        }
        int i11 = 96 / 0;
        return abVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m7107(jg jgVar) {
        int i10 = f3119 + 73;
        f3121 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 29 : '4';
        this.f3132 = jgVar;
        if (c10 != '4') {
            int i11 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m7108(JSONObject jSONObject) {
        a aVar = new a(this, jSONObject);
        m7145(aVar);
        this.f3126 = aVar;
        t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f3142 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f3144;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f3143 = {'A', 2420, 4698, 6956, 9258, 11546, 14078, 16344, 18681, 20907, 23214, 25500, 28026, 30287, 32558, 34876, 37122, 'E', 2405, 4700, 6954, 9262, 11603, 14054, 16328, 18635, 20923, 23171, 25491, 28029, 30277, 32549, 34937, 37124, 39656, 41918, 44240, 46522, 48774, 51092, 53605, 55899, 58143, 60473, 62731, 65188, 19265, 16972};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f3141 = 3863225799229114647L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m7109(char c10, int i10, int i11) {
                String str;
                synchronized (d.f1675) {
                    char[] cArr = new char[i10];
                    d.f1674 = 0;
                    while (true) {
                        int i12 = d.f1674;
                        if (i12 < i10) {
                            cArr[i12] = (char) ((((long) f3143[i11 + i12]) ^ (((long) i12) * f3141)) ^ ((long) c10));
                            d.f1674 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                }
                return str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                try {
                    u uVar = u.this;
                    u.m7084(uVar, Class.forName(a.m7115(u.m7088(uVar))));
                    t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            u.this.m7101();
                        }
                    });
                    int i10 = f3144 + 57;
                    f3142 = i10 % 128;
                    int i11 = i10 % 2;
                } catch (ClassNotFoundException e10) {
                    String strIntern = m7109((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 16 - Process.getGidForName(""), KeyEvent.keyCodeFromString("")).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m7109((char) Drawable.resolveOpacity(0, 0), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                    sb2.append(a.m7115(u.m7088(u.this)));
                    sb2.append(m7109((char) ((ViewConfiguration.getTouchSlop() >> 8) + 19323), (ViewConfiguration.getEdgeSlop() >> 16) + 2, 46 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
                    sb2.append(e10.getLocalizedMessage());
                    k.m6886(strIntern, sb2.toString());
                }
            }
        });
        int i10 = f3119 + 123;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
    }
}

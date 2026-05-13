package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class kd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2989 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2990 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static WeakReference<az> f2991 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2992 = 44;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m6948(String str, String str2, Throwable th2, boolean z10) {
        int i10 = f2989 + 51;
        f2990 = i10 % 128;
        try {
            if (!(i10 % 2 == 0)) {
                m6955(str, str2, th2, z10, true);
            } else {
                m6955(str, str2, th2, z10, false);
            }
            int i11 = f2989 + 125;
            f2990 = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            int i12 = 54 / 0;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6949(az azVar) {
        f2991 = new WeakReference<>(azVar);
        int i10 = f2989 + 47;
        f2990 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6950(String str, String str2, String str3, String str4) {
        int i10 = f2990 + 97;
        f2989 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m6953(str, str2, str3, str4);
            int i12 = f2989 + 69;
            f2990 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6951(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10) {
        int i10 = f2989 + 85;
        f2990 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m6958(str, str2, str3, th2, jSONObject, false, false, z10);
            } else {
                m6958(str, str2, str3, th2, jSONObject, true, false, z10);
            }
            int i11 = f2990 + 29;
            f2989 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6952(String str, int i10, boolean z10, int i11, int i12) {
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
                cArr2[i14] = (char) (cArr2[i14] - f2992);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m6953(String str, String str2, String str3, String str4) {
        int i10;
        String string = "";
        try {
            if (TextUtils.isEmpty(str3)) {
                int i11 = f2989 + 107;
                f2990 = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m6952("\u0000", 1 - Color.blue(0), true, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 102 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            sb2.append(str);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m6952("\f\u0017\u000bￃ￨\u0015\u0015\u0012\u0015ￃ\u001a", 10 - Process.getGidForName(""), false, 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-16777079) - Color.rgb(0, 0, 0)).intern());
            sb3.append(string2);
            sb3.append(m6952("\u0006\u0004\u0013\r\b\uffbfￍ\r\u000e\b\u0013\u0000\u0011", TextUtils.getCapsMode("", 0, 0) + 13, true, 6 - TextUtils.getTrimmedLength(""), Color.alpha(0) + 141).intern());
            k.m6904(str, sb3.toString(), false);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            if (str4 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(m6952("\u0000", Color.alpha(0) + 1, true, Color.alpha(0) + 1, View.getDefaultSize(0, 0) + 54).intern());
                sb5.append(str4);
                string = sb5.toString();
                i10 = f2990 + 51;
            } else {
                i10 = f2990 + 109;
            }
            f2989 = i10 % 128;
            int i12 = i10 % 2;
            sb4.append(string);
            k.m6904(str, sb4.toString(), false);
            az azVar = f2991.get();
            if (azVar != null) {
                azVar.m4844(str, str2, string2, str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6954(String str, String str2, String str3, Throwable th2) {
        int i10 = f2990 + 17;
        f2989 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        try {
            m6959(str, str2, str3, th2, false);
            int i11 = f2990 + 121;
            f2989 = i11 % 128;
            if (i11 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6955(String str, String str2, Throwable th2, boolean z10, boolean z11) {
        int i10 = f2989 + 41;
        f2990 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m6956(str, str2, th2, z10, z11, false);
            int i12 = f2990 + 9;
            f2989 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6956(String str, String str2, Throwable th2, boolean z10, boolean z11, boolean z12) {
        int i10 = f2990;
        int i11 = i10 + 43;
        f2989 = i11 % 128;
        int i12 = i11 % 2;
        try {
            if (z10) {
                int i13 = i10 + 3;
                f2989 = i13 % 128;
                int i14 = i13 % 2;
                k.m6904(str, str2, z12);
                if ((th2 != null ? '\t' : (char) 31) == '\t') {
                    int i15 = f2990 + 49;
                    f2989 = i15 % 128;
                    k.m6900(str, ((i15 % 2 == 0 ? (char) 18 : ',') != ',' ? m6952("￤ￚ\u0013\f\t\u0001\u0014\u0005", 126 >>> Color.green(1), true, 0 / Color.argb(1, 1, 0, 1), (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)) * 18229) : m6952("￤ￚ\u0013\f\t\u0001\u0014\u0005", 8 - Color.green(0), true, Color.argb(0, 0, 0, 0) + 1, 140 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), th2, z12);
                }
            } else {
                k.m6900(str, str2, th2, z12);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6952("\u0006\u0003\u0002\u0004\fￛ\ufff5\u0013\u0002\u0004", 10 - KeyEvent.getDeadChar(0, 0), false, 6 - (ViewConfiguration.getPressedStateDuration() >> 16), 139 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            sb2.append(str);
            m6958(str, str2, sb2.toString(), th2, null, false, z11, z12);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Throwable m6957(Throwable th2) {
        while (true) {
            if (!(th2.getCause() != null)) {
                return th2;
            }
            int i10 = f2990 + 69;
            f2989 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                th2.getCause();
                throw null;
            }
            th2 = th2.getCause();
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6958(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10, boolean z11, boolean z12) {
        String string;
        int i10 = f2989 + 59;
        f2990 = i10 % 128;
        int i11 = i10 % 2;
        if (z10) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m6952("\u0000", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, Color.rgb(0, 0, 0) + 16777217, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 103).intern());
                sb2.append(str);
                string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(m6952("\uffdfￗￗ\u001c\u001b&\u001a", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, true, 2 - TextUtils.getTrimmedLength(""), 117 - View.combineMeasuredStates(0, 0)).intern());
                sb3.append(string);
                sb3.append(m6952("\u0000", '1' - AndroidCharacter.getMirror('0'), true, -TextUtils.lastIndexOf("", '0'), 86 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                k.m6900(str, sb3.toString(), th2, z12);
                int i12 = f2989 + 63;
                f2990 = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable unused) {
                return;
            }
        } else {
            string = str3;
        }
        az azVar = f2991.get();
        if ((azVar != null ? (char) 6 : 'F') != 'F') {
            azVar.m4840(str, str2, string, Log.getStackTraceString(th2), jSONObject, z11);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6959(String str, String str2, String str3, Throwable th2, boolean z10) {
        int i10 = f2990 + 57;
        f2989 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m6958(str, str2, str3, th2, null, false, false, false);
            int i12 = f2990 + 71;
            f2989 = i12 % 128;
            if ((i12 % 2 != 0 ? 'I' : '9') == 'I') {
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }
}

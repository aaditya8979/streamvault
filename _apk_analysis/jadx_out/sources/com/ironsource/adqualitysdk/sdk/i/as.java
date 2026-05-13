package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.ironsource.adqualitysdk.sdk.i.ar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class as extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f436 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f437 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f438 = {5, -1, -3, -2, 17, -2, -7, 7, 1, 14, 11, -8, 4, 14, -6, -3, -1, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f439 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f440 = 80;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f441 = -1932141098783760248L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f442 = 1649618150;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f443 = -547976072;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f444 = (int) TimeUnit.SECONDS.toMillis(120);

    public as(ax axVar) {
        m4629("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        m4630(ExpandableListView.getPackedPositionChild(0L) + 547976073, (short) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getEdgeSlop() >> 16) - 1649618049, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Process.getGidForName("") - 70).intern();
        m4596(axVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4629(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f441, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f441));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4630(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f440;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f438;
                i14 = bArr != null ? (byte) (bArr[f443 + i10] + i13) : (short) (f437[f443 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f443 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f442);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f438;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f437;
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

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m4631() {
        int i10 = f439 + 103;
        f436 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectOptJSONObject = m4593().optJSONObject(m4630((KeyEvent.getMaxKeyCode() >> 16) + 547976086, (short) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.rgb(0, 0, 0) - 1632840817, (byte) (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 78).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(m4630(547976087 - TextUtils.indexOf((CharSequence) "", '0'), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1649618049, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 79).intern(), m4630(KeyEvent.normalizeMetaState(0) + 547976072, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1649618048, (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 71).intern());
        }
        String strIntern = m4630((KeyEvent.getMaxKeyCode() >> 16) + 547976072, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 1649618049, (byte) Color.argb(0, 0, 0, 0), AndroidCharacter.getMirror('0') - 'w').intern();
        int i12 = f439 + 115;
        f436 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m4632() {
        int i10 = f439 + 39;
        f436 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectOptJSONObject = m4593().optJSONObject(m4630(TextUtils.getTrimmedLength("") + 547976086, (short) View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1649618034, (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (-77) - KeyEvent.normalizeMetaState(0)).intern());
        if (!(jSONObjectOptJSONObject == null)) {
            return jSONObjectOptJSONObject.optString(m4629("䙡㭔빜䘑璇", View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m4629("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", ExpandableListView.getPackedPositionGroup(0L)).intern());
        }
        String strIntern = m4629("\uf452戊蜎\uf422\uec64싰왱ඈ瘝䃌䑍", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern();
        int i12 = f439 + 63;
        f436 = i12 % 128;
        if ((i12 % 2 != 0 ? '>' : '\'') != '>') {
            return strIntern;
        }
        int i13 = 68 / 0;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final long m4633() {
        JSONObject jSONObjectM4593;
        int iArgb;
        int i10 = f439 + 87;
        f436 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            jSONObjectM4593 = m4593();
            iArgb = Color.argb(0, 0, 0, 0);
        } else {
            jSONObjectM4593 = m4593();
            iArgb = Color.argb(1, 0, 0, 1);
        }
        return jSONObjectM4593.optLong(m4629("祎\udfabퟰ礽噚罗隓", iArgb).intern(), 0L);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final long m4634() {
        int i10 = f436 + 15;
        f439 = i10 % 128;
        int i11 = i10 % 2;
        long jOptLong = m4593().optLong(m4630((ViewConfiguration.getScrollBarSize() >> 8) + 547976088, (short) View.resolveSize(0, 0), (-1649618033) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 79).intern(), 0L);
        int i12 = f439 + 93;
        f436 = i12 % 128;
        int i13 = i12 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final long m4635() {
        int i10 = f436 + 115;
        f439 = i10 % 128;
        int i11 = i10 % 2;
        long jOptLong = m4593().optLong(m4629("㵓\uead7宱㴧섺䨬", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern(), 0L);
        int i12 = f439 + 87;
        f436 = i12 % 128;
        if (i12 % 2 == 0) {
            return jOptLong;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m4636() {
        List<String> listM4741 = m4594().m4741();
        listM4741.addAll(jz.m6877(m4593(), m4629("ꝛ蠟鐍Ꜿꤾ姛핥", ViewConfiguration.getFadingEdgeLength() >> 16).intern(), new ArrayList()));
        int i10 = f436 + 33;
        f439 = i10 % 128;
        int i11 = i10 % 2;
        return listM4741;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m4637() {
        JSONObject jSONObjectM4593;
        String strIntern;
        int i10;
        int i11 = f436 + 49;
        f439 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 6 : 'U') != 'U') {
            jSONObjectM4593 = m4593();
            strIntern = m4629("訬向鍁詁ﶜ\uf4ef툢", TextUtils.getOffsetAfter("", 1)).intern();
            i10 = 28366;
        } else {
            jSONObjectM4593 = m4593();
            strIntern = m4629("訬向鍁詁ﶜ\uf4ef툢", TextUtils.getOffsetAfter("", 0)).intern();
            i10 = 9850;
        }
        return jSONObjectM4593.optInt(strIntern, i10);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m4638() {
        List<String> listM4749 = m4594().m4749();
        listM4749.addAll(jz.m6877(m4593(), m4630((ViewConfiguration.getPressedStateDuration() >> 16) + 547976084, (short) Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1649618049, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-77) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new ArrayList()));
        int i10 = f439 + 101;
        f436 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return listM4749;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m4639() {
        int i10 = f439 + 27;
        f436 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = m4593().optInt(m4630(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 547976083, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.getCapsMode("", 0, 0) - 1649618041, (byte) KeyEvent.keyCodeFromString(""), (-77) - View.MeasureSpec.getMode(0)).intern(), 40);
        int i12 = f436 + 33;
        f439 = i12 % 128;
        if ((i12 % 2 == 0 ? '/' : '!') == '!') {
            return iOptInt;
        }
        int i13 = 85 / 0;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m4640() {
        int i10 = f439 + 103;
        f436 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = m4593().optInt(m4630((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 547976080, (short) ((-1) - MotionEvent.axisFromString("")), (-1649618050) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) - 77).intern(), this.f444);
        int i12 = f436 + 11;
        f439 = i12 % 128;
        int i13 = i12 % 2;
        return iOptInt;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ax {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f610 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f611 = {-457421717, -799273160, -1213620397, -1665493194, 1647320155, 94469735, 870439717, -929747290, 1237502254, 1428548460, -1882424613, -1534251419, 572205935, 14213501, 459816257, -2136810292, -1339294655, -1054118288};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f612 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f613 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f614 = 1309955729595068781L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f615;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject f617;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f618;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject f619;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f616 = Arrays.asList(m4737("콘秙顸\u0fed郳䬦\uf4a7る\uf009\ue691\u1fd5빀⁊ꇄ땿ཋ皻巂誶Ꮱ", (char) View.resolveSize(0, 0), "煭글\ue5cbር", ExpandableListView.getPackedPositionGroup(0), "낢餣ト䪖").intern(), m4738(new int[]{-1249024356, 387944937, 1667702788, -1857506344, -505994536, 2045612292, 1412237121, -1997707653}, (ViewConfiguration.getScrollBarSize() >> 8) + 15).intern(), "");

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f620 = new ArrayList();

    public ax() {
        List<String> listAsList = Arrays.asList(m4738(new int[]{1037282006, -851727000, -466594494, 1697640727, -665593357, -508314119, 1202632244, -86557914, -472968136, -961437, -1617037397, -1430466431, -1435075172, 1137294224, 2041850643, -1843020853, 93217858, -1103999251, -1037528502, -2130747346}, (ViewConfiguration.getEdgeSlop() >> 16) + 37).intern(), m4737("ꅲꘇ㐏쥸蕢ﲢ㫍醓࠲⃖⯃䕹\uecfb춫\uf56c폛氄亩鐹픮烈첏ፌ\ue652娭ྵ毼멦⍮ⱕ臻沤⦋纅ে⨄\uf689‡颧\uf776ঢ", (char) (10256 - View.MeasureSpec.getMode(0)), "煭글\ue5cbር", 403751659 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\ueba8Ⴢဘ⤨").intern(), m4738(new int[]{2121817370, -1883772137, 343509877, -869074773, -1344275094, 1388629416, 1634301440, -1076355984, -11776613, -1449261561, -1043412884, 1622559962, -483269701, 374692621, -1674061776, 2144749607, 932614743, -276403438, -1377130829, 908169695, 1628811572, 2087945700}, TextUtils.lastIndexOf("", '0') + 45).intern(), m4738(new int[]{2121817370, -1883772137, 343509877, -869074773, -1344275094, 1388629416, 1634301440, -1076355984, -11776613, -1449261561, -1043412884, 1622559962, 1602175336, -480927839, 1634301440, -1076355984, -11776613, -1449261561, -442388771, 1706720338, -65660185, -1470117750, 1884230226, 182653718}, 47 - (Process.myPid() >> 22)).intern());
        this.f618 = listAsList;
        m4738(new int[]{538363, 120090708}, View.combineMeasuredStates(0, 0) + 3).intern();
        m4737("\uee47墻圡峜", (char) (KeyEvent.normalizeMetaState(0) + 31937), "煭글\ue5cbር", (-1) - TextUtils.indexOf((CharSequence) "", '0'), "櫝﵀셣䍼").intern();
        m4737("ላ鐳\u09d5", (char) (19278 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "煭글\ue5cbር", TextUtils.lastIndexOf("", '0', 0) - 816457183, "₫嗚仏﹋").intern();
        m4738(new int[]{507724656, 111826249}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3).intern();
        m4737("⎓ഏᥭ", (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 60868), "煭글\ue5cbር", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 750889794, "䍇솫쐬\udded").intern();
        m4738(new int[]{-1597631681, -708470552}, 3 - KeyEvent.normalizeMetaState(0)).intern();
        m4737("퐥ٸ蛟큻", (char) (17873 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "煭글\ue5cbር", ViewConfiguration.getEdgeSlop() >> 16, "恓Ổ퇿\udb45").intern();
        this.f619 = IronSourceVideoBridge.jsonObjectInit();
        this.f617 = IronSourceVideoBridge.jsonObjectInit();
        try {
            Iterator<String> it = listAsList.iterator();
            while (it.hasNext()) {
                this.f617.put(it.next(), m4738(new int[]{-1829915667, -1256215726}, 2 - TextUtils.indexOf("", "", 0, 0)).intern());
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m4737(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f614) ^ ((long) f613)) ^ ((long) f612));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4738(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f611.clone();
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
    public static /* synthetic */ void m4739(ax axVar, String str) {
        int i10 = f610 + 71;
        f615 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        axVar.m4740(str);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4740(String str) {
        int i10 = f610 + 97;
        f615 = i10 % 128;
        int i11 = i10 % 2;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f619 = IronSourceVideoBridge.jsonObjectInit(str);
                return;
            } catch (JSONException unused) {
            }
        }
        int i12 = f610 + 65;
        f615 = i12 % 128;
        if ((i12 % 2 != 0 ? '[' : '=') == '=') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final List<String> m4741() {
        List<String> listM6877 = jz.m6877(this.f619, m4738(new int[]{-1597631681, -708470552}, 3 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new ArrayList());
        int i10 = f610 + 121;
        f615 = i10 % 128;
        int i11 = i10 % 2;
        return listM6877;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject m4742() {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ax.f615
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ax.f610 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 34
            if (r0 != 0) goto L11
            r0 = 13
            goto L12
        L11:
            r0 = r2
        L12:
            java.lang.String r3 = ""
            r4 = 0
            if (r0 == r2) goto L38
            org.json.JSONObject r0 = r6.f619
            int[] r2 = new int[r1]
            r2 = {x0060: FILL_ARRAY_DATA , data: [-672945227, 2134819275} // fill-array
            r5 = 3
            int r3 = android.text.TextUtils.getOffsetBefore(r3, r4)
            int r5 = r5 / r3
            java.lang.String r2 = m4738(r2, r5)
            java.lang.String r2 = r2.intern()
            org.json.JSONObject r0 = r0.optJSONObject(r2)
            if (r0 != 0) goto L33
            goto L35
        L33:
            r4 = 77
        L35:
            if (r4 == 0) goto L53
            goto L55
        L38:
            org.json.JSONObject r0 = r6.f619
            int[] r2 = new int[r1]
            r2 = {x0068: FILL_ARRAY_DATA , data: [-672945227, 2134819275} // fill-array
            int r3 = android.text.TextUtils.getOffsetBefore(r3, r4)
            int r3 = 4 - r3
            java.lang.String r2 = m4738(r2, r3)
            java.lang.String r2 = r2.intern()
            org.json.JSONObject r0 = r0.optJSONObject(r2)
            if (r0 != 0) goto L55
        L53:
            org.json.JSONObject r0 = r6.f617
        L55:
            int r2 = com.ironsource.adqualitysdk.sdk.i.ax.f610
            int r2 = r2 + 73
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ax.f615 = r3
            int r2 = r2 % r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ax.m4742():org.json.JSONObject");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m4743() {
        int i10 = f610 + 85;
        f615 = i10 % 128;
        String strOptString = i10 % 2 != 0 ? this.f619.optString(m4738(new int[]{-407190185, -1033130486}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4).intern(), m4738(new int[]{-202150891, 1136499630}, Color.green(1) * 4).intern()) : this.f619.optString(m4738(new int[]{-407190185, -1033130486}, 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m4738(new int[]{-202150891, 1136499630}, 3 - Color.green(0)).intern());
        int i11 = f610 + 93;
        f615 = i11 % 128;
        int i12 = i11 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final int m4744() {
        JSONObject jSONObject;
        String strIntern;
        int i10;
        int i11 = f610 + 3;
        f615 = i11 % 128;
        if ((i11 % 2 != 0 ? '\f' : 'U') != '\f') {
            jSONObject = this.f619;
            strIntern = m4737("옣냴\uef95候", (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 60059), "煭글\ue5cbር", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "뒓ᣙ魻Ὺ").intern();
            i10 = 3000;
        } else {
            jSONObject = this.f619;
            strIntern = m4737("옣냴\uef95候", (char) ((ViewConfiguration.getEdgeSlop() >>> 121) * 60059), "煭글\ue5cbር", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "뒓ᣙ魻Ὺ").intern();
            i10 = 9541;
        }
        int iOptInt = jSONObject.optInt(strIntern, i10);
        int i12 = f615 + 25;
        f610 = i12 % 128;
        if ((i12 % 2 == 0 ? 'R' : '\r') == '\r') {
            return iOptInt;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m4745() {
        int i10 = f610 + 43;
        f615 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = this.f619.optInt(m4738(new int[]{507724656, 111826249}, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), 2);
        int i12 = f610 + 73;
        f615 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 31 : 'G') != 31) {
            return iOptInt;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4746(iz izVar) {
        m4740(izVar.m6649(m4738(new int[]{1972357021, -1605110942, -1658001066, 1321126782, 670561374, 797788038}, (ViewConfiguration.getEdgeSlop() >> 16) + 9).intern(), m4737("㻇냋뎤", (char) (55231 - KeyEvent.getDeadChar(0, 0)), "煭글\ue5cbር", 1330908246 - (ViewConfiguration.getTouchSlop() >> 8), "噂同뽏ϗ").intern(), new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4718(String str) {
                ax.m4739(ax.this, str);
            }
        }));
        int i10 = f615 + 71;
        f610 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m4747() {
        int i10 = f615 + 25;
        f610 = i10 % 128;
        int i11 = i10 % 2;
        List<String> listM6877 = jz.m6877(this.f619, m4738(new int[]{538363, 120090708}, (Process.myTid() >> 22) + 3).intern(), this.f616);
        int i12 = f615 + 73;
        f610 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return listM6877;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m4748() {
        int i10 = f615 + 115;
        f610 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = this.f619.optInt(m4737("\uee47墻圡峜", (char) (31936 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "煭글\ue5cbር", ViewConfiguration.getEdgeSlop() >> 16, "櫝﵀셣䍼").intern(), 7);
        int i12 = f610 + 101;
        f615 = i12 % 128;
        int i13 = i12 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m4749() {
        List<String> listM6877 = jz.m6877(this.f619, m4737("⎓ഏᥭ", (char) (60868 - KeyEvent.normalizeMetaState(0)), "煭글\ue5cbር", 750889795 - View.MeasureSpec.getMode(0), "䍇솫쐬\udded").intern(), new ArrayList());
        int i10 = f610 + 125;
        f615 = i10 % 128;
        int i11 = i10 % 2;
        return listM6877;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m4750() {
        JSONObject jSONObject;
        char cMakeMeasureSpec;
        int i10;
        int i11 = f610 + 69;
        f615 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 29 : (char) 17) != 17) {
            jSONObject = this.f619;
            cMakeMeasureSpec = (char) (21588 >> View.MeasureSpec.makeMeasureSpec(1, 1));
            i10 = (-816457184) >> (PointF.length(2.0f, 2.0f) > 1.0f ? 1 : (PointF.length(2.0f, 2.0f) == 1.0f ? 0 : -1));
        } else {
            jSONObject = this.f619;
            cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19278);
            i10 = (-816457184) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        }
        List<String> listM6877 = jz.m6877(jSONObject, m4737("ላ鐳\u09d5", cMakeMeasureSpec, "煭글\ue5cbር", i10, "₫嗚仏﹋").intern(), this.f620);
        int i12 = f615 + 45;
        f610 = i12 % 128;
        int i13 = i12 % 2;
        return listM6877;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class an {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f353 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f354 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f355 = 33181;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f356 = 65501;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f357 = 5973;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f358 = 9795;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final af f359;

    public an(af afVar) {
        this.f359 = afVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4530(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f355)) ^ ((c11 >>> 5) + f358)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f356) ^ ((c12 + i12) ^ ((c12 << 4) + f357))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m4531(ISAdQualitySegment iSAdQualitySegment) {
        String strIntern;
        AtomicBoolean isPaying;
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if ((!TextUtils.isEmpty(iSAdQualitySegment.getName()) ? '\r' : '\'') == '\r') {
                int i10 = f353 + 107;
                f354 = i10 % 128;
                jSONObject.put(i10 % 2 == 0 ? m4530("얛䰈싢攤", 3 / TextUtils.indexOf("", "", 1)).intern() : m4530("얛䰈싢攤", TextUtils.indexOf("", "", 0) + 4).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                int i11 = f354 + 95;
                f353 = i11 % 128;
                jSONObject.put(i11 % 2 != 0 ? m4530("⌝䟏֥굾", 2 >> Color.blue(1)).intern() : m4530("⌝䟏֥굾", 4 - Color.blue(0)).intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m4530("얛䰈\u0bc3쐍", 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                int i12 = f353 + 17;
                f354 = i12 % 128;
                jSONObject.put(i12 % 2 == 0 ? m4530("萪\udf24ﱷ燷", 5 >> View.MeasureSpec.getMode(0)).intern() : m4530("萪\udf24ﱷ燷", View.MeasureSpec.getMode(0) + 4).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                int i13 = f353 + 119;
                f354 = i13 % 128;
                if (i13 % 2 == 0) {
                    strIntern = m4530("灇\udf91ᾛ쨕", View.resolveSize(1, 1) + 4).intern();
                    isPaying = iSAdQualitySegment.getIsPaying();
                } else {
                    strIntern = m4530("灇\udf91ᾛ쨕", View.resolveSize(0, 0) + 4).intern();
                    isPaying = iSAdQualitySegment.getIsPaying();
                }
                jSONObject.put(strIntern, isPaying.get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(m4530("ᡒ䑸繷灪\uf019킔", 5 - KeyEvent.getDeadChar(0, 0)).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                jSONObject.put(m4530("愂䢼ù\ude3a", 4 - ExpandableListView.getPackedPositionGroup(0L)).intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4532(ISAdQualitySegment iSAdQualitySegment) {
        af afVar;
        int maxKeyCode;
        int i10 = f353 + 119;
        f354 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 3 : (char) 0) != 0) {
            afVar = this.f359;
            maxKeyCode = 84 / (KeyEvent.getMaxKeyCode() >>> 71);
        } else {
            afVar = this.f359;
            maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 11;
        }
        afVar.m4444(m4530("\udddd⯞풤뜮\udddd⯞ም\uf08d\u0bc3쐍\uf019킔", maxKeyCode).intern(), m4531(iSAdQualitySegment));
        int i11 = f354 + 33;
        f353 = i11 % 128;
        int i12 = i11 % 2;
    }
}

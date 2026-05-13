package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ir implements Runnable {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2612 = 6555269478949392688L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2613 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2614;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6595(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f2612);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = f2613 + 121;
        f2614 = i10 % 128;
        int i11 = i10 % 2;
        try {
            mo4352();
            int i12 = f2614 + 107;
            f2613 = i12 % 128;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            try {
                mo4716(th2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public void mo4716(Throwable th2) {
        String strIntern = m6595("ᅤ䓛먱ᆪ䟲봘႔䛚밖Ꭿ䧋뼑ኰ䣀", 21929 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6595("ᅵറ⦤䐆悎鼯믫홻\uf288ᅘഢ⦠䐧悔齚", Color.argb(0, 0, 0, 0) + 7283).intern());
        sb2.append(getClass().getName());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m6595("ᅳ諭☳쉐羇᭭", View.MeasureSpec.getSize(0) + 39857).intern());
        sb3.append(getClass().getName());
        sb3.append(m6595("ᄙ", TextUtils.getOffsetBefore("", 0) + 40627).intern());
        kd.m6954(strIntern, string, sb3.toString(), th2);
        String strIntern2 = m6595("ᅤ䓛먱ᆪ䟲봘႔䛚밖Ꭿ䧋뼑ኰ䣀", 21929 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m6595("ᅵറ⦤䐆悎鼯믫홻\uf288ᅘഢ⦠䐧悔齚", 7282 - TextUtils.lastIndexOf("", '0', 0)).intern());
        sb4.append(getClass().getName());
        k.m6886(strIntern2, sb4.toString());
        k.m6906(m6595("ᅤ䓛먱ᆪ䟲봘႔䛚밖Ꭿ䧋뼑ኰ䣀", 21928 - TextUtils.lastIndexOf("", '0', 0)).intern(), m6595("ᅴȖ㟂⢘展焓拑韟", 4930 - TextUtils.lastIndexOf("", '0', 0)).intern(), th2);
        int i10 = f2614 + 111;
        f2613 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 5 : '.') != 5) {
            return;
        }
        int i11 = 98 / 0;
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract void mo4352() throws Exception;
}

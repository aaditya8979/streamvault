package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes8.dex */
public final class fb extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2048 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2049 = 6127450403300908907L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2050 = {61316};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2051 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f2052;

    public fb(ed edVar, dm dmVar) {
        super(dmVar);
        this.f2052 = edVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6256(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2050[i10 + i12]) ^ (((long) i12) * f2049)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6256(KeyEvent.normalizeMetaState(0), (char) (TextUtils.getOffsetBefore("", 0) + 61349), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        sb2.append(this.f2052);
        String string = sb2.toString();
        int i10 = f2048 + 33;
        f2051 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        int i11 = 36 / 0;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        return new dr(Boolean.valueOf(!this.f2052.m6222(duVar, cqVar).m6167()));
    }
}

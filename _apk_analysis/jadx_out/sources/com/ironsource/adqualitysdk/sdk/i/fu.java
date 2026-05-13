package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fu extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2118 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2120 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<ed> f2122;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2121 = {37482, 40559, 35402, 46602, 40022, 36936, ';', 44215, 41138, 46231, 35031, 40114};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2119 = 657361988024863762L;

    public fu(List<ed> list) {
        this.f2122 = list;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6278(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2121[i10 + i12]) ^ (((long) i12) * f2119)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public final String toString() {
        int i10 = f2120 + 49;
        f2118 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f2122 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6278(Gravity.getAbsoluteGravity(0, 0), (char) (TextUtils.indexOf("", "", 0, 0) + 37404), Color.red(0) + 4).intern());
            sb2.append(TextUtils.join(m6278(4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (Drawable.resolveOpacity(0, 0) + 40058), AndroidCharacter.getMirror('0') - '.').intern(), this.f2122));
            sb2.append(m6278(6 - Color.red(0), (char) TextUtils.getCapsMode("", 0, 0), -((byte) KeyEvent.getModifierMetaStateMask())).intern());
            return sb2.toString();
        }
        String strIntern = m6278(7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44224), 5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        int i12 = f2120 + 113;
        f2118 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return strIntern;
        }
        int i13 = 45 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo6263(du duVar, cq cqVar) {
        List<String> listAsList;
        Iterator<ed> it = this.f2122.iterator();
        while (true) {
            ek ekVarM6191 = null;
            if (!it.hasNext()) {
                return new dr(null);
            }
            int i10 = f2120 + 115;
            f2118 = i10 % 128;
            int i11 = i10 % 2;
            ed next = it.next();
            if (!(next instanceof ek)) {
                if (next instanceof dw) {
                    ekVarM6191 = ((dw) next).m6191();
                }
            } else {
                int i12 = f2118 + 67;
                f2120 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                ekVarM6191 = (ek) next;
            }
            if ((ekVarM6191 != null ? 'V' : (char) 18) == 'V') {
                int i13 = f2118 + 83;
                f2120 = i13 % 128;
                if (i13 % 2 == 0) {
                    String[] strArr = new String[0];
                    strArr[1] = ekVarM6191.m6239();
                    listAsList = Arrays.asList(strArr);
                } else {
                    listAsList = Arrays.asList(ekVarM6191.m6239());
                }
                duVar.m6183(listAsList);
                int i14 = f2118 + 37;
                f2120 = i14 % 128;
                int i15 = i14 % 2;
            }
            next.mo6189(duVar, cqVar);
        }
    }
}

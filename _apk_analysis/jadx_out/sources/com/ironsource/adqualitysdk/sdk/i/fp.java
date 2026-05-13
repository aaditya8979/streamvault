package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class fp extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2092 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2093 = {2085519999, -1492139473, -2131290940, -103849443, -346232063, -359406762, -506696262, -279161228, -1325656340, 700295684, 1084709065, -103633191, -1702726020, -1371910201, -939529046, 1266276969, -735262711, -177359590};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2094 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f2095;

    public fp(ed edVar) {
        this.f2095 = edVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6268(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2093.clone();
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

    public boolean equals(Object obj) {
        int i10 = f2094 + 5;
        f2092 = i10 % 128;
        int i11 = i10 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj != null ? '9' : '_') == '9') {
            if ((getClass() != obj.getClass() ? 'F' : '*') == '*') {
                fp fpVar = (fp) obj;
                ed edVar = this.f2095;
                if (edVar == null) {
                    return fpVar.f2095 == null;
                }
                int i12 = f2094 + 67;
                f2092 = i12 % 128;
                int i13 = i12 % 2;
                ed edVar2 = fpVar.f2095;
                if (i13 == 0) {
                    return edVar.equals(edVar2);
                }
                edVar.equals(edVar2);
                throw null;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = f2094;
        int i11 = i10 + 77;
        f2092 = i11 % 128;
        int i12 = i11 % 2;
        ed edVar = this.f2095;
        if (edVar == null) {
            return 0;
        }
        int i13 = i10 + 77;
        f2092 = i13 % 128;
        int i14 = i13 % 2;
        return edVar.hashCode();
    }

    public String toString() {
        int i10 = f2094 + 23;
        f2092 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f2095 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f2095);
            sb2.append(m6268(new int[]{623252030, -1246887880}, TextUtils.getOffsetBefore("", 0) + 1).intern());
            return sb2.toString();
        }
        String strIntern = m6268(new int[]{623252030, -1246887880}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
        int i12 = f2094 + 51;
        f2092 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ed m6269() {
        int i10 = f2094 + 97;
        int i11 = i10 % 128;
        f2092 = i11;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        ed edVar = this.f2095;
        int i12 = i11 + 105;
        f2094 = i12 % 128;
        if ((i12 % 2 == 0 ? ';' : (char) 5) != ';') {
            return edVar;
        }
        int i13 = 69 / 0;
        return edVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public dr mo6263(du duVar, cq cqVar) {
        ed edVar = this.f2095;
        if ((edVar != null ? 'F' : (char) 3) != 3) {
            int i10 = f2094 + 51;
            f2092 = i10 % 128;
            if (i10 % 2 == 0) {
                return edVar.m6222(duVar, cqVar);
            }
            int i11 = 84 / 0;
            return edVar.m6222(duVar, cqVar);
        }
        dr drVar = new dr(null);
        int i12 = f2094 + 69;
        f2092 = i12 % 128;
        if ((i12 % 2 != 0 ? 'M' : (char) 22) == 22) {
            return drVar;
        }
        int i13 = 84 / 0;
        return drVar;
    }
}

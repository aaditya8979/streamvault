package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1954 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1955 = 163;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1956 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dm f1957;

    public ed(dm dmVar) {
        this.f1957 = dmVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6219(String str, int i10, boolean z10, int i11, int i12) {
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
                cArr2[i14] = (char) (cArr2[i14] - f1955);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m6220(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            if ((i10 < length ? 'U' : '1') == '1') {
                return sb2.toString();
            }
            int i11 = f1956 + 67;
            int i12 = i11 % 128;
            f1954 = i12;
            int i13 = i11 % 2;
            Object obj = objArr[i10];
            if (!z10) {
                int i14 = i12 + 97;
                f1956 = i14 % 128;
                int i15 = i14 % 2;
                sb2.append(m6219("\ufffa\u0006", ((Process.getThreadPriority(0) + 20) >> 6) + 2, false, -ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) + 201).intern());
            }
            if (obj instanceof String) {
                sb2.append(m6219("\u0000", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, -TextUtils.lastIndexOf("", '0', 0), 197 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                sb2.append(obj);
                sb2.append(m6219("\u0000", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, View.combineMeasuredStates(0, 0) + 1, 197 - View.resolveSizeAndState(0, 0, 0)).intern());
            } else {
                sb2.append(obj);
            }
            i10++;
            z10 = false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m6221() {
        dm dmVar = this.f1957;
        if ((dmVar != null ? '0' : 'Y') != 'Y') {
            int i10 = f1954 + 63;
            f1956 = i10 % 128;
            int i11 = i10 % 2;
            return dmVar.m6088();
        }
        int i12 = f1956 + 77;
        f1954 = i12 % 128;
        if ((i12 % 2 != 0 ? 'R' : 'a') == 'a') {
            return -1;
        }
        int i13 = 21 / 0;
        return -1;
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract dr mo6189(du duVar, cq cqVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final dr m6222(du duVar, cq cqVar) {
        dr drVarMo6189;
        ed edVar = this;
        while (true) {
            drVarMo6189 = edVar.mo6189(duVar, cqVar);
            if (!(drVarMo6189 != null)) {
                break;
            }
            int i10 = f1956 + 11;
            f1954 = i10 % 128;
            int i11 = i10 % 2;
            if ((drVarMo6189.m6165() instanceof ed ? (char) 26 : ')') == ')') {
                break;
            }
            edVar = (ed) drVarMo6189.m6165();
        }
        int i12 = f1956 + 1;
        f1954 = i12 % 128;
        int i13 = i12 % 2;
        return drVarMo6189;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r7.f1957 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(m6219("\u0017\u000f\u001e\u0012\u0019\u000eￊￊ\u000b\u001eￊ", 11 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), false, android.text.TextUtils.indexOf("", "", 0) + 7, android.graphics.ImageFormat.getBitsPerPixel(0) + 250).intern());
        r0.append(r7.f1957);
        r0 = r0.toString();
        r3 = com.ironsource.adqualitysdk.sdk.i.ed.f1954 + 19;
        com.ironsource.adqualitysdk.sdk.i.ed.f1956 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if ((r3 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r2 == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r7.f1957 != null) goto L14;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m6223() {
        /*
            r7 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ed.f1956
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ed.f1954 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            java.lang.String r3 = ""
            if (r0 == r1) goto L1a
            com.ironsource.adqualitysdk.sdk.i.dm r0 = r7.f1957
            if (r0 == 0) goto L64
            goto L21
        L1a:
            com.ironsource.adqualitysdk.sdk.i.dm r0 = r7.f1957
            r4 = 68
            int r4 = r4 / r2
            if (r0 == 0) goto L64
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r4 = r4 >> 16
            int r4 = 11 - r4
            int r3 = android.text.TextUtils.indexOf(r3, r3, r2)
            int r3 = r3 + 7
            int r5 = android.graphics.ImageFormat.getBitsPerPixel(r2)
            int r5 = r5 + 250
            java.lang.String r6 = "\u0017\u000f\u001e\u0012\u0019\u000eￊￊ\u000b\u001eￊ"
            java.lang.String r3 = m6219(r6, r4, r2, r3, r5)
            java.lang.String r3 = r3.intern()
            r0.append(r3)
            com.ironsource.adqualitysdk.sdk.i.dm r3 = r7.f1957
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r3 = com.ironsource.adqualitysdk.sdk.i.ed.f1954
            int r3 = r3 + 19
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ed.f1956 = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L5d
            r2 = r1
        L5d:
            if (r2 == r1) goto L60
            return r0
        L60:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            throw r0
        L64:
            return r3
        L65:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ed.m6223():java.lang.String");
    }
}

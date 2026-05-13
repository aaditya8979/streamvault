package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes8.dex */
public final class fm extends fi<String> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2079 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2080 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2081 = 320533002;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2082 = {0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2083 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2084 = 59;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2085 = -960068359;

    public fm(String str, dm dmVar) {
        super(dz.m6209(str), dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6265(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2084;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2082;
                i14 = bArr != null ? (byte) (bArr[f2081 + i10] + i13) : (short) (f2083[f2081 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f2081 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f2085);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f2082;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f2083;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.fi
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6265(TextUtils.lastIndexOf("", '0', 0) - 320533001, (short) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L) + 960068393, (byte) (Gravity.getAbsoluteGravity(0, 0) - 16), (-58) - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(super.toString());
        sb2.append(m6265((-320533002) - ExpandableListView.getPackedPositionGroup(0L), (short) (ViewConfiguration.getLongPressTimeout() >> 16), 960068393 - KeyEvent.normalizeMetaState(0), (byte) ((-16) - View.resolveSize(0, 0)), (-58) - ExpandableListView.getPackedPositionType(0L)).intern());
        String string = sb2.toString();
        int i10 = f2080 + 47;
        f2079 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        int i11 = 31 / 0;
        return string;
    }
}

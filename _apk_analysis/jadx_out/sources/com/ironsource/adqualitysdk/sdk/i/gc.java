package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes8.dex */
public final class gc extends gl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2165 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2166 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2167 = {5, 11, -3, 11, -20, 36, -19, 35, -36, 2, -15, -3, 6, 28, -27, -1, -3, 41, 27, -61, 7, -15, 69, -61, 7, -15, -6, 5, 11, -3, 11, -20, 4, 13, 3, 51, -55, 2, -15, -3, 6, -4, 5, -1, -3, 9, 59, -63, -2, 12, 9, 6, -1, -13, 17, -7, -11, 2, 13, 3, 0, 0};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2168 = 44;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2169 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2170 = -1709537723;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2171 = 1006258830;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6286(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2168;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2167;
                i14 = bArr != null ? (byte) (bArr[f2171 + i10] + i13) : (short) (f2169[f2171 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f2171 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f2170);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f2167;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f2169;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        bg bgVar = new bg(mo6277());
        int i10 = f2165 + 7;
        f2166 = i10 % 128;
        int i11 = i10 % 2;
        return bgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2166 + 121;
        f2165 = i10 % 128;
        String strIntern = (!(i10 % 2 == 0) ? m6286(Drawable.resolveOpacity(1, 1) - 1006258830, (short) View.resolveSize(1, 1), Gravity.getAbsoluteGravity(1, 0) * 1709537822, (byte) TextUtils.getTrimmedLength(""), 7 >>> ((Process.getThreadPriority(1) * 85) / 66)) : m6286((-1006258830) - Drawable.resolveOpacity(0, 0), (short) View.resolveSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 1709537822, (byte) TextUtils.getTrimmedLength(""), ((Process.getThreadPriority(0) + 20) >> 6) + 7)).intern();
        int i11 = f2165 + 99;
        f2166 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2166;
        int i11 = i10 + 65;
        f2165 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 83;
        f2165 = i13 % 128;
        int i14 = i13 % 2;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2165 + 17;
        f2166 = i10 % 128;
        return ((i10 % 2 == 0 ? ',' : (char) 22) != 22 ? m6286((SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)) * (-1006258779), (short) (ViewConfiguration.getJumpTapTimeout() + 58), 1709537819 << (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionType(1L), Color.alpha(0) * 118) : m6286((-1006258779) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1709537819, (byte) ExpandableListView.getPackedPositionType(0L), Color.alpha(0) - 33)).intern();
    }
}

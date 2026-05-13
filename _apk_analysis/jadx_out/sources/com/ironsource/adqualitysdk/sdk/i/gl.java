package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.jc;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2216 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2217 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2218 = 15;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2219 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2220 = {-4, -68, 1, 3, -5, 17, -2, -9, 0, -1, 12, -12, 2, -9};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2221 = 1028029097;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2222 = -1175308846;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6297(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2218;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2220;
                i14 = bArr != null ? (byte) (bArr[f2222 + i10] + i13) : (short) (f2219[f2222 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f2222 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f2221);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f2220;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f2219;
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

    /* JADX INFO: renamed from: ﻐ */
    public abstract bd mo6274();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final jc.e m6298() {
        int i10 = f2217 + 19;
        f2216 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m4559().mo4573().m4556();
            throw null;
        }
        if (!ar.m4559().mo4573().m4556()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6297(1175308846 - KeyEvent.normalizeMetaState(0), (short) View.resolveSize(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1028028998, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 16).intern());
            sb2.append(mo6277());
            return new jc.e(sb2.toString(), m6297((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1175308856, (short) View.getDefaultSize(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1028029042, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-16) - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        }
        String strM4558 = ar.m4559().mo4573().m4558(mo6277());
        if ((TextUtils.isEmpty(strM4558) ? '?' : 'B') == '?') {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m6297(1175308846 - KeyEvent.getDeadChar(0, 0), (short) (ViewConfiguration.getTouchSlop() >> 8), (-1028028998) - Gravity.getAbsoluteGravity(0, 0), (byte) (AndroidCharacter.getMirror('0') - '0'), (-16) - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb3.append(mo6277());
        jc.c cVar = new jc.c(sb3.toString(), m6297((ViewConfiguration.getFadingEdgeLength() >> 16) + 1175308857, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1028029043) - ExpandableListView.getPackedPositionChild(0L), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-17) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), strM4558);
        int i11 = f2216 + 93;
        f2217 = i11 % 128;
        int i12 = i11 % 2;
        return cVar;
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract String mo6275();

    /* JADX INFO: renamed from: ﾇ */
    public abstract Class mo6276();

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo6277();
}

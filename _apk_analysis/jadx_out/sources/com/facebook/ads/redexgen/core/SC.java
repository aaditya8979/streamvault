package com.facebook.ads.redexgen.core;

import android.net.TrafficStats;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SC implements Callable<Boolean> {
    public static byte[] A02;
    public final SB A00;
    public final /* synthetic */ SF A01;

    static {
        A02();
    }

    public SC(SF sf2, SB sb2) {
        this.A01 = sf2;
        this.A00 = sb2;
    }

    private final Boolean A00() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            C1938Kv c1938Kv = new C1938Kv(this.A00.A08, this.A00.A07, this.A00.A06, this.A00.A04 ? A01(0, 6, 72) : A01(6, 5, 72), this.A00.A02, this.A00.A05);
            c1938Kv.A04 = this.A00.A03;
            c1938Kv.A02 = this.A00.A01;
            c1938Kv.A05 = this.A00.A04;
            if (SI.A06(this.A01.A04)) {
                SF.A0F.put(this.A00.A08, c1938Kv);
            }
            return Boolean.valueOf(SF.A03(this.A01.A04.A02()).AHw(c1938Kv) != null);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, ExifInterface.MARKER_APP1, -25, -38, -43, -42, -32};
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }
}

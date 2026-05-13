package com.facebook.ads.redexgen.core;

import android.os.Process;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2132Sl implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C2503cu A00;
    public final InterfaceC2139Ss A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public C2132Sl(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C2503cu c2503cu, InterfaceC2131Sk interfaceC2131Sk) {
        this(uncaughtExceptionHandler, c2503cu, interfaceC2131Sk, AbstractC2140St.A00());
    }

    public C2132Sl(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C2503cu c2503cu, InterfaceC2131Sk interfaceC2131Sk, InterfaceC2139Ss interfaceC2139Ss) {
        this.A02 = uncaughtExceptionHandler;
        if (c2503cu == null) {
            throw new IllegalArgumentException(A00(2, 15, 29));
        }
        this.A00 = c2503cu;
        this.A03 = interfaceC2131Sk.A8z(c2503cu);
        this.A01 = interfaceC2139Ss;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -51, -102, -74, -64, -64, -74, -69, -76, 109, -112, -68, -69, -63, -78, -59, -63, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, 18, 7, 7, 9, -10, 8, 13, 4, -7, -20, -18, -37, -19, -14, -23, -34, -40, -36, -24, -35, -34};
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th2) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th2);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            String strA03 = X7.A03(this.A00, th2);
            if (!TextUtils.isEmpty(strA03) && strA03.contains(A00(17, 16, 7))) {
                Map<String, String> mapA02 = new C2130Sj(strA03, this.A03).A02();
                mapA02.put(A00(38, 7, 100), A00(33, 5, 111));
                Throwable thA00 = AbstractRunnableC2203Vg.A00();
                String strA00 = A00(45, 12, 73);
                if (thA00 == th2) {
                    mapA02.put(strA00, A00(1, 1, 108));
                } else {
                    mapA02.put(strA00, A00(0, 1, 81));
                }
                this.A01.AKM(new C2146Sz(this.A00.A09().A01(), this.A00.A09().A02(), mapA02), this.A00);
                if (U7.A24(this.A00)) {
                    U7.A0e(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th2);
    }
}

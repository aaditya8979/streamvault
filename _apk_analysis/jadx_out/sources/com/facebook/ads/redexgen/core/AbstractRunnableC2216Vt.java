package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC2216Vt implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC2206Vj> A04;
    public final C2204Vh A00;

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC2216Vt() {
        if (A03.get()) {
            this.A00 = C2221Vy.A01(new C2220Vx(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, 11, 16, 16, 31, 28, 18, 27, 94, 29, 12, 27, 31, 10, 27, 26, 80, 94, ExifInterface.START_CODE, 22, 12, 27, 31, 26, 68, 94};
    }

    public static void A04(boolean z10) {
        A03.set(z10);
    }

    public static void A05(boolean z10, InterfaceC2206Vj interfaceC2206Vj) {
        A02.set(z10);
        A04.set(interfaceC2206Vj);
    }

    public final C2204Vh A06() {
        return this.A00;
    }

    public abstract void A07();

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C2221Vy.A03(this);
            }
            try {
                A07();
            } catch (Throwable th2) {
                if (!A02.get()) {
                    throw th2;
                }
                W0.A00().AAo(3301, th2);
                InterfaceC2206Vj interfaceC2206Vj = A04.get();
                if (interfaceC2206Vj != null) {
                    interfaceC2206Vj.AHp(th2, this);
                }
            }
            if (A03.get()) {
                C2221Vy.A04(this);
            }
        } catch (Throwable th3) {
            AbstractC2208Vl.A00(th3, this);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SY<T> extends AsyncTask<Void, Void, T> {
    public static byte[] A04;
    public EnumC2122Sb A00;
    public final C2503cu A01;
    public final AbstractC2123Sc<T> A02;
    public final AbstractC2153Tg<T> A03;

    static {
        A02();
    }

    public SY(C2503cu c2503cu, AbstractC2123Sc<T> abstractC2123Sc, AbstractC2153Tg<T> abstractC2153Tg) {
        this.A02 = abstractC2123Sc;
        this.A03 = abstractC2153Tg;
        this.A01 = c2503cu;
    }

    private final T A00(Void... voidArr) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        T tA03 = null;
        try {
            try {
                tA03 = this.A02.A03();
                this.A00 = this.A02.A00();
                return tA03;
            } catch (Exception e10) {
                this.A01.A08().AAy(A01(0, 8, 89), AbstractC2142Sv.A0w, new C2143Sw(e10));
                this.A00 = EnumC2122Sb.A08;
                return tA03;
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{5, 2, 21, 2, 3, 2, 20, 6};
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        try {
            return A00(voidArr);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(T t10) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A03.A02(t10);
            } else {
                this.A03.A01(this.A00.A03(), this.A00.A04());
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}

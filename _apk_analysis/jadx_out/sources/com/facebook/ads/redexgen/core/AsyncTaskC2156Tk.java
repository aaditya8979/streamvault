package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AsyncTaskC2156Tk extends AsyncTask<Void, Void, String> {
    public static byte[] A05;
    public U3 A00;
    public final SQ A01;
    public final AbstractC2153Tg<String> A02;
    public final InterfaceC2166Tu<UP> A03;
    public final UP A04;

    static {
        A02();
    }

    public AsyncTaskC2156Tk(UP up2, AbstractC2153Tg<String> abstractC2153Tg, InterfaceC2166Tu<UP> interfaceC2166Tu, SQ sq2) {
        this.A04 = up2;
        this.A03 = interfaceC2166Tu;
        this.A02 = abstractC2153Tg;
        this.A01 = sq2;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    private final String A01(Void... voidArr) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        String string = null;
        try {
            try {
                string = UUID.randomUUID().toString();
                this.A01.A08().A9v(this.A04.A06().toString());
            } catch (U3 e10) {
                this.A00 = e10;
                this.A01.A08().AAy(A00(44, 15, 24), AbstractC2142Sv.A2N, new C2143Sw(e10));
            }
            if (TextUtils.isEmpty(this.A04.A08())) {
                return null;
            }
            if (this.A01.A05().AAF()) {
                String str = A00(29, 15, 35) + this.A04.A06().toString() + A00(0, 1, 56) + this.A04.A09().toString();
            }
            this.A03.AJW(C2212Vp.A07(this.A01, string, this.A04));
            return string;
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }

    public static void A02() {
        A05 = new byte[]{20, 89, 110, 110, 115, 110, 60, 113, 121, 111, 111, 125, 123, 121, 60, 127, 125, 114, 114, 115, 104, 60, 126, 121, 60, 114, 105, 112, 112, 99, 64, 72, 72, 70, 65, 72, 15, 74, 89, 74, 65, 91, 21, 15, 102, 113, 119, 123, 102, 112, 75, 112, 117, 96, 117, 118, 117, 103, 113};
    }

    private final void A03(String str) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A02.A02(str);
            } else {
                this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 16)));
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return null;
        }
        try {
            return A01(voidArr);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            A03(str);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}

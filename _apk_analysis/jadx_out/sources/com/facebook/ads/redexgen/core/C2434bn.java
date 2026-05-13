package com.facebook.ads.redexgen.core;

import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2434bn implements InterfaceC2128Sh {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC2127Sg A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C2125Se A01 = A00();

    static {
        A03();
    }

    public C2434bn(Context context, InterfaceC2127Sg interfaceC2127Sg) {
        this.A00 = context;
        this.A02 = interfaceC2127Sg;
    }

    private C2125Se A00() {
        return C2125Se.A00(AbstractC2201Ve.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    private void A02() {
        this.A02.ABw(new C2491ci(this));
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C2125Se c2125Se = new C2125Se(strArr, num, num2);
        if (c2125Se.equals(this.A01)) {
            return;
        }
        this.A01 = c2125Se;
        this.A03.set(true);
        AbstractC2201Ve.A00(this.A00).edit().putString(A01(0, 16, 100), this.A01.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2128Sh
    public final C2125Se A7c() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2128Sh
    public final boolean AAY() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0a = U7.A0a(this.A00);
        String strA07 = this.A01.A07();
        Iterator<String> it = setA0a.iterator();
        while (it.hasNext()) {
            if (strA07.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2128Sh
    public final boolean AJC() {
        A02();
        return this.A03.getAndSet(false);
    }
}

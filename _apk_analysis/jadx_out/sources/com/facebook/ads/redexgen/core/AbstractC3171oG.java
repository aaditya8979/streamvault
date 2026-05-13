package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3171oG<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public AbstractC3171oG() {
    }

    public /* synthetic */ AbstractC3171oG(C1662Ab c1662Ab) {
        this();
    }

    public static AbstractC3170oF<Object> A00(int i10) {
        AbstractC3018ll.A00(i10, A03(0, 12, 125));
        return new C1662Ab(i10);
    }

    public static <K0> AbstractC3170oF<K0> A01(Comparator<K0> comparator) {
        AbstractC2871jA.A04(comparator);
        return new AZ(comparator);
    }

    public static AbstractC3170oF<Comparable> A02() {
        return A01(AbstractC3185oV.A03());
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }
}

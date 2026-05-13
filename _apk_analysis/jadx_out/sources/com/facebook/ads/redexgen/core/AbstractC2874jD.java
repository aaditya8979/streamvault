package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2874jD {
    public static byte[] A00;

    static {
        A05();
    }

    public static <T> InterfaceC2872jB<T> A00(InterfaceC2872jB<? super T> interfaceC2872jB, InterfaceC2872jB<? super T> interfaceC2872jB2) {
        return new BR(A04((InterfaceC2872jB) AbstractC2871jA.A04(interfaceC2872jB), (InterfaceC2872jB) AbstractC2871jA.A04(interfaceC2872jB2)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A02(String str, Iterable<?> iterable) {
        StringBuilder sbAppend = new StringBuilder(A01(0, 11, 124)).append(str).append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sbAppend.append(',');
            }
            sbAppend.append(obj);
            z10 = false;
        }
        return sbAppend.append(')').toString();
    }

    public static <T> List<InterfaceC2872jB<? super T>> A04(InterfaceC2872jB<? super T> interfaceC2872jB, InterfaceC2872jB<? super T> interfaceC2872jB2) {
        return Arrays.asList(interfaceC2872jB, interfaceC2872jB2);
    }

    public static void A05() {
        A00 = new byte[]{59, 93, 80, 79, 84, 78, 76, 95, 80, 94, 25};
    }
}

package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class BA<F, T> extends AbstractC3185oV<F> implements Serializable {
    public static byte[] A02;
    public static String[] A03 = {"qP7uN3CTeBtugcvn4iscvs4NawNVw3hj", "uACvKKD4Xh814PQzJz7fno8Y0d2htzTr", "OaGwUL0wruZXrmXuBUYR8eOdlsWVX5jO", "JY9GX7tPgJ", "UJNVJd39Mn7RrVqRZr4HQjubetYZ2pJj", "tP9Bx5HW1SG5GbSCFf4kAQmgB2SyEv9b", "xcsG1NfXHnFrLoKWAotfCT6bqQ3ToZXO", "wDWfKnr2Hnyq67FaxNzVQD5A0FwwfXbW"};
    public static final long serialVersionUID = 0;
    public final InterfaceC2851ip<F, ? extends T> A00;
    public final AbstractC3185oV<T> A01;

    static {
        A01();
    }

    public BA(InterfaceC2851ip<F, ? extends T> interfaceC2851ip, AbstractC3185oV<T> abstractC3185oV) {
        this.A00 = (InterfaceC2851ip) AbstractC2871jA.A04(interfaceC2851ip);
        this.A01 = (AbstractC3185oV) AbstractC2871jA.A04(abstractC3185oV);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A03[1] = "UOsr4mSSP3XVk2xA78tBNfMlPB0RSTkt";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{78, 122, 59, 58, 6, 49, 39, 33, 56, 32, 27, 50, 124};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3185oV, java.util.Comparator
    public final int compare(@ParametricNullness F f10, @ParametricNullness F f11) {
        return this.A01.compare(this.A00.A43(f10), this.A00.A43(f11));
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BA)) {
            return false;
        }
        BA ba2 = (BA) obj;
        return this.A00.equals(ba2.A00) && this.A01.equals(ba2.A01);
    }

    public final int hashCode() {
        return BX.A00(this.A00, this.A01);
    }

    public final String toString() {
        return this.A01 + A00(1, 12, 81) + this.A00 + A00(0, 1, 98);
    }
}

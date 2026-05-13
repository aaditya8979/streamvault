package com.facebook.ads.redexgen.core;

import com.google.common.base.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BR<T> implements InterfaceC2872jB<T>, Serializable {
    public static byte[] A01;
    public static final long serialVersionUID = 0;
    public final List<? extends InterfaceC2872jB<? super T>> A00;

    static {
        A01();
    }

    public BR(List<? extends InterfaceC2872jB<? super T>> list) {
        this.A00 = list;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{52, 65, 55};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2872jB
    public final boolean A44(@ParametricNullness T t10) {
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            if (!this.A00.get(i10).A44(t10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof BR) {
            return this.A00.equals(((BR) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 306654252;
    }

    public final String toString() {
        return AbstractC2874jD.A02(A00(0, 3, 112), this.A00);
    }
}

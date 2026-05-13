package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class AJ<T> extends AbstractC3185oV<T> implements Serializable {
    public static byte[] A01;
    public static String[] A02 = {"TYphIuCeMUBPtejfiFOUwjFxcT4QBTq", "8HYxpO9zw1uGMW", "bftleM0W", "QbbbyMJUXm1d4Xd", "2naIPdaT", "exbXjeCkSw", "w", "Nm7"};
    public static final long serialVersionUID = 0;
    public final AbstractC3185oV<? super T> A00;

    static {
        A01();
    }

    public AJ(AbstractC3185oV<? super T> abstractC3185oV) {
        this.A00 = (AbstractC3185oV) AbstractC2871jA.A04(abstractC3185oV);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-30, 38, 25, ExifInterface.START_CODE, 25, 38, 39, 25, -36, -35};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3185oV
    public final <S extends T> AbstractC3185oV<S> A06() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3185oV, java.util.Comparator
    public final int compare(@ParametricNullness T t10, @ParametricNullness T t11) {
        return this.A00.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj != this) {
            if (obj instanceof AJ) {
                return this.A00.equals(((AJ) obj).A00);
            }
            return false;
        }
        String[] strArr = A02;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "3jzErf5H";
        strArr2[4] = "YYoE6Ooa";
        return true;
    }

    public final int hashCode() {
        return -this.A00.hashCode();
    }

    public final String toString() {
        return this.A00 + A00(0, 10, 125);
    }
}

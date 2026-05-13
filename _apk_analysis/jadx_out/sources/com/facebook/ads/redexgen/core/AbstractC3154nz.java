package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.ironsource.G5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3154nz {
    public static byte[] A00;
    public static String[] A01 = {"TjwGK8026J8LuqpHpLFvP2qkj", "KunvWIfGJHX7HbktOkm4MkD4kcFcu9wT", "QjUrIUPqRg1gsQtfLrmUPiSj1", "hJhvRorUNw8eJjUCTMSK9XaE24mC2alD", "Tu6zUEMe1bl4a7998mqTIFcXwEKbBm8m", "M1p7igLEPvcmLPbfEPVmBOai", "JVDSc2uxo9h85gcqbpEojEewGNrzMl9R", "xry660e9EuWNkwUeRbJOaxl6l4kfk7Fh"};

    static {
        A09();
    }

    public static int A00(int i10) {
        if (i10 >= 3) {
            if (i10 < 1073741824) {
                return (int) Math.ceil(((double) i10) / 0.75d);
            }
            return Integer.MAX_VALUE;
        }
        AbstractC3018ll.A00(i10, A07(2, 12, 124));
        int i11 = i10 + 1;
        if (A01[6].charAt(13) == 's') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "v9VFtcyEVV9ymySR9OVMr7RkF";
        strArr[0] = "Yfss3f07HcaF8zCrtbecDwNdH";
        return i11;
    }

    public static <K, V> Map.Entry<K, V> A01(@ParametricNullness K k10, @ParametricNullness V v10) {
        return new C1674An(k10, v10);
    }

    public static <K, V> Iterator<K> A02(Iterator<Map.Entry<K, V>> it) {
        return new C1667Ag(it);
    }

    public static <K, V> Iterator<V> A03(Iterator<Map.Entry<K, V>> it) {
        return new C1666Af(it);
    }

    public static <V> InterfaceC2851ip<Map.Entry<?, V>, V> A04() {
        EnumC1665Ae enumC1665Ae = EnumC1665Ae.A03;
        if (A01[6].charAt(13) == 's') {
            throw new RuntimeException();
        }
        A01[6] = "R0MoS7T4JZROoHrLtuxkN6DM2XkxoreU";
        return enumC1665Ae;
    }

    @CheckForNull
    public static <V> V A05(@CheckForNull Map<?, V> map, Object obj) {
        AbstractC2871jA.A04(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    @CheckForNull
    public static <V> V A06(@CheckForNull Map<?, V> map, Object obj) {
        AbstractC2871jA.A04(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A08(Map<?, ?> map) {
        StringBuilder sbAppend = AbstractC3023lq.A01(map.size()).append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                String[] strArr = A01;
                if (strArr[3].charAt(29) == strArr[7].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "LuqjCLBVeKEi1AZvZkL9PbjPH";
                strArr2[0] = "FpOiwMODSylVfNj2ewxL0FWcD";
                sbAppend.append(A07(0, 2, 121));
            }
            z10 = false;
            sbAppend.append(entry.getKey()).append(G5.T).append(entry.getValue());
        }
        return sbAppend.append('}').toString();
    }

    public static void A09() {
        A00 = new byte[]{76, 64, 0, 29, 21, 0, 6, 17, 0, 1, 54, 12, 31, 0};
        if (A01[5].length() == 3) {
            throw new RuntimeException();
        }
        A01[5] = "l4YJgmx6qI";
    }

    public static boolean A0A(@CheckForNull Map<?, ?> map, Object obj) {
        return AbstractC3115nL.A0E(A03(map.entrySet().iterator()), obj);
    }

    public static boolean A0B(@CheckForNull Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        String[] strArr = A01;
        if (strArr[4].charAt(2) == strArr[1].charAt(2)) {
            throw new RuntimeException();
        }
        A01[5] = "0gxsrdth";
        return false;
    }

    public static boolean A0C(@CheckForNull Map<?, ?> map, Object obj) {
        AbstractC2871jA.A04(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}

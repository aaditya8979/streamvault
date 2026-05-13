package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3108nE {
    @ParametricNullness
    public static <T> T A00(@ParametricNullness Iterable<? extends T> iterable, T t10) {
        return (T) AbstractC3115nL.A07(iterable.iterator(), t10);
    }

    public static <T> void A01(List<T> list, InterfaceC2872jB<? super T> interfaceC2872jB, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (interfaceC2872jB.A44(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static <T> boolean A02(Iterable<T> iterable, InterfaceC2872jB<? super T> interfaceC2872jB) {
        return AbstractC3115nL.A0C(iterable.iterator(), interfaceC2872jB);
    }

    public static <T> boolean A03(Iterable<T> iterable, InterfaceC2872jB<? super T> interfaceC2872jB) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? A04((List) iterable, (InterfaceC2872jB) AbstractC2871jA.A04(interfaceC2872jB)) : AbstractC3115nL.A0D(iterable.iterator(), interfaceC2872jB);
    }

    public static <T> boolean A04(List<T> list, InterfaceC2872jB<? super T> interfaceC2872jB) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!interfaceC2872jB.A44(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        A01(list, interfaceC2872jB, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        A01(list, interfaceC2872jB, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}

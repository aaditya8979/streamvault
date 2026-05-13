package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3209ou {
    public static byte[] A00;
    public static String[] A01 = {"QMNv5OeLi", "JpCyGMjCH0qsxjrywkKfLwsh76HDYAsW", "KBfMQLxtUMBpcerO39v", "kcWpGIrroOmjfPs85a", "Ek92TFQTKr4621X3uMn", "aSOd7mkF1z21DVbAzu", "Gro5DGcboyXTTqFPFEdSQ7qnAhBJScvW", "47M7luGjiBOnZ0iOunZSyxDazaCqRcyy"};

    static {
        A08();
    }

    public static int A00(Set<?> set) {
        int i10 = 0;
        Iterator<?> it = set.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> AbstractC3207os<E> A01(Set<? extends E> set, Set<? extends E> set2) {
        AbstractC2871jA.A05(set, A04(10, 4, 119));
        AbstractC2871jA.A05(set2, A04(14, 4, 29));
        return new AI(set, set2);
    }

    public static <E> AbstractC3207os<E> A02(Set<E> set, Set<?> set2) {
        AbstractC2871jA.A05(set, A04(10, 4, 119));
        AbstractC2871jA.A05(set2, A04(14, 4, 29));
        return new AH(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> A03(SortedSet<E> sortedSet, InterfaceC2872jB<? super E> interfaceC2872jB) {
        if (!(sortedSet instanceof AG)) {
            return new C1T((SortedSet) AbstractC2871jA.A04(sortedSet), (InterfaceC2872jB) AbstractC2871jA.A04(interfaceC2872jB));
        }
        AG ag2 = (AG) sortedSet;
        return new C1T((SortedSet) ag2.A01, AbstractC2874jD.A00(ag2.A00, interfaceC2872jB));
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static <E> HashSet<E> A05() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> A06(int i10) {
        return new HashSet<>(AbstractC3154nz.A00(i10));
    }

    public static <E> Set<E> A07(Set<E> set, InterfaceC2872jB<? super E> interfaceC2872jB) {
        if (set instanceof SortedSet) {
            return A03((SortedSet) set, interfaceC2872jB);
        }
        if (!(set instanceof AG)) {
            return new AG((Set) AbstractC2871jA.A04(set), (InterfaceC2872jB) AbstractC2871jA.A04(interfaceC2872jB));
        }
        AG ag2 = (AG) set;
        return new AG((Set) ag2.A01, AbstractC2874jD.A00(ag2.A00, interfaceC2872jB));
    }

    public static void A08() {
        A00 = new byte[]{25, 16, 25, 17, 25, 18, 8, 47, 25, 8, 121, 111, 126, 59, 19, 5, 20, 82};
    }

    public static boolean A09(@CheckForNull Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        if (A01[0].length() != 9) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "mkkUVP7U2mO33UgVMEf";
        strArr[4] = "sZqEaXQqwVxNGw5Qr8W";
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean A0A(Set<?> set, Collection<?> collection) {
        AbstractC2871jA.A04(collection);
        if (0 != 0) {
            throw new NullPointerException(A04(0, 10, 1));
        }
        if (collection instanceof Set) {
            int size = collection.size();
            int size2 = set.size();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "1Hjzr9oWssjCwBhAVsj";
            strArr[4] = "95dUReBvqcjLhc0vRoV";
            if (size > size2) {
                return AbstractC3115nL.A0F(set.iterator(), collection);
            }
        }
        Iterator<?> it = collection.iterator();
        String[] strArr2 = A01;
        if (strArr2[2].length() != strArr2[4].length()) {
            A01[1] = "sptQvlXJPhLrnOvdD6zGRYz2Tqrv0eAh";
            return A0B(set, it);
        }
        String[] strArr3 = A01;
        strArr3[2] = "FhrMChMKSM6HFLoTDqL";
        strArr3[4] = "aqz5QQGy23EnDjT9ypo";
        return A0B(set, it);
    }

    public static boolean A0B(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}

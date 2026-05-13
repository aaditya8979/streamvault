package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1672Al<E> extends AbstractC3068ma<E> implements Set<E> {
    public static byte[] A01 = null;
    public static String[] A02 = {"tpMJzZrhhsrMkwhOFEYR9GbFlaKVIskH", "YlBA8T7Fro2", "USXGP8OuBAzNSq5CbRyfQ0SKNWZdvns1", "IwkjEd2x85ogj6Hkpqc", "vhSxYEQIRpWfy1n6I2fIJfhoZxh6fLOY", "PMh9AUA5ndLdUxX8KVZJ5S1GU2oeFGKJ", "nfsou9g6KKUnvuudu0UQjvY", "janJ9NtfQ2imEKBo1ypA"};
    public static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    public transient AbstractC1673Am<E> A00;

    static {
        A0C();
    }

    public static int A03(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            AbstractC2871jA.A0E(iMax < 1073741824, A0B(18, 20, 20));
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> AbstractC1672Al<E> A04(int i10, Object... objArr) {
        Object[] objArrCopyOf = objArr;
        switch (i10) {
            case 0:
                C1W c1wA09 = A09();
                if (A02[1].length() == 11) {
                    A02[6] = "xMSzqHeYX9fl0z6G3xaNHOB";
                    return c1wA09;
                }
                break;
            case 1:
                return A0A(Objects.requireNonNull(objArrCopyOf[0]));
            default:
                int iA03 = A03(i10);
                Object[] objArr2 = new Object[iA03];
                int i11 = iA03 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object objA00 = AbstractC3181oR.A00(objArrCopyOf[i14], i14);
                    int iHashCode = objA00.hashCode();
                    int iA00 = AbstractC3062mU.A00(iHashCode);
                    while (true) {
                        int i15 = iA00 & i11;
                        Object obj = objArr2[i15];
                        if (obj == null) {
                            int i16 = i13 + 1;
                            if (A02[3].length() != 32) {
                                String[] strArr = A02;
                                strArr[0] = "Zw143axrDatzvvuiLOoxXPNJBQDLOllI";
                                strArr[2] = "imRh362HWPXwfaqxgHfljoqeqcFI5Kex";
                                objArrCopyOf[i13] = objA00;
                                objArr2[i15] = objA00;
                                i12 += iHashCode;
                                i13 = i16;
                            }
                        } else {
                            if (obj.equals(objA00)) {
                            }
                            iA00++;
                        }
                        break;
                    }
                }
                Arrays.fill(objArrCopyOf, i13, i10, (Object) null);
                if (i13 == 1) {
                    return new C1J(Objects.requireNonNull(objArrCopyOf[0]));
                }
                if (A03(i13) < iA03 / 2) {
                    return A04(i13, objArrCopyOf);
                }
                if (A0D(i13, objArrCopyOf.length)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i13);
                }
                return new C1W(objArrCopyOf, i12, objArr2, i11, i13);
        }
        throw new RuntimeException();
    }

    public static <E> AbstractC1672Al<E> A05(E e10, E e11) {
        return A04(2, e10, e11);
    }

    public static <E> AbstractC1672Al<E> A06(E e10, E e11, E e12) {
        return A04(3, e10, e11, e12);
    }

    public static <E> AbstractC1672Al<E> A07(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC1672Al) && !(collection instanceof SortedSet)) {
            AbstractC1672Al<E> abstractC1672Al = (AbstractC1672Al) collection;
            if (!abstractC1672Al.A0K()) {
                return abstractC1672Al;
            }
        }
        Object[] array = collection.toArray();
        int length = array.length;
        if (A02[3].length() == 32) {
            throw new RuntimeException();
        }
        A02[4] = "vJyPhnBCGNruVJXdAMH0mrO2J76B9Swt";
        return A04(length, array);
    }

    public static <E> AbstractC1672Al<E> A08(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return A09();
            case 1:
                C1J c1jA0A = A0A(eArr[0]);
                if (A02[3].length() == 32) {
                    throw new RuntimeException();
                }
                A02[7] = "14gyZ0VPjhYiFYlwFK2N";
                return c1jA0A;
            default:
                return A04(eArr.length, (Object[]) eArr.clone());
        }
    }

    public static <E> AbstractC1672Al<E> A09() {
        return C1W.A05;
    }

    public static <E> AbstractC1672Al<E> A0A(E e10) {
        return new C1J(e10);
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{-55, -25, ExifInterface.MARKER_EOI, -108, -57, ExifInterface.MARKER_EOI, -26, -35, -43, -32, -35, -18, ExifInterface.MARKER_EOI, -40, -70, -29, -26, ExifInterface.MARKER_APP1, -67, -55, -58, -58, -65, -67, -50, -61, -55, -56, 122, -50, -55, -55, 122, -58, -69, -52, -63, -65};
    }

    public static boolean A0D(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(A0B(0, 18, 46));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public AbstractC1673Am<E> A0J() {
        AbstractC1673Am<E> abstractC1673Am = this.A00;
        if (abstractC1673Am != null) {
            return abstractC1673Am;
        }
        AbstractC1673Am<E> abstractC1673AmA0M = A0M();
        this.A00 = abstractC1673AmA0M;
        return abstractC1673AmA0M;
    }

    public AbstractC1673Am<E> A0M() {
        return AbstractC1673Am.A06(toArray());
    }

    /* JADX INFO: renamed from: A0N */
    public abstract AbstractC3240pg<E> iterator();

    public boolean A0O() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1672Al) && A0O() && ((AbstractC1672Al) obj).A0O() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC3209ou.A09(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC3209ou.A00(this);
    }
}

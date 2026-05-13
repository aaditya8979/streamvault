package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3264q9 extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static byte[] A03;
    public static String[] A04 = {"YU1VDkaJfx0npt5ZCy0wfRWqTvB0gzrf", "HnEPzK", "p4nBQ52ikpMWjKifemE03jhF", "yEe4449S5FSBazETcjdBTZewZPLdBAWq", "Xlyhv", "2ScPcgGnYkk5iwJP9xeXeJNhXWw9hNmB", "BfGEj8ajDZOUDr9MhSeGOx8aXIdVpKot", "7ounehwY5pAPt7bmg9fcb1FAHFBm19vl"};
    public static final long serialVersionUID = 0;
    public final int A00;
    public final int A01;
    public final int[] A02;

    static {
        A03();
    }

    public C3264q9(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public C3264q9(int[] iArr, int i10, int i11) {
        this.A02 = iArr;
        this.A01 = i10;
        this.A00 = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Integer get(int i10) {
        AbstractC2871jA.A00(i10, size());
        return Integer.valueOf(this.A02[this.A01 + i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Integer set(int i10, Integer num) {
        AbstractC2871jA.A00(i10, size());
        int i11 = this.A02[this.A01 + i10];
        this.A02[this.A01 + i10] = ((Integer) AbstractC2871jA.A04(num)).intValue();
        return Integer.valueOf(i11);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-87, -99};
    }

    public final int[] A04() {
        return Arrays.copyOfRange(this.A02, this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        return (obj instanceof Integer) && AD.A05(this.A02, ((Integer) obj).intValue(), this.A01, this.A00) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z10 = obj instanceof C3264q9;
        if (A04[2].length() != 24) {
            throw new RuntimeException();
        }
        A04[2] = "hkNtVJfoNZugUfjtOIkeX8Ri";
        if (!z10) {
            return super.equals(obj);
        }
        C3264q9 c3264q9 = (C3264q9) obj;
        int size = size();
        if (c3264q9.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.A02[this.A01 + i10] != c3264q9.A02[c3264q9.A01 + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA00 = 1;
        for (int i10 = this.A01; i10 < this.A00; i10++) {
            iA00 = (iA00 * 31) + AD.A00(this.A02[i10]);
        }
        return iA00;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.A02;
        String[] strArr = A04;
        if (strArr[6].charAt(15) == strArr[5].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "lB9Ee3UdEb1Lo8jQSlnhxnRY63rogU68";
        strArr2[5] = "23HXI0mrZUyV0MEjy70kUSUiY9qLKHl0";
        int iA05 = AD.A05(iArr, ((Integer) obj).intValue(), this.A01, this.A00);
        if (iA05 >= 0) {
            return iA05 - this.A01;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        int iA06;
        if (!(obj instanceof Integer) || (iA06 = AD.A06(this.A02, ((Integer) obj).intValue(), this.A01, this.A00)) < 0) {
            return -1;
        }
        return iA06 - this.A01;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int i10, int i11) {
        AbstractC2871jA.A0B(i10, i11, size());
        return i10 == i11 ? Collections.emptyList() : new C3264q9(this.A02, this.A01 + i10, this.A01 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[').append(this.A02[this.A01]);
        for (int i10 = this.A01 + 1; i10 < this.A00; i10++) {
            sb2.append(A02(0, 2, 23)).append(this.A02[i10]);
        }
        return sb2.append(']').toString();
    }
}

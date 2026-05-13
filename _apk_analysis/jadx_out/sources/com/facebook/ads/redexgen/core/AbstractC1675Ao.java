package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1675Ao<E> extends AbstractC3067mZ<E> {
    public static byte[] A03;
    public static String[] A04 = {"emqP2Ifv15ruA3vfOBddLKXSQAhVBBiZ", "hrMd7lJ1e8dj2uYkEp7ZkSLs2D8yKDzP", "R1glWPF1KbPaEDQGu2GwL6vWIpfQR0VI", "T12dHmfXBitdOytN2RtspbU6Ik8qeuAk", "0tCJd3vKXz4Euq7T8InIHSFr9bbtNXIu", "Q", "MwChlhzfsoxh", "7ToYkJZV1iSpkxWyqnmjBpfIK3KeTcwM"};
    public int A00;
    public boolean A01;
    public Object[] A02;

    static {
        A01();
    }

    public AbstractC1675Ao(int i10) {
        AbstractC3018ll.A00(i10, A00(0, 15, 58));
        this.A02 = new Object[i10];
        this.A00 = 0;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[3].charAt(25) != 'k') {
                throw new RuntimeException();
            }
            A04[4] = "sNiI9gS6nHnAzu4lGjYMdK7Ee3tNN7Ch";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-6, -1, -6, 5, -6, -14, -3, -44, -14, 1, -14, -12, -6, 5, 10};
    }

    private void A02(int i10) {
        if (this.A02.length < i10) {
            this.A02 = Arrays.copyOf(this.A02, AbstractC3067mZ.A03(this.A02.length, i10));
            this.A01 = false;
        } else if (this.A01) {
            this.A02 = (Object[]) this.A02.clone();
            this.A01 = false;
        }
    }

    public AbstractC1675Ao<E> A03(E e10) {
        AbstractC2871jA.A04(e10);
        A02(this.A00 + 1);
        Object[] objArr = this.A02;
        int i10 = this.A00;
        this.A00 = i10 + 1;
        objArr[i10] = e10;
        return this;
    }
}

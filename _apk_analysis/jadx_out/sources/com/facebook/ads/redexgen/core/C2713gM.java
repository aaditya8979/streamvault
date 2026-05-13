package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2713gM implements Q6 {
    public static byte[] A07;
    public static String[] A08 = {"t5607oHfL2MNwmRFcsOr1jnyxzutumg5", "jNVCF7hNBx7qTlxJtSxtZf62y0YMH9ti", "vdh53KDEVDvYPF4U9zJ9CmemLfeqkfcW", "xmowDJGre", "ZTG0qcJaBRai17vkpDLZ7jbeFwjjrIPL", "kzc7Q54viT3CLivIFTQawvhHzc5bSJU6", "6m9Kb2lg4QS4P0ZcGJ2XwsRwfv4UyCAv", "gH"};
    public int A00;
    public OZ<C2053Pj> A01;
    public final InterfaceC2052Pi A02;
    public final Q7 A03;
    public final ArrayList<C2053Pj> A04;
    public final ArrayList<C2053Pj> A05;
    public final boolean A06;

    static {
        A02();
    }

    public C2713gM(InterfaceC2052Pi interfaceC2052Pi) {
        this(interfaceC2052Pi, false);
    }

    public C2713gM(InterfaceC2052Pi interfaceC2052Pi, boolean z10) {
        this.A01 = new C2725ga(30);
        this.A04 = new ArrayList<>();
        this.A05 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC2052Pi;
        this.A06 = z10;
        this.A03 = new Q7(this);
    }

    private final int A00(int i10, int i11) {
        if (i11 >= this.A05.size()) {
            return i10;
        }
        this.A05.get(i11);
        throw new NullPointerException(A01(0, 3, 126));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{23, 25, 16, 19, 2, 26, 15, 12, 2, 7};
    }

    private final void A03(List<C2053Pj> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10);
            A0A(null);
        }
        list.clear();
        if (A08[1].charAt(29) != '9') {
            throw new RuntimeException();
        }
        A08[2] = "ayjYK9F9Z6sDhNCNS52R1Qcr5XRGx639";
    }

    public final int A04(int i10) {
        return A00(i10, 0);
    }

    public final int A05(int i10) {
        if (0 >= this.A04.size()) {
            return i10;
        }
        this.A04.get(0);
        throw new NullPointerException(A01(0, 3, 126));
    }

    public final void A06() {
        if (0 >= this.A05.size()) {
            A03(this.A05);
            this.A00 = 0;
            return;
        }
        InterfaceC2052Pi interfaceC2052Pi = this.A02;
        this.A05.get(0);
        String[] strArr = A08;
        if (strArr[0].charAt(3) != strArr[4].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[0] = "Yhl0jQrdp33aIQ4Nx5XRCxKVlJRMQ99k";
        strArr2[4] = "te80aWrb7iKuE4ta48s0tNKQ3kiAwVCD";
        interfaceC2052Pi.AD2(null);
        throw null;
    }

    public final void A07() {
        A06();
        if (0 < this.A04.size()) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        A03(this.A04);
        this.A00 = 0;
    }

    public final void A08() {
        this.A03.A04(this.A04);
        if (0 < this.A04.size()) {
            this.A04.get(0);
            throw new NullPointerException(A01(0, 3, 126));
        }
        this.A04.clear();
    }

    public final void A09() {
        A03(this.A04);
        A03(this.A05);
        this.A00 = 0;
    }

    public final void A0A(C2053Pj c2053Pj) {
        if (!this.A06) {
            throw new NullPointerException(A01(3, 7, 105));
        }
    }

    public final boolean A0B() {
        return this.A04.size() > 0;
    }

    public final boolean A0C() {
        return (this.A05.isEmpty() || this.A04.isEmpty()) ? false : true;
    }

    public final boolean A0D(int i10) {
        return (this.A00 & i10) != 0;
    }
}

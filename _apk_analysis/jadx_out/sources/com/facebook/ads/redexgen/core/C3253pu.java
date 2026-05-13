package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3253pu<ModelType, StateType> {
    public static byte[] A0A;
    public static final C3253pu A0B;
    public EnumC3254pv A00;
    public EnumC3245pl A01;
    public String A02;
    public boolean A03;
    public final boolean A04;
    public final C3253pu A05;
    public final ModelType A06;
    public final StateType A07;
    public final String A08;
    public final List<ViewpointAction<ModelType, StateType>> A09;

    static {
        A02();
        A0B = new C3253pu(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A0B, false);
    }

    public C3253pu(C3255pw<ModelType, StateType> c3255pw) {
        this(c3255pw.A03, c3255pw.A04, c3255pw.A06, c3255pw.A06, c3255pw.A01 == null ? Collections.emptyList() : c3255pw.A01, c3255pw.A00, c3255pw.A02);
    }

    public C3253pu(ModelType modeltype, StateType statetype, String str, String str2, List<ViewpointAction<ModelType, StateType>> list, C3253pu c3253pu, boolean z10) {
        this.A00 = EnumC3254pv.A02;
        if (modeltype instanceof View) {
            throw new IllegalArgumentException(A01(0, 48, 2));
        }
        this.A06 = modeltype;
        this.A07 = statetype;
        this.A08 = str;
        this.A02 = str2;
        this.A05 = c3253pu;
        this.A03 = false;
        this.A09 = list;
        this.A04 = z10;
    }

    public static <ModelType, StateType> C3255pw<ModelType, StateType> A00(ModelType modeltype, StateType statetype, String str) {
        return new C3255pw<>(modeltype, statetype, str);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    public final void A03(InterfaceC3244pk interfaceC3244pk) {
        Iterator<ViewpointAction<ModelType, StateType>> it = this.A09.iterator();
        while (it.hasNext()) {
            it.next().A6J(this, interfaceC3244pk);
        }
        EnumC3245pl enumC3245plA9M = interfaceC3244pk.A9M(this);
        this.A01 = enumC3245plA9M;
        if (enumC3245plA9M == EnumC3245pl.A02) {
            this.A03 = true;
        }
    }

    public final boolean A04() {
        return this.A03;
    }
}

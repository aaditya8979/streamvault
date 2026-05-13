package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A8 implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public static String[] A09 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC3259q2 A00;
    public InterfaceC3248pp A01;
    public C3235pb A02;
    public final InterfaceC3249pq A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC3248pp A03 = new A9(this);

    static {
        A04();
        A07 = false;
    }

    public A8(ViewpointQeConfig viewpointQeConfig, InterfaceC3259q2 interfaceC3259q2, InterfaceC3249pq interfaceC3249pq) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC3259q2;
        this.A04 = interfaceC3249pq;
    }

    public static A8 A01() {
        return new A8(new ViewpointQeConfig(), new AC(), null);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    private void A05(AbstractC3251ps abstractC3251ps, InterfaceC3256px interfaceC3256px, A6 a62) {
        this.A02 = C3235pb.A00(this.A05, abstractC3251ps, interfaceC3256px, a62);
        if (0 != 0) {
            this.A02.A01(null);
        }
        this.A02.A02(this.A03);
        String[] strArr = A09;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A09[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C3257q0 c3257q0) {
        C3235pb c3235pb = this.A02;
        if (c3235pb == null || dspViewableNode == null) {
            return;
        }
        if (!this.A05.A00 || c3257q0 == null) {
            c3235pb.A03(dspViewableNode);
        } else {
            c3235pb.A04(dspViewableNode, c3257q0);
        }
    }

    private void A07(DspViewableNode dspViewableNode, C3257q0 c3257q0, C3253pu c3253pu) {
        C3235pb c3235pb = this.A02;
        if (c3235pb == null || dspViewableNode == null || c3253pu == null) {
            return;
        }
        if (!this.A05.A00 || c3257q0 == null) {
            c3235pb.A06(dspViewableNode, c3253pu);
        } else {
            c3253pu.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c3253pu.A08 + c3257q0;
            c3235pb.A05(dspViewableNode, c3257q0, c3253pu);
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    public final void A09(View view, C3253pu<?, ?> c3253pu) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c3253pu);
    }

    public final void A0A(AbstractC3251ps abstractC3251ps, View view) {
        if (abstractC3251ps == null || view == null) {
            return;
        }
        A05(abstractC3251ps, new AA(view, this.A00), new C1H(null));
    }
}

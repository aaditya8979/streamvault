package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C2529dL c2529dL, final C2172Ua c2172Ua, final AbstractC2804hy abstractC2804hy, final InterfaceC2260Xn interfaceC2260Xn, final Z5 z52, Handler handler, Z6 z62) {
        c2529dL.A0F().AAv(z52.name().toLowerCase(Locale.US));
        return abstractC2804hy.A2F() ? new Z4(c2529dL, handler, z62, abstractC2804hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2529dL c2529dL2 = c2529dL;
                C2172Ua c2172Ua2 = c2172Ua;
                InterfaceC2260Xn interfaceC2260Xn2 = interfaceC2260Xn;
                Z5 z53 = z52;
                AbstractC2804hy abstractC2804hy2 = abstractC2804hy;
                Z9.A04(c2529dL2, c2172Ua2, interfaceC2260Xn2, z53, abstractC2804hy2.A25(), abstractC2804hy2.A23());
            }
        }) : new ZA(c2529dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2529dL c2529dL2 = c2529dL;
                C2172Ua c2172Ua2 = c2172Ua;
                InterfaceC2260Xn interfaceC2260Xn2 = interfaceC2260Xn;
                Z5 z53 = z52;
                AbstractC2804hy abstractC2804hy2 = abstractC2804hy;
                Z9.A04(c2529dL2, c2172Ua2, interfaceC2260Xn2, z53, abstractC2804hy2.A25(), abstractC2804hy2.A23());
            }
        });
    }

    public static ImageView A01(C2529dL c2529dL, C2172Ua c2172Ua, AbstractC2804hy abstractC2804hy, Z5 z52, InterfaceC2260Xn interfaceC2260Xn, Handler handler) {
        return A00(c2529dL, c2172Ua, abstractC2804hy, interfaceC2260Xn, z52, handler, Z6.A03);
    }

    public static void A04(C2529dL c2529dL, C2172Ua c2172Ua, InterfaceC2260Xn interfaceC2260Xn, Z5 z52, String str, N9 n92) {
        if (c2172Ua != null) {
            c2172Ua.A04(UZ.A0A, null);
        }
        c2529dL.A0F().AAu(z52.name().toLowerCase(Locale.US));
        if (O3.A00(c2529dL.A02()).A0O(c2529dL.A02(), true)) {
            interfaceC2260Xn.AAf(str, n92);
        } else {
            if (TextUtils.isEmpty(n92.A00())) {
                return;
            }
            WN.A0O(new WN(), c2529dL, WQ.A00(n92.A00()), str);
        }
    }
}

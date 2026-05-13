package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3239pf {
    public final InterfaceC3244pk A00;
    public final String A01;
    public final Collection<C3253pu> A02;
    public final Collection<C3253pu> A03;
    public final List<Rect> A04;

    public C3239pf(String str, InterfaceC3244pk interfaceC3244pk, List<Rect> list, Collection<C3253pu> collection, Collection<C3253pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC3244pk;
        this.A04 = new ArrayList(list);
        this.A02 = collection;
        this.A03 = collection2;
    }
}

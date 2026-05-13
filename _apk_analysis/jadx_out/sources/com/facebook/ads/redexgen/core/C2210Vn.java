package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2210Vn implements InterfaceC2165Tt {
    public final List<C2170Ty> A00 = new ArrayList();
    public final boolean A01;
    public final /* synthetic */ C2209Vm A02;

    public C2210Vn(C2209Vm c2209Vm, List<C2161Tp> list, boolean z10) throws IOException {
        this.A02 = c2209Vm;
        this.A01 = z10;
        for (C2161Tp c2161Tp : list) {
            C2160To c2160ToA01 = c2161Tp.A01();
            this.A00.add(new C2170Ty(new C2158Tm(c2161Tp.A00(), c2160ToA01.A01()), c2160ToA01.A00() - c2160ToA01.A01(), c2160ToA01.A00()));
        }
    }

    public final C2170Ty A00() {
        return this.A00.get(0);
    }

    public final C2170Ty A01() {
        return this.A00.get(this.A00.size() - 1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2165Tt
    public final void A5h() throws U3 {
        this.A02.A03(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2165Tt
    public final synchronized int A6P() {
        int i10;
        i10 = 0;
        Iterator<C2170Ty> it = this.A00.iterator();
        while (it.hasNext()) {
            i10 += it.next().A01;
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2165Tt
    public final boolean ABp() {
        return this.A01;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.A06(this);
    }
}

package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1918Kb {
    public final int A00;
    public final String A01;
    public final List<C1917Ka> A02;
    public final byte[] A03;

    public C1918Kb(int i10, String str, List<C1917Ka> list, byte[] bArr) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.A03 = bArr;
    }
}

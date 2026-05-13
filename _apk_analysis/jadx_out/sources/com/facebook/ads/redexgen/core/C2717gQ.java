package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2717gQ implements PZ {
    public final /* synthetic */ C15806k A00;
    public final /* synthetic */ PU A01;

    public C2717gQ(C15806k c15806k, PU pu) {
        this.A00 = c15806k;
        this.A01 = pu;
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final Object A58(int i10) {
        PS psA00 = this.A01.A00(i10);
        if (psA00 == null) {
            return null;
        }
        return psA00.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final List<Object> A6Q(String str, int i10) {
        List<PS> listA03 = this.A01.A03(str, i10);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listA03.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listA03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final Object A6R(int i10) {
        PS psA01 = this.A01.A01(i10);
        if (psA01 == null) {
            return null;
        }
        return psA01.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final boolean AGB(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}

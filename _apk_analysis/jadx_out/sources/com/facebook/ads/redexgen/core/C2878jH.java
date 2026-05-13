package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C2878jH {
    public final int A00;
    public final BZ A01;
    public final InterfaceC2877jG A02;
    public final boolean A03;

    public C2878jH(InterfaceC2877jG interfaceC2877jG) {
        this(interfaceC2877jG, false, BZ.A03(), Integer.MAX_VALUE);
    }

    public C2878jH(InterfaceC2877jG interfaceC2877jG, boolean z10, BZ bz, int i10) {
        this.A02 = interfaceC2877jG;
        this.A03 = z10;
        this.A01 = bz;
        this.A00 = i10;
    }

    public static C2878jH A02(char c10) {
        return A03(BZ.A02(c10));
    }

    public static C2878jH A03(BZ bz) {
        AbstractC2871jA.A04(bz);
        return new C2878jH(new BK(bz));
    }

    private Iterator<String> A04(CharSequence charSequence) {
        return this.A02.AAc(this, charSequence);
    }

    public final List<String> A06(CharSequence charSequence) {
        AbstractC2871jA.A04(charSequence);
        Iterator<String> itA04 = A04(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA04.hasNext()) {
            arrayList.add(itA04.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4876j4 {
    public static InterfaceC4825h4 a(Q3 q32) {
        switch (AbstractC4851i4.f66958a[q32.f65787e.ordinal()]) {
            case 1:
                return new C4678bc();
            case 2:
                return new C4891jj();
            case 3:
                return new C4968mj();
            case 4:
                return new Dh(new Fh());
            case 5:
                return new Dh(new Vj());
            case 6:
                return new C4961mc();
            case 7:
                return new C4961mc();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

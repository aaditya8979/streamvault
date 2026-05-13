package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class D4 extends Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4 f65145a;

    public D4(C5252y4 c5252y4) {
        this.f65145a = new C4(c5252y4);
    }

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i10) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC4703cb.a(i10).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f65145a.f65089a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f65145a.f65090b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f65145a.f65091c);
        }
        return new W8(arrayList);
    }
}

package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Jl extends AbstractC5029p5 {
    public Jl(C4688bm c4688bm, C4817gm c4817gm, C4662am c4662am) {
        super(c4688bm, c4817gm, c4662am);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5029p5
    public final synchronized void a(@NonNull C4662am c4662am) {
        a(new M5(c(), C5009oa.I.v(), C5009oa.I.s(), ((C4662am) b()).mergeFrom(c4662am)));
        e();
    }
}

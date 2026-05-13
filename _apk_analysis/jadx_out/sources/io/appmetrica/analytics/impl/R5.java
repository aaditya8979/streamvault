package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class R5 extends AbstractC5152u4 {
    public R5(@NonNull String str, double d10) {
        super(2, str, Double.valueOf(d10), new C5084rb(), new C5127t4(new Hb(new C4978n4(100))));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5152u4
    public final void a(@NonNull C4819go c4819go) {
        C4870io c4870io = c4819go.f66883d;
        c4870io.f66998c = ((Double) this.f67768f).doubleValue() + c4870io.f66998c;
    }
}

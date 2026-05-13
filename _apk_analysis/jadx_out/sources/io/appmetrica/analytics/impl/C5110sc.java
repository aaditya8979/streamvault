package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5110sc extends C4723d5 {
    public C5110sc(@NonNull Context context, @NonNull R4 r42, @NonNull C5028p4 c5028p4, @NonNull W4 w42, @NonNull C4817gm c4817gm, @NonNull InterfaceC4863ih interfaceC4863ih, @NonNull ICommonExecutor iCommonExecutor, int i10, @NonNull C4944lk c4944lk, @NonNull Gb gb2, @NonNull InterfaceC5132t9 interfaceC5132t9) {
        super(context, r42, c5028p4, w42, c4817gm, interfaceC4863ih, iCommonExecutor, i10, gb2, interfaceC5132t9);
    }

    @NonNull
    public final C5065qg a(@NonNull C5061qc c5061qc) {
        C4938le c4938le = new C4938le(c5061qc);
        Objects.requireNonNull(c5061qc);
        return new C5065qg(c4938le, new C5036pc(c5061qc), c5061qc);
    }

    @Override // io.appmetrica.analytics.impl.C4723d5
    @NonNull
    public final InterfaceC5082r9 a(@NonNull InterfaceC5207w9 interfaceC5207w9, @NonNull M6 m62, @NonNull Rg rg2, @NonNull C5028p4 c5028p4, @NonNull R4 r42, @NonNull Xe xe2) {
        return this.f66581l.a(interfaceC5207w9, m62, rg2, c5028p4, r42, xe2).a();
    }
}

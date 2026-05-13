package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5090rh extends Sg {
    public C5090rh(Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        ((C4929l5) this.f65880a.f66229p).e();
        Sk sk2 = this.f65880a.f66223j;
        synchronized (sk2) {
            Ek ekB = sk2.b(q52);
            if (ekB.f65211g) {
                ekB.f65211g = false;
                Vk vk2 = ekB.f65206b;
                vk2.a(Vk.f66055i, Boolean.FALSE);
                vk2.b();
            }
            if (sk2.f65889g != 1) {
                sk2.b(sk2.f65888f, q52);
            }
            sk2.f65889g = 1;
        }
        return true;
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4831ha extends B4 {
    public C4831ha(@NotNull C5252y4 c5252y4) {
        super(c5252y4);
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NotNull Q5 q52, @NotNull C5177v4 c5177v4) {
        Bundle bundle = q52.f65800m;
        Ya ya2 = bundle != null ? (Ya) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (ya2 != null) {
            if (ya2.f66258d) {
                C5028p4 c5028p4 = c5177v4.f67805b.f68014d.f64979a;
                Boolean bool = c5028p4.f67503n;
                Boolean bool2 = c5028p4.f67498i;
                C5009oa.I.c().c(bool != null ? bool.booleanValue() : true);
                C5009oa.I.h().b(bool2);
            }
        }
        this.f65016a.a(ya2);
        return false;
    }
}

package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4664ao extends B4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F6 f66401b;

    public C4664ao(@NonNull C5252y4 c5252y4, @NonNull F6 f62) {
        super(c5252y4);
        this.f66401b = f62;
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NonNull Q5 q52, @NonNull C5177v4 c5177v4) {
        C5028p4 c5028p4 = c5177v4.f67805b.f68014d.f64979a;
        this.f66401b.a(c5028p4.f67498i);
        Lb lbM = C5009oa.I.m();
        if (Boolean.TRUE.equals(c5028p4.f67491b)) {
            lbM.a(true);
        } else {
            if (Boolean.FALSE.equals(c5028p4.f67491b)) {
                lbM.a(false);
            }
        }
        lbM.a(c5028p4.f67492c);
        Boolean bool = c5028p4.f67503n;
        C5009oa.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}

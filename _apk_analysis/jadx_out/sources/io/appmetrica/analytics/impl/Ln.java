package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* JADX INFO: loaded from: classes7.dex */
public final class Ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F3 f65545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eo f65546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f65547c;

    public Ln(Toggle toggle) {
        F3 f32 = new F3(C5009oa.k().y());
        this.f65545a = f32;
        Eo eo2 = new Eo();
        this.f65546b = eo2;
        Toggle[] toggleArr = new Toggle[3];
        toggleArr[0] = f32;
        toggleArr[1] = eo2;
        toggleArr[2] = toggle == null ? new wo() : toggle;
        this.f65547c = new ConjunctiveCompositeThreadSafeToggle(cn.w.p(toggleArr), "loc-def");
    }
}

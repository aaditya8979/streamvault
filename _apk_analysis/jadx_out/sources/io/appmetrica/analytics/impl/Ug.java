package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class Ug extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f66004b;

    public Ug(@NonNull Y4 y42, @NonNull IReporter iReporter) {
        super(y42);
        this.f66004b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        Hc hc2 = (Hc) Hc.f65312c.get(q52.f65791d);
        HashMap map = new HashMap();
        map.put("type", hc2.f65313a);
        map.put("delivery_method", hc2.f65314b);
        this.f66004b.reportEvent("crash_saved", map);
        return false;
    }
}

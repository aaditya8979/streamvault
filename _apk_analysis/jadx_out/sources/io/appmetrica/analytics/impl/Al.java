package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Al extends AbstractC5034pa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sg f64984b;

    public Al(C5116si c5116si, Sg sg2) {
        super(c5116si);
        this.f64984b = sg2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5034pa
    public final void a(@NonNull List<Sg> list) {
        list.add(this.f64984b);
    }
}

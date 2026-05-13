package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5066qh extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5166ui f67587b;

    public C5066qh(Y4 y42) {
        super(y42);
        this.f67587b = new C5166ui(new C4958m9(y42), y42);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        return this.f67587b.a(q52, new C5141ti());
    }
}

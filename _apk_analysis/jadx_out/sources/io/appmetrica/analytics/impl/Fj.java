package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class Fj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uj f65256a;

    public Fj(Uj uj2) {
        this.f65256a = uj2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        Tj tjA = ((C4782fd) this.f65256a).a();
        if (tjA != null) {
            sa2.reportEvent(tjA.f65944a, tjA.f65945b);
        }
    }
}

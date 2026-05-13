package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes.dex */
public final class Pj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f65760b;

    public Pj(String str, String str2) {
        this.f65759a = str;
        this.f65760b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportEvent(this.f65759a, this.f65760b);
    }
}

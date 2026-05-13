package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class Lj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f65542b;

    public Lj(String str, String str2) {
        this.f65541a = str;
        this.f65542b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.putAppEnvironmentValue(this.f65541a, this.f65542b);
    }
}

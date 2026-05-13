package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class Oj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65716a;

    public Oj(String str) {
        this.f65716a = str;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportEvent(this.f65716a);
    }
}

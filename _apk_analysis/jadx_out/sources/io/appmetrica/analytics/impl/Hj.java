package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class Hj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f65329b;

    public Hj(String str, byte[] bArr) {
        this.f65328a = str;
        this.f65329b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.setSessionExtra(this.f65328a, this.f65329b);
    }
}

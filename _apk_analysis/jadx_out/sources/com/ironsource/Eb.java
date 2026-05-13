package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Eb implements V5<Db> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4305vd f29259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3993e1 f29260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29261d;

    public Eb(@NotNull String str, @NotNull InterfaceC4305vd interfaceC4305vd, @NotNull InterfaceC3993e1 interfaceC3993e1, boolean z10) {
        tn.p.k(str, "adm");
        tn.p.k(interfaceC4305vd, "providerName");
        tn.p.k(interfaceC3993e1, "adapterConfigs");
        this.f29258a = str;
        this.f29259b = interfaceC4305vd;
        this.f29260c = interfaceC3993e1;
        this.f29261d = z10;
    }

    @Override // com.ironsource.V5
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Db a() throws Exception {
        InterfaceC4164n9 interfaceC4164n9A = this.f29260c.a(this.f29259b);
        new T(this.f29258a, interfaceC4164n9A, this.f29261d).a();
        if (interfaceC4164n9A != null) {
            return new Db(interfaceC4164n9A.f(), interfaceC4164n9A.e(), interfaceC4164n9A.b(), interfaceC4164n9A.d(), false, 16, null);
        }
        return null;
    }
}

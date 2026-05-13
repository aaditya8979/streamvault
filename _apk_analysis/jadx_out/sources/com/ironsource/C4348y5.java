package com.ironsource;

import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4348y5 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f34415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3995e3 f34416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f34417c;

    public C4348y5(@NotNull IronSourceError ironSourceError, @NotNull C3995e3 c3995e3, @NotNull InterfaceC4209q1 interfaceC4209q1) {
        tn.p.k(ironSourceError, "error");
        tn.p.k(c3995e3, "adLoadTaskListener");
        tn.p.k(interfaceC4209q1, "analytics");
        this.f34415a = ironSourceError;
        this.f34416b = c3995e3;
        this.f34417c = interfaceC4209q1;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f34415a;
    }

    @Override // com.ironsource.Cb
    public void start() {
        InterfaceC4082j1.c.a aVar = InterfaceC4082j1.c.f31994a;
        aVar.a().a(this.f34417c);
        aVar.a(new C4136m1.j(this.f34415a.getErrorCode()), new C4136m1.k(this.f34415a.getErrorMessage()), new C4136m1.f(0L)).a(this.f34417c);
        this.f34416b.b(this.f34415a);
    }
}

package t0;

import es.g;
import org.fourthline.cling.support.model.TransportAction;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AVTransportServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends zr.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f84589c;

    public b(@NotNull f fVar) {
        p.k(fVar, "avTransportControl");
        this.f84589c = fVar;
    }

    @Override // ds.m
    @NotNull
    public org.fourthline.cling.model.types.b[] a() {
        return new org.fourthline.cling.model.types.b[]{new org.fourthline.cling.model.types.b(0L)};
    }

    @Override // zr.a
    @NotNull
    public TransportAction[] c(@NotNull org.fourthline.cling.model.types.b bVar) {
        p.k(bVar, "instanceId");
        return this.f84589c.d();
    }

    @Override // zr.a
    @NotNull
    public es.b d(@NotNull org.fourthline.cling.model.types.b bVar) {
        p.k(bVar, "instanceId");
        return this.f84589c.f();
    }

    @Override // zr.a
    @NotNull
    public es.c e(@NotNull org.fourthline.cling.model.types.b bVar) {
        p.k(bVar, "instanceId");
        return this.f84589c.a();
    }

    @Override // zr.a
    @NotNull
    public es.d f(@NotNull org.fourthline.cling.model.types.b bVar) {
        p.k(bVar, "instanceId");
        return this.f84589c.e();
    }

    @Override // zr.a
    @NotNull
    public es.f g(@NotNull org.fourthline.cling.model.types.b bVar) {
        p.k(bVar, "instanceId");
        return this.f84589c.b();
    }

    @Override // zr.a
    @NotNull
    public g h(@NotNull org.fourthline.cling.model.types.b bVar) {
        p.k(bVar, "instanceId");
        return this.f84589c.c();
    }
}

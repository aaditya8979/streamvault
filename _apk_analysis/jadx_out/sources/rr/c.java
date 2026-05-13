package rr;

import java.net.InetAddress;

/* JADX INFO: compiled from: RemoteClientInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr.a f78934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lr.c f78935c;

    public c() {
        this(null);
    }

    public c(lr.a aVar, lr.c cVar) {
        super(cVar);
        this.f78935c = new lr.c();
        this.f78934b = aVar;
    }

    public c(org.fourthline.cling.model.message.b bVar) {
        this(bVar != null ? bVar.u() : null, bVar != null ? bVar.j() : new lr.c());
    }

    public lr.a c() {
        return this.f78934b;
    }

    public lr.c d() {
        return this.f78935c;
    }

    public InetAddress e() {
        return c().a();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Remote Address: " + e();
    }
}

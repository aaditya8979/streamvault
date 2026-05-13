package qb;

import android.util.Log;
import qr.e;
import qr.i;
import yr.c;

/* JADX INFO: compiled from: BrowseRegistryListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends yr.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f78205b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f78206a;

    @Override // yr.a, yr.g
    public void a(c cVar, i iVar) {
        l(iVar);
    }

    @Override // yr.a, yr.g
    public void c(c cVar, e eVar) {
    }

    @Override // yr.a, yr.g
    public void e(c cVar, i iVar) {
        m(iVar);
    }

    @Override // yr.a, yr.g
    public void f(c cVar, i iVar) {
    }

    @Override // yr.a, yr.g
    public void g(c cVar, e eVar) {
    }

    @Override // yr.a, yr.g
    public void i(c cVar, i iVar, Exception exc) {
        Log.e(f78205b, "remoteDeviceDiscoveryFailed device: " + iVar.o());
        m(iVar);
    }

    public final void l(qr.a aVar) {
        String str = f78205b;
        Log.e(str, "deviceAdded");
        if (!aVar.getType().equals(rb.a.f78873e)) {
            Log.e(str, "deviceAdded called, but not match");
        } else if (sb.c.a(this.f78206a)) {
            pb.b bVar = new pb.b(aVar);
            pb.c.e().a(bVar);
            this.f78206a.b(bVar);
        }
    }

    public void m(qr.a aVar) {
        pb.b bVarC;
        Log.e(f78205b, "deviceRemoved");
        if (!sb.c.a(this.f78206a) || (bVarC = pb.c.e().c(aVar)) == null) {
            return;
        }
        pb.c.e().f(bVarC);
        this.f78206a.a(bVarC);
    }
}

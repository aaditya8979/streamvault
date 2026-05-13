package oq;

import java.io.IOException;
import javax.servlet.ServletException;
import mq.i;
import mq.n;

/* JADX INFO: compiled from: ScopedHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h extends g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ThreadLocal<h> f76546s = new ThreadLocal<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f76547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f76548r;

    public abstract void C0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException;

    public abstract void D0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException;

    public boolean E0() {
        return false;
    }

    public final void F0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        h hVar = this.f76548r;
        if (hVar != null && hVar == this.f76545p) {
            hVar.C0(str, nVar, aVar, cVar);
            return;
        }
        i iVar = this.f76545p;
        if (iVar != null) {
            iVar.a0(str, nVar, aVar, cVar);
        }
    }

    public final void G0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        h hVar = this.f76548r;
        if (hVar != null) {
            hVar.D0(str, nVar, aVar, cVar);
            return;
        }
        h hVar2 = this.f76547q;
        if (hVar2 != null) {
            hVar2.C0(str, nVar, aVar, cVar);
        } else {
            C0(str, nVar, aVar, cVar);
        }
    }

    @Override // oq.g, mq.i
    public final void a0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        if (this.f76547q == null) {
            D0(str, nVar, aVar, cVar);
        } else {
            C0(str, nVar, aVar, cVar);
        }
    }

    @Override // oq.g, oq.a, uq.b, uq.a
    public void d0() throws Exception {
        try {
            ThreadLocal<h> threadLocal = f76546s;
            h hVar = threadLocal.get();
            this.f76547q = hVar;
            if (hVar == null) {
                threadLocal.set(this);
            }
            super.d0();
            this.f76548r = (h) z0(h.class);
            if (this.f76547q == null) {
                threadLocal.set(null);
            }
        } catch (Throwable th2) {
            if (this.f76547q == null) {
                f76546s.set(null);
            }
            throw th2;
        }
    }
}

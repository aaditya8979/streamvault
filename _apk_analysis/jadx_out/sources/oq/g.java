package oq;

import java.io.IOException;
import javax.servlet.ServletException;
import mq.i;
import mq.n;
import mq.p;

/* JADX INFO: compiled from: HandlerWrapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f76545p;

    public i A0() {
        return this.f76545p;
    }

    public void B0(i iVar) {
        if (isStarted()) {
            throw new IllegalStateException("STARTED");
        }
        i iVar2 = this.f76545p;
        this.f76545p = iVar;
        if (iVar != null) {
            iVar.f(b());
        }
        if (b() != null) {
            b().E0().update(this, iVar2, iVar, "handler");
        }
    }

    @Override // mq.j
    public i[] N() {
        i iVar = this.f76545p;
        return iVar == null ? new i[0] : new i[]{iVar};
    }

    public void a0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        if (this.f76545p == null || !isStarted()) {
            return;
        }
        this.f76545p.a0(str, nVar, aVar, cVar);
    }

    @Override // oq.a, uq.b, uq.a
    public void d0() throws Exception {
        i iVar = this.f76545p;
        if (iVar != null) {
            iVar.start();
        }
        super.d0();
    }

    @Override // oq.a, uq.b, uq.d
    public void destroy() {
        if (!isStopped()) {
            throw new IllegalStateException("!STOPPED");
        }
        i iVarA0 = A0();
        if (iVarA0 != null) {
            B0(null);
            iVarA0.destroy();
        }
        super.destroy();
    }

    @Override // oq.a, uq.b, uq.a
    public void e0() throws Exception {
        i iVar = this.f76545p;
        if (iVar != null) {
            iVar.stop();
        }
        super.e0();
    }

    @Override // oq.a, mq.i
    public void f(p pVar) {
        p pVarB = b();
        if (pVar == pVarB) {
            return;
        }
        if (isStarted()) {
            throw new IllegalStateException("STARTED");
        }
        super.f(pVar);
        i iVarA0 = A0();
        if (iVarA0 != null) {
            iVarA0.f(pVar);
        }
        if (pVar == null || pVar == pVarB) {
            return;
        }
        pVar.E0().update(this, (Object) null, this.f76545p, "handler");
    }

    @Override // oq.b
    public Object x0(Object obj, Class cls) {
        return y0(this.f76545p, obj, cls);
    }
}

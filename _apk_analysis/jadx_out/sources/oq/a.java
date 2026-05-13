package oq;

import java.io.IOException;
import mq.i;
import mq.p;

/* JADX INFO: compiled from: AbstractHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends uq.b implements i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final vq.c f76516o = vq.b.a(a.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f76517n;

    @Override // mq.i
    public p b() {
        return this.f76517n;
    }

    @Override // uq.b, uq.a
    public void d0() throws Exception {
        f76516o.h("starting {}", this);
        super.d0();
    }

    @Override // uq.b, uq.d
    public void destroy() {
        if (!isStopped()) {
            throw new IllegalStateException("!STOPPED");
        }
        super.destroy();
        p pVar = this.f76517n;
        if (pVar != null) {
            pVar.E0().d(this);
        }
    }

    @Override // uq.b, uq.a
    public void e0() throws Exception {
        f76516o.h("stopping {}", this);
        super.e0();
    }

    @Override // mq.i
    public void f(p pVar) {
        p pVar2 = this.f76517n;
        if (pVar2 != null && pVar2 != pVar) {
            pVar2.E0().d(this);
        }
        this.f76517n = pVar;
        if (pVar == null || pVar == pVar2) {
            return;
        }
        pVar.E0().b(this);
    }

    @Override // uq.b
    public void s0(Appendable appendable) throws IOException {
        appendable.append(toString()).append(" - ").append(f0()).append('\n');
    }
}

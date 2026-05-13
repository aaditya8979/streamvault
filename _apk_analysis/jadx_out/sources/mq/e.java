package mq;

import java.io.IOException;
import org.eclipse.jetty.http.HttpException;

/* JADX INFO: compiled from: BlockingHttpConnection.java */
/* JADX INFO: loaded from: classes12.dex */
public class e extends b {
    public static final vq.c E = vq.b.a(e.class);

    public e(f fVar, hq.k kVar, p pVar) {
        super(fVar, kVar, pVar);
    }

    @Override // mq.b
    public void E() throws Throwable {
        super.E();
    }

    @Override // hq.j
    public hq.j e() throws IOException {
        hq.k kVar;
        hq.j jVar;
        hq.j jVar2;
        try {
            b.Q(this);
            hq.j jVar3 = this;
            while (this.f63589c.isOpen() && jVar3 == this) {
                try {
                    try {
                        if (!this.f74866i.isComplete() && !this.f63589c.z()) {
                            this.f74866i.b();
                        }
                        if (this.f74870m.b() && !this.f74870m.isComplete() && !this.f63589c.x()) {
                            this.f74870m.l();
                        }
                        this.f63589c.flush();
                        if (this.f74866i.isComplete() && this.f74870m.isComplete()) {
                            P();
                            if (this.f74872o.w() == 101 && (jVar2 = (hq.j) this.f74868k.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                jVar3 = jVar2;
                            }
                            if (!this.f74870m.e() && !this.f63589c.x()) {
                                E.f("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                                this.f63589c.p();
                            }
                        }
                    } catch (HttpException e10) {
                        vq.c cVar = E;
                        if (cVar.isDebugEnabled()) {
                            cVar.h("uri=" + this.f74865h, new Object[0]);
                            cVar.h("fields=" + this.f74867j, new Object[0]);
                            cVar.b(e10);
                        }
                        this.f74870m.n(e10.getStatus(), e10.getReason(), null, true);
                        this.f74866i.reset();
                        this.f63589c.p();
                        if (this.f74866i.isComplete() && this.f74870m.isComplete()) {
                            P();
                            if (this.f74872o.w() == 101 && (jVar = (hq.j) this.f74868k.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                jVar3 = jVar;
                            }
                            if (!this.f74870m.e() && !this.f63589c.x()) {
                                cVar.f("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                                this.f63589c.p();
                            }
                        }
                        if (this.f63589c.z() && this.f74870m.p() && !this.f74868k.y().t()) {
                            kVar = this.f63589c;
                        }
                    }
                    if (this.f63589c.z() && this.f74870m.p() && !this.f74868k.y().t()) {
                        kVar = this.f63589c;
                        kVar.close();
                    }
                } finally {
                }
            }
            return jVar3;
        } finally {
            b.Q(null);
            this.f74866i.a();
            this.f74870m.a();
        }
    }
}

package dq;

import hq.k;
import java.io.IOException;
import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: BlockingHttpConnection.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final vq.c f59942t = vq.b.a(d.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f59943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public hq.d f59944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f59945s;

    public d(Buffers buffers, Buffers buffers2, k kVar) {
        super(buffers, buffers2, kVar);
        this.f59945s = false;
    }

    @Override // hq.b, hq.j
    public void a(long j10) {
        try {
            f59942t.h("onIdleExpired {}ms {} {}", Long.valueOf(j10), this, this.f63589c);
            this.f59945s = true;
            this.f63589c.close();
        } catch (IOException e10) {
            f59942t.g(e10);
            try {
                this.f63589c.close();
            } catch (IOException e11) {
                f59942t.g(e11);
            }
        }
        synchronized (this) {
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        throw new java.lang.InterruptedException();
     */
    @Override // hq.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hq.j e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.d.e():hq.j");
    }

    @Override // dq.a
    public void n(i iVar) {
        synchronized (this) {
            super.n(iVar);
            this.f59945s = true;
            notifyAll();
        }
    }

    @Override // dq.a
    public void q() throws IOException {
        this.f59943q = false;
        this.f59945s = false;
        super.q();
    }

    @Override // dq.a
    public boolean r(i iVar) throws IOException {
        boolean zR = super.r(iVar);
        if (zR) {
            synchronized (this) {
                notifyAll();
            }
        }
        return zR;
    }
}

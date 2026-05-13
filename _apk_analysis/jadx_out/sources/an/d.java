package an;

import java.io.IOException;
import zm.u;

/* JADX INFO: compiled from: HttpServletResponseWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends u implements c {
    public d(c cVar) {
        super(cVar);
    }

    @Override // an.c
    public void a(String str, String str2) {
        r().a(str, str2);
    }

    @Override // an.c
    public void d(String str, long j10) {
        r().d(str, j10);
    }

    @Override // an.c
    public void g(String str) throws IOException {
        r().g(str);
    }

    @Override // an.c
    public boolean i(String str) {
        return r().i(str);
    }

    @Override // an.c
    public void j(String str, String str2) {
        r().j(str, str2);
    }

    @Override // an.c
    public void k(int i10) {
        r().k(i10);
    }

    @Override // an.c
    public void m(int i10, String str) throws IOException {
        r().m(i10, str);
    }

    @Override // an.c
    public String n(String str) {
        return r().n(str);
    }

    @Override // an.c
    public void o(int i10) throws IOException {
        r().o(i10);
    }

    public final c r() {
        return (c) super.q();
    }
}

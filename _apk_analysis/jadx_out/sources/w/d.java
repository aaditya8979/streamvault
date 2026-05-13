package w;

import java.util.Iterator;

/* JADX INFO: compiled from: PlayComponent.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements t.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f86262a;

    public d(a aVar) {
        this.f86262a = aVar;
    }

    @Override // t.c
    public void a(int i10) {
        c cVarB = this.f86262a.B();
        if (cVarB == null || cVarB.e() == null) {
            return;
        }
        this.f86262a.g0(cVarB.e().get(i10));
    }

    @Override // t.c
    public void b() {
        a aVar = this.f86262a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // t.c
    public void c() {
        this.f86262a.i0();
    }

    @Override // t.c
    public void d() {
        a aVar = this.f86262a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // t.c
    public void e() {
        e.a().e(true);
        this.f86262a.P();
    }

    @Override // t.c
    public void f() {
        this.f86262a.f0(true);
    }

    @Override // t.c
    public void g(boolean z10) {
        if (!(z10 && this.f86262a.D() != null)) {
            Iterator<t.d> it = this.f86262a.E().iterator();
            while (it.hasNext()) {
                it.next().onDestroy();
            }
        } else {
            a aVarB = e.a().b();
            if (aVarB == null || !this.f86262a.toString().equals(aVarB.toString())) {
                return;
            }
            aVarB.T();
        }
    }
}

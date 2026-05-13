package dq;

import java.io.IOException;

/* JADX INFO: compiled from: HttpEventListenerWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f59948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59951d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hq.d f59952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hq.d f59954g;

    public h(g gVar, boolean z10) {
        this.f59948a = gVar;
        this.f59949b = z10;
        this.f59950c = z10;
    }

    @Override // dq.g
    public void a(Throwable th2) {
        if (this.f59949b) {
            this.f59948a.a(th2);
        }
    }

    @Override // dq.g
    public void b() {
        if (this.f59949b) {
            this.f59948a.b();
        }
    }

    @Override // dq.g
    public void c(hq.d dVar, hq.d dVar2) throws IOException {
        if (this.f59950c) {
            this.f59948a.c(dVar, dVar2);
        }
    }

    @Override // dq.g
    public void d() throws IOException {
        if (this.f59950c) {
            this.f59948a.d();
        }
    }

    @Override // dq.g
    public void e(hq.d dVar, int i10, hq.d dVar2) throws IOException {
        if (this.f59950c) {
            this.f59948a.e(dVar, i10, dVar2);
            return;
        }
        this.f59952e = dVar;
        this.f59953f = i10;
        this.f59954g = dVar2;
    }

    @Override // dq.g
    public void f(Throwable th2) {
        if (this.f59949b || this.f59950c) {
            this.f59948a.f(th2);
        }
    }

    @Override // dq.g
    public void g(hq.d dVar) throws IOException {
        if (this.f59950c) {
            this.f59948a.g(dVar);
        }
    }

    @Override // dq.g
    public void h() {
        if (this.f59949b || this.f59950c) {
            this.f59948a.h();
        }
    }

    @Override // dq.g
    public void i() throws IOException {
        if (this.f59949b) {
            this.f59948a.i();
        }
    }

    @Override // dq.g
    public void j() throws IOException {
        if (this.f59950c) {
            if (!this.f59951d) {
                this.f59948a.e(this.f59952e, this.f59953f, this.f59954g);
            }
            this.f59948a.j();
        }
    }

    public boolean k() {
        return this.f59950c;
    }

    public void l(boolean z10) {
        this.f59949b = z10;
    }

    public void m(boolean z10) {
        this.f59950c = z10;
    }

    @Override // dq.g
    public void onRequestComplete() throws IOException {
        if (this.f59949b) {
            this.f59948a.onRequestComplete();
        }
    }
}

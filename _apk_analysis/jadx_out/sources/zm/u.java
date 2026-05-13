package zm;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: compiled from: ServletResponseWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f98340a;

    public u(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("Response cannot be null");
        }
        this.f98340a = tVar;
    }

    @Override // zm.t
    public boolean b() {
        return this.f98340a.b();
    }

    @Override // zm.t
    public void c() {
        this.f98340a.c();
    }

    @Override // zm.t
    public n e() throws IOException {
        return this.f98340a.e();
    }

    @Override // zm.t
    public String f() {
        return this.f98340a.f();
    }

    @Override // zm.t
    public PrintWriter h() throws IOException {
        return this.f98340a.h();
    }

    @Override // zm.t
    public void l(String str) {
        this.f98340a.l(str);
    }

    @Override // zm.t
    public void p(int i10) {
        this.f98340a.p(i10);
    }

    public t q() {
        return this.f98340a;
    }
}

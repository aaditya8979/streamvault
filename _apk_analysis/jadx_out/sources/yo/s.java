package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g0 f97986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f97987b;

    public s(@NotNull g0 g0Var) {
        tn.p.k(g0Var, "writer");
        this.f97986a = g0Var;
        this.f97987b = true;
    }

    public final boolean a() {
        return this.f97987b;
    }

    public void b() {
        this.f97987b = true;
    }

    public void c() {
        this.f97987b = false;
    }

    public void d() {
        this.f97987b = false;
    }

    public void e(byte b10) {
        this.f97986a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f97986a.a(c10);
    }

    public void g(double d10) {
        this.f97986a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f97986a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f97986a.writeLong(i10);
    }

    public void j(long j10) {
        this.f97986a.writeLong(j10);
    }

    public final void k(@NotNull String str) {
        tn.p.k(str, "v");
        this.f97986a.c(str);
    }

    public void l(short s10) {
        this.f97986a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f97986a.c(String.valueOf(z10));
    }

    public void n(@NotNull String str) {
        tn.p.k(str, "value");
        this.f97986a.b(str);
    }

    public final void o(boolean z10) {
        this.f97987b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}

package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zj3 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f97637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f97638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f97639c;

    public zj3(uy uyVar) {
        this.f97637a = uyVar;
    }

    @Override // yads.yj3
    public final void a() {
        this.f97637a.a();
    }

    @Override // yads.yj3
    public final void a(float f10) {
        this.f97637a.a(f10);
    }

    @Override // yads.yj3
    public final void a(float f10, long j10) {
        this.f97637a.a(f10, j10);
    }

    @Override // yads.yj3
    public final void a(View view, List list) {
        this.f97637a.a(view, list);
        this.f97638b = false;
        this.f97639c = false;
    }

    @Override // yads.yj3
    public final void a(jf3 jf3Var) {
        this.f97637a.a(jf3Var);
        k();
    }

    @Override // yads.yj3
    public final void a(xj3 xj3Var) {
        this.f97637a.a(xj3Var);
    }

    @Override // yads.yj3
    public final void b() {
        this.f97637a.b();
        k();
    }

    @Override // yads.yj3
    public final void c() {
        this.f97637a.c();
    }

    @Override // yads.yj3
    public final void d() {
        this.f97637a.d();
    }

    @Override // yads.yj3
    public final void f() {
        this.f97637a.f();
    }

    @Override // yads.yj3
    public final void g() {
        this.f97637a.g();
        k();
    }

    @Override // yads.yj3
    public final void h() {
        if (this.f97638b) {
            return;
        }
        this.f97638b = true;
        this.f97637a.h();
    }

    @Override // yads.yj3
    public final void i() {
        this.f97637a.i();
    }

    @Override // yads.yj3
    public final void j() {
        this.f97637a.j();
    }

    @Override // yads.yj3
    public final void k() {
        this.f97637a.k();
        this.f97638b = false;
        this.f97639c = false;
    }

    @Override // yads.yj3
    public final void l() {
        this.f97637a.l();
    }

    @Override // yads.yj3
    public final void m() {
        this.f97637a.m();
        h();
        n();
    }

    @Override // yads.yj3
    public final void n() {
        if (this.f97639c) {
            return;
        }
        this.f97639c = true;
        this.f97637a.n();
    }
}

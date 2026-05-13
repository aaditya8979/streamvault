package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ks1 implements op0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final op0 f91711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h73 f91712b;

    public ks1(op0 op0Var, h73 h73Var) {
        this.f91711a = op0Var;
        this.f91712b = h73Var;
    }

    @Override // yads.op0
    public final int a(long j10, List list) {
        return this.f91711a.a(j10, list);
    }

    @Override // yads.op0
    public final int a(mx0 mx0Var) {
        return this.f91711a.a(mx0Var);
    }

    @Override // yads.op0
    public final mx0 a(int i10) {
        return this.f91711a.a(i10);
    }

    @Override // yads.op0
    public final void a() {
        this.f91711a.a();
    }

    @Override // yads.op0
    public final void a(float f10) {
        this.f91711a.a(f10);
    }

    @Override // yads.op0
    public final void a(long j10, long j11, long j12, List list, yj1[] yj1VarArr) {
        this.f91711a.a(j10, j11, j12, list, yj1VarArr);
    }

    @Override // yads.op0
    public final void a(boolean z10) {
        this.f91711a.a(z10);
    }

    @Override // yads.op0
    public final boolean a(int i10, long j10) {
        return this.f91711a.a(i10, j10);
    }

    @Override // yads.op0
    public final boolean a(long j10, cu cuVar, List list) {
        return this.f91711a.a(j10, cuVar, list);
    }

    @Override // yads.op0
    public final int b(int i10) {
        return this.f91711a.b(i10);
    }

    @Override // yads.op0
    public final h73 b() {
        return this.f91712b;
    }

    @Override // yads.op0
    public final boolean b(int i10, long j10) {
        return this.f91711a.b(i10, j10);
    }

    @Override // yads.op0
    public final int c(int i10) {
        return this.f91711a.c(i10);
    }

    @Override // yads.op0
    public final mx0 c() {
        return this.f91711a.c();
    }

    @Override // yads.op0
    public final int d() {
        return this.f91711a.d();
    }

    @Override // yads.op0
    public final void disable() {
        this.f91711a.disable();
    }

    @Override // yads.op0
    public final int e() {
        return this.f91711a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks1)) {
            return false;
        }
        ks1 ks1Var = (ks1) obj;
        return this.f91711a.equals(ks1Var.f91711a) && this.f91712b.equals(ks1Var.f91712b);
    }

    @Override // yads.op0
    public final int f() {
        return this.f91711a.f();
    }

    @Override // yads.op0
    public final Object g() {
        return this.f91711a.g();
    }

    @Override // yads.op0
    public final void h() {
        this.f91711a.h();
    }

    public final int hashCode() {
        return this.f91711a.hashCode() + ((this.f91712b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.op0
    public final void i() {
        this.f91711a.i();
    }
}

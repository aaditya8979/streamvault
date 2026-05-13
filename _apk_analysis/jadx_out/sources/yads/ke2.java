package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class ke2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw0 f91584a = new cw0();

    public final ke2 a(int i10) {
        this.f91584a.a(i10);
        return this;
    }

    public final ke2 a(le2 le2Var) {
        cw0 cw0Var = this.f91584a;
        dw0 dw0Var = le2Var.f91944b;
        cw0Var.getClass();
        for (int i10 = 0; i10 < dw0Var.f88998a.size(); i10++) {
            cw0Var.a(dw0Var.a(i10));
        }
        return this;
    }

    public final ke2 a(boolean z10, int i10) {
        cw0 cw0Var = this.f91584a;
        if (z10) {
            cw0Var.a(i10);
        } else {
            cw0Var.getClass();
        }
        return this;
    }

    public final ke2 a(int... iArr) {
        cw0 cw0Var = this.f91584a;
        cw0Var.getClass();
        for (int i10 : iArr) {
            cw0Var.a(i10);
        }
        return this;
    }

    public final le2 a() {
        return new le2(this.f91584a.a());
    }
}

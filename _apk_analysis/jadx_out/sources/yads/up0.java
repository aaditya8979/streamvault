package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class up0 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p51 f95748c;

    public up0(long j10, sm2 sm2Var) {
        this.f95747b = j10;
        this.f95748c = sm2Var;
    }

    @Override // yads.r43
    public final int a() {
        return 1;
    }

    @Override // yads.r43
    public final int a(long j10) {
        return this.f95747b > j10 ? 0 : -1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 == 0) {
            return this.f95747b;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        if (j10 >= this.f95747b) {
            return this.f95748c;
        }
        m51 m51Var = p51.f93439c;
        return sm2.f94878f;
    }
}

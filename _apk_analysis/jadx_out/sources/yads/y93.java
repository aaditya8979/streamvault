package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class y93 implements r43 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y93 f97048c = new y93();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97049b;

    public y93() {
        this.f97049b = Collections.emptyList();
    }

    public y93(o20 o20Var) {
        this.f97049b = Collections.singletonList(o20Var);
    }

    @Override // yads.r43
    public final int a() {
        return 1;
    }

    @Override // yads.r43
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        return j10 >= 0 ? this.f97049b : Collections.emptyList();
    }
}

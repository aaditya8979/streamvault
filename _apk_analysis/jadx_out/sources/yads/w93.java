package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w93 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s93 f96313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f96314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f96315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f96316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f96317f;

    public w93(s93 s93Var, HashMap map, HashMap map2, HashMap map3) {
        this.f96313b = s93Var;
        this.f96316e = map2;
        this.f96317f = map3;
        this.f96315d = Collections.unmodifiableMap(map);
        this.f96314c = s93Var.a();
    }

    @Override // yads.r43
    public final int a() {
        return this.f96314c.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f96314c, j10, false);
        if (iA < this.f96314c.length) {
            return iA;
        }
        return -1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        return this.f96314c[i10];
    }

    @Override // yads.r43
    public final List b(long j10) {
        return this.f96313b.a(j10, this.f96315d, this.f96316e, this.f96317f);
    }
}

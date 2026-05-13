package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d7 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88770a;

    public d7(List list) {
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((j7) it.next()).a();
        }
        this.f88770a = jA;
    }

    @Override // yads.u2
    public final long a() {
        return this.f88770a;
    }

    @Override // yads.u2
    public final long a(long j10) {
        return this.f88770a;
    }
}

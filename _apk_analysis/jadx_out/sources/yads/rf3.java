package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class rf3 implements qf3, sf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f94432a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f94433b = new LinkedHashSet();

    @Override // yads.sf3
    public final void a() {
        Iterator it = this.f94433b.iterator();
        while (it.hasNext()) {
            ((sf3) it.next()).a();
        }
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        Iterator it = this.f94432a.iterator();
        while (it.hasNext()) {
            ((qf3) it.next()).a(j10, j11);
        }
    }

    @Override // yads.sf3
    public final void b() {
        Iterator it = this.f94433b.iterator();
        while (it.hasNext()) {
            ((sf3) it.next()).b();
        }
    }
}

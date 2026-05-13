package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class w13 implements bg1 {
    @Override // yads.bg1
    public final void a() {
        synchronized (x13.f96601a) {
            Object obj = x13.f96602b;
            synchronized (obj) {
                if (x13.f96603c) {
                    return;
                }
                long jA = x13.a();
                synchronized (obj) {
                    x13.f96604d = jA;
                    x13.f96603c = true;
                }
            }
        }
    }

    @Override // yads.bg1
    public final void b() {
    }
}

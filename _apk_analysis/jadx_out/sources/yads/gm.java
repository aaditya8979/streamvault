package yads;

import java.util.concurrent.CopyOnWriteArrayList;
import yads.kb0;

/* JADX INFO: loaded from: classes3.dex */
public final class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f90034a = new CopyOnWriteArrayList();

    public final void a(final int i10, final long j10, final long j11) {
        for (final fm fmVar : this.f90034a) {
            if (!fmVar.f89621c) {
                fmVar.f89619a.post(new Runnable() { // from class: bt.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((kb0) fmVar.f89620b).b(i10, j10, j11);
                    }
                });
            }
        }
    }
}

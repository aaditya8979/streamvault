package xk;

import bn.r;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class m implements sn.l<Throwable, r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.g f86980b;

    public m(kotlinx.coroutines.g gVar) {
        this.f86980b = gVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            return;
        }
        this.f86980b.cancel(new CancellationException(th2.getMessage()));
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
        a(th2);
        return r.f5635a;
    }
}

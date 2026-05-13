package p000do;

import hn.c;
import io.a0;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class o2<U, T extends U> extends a0<T> implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f59877f;

    public o2(long j10, @NotNull c<? super U> cVar) {
        super(cVar.getContext(), cVar);
        this.f59877f = j10;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport
    @NotNull
    public String H0() {
        return super.H0() + "(timeMillis=" + this.f59877f + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        Z(TimeoutKt.a(this.f59877f, s0.c(getContext()), this));
    }
}

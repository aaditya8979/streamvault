package im;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: CompletableError.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c extends xl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f64324a;

    public c(Throwable th2) {
        this.f64324a = th2;
    }

    @Override // xl.a
    public void f(xl.b bVar) {
        EmptyDisposable.error(this.f64324a, bVar);
    }
}

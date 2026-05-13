package xl;

import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe;

/* JADX INFO: compiled from: Maybe.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g<T> implements i<T> {
    @Override // xl.i
    public final void b(h<? super T> hVar) {
        fm.a.e(hVar, "observer is null");
        h<? super T> hVarX = tm.a.x(this, hVar);
        fm.a.e(hVarX, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            d(hVarX);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            cm.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T c() {
        hm.f fVar = new hm.f();
        b(fVar);
        return (T) fVar.a();
    }

    public abstract void d(h<? super T> hVar);

    public final <U> g<T> e(i<U> iVar) {
        fm.a.e(iVar, "other is null");
        return tm.a.n(new MaybeTakeUntilMaybe(this, iVar));
    }
}

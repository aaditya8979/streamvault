package xl;

/* JADX INFO: compiled from: Completable.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c {
    public static a c(c... cVarArr) {
        fm.a.e(cVarArr, "sources is null");
        return cVarArr.length == 0 ? d() : cVarArr.length == 1 ? h(cVarArr[0]) : tm.a.l(new im.a(cVarArr, null));
    }

    public static a d() {
        return tm.a.l(im.b.f64323a);
    }

    public static a e(Throwable th2) {
        fm.a.e(th2, "error is null");
        return tm.a.l(new im.c(th2));
    }

    public static NullPointerException g(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    public static a h(c cVar) {
        fm.a.e(cVar, "source is null");
        return cVar instanceof a ? tm.a.l((a) cVar) : tm.a.l(new im.d(cVar));
    }

    @Override // xl.c
    public final void b(b bVar) {
        fm.a.e(bVar, "s is null");
        try {
            b bVarW = tm.a.w(this, bVar);
            fm.a.e(bVarW, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            f(bVarW);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            cm.a.b(th2);
            tm.a.s(th2);
            throw g(th2);
        }
    }

    public abstract void f(b bVar);
}

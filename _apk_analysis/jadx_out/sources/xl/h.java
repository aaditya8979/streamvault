package xl;

/* JADX INFO: compiled from: MaybeObserver.java */
/* JADX INFO: loaded from: classes3.dex */
public interface h<T> {
    void onComplete();

    void onError(Throwable th2);

    void onSubscribe(bm.b bVar);

    void onSuccess(T t10);
}

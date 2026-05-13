package ms;

/* JADX INFO: compiled from: Subscriber.java */
/* JADX INFO: loaded from: classes4.dex */
public interface b<T> {
    void onComplete();

    void onError(Throwable th2);

    void onNext(T t10);

    void onSubscribe(c cVar);
}

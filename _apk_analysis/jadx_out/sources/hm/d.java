package hm;

/* JADX INFO: compiled from: BlockingFirstObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d<T> extends c<T> {
    @Override // xl.r
    public void onError(Throwable th2) {
        if (this.f63525b == null) {
            this.f63526c = th2;
        }
        countDown();
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (this.f63525b == null) {
            this.f63525b = t10;
            this.f63527d.dispose();
            countDown();
        }
    }
}

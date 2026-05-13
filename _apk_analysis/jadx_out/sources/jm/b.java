package jm;

import io.reactivex.internal.subscriptions.EmptySubscription;

/* JADX INFO: compiled from: FlowableEmpty.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b extends xl.e<Object> implements gm.f<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xl.e<Object> f72491c = new b();

    @Override // gm.f, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // xl.e
    public void n(ms.b<? super Object> bVar) {
        EmptySubscription.complete(bVar);
    }
}

package c8;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: ListenableFuture.java */
/* JADX INFO: loaded from: classes2.dex */
public interface i<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}

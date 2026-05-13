package aq;

import androidx.databinding.ObservableList;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: AdapterReferenceCollector.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReferenceQueue<Object> f5253a = new ReferenceQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f5254b;

    /* JADX INFO: compiled from: AdapterReferenceCollector.java */
    public static class b<T, A extends aq.b<T>> extends WeakReference<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObservableList<T> f5255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ObservableList.OnListChangedCallback f5256b;

        public b(A a10, ObservableList<T> observableList, ObservableList.OnListChangedCallback onListChangedCallback) {
            super(a10, a.f5253a);
            this.f5255a = observableList;
            this.f5256b = onListChangedCallback;
        }

        public void a() {
            this.f5255a.removeOnListChangedCallback(this.f5256b);
        }
    }

    /* JADX INFO: compiled from: AdapterReferenceCollector.java */
    public static class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Reference<? extends Object> referenceRemove = a.f5253a.remove();
                    if (referenceRemove instanceof b) {
                        ((b) referenceRemove).a();
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public static <T, A extends aq.b<T>> WeakReference<A> a(A a10, ObservableList<T> observableList, ObservableList.OnListChangedCallback onListChangedCallback) {
        c cVar = f5254b;
        if (cVar == null || !cVar.isAlive()) {
            c cVar2 = new c();
            f5254b = cVar2;
            cVar2.start();
        }
        return new b(a10, observableList, onListChangedCallback);
    }
}

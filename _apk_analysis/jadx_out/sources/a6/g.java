package a6;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: EventDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<b<T>> f3544a = new CopyOnWriteArrayList<>();

    /* JADX INFO: compiled from: EventDispatcher.java */
    public interface a<T> {
        void a(T t10);
    }

    /* JADX INFO: compiled from: EventDispatcher.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f3545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f3546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3547c;

        public b(Handler handler, T t10) {
            this.f3545a = handler;
            this.f3546b = t10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(a aVar) {
            if (this.f3547c) {
                return;
            }
            aVar.a(this.f3546b);
        }

        public void c(final a<T> aVar) {
            this.f3545a.post(new Runnable() { // from class: a6.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3551b.d(aVar);
                }
            });
        }

        public void e() {
            this.f3547c = true;
        }
    }

    public void a(Handler handler, T t10) {
        a6.a.a((handler == null || t10 == null) ? false : true);
        c(t10);
        this.f3544a.add(new b<>(handler, t10));
    }

    public void b(a<T> aVar) {
        Iterator<b<T>> it = this.f3544a.iterator();
        while (it.hasNext()) {
            it.next().c(aVar);
        }
    }

    public void c(T t10) {
        for (b<T> bVar : this.f3544a) {
            if (bVar.f3546b == t10) {
                bVar.e();
                this.f3544a.remove(bVar);
            }
        }
    }
}

package s7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import s7.l;

/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f79506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f79507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<T> f79508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f79509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f79510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f79511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79512g;

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface a<T> {
        void invoke(T t10);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface b<T> {
        void a(T t10, l lVar);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f79513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l.b f79514b = new l.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f79515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f79516d;

        public c(T t10) {
            this.f79513a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f79516d) {
                return;
            }
            if (i10 != -1) {
                this.f79514b.a(i10);
            }
            this.f79515c = true;
            aVar.invoke(this.f79513a);
        }

        public void b(b<T> bVar) {
            if (this.f79516d || !this.f79515c) {
                return;
            }
            l lVarE = this.f79514b.e();
            this.f79514b = new l.b();
            this.f79515c = false;
            bVar.a(this.f79513a, lVarE);
        }

        public void c(b<T> bVar) {
            this.f79516d = true;
            if (this.f79515c) {
                this.f79515c = false;
                bVar.a(this.f79513a, this.f79514b.e());
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f79513a.equals(((c) obj).f79513a);
        }

        public int hashCode() {
            return this.f79513a.hashCode();
        }
    }

    public p(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    public p(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f79506a = dVar;
        this.f79509d = copyOnWriteArraySet;
        this.f79508c = bVar;
        this.f79510e = new ArrayDeque<>();
        this.f79511f = new ArrayDeque<>();
        this.f79507b = dVar.createHandler(looper, new Handler.Callback() { // from class: s7.n
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f79502b.g(message);
            }
        });
    }

    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        if (this.f79512g) {
            return;
        }
        s7.a.e(t10);
        this.f79509d.add(new c<>(t10));
    }

    @CheckResult
    public p<T> d(Looper looper, d dVar, b<T> bVar) {
        return new p<>(this.f79509d, looper, dVar, bVar);
    }

    @CheckResult
    public p<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f79506a, bVar);
    }

    public void f() {
        if (this.f79511f.isEmpty()) {
            return;
        }
        if (!this.f79507b.hasMessages(0)) {
            m mVar = this.f79507b;
            mVar.a(mVar.obtainMessage(0));
        }
        boolean z10 = !this.f79510e.isEmpty();
        this.f79510e.addAll(this.f79511f);
        this.f79511f.clear();
        if (z10) {
            return;
        }
        while (!this.f79510e.isEmpty()) {
            this.f79510e.peekFirst().run();
            this.f79510e.removeFirst();
        }
    }

    public final boolean g(Message message) {
        Iterator<c<T>> it = this.f79509d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f79508c);
            if (this.f79507b.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public void i(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f79509d);
        this.f79511f.add(new Runnable() { // from class: s7.o
            @Override // java.lang.Runnable
            public final void run() {
                p.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        Iterator<c<T>> it = this.f79509d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f79508c);
        }
        this.f79509d.clear();
        this.f79512g = true;
    }

    public void k(T t10) {
        for (c<T> cVar : this.f79509d) {
            if (cVar.f79513a.equals(t10)) {
                cVar.c(this.f79508c);
                this.f79509d.remove(cVar);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }
}

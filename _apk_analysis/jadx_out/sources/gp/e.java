package gp;

import fp.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Danmakus.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection<fp.c> f62728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f62729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fp.c f62730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fp.c f62731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fp.c f62732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fp.c f62733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile AtomicInteger f62734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k.a f62736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f62737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f62738k;

    public e() {
        this(0, false);
    }

    public e(int i10) {
        this(i10, false);
    }

    public e(int i10, boolean z10) {
        this(i10, z10, null);
    }

    public e(int i10, boolean z10, k.a aVar) {
        this.f62734g = new AtomicInteger(0);
        this.f62735h = 0;
        this.f62738k = new Object();
        if (i10 != 0) {
            aVar = i10 == 1 ? new k.e(z10) : i10 == 2 ? new k.f(z10) : null;
        } else if (aVar == null) {
            aVar = new k.d(z10);
        }
        if (i10 == 4) {
            this.f62728a = new LinkedList();
        } else {
            this.f62737j = z10;
            aVar.b(z10);
            this.f62728a = new TreeSet(aVar);
            this.f62736i = aVar;
        }
        this.f62735h = i10;
        this.f62734g.set(0);
    }

    public e(Collection<fp.c> collection) {
        this.f62734g = new AtomicInteger(0);
        this.f62735h = 0;
        this.f62738k = new Object();
        i(collection);
    }

    public e(boolean z10) {
        this(0, z10);
    }

    @Override // fp.k
    public boolean a(fp.c cVar) {
        if (cVar == null) {
            return false;
        }
        if (cVar.r()) {
            cVar.C(false);
        }
        synchronized (this.f62738k) {
            if (!this.f62728a.remove(cVar)) {
                return false;
            }
            this.f62734g.decrementAndGet();
            return true;
        }
    }

    @Override // fp.k
    public k b(long j10, long j11) {
        Collection<fp.c> collection = this.f62728a;
        if (collection == null || collection.size() == 0) {
            return null;
        }
        if (this.f62729b == null) {
            if (this.f62735h == 4) {
                e eVar = new e(4);
                this.f62729b = eVar;
                eVar.f62738k = this.f62738k;
                synchronized (this.f62738k) {
                    this.f62729b.i(this.f62728a);
                }
            } else {
                e eVar2 = new e(this.f62737j);
                this.f62729b = eVar2;
                eVar2.f62738k = this.f62738k;
            }
        }
        if (this.f62735h == 4) {
            return this.f62729b;
        }
        if (this.f62730c == null) {
            this.f62730c = h("start");
        }
        if (this.f62731d == null) {
            this.f62731d = h("end");
        }
        if (this.f62729b != null && j10 - this.f62730c.b() >= 0 && j11 <= this.f62731d.b()) {
            return this.f62729b;
        }
        this.f62730c.A(j10);
        this.f62731d.A(j11);
        synchronized (this.f62738k) {
            this.f62729b.i(((SortedSet) this.f62728a).subSet(this.f62730c, this.f62731d));
        }
        return this.f62729b;
    }

    @Override // fp.k
    public boolean c(fp.c cVar) {
        synchronized (this.f62738k) {
            Collection<fp.c> collection = this.f62728a;
            if (collection != null) {
                try {
                    if (collection.add(cVar)) {
                        this.f62734g.incrementAndGet();
                        return true;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return false;
        }
    }

    @Override // fp.k
    public void clear() {
        synchronized (this.f62738k) {
            Collection<fp.c> collection = this.f62728a;
            if (collection != null) {
                collection.clear();
                this.f62734g.set(0);
            }
        }
        if (this.f62729b != null) {
            this.f62729b = null;
            this.f62730c = h("start");
            this.f62731d = h("end");
        }
    }

    @Override // fp.k
    public void d(k.b<? super fp.c, ?> bVar) {
        synchronized (this.f62738k) {
            g(bVar);
        }
    }

    @Override // fp.k
    public k e(long j10, long j11) {
        Collection<fp.c> collectionJ = j(j10, j11);
        if (collectionJ == null || collectionJ.isEmpty()) {
            return null;
        }
        return new e(new LinkedList(collectionJ));
    }

    @Override // fp.k
    public boolean f(fp.c cVar) {
        Collection<fp.c> collection = this.f62728a;
        return collection != null && collection.contains(cVar);
    }

    @Override // fp.k
    public fp.c first() {
        Collection<fp.c> collection = this.f62728a;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return this.f62735h == 4 ? (fp.c) ((LinkedList) this.f62728a).peek() : (fp.c) ((SortedSet) this.f62728a).first();
    }

    @Override // fp.k
    public void g(k.b<? super fp.c, ?> bVar) {
        bVar.c();
        Iterator<fp.c> it = this.f62728a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fp.c next = it.next();
            if (next != null) {
                int iA = bVar.a(next);
                if (iA == 1) {
                    break;
                }
                if (iA == 2) {
                    it.remove();
                    this.f62734g.decrementAndGet();
                } else if (iA == 3) {
                    it.remove();
                    this.f62734g.decrementAndGet();
                    break;
                }
            }
        }
        bVar.b();
    }

    public final fp.c h(String str) {
        return new fp.d(str);
    }

    public void i(Collection<fp.c> collection) {
        if (!this.f62737j || this.f62735h == 4) {
            this.f62728a = collection;
        } else {
            synchronized (this.f62738k) {
                this.f62728a.clear();
                this.f62728a.addAll(collection);
                collection = this.f62728a;
            }
        }
        if (collection instanceof List) {
            this.f62735h = 4;
        }
        this.f62734g.set(collection == null ? 0 : collection.size());
    }

    @Override // fp.k
    public boolean isEmpty() {
        Collection<fp.c> collection = this.f62728a;
        return collection == null || collection.isEmpty();
    }

    public final Collection<fp.c> j(long j10, long j11) {
        Collection<fp.c> collection;
        if (this.f62735h == 4 || (collection = this.f62728a) == null || collection.size() == 0) {
            return null;
        }
        if (this.f62729b == null) {
            e eVar = new e(this.f62737j);
            this.f62729b = eVar;
            eVar.f62738k = this.f62738k;
        }
        if (this.f62733f == null) {
            this.f62733f = h("start");
        }
        if (this.f62732e == null) {
            this.f62732e = h("end");
        }
        this.f62733f.A(j10);
        this.f62732e.A(j11);
        return ((SortedSet) this.f62728a).subSet(this.f62733f, this.f62732e);
    }

    @Override // fp.k
    public fp.c last() {
        Collection<fp.c> collection = this.f62728a;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return this.f62735h == 4 ? (fp.c) ((LinkedList) this.f62728a).peekLast() : (fp.c) ((SortedSet) this.f62728a).last();
    }

    @Override // fp.k
    public int size() {
        return this.f62734g.get();
    }
}

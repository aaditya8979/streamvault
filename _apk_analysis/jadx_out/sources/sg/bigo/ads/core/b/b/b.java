package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f83633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f83634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f83635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f83636d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f83637e;

    public b(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        this.f83635c = aVar;
        this.f83633a = p.a(aVar.f83605a);
        this.f83634b = p.a(aVar.f83605a);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        });
    }

    public static /* synthetic */ void a(b bVar) {
        sg.bigo.ads.common.g.c.a.a(System.currentTimeMillis() - ((long) bVar.f83635c.f83607c));
        bVar.f83633a.addAll(bVar.g());
        long j10 = sg.bigo.ads.common.x.a.j();
        bVar.f83636d = j10;
        if (j10 == 0) {
            bVar.f83636d = System.currentTimeMillis();
        }
        bVar.f83637e = c.a();
        bVar.f();
    }

    private void f() {
        c cVar = this.f83637e;
        if (cVar == null || cVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f83636d;
        if (jCurrentTimeMillis - j10 >= 300000) {
            c cVar2 = this.f83637e;
            sg.bigo.ads.core.d.b.a(j10, cVar2.f83639a, cVar2.f83640b, cVar2.f83641c, cVar2.f83642d);
            this.f83636d = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            this.f83637e.c();
        }
    }

    private List<sg.bigo.ads.common.g.b.a> g() {
        return sg.bigo.ads.common.g.c.a.a(this.f83635c.a());
    }

    public final synchronized List<sg.bigo.ads.common.g.b.a> a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f83633a);
        Iterator<sg.bigo.ads.common.g.b.a> it = this.f83634b.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f83633a.clear();
        this.f83634b.addAll(arrayList);
        return arrayList;
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z10) {
        this.f83634b.removeAll(list);
        if (!z10) {
            this.f83633a.addAll(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<sg.bigo.ads.common.g.b.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().f82121a));
        }
        sg.bigo.ads.common.g.c.a.a(arrayList);
    }

    public final synchronized void a(sg.bigo.ads.common.g.b.a aVar) {
        this.f83633a.add(aVar);
        aVar.f82121a = sg.bigo.ads.common.g.c.a.a(aVar);
        f();
        this.f83637e.a(aVar.f82122b);
    }

    public final synchronized int b() {
        return this.f83633a.size();
    }

    public final synchronized boolean c() {
        return this.f83633a.isEmpty();
    }

    public final synchronized void d() {
        if (this.f83633a.isEmpty()) {
            List<sg.bigo.ads.common.g.b.a> listG = g();
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f83634b.iterator();
            while (it.hasNext()) {
                listG.remove(it.next());
            }
            this.f83633a.addAll(listG);
        }
    }

    public final synchronized void e() {
        this.f83634b.clear();
        this.f83633a.clear();
    }
}

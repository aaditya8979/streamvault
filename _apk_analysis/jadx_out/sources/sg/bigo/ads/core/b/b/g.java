package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.core.b.a.a f83654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f83655b = p.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f83656c = p.a(a());

    public g(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        this.f83654a = aVar;
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        });
    }

    public static /* synthetic */ void a(g gVar) {
        sg.bigo.ads.common.g.c.a.a(System.currentTimeMillis() - ((long) gVar.f83654a.f83607c));
        gVar.f83655b.addAll(gVar.b());
    }

    public int a() {
        return this.f83654a.f83605a;
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z10) {
        this.f83656c.removeAll(list);
        if (!z10) {
            this.f83655b.addAll(list);
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
        this.f83655b.add(aVar);
        aVar.f82121a = sg.bigo.ads.common.g.c.a.a(aVar);
    }

    public List<sg.bigo.ads.common.g.b.a> b() {
        return sg.bigo.ads.common.g.c.a.a(this.f83654a.a());
    }

    public final synchronized List<sg.bigo.ads.common.g.b.a> c() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f83655b);
        Iterator<sg.bigo.ads.common.g.b.a> it = this.f83656c.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f83655b.clear();
        this.f83656c.addAll(arrayList);
        return arrayList;
    }

    public final synchronized int d() {
        return this.f83655b.size();
    }

    public final synchronized boolean e() {
        return this.f83655b.isEmpty();
    }

    public final synchronized void f() {
        if (this.f83655b.isEmpty()) {
            List<sg.bigo.ads.common.g.b.a> listB = b();
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f83656c.iterator();
            while (it.hasNext()) {
                listB.remove(it.next());
            }
            this.f83655b.addAll(listB);
        }
    }

    public final synchronized void g() {
        this.f83656c.clear();
        this.f83655b.clear();
    }
}

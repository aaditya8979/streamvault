package sg.bigo.ads.core.d.b;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f83731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f83732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.d.a.a f83733c;

    public c(@NonNull sg.bigo.ads.core.d.a.a aVar) {
        this.f83733c = aVar;
        this.f83731a = p.a(aVar.f83706a);
        this.f83732b = p.a(aVar.f83706a);
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                long jCurrentTimeMillis = System.currentTimeMillis();
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo");
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo count = ".concat(String.valueOf(sg.bigo.ads.common.g.a.a.b("tb_stat", "expired_ts < ".concat(String.valueOf(jCurrentTimeMillis)), null))));
                cVar.f83731a.addAll(cVar.e());
            }
        });
    }

    public final synchronized List<sg.bigo.ads.common.g.b.b> a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f83731a);
        Iterator<sg.bigo.ads.common.g.b.b> it = this.f83732b.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f83731a.clear();
        this.f83732b.addAll(arrayList);
        return arrayList;
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.b> list, boolean z10) {
        this.f83732b.removeAll(list);
        if (!z10) {
            this.f83731a.addAll(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<sg.bigo.ads.common.g.b.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().f82128a));
        }
        sg.bigo.ads.common.g.c.b.a(arrayList);
    }

    public final synchronized void a(sg.bigo.ads.common.g.b.b bVar) {
        this.f83731a.add(bVar);
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "insertStatInfo:" + bVar.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", bVar.f82129b);
        contentValues.put("event_info", bVar.f82130c);
        contentValues.put("expired_ts", Long.valueOf(bVar.f82131d));
        contentValues.put("ext", bVar.f82132e);
        long jCurrentTimeMillis = bVar.f82133f;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(jCurrentTimeMillis));
        long jCurrentTimeMillis2 = bVar.f82134g;
        if (jCurrentTimeMillis2 == 0) {
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis2));
        bVar.f82128a = sg.bigo.ads.common.g.a.a.a("tb_stat", contentValues);
    }

    public final synchronized int b() {
        return this.f83731a.size();
    }

    public final synchronized boolean c() {
        return this.f83731a.isEmpty();
    }

    public final synchronized void d() {
        if (this.f83731a.isEmpty()) {
            List<sg.bigo.ads.common.g.b.b> listE = e();
            Iterator<sg.bigo.ads.common.g.b.b> it = this.f83732b.iterator();
            while (it.hasNext()) {
                listE.remove(it.next());
            }
            this.f83731a.addAll(listE);
        }
    }

    public final List<sg.bigo.ads.common.g.b.b> e() {
        return sg.bigo.ads.common.g.c.b.a(this.f83733c.a());
    }

    public final synchronized void f() {
        this.f83732b.clear();
        this.f83731a.clear();
    }
}

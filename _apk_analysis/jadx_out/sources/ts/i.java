package ts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: SubstituteLoggerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class i implements rs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f85413a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, h> f85414b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue<ss.c> f85415c = new LinkedBlockingQueue<>();

    @Override // rs.a
    public synchronized rs.c a(String str) {
        h hVar;
        hVar = this.f85414b.get(str);
        if (hVar == null) {
            hVar = new h(str, this.f85415c, this.f85413a);
            this.f85414b.put(str, hVar);
        }
        return hVar;
    }

    public void b() {
        this.f85414b.clear();
        this.f85415c.clear();
    }

    public LinkedBlockingQueue<ss.c> c() {
        return this.f85415c;
    }

    public List<h> d() {
        return new ArrayList(this.f85414b.values());
    }

    public void e() {
        this.f85413a = true;
    }
}

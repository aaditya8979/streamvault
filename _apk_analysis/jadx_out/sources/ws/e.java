package ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ws.h;

/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes11.dex */
public class e<K extends h, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f86701a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f86702b = new HashMap();

    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f86703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<V> f86704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f86705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f86706d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f86706d = this;
            this.f86705c = this;
            this.f86703a = k10;
        }

        public void a(V v10) {
            if (this.f86704b == null) {
                this.f86704b = new ArrayList();
            }
            this.f86704b.add(v10);
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f86704b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f86704b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f86706d;
        aVar2.f86705c = aVar.f86705c;
        aVar.f86705c.f86706d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f86705c.f86706d = aVar;
        aVar.f86706d.f86705c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f86702b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f86702b.put(k10, aVar);
        } else {
            k10.offer();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f86701a;
        aVar.f86706d = aVar2;
        aVar.f86705c = aVar2.f86705c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f86701a;
        aVar.f86706d = aVar2.f86706d;
        aVar.f86705c = aVar2;
        g(aVar);
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f86702b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f86702b.put(k10, aVar);
        } else {
            k10.offer();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a aVar = this.f86701a.f86706d; !aVar.equals(this.f86701a); aVar = aVar.f86706d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f86702b.remove(aVar.f86703a);
            ((h) aVar.f86703a).offer();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f86701a.f86705c; !aVar.equals(this.f86701a); aVar = aVar.f86705c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f86703a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}

package ep;

import fp.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: DanmakuFilters.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f61219a = new Exception("not suuport this filter tag");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, e<?>> f61220b = Collections.synchronizedSortedMap(new TreeMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, e<?>> f61221c = Collections.synchronizedSortedMap(new TreeMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<?>[] f61222d = new e[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e<?>[] f61223e = new e[0];

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static abstract class a<T> implements e<T> {
        @Override // ep.b.e
        public void clear() {
        }
    }

    /* JADX INFO: renamed from: ep.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class C0754b extends a<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fp.k f61224a = new gp.e(4);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap<String, fp.c> f61225b = new LinkedHashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fp.k f61226c = new gp.e(4);

        /* JADX INFO: renamed from: ep.b$b$a */
        /* JADX INFO: compiled from: DanmakuFilters.java */
        public class a extends k.c<fp.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f61227a = lp.b.b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f61228b;

            public a(long j10) {
                this.f61228b = j10;
            }

            @Override // fp.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(fp.c cVar) {
                try {
                    if (lp.b.b() - this.f61227a > this.f61228b) {
                        return 1;
                    }
                    if (cVar.v()) {
                        return 2;
                    }
                } catch (Exception unused) {
                }
                return 1;
            }
        }

        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean zC = c(cVar, i10, i11, eVar, z10);
            if (zC) {
                cVar.F |= 128;
            }
            return zC;
        }

        public synchronized boolean c(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10) {
            d(this.f61224a, 2L);
            d(this.f61226c, 2L);
            e(this.f61225b, 3);
            if (this.f61224a.f(cVar) && !cVar.r()) {
                return true;
            }
            if (this.f61226c.f(cVar)) {
                return false;
            }
            if (!this.f61225b.containsKey(cVar.f61776c)) {
                this.f61225b.put(String.valueOf(cVar.f61776c), cVar);
                this.f61226c.c(cVar);
                return false;
            }
            this.f61225b.put(String.valueOf(cVar.f61776c), cVar);
            this.f61224a.a(cVar);
            this.f61224a.c(cVar);
            return true;
        }

        @Override // ep.b.a, ep.b.e
        public void clear() {
            f();
        }

        public final void d(fp.k kVar, long j10) {
            kVar.d(new a(j10));
        }

        public final void e(LinkedHashMap<String, fp.c> linkedHashMap, int i10) {
            Iterator<Map.Entry<String, fp.c>> it = linkedHashMap.entrySet().iterator();
            long jB = lp.b.b();
            while (it.hasNext()) {
                try {
                    if (!it.next().getValue().v()) {
                        return;
                    }
                    it.remove();
                    if (lp.b.b() - jB > i10) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }

        public synchronized void f() {
            this.f61226c.clear();
            this.f61224a.clear();
            this.f61225b.clear();
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(Void r12) {
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class c extends a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f61230a = 20;

        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean zC = c(cVar, i10, i11, eVar, z10);
            if (zC) {
                cVar.F |= 4;
            }
            return zC;
        }

        @Override // ep.b.e
        public void b(Object obj) {
            d();
        }

        public final synchronized boolean c(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10) {
            if (eVar != null) {
                if (cVar.r()) {
                    return lp.b.b() - eVar.f61800a >= this.f61230a;
                }
            }
            return false;
        }

        @Override // ep.b.a, ep.b.e
        public void clear() {
            d();
        }

        public synchronized void d() {
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class d extends a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f61231a = Boolean.FALSE;

        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = this.f61231a.booleanValue() && cVar.C;
            if (z11) {
                cVar.F |= 64;
            }
            return z11;
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Boolean bool) {
            this.f61231a = bool;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public interface e<T> {
        boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext);

        void b(T t10);

        void clear();
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class f extends a<Map<Integer, Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<Integer, Integer> f61232a;

        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            Map<Integer, Integer> map = this.f61232a;
            boolean z11 = false;
            if (map != null) {
                Integer num = map.get(Integer.valueOf(cVar.getType()));
                if (num != null && i10 >= num.intValue()) {
                    z11 = true;
                }
                if (z11) {
                    cVar.F |= 256;
                }
            }
            return z11;
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Map<Integer, Integer> map) {
            this.f61232a = map;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class g extends a<Map<Integer, Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<Integer, Boolean> f61233a;

        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            Map<Integer, Boolean> map = this.f61233a;
            boolean z11 = false;
            if (map != null) {
                Boolean bool = map.get(Integer.valueOf(cVar.getType()));
                if (bool != null && bool.booleanValue() && z10) {
                    z11 = true;
                }
                if (z11) {
                    cVar.F |= 512;
                }
            }
            return z11;
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Map<Integer, Boolean> map) {
            this.f61233a = map;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class h extends a<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61234a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public fp.c f61235b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f61236c = 1.0f;

        @Override // ep.b.e
        public synchronized boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean zC;
            zC = c(cVar, i10, i11, eVar, z10, danmakuContext);
            if (zC) {
                cVar.F |= 2;
            }
            return zC;
        }

        public final boolean c(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            if (this.f61234a > 0 && cVar.getType() == 1) {
                fp.c cVar2 = this.f61235b;
                if (cVar2 != null && !cVar2.v()) {
                    long jB = cVar.b() - this.f61235b.b();
                    fp.f fVar = danmakuContext.f74049z.f62723g;
                    if ((jB >= 0 && fVar != null && jB < fVar.f61804d * this.f61236c) || i10 > this.f61234a) {
                        return true;
                    }
                    this.f61235b = cVar;
                    return false;
                }
                this.f61235b = cVar;
            }
            return false;
        }

        @Override // ep.b.a, ep.b.e
        public void clear() {
            d();
        }

        public synchronized void d() {
            this.f61235b = null;
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Integer num) {
            d();
            if (num == null || num.intValue() == this.f61234a) {
                return;
            }
            int iIntValue = num.intValue() + (num.intValue() / 5);
            this.f61234a = iIntValue;
            this.f61236c = 1.0f / iIntValue;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class i extends a<List<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Integer> f61237a = new ArrayList();

        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = (cVar == null || this.f61237a.contains(Integer.valueOf(cVar.f61779f))) ? false : true;
            if (z11) {
                cVar.F |= 8;
            }
            return z11;
        }

        public final void c(Integer num) {
            if (this.f61237a.contains(num)) {
                return;
            }
            this.f61237a.add(num);
        }

        public void d() {
            this.f61237a.clear();
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(List<Integer> list) {
            d();
            if (list != null) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class j extends a<List<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Integer> f61238a = Collections.synchronizedList(new ArrayList());

        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = cVar != null && this.f61238a.contains(Integer.valueOf(cVar.getType()));
            if (z11) {
                cVar.F = 1 | cVar.F;
            }
            return z11;
        }

        public void c(Integer num) {
            if (this.f61238a.contains(num)) {
                return;
            }
            this.f61238a.add(num);
        }

        public void d() {
            this.f61238a.clear();
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(List<Integer> list) {
            d();
            if (list != null) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static abstract class k<T> extends a<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<T> f61239a = new ArrayList();

        public final void c(T t10) {
            if (this.f61239a.contains(t10)) {
                return;
            }
            this.f61239a.add(t10);
        }

        public void d() {
            this.f61239a.clear();
        }

        @Override // ep.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(List<T> list) {
            d();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class l extends k<String> {
        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = cVar != null && this.f61239a.contains(cVar.B);
            if (z11) {
                cVar.F |= 32;
            }
            return z11;
        }
    }

    /* JADX INFO: compiled from: DanmakuFilters.java */
    public static class m extends k<Integer> {
        @Override // ep.b.e
        public boolean a(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
            boolean z11 = cVar != null && this.f61239a.contains(Integer.valueOf(cVar.A));
            if (z11) {
                cVar.F |= 16;
            }
            return z11;
        }
    }

    public void a() {
        for (e<?> eVar : this.f61222d) {
            if (eVar != null) {
                eVar.clear();
            }
        }
        for (e<?> eVar2 : this.f61223e) {
            if (eVar2 != null) {
                eVar2.clear();
            }
        }
    }

    public void b(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
        for (e<?> eVar2 : this.f61222d) {
            if (eVar2 != null) {
                boolean zA = eVar2.a(cVar, i10, i11, eVar, z10, danmakuContext);
                cVar.G = danmakuContext.f74047x.f61807c;
                if (zA) {
                    return;
                }
            }
        }
    }

    public boolean c(fp.c cVar, int i10, int i11, fp.e eVar, boolean z10, DanmakuContext danmakuContext) {
        for (e<?> eVar2 : this.f61223e) {
            if (eVar2 != null) {
                boolean zA = eVar2.a(cVar, i10, i11, eVar, z10, danmakuContext);
                cVar.G = danmakuContext.f74047x.f61807c;
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public e<?> d(String str, boolean z10) {
        e<?> eVar = (z10 ? this.f61220b : this.f61221c).get(str);
        return eVar == null ? f(str, z10) : eVar;
    }

    public e<?> e(String str) {
        return f(str, true);
    }

    public e<?> f(String str, boolean z10) {
        if (str == null) {
            g();
            return null;
        }
        e<?> gVar = this.f61220b.get(str);
        if (gVar == null) {
            if ("1010_Filter".equals(str)) {
                gVar = new j();
            } else if ("1011_Filter".equals(str)) {
                gVar = new h();
            } else if ("1012_Filter".equals(str)) {
                gVar = new c();
            } else if ("1013_Filter".equals(str)) {
                gVar = new i();
            } else if ("1014_Filter".equals(str)) {
                gVar = new m();
            } else if ("1015_Filter".equals(str)) {
                gVar = new l();
            } else if ("1016_Filter".equals(str)) {
                gVar = new d();
            } else if ("1017_Filter".equals(str)) {
                gVar = new C0754b();
            } else if ("1018_Filter".equals(str)) {
                gVar = new f();
            } else if ("1019_Filter".equals(str)) {
                gVar = new g();
            }
        }
        if (gVar == null) {
            g();
            return null;
        }
        gVar.b(null);
        if (z10) {
            this.f61220b.put(str, gVar);
            this.f61222d = (e[]) this.f61220b.values().toArray(this.f61222d);
        } else {
            this.f61221c.put(str, gVar);
            this.f61223e = (e[]) this.f61221c.values().toArray(this.f61223e);
        }
        return gVar;
    }

    public final void g() {
        try {
            throw this.f61219a;
        } catch (Exception unused) {
        }
    }

    public void h(String str) {
        i(str, true);
    }

    public void i(String str, boolean z10) {
        e<?> eVarRemove = (z10 ? this.f61220b : this.f61221c).remove(str);
        if (eVarRemove != null) {
            eVarRemove.clear();
            if (z10) {
                this.f61222d = (e[]) this.f61220b.values().toArray(this.f61222d);
            } else {
                this.f61223e = (e[]) this.f61221c.values().toArray(this.f61223e);
            }
        }
    }
}

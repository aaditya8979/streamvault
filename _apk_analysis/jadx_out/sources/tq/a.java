package tq;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sq.m;

/* JADX INFO: compiled from: JSON.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vq.c f85381c = vq.b.a(a.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f85382d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, d> f85383a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85384b = 1024;

    /* JADX INFO: renamed from: tq.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JSON.java */
    public class C1065a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f85385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f85386b;

        public C1065a(d dVar, Object obj) {
            this.f85385a = dVar;
            this.f85386b = obj;
        }

        @Override // tq.a.c
        public void a(f fVar) {
            this.f85385a.a(this.f85386b, fVar);
        }
    }

    /* JADX INFO: compiled from: JSON.java */
    public final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Appendable f85388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public char f85389b;

        public b(Appendable appendable) {
            this.f85389b = '{';
            this.f85388a = appendable;
        }

        public /* synthetic */ b(a aVar, Appendable appendable, C1065a c1065a) {
            this(appendable);
        }

        public void a() {
            try {
                char c10 = this.f85389b;
                if (c10 == '{') {
                    this.f85388a.append(JsonUtils.EMPTY_JSON);
                } else if (c10 != 0) {
                    this.f85388a.append(h.f52302e);
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: JSON.java */
    public interface c {
        void a(f fVar);
    }

    /* JADX INFO: compiled from: JSON.java */
    public interface d {
        void a(Object obj, f fVar);
    }

    /* JADX INFO: compiled from: JSON.java */
    public interface e {
        void a(Appendable appendable);
    }

    /* JADX INFO: compiled from: JSON.java */
    public interface f {
    }

    public static String n(Object obj) {
        a aVar = f85382d;
        StringBuilder sb2 = new StringBuilder(aVar.m());
        aVar.a(sb2, obj);
        return sb2.toString();
    }

    public void a(Appendable appendable, Object obj) {
        try {
            if (obj == null) {
                appendable.append("null");
            } else if (obj instanceof Map) {
                h(appendable, (Map) obj);
            } else if (obj instanceof String) {
                k(appendable, (String) obj);
            } else if (obj instanceof Number) {
                j(appendable, (Number) obj);
            } else if (obj instanceof Boolean) {
                d(appendable, (Boolean) obj);
            } else if (obj.getClass().isArray()) {
                b(appendable, obj);
            } else if (obj instanceof Character) {
                k(appendable, obj.toString());
            } else if (obj instanceof c) {
                e(appendable, (c) obj);
            } else if (obj instanceof e) {
                g(appendable, (e) obj);
            } else {
                d dVarL = l(obj.getClass());
                if (dVarL != null) {
                    f(appendable, dVarL, obj);
                } else if (obj instanceof Collection) {
                    c(appendable, (Collection) obj);
                } else {
                    k(appendable, obj.toString());
                }
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void b(Appendable appendable, Object obj) {
        try {
            if (obj == null) {
                i(appendable);
                return;
            }
            appendable.append('[');
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 != 0) {
                    appendable.append(',');
                }
                a(appendable, Array.get(obj, i10));
            }
            appendable.append(']');
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void c(Appendable appendable, Collection collection) {
        try {
            if (collection == null) {
                i(appendable);
                return;
            }
            appendable.append('[');
            Iterator it = collection.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                if (!z10) {
                    appendable.append(',');
                }
                z10 = false;
                a(appendable, it.next());
            }
            appendable.append(']');
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void d(Appendable appendable, Boolean bool) {
        try {
            if (bool == null) {
                i(appendable);
            } else {
                appendable.append(bool.booleanValue() ? "true" : com.ironsource.mediationsdk.metadata.a.f32683h);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void e(Appendable appendable, c cVar) {
        b bVar = new b(this, appendable, null);
        cVar.a(bVar);
        bVar.a();
    }

    public void f(Appendable appendable, d dVar, Object obj) {
        e(appendable, new C1065a(dVar, obj));
    }

    public void g(Appendable appendable, e eVar) {
        eVar.a(appendable);
    }

    public void h(Appendable appendable, Map<?, ?> map) {
        try {
            if (map == null) {
                i(appendable);
                return;
            }
            appendable.append('{');
            Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                m.b(appendable, next.getKey().toString());
                appendable.append(':');
                a(appendable, next.getValue());
                if (it.hasNext()) {
                    appendable.append(',');
                }
            }
            appendable.append('}');
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void i(Appendable appendable) {
        try {
            appendable.append("null");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void j(Appendable appendable, Number number) {
        try {
            if (number == null) {
                i(appendable);
            } else {
                appendable.append(String.valueOf(number));
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void k(Appendable appendable, String str) {
        if (str == null) {
            i(appendable);
        } else {
            m.b(appendable, str);
        }
    }

    public d l(Class cls) {
        a aVar;
        d dVarL = this.f85383a.get(cls.getName());
        if (dVarL == null && this != (aVar = f85382d)) {
            dVarL = aVar.l(cls);
        }
        while (dVarL == null && cls != Object.class) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i10 = 0; dVarL == null && interfaces != null && i10 < interfaces.length; i10++) {
                dVarL = this.f85383a.get(interfaces[i10].getName());
            }
            if (dVarL == null) {
                cls = cls.getSuperclass();
                dVarL = this.f85383a.get(cls.getName());
            }
        }
        return dVarL;
    }

    public int m() {
        return this.f85384b;
    }
}

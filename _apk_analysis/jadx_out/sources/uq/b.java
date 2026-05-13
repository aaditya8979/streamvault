package uq;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: AggregateLifeCycle.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends uq.a implements d, e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final vq.c f85786m = vq.b.a(b.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<a> f85787k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85788l = false;

    /* JADX INFO: compiled from: AggregateLifeCycle.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f85789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f85790b = true;

        public a(Object obj) {
            this.f85789a = obj;
        }

        public String toString() {
            return h.f52301d + this.f85789a + StringUtils.COMMA + this.f85790b + h.f52302e;
        }
    }

    public static void p0(Appendable appendable, String str, Collection<?>... collectionArr) throws IOException {
        if (collectionArr.length == 0) {
            return;
        }
        int size = 0;
        for (Collection<?> collection : collectionArr) {
            size += collection.size();
        }
        if (size == 0) {
            return;
        }
        int i10 = 0;
        for (Collection<?> collection2 : collectionArr) {
            for (Object obj : collection2) {
                i10++;
                appendable.append(str).append(" +- ");
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i10 == size ? "    " : " |  ");
                    eVar.w(appendable, sb2.toString());
                } else {
                    q0(appendable, obj);
                }
            }
            if (i10 != size) {
                appendable.append(str).append(" |\n");
            }
        }
    }

    public static void q0(Appendable appendable, Object obj) throws IOException {
        try {
            if (obj instanceof f) {
                appendable.append(String.valueOf(obj)).append(" - ").append(uq.a.g0((f) obj)).append("\n");
            } else {
                appendable.append(String.valueOf(obj)).append("\n");
            }
        } catch (Throwable th2) {
            appendable.append(" => ").append(th2.toString()).append('\n');
        }
    }

    @Override // uq.a
    public void d0() throws Exception {
        for (a aVar : this.f85787k) {
            if (aVar.f85790b) {
                Object obj = aVar.f85789a;
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (!fVar.isRunning()) {
                        fVar.start();
                    }
                }
            }
        }
        this.f85788l = true;
        super.d0();
    }

    public void destroy() {
        ArrayList<a> arrayList = new ArrayList(this.f85787k);
        Collections.reverse(arrayList);
        for (a aVar : arrayList) {
            if ((aVar.f85789a instanceof d) && aVar.f85790b) {
                ((d) aVar.f85789a).destroy();
            }
        }
        this.f85787k.clear();
    }

    @Override // uq.a
    public void e0() throws Exception {
        this.f85788l = false;
        super.e0();
        ArrayList<a> arrayList = new ArrayList(this.f85787k);
        Collections.reverse(arrayList);
        for (a aVar : arrayList) {
            if (aVar.f85790b) {
                Object obj = aVar.f85789a;
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (fVar.isRunning()) {
                        fVar.stop();
                    }
                }
            }
        }
    }

    public boolean m0(Object obj) {
        return n0(obj, ((obj instanceof f) && ((f) obj).isStarted()) ? false : true);
    }

    public boolean n0(Object obj, boolean z10) {
        if (o0(obj)) {
            return false;
        }
        a aVar = new a(obj);
        aVar.f85790b = z10;
        this.f85787k.add(aVar);
        if (!(obj instanceof f)) {
            return true;
        }
        f fVar = (f) obj;
        if (!z10 || !this.f85788l) {
            return true;
        }
        try {
            fVar.start();
            return true;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean o0(Object obj) {
        Iterator<a> it = this.f85787k.iterator();
        while (it.hasNext()) {
            if (it.next().f85789a == obj) {
                return true;
            }
        }
        return false;
    }

    public void r0() {
        try {
            w(System.err, "");
        } catch (IOException e10) {
            f85786m.e(e10);
        }
    }

    public void s0(Appendable appendable) throws IOException {
        appendable.append(String.valueOf(this)).append(" - ").append(f0()).append("\n");
    }

    public <T> T t0(Class<T> cls) {
        for (a aVar : this.f85787k) {
            if (cls.isInstance(aVar.f85789a)) {
                return (T) aVar.f85789a;
            }
        }
        return null;
    }

    public Collection<Object> u0() {
        return v0(Object.class);
    }

    public <T> List<T> v0(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f85787k) {
            if (cls.isInstance(aVar.f85789a)) {
                arrayList.add(aVar.f85789a);
            }
        }
        return arrayList;
    }

    public void w(Appendable appendable, String str) throws IOException {
        s0(appendable);
        int size = this.f85787k.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        for (a aVar : this.f85787k) {
            i10++;
            appendable.append(str).append(" +- ");
            if (aVar.f85790b) {
                Object obj = aVar.f85789a;
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i10 == size ? "    " : " |  ");
                    eVar.w(appendable, sb2.toString());
                } else {
                    q0(appendable, obj);
                }
            } else {
                q0(appendable, aVar.f85789a);
            }
        }
        if (i10 != size) {
            appendable.append(str).append(" |\n");
        }
    }

    public boolean w0(Object obj) {
        for (a aVar : this.f85787k) {
            if (aVar.f85789a == obj) {
                this.f85787k.remove(aVar);
                return true;
            }
        }
        return false;
    }
}

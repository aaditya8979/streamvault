package ds;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;

/* JADX INFO: compiled from: EventedValue.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f59983a;

    public b(V v10) {
        this.f59983a = v10;
    }

    public Map.Entry<String, String>[] a() {
        return new Map.Entry[]{new AbstractMap$SimpleEntry("val", toString())};
    }

    public abstract Datatype b();

    public String c() {
        return getClass().getSimpleName();
    }

    public V d() {
        return this.f59983a;
    }

    public String toString() {
        return b().e(d());
    }
}

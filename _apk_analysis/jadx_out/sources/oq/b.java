package oq;

import java.io.IOException;
import mq.i;
import mq.j;
import org.eclipse.jetty.util.LazyList;
import sq.p;

/* JADX INFO: compiled from: AbstractHandlerContainer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends a implements j {
    @Override // mq.j
    public i[] U(Class<?> cls) {
        return (i[]) LazyList.toArray(x0(null, cls), cls);
    }

    @Override // mq.j
    public i[] p() {
        return (i[]) LazyList.toArray(x0(null, null), i.class);
    }

    @Override // uq.b, uq.e
    public void w(Appendable appendable, String str) throws IOException {
        s0(appendable);
        uq.b.p0(appendable, str, u0(), p.a(N()));
    }

    public Object x0(Object obj, Class<?> cls) {
        return obj;
    }

    public Object y0(i iVar, Object obj, Class<i> cls) {
        if (iVar == null) {
            return obj;
        }
        if (cls == null || cls.isAssignableFrom(iVar.getClass())) {
            obj = LazyList.add(obj, iVar);
        }
        if (iVar instanceof b) {
            return ((b) iVar).x0(obj, cls);
        }
        if (!(iVar instanceof j)) {
            return obj;
        }
        j jVar = (j) iVar;
        return LazyList.addArray(obj, cls == null ? jVar.p() : jVar.U(cls));
    }

    public <T extends i> T z0(Class<T> cls) {
        Object objX0 = x0(null, cls);
        if (objX0 == null) {
            return null;
        }
        return (T) LazyList.get(objX0, 0);
    }
}

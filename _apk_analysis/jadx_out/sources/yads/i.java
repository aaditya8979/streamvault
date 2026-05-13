package yads;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends a0 {
    private static final long serialVersionUID = 6588350623831699109L;

    public i(Map map) {
        super(map);
    }

    @Override // yads.e0
    public final n a() {
        n nVar = this.f89038e;
        if (nVar != null) {
            return nVar;
        }
        n nVarB = ((sx1) this).b();
        this.f89038e = nVarB;
        return nVarB;
    }

    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f87525f.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f87526g++;
            return true;
        }
        List list = (List) ((sx1) this).f95006h.get();
        if (!list.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f87526g++;
        this.f87525f.put(obj, list);
        return true;
    }

    @Override // yads.e0
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}

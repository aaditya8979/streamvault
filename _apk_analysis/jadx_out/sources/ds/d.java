package ds;

import java.lang.Enum;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueEnumArray.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<E extends Enum> extends b<E[]> {
    public d(E[] eArr) {
        super(eArr);
    }

    @Override // ds.b
    public Datatype b() {
        return null;
    }

    @Override // ds.b
    public String toString() {
        return ir.f.g(d());
    }
}

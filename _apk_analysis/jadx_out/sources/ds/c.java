package ds;

import java.lang.Enum;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueEnum.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<E extends Enum> extends b<E> {
    public c(E e10) {
        super(e10);
    }

    @Override // ds.b
    public Datatype b() {
        return null;
    }

    @Override // ds.b
    public String toString() {
        return d().name();
    }
}

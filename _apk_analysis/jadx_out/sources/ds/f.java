package ds;

import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueString.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends b<String> {
    public f(String str) {
        super(str);
    }

    @Override // ds.b
    public Datatype b() {
        return Datatype.Builtin.STRING.getDatatype();
    }
}

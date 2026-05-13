package tr;

import org.fourthline.cling.model.types.InvalidValueException;
import qr.l;
import qr.m;

/* JADX INFO: compiled from: StateVariableValue.java */
/* JADX INFO: loaded from: classes12.dex */
public class d<S extends l> extends ir.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m<S> f85397d;

    public d(m<S> mVar, Object obj) throws InvalidValueException {
        super(mVar.d().d(), obj);
        this.f85397d = mVar;
    }

    public m<S> d() {
        return this.f85397d;
    }
}

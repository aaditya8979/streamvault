package jr;

import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import qr.l;

/* JADX INFO: compiled from: ActionArgumentValue.java */
/* JADX INFO: loaded from: classes6.dex */
public class b<S extends l> extends ir.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionArgument<S> f72572d;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(ActionArgument<S> actionArgument, Object obj) throws InvalidValueException {
        Datatype datatypeC = actionArgument.c();
        if (obj != null && obj.getClass().isEnum()) {
            obj = obj.toString();
        }
        super(datatypeC, obj);
        this.f72572d = actionArgument;
    }

    public ActionArgument<S> d() {
        return this.f72572d;
    }
}

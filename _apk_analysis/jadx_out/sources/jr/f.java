package jr;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.types.ErrorCode;
import qr.m;

/* JADX INFO: compiled from: QueryStateVariableExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
public class f extends a {
    @Override // jr.a
    public void b(d<qr.f> dVar, Object obj) throws Exception {
        if (!(dVar.a() instanceof org.fourthline.cling.model.meta.b)) {
            throw new IllegalStateException("This class can only execute QueryStateVariableAction's, not: " + dVar.a());
        }
        if (((qr.f) dVar.a().g()).u()) {
            f(dVar, obj);
        } else {
            dVar.i(new ActionException(ErrorCode.INVALID_ACTION, "This service does not support querying state variables"));
        }
    }

    public void f(d<qr.f> dVar, Object obj) throws Exception {
        qr.f fVar = (qr.f) dVar.a().g();
        String string = dVar.d("varName").toString();
        m<qr.f> mVarH = fVar.h(string);
        if (mVarH == null) {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "No state variable found: " + string);
        }
        tr.c cVarN = fVar.n(mVarH.b());
        if (cVarN != null) {
            try {
                e(dVar, dVar.a().e("return"), cVarN.c(mVarH, obj).toString());
            } catch (Exception e10) {
                throw new ActionException(ErrorCode.ACTION_FAILED, e10.getMessage());
            }
        } else {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "No accessor for state variable, can't read state: " + string);
        }
    }
}

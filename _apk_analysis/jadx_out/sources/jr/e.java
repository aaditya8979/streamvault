package jr;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.meta.ActionArgument;

/* JADX INFO: compiled from: MethodActionExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f72578d = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f72579c;

    public e(Map<ActionArgument<qr.f>, tr.c> map, Method method) {
        super(map);
        this.f72579c = method;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    @Override // jr.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(jr.d<qr.f> r6, java.lang.Object r7) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.e.b(jr.d, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object[] f(jr.d<qr.f> r17, java.lang.reflect.Method r18) throws org.fourthline.cling.model.action.ActionException {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.e.f(jr.d, java.lang.reflect.Method):java.lang.Object[]");
    }

    public boolean g(d<qr.f> dVar) {
        for (ActionArgument actionArgument : dVar.a().f()) {
            if (c().get(actionArgument) != null) {
                return true;
            }
        }
        return false;
    }
}

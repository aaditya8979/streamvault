package jr;

import ir.j;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: AbstractActionExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f72568b = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<ActionArgument<qr.f>, tr.c> f72569a;

    /* JADX INFO: renamed from: jr.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractActionExecutor.java */
    public class C0856a implements ir.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f72570a;

        public C0856a(d dVar) {
            this.f72570a = dVar;
        }

        @Override // ir.a
        public void a(j jVar) throws Exception {
            a.this.b(this.f72570a, jVar.getImplementation());
        }

        public String toString() {
            return "Action invocation: " + this.f72570a.a();
        }
    }

    public a() {
        this.f72569a = new HashMap();
    }

    public a(Map<ActionArgument<qr.f>, tr.c> map) {
        new HashMap();
        this.f72569a = map;
    }

    @Override // jr.c
    public void a(d<qr.f> dVar) {
        f72568b.fine("Invoking on local service: " + dVar);
        qr.f fVar = (qr.f) dVar.a().g();
        try {
            if (fVar.q() == null) {
                throw new IllegalStateException("Service has no implementation factory, can't get service instance");
            }
            fVar.q().b(new C0856a(dVar));
        } catch (InterruptedException e10) {
            Logger logger = f72568b;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                f72568b.fine("InterruptedException thrown by service, wrapping in invocation and returning: " + e10);
                f72568b.log(level, "Exception root cause: ", os.a.a(e10));
            }
            dVar.i(new ActionCancelledException(e10));
        } catch (ActionException e11) {
            Logger logger2 = f72568b;
            Level level2 = Level.FINE;
            if (logger2.isLoggable(level2)) {
                f72568b.fine("ActionException thrown by service, wrapping in invocation and returning: " + e11);
                f72568b.log(level2, "Exception root cause: ", os.a.a(e11));
            }
            dVar.i(e11);
        } catch (Throwable th2) {
            Throwable thA = os.a.a(th2);
            Logger logger3 = f72568b;
            Level level3 = Level.FINE;
            if (logger3.isLoggable(level3)) {
                f72568b.fine("Execution has thrown, wrapping root cause in ActionException and returning: " + th2);
                f72568b.log(level3, "Exception root cause: ", thA);
            }
            dVar.i(new ActionException(ErrorCode.ACTION_FAILED, thA.getMessage() != null ? thA.getMessage() : thA.toString(), thA));
        }
    }

    public abstract void b(d<qr.f> dVar, Object obj) throws Exception;

    public Map<ActionArgument<qr.f>, tr.c> c() {
        return this.f72569a;
    }

    public Object d(org.fourthline.cling.model.meta.a<qr.f> aVar, Object obj) throws Exception {
        int length = aVar.f().length;
        Object[] objArr = new Object[length];
        f72568b.fine("Attempting to retrieve output argument values using accessor: " + length);
        Object[] objArrF = aVar.f();
        int length2 = objArrF.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2) {
            Object obj2 = objArrF[i10];
            f72568b.finer("Calling acccessor method for: " + obj2);
            tr.c cVar = c().get(obj2);
            if (cVar == null) {
                throw new IllegalStateException("No accessor bound for: " + obj2);
            }
            f72568b.fine("Calling accessor to read output argument value: " + cVar);
            objArr[i11] = cVar.b(obj);
            i10++;
            i11++;
        }
        if (length == 1) {
            return objArr[0];
        }
        if (length > 0) {
            return objArr;
        }
        return null;
    }

    public void e(d<qr.f> dVar, ActionArgument<qr.f> actionArgument, Object obj) throws ActionException {
        qr.f fVar = (qr.f) dVar.a().g();
        if (obj == null) {
            f72568b.fine("Result of invocation is null, not setting any output argument value(s)");
            return;
        }
        try {
            if (fVar.t(obj)) {
                f72568b.fine("Result of invocation matches convertible type, setting toString() single output argument value");
                dVar.m(new b<>(actionArgument, obj.toString()));
            } else {
                f72568b.fine("Result of invocation is Object, setting single output argument value");
                dVar.m(new b<>(actionArgument, obj));
            }
        } catch (InvalidValueException e10) {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Wrong type or invalid value for '" + actionArgument.e() + "': " + e10.getMessage(), e10);
        }
    }
}

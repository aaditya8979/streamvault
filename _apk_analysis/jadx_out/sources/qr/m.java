package qr;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;
import qr.l;

/* JADX INFO: compiled from: StateVariable.java */
/* JADX INFO: loaded from: classes3.dex */
public class m<S extends l> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f78472e = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f78474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f78475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S f78476d;

    public m(String str, p pVar) {
        this(str, pVar, new o());
    }

    public m(String str, p pVar, o oVar) {
        this.f78473a = str;
        this.f78474b = pVar;
        this.f78475c = oVar;
    }

    public o a() {
        return this.f78475c;
    }

    public String b() {
        return this.f78473a;
    }

    public S c() {
        return this.f78476d;
    }

    public p d() {
        return this.f78474b;
    }

    public boolean e() {
        return Datatype.Builtin.isNumeric(d().d().b()) && a().b() > 0;
    }

    public void f(S s10) {
        if (this.f78476d != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f78476d = s10;
    }

    public List<ir.k> g() {
        ArrayList arrayList = new ArrayList();
        if (b() == null || b().length() == 0) {
            arrayList.add(new ir.k(getClass(), "name", "StateVariable without name of: " + c()));
        } else if (!ir.f.f(b())) {
            Logger logger = f78472e;
            logger.warning("UPnP specification violation of: " + c().d());
            logger.warning("Invalid state variable name: " + this);
        }
        arrayList.addAll(d().f());
        return arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append(getClass().getSimpleName());
        sb2.append(", Name: ");
        sb2.append(b());
        sb2.append(", Type: ");
        sb2.append(d().d().a());
        sb2.append(")");
        if (!a().c()) {
            sb2.append(" (No Events)");
        }
        if (d().e() != null) {
            sb2.append(" Default Value: ");
            sb2.append("'");
            sb2.append(d().e());
            sb2.append("'");
        }
        if (d().c() != null) {
            sb2.append(" Allowed Values: ");
            for (String str : d().c()) {
                sb2.append(str);
                sb2.append(ImpressionLog.Q);
            }
        }
        return sb2.toString();
    }
}

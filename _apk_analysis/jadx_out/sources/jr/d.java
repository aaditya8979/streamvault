package jr;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.InvalidValueException;
import qr.l;

/* JADX INFO: compiled from: ActionInvocation.java */
/* JADX INFO: loaded from: classes6.dex */
public class d<S extends l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.fourthline.cling.model.meta.a<S> f72573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr.a f72574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, b<S>> f72575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, b<S>> f72576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionException f72577e;

    public d(ActionException actionException) {
        this.f72575c = new LinkedHashMap();
        new LinkedHashMap();
        this.f72573a = null;
        this.f72575c = null;
        this.f72576d = null;
        this.f72577e = actionException;
        this.f72574b = null;
    }

    public d(org.fourthline.cling.model.meta.a<S> aVar) {
        this(aVar, null, null, null);
    }

    public d(org.fourthline.cling.model.meta.a<S> aVar, b<S>[] bVarArr, b<S>[] bVarArr2, rr.a aVar2) {
        this.f72575c = new LinkedHashMap();
        this.f72576d = new LinkedHashMap();
        this.f72577e = null;
        if (aVar == null) {
            throw new IllegalArgumentException("Action can not be null");
        }
        this.f72573a = aVar;
        l(bVarArr);
        n(bVarArr2);
        this.f72574b = aVar2;
    }

    public org.fourthline.cling.model.meta.a<S> a() {
        return this.f72573a;
    }

    public rr.a b() {
        return this.f72574b;
    }

    public ActionException c() {
        return this.f72577e;
    }

    public b<S> d(String str) {
        return e(f(str));
    }

    public b<S> e(ActionArgument<S> actionArgument) {
        return this.f72575c.get(actionArgument.e());
    }

    public ActionArgument<S> f(String str) {
        ActionArgument<S> actionArgumentB = a().b(str);
        if (actionArgumentB != null) {
            return actionArgumentB;
        }
        throw new IllegalArgumentException("Argument not found: " + str);
    }

    public b<S> g(ActionArgument<S> actionArgument) {
        return this.f72576d.get(actionArgument.e());
    }

    public Map<String, b<S>> h() {
        return Collections.unmodifiableMap(this.f72576d);
    }

    public void i(ActionException actionException) {
        this.f72577e = actionException;
    }

    public void j(String str, Object obj) throws InvalidValueException {
        k(new b<>(f(str), obj));
    }

    public void k(b<S> bVar) {
        this.f72575c.put(bVar.d().e(), bVar);
    }

    public void l(b<S>[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (b<S> bVar : bVarArr) {
            this.f72575c.put(bVar.d().e(), bVar);
        }
    }

    public void m(b<S> bVar) {
        this.f72576d.put(bVar.d().e(), bVar);
    }

    public void n(b<S>[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (b<S> bVar : bVarArr) {
            this.f72576d.put(bVar.d().e(), bVar);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + a();
    }
}

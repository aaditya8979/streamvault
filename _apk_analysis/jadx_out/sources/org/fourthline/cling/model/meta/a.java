package org.fourthline.cling.model.meta;

import ir.f;
import ir.k;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.meta.ActionArgument;
import qr.l;

/* JADX INFO: compiled from: Action.java */
/* JADX INFO: loaded from: classes6.dex */
public class a<S extends l> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f76861f = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionArgument[] f76863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionArgument[] f76864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionArgument[] f76865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S f76866e;

    public a(String str, ActionArgument[] actionArgumentArr) {
        this.f76862a = str;
        if (actionArgumentArr == null) {
            this.f76863b = new ActionArgument[0];
            this.f76864c = new ActionArgument[0];
            this.f76865d = new ActionArgument[0];
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ActionArgument actionArgument : actionArgumentArr) {
            actionArgument.i(this);
            if (actionArgument.d().equals(ActionArgument.Direction.IN)) {
                arrayList.add(actionArgument);
            }
            if (actionArgument.d().equals(ActionArgument.Direction.OUT)) {
                arrayList2.add(actionArgument);
            }
        }
        this.f76863b = actionArgumentArr;
        this.f76864c = (ActionArgument[]) arrayList.toArray(new ActionArgument[arrayList.size()]);
        this.f76865d = (ActionArgument[]) arrayList2.toArray(new ActionArgument[arrayList2.size()]);
    }

    public ActionArgument[] a() {
        return this.f76863b;
    }

    public ActionArgument<S> b(String str) {
        for (ActionArgument<S> actionArgument : c()) {
            if (actionArgument.g(str)) {
                return actionArgument;
            }
        }
        return null;
    }

    public ActionArgument<S>[] c() {
        return this.f76864c;
    }

    public String d() {
        return this.f76862a;
    }

    public ActionArgument<S> e(String str) {
        for (ActionArgument<S> actionArgument : f()) {
            if (actionArgument.e().equals(str)) {
                return actionArgument;
            }
        }
        return null;
    }

    public ActionArgument<S>[] f() {
        return this.f76865d;
    }

    public S g() {
        return this.f76866e;
    }

    public boolean h() {
        return a() != null && a().length > 0;
    }

    public boolean i() {
        return f() != null && f().length > 0;
    }

    public void j(S s10) {
        if (this.f76866e != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f76866e = s10;
    }

    public List<k> k() {
        ArrayList arrayList = new ArrayList();
        if (d() == null || d().length() == 0) {
            arrayList.add(new k(getClass(), "name", "Action without name of: " + g()));
        } else if (!f.f(d())) {
            Logger logger = f76861f;
            logger.warning("UPnP specification violation of: " + g().d());
            logger.warning("Invalid action name: " + this);
        }
        for (ActionArgument actionArgument : a()) {
            if (g().h(actionArgument.f()) == null) {
                arrayList.add(new k(getClass(), "arguments", "Action argument references an unknown state variable: " + actionArgument.f()));
            }
        }
        ActionArgument actionArgument2 = null;
        int i10 = 0;
        int i11 = 0;
        for (ActionArgument actionArgument3 : a()) {
            if (actionArgument3.h()) {
                if (actionArgument3.d() == ActionArgument.Direction.IN) {
                    Logger logger2 = f76861f;
                    logger2.warning("UPnP specification violation of :" + g().d());
                    logger2.warning("Input argument can not have <retval/>");
                } else {
                    if (actionArgument2 != null) {
                        Logger logger3 = f76861f;
                        logger3.warning("UPnP specification violation of: " + g().d());
                        logger3.warning("Only one argument of action '" + d() + "' can be <retval/>");
                    }
                    i11 = i10;
                    actionArgument2 = actionArgument3;
                }
            }
            i10++;
        }
        if (actionArgument2 != null) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (a()[i12].d() == ActionArgument.Direction.OUT) {
                    Logger logger4 = f76861f;
                    logger4.warning("UPnP specification violation of: " + g().d());
                    logger4.warning("Argument '" + actionArgument2.e() + "' of action '" + d() + "' is <retval/> but not the first OUT argument");
                }
            }
        }
        for (ActionArgument actionArgument4 : this.f76863b) {
            arrayList.addAll(actionArgument4.j());
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append(getClass().getSimpleName());
        sb2.append(", Arguments: ");
        sb2.append(a() != null ? Integer.valueOf(a().length) : "NO ARGS");
        sb2.append(") ");
        sb2.append(d());
        return sb2.toString();
    }
}

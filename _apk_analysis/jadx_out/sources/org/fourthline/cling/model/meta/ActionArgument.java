package org.fourthline.cling.model.meta;

import ir.f;
import ir.k;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;
import qr.l;

/* JADX INFO: loaded from: classes2.dex */
public class ActionArgument<S extends l> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f76853g = Logger.getLogger(ActionArgument.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f76855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Direction f76857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f76858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a<S> f76859f;

    public enum Direction {
        IN,
        OUT
    }

    public ActionArgument(String str, String str2, Direction direction) {
        this(str, new String[0], str2, direction, false);
    }

    public ActionArgument(String str, String str2, Direction direction, boolean z10) {
        this(str, new String[0], str2, direction, z10);
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction) {
        this(str, strArr, str2, direction, false);
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction, boolean z10) {
        this.f76854a = str;
        this.f76855b = strArr;
        this.f76856c = str2;
        this.f76857d = direction;
        this.f76858e = z10;
    }

    public a<S> a() {
        return this.f76859f;
    }

    public String[] b() {
        return this.f76855b;
    }

    public Datatype c() {
        return a().g().c(this);
    }

    public Direction d() {
        return this.f76857d;
    }

    public String e() {
        return this.f76854a;
    }

    public String f() {
        return this.f76856c;
    }

    public boolean g(String str) {
        if (e().equalsIgnoreCase(str)) {
            return true;
        }
        for (String str2 : this.f76855b) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f76858e;
    }

    public void i(a<S> aVar) {
        if (this.f76859f != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.f76859f = aVar;
    }

    public List<k> j() {
        ArrayList arrayList = new ArrayList();
        if (e() == null || e().length() == 0) {
            arrayList.add(new k(getClass(), "name", "Argument without name of: " + a()));
        } else if (!f.f(e())) {
            Logger logger = f76853g;
            logger.warning("UPnP specification violation of: " + a().g().d());
            logger.warning("Invalid argument name: " + this);
        } else if (e().length() > 32) {
            Logger logger2 = f76853g;
            logger2.warning("UPnP specification violation of: " + a().g().d());
            logger2.warning("Argument name should be less than 32 characters: " + this);
        }
        if (d() == null) {
            arrayList.add(new k(getClass(), "direction", "Argument '" + e() + "' requires a direction, either IN or OUT"));
        }
        if (h() && d() != Direction.OUT) {
            arrayList.add(new k(getClass(), "direction", "Return value argument '" + e() + "' must be direction OUT"));
        }
        return arrayList;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ", " + d() + ") " + e();
    }
}

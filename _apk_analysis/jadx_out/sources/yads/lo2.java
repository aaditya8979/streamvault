package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx0 f92049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p51 f92050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f92052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pl2 f92053e;

    public lo2(mx0 mx0Var, p51 p51Var, hx2 hx2Var, ArrayList arrayList) {
        ni.a(!p51Var.isEmpty());
        this.f92049a = mx0Var;
        this.f92050b = p51.a((Collection) p51Var);
        this.f92052d = Collections.unmodifiableList(arrayList);
        this.f92053e = hx2Var.a(this);
        this.f92051c = hx2Var.a();
    }

    public abstract String c();

    public abstract i30 d();

    public abstract pl2 e();

    public final pl2 f() {
        return this.f92053e;
    }
}

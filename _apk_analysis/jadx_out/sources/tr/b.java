package tr;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: GetterStateVariableAccessor.java */
/* JADX INFO: loaded from: classes12.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f85392a;

    public b(Method method) {
        this.f85392a = method;
    }

    @Override // tr.c
    public Class<?> a() {
        return d().getReturnType();
    }

    @Override // tr.c
    public Object b(Object obj) throws Exception {
        return os.d.k(d(), obj, new Object[0]);
    }

    public Method d() {
        return this.f85392a;
    }

    @Override // tr.c
    public String toString() {
        return super.toString() + " Method: " + d();
    }
}

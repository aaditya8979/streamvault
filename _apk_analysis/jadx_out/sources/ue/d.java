package ue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ue.e;

/* JADX INFO: compiled from: RuntimeEnumAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d<E extends e> extends com.squareup.wire.a<E> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class<E> f85654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Method f85655t;

    public d(Class<E> cls) {
        super(cls);
        this.f85654s = cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f85654s == this.f85654s;
    }

    public int hashCode() {
        return this.f85654s.hashCode();
    }

    @Override // com.squareup.wire.a
    public E u(int i10) {
        try {
            return (E) v().invoke(null, Integer.valueOf(i10));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Method v() {
        Method method = this.f85655t;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.f85654s.getMethod("fromValue", Integer.TYPE);
            this.f85655t = method2;
            return method2;
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }
}

package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f37170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadMode f37171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f37172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37173d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f37170a = method;
        this.f37171b = threadMode;
        this.f37172c = cls;
    }

    private synchronized void a() {
        if (this.f37173d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f37170a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f37170a.getName());
            sb2.append('(');
            sb2.append(this.f37172c.getName());
            this.f37173d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f37173d.equals(((SubscriberMethod) obj).f37173d);
    }

    public int hashCode() {
        return this.f37170a.hashCode();
    }
}

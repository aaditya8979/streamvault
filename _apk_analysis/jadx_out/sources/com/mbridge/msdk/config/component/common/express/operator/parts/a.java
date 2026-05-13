package com.mbridge.msdk.config.component.common.express.operator.parts;

/* JADX INFO: compiled from: ExpressionResult.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f35859b;

    private a(boolean z10, Object obj) {
        this.f35858a = z10;
        this.f35859b = obj;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }

    public static a c() {
        return new a(false, null);
    }

    public Object a() {
        Object obj = this.f35859b;
        return obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof Integer ? String.valueOf(obj) : obj;
    }

    public boolean b() {
        return this.f35858a;
    }
}

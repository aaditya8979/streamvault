package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes6.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f41097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f41098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f41099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41100d;

    /* JADX INFO: compiled from: Response.java */
    public interface a {
        void a(b0 b0Var);
    }

    /* JADX INFO: compiled from: Response.java */
    public interface b<T> {
        void a(T t10);
    }

    private v(b0 b0Var) {
        this.f41100d = false;
        this.f41097a = null;
        this.f41098b = null;
        this.f41099c = b0Var;
    }

    private v(T t10, b.a aVar) {
        this.f41100d = false;
        this.f41097a = t10;
        this.f41098b = aVar;
        this.f41099c = null;
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public static <T> v<T> a(T t10, b.a aVar) {
        return new v<>(t10, aVar);
    }

    public boolean a() {
        return this.f41099c == null;
    }
}

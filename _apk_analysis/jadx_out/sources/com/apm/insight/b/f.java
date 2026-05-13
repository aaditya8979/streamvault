package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: CrashANRHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f7084a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f7085c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f7086b;

    private f(@NonNull Context context) {
        this.f7086b = new b(context);
        g gVar = new g();
        f7085c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f7084a == null) {
            synchronized (f.class) {
                if (f7084a == null) {
                    f7084a = new f(context);
                }
            }
        }
        return f7084a;
    }

    public static g b() {
        return f7085c;
    }

    public final b a() {
        return this.f7086b;
    }

    public final void c() {
        this.f7086b.a();
    }

    public final void d() {
        this.f7086b.b();
    }
}

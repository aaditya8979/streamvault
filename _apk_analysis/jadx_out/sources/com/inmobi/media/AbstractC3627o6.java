package com.inmobi.media;

import com.inmobi.media.AbstractC3627o6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3627o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f27752a = kotlin.b.b(new sn.a() { // from class: n9.r9
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3627o6.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bn.g f27753b = kotlin.b.b(new sn.a() { // from class: n9.s9
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3627o6.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bn.g f27754c = kotlin.b.b(new sn.a() { // from class: n9.t9
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3627o6.e();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bn.g f27755d = kotlin.b.b(new sn.a() { // from class: n9.u9
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3627o6.b();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bn.g f27756e = kotlin.b.b(new sn.a() { // from class: n9.v9
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3627o6.d();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bn.g f27757f = kotlin.b.b(new sn.a() { // from class: n9.w9
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3627o6.f();
        }
    });

    public static final ExecutorService a() {
        tn.p.k("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        tn.p.k("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        tn.p.k("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.highIO", false));
    }

    public static final Wb d() {
        return new Wb();
    }

    public static final ExecutorService e() {
        tn.p.k("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        tn.p.k("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new B9("ExecutorProvider.single", false));
    }
}

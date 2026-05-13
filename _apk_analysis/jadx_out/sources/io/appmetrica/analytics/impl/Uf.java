package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.impl.Uf;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class Uf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f65998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f65999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f66000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer f66001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4650aa f66002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4687bl f66003f;

    public Uf(File file, Function function, Consumer consumer, Consumer consumer2, C4650aa c4650aa, InterfaceC4687bl interfaceC4687bl) {
        this.f65998a = file;
        this.f65999b = function;
        this.f66000c = consumer;
        this.f66001d = consumer2;
        this.f66002e = c4650aa;
        this.f66003f = interfaceC4687bl;
    }

    public static final void a(File file) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f65998a.exists()) {
            C5257y9 c5257y9B = this.f66002e.b(this.f65998a.getName());
            Consumer consumer = this.f66000c;
            try {
                c5257y9B.f68032a.lock();
                c5257y9B.f68033b.a();
                if (!this.f65998a.exists()) {
                    consumer.consume(this.f65998a);
                    c5257y9B.c();
                    C4650aa c4650aa = this.f66002e;
                    String name = this.f65998a.getName();
                    synchronized (c4650aa) {
                        c4650aa.f66361b.remove(name);
                    }
                    return;
                }
                Object objApply = this.f65999b.apply(this.f65998a);
                if (objApply != null) {
                    if (this.f66003f.a(objApply)) {
                        this.f66001d.consume(objApply);
                    } else {
                        consumer = new Consumer() { // from class: mh.t
                            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                            public final void consume(Object obj) {
                                Uf.a((File) obj);
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
            consumer.consume(this.f65998a);
            c5257y9B.c();
            this.f66002e.a(this.f65998a.getName());
        }
    }
}

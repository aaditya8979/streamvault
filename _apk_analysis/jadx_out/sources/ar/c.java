package ar;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import uq.f;

/* JADX INFO: compiled from: ShutdownThread.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vq.c f5285d = vq.b.a(c.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f5286e = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f> f5288c = new CopyOnWriteArrayList();

    public static synchronized void a(f fVar) {
        c cVar = f5286e;
        cVar.f5288c.remove(fVar);
        if (cVar.f5288c.size() == 0) {
            cVar.f();
        }
    }

    public static c b() {
        return f5286e;
    }

    public static synchronized void d(f... fVarArr) {
        c cVar = f5286e;
        cVar.f5288c.addAll(Arrays.asList(fVarArr));
        if (cVar.f5288c.size() > 0) {
            cVar.c();
        }
    }

    public final synchronized void c() {
        try {
            if (!this.f5287b) {
                Runtime.getRuntime().addShutdownHook(this);
            }
            this.f5287b = true;
        } catch (Exception e10) {
            vq.c cVar = f5285d;
            cVar.g(e10);
            cVar.i("shutdown already commenced", new Object[0]);
        }
    }

    public final synchronized void f() {
        try {
            this.f5287b = false;
            Runtime.getRuntime().removeShutdownHook(this);
        } catch (Exception e10) {
            vq.c cVar = f5285d;
            cVar.g(e10);
            cVar.h("shutdown already commenced", new Object[0]);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        for (f fVar : f5286e.f5288c) {
            try {
                if (fVar.isStarted()) {
                    fVar.stop();
                    f5285d.h("Stopped {}", fVar);
                }
                if (fVar instanceof uq.d) {
                    ((uq.d) fVar).destroy();
                    f5285d.h("Destroyed {}", fVar);
                }
            } catch (Exception e10) {
                f5285d.b(e10);
            }
        }
    }
}

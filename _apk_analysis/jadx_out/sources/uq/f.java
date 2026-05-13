package uq;

import java.util.EventListener;

/* JADX INFO: compiled from: LifeCycle.java */
/* JADX INFO: loaded from: classes3.dex */
public interface f {

    /* JADX INFO: compiled from: LifeCycle.java */
    public interface a extends EventListener {
        void A(f fVar);

        void E(f fVar, Throwable th2);

        void h(f fVar);

        void j(f fVar);

        void m(f fVar);
    }

    boolean D();

    boolean isRunning();

    boolean isStarted();

    boolean isStopped();

    boolean q();

    void start() throws Exception;

    void stop() throws Exception;
}

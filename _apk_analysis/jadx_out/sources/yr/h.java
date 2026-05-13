package yr;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: RegistryMaintainer.java */
/* JADX INFO: loaded from: classes3.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Logger f98078e = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f98081d = false;

    public h(d dVar, int i10) {
        this.f98079b = dVar;
        this.f98080c = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98081d = false;
        if (f98078e.isLoggable(Level.FINE)) {
            f98078e.fine("Running registry maintenance loop every milliseconds: " + this.f98080c);
        }
        while (!this.f98081d) {
            try {
                this.f98079b.L();
                Thread.sleep(this.f98080c);
            } catch (InterruptedException unused) {
                this.f98081d = true;
            }
        }
        f98078e.fine("Stopped status on thread received, ending maintenance loop");
    }

    public void stop() {
        if (f98078e.isLoggable(Level.FINE)) {
            f98078e.fine("Setting stopped status on thread");
        }
        this.f98081d = true;
    }
}

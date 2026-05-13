package vr;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingAsync.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f86161c = Logger.getLogger(br.b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final br.b f86162b;

    public f(br.b bVar) {
        this.f86162b = bVar;
    }

    public abstract void a() throws RouterException;

    public br.b b() {
        return this.f86162b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Exception e10) {
            Throwable thA = os.a.a(e10);
            if (!(thA instanceof InterruptedException)) {
                throw new RuntimeException("Fatal error while executing protocol '" + getClass().getSimpleName() + "': " + e10, e10);
            }
            f86161c.log(Level.INFO, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e10, thA);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}

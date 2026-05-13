package vr;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingAsync.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c<M extends UpnpMessage> implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f86150d = Logger.getLogger(br.b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final br.b f86151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M f86152c;

    public c(br.b bVar, M m10) {
        this.f86151b = bVar;
        this.f86152c = m10;
    }

    public abstract void a() throws RouterException;

    public M b() {
        return this.f86152c;
    }

    public br.b c() {
        return this.f86151b;
    }

    public boolean d() throws InterruptedException {
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zD;
        try {
            zD = d();
        } catch (InterruptedException unused) {
            f86150d.info("Protocol wait before execution interrupted (on shutdown?): " + getClass().getSimpleName());
            zD = false;
        }
        if (zD) {
            try {
                a();
            } catch (Exception e10) {
                Throwable thA = os.a.a(e10);
                if (!(thA instanceof InterruptedException)) {
                    throw new RuntimeException("Fatal error while executing protocol '" + getClass().getSimpleName() + "': " + e10, e10);
                }
                f86150d.log(Level.INFO, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e10, thA);
            }
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}

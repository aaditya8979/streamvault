package y9;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import java.io.File;

/* JADX INFO: compiled from: PauseAllMarker.java */
/* JADX INFO: loaded from: classes10.dex */
public class c0 implements Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static File f87414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Long f87415f = 1000L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HandlerThread f87416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f87417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final da.b f87418d;

    public c0(da.b bVar) {
        this.f87418d = bVar;
    }

    public static void a() {
        File fileC = c();
        if (fileC.exists()) {
            ia.d.a(c0.class, "delete marker file " + fileC.delete(), new Object[0]);
        }
    }

    public static boolean b() {
        return c().exists();
    }

    public static File c() {
        if (f87414e == null) {
            f87414e = new File(ia.c.a().getCacheDir() + File.separator + ".filedownloader_pause_all_marker.b");
        }
        return f87414e;
    }

    public void d() {
        HandlerThread handlerThread = new HandlerThread("PauseAllChecker");
        this.f87416b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f87416b.getLooper(), this);
        this.f87417c = handler;
        handler.sendEmptyMessageDelayed(0, f87415f.longValue());
    }

    public void e() {
        this.f87417c.removeMessages(0);
        this.f87416b.quit();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            if (b()) {
                try {
                    this.f87418d.y();
                } catch (RemoteException e10) {
                    ia.d.c(this, e10, "pause all failed", new Object[0]);
                }
            }
            this.f87417c.sendEmptyMessageDelayed(0, f87415f.longValue());
            return true;
        } finally {
            a();
        }
    }
}

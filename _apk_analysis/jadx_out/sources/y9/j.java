package y9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FileDownloadMessageStation.java */
/* JADX INFO: loaded from: classes10.dex */
public class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f87438e = ia.b.a(5, "BlockCompleted");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f87439f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f87440g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f87441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue<u> f87442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f87443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<u> f87444d;

    /* JADX INFO: compiled from: FileDownloadMessageStation.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f87445b;

        public a(u uVar) {
            this.f87445b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f87445b.f();
        }
    }

    /* JADX INFO: compiled from: FileDownloadMessageStation.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f87446a = new j(null);
    }

    /* JADX INFO: compiled from: FileDownloadMessageStation.java */
    public static class c implements Handler.Callback {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public final void a(ArrayList<u> arrayList) {
            for (u uVar : arrayList) {
                if (!j.f(uVar)) {
                    uVar.f();
                }
            }
            arrayList.clear();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                ((u) message.obj).f();
            } else if (i10 == 2) {
                a((ArrayList) message.obj);
                j.d().h();
            }
            return true;
        }
    }

    public j() {
        this.f87443c = new Object();
        this.f87444d = new ArrayList<>();
        this.f87441a = new Handler(Looper.getMainLooper(), new c(null));
        this.f87442b = new LinkedBlockingQueue<>();
    }

    public /* synthetic */ j(a aVar) {
        this();
    }

    public static j d() {
        return b.f87446a;
    }

    public static boolean f(u uVar) {
        if (!uVar.e()) {
            return false;
        }
        f87438e.execute(new a(uVar));
        return true;
    }

    public static boolean g() {
        return f87439f > 0;
    }

    public final void c(u uVar) {
        synchronized (this.f87443c) {
            this.f87442b.offer(uVar);
        }
        h();
    }

    public final void e(u uVar) {
        Handler handler = this.f87441a;
        handler.sendMessage(handler.obtainMessage(1, uVar));
    }

    public final void h() {
        synchronized (this.f87443c) {
            if (this.f87444d.isEmpty()) {
                if (this.f87442b.isEmpty()) {
                    return;
                }
                int i10 = 0;
                if (g()) {
                    int i11 = f87439f;
                    int iMin = Math.min(this.f87442b.size(), f87440g);
                    while (i10 < iMin) {
                        this.f87444d.add(this.f87442b.remove());
                        i10++;
                    }
                    i10 = i11;
                } else {
                    this.f87442b.drainTo(this.f87444d);
                }
                Handler handler = this.f87441a;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.f87444d), i10);
            }
        }
    }

    public void i(u uVar) {
        j(uVar, false);
    }

    public void j(u uVar, boolean z10) {
        if (uVar.g()) {
            uVar.f();
            return;
        }
        if (f(uVar)) {
            return;
        }
        if (!g() && !this.f87442b.isEmpty()) {
            synchronized (this.f87443c) {
                if (!this.f87442b.isEmpty()) {
                    Iterator<u> it = this.f87442b.iterator();
                    while (it.hasNext()) {
                        e(it.next());
                    }
                }
                this.f87442b.clear();
            }
        }
        if (!g() || z10) {
            e(uVar);
        } else {
            c(uVar);
        }
    }
}

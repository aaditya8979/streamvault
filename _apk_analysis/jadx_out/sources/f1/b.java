package f1;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f61398b;

    public b(e eVar) {
        this.f61398b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f61398b.f61415m) {
            Intent intent = new Intent();
            intent.setClassName(this.f61398b.f61411i, "com.digitalturbine.ignite.cl.IgniteRemoteService");
            e eVar = this.f61398b;
            Context context = eVar.f61408f;
            if (context != null) {
                try {
                    context.bindService(intent, eVar, 1);
                } catch (Throwable th2) {
                    Object[] objArr = {th2};
                    l1.a aVar = l1.b.f73620b.f73621a;
                    if (aVar != null) {
                        aVar.e("Failed to bind IgniteRemoteService", objArr);
                    }
                    if (th2.getMessage() != null && th2.getMessage().contains("Too many bind requests")) {
                    } else {
                        h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, o1.a.a(th2, com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE));
                    }
                }
            }
        }
    }
}

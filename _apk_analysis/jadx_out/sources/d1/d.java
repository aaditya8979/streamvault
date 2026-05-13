package d1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import f1.h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.receiver.a f59547a = new com.digitalturbine.ignite.authenticator.receiver.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f59548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f1.a f59549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f59550d;

    public d(Context context, f1.a aVar, h hVar) {
        this.f59548b = context.getApplicationContext();
        this.f59549c = aVar;
        this.f59550d = hVar;
    }

    public final void a() {
        com.digitalturbine.ignite.authenticator.receiver.a aVar;
        l1.b.a("%s : start", "OneDTPropertyWatchdog");
        Context context = this.f59548b;
        if (context == null || (aVar = this.f59547a) == null || aVar.f14950b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 4);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
        this.f59547a.f14950b = true;
    }
}

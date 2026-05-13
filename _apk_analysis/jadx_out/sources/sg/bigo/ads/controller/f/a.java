package sg.bigo.ads.controller.f;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.d.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f83369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<InterfaceC1036a> f83370b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.controller.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1036a {
        void a(boolean z10);
    }

    public static synchronized void a(Context context, @Nullable InterfaceC1036a interfaceC1036a) {
        if (f83369a == null) {
            f83369a = new a();
            sg.bigo.ads.common.d.a.a().a(context, f83369a);
        }
        synchronized (f83369a.f83370b) {
            if (interfaceC1036a != null) {
                f83369a.f83370b.add(interfaceC1036a);
            }
        }
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        boolean zB = sg.bigo.ads.common.aa.c.b(context);
        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "Network state changed, available: ".concat(String.valueOf(zB)));
        synchronized (this.f83370b) {
            for (InterfaceC1036a interfaceC1036a : this.f83370b) {
                if (interfaceC1036a != null) {
                    interfaceC1036a.a(zB);
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "OnNetworkStateChangeListener is null object reference");
                }
            }
        }
    }
}

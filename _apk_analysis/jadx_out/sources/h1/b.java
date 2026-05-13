package h1;

import com.digitalturbine.ignite.authenticator.events.d;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f62968b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f62969a;

    public static void a(d dVar, Exception exc) {
        b(dVar, o1.a.a(exc, null));
    }

    public static void b(d dVar, Object... objArr) {
        l1.b.a("%s : dispatching event", "IgniteEventDispatcher");
        if (f62968b.f62969a != null) {
            t tVarA = t.a(dVar);
            if (tVarA == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", dVar);
            } else {
                new w(tVarA).a(objArr).a((String) null);
            }
        }
    }
}

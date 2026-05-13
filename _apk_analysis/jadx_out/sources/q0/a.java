package q0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.cast.dlna.dmc.DLNACastService;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr.a0;
import pr.t;
import r0.f;
import r0.l;
import r0.m;
import r0.o;
import tn.p;
import tn.x;
import ur.j;
import ur.s;
import ur.w;
import ur.y;
import yr.g;

/* JADX INFO: compiled from: DLNACastManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f77565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final w f77566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final w f77567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final s f77568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final s f77569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final s f77570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final s f77571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final p0.b f77572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final d f77573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static j f77574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public static cr.c f77575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static Context f77576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final ServiceConnection f77577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final List<e> f77578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Map<qr.a<?, ?, ?>, l> f77579p;

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DLNACastManager.kt */
    public static final class ServiceConnectionC0927a implements ServiceConnection {
        public final void m() {
            yr.c registry;
            cr.c cVar = a.f77575l;
            if (cVar != null && (registry = cVar.getRegistry()) != null) {
                registry.t(a.f77573j);
            }
            a.f77575l = null;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            p.k(componentName, "componentName");
            p0.b bVar = a.f77572i;
            x xVar = x.f85368a;
            String str = String.format("[%s] onBindingDied", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1));
            p.j(str, "java.lang.String.format(format, *args)");
            p0.b.i(bVar, str, null, 2, null);
            m();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p.k(componentName, "componentName");
            p.k(iBinder, "iBinder");
            cr.c cVar = (cr.c) iBinder;
            if (a.f77575l != cVar) {
                a.f77575l = cVar;
                p0.b bVar = a.f77572i;
                x xVar = x.f85368a;
                String str = String.format("onServiceConnected: [%s]", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1));
                p.j(str, "java.lang.String.format(format, *args)");
                p0.b.f(bVar, str, null, 2, null);
                yr.c registry = cVar.getRegistry();
                Collection<g> listeners = registry.getListeners();
                if (listeners == null || !listeners.contains(a.f77573j)) {
                    registry.n(a.f77573j);
                }
                a.r(a.f77565b, null, 1, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p.k(componentName, "componentName");
            p0.b bVar = a.f77572i;
            x xVar = x.f85368a;
            String str = String.format("[%s] onServiceDisconnected", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1));
            p.j(str, "java.lang.String.format(format, *args)");
            p0.b.i(bVar, str, null, 2, null);
            m();
        }
    }

    static {
        a aVar = new a();
        f77565b = aVar;
        f77566c = new w("MediaRenderer");
        f77567d = new w("MediaServer");
        f77568e = new y("AVTransport");
        f77569f = new y("RenderingControl");
        f77570g = new y("ContentDirectory");
        f77571h = new y("ConnectionManager");
        f77572i = p0.b.f76945b.a("CastManager");
        f77573j = new d(aVar);
        f77577n = new ServiceConnectionC0927a();
        f77578o = new ArrayList();
        f77579p = new LinkedHashMap();
    }

    public static /* synthetic */ void r(a aVar, j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = null;
        }
        aVar.q(jVar);
    }

    @Override // q0.e
    public void a(@NotNull qr.a<?, ?, ?> aVar) {
        p.k(aVar, C3978d4.i.G);
        if (h(aVar)) {
            Iterator<T> it = f77578o.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(aVar);
            }
        }
    }

    @Override // q0.e
    public void b(@NotNull qr.a<?, ?, ?> aVar) {
        p.k(aVar, C3978d4.i.G);
        if (h(aVar)) {
            Iterator<T> it = f77578o.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(aVar);
            }
        }
    }

    public final void g(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        f77576m = context.getApplicationContext();
        if ((context instanceof Application) || (context instanceof Activity)) {
            ((ContextWrapper) context).bindService(new Intent(context, (Class<?>) DLNACastService.class), f77577n, 1);
        } else {
            p0.b.c(f77572i, "bindCastService only support Application or Activity implementation.", null, 2, null);
        }
    }

    public final boolean h(qr.a<?, ?, ?> aVar) {
        j jVar = f77574k;
        return jVar == null || p.f(jVar, aVar.getType());
    }

    @NotNull
    public final l i(@NotNull qr.a<?, ?, ?> aVar, @NotNull o oVar) {
        br.b bVar;
        p.k(aVar, C3978d4.i.G);
        p.k(oVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        cr.c cVar = f77575l;
        if (cVar == null || (bVar = cVar.get()) == null) {
            return m.f78539a;
        }
        Map<qr.a<?, ?, ?>, l> map = f77579p;
        l lVar = map.get(aVar);
        if (lVar != null) {
            return lVar;
        }
        hr.b bVarB = bVar.b();
        p.j(bVarB, "getControlPoint(...)");
        f fVar = new f(bVarB, aVar, oVar);
        map.put(aVar, fVar);
        return fVar;
    }

    public final void j(@NotNull qr.a<?, ?, ?> aVar) {
        p.k(aVar, C3978d4.i.G);
        Map<qr.a<?, ?, ?>, l> map = f77579p;
        l lVar = map.get(aVar);
        f fVar = lVar instanceof f ? (f) lVar : null;
        if (fVar != null) {
            fVar.e(true);
        }
        map.put(aVar, null);
    }

    @NotNull
    public final s k() {
        return f77571h;
    }

    @NotNull
    public final s l() {
        return f77568e;
    }

    @NotNull
    public final s m() {
        return f77570g;
    }

    @NotNull
    public final s n() {
        return f77569f;
    }

    public final boolean o(@NotNull qr.a<?, ?, ?> aVar) {
        p.k(aVar, C3978d4.i.G);
        return f77579p.get(aVar) != null;
    }

    public final void p(@Nullable e eVar) {
        Collection<qr.a> collectionC;
        if (eVar == null) {
            return;
        }
        cr.c cVar = f77575l;
        if (cVar != null && (collectionC = cVar.getRegistry().c()) != null) {
            Iterator<T> it = collectionC.iterator();
            while (it.hasNext()) {
                qr.a<?, ?, ?> aVar = (qr.a) it.next();
                p.h(aVar);
                eVar.a(aVar);
            }
        }
        List<e> list = f77578o;
        if (list.contains(eVar)) {
            return;
        }
        list.add(eVar);
    }

    public final void q(@Nullable j jVar) {
        br.b bVar;
        cr.c cVar = f77575l;
        if (cVar == null || (bVar = cVar.get()) == null) {
            return;
        }
        f77574k = jVar;
        Collection<qr.a> collectionC = bVar.getRegistry().c();
        if (collectionC != null) {
            ArrayList<qr.a<?, ?, ?>> arrayList = new ArrayList();
            for (Object obj : collectionC) {
                qr.a aVar = (qr.a) obj;
                j jVar2 = f77574k;
                if (jVar2 == null || !p.f(jVar2, aVar.getType())) {
                    arrayList.add(obj);
                }
            }
            for (qr.a<?, ?, ?> aVar2 : arrayList) {
                for (e eVar : f77578o) {
                    p.h(aVar2);
                    eVar.b(aVar2);
                }
                bVar.getRegistry().A(aVar2.r().b());
            }
        }
        bVar.b().d(jVar != null ? new a0(jVar) : new t());
    }

    public final void s(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        if ((context instanceof Application) || (context instanceof Activity)) {
            ((ContextWrapper) context).unbindService(f77577n);
        } else {
            p0.b.c(f77572i, "bindCastService only support Application or Activity implementation.", null, 2, null);
        }
    }
}

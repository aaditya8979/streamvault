package q0;

import android.os.Handler;
import android.os.Looper;
import bo.d0;
import cn.f0;
import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DeviceRegistryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends yr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f77584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p0.b f77585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Handler f77586c;

    public d(@NotNull e eVar) {
        p.k(eVar, "deviceRegistryListener");
        this.f77584a = eVar;
        this.f77585b = p0.b.f76945b.a("DeviceRegistry");
        this.f77586c = new Handler(Looper.getMainLooper());
    }

    public static final void n(d dVar, qr.a aVar) {
        dVar.f77584a.a(aVar);
    }

    public static final void o(d dVar, qr.a aVar) {
        dVar.f77584a.b(aVar);
    }

    @Override // yr.a
    public void j(@NotNull yr.c cVar, @NotNull final qr.a<?, ?, ?> aVar) {
        p.k(cVar, "registry");
        p.k(aVar, C3978d4.i.G);
        p0.b.f(this.f77585b, "deviceAdded: " + p(aVar), null, 2, null);
        this.f77586c.post(new Runnable() { // from class: q0.b
            @Override // java.lang.Runnable
            public final void run() {
                d.n(this.f77580b, aVar);
            }
        });
    }

    @Override // yr.a
    public void k(@NotNull yr.c cVar, @NotNull final qr.a<?, ?, ?> aVar) {
        p.k(cVar, "registry");
        p.k(aVar, C3978d4.i.G);
        p0.b.i(this.f77585b, "deviceRemoved: " + p(aVar), null, 2, null);
        this.f77586c.post(new Runnable() { // from class: q0.c
            @Override // java.lang.Runnable
            public final void run() {
                d.o(this.f77582b, aVar);
            }
        });
    }

    public final String p(qr.a<?, ?, ?> aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(aVar.getType().getType());
        sb2.append("][");
        sb2.append(aVar.m().d());
        sb2.append("][");
        String strA = aVar.r().b().a();
        p.j(strA, "getIdentifierString(...)");
        sb2.append((String) f0.F0(d0.U0(strA, new String[]{"-"}, false, 0, 6, null)));
        sb2.append(']');
        return sb2.toString();
    }
}

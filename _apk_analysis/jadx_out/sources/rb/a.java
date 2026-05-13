package rb;

import androidx.annotation.Nullable;
import com.mgs.carparking.androidupnp.service.ClingUpnpService;
import pb.e;
import pb.f;
import ur.j;
import ur.s;
import ur.w;
import ur.y;

/* JADX INFO: compiled from: ClingManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f78871c = new y("AVTransport");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f78872d = new y("RenderingControl");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f78873e = new w("MediaRenderer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f78874f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClingUpnpService f78875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f78876b;

    public static a c() {
        if (sb.c.b(f78874f)) {
            f78874f = new a();
        }
        return f78874f;
    }

    public void a() {
        this.f78875a.onDestroy();
        this.f78876b.destroy();
    }

    @Nullable
    public e b() {
        if (sb.c.b(this.f78875a)) {
            return null;
        }
        pb.a.c().d(this.f78875a.c());
        return pb.a.c();
    }

    public yr.c d() {
        return this.f78875a.d();
    }

    public f e() {
        if (sb.c.b(this.f78876b)) {
            return null;
        }
        return this.f78876b.a();
    }

    public ClingUpnpService f() {
        return this.f78875a;
    }

    public void g() {
        if (sb.c.b(this.f78875a)) {
            return;
        }
        this.f78875a.c().c();
    }

    public void h(c cVar) {
        this.f78876b = cVar;
    }

    public void i(ClingUpnpService clingUpnpService) {
        this.f78875a = clingUpnpService;
    }
}

package ss;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import ts.h;

/* JADX INFO: compiled from: SubstituteLoggingEvent.java */
/* JADX INFO: loaded from: classes3.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Level f84567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Marker> f84568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f84570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f84571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f84572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f84573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Throwable f84575i;

    public void a(Marker marker) {
        if (marker == null) {
            return;
        }
        if (this.f84568b == null) {
            this.f84568b = new ArrayList(2);
        }
        this.f84568b.add(marker);
    }

    public Level b() {
        return this.f84567a;
    }

    public h c() {
        return this.f84570d;
    }

    public void d(Object[] objArr) {
        this.f84573g = objArr;
    }

    public void e(Level level) {
        this.f84567a = level;
    }

    public void f(h hVar) {
        this.f84570d = hVar;
    }

    public void g(String str) {
        this.f84569c = str;
    }

    public void h(String str) {
        this.f84572f = str;
    }

    public void i(String str) {
        this.f84571e = str;
    }

    public void j(Throwable th2) {
        this.f84575i = th2;
    }

    public void k(long j10) {
        this.f84574h = j10;
    }
}

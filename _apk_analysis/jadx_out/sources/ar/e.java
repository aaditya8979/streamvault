package ar;

/* JADX INFO: compiled from: Timeout.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vq.c f5289e = vq.b.a(e.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f5292c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f5293d;

    /* JADX INFO: compiled from: Timeout.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e f5296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5298f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5299g = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f5295c = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f5294b = this;

        public void c() {
            e eVar = this.f5296d;
            if (eVar != null) {
                synchronized (eVar.f5290a) {
                    h();
                    this.f5298f = 0L;
                }
            }
        }

        public void d() {
        }

        public void f() {
        }

        public final void g(a aVar) {
            a aVar2 = this.f5294b;
            aVar2.f5295c = aVar;
            this.f5294b = aVar;
            aVar.f5294b = aVar2;
            this.f5294b.f5295c = this;
        }

        public final void h() {
            a aVar = this.f5294b;
            aVar.f5295c = this.f5295c;
            this.f5295c.f5294b = aVar;
            this.f5295c = this;
            this.f5294b = this;
            this.f5299g = false;
        }
    }

    public e() {
        a aVar = new a();
        this.f5293d = aVar;
        this.f5290a = new Object();
        aVar.f5296d = this;
    }

    public e(Object obj) {
        a aVar = new a();
        this.f5293d = aVar;
        this.f5290a = obj;
        aVar.f5296d = this;
    }

    public void b() {
        synchronized (this.f5290a) {
            a aVar = this.f5293d;
            aVar.f5295c = aVar;
            aVar.f5294b = aVar;
        }
    }

    public a c() {
        synchronized (this.f5290a) {
            long j10 = this.f5292c - this.f5291b;
            a aVar = this.f5293d;
            a aVar2 = aVar.f5294b;
            if (aVar2 == aVar) {
                return null;
            }
            if (aVar2.f5298f > j10) {
                return null;
            }
            aVar2.h();
            aVar2.f5299g = true;
            return aVar2;
        }
    }

    public long d() {
        return this.f5291b;
    }

    public long e() {
        return this.f5292c;
    }

    public long f() {
        synchronized (this.f5290a) {
            a aVar = this.f5293d;
            a aVar2 = aVar.f5294b;
            if (aVar2 == aVar) {
                return -1L;
            }
            long j10 = (this.f5291b + aVar2.f5298f) - this.f5292c;
            if (j10 < 0) {
                j10 = 0;
            }
            return j10;
        }
    }

    public void g(a aVar) {
        h(aVar, 0L);
    }

    public void h(a aVar, long j10) {
        synchronized (this.f5290a) {
            if (aVar.f5298f != 0) {
                aVar.h();
                aVar.f5298f = 0L;
            }
            aVar.f5296d = this;
            aVar.f5299g = false;
            aVar.f5297e = j10;
            aVar.f5298f = this.f5292c + j10;
            a aVar2 = this.f5293d.f5295c;
            while (aVar2 != this.f5293d && aVar2.f5298f > aVar.f5298f) {
                aVar2 = aVar2.f5295c;
            }
            aVar2.g(aVar);
        }
    }

    public void i(long j10) {
        this.f5291b = j10;
    }

    public long j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f5292c = jCurrentTimeMillis;
        return jCurrentTimeMillis;
    }

    public void k(long j10) {
        this.f5292c = j10;
    }

    public void l() {
        a aVar;
        long j10 = this.f5292c - this.f5291b;
        while (true) {
            try {
                synchronized (this.f5290a) {
                    a aVar2 = this.f5293d;
                    aVar = aVar2.f5294b;
                    if (aVar != aVar2 && aVar.f5298f <= j10) {
                        aVar.h();
                        aVar.f5299g = true;
                        aVar.d();
                    }
                    return;
                }
                aVar.f();
            } catch (Throwable th2) {
                f5289e.d("EXCEPTION ", th2);
            }
        }
    }

    public void m(long j10) {
        this.f5292c = j10;
        l();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        for (a aVar = this.f5293d.f5294b; aVar != this.f5293d; aVar = aVar.f5294b) {
            stringBuffer.append("-->");
            stringBuffer.append(aVar);
        }
        return stringBuffer.toString();
    }
}

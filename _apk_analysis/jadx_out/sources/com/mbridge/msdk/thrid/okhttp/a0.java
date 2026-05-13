package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.io.Closeable;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f40155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f40156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f40159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f40160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f40161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f40162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f40163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f40164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f40165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f40166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile c f40167m;

    /* JADX INFO: compiled from: Response.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f40168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w f40169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f40171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public q f40172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r.a f40173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b0 f40174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a0 f40175h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public a0 f40176i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public a0 f40177j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f40178k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f40179l;

        public a() {
            this.f40170c = -1;
            this.f40173f = new r.a();
        }

        public a(a0 a0Var) {
            this.f40170c = -1;
            this.f40168a = a0Var.f40155a;
            this.f40169b = a0Var.f40156b;
            this.f40170c = a0Var.f40157c;
            this.f40171d = a0Var.f40158d;
            this.f40172e = a0Var.f40159e;
            this.f40173f = a0Var.f40160f.a();
            this.f40174g = a0Var.f40161g;
            this.f40175h = a0Var.f40162h;
            this.f40176i = a0Var.f40163i;
            this.f40177j = a0Var.f40164j;
            this.f40178k = a0Var.f40165k;
            this.f40179l = a0Var.f40166l;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f40161g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (a0Var.f40162h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (a0Var.f40163i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (a0Var.f40164j == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        private void b(a0 a0Var) {
            if (a0Var.f40161g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(int i10) {
            this.f40170c = i10;
            return this;
        }

        public a a(long j10) {
            this.f40179l = j10;
            return this;
        }

        public a a(a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f40176i = a0Var;
            return this;
        }

        public a a(b0 b0Var) {
            this.f40174g = b0Var;
            return this;
        }

        public a a(q qVar) {
            this.f40172e = qVar;
            return this;
        }

        public a a(r rVar) {
            this.f40173f = rVar.a();
            return this;
        }

        public a a(w wVar) {
            this.f40169b = wVar;
            return this;
        }

        public a a(y yVar) {
            this.f40168a = yVar;
            return this;
        }

        public a a(String str) {
            this.f40171d = str;
            return this;
        }

        public a a(String str, String str2) {
            this.f40173f.a(str, str2);
            return this;
        }

        public a0 a() {
            if (this.f40168a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f40169b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f40170c >= 0) {
                if (this.f40171d != null) {
                    return new a0(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f40170c);
        }

        public a b(long j10) {
            this.f40178k = j10;
            return this;
        }

        public a b(String str, String str2) {
            this.f40173f.c(str, str2);
            return this;
        }

        public a c(a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f40175h = a0Var;
            return this;
        }

        public a d(a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f40177j = a0Var;
            return this;
        }
    }

    public a0(a aVar) {
        this.f40155a = aVar.f40168a;
        this.f40156b = aVar.f40169b;
        this.f40157c = aVar.f40170c;
        this.f40158d = aVar.f40171d;
        this.f40159e = aVar.f40172e;
        this.f40160f = aVar.f40173f.a();
        this.f40161g = aVar.f40174g;
        this.f40162h = aVar.f40175h;
        this.f40163i = aVar.f40176i;
        this.f40164j = aVar.f40177j;
        this.f40165k = aVar.f40178k;
        this.f40166l = aVar.f40179l;
    }

    public String a(String str, String str2) {
        String strB = this.f40160f.b(str);
        return strB != null ? strB : str2;
    }

    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f40161g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public b0 d() {
        return this.f40161g;
    }

    public c h() {
        c cVar = this.f40167m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f40160f);
        this.f40167m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f40157c;
    }

    public q l() {
        return this.f40159e;
    }

    public r m() {
        return this.f40160f;
    }

    public boolean n() {
        int i10 = this.f40157c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f40158d;
    }

    public a p() {
        return new a(this);
    }

    public a0 q() {
        return this.f40164j;
    }

    public long r() {
        return this.f40166l;
    }

    public y s() {
        return this.f40155a;
    }

    public long t() {
        return this.f40165k;
    }

    public String toString() {
        return "Response{protocol=" + this.f40156b + ", code=" + this.f40157c + ", message=" + this.f40158d + ", url=" + this.f40155a.g() + '}';
    }
}

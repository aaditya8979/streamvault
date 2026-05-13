package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes9.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f40809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f40811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f40812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Object> f40813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f40814f;

    /* JADX INFO: compiled from: Request.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f40815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r.a f40817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z f40818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<Class<?>, Object> f40819e;

        public a() {
            this.f40819e = Collections.emptyMap();
            this.f40816b = "GET";
            this.f40817c = new r.a();
        }

        public a(y yVar) {
            this.f40819e = Collections.emptyMap();
            this.f40815a = yVar.f40809a;
            this.f40816b = yVar.f40810b;
            this.f40818d = yVar.f40812d;
            this.f40819e = yVar.f40813e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(yVar.f40813e);
            this.f40817c = yVar.f40811c.a();
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a a(r rVar) {
            this.f40817c = rVar.a();
            return this;
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f40815a = sVar;
            return this;
        }

        public a a(z zVar) {
            return a("DELETE", zVar);
        }

        public a a(String str) {
            this.f40817c.b(str);
            return this;
        }

        public a a(String str, z zVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (zVar != null || !com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                this.f40816b = str;
                this.f40818d = zVar;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        public a a(String str, String str2) {
            this.f40817c.a(str, str2);
            return this;
        }

        public y a() {
            if (this.f40815a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f40309d);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return a(s.b(str));
        }

        public a b(String str, String str2) {
            this.f40817c.c(str, str2);
            return this;
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }
    }

    public y(a aVar) {
        this.f40809a = aVar.f40815a;
        this.f40810b = aVar.f40816b;
        this.f40811c = aVar.f40817c.a();
        this.f40812d = aVar.f40818d;
        this.f40813e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f40819e);
    }

    public z a() {
        return this.f40812d;
    }

    public String a(String str) {
        return this.f40811c.b(str);
    }

    public c b() {
        c cVar = this.f40814f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f40811c);
        this.f40814f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f40811c;
    }

    public boolean d() {
        return this.f40809a.h();
    }

    public String e() {
        return this.f40810b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f40809a;
    }

    public String toString() {
        return "Request{method=" + this.f40810b + ", url=" + this.f40809a + ", tags=" + this.f40813e + '}';
    }
}

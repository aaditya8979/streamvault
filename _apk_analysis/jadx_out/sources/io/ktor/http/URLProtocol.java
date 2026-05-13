package io.ktor.http;

import cn.p0;
import cn.w;
import cn.x;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kl.l;
import kl.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: URLProtocol.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class URLProtocol implements Serializable {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final URLProtocol f71172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final URLProtocol f71173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final URLProtocol f71174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final URLProtocol f71175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final URLProtocol f71176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Map<String, URLProtocol> f71177g;
    private final int defaultPort;

    @NotNull
    private final String name;

    /* JADX INFO: compiled from: URLProtocol.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final URLProtocol a(@NotNull String str) {
            p.k(str, "name");
            String strC = z.c(str);
            URLProtocol uRLProtocol = URLProtocol.Companion.b().get(strC);
            return uRLProtocol == null ? new URLProtocol(strC, 0) : uRLProtocol;
        }

        @NotNull
        public final Map<String, URLProtocol> b() {
            return URLProtocol.f71177g;
        }

        @NotNull
        public final URLProtocol c() {
            return URLProtocol.f71172b;
        }
    }

    static {
        URLProtocol uRLProtocol = new URLProtocol("http", 80);
        f71172b = uRLProtocol;
        URLProtocol uRLProtocol2 = new URLProtocol("https", 443);
        f71173c = uRLProtocol2;
        URLProtocol uRLProtocol3 = new URLProtocol("ws", 80);
        f71174d = uRLProtocol3;
        URLProtocol uRLProtocol4 = new URLProtocol("wss", 443);
        f71175e = uRLProtocol4;
        URLProtocol uRLProtocol5 = new URLProtocol("socks", 1080);
        f71176f = uRLProtocol5;
        List listP = w.p(uRLProtocol, uRLProtocol2, uRLProtocol3, uRLProtocol4, uRLProtocol5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(p0.f(x.x(listP, 10)), 16));
        for (Object obj : listP) {
            linkedHashMap.put(((URLProtocol) obj).name, obj);
        }
        f71177g = linkedHashMap;
    }

    public URLProtocol(@NotNull String str, int i10) {
        p.k(str, "name");
        this.name = str;
        this.defaultPort = i10;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= str.length()) {
                z10 = true;
                break;
            } else if (!l.a(str.charAt(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException("All characters should be lower case".toString());
        }
    }

    public static /* synthetic */ URLProtocol copy$default(URLProtocol uRLProtocol, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uRLProtocol.name;
        }
        if ((i11 & 2) != 0) {
            i10 = uRLProtocol.defaultPort;
        }
        return uRLProtocol.copy(str, i10);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.defaultPort;
    }

    @NotNull
    public final URLProtocol copy(@NotNull String str, int i10) {
        p.k(str, "name");
        return new URLProtocol(str, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLProtocol)) {
            return false;
        }
        URLProtocol uRLProtocol = (URLProtocol) obj;
        return p.f(this.name, uRLProtocol.name) && this.defaultPort == uRLProtocol.defaultPort;
    }

    public final int getDefaultPort() {
        return this.defaultPort;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Integer.hashCode(this.defaultPort);
    }

    @NotNull
    public String toString() {
        return "URLProtocol(name=" + this.name + ", defaultPort=" + this.defaultPort + ')';
    }
}

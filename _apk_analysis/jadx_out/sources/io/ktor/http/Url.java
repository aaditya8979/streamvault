package io.ktor.http;

import bo.d0;
import cn.f0;
import cn.w;
import gl.t0;
import io.ktor.http.Url;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.KSerializer;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sl.n;
import so.k;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Url.kt */
/* JADX INFO: loaded from: classes8.dex */
@k(with = t0.class)
public final class Url implements Serializable {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private final bn.g encodedFragment$delegate;

    @NotNull
    private final bn.g encodedPassword$delegate;

    @NotNull
    private final bn.g encodedPath$delegate;

    @NotNull
    private final bn.g encodedPathAndQuery$delegate;

    @NotNull
    private final bn.g encodedQuery$delegate;

    @NotNull
    private final bn.g encodedUser$delegate;

    @NotNull
    private final String fragment;

    @NotNull
    private final String host;

    @NotNull
    private final b parameters;

    @Nullable
    private final String password;

    @NotNull
    private final List<String> pathSegments;

    @NotNull
    private final URLProtocol protocol;

    @Nullable
    private final URLProtocol protocolOrNull;

    @NotNull
    private final List<String> rawSegments;

    @NotNull
    private final bn.g segments$delegate;
    private final int specifiedPort;
    private final boolean trailingQuery;

    @NotNull
    private final String urlString;

    @Nullable
    private final String user;

    /* JADX INFO: compiled from: Url.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<Url> serializer() {
            return t0.f62621a;
        }
    }

    public Url(@Nullable URLProtocol uRLProtocol, @NotNull String str, int i10, @NotNull final List<String> list, @NotNull b bVar, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z10, @NotNull String str5) {
        p.k(str, "host");
        p.k(list, "pathSegments");
        p.k(bVar, "parameters");
        p.k(str2, ContainerActivity.FRAGMENT);
        p.k(str5, "urlString");
        this.host = str;
        this.specifiedPort = i10;
        this.parameters = bVar;
        this.fragment = str2;
        this.user = str3;
        this.password = str4;
        this.trailingQuery = z10;
        this.urlString = str5;
        boolean z11 = false;
        if (i10 >= 0 && i10 < 65536) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i10).toString());
        }
        this.pathSegments = list;
        this.rawSegments = list;
        this.segments$delegate = kotlin.b.b(new sn.a() { // from class: gl.j0
            @Override // sn.a
            public final Object invoke() {
                return Url.n(list);
            }
        });
        this.protocolOrNull = uRLProtocol;
        this.protocol = uRLProtocol == null ? URLProtocol.Companion.c() : uRLProtocol;
        this.encodedPath$delegate = kotlin.b.b(new sn.a() { // from class: gl.k0
            @Override // sn.a
            public final Object invoke() {
                return Url.k(list, this);
            }
        });
        this.encodedQuery$delegate = kotlin.b.b(new sn.a() { // from class: gl.l0
            @Override // sn.a
            public final Object invoke() {
                return Url.l(this.f62559b);
            }
        });
        this.encodedPathAndQuery$delegate = kotlin.b.b(new sn.a() { // from class: gl.m0
            @Override // sn.a
            public final Object invoke() {
                return Url.j(this.f62563b);
            }
        });
        this.encodedUser$delegate = kotlin.b.b(new sn.a() { // from class: gl.n0
            @Override // sn.a
            public final Object invoke() {
                return Url.m(this.f62564b);
            }
        });
        this.encodedPassword$delegate = kotlin.b.b(new sn.a() { // from class: gl.o0
            @Override // sn.a
            public final Object invoke() {
                return Url.i(this.f62565b);
            }
        });
        this.encodedFragment$delegate = kotlin.b.b(new sn.a() { // from class: gl.p0
            @Override // sn.a
            public final Object invoke() {
                return Url.h(this.f62566b);
            }
        });
    }

    public static /* synthetic */ void getPathSegments$annotations() {
    }

    public static final String h(Url url) {
        int iQ0 = d0.q0(url.urlString, '#', 0, false, 6, null) + 1;
        if (iQ0 == 0) {
            return "";
        }
        String strSubstring = url.urlString.substring(iQ0);
        p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String i(Url url) {
        String str = url.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        String strSubstring = url.urlString.substring(d0.q0(url.urlString, ':', url.protocol.getName().length() + 3, false, 4, null) + 1, d0.q0(url.urlString, '@', 0, false, 6, null));
        p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String j(Url url) {
        int iQ0 = d0.q0(url.urlString, '/', url.protocol.getName().length() + 3, false, 4, null);
        if (iQ0 == -1) {
            return "";
        }
        int iQ02 = d0.q0(url.urlString, '#', iQ0, false, 4, null);
        if (iQ02 == -1) {
            String strSubstring = url.urlString.substring(iQ0);
            p.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iQ0, iQ02);
        p.j(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final String k(List list, Url url) {
        int iQ0;
        if (list.isEmpty() || (iQ0 = d0.q0(url.urlString, '/', url.protocol.getName().length() + 3, false, 4, null)) == -1) {
            return "";
        }
        int iT0 = d0.t0(url.urlString, new char[]{'?', '#'}, iQ0, false, 4, null);
        if (iT0 == -1) {
            String strSubstring = url.urlString.substring(iQ0);
            p.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iQ0, iT0);
        p.j(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final String l(Url url) {
        int iQ0 = d0.q0(url.urlString, '?', 0, false, 6, null) + 1;
        if (iQ0 == 0) {
            return "";
        }
        int iQ02 = d0.q0(url.urlString, '#', iQ0, false, 4, null);
        if (iQ02 == -1) {
            String strSubstring = url.urlString.substring(iQ0);
            p.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iQ0, iQ02);
        p.j(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final String m(Url url) {
        String str = url.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.protocol.getName().length() + 3;
        String strSubstring = url.urlString.substring(length, d0.t0(url.urlString, new char[]{':', '@'}, length, false, 4, null));
        p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List n(List list) {
        if (list.isEmpty()) {
            return w.m();
        }
        return list.subList((!(((CharSequence) f0.t0(list)).length() == 0) || list.size() <= 1) ? 0 : 1, ((CharSequence) f0.F0(list)).length() == 0 ? w.o(list) : w.o(list) + 1);
    }

    private final Object writeReplace() {
        return n.a(UrlJvmSerializer.INSTANCE, this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Url.class != obj.getClass()) {
            return false;
        }
        return p.f(this.urlString, ((Url) obj).urlString);
    }

    @NotNull
    public final String getEncodedFragment() {
        return (String) this.encodedFragment$delegate.getValue();
    }

    @Nullable
    public final String getEncodedPassword() {
        return (String) this.encodedPassword$delegate.getValue();
    }

    @NotNull
    public final String getEncodedPath() {
        return (String) this.encodedPath$delegate.getValue();
    }

    @NotNull
    public final String getEncodedPathAndQuery() {
        return (String) this.encodedPathAndQuery$delegate.getValue();
    }

    @NotNull
    public final String getEncodedQuery() {
        return (String) this.encodedQuery$delegate.getValue();
    }

    @Nullable
    public final String getEncodedUser() {
        return (String) this.encodedUser$delegate.getValue();
    }

    @NotNull
    public final String getFragment() {
        return this.fragment;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final b getParameters() {
        return this.parameters;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    public final int getPort() {
        Integer numValueOf = Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.getDefaultPort();
    }

    @NotNull
    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    @Nullable
    public final URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    @NotNull
    public final List<String> getRawSegments() {
        return this.rawSegments;
    }

    @NotNull
    public final List<String> getSegments() {
        return (List) this.segments$delegate.getValue();
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    @Nullable
    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    @NotNull
    public String toString() {
        return this.urlString;
    }
}

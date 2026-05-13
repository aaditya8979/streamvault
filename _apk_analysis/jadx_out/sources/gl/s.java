package gl;

import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    @NotNull
    public static final String[] V0;

    @NotNull
    public static final List<String> W0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f62569a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f62571b = com.safedk.android.utils.k.f53181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f62573c = "Accept-Charset";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f62575d = "Accept-Encoding";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f62577e = "Accept-Language";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f62579f = "Accept-Ranges";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f62581g = "Age";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f62583h = "Allow";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f62585i = "ALPN";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f62587j = "Authentication-Info";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f62589k = "Authorization";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f62591l = "Cache-Control";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f62593m = "Connection";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f62595n = "Content-Disposition";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f62597o = "Content-Encoding";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f62599p = "Content-Language";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f62601q = "Content-Length";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f62603r = "Content-Location";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f62605s = "Content-Range";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f62607t = "Content-Type";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f62609u = "Cookie";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f62611v = "DASL";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f62613w = "Date";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f62615x = "DAV";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final String f62617y = "Depth";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final String f62619z = "Destination";

    @NotNull
    public static final String A = Command.HTTP_HEADER_ETAG;

    @NotNull
    public static final String B = "Expect";

    @NotNull
    public static final String C = "Expires";

    @NotNull
    public static final String D = "From";

    @NotNull
    public static final String E = "Forwarded";

    @NotNull
    public static final String F = "Host";

    @NotNull
    public static final String G = "HTTP2-Settings";

    @NotNull
    public static final String H = "If";

    @NotNull
    public static final String I = "If-Match";

    @NotNull
    public static final String J = "If-Modified-Since";

    @NotNull
    public static final String K = "If-None-Match";

    @NotNull
    public static final String L = "If-Range";

    @NotNull
    public static final String M = "If-Schedule-Tag-Match";

    @NotNull
    public static final String N = "If-Unmodified-Since";

    @NotNull
    public static final String O = "Last-Modified";

    @NotNull
    public static final String P = "Location";

    @NotNull
    public static final String Q = "Lock-Token";

    @NotNull
    public static final String R = "Link";

    @NotNull
    public static final String S = "Max-Forwards";

    @NotNull
    public static final String T = "MIME-Version";

    @NotNull
    public static final String U = "Ordering-Type";

    @NotNull
    public static final String V = "Origin";

    @NotNull
    public static final String W = "Overwrite";

    @NotNull
    public static final String X = "Position";

    @NotNull
    public static final String Y = "Pragma";

    @NotNull
    public static final String Z = "Prefer";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final String f62570a0 = "Preference-Applied";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final String f62572b0 = "Proxy-Authenticate";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final String f62574c0 = "Proxy-Authentication-Info";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final String f62576d0 = "Proxy-Authorization";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final String f62578e0 = "Public-Key-Pins";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final String f62580f0 = "Public-Key-Pins-Report-Only";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final String f62582g0 = Command.HTTP_HEADER_RANGE;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public static final String f62584h0 = "Referer";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final String f62586i0 = CommonGatewayClient.HEADER_RETRY_AFTER;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final String f62588j0 = "Schedule-Reply";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final String f62590k0 = "Schedule-Tag";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final String f62592l0 = "Sec-WebSocket-Accept";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final String f62594m0 = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final String f62596n0 = "Sec-WebSocket-Key";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final String f62598o0 = "Sec-WebSocket-Protocol";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final String f62600p0 = "Sec-WebSocket-Version";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final String f62602q0 = "Server";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final String f62604r0 = "Set-Cookie";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final String f62606s0 = "SLUG";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final String f62608t0 = "Strict-Transport-Security";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final String f62610u0 = "TE";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public static final String f62612v0 = AndroidInitializeBoldSDK.MSG_TIMEOUT;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final String f62614w0 = "Trailer";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final String f62616x0 = "Transfer-Encoding";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final String f62618y0 = "Upgrade";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    public static final String f62620z0 = "User-Agent";

    @NotNull
    public static final String A0 = "Vary";

    @NotNull
    public static final String B0 = "Via";

    @NotNull
    public static final String C0 = "Warning";

    @NotNull
    public static final String D0 = "WWW-Authenticate";

    @NotNull
    public static final String E0 = "Access-Control-Allow-Origin";

    @NotNull
    public static final String F0 = "Access-Control-Allow-Methods";

    @NotNull
    public static final String G0 = "Access-Control-Allow-Credentials";

    @NotNull
    public static final String H0 = "Access-Control-Allow-Headers";

    @NotNull
    public static final String I0 = "Access-Control-Request-Method";

    @NotNull
    public static final String J0 = "Access-Control-Request-Headers";

    @NotNull
    public static final String K0 = "Access-Control-Expose-Headers";

    @NotNull
    public static final String L0 = "Access-Control-Max-Age";

    @NotNull
    public static final String M0 = "X-Http-Method-Override";

    @NotNull
    public static final String N0 = "X-Forwarded-Host";

    @NotNull
    public static final String O0 = "X-Forwarded-Server";

    @NotNull
    public static final String P0 = "X-Forwarded-Proto";

    @NotNull
    public static final String Q0 = "X-Forwarded-For";

    @NotNull
    public static final String R0 = "X-Forwarded-Port";

    @NotNull
    public static final String S0 = "X-Request-ID";

    @NotNull
    public static final String T0 = "X-Correlation-ID";

    @NotNull
    public static final String U0 = "X-Total-Count";

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        V0 = strArr;
        W0 = cn.p.f(strArr);
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "name");
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (tn.p.m(cCharAt, 32) <= 0 || t.b(cCharAt)) {
                throw new IllegalHeaderNameException(str, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    public final void b(@NotNull String str) {
        tn.p.k(str, "value");
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (tn.p.m(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new IllegalHeaderValueException(str, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    @NotNull
    public final String c() {
        return f62571b;
    }

    @NotNull
    public final String d() {
        return f62573c;
    }

    @NotNull
    public final String e() {
        return f62589k;
    }

    @NotNull
    public final String f() {
        return f62597o;
    }

    @NotNull
    public final String g() {
        return f62601q;
    }

    @NotNull
    public final String h() {
        return f62605s;
    }

    @NotNull
    public final String i() {
        return f62607t;
    }

    @NotNull
    public final String j() {
        return f62609u;
    }

    @NotNull
    public final String k() {
        return f62613w;
    }

    @NotNull
    public final String l() {
        return A;
    }

    @NotNull
    public final String m() {
        return C;
    }

    @NotNull
    public final String n() {
        return F;
    }

    @NotNull
    public final String o() {
        return J;
    }

    @NotNull
    public final String p() {
        return L;
    }

    @NotNull
    public final String q() {
        return N;
    }

    @NotNull
    public final String r() {
        return O;
    }

    @NotNull
    public final String s() {
        return P;
    }

    @NotNull
    public final String t() {
        return f62582g0;
    }

    @NotNull
    public final String u() {
        return f62586i0;
    }

    @NotNull
    public final String v() {
        return f62616x0;
    }

    @NotNull
    public final List<String> w() {
        return W0;
    }

    @NotNull
    public final String x() {
        return f62620z0;
    }
}

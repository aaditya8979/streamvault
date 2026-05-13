package gl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpStatusCode.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements Comparable<a0> {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public static final List<a0> f62462f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, a0> f62464g0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f62485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f62457d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a0 f62459e = new a0(100, "Continue");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a0 f62461f = new a0(101, "Switching Protocols");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a0 f62463g = new a0(102, "Processing");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a0 f62465h = new a0(200, "OK");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a0 f62466i = new a0(201, "Created");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a0 f62467j = new a0(202, "Accepted");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a0 f62468k = new a0(203, "Non-Authoritative Information");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a0 f62469l = new a0(204, "No Content");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a0 f62470m = new a0(205, "Reset Content");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a0 f62471n = new a0(206, "Partial Content");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a0 f62472o = new a0(207, "Multi-Status");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a0 f62473p = new a0(300, "Multiple Choices");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a0 f62474q = new a0(301, "Moved Permanently");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a0 f62475r = new a0(302, "Found");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a0 f62476s = new a0(303, "See Other");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final a0 f62477t = new a0(304, "Not Modified");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final a0 f62478u = new a0(305, "Use Proxy");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a0 f62479v = new a0(306, "Switch Proxy");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final a0 f62480w = new a0(307, "Temporary Redirect");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final a0 f62481x = new a0(308, "Permanent Redirect");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a0 f62482y = new a0(400, "Bad Request");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a0 f62483z = new a0(401, "Unauthorized");

    @NotNull
    public static final a0 A = new a0(402, "Payment Required");

    @NotNull
    public static final a0 B = new a0(403, "Forbidden");

    @NotNull
    public static final a0 C = new a0(404, "Not Found");

    @NotNull
    public static final a0 D = new a0(405, "Method Not Allowed");

    @NotNull
    public static final a0 E = new a0(406, "Not Acceptable");

    @NotNull
    public static final a0 F = new a0(407, "Proxy Authentication Required");

    @NotNull
    public static final a0 G = new a0(408, "Request Timeout");

    @NotNull
    public static final a0 H = new a0(409, "Conflict");

    @NotNull
    public static final a0 I = new a0(410, "Gone");

    @NotNull
    public static final a0 J = new a0(411, "Length Required");

    @NotNull
    public static final a0 K = new a0(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed");

    @NotNull
    public static final a0 L = new a0(TTAdConstant.VIDEO_INFO_CODE, "Payload Too Large");

    @NotNull
    public static final a0 M = new a0(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long");

    @NotNull
    public static final a0 N = new a0(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type");

    @NotNull
    public static final a0 O = new a0(416, "Requested Range Not Satisfiable");

    @NotNull
    public static final a0 P = new a0(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed");

    @NotNull
    public static final a0 Q = new a0(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity");

    @NotNull
    public static final a0 R = new a0(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked");

    @NotNull
    public static final a0 S = new a0(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency");

    @NotNull
    public static final a0 T = new a0(TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early");

    @NotNull
    public static final a0 U = new a0(426, "Upgrade Required");

    @NotNull
    public static final a0 V = new a0(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, "Too Many Requests");

    @NotNull
    public static final a0 W = new a0(431, "Request Header Fields Too Large");

    @NotNull
    public static final a0 X = new a0(500, "Internal Server Error");

    @NotNull
    public static final a0 Y = new a0(501, "Not Implemented");

    @NotNull
    public static final a0 Z = new a0(502, "Bad Gateway");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final a0 f62454a0 = new a0(503, "Service Unavailable");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public static final a0 f62455b0 = new a0(504, "Gateway Timeout");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final a0 f62456c0 = new a0(505, "HTTP Version Not Supported");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public static final a0 f62458d0 = new a0(506, "Variant Also Negotiates");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public static final a0 f62460e0 = new a0(507, "Insufficient Storage");

    /* JADX INFO: compiled from: HttpStatusCode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final a0 A() {
            return a0.f62477t;
        }

        @NotNull
        public final a0 B() {
            return a0.f62465h;
        }

        @NotNull
        public final a0 C() {
            return a0.f62471n;
        }

        @NotNull
        public final a0 D() {
            return a0.L;
        }

        @NotNull
        public final a0 E() {
            return a0.A;
        }

        @NotNull
        public final a0 F() {
            return a0.f62481x;
        }

        @NotNull
        public final a0 G() {
            return a0.K;
        }

        @NotNull
        public final a0 H() {
            return a0.f62463g;
        }

        @NotNull
        public final a0 I() {
            return a0.F;
        }

        @NotNull
        public final a0 J() {
            return a0.W;
        }

        @NotNull
        public final a0 K() {
            return a0.G;
        }

        @NotNull
        public final a0 L() {
            return a0.M;
        }

        @NotNull
        public final a0 M() {
            return a0.O;
        }

        @NotNull
        public final a0 N() {
            return a0.f62470m;
        }

        @NotNull
        public final a0 O() {
            return a0.f62476s;
        }

        @NotNull
        public final a0 P() {
            return a0.f62454a0;
        }

        @NotNull
        public final a0 Q() {
            return a0.f62479v;
        }

        @NotNull
        public final a0 R() {
            return a0.f62461f;
        }

        @NotNull
        public final a0 S() {
            return a0.f62480w;
        }

        @NotNull
        public final a0 T() {
            return a0.T;
        }

        @NotNull
        public final a0 U() {
            return a0.V;
        }

        @NotNull
        public final a0 V() {
            return a0.f62483z;
        }

        @NotNull
        public final a0 W() {
            return a0.Q;
        }

        @NotNull
        public final a0 X() {
            return a0.N;
        }

        @NotNull
        public final a0 Y() {
            return a0.U;
        }

        @NotNull
        public final a0 Z() {
            return a0.f62478u;
        }

        @NotNull
        public final a0 a(int i10) {
            a0 a0Var = (a0) a0.f62464g0.get(Integer.valueOf(i10));
            return a0Var == null ? new a0(i10, "Unknown Status Code") : a0Var;
        }

        @NotNull
        public final a0 a0() {
            return a0.f62458d0;
        }

        @NotNull
        public final a0 b() {
            return a0.f62467j;
        }

        @NotNull
        public final a0 b0() {
            return a0.f62456c0;
        }

        @NotNull
        public final a0 c() {
            return a0.Z;
        }

        @NotNull
        public final a0 d() {
            return a0.f62482y;
        }

        @NotNull
        public final a0 e() {
            return a0.H;
        }

        @NotNull
        public final a0 f() {
            return a0.f62459e;
        }

        @NotNull
        public final a0 g() {
            return a0.f62466i;
        }

        @NotNull
        public final a0 h() {
            return a0.P;
        }

        @NotNull
        public final a0 i() {
            return a0.S;
        }

        @NotNull
        public final a0 j() {
            return a0.B;
        }

        @NotNull
        public final a0 k() {
            return a0.f62475r;
        }

        @NotNull
        public final a0 l() {
            return a0.f62455b0;
        }

        @NotNull
        public final a0 m() {
            return a0.I;
        }

        @NotNull
        public final a0 n() {
            return a0.f62460e0;
        }

        @NotNull
        public final a0 o() {
            return a0.X;
        }

        @NotNull
        public final a0 p() {
            return a0.J;
        }

        @NotNull
        public final a0 q() {
            return a0.R;
        }

        @NotNull
        public final a0 r() {
            return a0.D;
        }

        @NotNull
        public final a0 s() {
            return a0.f62474q;
        }

        @NotNull
        public final a0 t() {
            return a0.f62472o;
        }

        @NotNull
        public final a0 u() {
            return a0.f62473p;
        }

        @NotNull
        public final a0 v() {
            return a0.f62469l;
        }

        @NotNull
        public final a0 w() {
            return a0.f62468k;
        }

        @NotNull
        public final a0 x() {
            return a0.E;
        }

        @NotNull
        public final a0 y() {
            return a0.C;
        }

        @NotNull
        public final a0 z() {
            return a0.Y;
        }
    }

    static {
        List<a0> listA = b0.a();
        f62462f0 = listA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(listA, 10)), 16));
        for (Object obj : listA) {
            linkedHashMap.put(Integer.valueOf(((a0) obj).f62484b), obj);
        }
        f62464g0 = linkedHashMap;
    }

    public a0(int i10, @NotNull String str) {
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        this.f62484b = i10;
        this.f62485c = str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull a0 a0Var) {
        tn.p.k(a0Var, "other");
        return this.f62484b - a0Var.f62484b;
    }

    public final int e0() {
        return this.f62484b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof a0) && ((a0) obj).f62484b == this.f62484b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f62484b);
    }

    @NotNull
    public String toString() {
        return this.f62484b + ' ' + this.f62485c;
    }
}

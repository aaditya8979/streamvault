package gq;

import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* JADX INFO: compiled from: HttpHeaders.java */
/* JADX INFO: loaded from: classes2.dex */
public class i extends hq.e {
    public static final hq.d A;
    public static final hq.d B;
    public static final hq.d C;
    public static final hq.d D;
    public static final hq.d E;
    public static final hq.d F;
    public static final hq.d G;
    public static final hq.d H;
    public static final hq.d I;
    public static final hq.d J;
    public static final hq.d K;
    public static final hq.d L;
    public static final hq.d M;
    public static final hq.d N;
    public static final hq.d O;
    public static final hq.d P;
    public static final hq.d Q;
    public static final hq.d R;
    public static final hq.d S;
    public static final hq.d T;
    public static final hq.d U;
    public static final hq.d V;
    public static final hq.d W;
    public static final hq.d X;
    public static final hq.d Y;
    public static final hq.d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final hq.d f62806a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final hq.d f62807b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final hq.d f62808c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f62809d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final hq.d f62810d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hq.d f62811e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final hq.d f62812e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hq.d f62813f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final hq.d f62814f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hq.d f62815g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final hq.d f62816g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hq.d f62817h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final hq.d f62818h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hq.d f62819i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final hq.d f62820i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final hq.d f62821j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final hq.d f62822j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final hq.d f62823k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final hq.d f62824k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final hq.d f62825l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final hq.d f62826l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final hq.d f62827m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final hq.d f62828m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final hq.d f62829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hq.d f62830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final hq.d f62831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final hq.d f62832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final hq.d f62833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final hq.d f62834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final hq.d f62835t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final hq.d f62836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final hq.d f62837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final hq.d f62838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final hq.d f62839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final hq.d f62840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final hq.d f62841z;

    static {
        i iVar = new i();
        f62809d = iVar;
        f62811e = iVar.a("Host", 27);
        f62813f = iVar.a(com.safedk.android.utils.k.f53181b, 19);
        f62815g = iVar.a("Accept-Charset", 20);
        f62817h = iVar.a("Accept-Encoding", 21);
        f62819i = iVar.a("Accept-Language", 22);
        f62821j = iVar.a("Content-Length", 12);
        f62823k = iVar.a("Connection", 1);
        f62825l = iVar.a("Cache-Control", 57);
        f62827m = iVar.a("Date", 2);
        f62829n = iVar.a("Pragma", 3);
        f62830o = iVar.a("Trailer", 4);
        f62831p = iVar.a("Transfer-Encoding", 5);
        f62832q = iVar.a("Upgrade", 6);
        f62833r = iVar.a("Via", 7);
        f62834s = iVar.a("Warning", 8);
        f62835t = iVar.a("Allow", 9);
        f62836u = iVar.a("Content-Encoding", 10);
        f62837v = iVar.a("Content-Language", 11);
        f62838w = iVar.a("Content-Location", 13);
        f62839x = iVar.a("Content-MD5", 14);
        f62840y = iVar.a("Content-Range", 15);
        f62841z = iVar.a("Content-Type", 16);
        A = iVar.a("Expires", 17);
        B = iVar.a("Last-Modified", 18);
        C = iVar.a("Authorization", 23);
        D = iVar.a("Expect", 24);
        E = iVar.a("Forwarded", 25);
        F = iVar.a("From", 26);
        G = iVar.a("If-Match", 28);
        H = iVar.a("If-Modified-Since", 29);
        I = iVar.a("If-None-Match", 30);
        J = iVar.a("If-Range", 31);
        K = iVar.a("If-Unmodified-Since", 32);
        L = iVar.a("Keep-Alive", 33);
        M = iVar.a("Max-Forwards", 34);
        N = iVar.a("Proxy-Authorization", 35);
        O = iVar.a(Command.HTTP_HEADER_RANGE, 36);
        P = iVar.a("Request-Range", 37);
        Q = iVar.a("Referer", 38);
        R = iVar.a("TE", 39);
        S = iVar.a("User-Agent", 40);
        T = iVar.a("X-Forwarded-For", 41);
        U = iVar.a("X-Forwarded-Proto", 59);
        V = iVar.a("X-Forwarded-Server", 60);
        W = iVar.a("X-Forwarded-Host", 61);
        X = iVar.a("Accept-Ranges", 42);
        Y = iVar.a("Age", 43);
        Z = iVar.a(Command.HTTP_HEADER_ETAG, 44);
        f62806a0 = iVar.a("Location", 45);
        f62807b0 = iVar.a("Proxy-Authenticate", 46);
        f62808c0 = iVar.a(CommonGatewayClient.HEADER_RETRY_AFTER, 47);
        f62810d0 = iVar.a("Server", 48);
        f62812e0 = iVar.a("Servlet-Engine", 49);
        f62814f0 = iVar.a("Vary", 50);
        f62816g0 = iVar.a("WWW-Authenticate", 51);
        f62818h0 = iVar.a("Cookie", 52);
        f62820i0 = iVar.a("Set-Cookie", 53);
        f62822j0 = iVar.a("Set-Cookie2", 54);
        f62824k0 = iVar.a("MIME-Version", 55);
        f62826l0 = iVar.a("identity", 56);
        f62828m0 = iVar.a("Proxy-Connection", 58);
    }
}

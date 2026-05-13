package yads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class td0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f95149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f95150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f95151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t11 f95153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t11 f95154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f95155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final og2 f95156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HttpURLConnection f95157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f95158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f95159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f95160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f95161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f95162r;

    public td0(String str, int i10, int i11, boolean z10, t11 t11Var) {
        super(true);
        this.f95152h = str;
        this.f95150f = i10;
        this.f95151g = i11;
        this.f95149e = z10;
        this.f95153i = t11Var;
        this.f95156l = null;
        this.f95154j = new t11();
        this.f95155k = false;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = ib3.f90737a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b0  */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(yads.u30 r23) throws yads.q11 {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.td0.a(yads.u30):long");
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        Map map2;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f95150f);
        httpURLConnectionA.setReadTimeout(this.f95151g);
        HashMap map3 = new HashMap();
        t11 t11Var = this.f95153i;
        if (t11Var != null) {
            synchronized (t11Var) {
                if (t11Var.f95042b == null) {
                    t11Var.f95042b = Collections.unmodifiableMap(new HashMap(t11Var.f95041a));
                }
                map2 = t11Var.f95042b;
            }
            map3.putAll(map2);
        }
        map3.putAll(this.f95154j.a());
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = b21.f87890a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j10);
            sb2.append("-");
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str2 = this.f95152h;
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str2);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        int i11 = u30.f95521k;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnectionA.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA.connect();
        }
        return httpURLConnectionA;
    }

    public final URL a(URL url, String str) throws q11 {
        if (str == null) {
            throw new q11("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new q11("Unsupported protocol redirect: " + protocol, 2001);
            }
            if (this.f95149e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new q11("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new q11(e10, 2001, 1);
        }
    }

    public final void a(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f95158n;
            int i10 = ib3.f90737a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new q11(new InterruptedIOException(), 2000, 1);
            }
            if (i11 == -1) {
                throw new q11();
            }
            j10 -= (long) i11;
            c(i11);
        }
    }

    public final HttpURLConnection c(u30 u30Var) throws IOException {
        HttpURLConnection httpURLConnectionA;
        u30 u30Var2 = u30Var;
        URL url = new URL(u30Var2.f95522a.toString());
        int i10 = u30Var2.f95524c;
        byte[] bArr = u30Var2.f95525d;
        long j10 = u30Var2.f95527f;
        long j11 = u30Var2.f95528g;
        int i11 = 0;
        boolean z10 = (u30Var2.f95530i & 1) == 1;
        if (!this.f95149e && !this.f95155k) {
            return a(url, i10, bArr, j10, j11, z10, true, u30Var2.f95526e);
        }
        URL urlA = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 > 20) {
                throw new q11(new NoRouteToHostException(mg2.a("Too many redirects: ", i13)), 2001, 1);
            }
            Map map = u30Var2.f95526e;
            int i14 = i12;
            URL url2 = urlA;
            long j12 = j11;
            httpURLConnectionA = a(urlA, i12, bArr2, j10, j11, z10, false, map);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                urlA = a(url2, headerField);
                i12 = i14;
                i11 = i13;
                j11 = j12;
                u30Var2 = u30Var;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionA.disconnect();
                if (this.f95155k && responseCode == 302) {
                    i12 = i14;
                } else {
                    bArr2 = null;
                    i12 = 1;
                }
                urlA = a(url2, headerField);
                u30Var2 = u30Var;
                i11 = i13;
                j11 = j12;
            }
        }
        return httpURLConnectionA;
    }

    @Override // yads.p30
    public final void close() {
        try {
            InputStream inputStream = this.f95158n;
            if (inputStream != null) {
                long j10 = this.f95161q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f95162r;
                }
                a(this.f95157m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = ib3.f90737a;
                    throw new q11(e10, 2000, 3);
                }
            }
        } finally {
            this.f95158n = null;
            f();
            if (this.f95159o) {
                this.f95159o = false;
                d();
            }
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.f95157m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                ih1.b("DefaultHttpDataSource", ih1.a("Unexpected error while disconnecting", e10));
            }
            this.f95157m = null;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f95157m;
        return httpURLConnection == null ? xm2.f96817h : new rd0(httpURLConnection.getHeaderFields());
    }

    @Override // yads.p30
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f95157m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws q11 {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f95161q;
            if (j10 != -1) {
                long j11 = j10 - this.f95162r;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f95158n;
            int i12 = ib3.f90737a;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 == -1) {
                return -1;
            }
            this.f95162r += (long) i13;
            c(i13);
            return i13;
        } catch (IOException e10) {
            int i14 = ib3.f90737a;
            throw q11.a(e10, 2);
        }
    }
}

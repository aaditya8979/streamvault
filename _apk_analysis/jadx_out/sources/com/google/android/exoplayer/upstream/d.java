package com.google.android.exoplayer.upstream;

import a6.k0;
import a6.m;
import a6.v;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer.upstream.HttpDataSource;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.download.Command;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import y5.h;

/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends y5.d implements HttpDataSource {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f21126u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicReference<byte[]> f21127v = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final HttpDataSource.c f21132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HttpDataSource.c f21133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public v<String> f21134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public h f21135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public HttpURLConnection f21136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public InputStream f21137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f21140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f21141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21143t;

    public d(String str, int i10, int i11, boolean z10, @Nullable HttpDataSource.c cVar) {
        super(true);
        this.f21131h = a6.a.d(str);
        this.f21133j = new HttpDataSource.c();
        this.f21129f = i10;
        this.f21130g = i11;
        this.f21128e = z10;
        this.f21132i = cVar;
    }

    public static long i(HttpURLConnection httpURLConnection) {
        long j10;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                m.c("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + C3978d4.j.f31385e);
                j10 = -1;
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j10;
        }
        Matcher matcher = f21126u.matcher(headerField2);
        if (!matcher.find()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            m.h("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + C3978d4.j.f31385e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            m.c("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + C3978d4.j.f31385e);
            return j10;
        }
    }

    public static URL j(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: " + protocol);
    }

    public static boolean k(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void n(HttpURLConnection httpURLConnection, long j10) {
        int i10 = k0.f3574a;
        if (i10 == 19 || i10 == 20) {
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
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws HttpDataSource.HttpDataSourceException {
        this.f21135l = hVar;
        long j10 = 0;
        this.f21143t = 0L;
        this.f21142s = 0L;
        e(hVar);
        try {
            HttpURLConnection httpURLConnectionM = m(hVar);
            this.f21136m = httpURLConnectionM;
            try {
                this.f21139p = httpURLConnectionM.getResponseCode();
                String responseMessage = this.f21136m.getResponseMessage();
                int i10 = this.f21139p;
                if (i10 < 200 || i10 > 299) {
                    Map<String, List<String>> headerFields = this.f21136m.getHeaderFields();
                    h();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.f21139p, responseMessage, headerFields, hVar);
                    if (this.f21139p != 416) {
                        throw invalidResponseCodeException;
                    }
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                    throw invalidResponseCodeException;
                }
                String contentType = this.f21136m.getContentType();
                v<String> vVar = this.f21134k;
                if (vVar != null && !vVar.evaluate(contentType)) {
                    h();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, hVar);
                }
                if (this.f21139p == 200) {
                    long j11 = hVar.f87275f;
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
                this.f21140q = j10;
                boolean zK = k(this.f21136m);
                if (zK) {
                    this.f21141r = hVar.f87276g;
                } else {
                    long j12 = hVar.f87276g;
                    if (j12 != -1) {
                        this.f21141r = j12;
                    } else {
                        long jI = i(this.f21136m);
                        this.f21141r = jI != -1 ? jI - this.f21140q : -1L;
                    }
                }
                try {
                    this.f21137n = this.f21136m.getInputStream();
                    if (zK) {
                        this.f21137n = new GZIPInputStream(this.f21137n);
                    }
                    this.f21138o = true;
                    f(hVar);
                    return this.f21141r;
                } catch (IOException e10) {
                    h();
                    throw new HttpDataSource.HttpDataSourceException(e10, hVar, 1);
                }
            } catch (IOException e11) {
                h();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e11, hVar, 1);
            }
        } catch (IOException e12) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect", e12, hVar, 1);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            if (this.f21137n != null) {
                n(this.f21136m, g());
                try {
                    this.f21137n.close();
                } catch (IOException e10) {
                    throw new HttpDataSource.HttpDataSourceException(e10, this.f21135l, 3);
                }
            }
        } finally {
            this.f21137n = null;
            h();
            if (this.f21138o) {
                this.f21138o = false;
                d();
            }
        }
    }

    public final long g() {
        long j10 = this.f21141r;
        return j10 == -1 ? j10 : j10 - this.f21143t;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f21136m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f21136m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.f21136m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                m.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f21136m = null;
        }
    }

    public final HttpURLConnection l(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionO = o(url);
        httpURLConnectionO.setConnectTimeout(this.f21129f);
        httpURLConnectionO.setReadTimeout(this.f21130g);
        HashMap map2 = new HashMap();
        HttpDataSource.c cVar = this.f21132i;
        if (cVar != null) {
            map2.putAll(cVar.a());
        }
        map2.putAll(this.f21133j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionO.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + "-";
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnectionO.setRequestProperty(Command.HTTP_HEADER_RANGE, str);
        }
        httpURLConnectionO.setRequestProperty("User-Agent", this.f21131h);
        httpURLConnectionO.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionO.setInstanceFollowRedirects(z11);
        httpURLConnectionO.setDoOutput(bArr != null);
        httpURLConnectionO.setRequestMethod(h.b(i10));
        if (bArr != null) {
            httpURLConnectionO.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionO.connect();
            OutputStream outputStream = httpURLConnectionO.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionO.connect();
        }
        return httpURLConnectionO;
    }

    public final HttpURLConnection m(h hVar) throws IOException {
        HttpURLConnection httpURLConnectionL;
        h hVar2 = hVar;
        URL url = new URL(hVar2.f87270a.toString());
        int i10 = hVar2.f87271b;
        byte[] bArr = hVar2.f87272c;
        long j10 = hVar2.f87275f;
        long j11 = hVar2.f87276g;
        int i11 = 1;
        boolean zD = hVar2.d(1);
        if (!this.f21128e) {
            return l(url, i10, bArr, j10, j11, zD, true, hVar2.f87273d);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new NoRouteToHostException("Too many redirects: " + i13);
            }
            byte[] bArr2 = bArr;
            int i14 = i11;
            long j12 = j11;
            long j13 = j10;
            httpURLConnectionL = l(url, i10, bArr, j10, j11, zD, false, hVar2.f87273d);
            int responseCode = httpURLConnectionL.getResponseCode();
            String headerField = httpURLConnectionL.getHeaderField("Location");
            if ((i10 == i14 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionL.disconnect();
                url = j(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionL.disconnect();
                url = j(url, headerField);
                bArr2 = null;
                i10 = i14;
            }
            i12 = i13;
            i11 = i14;
            bArr = bArr2;
            j11 = j12;
            j10 = j13;
            hVar2 = hVar;
        }
        return httpURLConnectionL;
    }

    @VisibleForTesting
    public HttpURLConnection o(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public final int p(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f21141r;
        if (j10 != -1) {
            long j11 = j10 - this.f21143t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.f21137n.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f21141r == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f21143t += (long) i12;
        c(i12);
        return i12;
    }

    public final void q() throws IOException {
        if (this.f21142s == this.f21140q) {
            return;
        }
        byte[] andSet = f21127v.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.f21142s;
            long j11 = this.f21140q;
            if (j10 == j11) {
                f21127v.set(andSet);
                return;
            }
            int i10 = this.f21137n.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f21142s += (long) i10;
            c(i10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource.HttpDataSourceException {
        try {
            q();
            return p(bArr, i10, i11);
        } catch (IOException e10) {
            throw new HttpDataSource.HttpDataSourceException(e10, this.f21135l, 2);
        }
    }
}

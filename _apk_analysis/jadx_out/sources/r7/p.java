package r7;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.q1;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import r7.h;
import r7.p;
import s7.m0;

/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f78825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f78826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f78827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f78828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final s f78829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f78830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f78831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public y7.m<String> f78832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public k f78833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public HttpURLConnection f78834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public InputStream f78835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f78836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f78837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f78838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f78839s;

    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static final class b implements h.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public y f78841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public y7.m<String> f78842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f78843d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f78846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f78847h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f78840a = new s();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f78844e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f78845f = 8000;

        @Override // r7.h.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createDataSource() {
            p pVar = new p(this.f78843d, this.f78844e, this.f78845f, this.f78846g, this.f78840a, this.f78842c, this.f78847h);
            y yVar = this.f78841b;
            if (yVar != null) {
                pVar.b(yVar);
            }
            return pVar;
        }

        public b b(@Nullable String str) {
            this.f78843d = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static class c extends q1<String, List<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, List<String>> f78848c;

        public c(Map<String, List<String>> map) {
            this.f78848c = map;
        }

        public static /* synthetic */ boolean lambda$entrySet$1(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean lambda$keySet$0(String str) {
            return str != null;
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.q1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public Map<String, List<String>> g() {
            return this.f78848c;
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.b(super.entrySet(), new y7.m() { // from class: r7.r
                @Override // y7.m
                public final boolean apply(Object obj) {
                    return p.c.lambda$entrySet$1((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public boolean equals(@Nullable Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.q1, java.util.Map
        @Nullable
        public List<String> get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public Set<String> keySet() {
            return Sets.b(super.keySet(), new y7.m() { // from class: r7.q
                @Override // y7.m
                public final boolean apply(Object obj) {
                    return p.c.lambda$keySet$0((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public p(@Nullable String str, int i10, int i11, boolean z10, @Nullable s sVar, @Nullable y7.m<String> mVar, boolean z11) {
        super(true);
        this.f78828h = str;
        this.f78826f = i10;
        this.f78827g = i11;
        this.f78825e = z10;
        this.f78829i = sVar;
        this.f78832l = mVar;
        this.f78830j = new s();
        this.f78831k = z11;
    }

    public static boolean i(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void l(@Nullable HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = m0.f79487a) < 19 || i10 > 20) {
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
                Method declaredMethod = ((Class) s7.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // r7.h
    public long a(final k kVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrM0;
        this.f78833m = kVar;
        long j10 = 0;
        this.f78839s = 0L;
        this.f78838r = 0L;
        e(kVar);
        try {
            HttpURLConnection httpURLConnectionK = k(kVar);
            this.f78834n = httpURLConnectionK;
            this.f78837q = httpURLConnectionK.getResponseCode();
            String responseMessage = httpURLConnectionK.getResponseMessage();
            int i10 = this.f78837q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionK.getHeaderFields();
                if (this.f78837q == 416) {
                    if (kVar.f78761g == t.c(httpURLConnectionK.getHeaderField("Content-Range"))) {
                        this.f78836p = true;
                        f(kVar);
                        long j11 = kVar.f78762h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionK.getErrorStream();
                try {
                    bArrM0 = errorStream != null ? m0.M0(errorStream) : m0.f79492f;
                } catch (IOException unused) {
                    bArrM0 = m0.f79492f;
                }
                byte[] bArr = bArrM0;
                g();
                throw new HttpDataSource$InvalidResponseCodeException(this.f78837q, responseMessage, this.f78837q == 416 ? new DataSourceException(2008) : null, headerFields, kVar, bArr);
            }
            final String contentType = httpURLConnectionK.getContentType();
            y7.m<String> mVar = this.f78832l;
            if (mVar != null && !mVar.apply(contentType)) {
                g();
                throw new HttpDataSource$HttpDataSourceException(contentType, kVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
                    public final String contentType;

                    {
                        super("Invalid content type: " + contentType, kVar, 2003, 1);
                        this.contentType = contentType;
                    }
                };
            }
            if (this.f78837q == 200) {
                long j12 = kVar.f78761g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zI = i(httpURLConnectionK);
            if (zI) {
                this.f78838r = kVar.f78762h;
            } else {
                long j13 = kVar.f78762h;
                if (j13 != -1) {
                    this.f78838r = j13;
                } else {
                    long jB = t.b(httpURLConnectionK.getHeaderField("Content-Length"), httpURLConnectionK.getHeaderField("Content-Range"));
                    this.f78838r = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f78835o = httpURLConnectionK.getInputStream();
                if (zI) {
                    this.f78835o = new GZIPInputStream(this.f78835o);
                }
                this.f78836p = true;
                f(kVar);
                try {
                    o(j10, kVar);
                    return this.f78838r;
                } catch (IOException e10) {
                    g();
                    if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e10, kVar, 2000, 1);
                }
            } catch (IOException e11) {
                g();
                throw new HttpDataSource$HttpDataSourceException(e11, kVar, 2000, 1);
            }
        } catch (IOException e12) {
            g();
            throw HttpDataSource$HttpDataSourceException.createForIOException(e12, kVar, 1);
        }
    }

    @Override // r7.h
    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f78835o;
            if (inputStream != null) {
                long j10 = this.f78838r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f78839s;
                }
                l(this.f78834n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, (k) m0.j(this.f78833m), 2000, 3);
                }
            }
        } finally {
            this.f78835o = null;
            g();
            if (this.f78836p) {
                this.f78836p = false;
                d();
            }
        }
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.f78834n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                s7.q.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f78834n = null;
        }
    }

    @Override // r7.h
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f78834n;
        return httpURLConnection == null ? ImmutableMap.of() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f78834n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final URL h(URL url, @Nullable String str, k kVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", kVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, kVar, 2001, 1);
            }
            if (this.f78825e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", kVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new HttpDataSource$HttpDataSourceException(e10, kVar, 2001, 1);
        }
    }

    public final HttpURLConnection j(URL url, int i10, @Nullable byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionM = m(url);
        httpURLConnectionM.setConnectTimeout(this.f78826f);
        httpURLConnectionM.setReadTimeout(this.f78827g);
        HashMap map2 = new HashMap();
        s sVar = this.f78829i;
        if (sVar != null) {
            map2.putAll(sVar.a());
        }
        map2.putAll(this.f78830j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionM.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = t.a(j10, j11);
        if (strA != null) {
            httpURLConnectionM.setRequestProperty(Command.HTTP_HEADER_RANGE, strA);
        }
        String str = this.f78828h;
        if (str != null) {
            httpURLConnectionM.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionM.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionM.setInstanceFollowRedirects(z11);
        httpURLConnectionM.setDoOutput(bArr != null);
        httpURLConnectionM.setRequestMethod(k.c(i10));
        if (bArr != null) {
            httpURLConnectionM.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionM.connect();
            OutputStream outputStream = httpURLConnectionM.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionM.connect();
        }
        return httpURLConnectionM;
    }

    public final HttpURLConnection k(k kVar) throws IOException {
        HttpURLConnection httpURLConnectionJ;
        URL url = new URL(kVar.f78755a.toString());
        int i10 = kVar.f78757c;
        byte[] bArr = kVar.f78758d;
        long j10 = kVar.f78761g;
        long j11 = kVar.f78762h;
        boolean zD = kVar.d(1);
        if (!this.f78825e && !this.f78831k) {
            return j(url, i10, bArr, j10, j11, zD, true, kVar.f78759e);
        }
        URL urlH = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i13), kVar, 2001, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i11;
            URL url2 = urlH;
            long j14 = j11;
            httpURLConnectionJ = j(urlH, i11, bArr2, j12, j11, zD, false, kVar.f78759e);
            int responseCode = httpURLConnectionJ.getResponseCode();
            String headerField = httpURLConnectionJ.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionJ.disconnect();
                urlH = h(url2, headerField, kVar);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionJ.disconnect();
                if (this.f78831k && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                urlH = h(url2, headerField, kVar);
            }
            i12 = i13;
            j10 = j13;
            j11 = j14;
        }
        return httpURLConnectionJ;
    }

    @VisibleForTesting
    public HttpURLConnection m(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public final int n(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f78838r;
        if (j10 != -1) {
            long j11 = j10 - this.f78839s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) m0.j(this.f78835o)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f78839s += (long) i12;
        c(i12);
        return i12;
    }

    public final void o(long j10, k kVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) m0.j(this.f78835o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), kVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new HttpDataSource$HttpDataSourceException(kVar, 2008, 1);
            }
            j10 -= (long) i10;
            c(i10);
        }
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        try {
            return n(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource$HttpDataSourceException.createForIOException(e10, (k) m0.j(this.f78833m), 2);
        }
    }
}

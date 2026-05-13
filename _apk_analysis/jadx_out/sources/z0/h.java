package z0;

import android.text.TextUtils;
import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: HttpUrlSource.java */
/* JADX INFO: loaded from: classes10.dex */
public class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1.b f98162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1.b f98163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f98164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f98165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f98166e;

    public h(String str, c1.b bVar, b1.b bVar2) {
        this.f98162a = (c1.b) k.c(bVar);
        this.f98163b = (b1.b) k.c(bVar2);
        o oVar = bVar.get(str);
        this.f98164c = oVar == null ? new o(str, -2147483648L, m.g(str)) : oVar;
    }

    public h(h hVar) {
        this.f98164c = hVar.f98164c;
        this.f98162a = hVar.f98162a;
        this.f98163b = hVar.f98163b;
    }

    @Override // z0.n
    public void a(long j10) throws ProxyCacheException {
        try {
            HttpURLConnection httpURLConnectionG = g(j10, -1);
            this.f98165d = httpURLConnectionG;
            String contentType = httpURLConnectionG.getContentType();
            this.f98166e = new BufferedInputStream(this.f98165d.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.f98165d;
            o oVar = new o(this.f98164c.f98181a, h(httpURLConnection, j10, httpURLConnection.getResponseCode()), contentType);
            this.f98164c = oVar;
            this.f98162a.a(oVar.f98181a, oVar);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error opening connection for " + this.f98164c.f98181a + " with offset " + j10, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Read content info from "
            r0.append(r1)
            z0.o r1 = r7.f98164c
            java.lang.String r1 = r1.f98181a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            z0.j.a(r0)
            r0 = 0
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 0
            java.net.HttpURLConnection r0 = r7.g(r0, r2)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5e
            long r1 = r7.c(r0)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            java.lang.String r4 = r0.getContentType()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            z0.o r5 = new z0.o     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            z0.o r6 = r7.f98164c     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            java.lang.String r6 = r6.f98181a     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            r5.<init>(r6, r1, r4)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            r7.f98164c = r5     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            c1.b r1 = r7.f98162a     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            java.lang.String r2 = r5.f98181a     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            r1.a(r2, r5)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            java.lang.String r2 = "Source info fetched: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            z0.o r2 = r7.f98164c     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            z0.j.a(r1)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5f
            z0.m.c(r3)
            goto L7c
        L59:
            r1 = move-exception
            goto L80
        L5b:
            r1 = move-exception
            r0 = r3
            goto L80
        L5e:
            r0 = r3
        L5f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "Error fetching info from "
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
            z0.o r2 = r7.f98164c     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r2.f98181a     // Catch: java.lang.Throwable -> L59
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L59
            z0.j.b(r1)     // Catch: java.lang.Throwable -> L59
            z0.m.c(r3)
            if (r0 == 0) goto L7f
        L7c:
            r0.disconnect()
        L7f:
            return
        L80:
            z0.m.c(r3)
            if (r0 == 0) goto L88
            r0.disconnect()
        L88:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.h.b():void");
    }

    public final long c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // z0.n
    public void close() throws ProxyCacheException {
        HttpURLConnection httpURLConnection = this.f98165d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException unused) {
                j.b("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue.");
            } catch (IllegalArgumentException e10) {
                e = e10;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e11) {
                e = e11;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    public synchronized String d() throws ProxyCacheException {
        if (TextUtils.isEmpty(this.f98164c.f98183c)) {
            b();
        }
        return this.f98164c.f98183c;
    }

    public String e() {
        return this.f98164c.f98181a;
    }

    public final void f(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.f98163b.a(str).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public final HttpURLConnection g(long j10, int i10) throws IOException, ProxyCacheException {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z10;
        String headerField = this.f98164c.f98181a;
        int i11 = 0;
        do {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Open connection ");
            if (j10 > 0) {
                str = " with offset " + j10;
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(" to ");
            sb2.append(headerField);
            j.a(sb2.toString());
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            f(httpURLConnection, headerField);
            if (j10 > 0) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, "bytes=" + j10 + "-");
            }
            if (i10 > 0) {
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z10 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z10) {
                headerField = httpURLConnection.getHeaderField("Location");
                i11++;
                httpURLConnection.disconnect();
            }
            if (i11 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i11);
            }
        } while (z10);
        return httpURLConnection;
    }

    public final long h(HttpURLConnection httpURLConnection, long j10, int i10) throws IOException {
        long jC = c(httpURLConnection);
        return i10 == 200 ? jC : i10 == 206 ? jC + j10 : this.f98164c.f98182b;
    }

    @Override // z0.n
    public synchronized long length() throws ProxyCacheException {
        if (this.f98164c.f98182b == -2147483648L) {
            b();
        }
        return this.f98164c.f98182b;
    }

    @Override // z0.n
    public int read(byte[] bArr) throws ProxyCacheException {
        InputStream inputStream = this.f98166e;
        if (inputStream == null) {
            throw new ProxyCacheException("Error reading data from " + this.f98164c.f98181a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e10) {
            throw new InterruptedProxyCacheException("Reading source " + this.f98164c.f98181a + " is interrupted", e10);
        } catch (IOException e11) {
            throw new ProxyCacheException("Error reading data from " + this.f98164c.f98181a, e11);
        }
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f98164c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}

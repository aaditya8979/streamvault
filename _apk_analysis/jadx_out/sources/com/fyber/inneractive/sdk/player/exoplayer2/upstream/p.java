package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
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
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f18721o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReference f18722p = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f18727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f18728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f18729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpURLConnection f18730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputStream f18731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18736n;

    public p(String str, m mVar, int i10, int i11, boolean z10, w wVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f18726d = str;
        this.f18729g = mVar;
        this.f18728f = new w();
        this.f18724b = i10;
        this.f18725c = i11;
        this.f18723a = z10;
        this.f18727e = wVar;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f18822a;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStreamUrlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (j10 == -1) {
                    if (inputStreamUrlConnectionGetInputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStreamUrlConnectionGetInputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStreamUrlConnectionGetInputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStreamUrlConnectionGetInputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18734l;
        if (j10 != -1) {
            long j11 = j10 - this.f18736n;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.f18731i.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f18734l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = i12;
        this.f18736n += j12;
        m mVar = this.f18729g;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.f18710d += j12;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r15) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.u {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.p.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k):long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f18730h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f18724b);
        httpURLConnection.setReadTimeout(this.f18725c);
        w wVar = this.f18727e;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.f18750b == null) {
                    wVar.f18750b = Collections.unmodifiableMap(new HashMap(wVar.f18749a));
                }
                map = wVar.f18750b;
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f18728f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + "-";
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f18726d);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStreamUrlConnectionGetOutputStream = DTExchangeNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                outputStreamUrlConnectionGetOutputStream.write(bArr);
                outputStreamUrlConnectionGetOutputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection b(k kVar) throws IOException {
        URL url = new URL(kVar.f18696a.toString());
        long j10 = kVar.f18698c;
        long j11 = kVar.f18699d;
        int i10 = 0;
        boolean z10 = (kVar.f18701f & 1) == 1;
        if (!this.f18723a) {
            return a(url, null, j10, j11, z10, true);
        }
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i11));
            }
            HttpURLConnection httpURLConnectionA = a(url, null, j10, j11, z10, false);
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
            if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                return httpURLConnectionA;
            }
            String headerField = httpURLConnectionA.getHeaderField("Location");
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i10 = i11;
            url = url2;
        }
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f18730h;
        if (httpURLConnection != null) {
            try {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f18730h = null;
        }
    }

    public final void c() throws IOException {
        if (this.f18735m == this.f18733k) {
            return;
        }
        byte[] bArr = (byte[]) f18722p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j10 = this.f18735m;
            long j11 = this.f18733k;
            if (j10 == j11) {
                f18722p.set(bArr);
                return;
            }
            int i10 = this.f18731i.read(bArr, 0, (int) Math.min(j11 - j10, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            long j12 = i10;
            this.f18735m += j12;
            m mVar = this.f18729g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f18710d += j12;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.f18731i != null) {
                HttpURLConnection httpURLConnection = this.f18730h;
                long j10 = this.f18734l;
                if (j10 != -1) {
                    j10 -= this.f18736n;
                }
                a(httpURLConnection, j10);
                try {
                    this.f18731i.close();
                } catch (IOException e10) {
                    throw new u(e10);
                }
            }
        } finally {
            this.f18731i = null;
            b();
            if (this.f18732j) {
                this.f18732j = false;
                m mVar = this.f18729g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws u {
        try {
            c();
            return a(bArr, i10, i11);
        } catch (IOException e10) {
            throw new u(e10);
        }
    }
}

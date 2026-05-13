package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class f extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52995a = "SafeDKInputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f52997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f52998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InputStream f52999e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, List<String>> f53003i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HttpURLConnection f53005k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53001g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53002h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ByteArrayOutputStream f53004j = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f53000f = System.currentTimeMillis();

    public f(String str, String str2, InputStream inputStream, Map<String, List<String>> map, boolean z10) {
        this.f52997c = str;
        this.f52998d = str2;
        this.f52999e = inputStream;
        this.f53003i = map;
        this.f52996b = z10;
    }

    private int a(ByteArrayOutputStream byteArrayOutputStream) {
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.size();
        }
        return 0;
    }

    private void a(byte[] bArr, int i10, int i11) {
        try {
            Logger.d(f52995a, "handle stream read started. " + this + ", off=" + i10 + ", res=" + i11);
            if (i11 > 0 && this.f53004j != null) {
                this.f53004j.write(bArr, i10, i11);
            }
            if (b(this.f53003i) && i11 == -1) {
                a("sr-lc");
            }
            if (!this.f52996b || this.f53004j == null) {
                return;
            }
            int iC = c(this.f53003i);
            int size = this.f53004j.size();
            if (iC > -1) {
                Logger.d(f52995a, "handle stream read, " + this + ", header content size: " + iC + ", current buffer size: " + size);
                if (iC == size) {
                    Logger.d(f52995a, "handle stream read, " + this + ", header content size == current buffer size, calling handleClose");
                    a("sr-cs");
                }
            } else if (a(this.f53003i)) {
                Logger.d(f52995a, "handle stream read, " + this + ", header content size is -1, read bytes: " + i11 + ", previous: " + this.f53002h);
                if (i11 < this.f53002h) {
                    Logger.d(f52995a, "handle stream read, " + this + ", read bytes < previous read bytes, calling handleClose");
                    a("sr-rb");
                }
            }
            this.f53002h = i11;
        } catch (Throwable th2) {
            try {
                Logger.e(f52995a, th2.getMessage(), th2);
            } catch (Throwable th3) {
            }
        }
    }

    private static boolean a(Map<String, List<String>> map) {
        if (map == null) {
            return false;
        }
        List<String> list = map.get("Content-Encoding");
        Logger.d(f52995a, "get response content encoding: " + list);
        return list != null && list.contains("gzip");
    }

    private void b() {
        int i10;
        do {
            try {
                i10 = this.f52999e.read();
                if (i10 > 0) {
                    this.f53004j.write(i10);
                }
            } catch (Exception e10) {
                Logger.d(f52995a, "read all before close - exception= " + e10);
                return;
            }
        } while (i10 > 0);
    }

    private static boolean b(Map<String, List<String>> map) {
        if (map == null) {
            return false;
        }
        List<String> list = map.get("Transfer-Encoding");
        Logger.d(f52995a, "get response transfer encoding: " + list);
        return list != null && list.contains("chunked");
    }

    private static int c(Map<String, List<String>> map) {
        if (map != null) {
            Logger.d(f52995a, "get header content size, headers: " + map);
            List<String> list = map.get("Content-Length");
            Logger.d(f52995a, "get header content size: " + list);
            if (list != null) {
                return Integer.parseInt(list.get(0));
            }
        }
        return -1;
    }

    public void a() {
        if (this.f53001g) {
            return;
        }
        a("cd");
    }

    public void a(String str) {
        String string;
        try {
            if (!b(this.f53003i) && this.f53004j != null && this.f53004j.size() == 0) {
                Logger.d(f52995a, "handle close, " + this + ", streamData.size()=0, exiting.");
                return;
            }
            if (this.f53001g) {
                Logger.d(f52995a, "handle close, " + this + ", already closed, exiting.");
                return;
            }
            this.f53001g = true;
            com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(this.f52997c);
            boolean zB = aVarI != null ? aVarI.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT) : false;
            Logger.d(f52995a, "handle close, " + this + ", sdk " + this.f52997c + " configuration item SUPPORTS_GZIP_CONTENT is " + zB);
            if (zB && a(this.f53003i)) {
                Logger.d(f52995a, "handle close, " + this + ", gzip content detected");
                string = com.safedk.android.utils.c.a(this.f53004j.toByteArray());
                k.b(f52995a, "handle close, gzipped content (" + (string != null ? string.length() : 0) + ") is " + string);
                if (string == null) {
                    Logger.d(f52995a, "handle close, " + this + ", failed to unzip content, exiting");
                    this.f53001g = false;
                    return;
                }
            } else {
                string = this.f53004j.toString();
            }
            boolean z10 = string == null || string.length() == 0;
            if (this.f52997c.equals(com.safedk.android.utils.g.f53142p) && z10) {
                Logger.d(f52995a, "handle close, " + this + ", Fyber url with empty body, skipping");
            } else {
                String str2 = this.f53000f + ";" + str + ";" + (System.currentTimeMillis() - this.f53000f);
                Logger.d(f52995a, "handle close, " + this + ", calling onAdFetched, content size is " + string.length() + ", stream close data: (" + str2 + ")");
                CreativeInfoManager.a(this.f52997c, this.f52998d, string, this.f53003i, str2);
            }
            this.f53004j = null;
            this.f53003i = null;
            if (this.f53005k != null) {
                NetworkBridge.disposeOfConnectionToStreamMapping(this.f53005k);
            }
        } catch (Throwable th2) {
            try {
                Logger.e(f52995a, th2.getMessage());
            } catch (Throwable th3) {
            }
        }
    }

    public void a(HttpURLConnection httpURLConnection) {
        this.f53005k = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f52999e != null) {
            return this.f52999e.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.f52999e != null) {
                b();
                int iA = a(this.f53004j);
                int iC = c(this.f53003i);
                if (iC == iA) {
                    Logger.d(f52995a, "closing the stream, " + this + ", with amount read: " + iA);
                    this.f52999e.close();
                } else if (iC > -1) {
                    Logger.d(f52995a, "Attempt to close the stream, " + this + ", before reading all of it has been made! amount read: " + iA + ", content size: " + iC + " sdk: " + this.f52997c);
                }
            }
        } catch (Throwable th2) {
            Logger.d(f52995a, "Exception closing input stream : " + th2.getMessage(), th2);
        } finally {
            a("sc");
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        if (this.f52999e != null) {
            return this.f52999e.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f52999e == null) {
            return 0;
        }
        int i10 = this.f52999e.read();
        if (i10 < 0) {
            return i10;
        }
        try {
            this.f53004j.write(i10);
            return i10;
        } catch (Throwable th2) {
            try {
                Logger.e(f52995a, th2.getMessage());
                return i10;
            } catch (Throwable th3) {
                return i10;
            }
        }
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr) throws IOException {
        if (this.f52999e == null) {
            return 0;
        }
        int i10 = this.f52999e.read(bArr);
        a(bArr, 0, i10);
        return i10;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        if (this.f52999e == null) {
            return 0;
        }
        int i12 = this.f52999e.read(bArr, i10, i11);
        a(bArr, i10, i12);
        return i12;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f52999e != null) {
            this.f52999e.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        if (this.f52999e != null) {
            return this.f52999e.skip(j10);
        }
        return 0L;
    }
}

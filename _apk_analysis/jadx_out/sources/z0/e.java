package z0;

import android.text.TextUtils;
import com.danikula.videocache.ProxyCacheException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* JADX INFO: compiled from: HttpProxyCache.java */
/* JADX INFO: loaded from: classes10.dex */
public class e extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f98135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a1.b f98136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f98137k;

    public e(h hVar, a1.b bVar) {
        super(hVar, bVar);
        this.f98136j = bVar;
        this.f98135i = hVar;
    }

    @Override // z0.l
    public void g(int i10) {
        b bVar = this.f98137k;
        if (bVar != null) {
            bVar.a(this.f98136j.f3473b, this.f98135i.e(), i10);
        }
    }

    public final String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public final boolean q(d dVar) throws ProxyCacheException {
        long length = this.f98135i.length();
        return (((length > 0L ? 1 : (length == 0L ? 0 : -1)) > 0) && dVar.f98134c && ((float) dVar.f98133b) > ((float) this.f98136j.available()) + (((float) length) * 0.2f)) ? false : true;
    }

    public final String r(d dVar) throws IOException, ProxyCacheException {
        String strD = this.f98135i.d();
        boolean z10 = !TextUtils.isEmpty(strD);
        long jAvailable = this.f98136j.d() ? this.f98136j.available() : this.f98135i.length();
        boolean z11 = jAvailable >= 0;
        boolean z12 = dVar.f98134c;
        long j10 = z12 ? jAvailable - dVar.f98133b : jAvailable;
        boolean z13 = z11 && z12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f98134c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb2.append("Accept-Ranges: bytes\n");
        sb2.append(z11 ? p("Content-Length: %d\n", Long.valueOf(j10)) : "");
        sb2.append(z13 ? p("Content-Range: bytes %d-%d/%d\n", Long.valueOf(dVar.f98133b), Long.valueOf(jAvailable - 1), Long.valueOf(jAvailable)) : "");
        sb2.append(z10 ? p("Content-Type: %s\n", strD) : "");
        sb2.append("\n");
        return sb2.toString();
    }

    public void s(d dVar, Socket socket) throws IOException, ProxyCacheException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(r(dVar).getBytes("UTF-8"));
        long j10 = dVar.f98133b;
        if (q(dVar)) {
            u(bufferedOutputStream, j10);
        } else {
            v(bufferedOutputStream, j10);
        }
    }

    public void t(b bVar) {
        this.f98137k = bVar;
    }

    public final void u(OutputStream outputStream, long j10) throws IOException, ProxyCacheException {
        byte[] bArr = new byte[8192];
        while (true) {
            int iJ = j(bArr, j10, 8192);
            if (iJ == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, iJ);
                j10 += (long) iJ;
            }
        }
    }

    public final void v(OutputStream outputStream, long j10) throws IOException, ProxyCacheException {
        h hVar = new h(this.f98135i);
        try {
            hVar.a((int) j10);
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = hVar.read(bArr);
                if (i10 == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } finally {
            hVar.close();
        }
    }
}

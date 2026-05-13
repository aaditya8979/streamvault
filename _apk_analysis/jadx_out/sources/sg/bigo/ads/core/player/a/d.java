package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServerSocket f84249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84250c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f84253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f84254g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f84251d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.common.n.e f84248a = new sg.bigo.ads.common.n.e("Play", 3, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, e> f84252e = new ConcurrentHashMap();

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Socket f84256b;

        public a(Socket socket) {
            this.f84256b = socket;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 20, insn: 0x022e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:92:0x022e */
        /* JADX WARN: Not initialized variable reg: 20, insn: 0x0235: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:96:0x0235 */
        /* JADX WARN: Not initialized variable reg: 20, insn: 0x0238: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:97:0x0238 */
        /* JADX WARN: Type inference failed for: r1v0, types: [sg.bigo.ads.core.player.a.d$a] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v19 */
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            d dVar;
            String str;
            d dVar2;
            String str2;
            d dVar3;
            String str3;
            d dVar4;
            final e eVarA;
            Object obj;
            String str4;
            String str5;
            e eVar;
            long j10;
            String str6;
            String strA;
            String str7 = this;
            d dVar5 = d.this;
            Socket socket = str7.f84256b;
            try {
                try {
                    try {
                        sg.bigo.ads.core.player.a.b bVarA = sg.bigo.ads.core.player.a.b.a(socket.getInputStream());
                        if (bVarA == null) {
                            d.a(socket);
                            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar5.b());
                            return;
                        }
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Request to cache proxy:request=".concat(String.valueOf(bVarA)));
                        String strF = q.f(bVarA.f84244a);
                        if (!"ping".equals(strF)) {
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    eVarA = dVar5.a(strF);
                                } catch (SocketException unused) {
                                    dVar3 = dVar5;
                                    str2 = "Opened connections: ";
                                } catch (IOException e10) {
                                    e = e10;
                                    dVar2 = dVar5;
                                    str = "Opened connections: ";
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar2.b());
                                } catch (j e11) {
                                    e = e11;
                                    dVar2 = dVar5;
                                    str = "Opened connections: ";
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar2.b());
                                } catch (Throwable th2) {
                                    th = th2;
                                    dVar = dVar5;
                                    str7 = "Opened connections: ";
                                }
                                try {
                                    if (eVarA.a()) {
                                        try {
                                            if (SystemClock.elapsedRealtime() - eVarA.f84263e > 300000) {
                                                int andSet = eVarA.f84264f.getAndSet(0);
                                                eVarA.f84263e = SystemClock.elapsedRealtime();
                                                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "reset resetRetryCount=".concat(String.valueOf(andSet)));
                                            }
                                            eVarA.f84259a.incrementAndGet();
                                            if (eVarA.f84261c != null) {
                                                if (!(eVarA.f84261c.f82152j == 1) && !eVarA.f84261c.b() && SystemClock.elapsedRealtime() - eVarA.f84262d > 15000 && eVarA.f84264f.getAndIncrement() < 3) {
                                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "keepDownloadTaskAlive retryCount=" + eVarA.f84264f.get());
                                                    eVarA.f84262d = SystemClock.elapsedRealtime();
                                                    sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.e.1
                                                        public AnonymousClass1() {
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            sg.bigo.ads.core.player.b.a().f84289g.a(e.this.f84261c, true);
                                                        }
                                                    });
                                                }
                                            }
                                            c cVar = eVarA.f84260b;
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                                            String strF2 = q.f(bVarA.f84244a);
                                            MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(strF2);
                                            String mimeTypeFromExtension = TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                                            boolean z10 = !TextUtils.isEmpty(mimeTypeFromExtension);
                                            long jA = cVar.f84247a.c() ? cVar.f84247a.a() : cVar.f84247a.f84240b.f82151i;
                                            boolean z11 = jA >= 0;
                                            boolean z12 = bVarA.f84246c;
                                            if (z12) {
                                                eVar = eVarA;
                                                try {
                                                    j10 = jA - bVarA.f84245b;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    eVar.b();
                                                    throw th;
                                                }
                                            } else {
                                                eVar = eVarA;
                                                j10 = jA;
                                            }
                                            boolean z13 = z11 && z12;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(bVarA.f84246c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                                            sb2.append("Accept-Ranges: bytes\n");
                                            if (z11) {
                                                str6 = "";
                                                str3 = "Opened connections: ";
                                                dVar4 = dVar5;
                                                try {
                                                    strA = c.a("Content-Length: %d\n", Long.valueOf(j10));
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    eVar.b();
                                                    throw th;
                                                }
                                            } else {
                                                str6 = "";
                                                str3 = "Opened connections: ";
                                                dVar4 = dVar5;
                                                strA = str6;
                                            }
                                            sb2.append(strA);
                                            sb2.append(z13 ? c.a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(bVarA.f84245b), Long.valueOf(jA - 1), Long.valueOf(jA)) : str6);
                                            sb2.append(z10 ? c.a("Content-Type: %s\n", mimeTypeFromExtension) : str6);
                                            sb2.append("\n");
                                            String string = sb2.toString();
                                            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "newResponseHeaders =".concat(String.valueOf(string)));
                                            bufferedOutputStream.write(string.getBytes("UTF-8"));
                                            cVar.a(bufferedOutputStream, bVarA.f84245b);
                                            eVar.b();
                                        } catch (Throwable th5) {
                                            th = th5;
                                            eVar = eVarA;
                                        }
                                    } else {
                                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "startProcessRequest failed");
                                        eVarA.b();
                                    }
                                } catch (SocketException unused2) {
                                    str2 = str5;
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Closing socket… Socket is closed by client.");
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str2 + dVar3.b());
                                    return;
                                } catch (IOException e12) {
                                    e = e12;
                                    str = str4;
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar2.b());
                                } catch (j e13) {
                                    e = e13;
                                    str = str4;
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar2.b());
                                } catch (Throwable th6) {
                                    th = th6;
                                    str7 = obj;
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str7 + dVar.b());
                                    throw th;
                                }
                            }
                            d.a(socket);
                            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str3 + dVar4.b());
                        }
                        try {
                            OutputStream outputStream = socket.getOutputStream();
                            outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
                            outputStream.write("ping ok".getBytes());
                        } catch (IOException e14) {
                            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Pinger#responseToPing, error message is : " + e14.toString());
                        }
                        str3 = "Opened connections: ";
                        dVar4 = dVar5;
                        d.a(socket);
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str3 + dVar4.b());
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (SocketException unused3) {
                    str2 = "Opened connections: ";
                    dVar3 = dVar5;
                } catch (IOException e15) {
                    e = e15;
                    str = "Opened connections: ";
                    dVar2 = dVar5;
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                    d.a(socket);
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar2.b());
                }
            } catch (j e16) {
                e = e16;
                str = "Opened connections: ";
                dVar2 = dVar5;
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                d.a(socket);
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar2.b());
            } catch (Throwable th8) {
                th = th8;
                str7 = "Opened connections: ";
                dVar = dVar5;
            }
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f84258b;

        public b(CountDownLatch countDownLatch) {
            this.f84258b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f84258b.countDown();
            d dVar = d.this;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket socketAccept = dVar.f84249b.accept();
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Accept new socket socket=".concat(String.valueOf(socketAccept)));
                    dVar.f84248a.submit(dVar.new a(socketAccept));
                } catch (Throwable th2) {
                    sg.bigo.ads.core.d.b.a(3005, 10111, th2.toString());
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error during waiting connection, error message is : " + th2.toString());
                    return;
                }
            }
        }
    }

    public d() {
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f84249b = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f84250c = localPort;
            f.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new b(countDownLatch));
            this.f84253f = thread;
            thread.setName("BGAd-Conn");
            this.f84253f.start();
            countDownLatch.await();
            this.f84254g = new h("127.0.0.1", this.f84250c);
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Proxy cache server started. Is it alive? " + a());
        } catch (IOException | InterruptedException e10) {
            this.f84248a.shutdown();
            sg.bigo.ads.core.d.b.a(3005, 10110, "Error starting local proxy server, error message is : " + e10.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error starting local proxy server, error message is : " + e10.toString());
        }
    }

    public static void a(Socket socket) {
        String str;
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException unused) {
            str = "Releasing input stream… Socket is closed by client.";
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        } catch (IOException e10) {
            str = "Error closing socket input stream, error message is " + e10.getMessage();
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        }
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e11) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Failed to close socket on proxy side: {}. It seems client have already closed connection." + e11.getMessage());
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e12) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing socket" + e12.getMessage());
        }
    }

    public final e a(String str) {
        e eVar;
        synchronized (this.f84251d) {
            eVar = this.f84252e.get(str);
            if (eVar == null) {
                eVar = new e(str);
                this.f84252e.put(str, eVar);
            }
        }
        return eVar;
    }

    public final boolean a() {
        h hVar = this.f84254g;
        return hVar != null && hVar.a();
    }

    public final int b() {
        int i10;
        synchronized (this.f84251d) {
            i10 = 0;
            Iterator<e> it = this.f84252e.values().iterator();
            while (it.hasNext()) {
                i10 += it.next().f84259a.get();
            }
        }
        return i10;
    }
}

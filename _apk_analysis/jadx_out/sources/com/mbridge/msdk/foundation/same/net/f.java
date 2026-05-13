package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: SocketManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile AtomicInteger f37795b = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f37796a;

    /* JADX INFO: compiled from: SocketManager.java */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("SocketThreadPool");
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: SocketManager.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f37798a;

        public b(c cVar) {
            this.f37798a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37798a.a();
        }
    }

    /* JADX INFO: compiled from: SocketManager.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ByteBuffer f37800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f37801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.b f37803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private OutputStream f37804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f37805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Socket f37806g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f37807h;

        public c(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.f37801b = str;
            this.f37805f = i10;
            this.f37807h = str2;
            this.f37802c = z10;
            this.f37803d = bVar;
        }

        private void a(String str) {
            if (this.f37803d != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f37803d.onError(new com.mbridge.msdk.foundation.same.net.exception.a(13, new com.mbridge.msdk.foundation.same.net.toolbox.a(404, str.getBytes(), null)));
            }
        }

        /* JADX WARN: Finally extract failed */
        public void a() {
            int length;
            try {
                Socket socket = new Socket(this.f37801b, this.f37805f);
                this.f37806g = socket;
                socket.setSoTimeout(15000);
                boolean z10 = this.f37801b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f37840j) || this.f37801b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f37842l);
                q0.b("SocketManager", "Socket connect : " + this.f37801b + " : " + this.f37805f + " isAnalytics : " + z10);
                this.f37804e = this.f37806g.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                this.f37800a = byteBufferWrap;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                this.f37800a.put((byte) 2);
                if (TextUtils.isEmpty(this.f37807h)) {
                    this.f37800a.put((byte) 1);
                } else {
                    this.f37800a.put(this.f37802c ? (byte) 3 : (byte) 2);
                }
                this.f37800a.putShort((short) f.f37795b.getAndIncrement());
                if (TextUtils.isEmpty(this.f37807h)) {
                    this.f37800a.putInt(0);
                    this.f37804e.write(this.f37800a.array());
                    length = 0;
                } else {
                    byte[] bArrA = this.f37802c ? f.this.a(this.f37807h) : this.f37807h.getBytes();
                    length = bArrA.length;
                    this.f37800a.putInt(length);
                    this.f37804e.write(this.f37800a.array());
                    this.f37804e.write(bArrA);
                }
                this.f37804e.flush();
                q0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.f37800a.array()) + " length : " + length);
                InputStream inputStream = this.f37806g.getInputStream();
                byte[] bArr = new byte[8];
                inputStream.read(bArr, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                this.f37800a = byteBufferWrap2;
                byteBufferWrap2.order(byteOrder);
                int i10 = this.f37800a.getInt(4);
                byte b10 = bArr[1];
                boolean z11 = b10 == 3;
                boolean z12 = b10 == 2;
                q0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i10 + " isGzip : " + z11);
                byte[] bArr2 = new byte[i10];
                new DataInputStream(this.f37806g.getInputStream()).readFully(bArr2);
                if (!z11 && i10 > 2 && ((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                    z11 = true;
                }
                com.mbridge.msdk.foundation.same.net.b bVar = this.f37803d;
                if (bVar == null) {
                    Socket socket2 = this.f37806g;
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            this.f37800a = null;
                            this.f37804e.close();
                            return;
                        } catch (IOException e10) {
                            q0.b("SocketManager", e10.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (z12 && i10 == 0) {
                    bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(204, null, null)));
                    Socket socket3 = this.f37806g;
                    if (socket3 != null) {
                        try {
                            socket3.close();
                            this.f37800a = null;
                            this.f37804e.close();
                            return;
                        } catch (IOException e11) {
                            q0.b("SocketManager", e11.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (i10 < 1) {
                    a("The response data less than 1");
                    Socket socket4 = this.f37806g;
                    if (socket4 != null) {
                        try {
                            socket4.close();
                            this.f37800a = null;
                            this.f37804e.close();
                            return;
                        } catch (IOException e12) {
                            q0.b("SocketManager", e12.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (z10) {
                    if (bArr2[0] == 1) {
                        bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                    } else {
                        a("The server returns fail");
                    }
                    Socket socket5 = this.f37806g;
                    if (socket5 != null) {
                        try {
                            socket5.close();
                            this.f37800a = null;
                            this.f37804e.close();
                            return;
                        } catch (IOException e13) {
                            q0.b("SocketManager", e13.getMessage());
                            return;
                        }
                    }
                    return;
                }
                try {
                    String strA = z11 ? f.this.a(bArr2) : new String(bArr2);
                    JSONObject jSONObject = !TextUtils.isEmpty(strA) ? new JSONObject(strA) : null;
                    q0.b("SocketManager", "Socket Response length : " + i10 + Z7.f30794r + strA.length());
                    this.f37803d.onSuccess(e.a(jSONObject, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    q0.b("SocketManager", th2.getMessage());
                    if (TextUtils.isEmpty(message)) {
                        message = "The JSON data is illegal";
                    }
                    a(message);
                }
                inputStream.close();
                Socket socket6 = this.f37806g;
                if (socket6 != null) {
                    try {
                        socket6.close();
                        this.f37800a = null;
                        this.f37804e.close();
                    } catch (IOException e14) {
                        q0.b("SocketManager", e14.getMessage());
                    }
                }
            } catch (Throwable th3) {
                try {
                    String message2 = th3.getMessage();
                    q0.a("SocketManager", "Socket exception: " + message2);
                    a(message2);
                    Socket socket7 = this.f37806g;
                    if (socket7 != null) {
                        try {
                            socket7.close();
                            this.f37800a = null;
                            this.f37804e.close();
                        } catch (IOException e15) {
                            q0.b("SocketManager", e15.getMessage());
                        }
                    }
                } catch (Throwable th4) {
                    Socket socket8 = this.f37806g;
                    if (socket8 != null) {
                        try {
                            socket8.close();
                            this.f37800a = null;
                            this.f37804e.close();
                        } catch (IOException e16) {
                            q0.b("SocketManager", e16.getMessage());
                        }
                    }
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: compiled from: SocketManager.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static f f37809a = new f(null);
    }

    private f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f37796a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public /* synthetic */ f(a aVar) {
        this();
    }

    public static f b() {
        return d.f37809a;
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 <= 0) {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr2, 0, i10);
        }
    }

    public void a(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
        this.f37796a.execute(new b(new c(str, i10, str2, z10, bVar)));
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}

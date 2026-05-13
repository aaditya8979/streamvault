package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerTCP;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: SocketRequestTask.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f35907b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35908c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f35909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OutputStream f35910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f35911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f35912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f35913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f35914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f35915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EventListenerTCP f35916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35918m;

    public b(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f35912g = aVar;
        this.f35914i = aVar3;
        this.f35913h = aVar2;
        this.f35916k = new EventListenerTCP(aVar2.b());
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f35913h.a(str);
        this.f35913h.c(i10);
        this.f35913h.a(i11);
        this.f35913h.b(2);
        EventListenerTCP eventListenerTCP = this.f35916k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callFailed(new IOException(str));
        }
        return this.f35913h;
    }

    private String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i10 = gZIPInputStream.read(bArr2);
                if (i10 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toString();
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
            }
        } catch (IOException e10) {
            q0.b("JavaSocketConnection", "Failed to decompress GZIP data: " + e10.getMessage());
            throw e10;
        }
    }

    private byte[] a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        OutputStream outputStream = this.f35910e;
        try {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e10) {
                    q0.b("JavaSocketConnection", "Error closing output stream: " + e10.getMessage());
                }
            }
            InputStream inputStream = this.f35911f;
            try {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        q0.b("JavaSocketConnection", "Error closing input stream: " + e11.getMessage());
                    }
                }
                Socket socket = this.f35909d;
                if (socket != null) {
                    try {
                        try {
                            socket.close();
                        } catch (IOException e12) {
                            q0.b("JavaSocketConnection", "Error closing socket: " + e12.getMessage());
                        }
                    } finally {
                        this.f35909d = null;
                    }
                }
                q0.a("JavaSocketConnection", "All resources closed");
            } finally {
                this.f35911f = null;
            }
        } finally {
            this.f35910e = null;
        }
    }

    private void b(String str) throws IOException {
        byte[] bArrA;
        try {
            EventListenerTCP eventListenerTCP = this.f35916k;
            if (eventListenerTCP != null) {
                eventListenerTCP.requestHeadersStart();
            }
            this.f35917l = false;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.put((byte) 2);
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.put((byte) 1);
            } else {
                byteBufferWrap.put(this.f35917l ? (byte) 3 : (byte) 2);
            }
            byteBufferWrap.putShort((short) this.f35907b.getAndIncrement());
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.putInt(0);
                bArrA = null;
            } else {
                bArrA = this.f35917l ? a(str) : str.getBytes();
                byteBufferWrap.putInt(bArrA != null ? bArrA.length : 0);
            }
            this.f35910e.write(byteBufferWrap.array());
            EventListenerTCP eventListenerTCP2 = this.f35916k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.requestHeadersEnd();
            }
            if (bArrA != null) {
                EventListenerTCP eventListenerTCP3 = this.f35916k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.requestBodyStart();
                }
                this.f35910e.write(bArrA);
                EventListenerTCP eventListenerTCP4 = this.f35916k;
                if (eventListenerTCP4 != null) {
                    eventListenerTCP4.requestBodyEnd(bArrA.length);
                }
            }
            this.f35910e.flush();
        } catch (IOException e10) {
            q0.b("JavaSocketConnection", "Failed to send request: " + e10.getMessage());
            throw new IOException("Failed to send request: " + e10.getMessage(), e10);
        }
    }

    private void c() {
        this.f35913h = d();
        if (this.f35908c) {
            a(1999, 1999, "Request cancelled");
        }
        h();
    }

    private com.mbridge.msdk.config.component.common.network.result.a d() {
        try {
            JSONObject jSONObjectG = g();
            f();
            b(jSONObjectG.toString());
            return i();
        } catch (ConnectException e10) {
            return a(1002, 1002, "Connection refused: " + e10.getMessage());
        } catch (SocketTimeoutException e11) {
            return a(1001, 1001, "Connection timeout: " + e11.getMessage());
        } catch (UnknownHostException e12) {
            return a(2001, 2001, "Host unreachable: " + e12.getMessage());
        } catch (IOException e13) {
            return a(2003, 2003, "Network error: " + e13.getMessage());
        } catch (Exception e14) {
            return a(1999, 1999, "Unknown error: " + e14.getMessage());
        }
    }

    private void f() throws IOException {
        try {
            try {
                try {
                    try {
                        EventListenerTCP eventListenerTCP = this.f35916k;
                        if (eventListenerTCP != null) {
                            eventListenerTCP.dnsStart();
                        }
                        this.f35909d = new Socket();
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f35906a, this.f35912g.j());
                        if (inetSocketAddress.isUnresolved()) {
                            throw new IOException("Cannot resolve host: " + this.f35906a);
                        }
                        EventListenerTCP eventListenerTCP2 = this.f35916k;
                        if (eventListenerTCP2 != null) {
                            eventListenerTCP2.dnsEnd(this.f35906a, Arrays.asList(inetSocketAddress.getAddress()));
                        }
                        this.f35909d.setSoTimeout(30000);
                        EventListenerTCP eventListenerTCP3 = this.f35916k;
                        if (eventListenerTCP3 != null) {
                            eventListenerTCP3.connectStart(inetSocketAddress);
                        }
                        this.f35909d.connect(inetSocketAddress, 30000);
                        EventListenerTCP eventListenerTCP4 = this.f35916k;
                        if (eventListenerTCP4 != null) {
                            eventListenerTCP4.connectEnd(inetSocketAddress);
                        }
                        this.f35910e = this.f35909d.getOutputStream();
                        this.f35911f = this.f35909d.getInputStream();
                        q0.a("JavaSocketConnection", "Socket connected to " + this.f35906a + StringUtils.PROCESS_POSTFIX_DELIMITER);
                    } catch (ConnectException e10) {
                        EventListenerTCP eventListenerTCP5 = this.f35916k;
                        if (eventListenerTCP5 != null) {
                            eventListenerTCP5.connectFailed(new InetSocketAddress(this.f35906a, this.f35912g.j()), e10);
                        }
                        throw new IOException("Connection refused", e10);
                    }
                } catch (UnknownHostException e11) {
                    EventListenerTCP eventListenerTCP6 = this.f35916k;
                    if (eventListenerTCP6 != null) {
                        eventListenerTCP6.connectFailed(new InetSocketAddress(this.f35906a, this.f35912g.j()), e11);
                    }
                    throw new IOException("Host unreachable", e11);
                }
            } catch (SocketTimeoutException e12) {
                EventListenerTCP eventListenerTCP7 = this.f35916k;
                if (eventListenerTCP7 != null) {
                    eventListenerTCP7.connectFailed(new InetSocketAddress(this.f35906a, this.f35912g.j()), e12);
                }
                throw new IOException("Connection timeout", e12);
            } catch (IOException e13) {
                EventListenerTCP eventListenerTCP8 = this.f35916k;
                if (eventListenerTCP8 != null) {
                    eventListenerTCP8.connectFailed(new InetSocketAddress(this.f35906a, this.f35912g.j()), e13);
                }
                throw new IOException("Connection failed", e13);
            }
        } finally {
            Socket socket = this.f35909d;
            if (socket == null || !socket.isConnected()) {
                b();
            }
        }
    }

    private JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f35906a = com.mbridge.msdk.foundation.same.net.utils.d.h().f37843m;
            int iJ = this.f35912g.j();
            Map<String, Object> mapB = this.f35912g.b();
            JSONObject jSONObject2 = new JSONObject();
            if (mapB != null) {
                for (Map.Entry<String, Object> entry : mapB.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("headers", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("host", this.f35906a);
            jSONObject3.put("port", iJ);
            Map<String, Object> mapA = this.f35912g.a();
            if (mapA != null) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Object> entry2 : mapA.entrySet()) {
                    jSONObject4.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject3.put("data", jSONObject4);
            }
            jSONObject.put("body", jSONObject3);
        } catch (Exception e10) {
            q0.b("JavaSocketConnection", "Failed to prepare request content: " + e10.getMessage());
        }
        return jSONObject;
    }

    private void h() {
        if (this.f35914i == null) {
            return;
        }
        EventListenerTCP eventListenerTCP = this.f35916k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callEnd();
        }
        if (com.mbridge.msdk.config.component.common.util.c.a(this.f35913h.g())) {
            this.f35914i.b(this.f35913h);
            return;
        }
        if (this.f35913h.g() == 200) {
            this.f35914i.c(this.f35913h);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.f35915j;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.f35915j;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.f35912g.g() > 0) {
            new com.mbridge.msdk.config.component.common.network.retry.c(this.f35918m, this.f35912g, this.f35914i, this.f35913h).c();
        } else {
            this.f35914i.d(this.f35913h);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a i() {
        try {
            EventListenerTCP eventListenerTCP = this.f35916k;
            if (eventListenerTCP != null) {
                eventListenerTCP.responseHeadersStart();
            }
            byte[] bArr = new byte[8];
            if (this.f35911f.read(bArr) != 8) {
                return a(1008, 1008, "Failed to read response header");
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            if (byteBufferWrap.get() != 2) {
                return a(1008, 1008, "Invalid protocol version");
            }
            byte b10 = byteBufferWrap.get();
            byteBufferWrap.getShort();
            int i10 = byteBufferWrap.getInt();
            EventListenerTCP eventListenerTCP2 = this.f35916k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.responseHeadersEnd();
            }
            if (i10 > 0) {
                EventListenerTCP eventListenerTCP3 = this.f35916k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.responseBodyStart();
                }
                boolean z10 = false;
                boolean z11 = b10 == 3;
                byte[] bArr2 = new byte[i10];
                new DataInputStream(this.f35911f).readFully(bArr2);
                if (i10 > 2) {
                    if (((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                        z10 = true;
                    }
                }
                try {
                    this.f35913h.b((z11 && z10) ? a(bArr2) : new String(bArr2));
                    this.f35913h.c(200);
                    this.f35913h.b(1);
                    EventListenerTCP eventListenerTCP4 = this.f35916k;
                    if (eventListenerTCP4 != null) {
                        eventListenerTCP4.responseBodyEnd(i10);
                    }
                } catch (Exception e10) {
                    return a(1010, 1010, "Failed to process response data: " + e10.getMessage());
                }
            } else {
                this.f35913h.c(200);
                this.f35913h.b(1);
            }
            return this.f35913h;
        } catch (SocketTimeoutException e11) {
            return a(1004, 1004, "Read timeout: " + e11.getMessage());
        } catch (IOException e12) {
            return a(1006, 1006, "Failed to read response: " + e12.getMessage());
        } catch (Exception e13) {
            return a(1999, 1999, "Unknown error while processing response: " + e13.getMessage());
        }
    }

    public void a() {
        this.f35908c = true;
        b();
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f35915j = aVar;
    }

    public void c(String str) {
        this.f35918m = str;
    }

    public EventListenerTCP e() {
        return this.f35916k;
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
    }
}

package org.eclipse.jetty.io.nio;

import hq.d;
import hq.k;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import jq.e;
import vq.c;

/* JADX INFO: compiled from: ChannelEndPoint.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f76693j = vq.b.a(a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteChannel f76694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer[] f76695c = new ByteBuffer[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f76696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InetSocketAddress f76697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InetSocketAddress f76698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f76699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f76700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f76701i;

    public a(ByteChannel byteChannel, int i10) throws IOException {
        this.f76694b = byteChannel;
        this.f76699g = i10;
        Socket socket = byteChannel instanceof SocketChannel ? ((SocketChannel) byteChannel).socket() : null;
        this.f76696d = socket;
        if (socket == null) {
            this.f76698f = null;
            this.f76697e = null;
        } else {
            this.f76697e = (InetSocketAddress) socket.getLocalSocketAddress();
            this.f76698f = (InetSocketAddress) socket.getRemoteSocketAddress();
            socket.setSoTimeout(this.f76699g);
        }
    }

    public final void A() throws IOException {
        Socket socket;
        f76693j.h("oshut {}", this);
        this.f76701i = true;
        if (!this.f76694b.isOpen() || (socket = this.f76696d) == null) {
            return;
        }
        try {
            try {
                if (!socket.isOutputShutdown()) {
                    this.f76696d.shutdownOutput();
                }
                if (!this.f76700h) {
                    return;
                }
            } catch (SocketException e10) {
                c cVar = f76693j;
                cVar.h(e10.toString(), new Object[0]);
                cVar.g(e10);
                if (!this.f76700h) {
                    return;
                }
            }
            close();
        } catch (Throwable th2) {
            if (this.f76700h) {
                close();
            }
            throw th2;
        }
    }

    @Override // hq.k
    public int c() {
        if (this.f76696d == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f76697e;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // hq.k
    public void close() throws IOException {
        f76693j.h("close {}", this);
        this.f76694b.close();
    }

    @Override // hq.k
    public int d() {
        return this.f76699g;
    }

    public int e(d dVar, ByteBuffer byteBuffer, d dVar2, ByteBuffer byteBuffer2) throws IOException {
        int iWrite;
        synchronized (this) {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.position(dVar.getIndex());
            byteBufferAsReadOnlyBuffer.limit(dVar.T());
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBuffer2.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer2.position(dVar2.getIndex());
            byteBufferAsReadOnlyBuffer2.limit(dVar2.T());
            ByteBuffer[] byteBufferArr = this.f76695c;
            byteBufferArr[0] = byteBufferAsReadOnlyBuffer;
            byteBufferArr[1] = byteBufferAsReadOnlyBuffer2;
            iWrite = (int) ((GatheringByteChannel) this.f76694b).write(byteBufferArr);
            int length = dVar.length();
            if (iWrite > length) {
                dVar.clear();
                dVar2.skip(iWrite - length);
            } else if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        }
        return iWrite;
    }

    @Override // hq.k
    public String f() {
        InetSocketAddress inetSocketAddress;
        if (this.f76696d == null || (inetSocketAddress = this.f76698f) == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // hq.k
    public void flush() throws IOException {
    }

    @Override // hq.k
    public boolean g() {
        Closeable closeable = this.f76694b;
        return !(closeable instanceof SelectableChannel) || ((SelectableChannel) closeable).isBlocking();
    }

    @Override // hq.k
    public String h() {
        if (this.f76696d == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f76697e;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f76697e.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f76697e.getAddress().getHostAddress();
    }

    @Override // hq.k
    public boolean i(long j10) throws IOException {
        return true;
    }

    @Override // hq.k
    public boolean isOpen() {
        return this.f76694b.isOpen();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r3 >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (isOpen() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (z() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (x() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r5.f76694b.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        org.eclipse.jetty.io.nio.a.f76693j.debug("Exception while filling", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r5.f76694b.isOpen() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r5.f76694b.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        org.eclipse.jetty.io.nio.a.f76693j.g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (r2 <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return -1;
     */
    @Override // hq.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(hq.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r5.f76700h
            r1 = -1
            if (r0 == 0) goto L6
            return r1
        L6:
            hq.d r0 = r6.buffer()
            boolean r2 = r0 instanceof jq.d
            if (r2 == 0) goto L82
            jq.d r0 = (jq.d) r0
            java.nio.ByteBuffer r0 = r0.a0()
            r2 = 0
            monitor-enter(r0)     // Catch: java.io.IOException -> L62
            int r3 = r6.T()     // Catch: java.lang.Throwable -> L53
            r0.position(r3)     // Catch: java.lang.Throwable -> L53
            java.nio.channels.ByteChannel r3 = r5.f76694b     // Catch: java.lang.Throwable -> L53
            int r3 = r3.read(r0)     // Catch: java.lang.Throwable -> L53
            int r4 = r0.position()     // Catch: java.lang.Throwable -> L50
            r6.X(r4)     // Catch: java.lang.Throwable -> L50
            r0.position(r2)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            if (r3 >= 0) goto L4e
            boolean r6 = r5.isOpen()     // Catch: java.io.IOException -> L4b
            if (r6 == 0) goto L4e
            boolean r6 = r5.z()     // Catch: java.io.IOException -> L4b
            if (r6 != 0) goto L3f
            r5.l()     // Catch: java.io.IOException -> L4b
        L3f:
            boolean r6 = r5.x()     // Catch: java.io.IOException -> L4b
            if (r6 == 0) goto L4e
            java.nio.channels.ByteChannel r6 = r5.f76694b     // Catch: java.io.IOException -> L4b
            r6.close()     // Catch: java.io.IOException -> L4b
            goto L4e
        L4b:
            r6 = move-exception
            r2 = r3
            goto L63
        L4e:
            r1 = r3
            goto L80
        L50:
            r6 = move-exception
            r2 = r3
            goto L60
        L53:
            r3 = move-exception
            int r4 = r0.position()     // Catch: java.lang.Throwable -> L5f
            r6.X(r4)     // Catch: java.lang.Throwable -> L5f
            r0.position(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5f:
            r6 = move-exception
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r6     // Catch: java.io.IOException -> L62
        L62:
            r6 = move-exception
        L63:
            vq.c r0 = org.eclipse.jetty.io.nio.a.f76693j
            java.lang.String r3 = "Exception while filling"
            r0.debug(r3, r6)
            java.nio.channels.ByteChannel r0 = r5.f76694b     // Catch: java.lang.Exception -> L78
            boolean r0 = r0.isOpen()     // Catch: java.lang.Exception -> L78
            if (r0 == 0) goto L7e
            java.nio.channels.ByteChannel r0 = r5.f76694b     // Catch: java.lang.Exception -> L78
            r0.close()     // Catch: java.lang.Exception -> L78
            goto L7e
        L78:
            r0 = move-exception
            vq.c r3 = org.eclipse.jetty.io.nio.a.f76693j
            r3.g(r0)
        L7e:
            if (r2 > 0) goto L81
        L80:
            return r1
        L81:
            throw r6
        L82:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Not Implemented"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.io.nio.a.j(hq.d):int");
    }

    @Override // hq.k
    public int k(d dVar) throws IOException {
        int iWrite;
        d dVarBuffer = dVar.buffer();
        if (dVarBuffer instanceof jq.d) {
            ByteBuffer byteBufferAsReadOnlyBuffer = ((jq.d) dVarBuffer).a0().asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.position(dVar.getIndex());
            byteBufferAsReadOnlyBuffer.limit(dVar.T());
            iWrite = this.f76694b.write(byteBufferAsReadOnlyBuffer);
            if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        } else if (dVarBuffer instanceof e) {
            iWrite = ((e) dVarBuffer).d(this.f76694b, dVar.getIndex(), dVar.length());
            if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        } else {
            if (dVar.W() == null) {
                throw new IOException("Not Implemented");
            }
            iWrite = this.f76694b.write(ByteBuffer.wrap(dVar.W(), dVar.getIndex(), dVar.length()));
            if (iWrite > 0) {
                dVar.skip(iWrite);
            }
        }
        return iWrite;
    }

    @Override // hq.k
    public void l() throws IOException {
        t();
    }

    @Override // hq.k
    public boolean m(long j10) throws IOException {
        return true;
    }

    public ByteChannel o() {
        return this.f76694b;
    }

    @Override // hq.k
    public void p() throws IOException {
        A();
    }

    @Override // hq.k
    public int r(d dVar, d dVar2, d dVar3) throws IOException {
        d dVarBuffer = dVar == null ? null : dVar.buffer();
        d dVarBuffer2 = dVar2 != null ? dVar2.buffer() : null;
        if ((this.f76694b instanceof GatheringByteChannel) && dVar != null && dVar.length() != 0 && (dVarBuffer instanceof jq.d) && dVar2 != null && dVar2.length() != 0 && (dVarBuffer2 instanceof jq.d)) {
            return e(dVar, ((jq.d) dVarBuffer).a0(), dVar2, ((jq.d) dVarBuffer2).a0());
        }
        int iK = (dVar == null || dVar.length() <= 0) ? 0 : k(dVar);
        if ((dVar == null || dVar.length() == 0) && dVar2 != null && dVar2.length() > 0) {
            iK += k(dVar2);
        }
        return ((dVar == null || dVar.length() == 0) && (dVar2 == null || dVar2.length() == 0) && dVar3 != null && dVar3.length() > 0) ? k(dVar3) + iK : iK;
    }

    @Override // hq.k
    public int s() {
        if (this.f76696d == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f76698f;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    public final void t() throws IOException {
        Socket socket;
        f76693j.h("ishut {}", this);
        this.f76700h = true;
        if (!this.f76694b.isOpen() || (socket = this.f76696d) == null) {
            return;
        }
        try {
            try {
                if (!socket.isInputShutdown()) {
                    this.f76696d.shutdownInput();
                }
                if (!this.f76701i) {
                    return;
                }
            } catch (SocketException e10) {
                c cVar = f76693j;
                cVar.h(e10.toString(), new Object[0]);
                cVar.g(e10);
                if (!this.f76701i) {
                    return;
                }
            }
            close();
        } catch (Throwable th2) {
            if (this.f76701i) {
                close();
            }
            throw th2;
        }
    }

    @Override // hq.k
    public void u(int i10) throws IOException {
        if (this.f76696d != null && i10 != this.f76699g) {
            this.f76696d.setSoTimeout(i10 > 0 ? i10 : 0);
        }
        this.f76699g = i10;
    }

    @Override // hq.k
    public String v() {
        if (this.f76696d == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f76697e;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f76697e.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f76697e.getAddress().getCanonicalHostName();
    }

    @Override // hq.k
    public boolean x() {
        Socket socket;
        return this.f76701i || !this.f76694b.isOpen() || ((socket = this.f76696d) != null && socket.isOutputShutdown());
    }

    @Override // hq.k
    public boolean z() {
        Socket socket;
        return this.f76700h || !this.f76694b.isOpen() || ((socket = this.f76696d) != null && socket.isInputShutdown());
    }
}

package yads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public final class aa3 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f87625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f87626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f87627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f87628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f87629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f87630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f87631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f87632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f87633m;

    public aa3(int i10) {
        super(true);
        this.f87625e = 8000;
        byte[] bArr = new byte[2000];
        this.f87626f = bArr;
        this.f87627g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws z93 {
        Uri uri = u30Var.f95522a;
        this.f87628h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f87628h.getPort();
        e();
        try {
            this.f87631k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f87631k, port);
            if (this.f87631k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f87630j = multicastSocket;
                multicastSocket.joinGroup(this.f87631k);
                this.f87629i = this.f87630j;
            } else {
                this.f87629i = new DatagramSocket(inetSocketAddress);
            }
            this.f87629i.setSoTimeout(this.f87625e);
            this.f87632l = true;
            b(u30Var);
            return -1L;
        } catch (IOException e10) {
            throw new z93(e10, 2001);
        } catch (SecurityException e11) {
            throw new z93(e11, 2006);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f87628h = null;
        MulticastSocket multicastSocket = this.f87630j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f87631k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f87630j = null;
        }
        DatagramSocket datagramSocket = this.f87629i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f87629i = null;
        }
        this.f87631k = null;
        this.f87633m = 0;
        if (this.f87632l) {
            this.f87632l = false;
            d();
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f87628h;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws z93 {
        if (i11 == 0) {
            return 0;
        }
        if (this.f87633m == 0) {
            try {
                DatagramSocket datagramSocket = this.f87629i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f87627g);
                int length = this.f87627g.getLength();
                this.f87633m = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new z93(e10, 2002);
            } catch (IOException e11) {
                throw new z93(e11, 2001);
            }
        }
        int length2 = this.f87627g.getLength();
        int i12 = this.f87633m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f87626f, length2 - i12, bArr, i10, iMin);
        this.f87633m -= iMin;
        return iMin;
    }
}

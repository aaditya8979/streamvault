package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import r7.e;
import r7.k;

/* JADX INFO: loaded from: classes3.dex */
public final class UdpDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f22883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f22884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Uri f22885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public DatagramSocket f22886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public MulticastSocket f22887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public InetAddress f22888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22890m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f22882e = i11;
        byte[] bArr = new byte[i10];
        this.f22883f = bArr;
        this.f22884g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // r7.h
    public long a(k kVar) throws UdpDataSourceException {
        Uri uri = kVar.f78755a;
        this.f22885h = uri;
        String str = (String) s7.a.e(uri.getHost());
        int port = this.f22885h.getPort();
        e(kVar);
        try {
            this.f22888k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f22888k, port);
            if (this.f22888k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f22887j = multicastSocket;
                multicastSocket.joinGroup(this.f22888k);
                this.f22886i = this.f22887j;
            } else {
                this.f22886i = new DatagramSocket(inetSocketAddress);
            }
            this.f22886i.setSoTimeout(this.f22882e);
            this.f22889l = true;
            f(kVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // r7.h
    public void close() {
        this.f22885h = null;
        MulticastSocket multicastSocket = this.f22887j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) s7.a.e(this.f22888k));
            } catch (IOException unused) {
            }
            this.f22887j = null;
        }
        DatagramSocket datagramSocket = this.f22886i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f22886i = null;
        }
        this.f22888k = null;
        this.f22890m = 0;
        if (this.f22889l) {
            this.f22889l = false;
            d();
        }
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return this.f22885h;
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f22890m == 0) {
            try {
                ((DatagramSocket) s7.a.e(this.f22886i)).receive(this.f22884g);
                int length = this.f22884g.getLength();
                this.f22890m = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f22884g.getLength();
        int i12 = this.f22890m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f22883f, length2 - i12, bArr, i10, iMin);
        this.f22890m -= iMin;
        return iMin;
    }
}

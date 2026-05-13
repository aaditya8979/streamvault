package com.google.android.exoplayer.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import y5.h;

/* JADX INFO: loaded from: classes9.dex */
public final class UdpDataSource extends y5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f21043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f21044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Uri f21045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public DatagramSocket f21046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public MulticastSocket f21047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public InetAddress f21048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public InetSocketAddress f21049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21051n;

    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
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
        this.f21042e = i11;
        byte[] bArr = new byte[i10];
        this.f21043f = bArr;
        this.f21044g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws UdpDataSourceException {
        Uri uri = hVar.f87270a;
        this.f21045h = uri;
        String host = uri.getHost();
        int port = this.f21045h.getPort();
        e(hVar);
        try {
            this.f21048k = InetAddress.getByName(host);
            this.f21049l = new InetSocketAddress(this.f21048k, port);
            if (this.f21048k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f21049l);
                this.f21047j = multicastSocket;
                multicastSocket.joinGroup(this.f21048k);
                this.f21046i = this.f21047j;
            } else {
                this.f21046i = new DatagramSocket(this.f21049l);
            }
            try {
                this.f21046i.setSoTimeout(this.f21042e);
                this.f21050m = true;
                f(hVar);
                return -1L;
            } catch (SocketException e10) {
                throw new UdpDataSourceException(e10);
            }
        } catch (IOException e11) {
            throw new UdpDataSourceException(e11);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() {
        this.f21045h = null;
        MulticastSocket multicastSocket = this.f21047j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f21048k);
            } catch (IOException unused) {
            }
            this.f21047j = null;
        }
        DatagramSocket datagramSocket = this.f21046i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f21046i = null;
        }
        this.f21048k = null;
        this.f21049l = null;
        this.f21051n = 0;
        if (this.f21050m) {
            this.f21050m = false;
            d();
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f21045h;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f21051n == 0) {
            try {
                this.f21046i.receive(this.f21044g);
                int length = this.f21044g.getLength();
                this.f21051n = length;
                c(length);
            } catch (IOException e10) {
                throw new UdpDataSourceException(e10);
            }
        }
        int length2 = this.f21044g.getLength();
        int i12 = this.f21051n;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f21043f, length2 - i12, bArr, i10, iMin);
        this.f21051n -= iMin;
        return iMin;
    }
}

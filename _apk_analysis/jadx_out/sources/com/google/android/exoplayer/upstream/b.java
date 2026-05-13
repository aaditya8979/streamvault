package com.google.android.exoplayer.upstream;

import a6.k0;
import a6.m;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import y5.h;
import y5.q;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<q> f21053b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f21054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a f21055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f21056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a f21057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public a f21058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public a f21059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f21060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f21061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a f21062k;

    public b(Context context, a aVar) {
        this.f21052a = context.getApplicationContext();
        this.f21054c = (a) a6.a.e(aVar);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws IOException {
        a6.a.f(this.f21062k == null);
        String scheme = hVar.f87270a.getScheme();
        if (k0.h0(hVar.f87270a)) {
            String path = hVar.f87270a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f21062k = g();
            } else {
                this.f21062k = d();
            }
        } else if ("asset".equals(scheme)) {
            this.f21062k = d();
        } else if ("content".equals(scheme)) {
            this.f21062k = e();
        } else if ("rtmp".equals(scheme)) {
            this.f21062k = i();
        } else if ("udp".equals(scheme)) {
            this.f21062k = j();
        } else if ("data".equals(scheme)) {
            this.f21062k = f();
        } else if ("rawresource".equals(scheme)) {
            this.f21062k = h();
        } else {
            this.f21062k = this.f21054c;
        }
        return this.f21062k.a(hVar);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void b(q qVar) {
        this.f21054c.b(qVar);
        this.f21053b.add(qVar);
        k(this.f21055d, qVar);
        k(this.f21056e, qVar);
        k(this.f21057f, qVar);
        k(this.f21058g, qVar);
        k(this.f21059h, qVar);
        k(this.f21060i, qVar);
        k(this.f21061j, qVar);
    }

    public final void c(a aVar) {
        for (int i10 = 0; i10 < this.f21053b.size(); i10++) {
            aVar.b(this.f21053b.get(i10));
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws IOException {
        a aVar = this.f21062k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f21062k = null;
            }
        }
    }

    public final a d() {
        if (this.f21056e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f21052a);
            this.f21056e = assetDataSource;
            c(assetDataSource);
        }
        return this.f21056e;
    }

    public final a e() {
        if (this.f21057f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f21052a);
            this.f21057f = contentDataSource;
            c(contentDataSource);
        }
        return this.f21057f;
    }

    public final a f() {
        if (this.f21060i == null) {
            y5.e eVar = new y5.e();
            this.f21060i = eVar;
            c(eVar);
        }
        return this.f21060i;
    }

    public final a g() {
        if (this.f21055d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f21055d = fileDataSource;
            c(fileDataSource);
        }
        return this.f21055d;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        a aVar = this.f21062k;
        return aVar == null ? Collections.emptyMap() : aVar.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        a aVar = this.f21062k;
        if (aVar == null) {
            return null;
        }
        return aVar.getUri();
    }

    public final a h() {
        if (this.f21061j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f21052a);
            this.f21061j = rawResourceDataSource;
            c(rawResourceDataSource);
        }
        return this.f21061j;
    }

    public final a i() {
        if (this.f21058g == null) {
            try {
                a aVar = (a) Class.forName("com.google.android.exoplayer.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f21058g = aVar;
                c(aVar);
            } catch (ClassNotFoundException unused) {
                m.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f21058g == null) {
                this.f21058g = this.f21054c;
            }
        }
        return this.f21058g;
    }

    public final a j() {
        if (this.f21059h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f21059h = udpDataSource;
            c(udpDataSource);
        }
        return this.f21059h;
    }

    public final void k(@Nullable a aVar, q qVar) {
        if (aVar != null) {
            aVar.b(qVar);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((a) a6.a.e(this.f21062k)).read(bArr, i10, i11);
    }
}

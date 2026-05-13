package r7;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r7.h;
import r7.p;
import s7.m0;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<y> f78812b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f78813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public h f78814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public h f78815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public h f78816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public h f78817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public h f78818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public h f78819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public h f78820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public h f78821k;

    /* JADX INFO: compiled from: DefaultDataSource.java */
    public static final class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f78822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h.a f78823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public y f78824c;

        public a(Context context) {
            this(context, new p.b());
        }

        public a(Context context, h.a aVar) {
            this.f78822a = context.getApplicationContext();
            this.f78823b = aVar;
        }

        @Override // r7.h.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createDataSource() {
            o oVar = new o(this.f78822a, this.f78823b.createDataSource());
            y yVar = this.f78824c;
            if (yVar != null) {
                oVar.b(yVar);
            }
            return oVar;
        }
    }

    public o(Context context, h hVar) {
        this.f78811a = context.getApplicationContext();
        this.f78813c = (h) s7.a.e(hVar);
    }

    @Override // r7.h
    public long a(k kVar) throws IOException {
        s7.a.g(this.f78821k == null);
        String scheme = kVar.f78755a.getScheme();
        if (m0.q0(kVar.f78755a)) {
            String path = kVar.f78755a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f78821k = g();
            } else {
                this.f78821k = d();
            }
        } else if ("asset".equals(scheme)) {
            this.f78821k = d();
        } else if ("content".equals(scheme)) {
            this.f78821k = e();
        } else if ("rtmp".equals(scheme)) {
            this.f78821k = i();
        } else if ("udp".equals(scheme)) {
            this.f78821k = j();
        } else if ("data".equals(scheme)) {
            this.f78821k = f();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f78821k = h();
        } else {
            this.f78821k = this.f78813c;
        }
        return this.f78821k.a(kVar);
    }

    @Override // r7.h
    public void b(y yVar) {
        s7.a.e(yVar);
        this.f78813c.b(yVar);
        this.f78812b.add(yVar);
        k(this.f78814d, yVar);
        k(this.f78815e, yVar);
        k(this.f78816f, yVar);
        k(this.f78817g, yVar);
        k(this.f78818h, yVar);
        k(this.f78819i, yVar);
        k(this.f78820j, yVar);
    }

    public final void c(h hVar) {
        for (int i10 = 0; i10 < this.f78812b.size(); i10++) {
            hVar.b(this.f78812b.get(i10));
        }
    }

    @Override // r7.h
    public void close() throws IOException {
        h hVar = this.f78821k;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f78821k = null;
            }
        }
    }

    public final h d() {
        if (this.f78815e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f78811a);
            this.f78815e = assetDataSource;
            c(assetDataSource);
        }
        return this.f78815e;
    }

    public final h e() {
        if (this.f78816f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f78811a);
            this.f78816f = contentDataSource;
            c(contentDataSource);
        }
        return this.f78816f;
    }

    public final h f() {
        if (this.f78819i == null) {
            g gVar = new g();
            this.f78819i = gVar;
            c(gVar);
        }
        return this.f78819i;
    }

    public final h g() {
        if (this.f78814d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f78814d = fileDataSource;
            c(fileDataSource);
        }
        return this.f78814d;
    }

    @Override // r7.h
    public Map<String, List<String>> getResponseHeaders() {
        h hVar = this.f78821k;
        return hVar == null ? Collections.emptyMap() : hVar.getResponseHeaders();
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        h hVar = this.f78821k;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    public final h h() {
        if (this.f78820j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f78811a);
            this.f78820j = rawResourceDataSource;
            c(rawResourceDataSource);
        }
        return this.f78820j;
    }

    public final h i() {
        if (this.f78817g == null) {
            try {
                h hVar = (h) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f78817g = hVar;
                c(hVar);
            } catch (ClassNotFoundException unused) {
                s7.q.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f78817g == null) {
                this.f78817g = this.f78813c;
            }
        }
        return this.f78817g;
    }

    public final h j() {
        if (this.f78818h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f78818h = udpDataSource;
            c(udpDataSource);
        }
        return this.f78818h;
    }

    public final void k(@Nullable h hVar, y yVar) {
        if (hVar != null) {
            hVar.b(yVar);
        }
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((h) s7.a.e(this.f78821k)).read(bArr, i10, i11);
    }
}

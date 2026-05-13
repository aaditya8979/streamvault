package yads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pc0 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f93541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93542b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p30 f93543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cv0 f93544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zi f93545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pz f93546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p30 f93547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public aa3 f93548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m30 f93549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bm2 f93550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p30 f93551k;

    public pc0(Context context, p30 p30Var) {
        this.f93541a = context.getApplicationContext();
        this.f93543c = (p30) ni.a(p30Var);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        if (this.f93551k != null) {
            throw new IllegalStateException();
        }
        String scheme = u30Var.f95522a.getScheme();
        Uri uri = u30Var.f95522a;
        int i10 = ib3.f90737a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || C3978d4.i.f31327b.equals(scheme2)) {
            String path = u30Var.f95522a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f93544d == null) {
                    cv0 cv0Var = new cv0();
                    this.f93544d = cv0Var;
                    a(cv0Var);
                }
                this.f93551k = this.f93544d;
            } else {
                if (this.f93545e == null) {
                    zi ziVar = new zi(this.f93541a);
                    this.f93545e = ziVar;
                    a(ziVar);
                }
                this.f93551k = this.f93545e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f93545e == null) {
                zi ziVar2 = new zi(this.f93541a);
                this.f93545e = ziVar2;
                a(ziVar2);
            }
            this.f93551k = this.f93545e;
        } else if ("content".equals(scheme)) {
            if (this.f93546f == null) {
                pz pzVar = new pz(this.f93541a);
                this.f93546f = pzVar;
                a(pzVar);
            }
            this.f93551k = this.f93546f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f93547g == null) {
                try {
                    p30 p30Var = (p30) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f93547g = p30Var;
                    a(p30Var);
                } catch (ClassNotFoundException unused) {
                    ih1.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.f93547g == null) {
                    this.f93547g = this.f93543c;
                }
            }
            this.f93551k = this.f93547g;
        } else if ("udp".equals(scheme)) {
            if (this.f93548h == null) {
                aa3 aa3Var = new aa3(0);
                this.f93548h = aa3Var;
                a(aa3Var);
            }
            this.f93551k = this.f93548h;
        } else if ("data".equals(scheme)) {
            if (this.f93549i == null) {
                m30 m30Var = new m30();
                this.f93549i = m30Var;
                a(m30Var);
            }
            this.f93551k = this.f93549i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f93550j == null) {
                bm2 bm2Var = new bm2(this.f93541a);
                this.f93550j = bm2Var;
                a(bm2Var);
            }
            this.f93551k = this.f93550j;
        } else {
            this.f93551k = this.f93543c;
        }
        return this.f93551k.a(u30Var);
    }

    public final void a(p30 p30Var) {
        for (int i10 = 0; i10 < this.f93542b.size(); i10++) {
            p30Var.a((r83) this.f93542b.get(i10));
        }
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f93543c.a(r83Var);
        this.f93542b.add(r83Var);
        cv0 cv0Var = this.f93544d;
        if (cv0Var != null) {
            cv0Var.a(r83Var);
        }
        zi ziVar = this.f93545e;
        if (ziVar != null) {
            ziVar.a(r83Var);
        }
        pz pzVar = this.f93546f;
        if (pzVar != null) {
            pzVar.a(r83Var);
        }
        p30 p30Var = this.f93547g;
        if (p30Var != null) {
            p30Var.a(r83Var);
        }
        aa3 aa3Var = this.f93548h;
        if (aa3Var != null) {
            aa3Var.a(r83Var);
        }
        m30 m30Var = this.f93549i;
        if (m30Var != null) {
            m30Var.a(r83Var);
        }
        bm2 bm2Var = this.f93550j;
        if (bm2Var != null) {
            bm2Var.a(r83Var);
        }
    }

    @Override // yads.p30
    public final void close() {
        p30 p30Var = this.f93551k;
        if (p30Var != null) {
            try {
                p30Var.close();
            } finally {
                this.f93551k = null;
            }
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        p30 p30Var = this.f93551k;
        return p30Var == null ? Collections.emptyMap() : p30Var.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        p30 p30Var = this.f93551k;
        if (p30Var == null) {
            return null;
        }
        return p30Var.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        p30 p30Var = this.f93551k;
        p30Var.getClass();
        return p30Var.read(bArr, i10, i11);
    }
}

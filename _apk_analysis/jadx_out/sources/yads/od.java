package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class od implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd f93177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93178b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pd f93179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f93180d;

    public od(dd ddVar) {
        this.f93177a = ddVar;
    }

    public final void a() {
        pd pdVar = this.f93179c;
        if (pdVar != null) {
            vc vcVar = (vc) pdVar;
            vcVar.f96056a.f96707b.a();
            ng0.a(vcVar.f96056a.f96706a);
        }
    }

    @Override // yads.n11
    public final void a(int i10) {
        int[] iArr = {-12, -6, -11, -2};
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            if (i10 == iArr[i11]) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            a();
        }
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f93178b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
            pd pdVar = this.f93179c;
            if (pdVar != null) {
                ((vc) pdVar).f96056a.f96708c.a(str);
            }
        } catch (URISyntaxException unused) {
            boolean z10 = ad1.f87661a;
            a();
        }
    }

    public final List b() {
        return cn.w.p(new qd("adtuneRendered", new nd(this)), new qd("adtuneClosed", new ld(this)), new qd("openOptOut", new md(this)));
    }
}

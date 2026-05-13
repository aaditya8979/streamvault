package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gd implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa2 f89919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f89920b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hd f89921c;

    public gd(pa2 pa2Var) {
        this.f89919a = pa2Var;
    }

    public final List a() {
        return cn.v.e(new qd("noInterestAd", new fd(this)));
    }

    @Override // yads.n11
    public final void a(int i10) {
        hd hdVar;
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
        if (!z10 || (hdVar = this.f89921c) == null) {
            return;
        }
        ng0.a(((bd) hdVar).f87960a.f88410a);
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f89920b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            boolean z10 = ad1.f87661a;
        }
    }
}

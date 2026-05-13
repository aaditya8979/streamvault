package sg.bigo.ads.ad.c;

import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80093c;

    public c(f fVar) {
        this.f80091a = 2;
        this.f80092b = 0;
        this.f80093c = 1;
        if (fVar == null) {
            return;
        }
        this.f80091a = fVar.f81860a.ao();
        this.f80092b = fVar.f81860a.ap();
        this.f80093c = fVar.f81860a.aq();
    }
}

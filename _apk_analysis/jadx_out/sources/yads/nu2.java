package yads;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class nu2 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f92993b;

    public nu2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f92992a = str;
        this.f92993b = sSLSocketFactory;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new ku2(this.f92992a, 8000, 8000, false, new t11(), this.f92993b);
    }
}

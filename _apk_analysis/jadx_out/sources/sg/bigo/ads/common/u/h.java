package sg.bigo.ads.common.u;

/* JADX INFO: loaded from: classes12.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f82460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f82461c;

    public h(int i10, String str) {
        this.f82459a = i10;
        this.f82460b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.f82461c;
        return exc != null ? exc.getMessage() : this.f82460b;
    }
}

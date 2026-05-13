package np;

/* JADX INFO: compiled from: AppStatusManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f75952b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75953a = 0;

    public static b b() {
        if (f75952b == null) {
            synchronized (b.class) {
                if (f75952b == null) {
                    f75952b = new b();
                }
            }
        }
        return f75952b;
    }

    public int a() {
        return this.f75953a;
    }

    public void c(int i10) {
        this.f75953a = i10;
    }
}

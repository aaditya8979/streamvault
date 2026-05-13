package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f3421b;

    public static c i() {
        if (f3421b == null) {
            synchronized (c.class) {
                if (f3421b == null) {
                    f3421b = new c();
                }
            }
        }
        return f3421b;
    }
}

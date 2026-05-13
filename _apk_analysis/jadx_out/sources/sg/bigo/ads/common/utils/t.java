package sg.bigo.ads.common.utils;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f82522a;

    public static void a(String str) {
        if (f82522a) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(boolean z10) {
        f82522a = z10;
    }

    public static boolean a() {
        return false;
    }

    public static boolean b() {
        return f82522a;
    }

    public static void c() {
    }
}

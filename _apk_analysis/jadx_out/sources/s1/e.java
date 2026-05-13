package s1;

/* JADX INFO: compiled from: XLog.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f78995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f78996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f2.b f78997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f78998d;

    public static void a() {
        if (!f78998d) {
            throw new IllegalStateException("Do you forget to initialize XLog?");
        }
    }

    public static void b(String str) {
        a();
        f78995a.a(str);
    }

    public static void c(String str) {
        a();
        f78995a.b(str);
    }

    public static void d(String str, Throwable th2) {
        a();
        f78995a.c(str, th2);
    }

    public static void e(String str, Object... objArr) {
        a();
        f78995a.d(str, objArr);
    }

    public static void f(String str) {
        a();
        f78995a.f(str);
    }

    public static void g(a aVar, f2.b... bVarArr) {
        if (f78998d) {
            d2.b.b().d("XLog is already initialized, do not initialize again");
        }
        f78998d = true;
        if (aVar == null) {
            throw new IllegalArgumentException("Please specify a LogConfiguration");
        }
        f78996b = aVar;
        f2.c cVar = new f2.c(bVarArr);
        f78997c = cVar;
        f78995a = new d(f78996b, cVar);
    }

    public static void h(String str) {
        a();
        f78995a.k(str);
    }
}

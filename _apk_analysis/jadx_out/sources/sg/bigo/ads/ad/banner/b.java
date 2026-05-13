package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<InterfaceC0966b, a> f79939a = new WeakHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f79940a;

        private a() {
            this.f79940a = new long[9];
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC0966b {
    }

    public static <T extends Ad> long a(InterfaceC0966b interfaceC0966b, long j10) {
        if (j10 == -1) {
            return -1L;
        }
        return j10 - j(interfaceC0966b).f79940a[4];
    }

    public static <T extends Ad> void a(InterfaceC0966b interfaceC0966b) {
        a(interfaceC0966b, 0);
    }

    private static <T extends Ad> void a(InterfaceC0966b interfaceC0966b, int i10) {
        j(interfaceC0966b).f79940a[i10] = SystemClock.elapsedRealtime();
    }

    public static <T extends Ad> void b(InterfaceC0966b interfaceC0966b) {
        a(interfaceC0966b, 1);
    }

    public static <T extends Ad> void c(InterfaceC0966b interfaceC0966b) {
        a(interfaceC0966b, 2);
    }

    public static <T extends Ad> void d(InterfaceC0966b interfaceC0966b) {
        a(interfaceC0966b, 3);
    }

    public static <T extends Ad> void e(InterfaceC0966b interfaceC0966b) {
        a(interfaceC0966b, 4);
    }

    public static <T extends Ad> void f(InterfaceC0966b interfaceC0966b) {
        a(interfaceC0966b, 5);
    }

    public static <T extends Ad> void g(InterfaceC0966b interfaceC0966b) {
        a(interfaceC0966b, 6);
    }

    public static <T extends Ad> void h(InterfaceC0966b interfaceC0966b) {
        f79939a.remove(interfaceC0966b);
    }

    public static <T extends Ad> long i(InterfaceC0966b interfaceC0966b) {
        long[] jArr = j(interfaceC0966b).f79940a;
        return jArr[6] - jArr[4];
    }

    @NonNull
    private static <T extends Ad> a j(InterfaceC0966b interfaceC0966b) {
        Map<InterfaceC0966b, a> map = f79939a;
        a aVar = map.get(interfaceC0966b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC0966b, aVar2);
        return aVar2;
    }
}

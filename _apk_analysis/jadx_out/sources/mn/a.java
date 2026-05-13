package mn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes10.dex */
public class a extends ln.a {

    /* JADX INFO: renamed from: mn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    public static final class C0886a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0886a f74812a = new C0886a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static final Integer f74813b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                if (num2.intValue() > 0) {
                    num = num2;
                }
            }
            f74813b = num;
        }
    }

    @Override // ln.a
    public void a(@NotNull Throwable th2, @NotNull Throwable th3) {
        p.k(th2, "cause");
        p.k(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }

    public final boolean c(int i10) {
        Integer num = C0886a.f74813b;
        return num == null || num.intValue() >= i10;
    }
}

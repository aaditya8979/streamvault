package nn;

import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes10.dex */
public class a extends mn.a {

    /* JADX INFO: renamed from: nn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    public static final class C0900a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0900a f75913a = new C0900a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static final Integer f75914b;

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
            f75914b = num;
        }
    }

    private final boolean c(int i10) {
        Integer num = C0900a.f75914b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ln.a
    @NotNull
    public Random b() {
        return c(34) ? new yn.a() : super.b();
    }
}

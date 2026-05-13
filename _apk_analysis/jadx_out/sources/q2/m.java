package q2;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: InAppPurchaseUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007JE\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJE\u0010\r\u001a\u0004\u0018\u00010\n2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\r\u0010\fJG\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lq2/m;", "", "", "className", "Ljava/lang/Class;", "a", "clazz", "methodName", "", "args", "Ljava/lang/reflect/Method;", "d", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "c", "method", IconCompat.EXTRA_OBJ, "e", "(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Class;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f77648a = new m();

    @Nullable
    public static final Class<?> a(@NotNull String className) {
        if (c3.a.d(m.class)) {
            return null;
        }
        try {
            p.k(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, m.class);
            return null;
        }
    }

    @Nullable
    public static final Class<?> b(@NotNull Context context, @NotNull String className) {
        if (c3.a.d(m.class)) {
            return null;
        }
        try {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, m.class);
            return null;
        }
    }

    @Nullable
    public static final Method c(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... args) {
        if (c3.a.d(m.class)) {
            return null;
        }
        try {
            p.k(clazz, "clazz");
            p.k(methodName, "methodName");
            p.k(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, m.class);
            return null;
        }
    }

    @Nullable
    public static final Method d(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... args) {
        if (c3.a.d(m.class)) {
            return null;
        }
        try {
            p.k(clazz, "clazz");
            p.k(methodName, "methodName");
            p.k(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, m.class);
            return null;
        }
    }

    @Nullable
    public static final Object e(@NotNull Class<?> clazz, @NotNull Method method, @Nullable Object obj, @NotNull Object... args) {
        if (c3.a.d(m.class)) {
            return null;
        }
        try {
            p.k(clazz, "clazz");
            p.k(method, "method");
            p.k(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, m.class);
            return null;
        }
    }
}

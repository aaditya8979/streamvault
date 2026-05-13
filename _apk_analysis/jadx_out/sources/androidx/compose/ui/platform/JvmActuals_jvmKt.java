package androidx.compose.ui.platform;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JvmActuals.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a/\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b*\f\b\u0000\u0010\r\"\u00020\f2\u00020\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"", IconCompat.EXTRA_OBJ, "", "name", "simpleIdentityToString", "nativeClass", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lsn/a;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class JvmActuals_jvmKt {
    @NotNull
    public static final Object nativeClass(@NotNull Object obj) {
        tn.p.k(obj, "<this>");
        return obj.getClass();
    }

    @NotNull
    public static final String simpleIdentityToString(@NotNull Object obj, @Nullable String str) {
        tn.p.k(obj, IconCompat.EXTRA_OBJ);
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        tn.x xVar = tn.x.f85368a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        tn.p.j(str2, "format(format, *args)");
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3325synchronized(@NotNull Object obj, @NotNull sn.a<? extends R> aVar) {
        R rInvoke;
        tn.p.k(obj, "lock");
        tn.p.k(aVar, "block");
        synchronized (obj) {
            try {
                rInvoke = aVar.invoke();
                tn.n.b(1);
            } catch (Throwable th2) {
                tn.n.b(1);
                tn.n.a(1);
                throw th2;
            }
        }
        tn.n.a(1);
        return rInvoke;
    }
}

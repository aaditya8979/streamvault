package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import bn.r;
import com.ironsource.C4157n2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.n;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0000H\u0000*\u001e\b\u0000\u0010\u0018\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u00028\u00000\u00172\b\u0012\u0004\u0012\u00028\u00000\u0017*\f\b\u0000\u0010\u001a\"\u00020\u00192\u00020\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"", C4157n2.f33007p, "", "identityHashCode", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lsn/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/Composer;", "composer", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "composable", "invokeComposable", "(Landroidx/compose/runtime/Composer;Lsn/p;)V", "T", "invokeComposableForResult", "(Landroidx/compose/runtime/Composer;Lsn/p;)Ljava/lang/Object;", "it", "ensureMutable", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "Lorg/jetbrains/annotations/TestOnly;", "TestOnly", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class ActualJvm_jvmKt {
    public static final void ensureMutable(@NotNull Object obj) {
        p.k(obj, "it");
    }

    public static final int identityHashCode(@Nullable Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(@NotNull Composer composer, @NotNull sn.p<? super Composer, ? super Integer, r> pVar) {
        p.k(composer, "composer");
        p.k(pVar, "composable");
        ((sn.p) y.e(pVar, 2)).mo2invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(@NotNull Composer composer, @NotNull sn.p<? super Composer, ? super Integer, ? extends T> pVar) {
        p.k(composer, "composer");
        p.k(pVar, "composable");
        return (T) ((sn.p) y.e(pVar, 2)).mo2invoke(composer, 1);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m1259synchronized(@NotNull Object obj, @NotNull a<? extends R> aVar) {
        R rInvoke;
        p.k(obj, "lock");
        p.k(aVar, "block");
        synchronized (obj) {
            try {
                rInvoke = aVar.invoke();
                n.b(1);
            } catch (Throwable th2) {
                n.b(1);
                n.a(1);
                throw th2;
            }
        }
        n.a(1);
        return rInvoke;
    }
}

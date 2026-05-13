package androidx.compose.ui.text.platform;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Synchronization.jvm.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/platform/SynchronizedObject;", "createSynchronizedObject", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Landroidx/compose/ui/text/platform/SynchronizedObject;Lsn/a;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 6, 0})
public final class Synchronization_jvmKt {
    @NotNull
    public static final SynchronizedObject createSynchronizedObject() {
        return new SynchronizedObject();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3668synchronized(@NotNull SynchronizedObject synchronizedObject, @NotNull a<? extends R> aVar) {
        R rInvoke;
        p.k(synchronizedObject, "lock");
        p.k(aVar, "block");
        synchronized (synchronizedObject) {
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

package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lsn/a;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class TraceKt {
    public static final <T> T trace(@NotNull String str, @NotNull a<? extends T> aVar) {
        p.k(str, "sectionName");
        p.k(aVar, "block");
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection(str);
        try {
            T tInvoke = aVar.invoke();
            n.b(1);
            trace.endSection(objBeginSection);
            n.a(1);
            return tInvoke;
        } catch (Throwable th2) {
            n.b(1);
            Trace.INSTANCE.endSection(objBeginSection);
            n.a(1);
            throw th2;
        }
    }
}

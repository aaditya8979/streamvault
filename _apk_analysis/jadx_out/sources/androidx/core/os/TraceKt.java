package androidx.core.os;

import android.os.Trace;
import org.jetbrains.annotations.NotNull;
import tn.n;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TraceKt {
    public static final <T> T trace(@NotNull String str, @NotNull sn.a<? extends T> aVar) {
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            n.b(1);
            Trace.endSection();
            n.a(1);
        }
    }
}

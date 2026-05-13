package bo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Appendable.kt */
/* JADX INFO: loaded from: classes.dex */
public class q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void a(@NotNull Appendable appendable, T t10, @Nullable sn.l<? super T, ? extends CharSequence> lVar) {
        tn.p.k(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(t10.toString());
        }
    }
}

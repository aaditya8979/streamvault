package androidx.compose.ui.modifier;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: ModifierLocal.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, d2 = {"modifierLocalOf", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "T", "defaultFactory", "Lkotlin/Function0;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ModifierLocalKt {
    @NotNull
    public static final <T> ProvidableModifierLocal<T> modifierLocalOf(@NotNull a<? extends T> aVar) {
        p.k(aVar, "defaultFactory");
        return new ProvidableModifierLocal<>(aVar);
    }
}

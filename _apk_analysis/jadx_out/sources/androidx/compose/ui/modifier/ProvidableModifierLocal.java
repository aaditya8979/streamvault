package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: ModifierLocal.kt */
/* JADX INFO: loaded from: classes3.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lsn/a;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ProvidableModifierLocal<T> extends ModifierLocal<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvidableModifierLocal(@NotNull a<? extends T> aVar) {
        super(aVar, null);
        p.k(aVar, "defaultFactory");
    }
}

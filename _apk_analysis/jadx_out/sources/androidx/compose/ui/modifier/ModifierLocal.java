package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.i;

/* JADX INFO: compiled from: ModifierLocal.kt */
/* JADX INFO: loaded from: classes12.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocal;", "T", "", "Lkotlin/Function0;", "defaultFactory", "Lsn/a;", "getDefaultFactory$ui_release", "()Lsn/a;", "<init>", "(Lsn/a;)V", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, k = 1, mv = {1, 6, 0})
public abstract class ModifierLocal<T> {

    @NotNull
    private final a<T> defaultFactory;

    /* JADX WARN: Multi-variable type inference failed */
    private ModifierLocal(a<? extends T> aVar) {
        this.defaultFactory = aVar;
    }

    public /* synthetic */ ModifierLocal(a aVar, i iVar) {
        this(aVar);
    }

    @NotNull
    public final a<T> getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }
}

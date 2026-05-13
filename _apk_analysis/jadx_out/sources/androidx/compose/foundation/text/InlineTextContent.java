package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: InlineTextContent.kt */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/InlineTextContent;", "", "Landroidx/compose/ui/text/Placeholder;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "Lkotlin/Function1;", "", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "children", "Lsn/q;", "getChildren", "()Lsn/q;", "<init>", "(Landroidx/compose/ui/text/Placeholder;Lsn/q;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class InlineTextContent {

    @NotNull
    private final q<String, Composer, Integer, r> children;

    @NotNull
    private final Placeholder placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(@NotNull Placeholder placeholder, @NotNull q<? super String, ? super Composer, ? super Integer, r> qVar) {
        p.k(placeholder, "placeholder");
        p.k(qVar, "children");
        this.placeholder = placeholder;
        this.children = qVar;
    }

    @NotNull
    public final q<String, Composer, Integer, r> getChildren() {
        return this.children;
    }

    @NotNull
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}

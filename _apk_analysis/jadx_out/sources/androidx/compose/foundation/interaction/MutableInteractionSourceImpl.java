package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import bn.r;
import go.k;
import go.q;
import hn.c;
import in.a;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: InteractionSource.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lbn/r;", "emit", "(Landroidx/compose/foundation/interaction/Interaction;Lhn/c;)Ljava/lang/Object;", "", "tryEmit", "Lgo/k;", "interactions", "Lgo/k;", "getInteractions", "()Lgo/k;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    @NotNull
    private final k<Interaction> interactions = q.b(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    @Nullable
    public Object emit(@NotNull Interaction interaction, @NotNull c<? super r> cVar) {
        Object objEmit = getInteractions().emit(interaction, cVar);
        return objEmit == a.g() ? objEmit : r.f5635a;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @NotNull
    public k<Interaction> getInteractions() {
        return this.interactions;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(@NotNull Interaction interaction) {
        p.k(interaction, "interaction");
        return getInteractions().h(interaction);
    }
}

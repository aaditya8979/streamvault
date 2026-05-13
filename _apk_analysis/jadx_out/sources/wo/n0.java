package wo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@NotNull SerialDescriptor serialDescriptor, @NotNull SerialDescriptor serialDescriptor2) {
        super("kotlin.collections.HashMap", serialDescriptor, serialDescriptor2, null);
        tn.p.k(serialDescriptor, "keyDesc");
        tn.p.k(serialDescriptor2, "valueDesc");
    }
}

package wo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class p0 extends d1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        tn.p.k(serialDescriptor, "elementDesc");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return "kotlin.collections.HashSet";
    }
}

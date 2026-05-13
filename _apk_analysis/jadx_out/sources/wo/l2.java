package wo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l2 extends d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f86568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(@NotNull SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        tn.p.k(serialDescriptor, "primitive");
        this.f86568c = serialDescriptor.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return this.f86568c;
    }
}

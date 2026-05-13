package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R0\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "parentValue", "childValue", "merge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "Lbn/r;", "setValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotlin/Function2;", "mergePolicy", "Lsn/p;", "getMergePolicy$ui_release", "()Lsn/p;", "<init>", "(Ljava/lang/String;Lsn/p;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 0;

    @NotNull
    private final p<T, T, T> mergePolicy;

    @NotNull
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@NotNull String str, @NotNull p<? super T, ? super T, ? extends T> pVar) {
        tn.p.k(str, "name");
        tn.p.k(pVar, "mergePolicy");
        this.name = str;
        this.mergePolicy = pVar;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, p pVar, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? new p<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final T mo2invoke(@Nullable T t10, T t11) {
                return t10 == null ? t11 : t10;
            }
        } : pVar);
    }

    @NotNull
    public final p<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final T getValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull KProperty<?> property) {
        tn.p.k(thisRef, "thisRef");
        tn.p.k(property, "property");
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    @Nullable
    public final T merge(@Nullable T parentValue, T childValue) {
        return this.mergePolicy.mo2invoke(parentValue, childValue);
    }

    public final void setValue(@NotNull SemanticsPropertyReceiver thisRef, @NotNull KProperty<?> property, T value) {
        tn.p.k(thisRef, "thisRef");
        tn.p.k(property, "property");
        thisRef.set(this, value);
    }

    @NotNull
    public String toString() {
        return "SemanticsPropertyKey: " + this.name;
    }
}

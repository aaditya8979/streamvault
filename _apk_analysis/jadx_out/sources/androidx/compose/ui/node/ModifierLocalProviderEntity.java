package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ModifierLocalProviderEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b*\u0010+J\u001c\u0010\u0007\u001a\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0018\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003J\t\u0010\r\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/ui/modifier/ModifierLocal;", "local", "", "stopIfProvided", "invalidateConsumersOf", "attach", "attachDelayed", "detach", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "findModifierLocalProvider", "invoke", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "modifier", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "getModifier", "()Landroidx/compose/ui/modifier/ModifierLocalProvider;", "next", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "getNext", "()Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "setNext", "(Landroidx/compose/ui/node/ModifierLocalProviderEntity;)V", "prev", "getPrev", "setPrev", "<set-?>", "isAttached", "Z", "()Z", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "consumers", "Landroidx/compose/runtime/collection/MutableVector;", "getConsumers", "()Landroidx/compose/runtime/collection/MutableVector;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/modifier/ModifierLocalProvider;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ModifierLocalProviderEntity implements sn.a<r> {

    @NotNull
    private final MutableVector<ModifierLocalConsumerEntity> consumers;
    private boolean isAttached;

    @NotNull
    private final LayoutNode layoutNode;

    @NotNull
    private final ModifierLocalProvider<?> modifier;

    @Nullable
    private ModifierLocalProviderEntity next;

    @Nullable
    private ModifierLocalProviderEntity prev;

    public ModifierLocalProviderEntity(@NotNull LayoutNode layoutNode, @NotNull ModifierLocalProvider<?> modifierLocalProvider) {
        p.k(layoutNode, "layoutNode");
        p.k(modifierLocalProvider, "modifier");
        this.layoutNode = layoutNode;
        this.modifier = modifierLocalProvider;
        this.consumers = new MutableVector<>(new ModifierLocalConsumerEntity[16], 0);
    }

    private final void invalidateConsumersOf(ModifierLocal<?> modifierLocal, boolean z10) {
        r rVar;
        MutableVector<LayoutNode> mutableVector;
        int size;
        if (z10 && p.f(this.modifier.getKey(), modifierLocal)) {
            return;
        }
        MutableVector<ModifierLocalConsumerEntity> mutableVector2 = this.consumers;
        int size2 = mutableVector2.getSize();
        int i10 = 0;
        if (size2 > 0) {
            ModifierLocalConsumerEntity[] content = mutableVector2.getContent();
            int i11 = 0;
            do {
                content[i11].invalidateConsumersOf(modifierLocal);
                i11++;
            } while (i11 < size2);
        }
        ModifierLocalProviderEntity modifierLocalProviderEntity = this.next;
        if (modifierLocalProviderEntity != null) {
            modifierLocalProviderEntity.invalidateConsumersOf(modifierLocal, true);
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar != null || (size = (mutableVector = this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
            return;
        }
        LayoutNode[] content2 = mutableVector.getContent();
        do {
            content2[i10].getModifierLocalsHead().invalidateConsumersOf(modifierLocal, true);
            i10++;
        } while (i10 < size);
    }

    public final void attach() {
        this.isAttached = true;
        int i10 = 0;
        invalidateConsumersOf(this.modifier.getKey(), false);
        MutableVector<ModifierLocalConsumerEntity> mutableVector = this.consumers;
        int size = mutableVector.getSize();
        if (size > 0) {
            ModifierLocalConsumerEntity[] content = mutableVector.getContent();
            do {
                content[i10].attach();
                i10++;
            } while (i10 < size);
        }
    }

    public final void attachDelayed() {
        this.isAttached = true;
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            owner.registerOnEndApplyChangesListener(this);
        }
        MutableVector<ModifierLocalConsumerEntity> mutableVector = this.consumers;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = 0;
            ModifierLocalConsumerEntity[] content = mutableVector.getContent();
            do {
                content[i10].attachDelayed();
                i10++;
            } while (i10 < size);
        }
    }

    public final void detach() {
        this.isAttached = false;
        MutableVector<ModifierLocalConsumerEntity> mutableVector = this.consumers;
        int size = mutableVector.getSize();
        if (size > 0) {
            ModifierLocalConsumerEntity[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].detach();
                i10++;
            } while (i10 < size);
        }
        invalidateConsumersOf(this.modifier.getKey(), false);
    }

    @Nullable
    public final ModifierLocalProvider<?> findModifierLocalProvider(@NotNull ModifierLocal<?> local) {
        ModifierLocalProviderEntity modifierLocalsTail;
        ModifierLocalProvider<?> modifierLocalProviderFindModifierLocalProvider;
        p.k(local, "local");
        if (p.f(this.modifier.getKey(), local)) {
            return this.modifier;
        }
        ModifierLocalProviderEntity modifierLocalProviderEntity = this.prev;
        if (modifierLocalProviderEntity != null && (modifierLocalProviderFindModifierLocalProvider = modifierLocalProviderEntity.findModifierLocalProvider(local)) != null) {
            return modifierLocalProviderFindModifierLocalProvider;
        }
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release == null || (modifierLocalsTail = parent$ui_release.getModifierLocalsTail()) == null) {
            return null;
        }
        return modifierLocalsTail.findModifierLocalProvider(local);
    }

    @NotNull
    public final MutableVector<ModifierLocalConsumerEntity> getConsumers() {
        return this.consumers;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @NotNull
    public final ModifierLocalProvider<?> getModifier() {
        return this.modifier;
    }

    @Nullable
    public final ModifierLocalProviderEntity getNext() {
        return this.next;
    }

    @Nullable
    public final ModifierLocalProviderEntity getPrev() {
        return this.prev;
    }

    @Override // sn.a
    public /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        if (this.isAttached) {
            invalidateConsumersOf(this.modifier.getKey(), false);
        }
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public final void setNext(@Nullable ModifierLocalProviderEntity modifierLocalProviderEntity) {
        this.next = modifierLocalProviderEntity;
    }

    public final void setPrev(@Nullable ModifierLocalProviderEntity modifierLocalProviderEntity) {
        this.prev = modifierLocalProviderEntity;
    }
}

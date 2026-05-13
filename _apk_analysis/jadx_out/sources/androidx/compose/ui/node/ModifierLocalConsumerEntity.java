package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import bn.r;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ModifierLocalConsumerEntity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001)B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0012\u0010\n\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\t\u0010\r\u001a\u00020\u0002H\u0096\u0002R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0014\u0010\"\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010!R$\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010#*\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "attach", "attachDelayed", "detach", "Landroidx/compose/ui/modifier/ModifierLocal;", "local", "invalidateConsumersOf", "notifyConsumerOfChanges", "invalidateConsumer", "invoke", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", IronSourceConstants.EVENTS_PROVIDER, "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "getProvider", "()Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "setProvider", "(Landroidx/compose/ui/node/ModifierLocalProviderEntity;)V", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "modifier", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "getModifier", "()Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/runtime/collection/MutableVector;", "modifierLocalsRead", "Landroidx/compose/runtime/collection/MutableVector;", "", "<set-?>", "isAttached", "Z", "()Z", "isValid", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", VideoLookHistoryEntry.CURRNET, "<init>", "(Landroidx/compose/ui/node/ModifierLocalProviderEntity;Landroidx/compose/ui/modifier/ModifierLocalConsumer;)V", VastTagName.COMPANION, "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ModifierLocalConsumerEntity implements sn.a<r>, OwnerScope, ModifierLocalReadScope {
    private boolean isAttached;

    @NotNull
    private final ModifierLocalConsumer modifier;

    @NotNull
    private final MutableVector<ModifierLocal<?>> modifierLocalsRead;

    @NotNull
    private ModifierLocalProviderEntity provider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final l<ModifierLocalConsumerEntity, r> onReadValuesChanged = new l<ModifierLocalConsumerEntity, r>() { // from class: androidx.compose.ui.node.ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(ModifierLocalConsumerEntity modifierLocalConsumerEntity) {
            invoke2(modifierLocalConsumerEntity);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ModifierLocalConsumerEntity modifierLocalConsumerEntity) {
            p.k(modifierLocalConsumerEntity, "node");
            modifierLocalConsumerEntity.notifyConsumerOfChanges();
        }
    };

    @NotNull
    private static final ModifierLocalReadScope DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.ModifierLocalConsumerEntity$Companion$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(@NotNull ModifierLocal<T> modifierLocal) {
            p.k(modifierLocal, "<this>");
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };

    /* JADX INFO: compiled from: ModifierLocalConsumerEntity.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/ModifierLocalConsumerEntity$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "Lbn/r;", "onReadValuesChanged", "Lsn/l;", "getOnReadValuesChanged", "()Lsn/l;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "DetachedModifierLocalReadScope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "getDetachedModifierLocalReadScope", "()Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final ModifierLocalReadScope getDetachedModifierLocalReadScope() {
            return ModifierLocalConsumerEntity.DetachedModifierLocalReadScope;
        }

        @NotNull
        public final l<ModifierLocalConsumerEntity, r> getOnReadValuesChanged() {
            return ModifierLocalConsumerEntity.onReadValuesChanged;
        }
    }

    public ModifierLocalConsumerEntity(@NotNull ModifierLocalProviderEntity modifierLocalProviderEntity, @NotNull ModifierLocalConsumer modifierLocalConsumer) {
        p.k(modifierLocalProviderEntity, IronSourceConstants.EVENTS_PROVIDER);
        p.k(modifierLocalConsumer, "modifier");
        this.provider = modifierLocalProviderEntity;
        this.modifier = modifierLocalConsumer;
        this.modifierLocalsRead = new MutableVector<>(new ModifierLocal[16], 0);
    }

    public final void attach() {
        this.isAttached = true;
        notifyConsumerOfChanges();
    }

    public final void attachDelayed() {
        this.isAttached = true;
        invalidateConsumer();
    }

    public final void detach() {
        this.modifier.onModifierLocalsUpdated(DetachedModifierLocalReadScope);
        this.isAttached = false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    public <T> T getCurrent(@NotNull ModifierLocal<T> modifierLocal) {
        p.k(modifierLocal, "<this>");
        this.modifierLocalsRead.add(modifierLocal);
        ModifierLocalProvider<?> modifierLocalProviderFindModifierLocalProvider = this.provider.findModifierLocalProvider(modifierLocal);
        return modifierLocalProviderFindModifierLocalProvider == null ? modifierLocal.getDefaultFactory$ui_release().invoke() : (T) modifierLocalProviderFindModifierLocalProvider.getValue();
    }

    @NotNull
    public final ModifierLocalConsumer getModifier() {
        return this.modifier;
    }

    @NotNull
    public final ModifierLocalProviderEntity getProvider() {
        return this.provider;
    }

    public final void invalidateConsumer() {
        Owner owner = this.provider.getLayoutNode().getOwner();
        if (owner != null) {
            owner.registerOnEndApplyChangesListener(this);
        }
    }

    public final void invalidateConsumersOf(@NotNull ModifierLocal<?> modifierLocal) {
        Owner owner;
        p.k(modifierLocal, "local");
        if (!this.modifierLocalsRead.contains(modifierLocal) || (owner = this.provider.getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.registerOnEndApplyChangesListener(this);
    }

    @Override // sn.a
    public /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        notifyConsumerOfChanges();
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.isAttached;
    }

    public final void notifyConsumerOfChanges() {
        if (this.isAttached) {
            this.modifierLocalsRead.clear();
            LayoutNodeKt.requireOwner(this.provider.getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, onReadValuesChanged, new sn.a<r>() { // from class: androidx.compose.ui.node.ModifierLocalConsumerEntity.notifyConsumerOfChanges.1
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ModifierLocalConsumerEntity.this.getModifier().onModifierLocalsUpdated(ModifierLocalConsumerEntity.this);
                }
            });
        }
    }

    public final void setProvider(@NotNull ModifierLocalProviderEntity modifierLocalProviderEntity) {
        p.k(modifierLocalProviderEntity, "<set-?>");
        this.provider = modifierLocalProviderEntity;
    }
}

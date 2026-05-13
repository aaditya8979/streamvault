package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0004\b(\u0010)J%\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\n\u0010\bJ%\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\f\u0010\bJC\u0010\u0015\u001a\u00020\u0005\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006*"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "Lkotlin/Function0;", "Lbn/r;", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;Lsn/a;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "Landroidx/compose/ui/node/OwnerScope;", "T", TypedValues.AttributesType.S_TARGET, "Lkotlin/Function1;", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lsn/l;Lsn/a;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "clear$ui_release", "(Ljava/lang/Object;)V", "clear", "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingMeasure", "Lsn/l;", "onCommitAffectingLayout", "onCommitAffectingLayoutModifier", "onChangedExecutor", "<init>", "(Lsn/l;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class OwnerSnapshotObserver {

    @NotNull
    private final SnapshotStateObserver observer;

    @NotNull
    private final l<LayoutNode, r> onCommitAffectingLayout;

    @NotNull
    private final l<LayoutNode, r> onCommitAffectingLayoutModifier;

    @NotNull
    private final l<LayoutNode, r> onCommitAffectingMeasure;

    public OwnerSnapshotObserver(@NotNull l<? super sn.a<r>, r> lVar) {
        p.k(lVar, "onChangedExecutor");
        this.observer = new SnapshotStateObserver(lVar);
        this.onCommitAffectingMeasure = new l<LayoutNode, r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                p.k(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayout = new l<LayoutNode, r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                p.k(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayoutModifier = new l<LayoutNode, r>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                p.k(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
    }

    public final void clear$ui_release(@NotNull Object target) {
        p.k(target, TypedValues.AttributesType.S_TARGET);
        this.observer.clear(target);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new l<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                p.k(obj, "it");
                return Boolean.valueOf(!((OwnerScope) obj).isValid());
            }
        });
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@NotNull LayoutNode node, @NotNull sn.a<r> block) {
        p.k(node, "node");
        p.k(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingLayoutModifier, block);
    }

    public final void observeLayoutSnapshotReads$ui_release(@NotNull LayoutNode node, @NotNull sn.a<r> block) {
        p.k(node, "node");
        p.k(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingLayout, block);
    }

    public final void observeMeasureSnapshotReads$ui_release(@NotNull LayoutNode node, @NotNull sn.a<r> block) {
        p.k(node, "node");
        p.k(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingMeasure, block);
    }

    public final <T extends OwnerScope> void observeReads$ui_release(@NotNull T target, @NotNull l<? super T, r> onChanged, @NotNull sn.a<r> block) {
        p.k(target, TypedValues.AttributesType.S_TARGET);
        p.k(onChanged, "onChanged");
        p.k(block, "block");
        this.observer.observeReads(target, onChanged, block);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}

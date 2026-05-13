package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import bn.r;
import cn.f0;
import cn.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\be\u0010fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002J3\u0010\u0018\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!R\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+\"\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00106\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010+R\u0011\u0010C\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010G\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010O\u001a\u00020L8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bP\u0010JR\u001a\u0010T\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010NR\u0011\u0010V\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bU\u0010JR\u001a\u0010X\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bW\u0010NR\u0011\u0010Z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bY\u00105R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010[R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00000\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010[R\u0011\u0010a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\ba\u0010+R\u0013\u0010d\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "mergedConfig", "Lbn/r;", "mergeConfig", "", "sortByBounds", "includeReplacedSemantics", "includeFakeNodes", "", "getChildren", "", "list", "findOneLayerOfMergingSemanticsNodes", "unmergedChildren", "emitFakeNodes", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "properties", "fakeSemanticsNode-ypyhhiA", "(Landroidx/compose/ui/semantics/Role;Lsn/l;)Landroidx/compose/ui/semantics/SemanticsNode;", "fakeSemanticsNode", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getAlignmentLinePosition", "unmergedChildren$ui_release", "(ZZ)Ljava/util/List;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "findWrapperToGetBounds$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "findWrapperToGetBounds", "Landroidx/compose/ui/semantics/SemanticsEntity;", "outerSemanticsEntity", "Landroidx/compose/ui/semantics/SemanticsEntity;", "getOuterSemanticsEntity$ui_release", "()Landroidx/compose/ui/semantics/SemanticsEntity;", "mergingEnabled", "Z", "getMergingEnabled", "()Z", "isFake", "isFake$ui_release", "setFake$ui_release", "(Z)V", "fakeNodeParent", "Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "id", "I", "getId", "()I", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "isMergingSemanticsOfDescendants", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "root", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getPositionInWindow-F1C5BW0", "positionInWindow", "getConfig", "config", "()Ljava/util/List;", "children", "getReplacedChildren$ui_release", "replacedChildren", "getReplacedChildrenSortedByBounds$ui_release", "replacedChildrenSortedByBounds", "isRoot", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "parent", "<init>", "(Landroidx/compose/ui/semantics/SemanticsEntity;Z)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class SemanticsNode {
    public static final int $stable = 8;

    @Nullable
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;

    @NotNull
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;

    @NotNull
    private final SemanticsEntity outerSemanticsEntity;

    @NotNull
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(@NotNull SemanticsEntity semanticsEntity, boolean z10) {
        p.k(semanticsEntity, "outerSemanticsEntity");
        this.outerSemanticsEntity = semanticsEntity;
        this.mergingEnabled = z10;
        this.unmergedConfig = semanticsEntity.collapsedSemanticsConfiguration();
        this.id = semanticsEntity.getModifier().getId();
        this.layoutNode = semanticsEntity.getLayoutNode();
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        final Role role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(m3378fakeSemanticsNodeypyhhiA(role, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    p.k(semanticsPropertyReceiver, "$this$fakeSemanticsNode");
                    SemanticsPropertiesKt.m3385setRolekuIjeqM(semanticsPropertyReceiver, role.getValue());
                }
            }));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!list.isEmpty()) && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            final String str = list2 != null ? (String) f0.v0(list2) : null;
            if (str != null) {
                list.add(0, m3378fakeSemanticsNodeypyhhiA(null, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        p.k(semanticsPropertyReceiver, "$this$fakeSemanticsNode");
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m3378fakeSemanticsNodeypyhhiA(Role role, l<? super SemanticsPropertyReceiver, r> properties) {
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsEntity(new LayoutNode(true).getInnerLayoutNodeWrapper(), new SemanticsModifierCore(role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this), false, false, properties)), false);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list, boolean sortByBounds) {
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, sortByBounds, false, 2, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i10);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                findOneLayerOfMergingSemanticsNodes$default(semanticsNode, list, false, 2, null);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list, z10);
    }

    private final List<SemanticsNode> getChildren(boolean sortByBounds, boolean includeReplacedSemantics, boolean includeFakeNodes) {
        return (includeReplacedSemantics || !this.unmergedConfig.getIsClearingSemantics()) ? isMergingSemanticsOfDescendants() ? findOneLayerOfMergingSemanticsNodes$default(this, null, sortByBounds, 1, null) : unmergedChildren$ui_release(sortByBounds, includeFakeNodes) : w.m();
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i10);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(semanticsConfiguration);
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z10, z11);
    }

    @NotNull
    public final LayoutNodeWrapper findWrapperToGetBounds$ui_release() {
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            return this.outerSemanticsEntity.getLayoutNodeWrapper();
        }
        SemanticsEntity outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsEntity;
        }
        return outerMergingSemantics.getLayoutNodeWrapper();
    }

    public final int getAlignmentLinePosition(@NotNull AlignmentLine alignmentLine) {
        p.k(alignmentLine, "alignmentLine");
        return findWrapperToGetBounds$ui_release().get(alignmentLine);
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        return !this.layoutNode.isAttached() ? Rect.INSTANCE.getZero() : LayoutCoordinatesKt.boundsInRoot(findWrapperToGetBounds$ui_release());
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        return !this.layoutNode.isAttached() ? Rect.INSTANCE.getZero() : LayoutCoordinatesKt.boundsInWindow(findWrapperToGetBounds$ui_release());
    }

    @NotNull
    public final List<SemanticsNode> getChildren() {
        return getChildren(false, !this.mergingEnabled, false);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        if (!isMergingSemanticsOfDescendants()) {
            return this.unmergedConfig;
        }
        SemanticsConfiguration semanticsConfigurationCopy = this.unmergedConfig.copy();
        mergeConfig(semanticsConfigurationCopy);
        return semanticsConfigurationCopy;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: getOuterSemanticsEntity$ui_release, reason: from getter */
    public final SemanticsEntity getOuterSemanticsEntity() {
        return this.outerSemanticsEntity;
    }

    @Nullable
    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNodeFindClosestParentNode = this.mergingEnabled ? SemanticsNodeKt.findClosestParentNode(this.layoutNode, new l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
                p.k(layoutNode, "it");
                SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
                return Boolean.valueOf((outerSemantics == null || (semanticsConfigurationCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) == null || !semanticsConfigurationCollapsedSemanticsConfiguration.getIsMergingSemanticsOfDescendants()) ? false : true);
            }
        }) : null;
        if (layoutNodeFindClosestParentNode == null) {
            layoutNodeFindClosestParentNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, new l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                    p.k(layoutNode, "it");
                    return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(layoutNode) != null);
                }
            });
        }
        SemanticsEntity outerSemantics = layoutNodeFindClosestParentNode != null ? SemanticsNodeKt.getOuterSemantics(layoutNodeFindClosestParentNode) : null;
        if (outerSemantics == null) {
            return null;
        }
        return new SemanticsNode(outerSemantics, this.mergingEnabled);
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m3379getPositionInRootF1C5BW0() {
        return !this.layoutNode.isAttached() ? Offset.INSTANCE.m1399getZeroF1C5BW0() : LayoutCoordinatesKt.positionInRoot(findWrapperToGetBounds$ui_release());
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m3380getPositionInWindowF1C5BW0() {
        return !this.layoutNode.isAttached() ? Offset.INSTANCE.m1399getZeroF1C5BW0() : LayoutCoordinatesKt.positionInWindow(findWrapperToGetBounds$ui_release());
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, false, true);
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildrenSortedByBounds$ui_release() {
        return getChildren(true, false, true);
    }

    @Nullable
    public final RootForTest getRoot() {
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            return owner.getRootForTest();
        }
        return null;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3381getSizeYbymL2g() {
        return findWrapperToGetBounds$ui_release().mo3114getSizeYbymL2g();
    }

    @NotNull
    public final Rect getTouchBoundsInRoot() {
        SemanticsEntity outerMergingSemantics;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode)) == null) {
            outerMergingSemantics = this.outerSemanticsEntity;
        }
        return outerMergingSemantics.touchBoundsInRoot();
    }

    @NotNull
    /* JADX INFO: renamed from: getUnmergedConfig$ui_release, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: isFake$ui_release, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final void setFake$ui_release(boolean z10) {
        this.isFake = z10;
    }

    @NotNull
    public final List<SemanticsNode> unmergedChildren$ui_release(boolean sortByBounds, boolean includeFakeNodes) {
        if (this.isFake) {
            return w.m();
        }
        ArrayList arrayList = new ArrayList();
        List listFindOneLayerOfSemanticsWrappersSortedByBounds$default = sortByBounds ? SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds$default(this.layoutNode, null, 1, null) : SemanticsNodeKt.findOneLayerOfSemanticsWrappers$default(this.layoutNode, null, 1, null);
        int size = listFindOneLayerOfSemanticsWrappersSortedByBounds$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new SemanticsNode((SemanticsEntity) listFindOneLayerOfSemanticsWrappersSortedByBounds$default.get(i10), this.mergingEnabled));
        }
        if (includeFakeNodes) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }
}

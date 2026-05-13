package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SemanticsSort.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0010\u0011B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder;", "", "subtreeRoot", "Landroidx/compose/ui/node/LayoutNode;", "node", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "location", "Landroidx/compose/ui/geometry/Rect;", "getNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "getSubtreeRoot$ui_release", "compareTo", "", "other", VastTagName.COMPANION, "ComparisonStrategy", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static ComparisonStrategy comparisonStrategy = ComparisonStrategy.Stripe;

    @NotNull
    private final LayoutDirection layoutDirection;

    @Nullable
    private final Rect location;

    @NotNull
    private final LayoutNode node;

    @NotNull
    private final LayoutNode subtreeRoot;

    /* JADX INFO: compiled from: SemanticsSort.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;", "", "()V", "comparisonStrategy", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "getComparisonStrategy$ui_release", "()Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "setComparisonStrategy$ui_release", "(Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final ComparisonStrategy getComparisonStrategy$ui_release() {
            return NodeLocationHolder.comparisonStrategy;
        }

        public final void setComparisonStrategy$ui_release(@NotNull ComparisonStrategy comparisonStrategy) {
            p.k(comparisonStrategy, "<set-?>");
            NodeLocationHolder.comparisonStrategy = comparisonStrategy;
        }
    }

    /* JADX INFO: compiled from: SemanticsSort.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "(Ljava/lang/String;I)V", "Stripe", "Location", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    public NodeLocationHolder(@NotNull LayoutNode layoutNode, @NotNull LayoutNode layoutNode2) {
        p.k(layoutNode, "subtreeRoot");
        p.k(layoutNode2, "node");
        this.subtreeRoot = layoutNode;
        this.node = layoutNode2;
        this.layoutDirection = layoutNode.getLayoutDirection();
        LayoutNodeWrapper innerLayoutNodeWrapper = layoutNode.getInnerLayoutNodeWrapper();
        LayoutNodeWrapper layoutNodeWrapperFindWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(layoutNode2);
        Rect rectLocalBoundingBoxOf$default = null;
        if (innerLayoutNodeWrapper.isAttached() && layoutNodeWrapperFindWrapperToGetBounds.isAttached()) {
            rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(innerLayoutNodeWrapper, layoutNodeWrapperFindWrapperToGetBounds, false, 2, null);
        }
        this.location = rectLocalBoundingBoxOf$default;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull NodeLocationHolder other) {
        p.k(other, "other");
        Rect rect = this.location;
        if (rect == null) {
            return 1;
        }
        if (other.location == null) {
            return -1;
        }
        if (comparisonStrategy == ComparisonStrategy.Stripe) {
            if (rect.getBottom() - other.location.getTop() <= 0.0f) {
                return -1;
            }
            if (this.location.getTop() - other.location.getBottom() >= 0.0f) {
                return 1;
            }
        }
        if (this.layoutDirection == LayoutDirection.Ltr) {
            float left = this.location.getLeft() - other.location.getLeft();
            if (!(left == 0.0f)) {
                return left < 0.0f ? -1 : 1;
            }
        } else {
            float right = this.location.getRight() - other.location.getRight();
            if (!(right == 0.0f)) {
                return right < 0.0f ? 1 : -1;
            }
        }
        float top2 = this.location.getTop() - other.location.getTop();
        if (!(top2 == 0.0f)) {
            return top2 < 0.0f ? -1 : 1;
        }
        float height = this.location.getHeight() - other.location.getHeight();
        if (!(height == 0.0f)) {
            return height < 0.0f ? 1 : -1;
        }
        float width = this.location.getWidth() - other.location.getWidth();
        if (!(width == 0.0f)) {
            return width < 0.0f ? 1 : -1;
        }
        final Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(this.node));
        final Rect rectBoundsInRoot2 = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(other.node));
        LayoutNode layoutNodeFindNodeByPredicateTraversal = SemanticsSortKt.findNodeByPredicateTraversal(this.node, new l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child1$1
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                p.k(layoutNode, "it");
                LayoutNodeWrapper layoutNodeWrapperFindWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(layoutNode);
                return Boolean.valueOf(layoutNodeWrapperFindWrapperToGetBounds.isAttached() && !p.f(rectBoundsInRoot, LayoutCoordinatesKt.boundsInRoot(layoutNodeWrapperFindWrapperToGetBounds)));
            }
        });
        LayoutNode layoutNodeFindNodeByPredicateTraversal2 = SemanticsSortKt.findNodeByPredicateTraversal(other.node, new l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child2$1
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                p.k(layoutNode, "it");
                LayoutNodeWrapper layoutNodeWrapperFindWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(layoutNode);
                return Boolean.valueOf(layoutNodeWrapperFindWrapperToGetBounds.isAttached() && !p.f(rectBoundsInRoot2, LayoutCoordinatesKt.boundsInRoot(layoutNodeWrapperFindWrapperToGetBounds)));
            }
        });
        return (layoutNodeFindNodeByPredicateTraversal == null || layoutNodeFindNodeByPredicateTraversal2 == null) ? layoutNodeFindNodeByPredicateTraversal != null ? 1 : -1 : new NodeLocationHolder(this.subtreeRoot, layoutNodeFindNodeByPredicateTraversal).compareTo(new NodeLocationHolder(other.subtreeRoot, layoutNodeFindNodeByPredicateTraversal2));
    }

    @NotNull
    /* JADX INFO: renamed from: getNode$ui_release, reason: from getter */
    public final LayoutNode getNode() {
        return this.node;
    }

    @NotNull
    /* JADX INFO: renamed from: getSubtreeRoot$ui_release, reason: from getter */
    public final LayoutNode getSubtreeRoot() {
        return this.subtreeRoot;
    }
}

package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LayoutTreeConsistencyChecker.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isTreeConsistent", "consistentLayoutState", "", "nodeToString", "logTree", "Lbn/r;", "assertConsistent", "root", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "", "postponedMeasureRequests", "Ljava/util/List;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class LayoutTreeConsistencyChecker {

    @NotNull
    private final List<LayoutNode> postponedMeasureRequests;

    @NotNull
    private final DepthSortedSet relayoutNodes;

    @NotNull
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode layoutNode, @NotNull DepthSortedSet depthSortedSet, @NotNull List<LayoutNode> list) {
        p.k(layoutNode, "root");
        p.k(depthSortedSet, "relayoutNodes");
        p.k(list, "postponedMeasureRequests");
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSet;
        this.postponedMeasureRequests = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean consistentLayoutState(androidx.compose.ui.node.LayoutNode r6) {
        /*
            r5 = this;
            androidx.compose.ui.node.LayoutNode r0 = r6.getParent$ui_release()
            boolean r1 = r6.getIsPlaced()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L22
            int r1 = r6.getPlaceOrder()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r4) goto L8c
            if (r0 == 0) goto L1f
            boolean r1 = r0.getIsPlaced()
            if (r1 != r3) goto L1f
            r1 = r3
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r1 == 0) goto L8c
        L22:
            boolean r1 = r6.getMeasurePending()
            if (r1 == 0) goto L31
            java.util.List<androidx.compose.ui.node.LayoutNode> r1 = r5.postponedMeasureRequests
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L31
            return r3
        L31:
            if (r0 == 0) goto L38
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.getLayoutState()
            goto L39
        L38:
            r1 = 0
        L39:
            boolean r4 = r6.getMeasurePending()
            if (r4 == 0) goto L5a
            androidx.compose.ui.node.DepthSortedSet r4 = r5.relayoutNodes
            boolean r6 = r4.contains(r6)
            if (r6 != 0) goto L58
            if (r0 == 0) goto L51
            boolean r6 = r0.getMeasurePending()
            if (r6 != r3) goto L51
            r6 = r3
            goto L52
        L51:
            r6 = r2
        L52:
            if (r6 != 0) goto L58
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r1 != r6) goto L59
        L58:
            r2 = r3
        L59:
            return r2
        L5a:
            boolean r4 = r6.getLayoutPending()
            if (r4 == 0) goto L8c
            androidx.compose.ui.node.DepthSortedSet r4 = r5.relayoutNodes
            boolean r6 = r4.contains(r6)
            if (r6 != 0) goto L8a
            if (r0 == 0) goto L72
            boolean r6 = r0.getMeasurePending()
            if (r6 != r3) goto L72
            r6 = r3
            goto L73
        L72:
            r6 = r2
        L73:
            if (r6 != 0) goto L8a
            if (r0 == 0) goto L7f
            boolean r6 = r0.getLayoutPending()
            if (r6 != r3) goto L7f
            r6 = r3
            goto L80
        L7f:
            r6 = r2
        L80:
            if (r6 != 0) goto L8a
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r1 == r6) goto L8a
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r1 != r6) goto L8b
        L8a:
            r2 = r3
        L8b:
            return r2
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutTreeConsistencyChecker.consistentLayoutState(androidx.compose.ui.node.LayoutNode):boolean");
    }

    private final boolean isTreeConsistent(LayoutNode node) {
        if (!consistentLayoutState(node)) {
            return false;
        }
        List<LayoutNode> children$ui_release = node.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!isTreeConsistent(children$ui_release.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        p.j(sb2, "append(value)");
        sb2.append('\n');
        p.j(sb2, "append('\\n')");
        logTree$printSubTree(this, sb2, this.root, 0);
        String string = sb2.toString();
        p.j(string, "stringBuilder.toString()");
        return string;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb2, LayoutNode layoutNode, int i10) {
        String strNodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (strNodeToString.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strNodeToString);
            p.j(sb2, "append(value)");
            sb2.append('\n');
            p.j(sb2, "append('\\n')");
            i10++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb2, children$ui_release.get(i12), i10);
        }
    }

    private final String nodeToString(LayoutNode node) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(node);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(node.getLayoutState());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!node.getIsPlaced()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + node.getMeasuredByParent() + ']');
        if (!consistentLayoutState(node)) {
            sb2.append("[INCONSISTENT]");
        }
        String string = sb2.toString();
        p.j(string, "with(StringBuilder()) {\n…     toString()\n        }");
        return string;
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println((Object) logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}

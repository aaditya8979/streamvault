package androidx.compose.ui.node;

import bn.g;
import bn.r;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\"\u0010\f\u001a\u00020\u00062\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000J\u0006\u0010\r\u001a\u00020\u0004J\t\u0010\u000e\u001a\u00020\u0004H\u0086\bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "contains", "Lbn/r;", ImpressionLog.f51742l, "remove", "pop", "Lkotlin/Function1;", "block", "popEach", "isEmpty", "isNotEmpty", "", "toString", "extraAssertions", "Z", "", "", "mapOfOriginalDepth$delegate", "Lbn/g;", "getMapOfOriginalDepth", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/TreeSet;", "set", "Landroidx/compose/ui/node/TreeSet;", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class DepthSortedSet {

    @NotNull
    private final Comparator<LayoutNode> DepthComparator;
    private final boolean extraAssertions;

    /* JADX INFO: renamed from: mapOfOriginalDepth$delegate, reason: from kotlin metadata */
    @NotNull
    private final g mapOfOriginalDepth;

    @NotNull
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet() {
        this(false, 1, null);
    }

    public DepthSortedSet(boolean z10) {
        this.extraAssertions = z10;
        this.mapOfOriginalDepth = b.a(LazyThreadSafetyMode.NONE, new sn.a<Map<LayoutNode, Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
            @Override // sn.a
            @NotNull
            public final Map<LayoutNode, Integer> invoke() {
                return new LinkedHashMap();
            }
        });
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(@NotNull LayoutNode l12, @NotNull LayoutNode l22) {
                p.k(l12, "l1");
                p.k(l22, "l2");
                int iM = p.m(l12.getDepth(), l22.getDepth());
                return iM != 0 ? iM : p.m(l12.hashCode(), l22.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new TreeSet<>(comparator);
    }

    public /* synthetic */ DepthSortedSet(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    private final Map<LayoutNode, Integer> getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final void add(@NotNull LayoutNode layoutNode) {
        p.k(layoutNode, "node");
        if (!layoutNode.isAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.extraAssertions) {
            Integer num = getMapOfOriginalDepth().get(layoutNode);
            if (num == null) {
                getMapOfOriginalDepth().put(layoutNode, Integer.valueOf(layoutNode.getDepth()));
            } else {
                if (!(num.intValue() == layoutNode.getDepth())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        p.k(node, "node");
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == getMapOfOriginalDepth().containsKey(node))) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return zContains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        LayoutNode layoutNodeFirst = this.set.first();
        p.j(layoutNodeFirst, "node");
        remove(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final void popEach(@NotNull l<? super LayoutNode, r> lVar) {
        p.k(lVar, "block");
        while (!isEmpty()) {
            lVar.invoke(pop());
        }
    }

    public final boolean remove(@NotNull LayoutNode node) {
        p.k(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            Integer numRemove = getMapOfOriginalDepth().remove(node);
            if (zRemove) {
                if (!(numRemove != null && numRemove.intValue() == node.getDepth())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                if (!(numRemove == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        return zRemove;
    }

    @NotNull
    public String toString() {
        String string = this.set.toString();
        p.j(string, "set.toString()");
        return string;
    }
}

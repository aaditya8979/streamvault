package com.yandex.div.core.util;

import ao.i;
import bn.r;
import cn.c;
import cn.m;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: DivTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTreeWalk implements i<DivItemBuilderResult> {
    private final int maxDepth;

    @Nullable
    private final l<Div, Boolean> onEnter;

    @Nullable
    private final l<Div, r> onLeave;

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final Div root;

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public static final class BranchNode implements Node {
        private int childIndex;

        @Nullable
        private List<DivItemBuilderResult> children;

        @NotNull
        private final DivItemBuilderResult item;

        @Nullable
        private final l<Div, Boolean> onEnter;

        @Nullable
        private final l<Div, r> onLeave;
        private boolean rootVisited;

        /* JADX WARN: Multi-variable type inference failed */
        public BranchNode(@NotNull DivItemBuilderResult divItemBuilderResult, @Nullable l<? super Div, Boolean> lVar, @Nullable l<? super Div, r> lVar2) {
            this.item = divItemBuilderResult;
            this.onEnter = lVar;
            this.onLeave = lVar2;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (!this.rootVisited) {
                l<Div, Boolean> lVar = this.onEnter;
                boolean z10 = false;
                if (lVar != null && !lVar.invoke(getItem().getDiv()).booleanValue()) {
                    z10 = true;
                }
                if (z10) {
                    return null;
                }
                this.rootVisited = true;
                return getItem();
            }
            List<DivItemBuilderResult> items = this.children;
            if (items == null) {
                items = DivTreeWalkKt.getItems(getItem().getDiv(), getItem().getExpressionResolver());
                this.children = items;
            }
            if (this.childIndex < items.size()) {
                int i10 = this.childIndex;
                this.childIndex = i10 + 1;
                return items.get(i10);
            }
            l<Div, r> lVar2 = this.onLeave;
            if (lVar2 == null) {
                return null;
            }
            lVar2.invoke(getItem().getDiv());
            return null;
        }
    }

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public final class DivTreeWalkIterator extends c<DivItemBuilderResult> {

        @NotNull
        private final ExpressionResolver resolver;

        @NotNull
        private final Div root;

        @NotNull
        private final m<Node> stack;

        public DivTreeWalkIterator(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
            this.root = div;
            this.resolver = expressionResolver;
            m<Node> mVar = new m<>();
            mVar.addLast(node(DivCollectionExtensionsKt.toItemBuilderResult(div, expressionResolver)));
            this.stack = mVar;
        }

        private final DivItemBuilderResult nextItem() {
            Node nodeM = this.stack.m();
            if (nodeM == null) {
                return null;
            }
            DivItemBuilderResult divItemBuilderResultStep = nodeM.step();
            if (divItemBuilderResultStep == null) {
                this.stack.removeLast();
                return nextItem();
            }
            if (divItemBuilderResultStep == nodeM.getItem() || DivUtilKt.isLeaf(divItemBuilderResultStep.getDiv()) || this.stack.size() >= DivTreeWalk.this.maxDepth) {
                return divItemBuilderResultStep;
            }
            this.stack.addLast(node(divItemBuilderResultStep));
            return nextItem();
        }

        private final Node node(DivItemBuilderResult divItemBuilderResult) {
            return DivUtilKt.isBranch(divItemBuilderResult.getDiv()) ? new BranchNode(divItemBuilderResult, DivTreeWalk.this.onEnter, DivTreeWalk.this.onLeave) : new LeafNode(divItemBuilderResult);
        }

        @Override // cn.c
        public void computeNext() {
            DivItemBuilderResult divItemBuilderResultNextItem = nextItem();
            if (divItemBuilderResultNextItem != null) {
                setNext(divItemBuilderResultNextItem);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public static final class LeafNode implements Node {

        @NotNull
        private final DivItemBuilderResult item;
        private boolean visited;

        public LeafNode(@NotNull DivItemBuilderResult divItemBuilderResult) {
            this.item = divItemBuilderResult;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (this.visited) {
                return null;
            }
            this.visited = true;
            return getItem();
        }
    }

    /* JADX INFO: compiled from: DivTreeWalk.kt */
    public interface Node {
        @NotNull
        DivItemBuilderResult getItem();

        @Nullable
        DivItemBuilderResult step();
    }

    public DivTreeWalk(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        this(div, expressionResolver, null, null, 0, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DivTreeWalk(Div div, ExpressionResolver expressionResolver, l<? super Div, Boolean> lVar, l<? super Div, r> lVar2, int i10) {
        this.root = div;
        this.resolver = expressionResolver;
        this.onEnter = lVar;
        this.onLeave = lVar2;
        this.maxDepth = i10;
    }

    public /* synthetic */ DivTreeWalk(Div div, ExpressionResolver expressionResolver, l lVar, l lVar2, int i10, int i11, tn.i iVar) {
        this(div, expressionResolver, lVar, lVar2, (i11 & 16) != 0 ? Integer.MAX_VALUE : i10);
    }

    @Override // ao.i
    @NotNull
    public Iterator<DivItemBuilderResult> iterator() {
        return new DivTreeWalkIterator(this.root, this.resolver);
    }

    @NotNull
    public final DivTreeWalk onEnter(@NotNull l<? super Div, Boolean> lVar) {
        return new DivTreeWalk(this.root, this.resolver, lVar, this.onLeave, this.maxDepth);
    }

    @NotNull
    public final DivTreeWalk onLeave(@NotNull l<? super Div, r> lVar) {
        return new DivTreeWalk(this.root, this.resolver, this.onEnter, lVar, this.maxDepth);
    }
}

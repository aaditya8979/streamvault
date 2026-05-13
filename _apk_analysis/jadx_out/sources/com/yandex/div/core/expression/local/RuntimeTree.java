package com.yandex.div.core.expression.local;

import bn.h;
import bn.r;
import bo.a0;
import com.yandex.div.core.expression.ExpressionsRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;

/* JADX INFO: compiled from: RuntimeTree.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class RuntimeTree {

    @NotNull
    private final Map<ExpressionsRuntime, RuntimeNode> runtimesToNodes = new LinkedHashMap();

    @NotNull
    private final Map<String, RuntimeNode> pathToNodes = new LinkedHashMap();

    /* JADX INFO: compiled from: RuntimeTree.kt */
    public static final class RuntimeNode {

        @NotNull
        private final List<RuntimeNode> children;

        @NotNull
        private final String path;

        @NotNull
        private final ExpressionsRuntime runtime;

        public RuntimeNode(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull String str, @NotNull List<RuntimeNode> list) {
            this.runtime = expressionsRuntime;
            this.path = str;
            this.children = list;
        }

        public /* synthetic */ RuntimeNode(ExpressionsRuntime expressionsRuntime, String str, List list, int i10, i iVar) {
            this(expressionsRuntime, str, (i10 & 4) != 0 ? new ArrayList() : list);
        }

        @NotNull
        public final List<RuntimeNode> getChildren() {
            return this.children;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final ExpressionsRuntime getRuntime() {
            return this.runtime;
        }
    }

    private final void invokeRecursively(RuntimeNode runtimeNode, l<? super RuntimeNode, r> lVar) {
        lVar.invoke(runtimeNode);
        Iterator<T> it = runtimeNode.getChildren().iterator();
        while (it.hasNext()) {
            invokeRecursively((RuntimeNode) it.next(), lVar);
        }
    }

    @NotNull
    public final Map<String, ExpressionsRuntime> getPathToRuntimes() {
        Map<String, RuntimeNode> map = this.pathToNodes;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, RuntimeNode> entry : map.entrySet()) {
            arrayList.add(h.a(entry.getKey(), entry.getValue().getRuntime()));
        }
        return a.x(arrayList);
    }

    public final void invokeRecursively(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull String str, @NotNull l<? super RuntimeNode, r> lVar) {
        RuntimeNode runtimeNode = this.runtimesToNodes.get(expressionsRuntime);
        if (runtimeNode == null) {
            return;
        }
        if (a0.W(runtimeNode.getPath(), str, false, 2, null)) {
            invokeRecursively(runtimeNode, lVar);
            return;
        }
        for (RuntimeNode runtimeNode2 : runtimeNode.getChildren()) {
            if (a0.W(runtimeNode2.getPath(), str, false, 2, null)) {
                invokeRecursively(runtimeNode2, lVar);
            }
        }
    }

    public final void storeRuntime(@NotNull ExpressionsRuntime expressionsRuntime, @Nullable ExpressionsRuntime expressionsRuntime2, @NotNull String str) {
        RuntimeNode runtimeNode;
        List<RuntimeNode> children;
        RuntimeNode runtimeNode2 = new RuntimeNode(expressionsRuntime, str, null, 4, null);
        this.pathToNodes.put(str, runtimeNode2);
        this.runtimesToNodes.put(expressionsRuntime, runtimeNode2);
        if (expressionsRuntime2 == null || (runtimeNode = this.runtimesToNodes.get(expressionsRuntime2)) == null || (children = runtimeNode.getChildren()) == null) {
            return;
        }
        children.add(runtimeNode2);
    }
}

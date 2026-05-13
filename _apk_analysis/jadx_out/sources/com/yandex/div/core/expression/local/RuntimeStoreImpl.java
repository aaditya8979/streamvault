package com.yandex.div.core.expression.local;

import ah.e2;
import bn.r;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeTree;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFunction;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.p;
import tn.x;

/* JADX INFO: compiled from: RuntimeStoreImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RuntimeStoreImpl implements RuntimeStore {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final ExpressionsRuntime rootRuntime;

    @NotNull
    private final ExpressionsRuntimeProvider runtimeProvider;
    private boolean warningShown;

    @NotNull
    private final Map<ExpressionResolver, ExpressionsRuntime> resolverToRuntime = new LinkedHashMap();

    @NotNull
    private final Map<String, ExpressionsRuntime> pathToRuntime = new LinkedHashMap();

    @NotNull
    private final ObserverList<ExpressionsRuntime> allRuntimes = new ObserverList<>();

    @NotNull
    private final RuntimeTree tree = new RuntimeTree();

    @NotNull
    private final Map<String, ExpressionResolver> itemBuilderResolvers = new LinkedHashMap();

    public RuntimeStoreImpl(@NotNull DivData divData, @NotNull ExpressionsRuntimeProvider expressionsRuntimeProvider, @NotNull ErrorCollector errorCollector) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollector = errorCollector;
        ExpressionsRuntime expressionsRuntimeCreateRootRuntime = expressionsRuntimeProvider.createRootRuntime(divData, errorCollector, this);
        putRuntime$div_release(expressionsRuntimeCreateRootRuntime, "", null);
        this.rootRuntime = expressionsRuntimeCreateRootRuntime;
    }

    private final boolean getNeedLocalRuntime(Div div) {
        e2 e2VarB = div.b();
        List<DivVariable> listC = e2VarB.c();
        boolean z10 = false;
        if (listC == null || listC.isEmpty()) {
            List<DivTrigger> listS = e2VarB.s();
            if (listS == null || listS.isEmpty()) {
                List<DivFunction> listU = e2VarB.u();
                if (listU == null || listU.isEmpty()) {
                    z10 = true;
                }
            }
        }
        return !z10;
    }

    private final void reportParentRuntimeError(String str) {
        x xVar = x.f85368a;
        String str2 = String.format("Parent runtime for path '%s' is not stored.", Arrays.copyOf(new Object[]{str}, 1));
        p.j(str2, "format(...)");
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail(str2);
        }
        this.errorCollector.logError(new AssertionError(str2));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void cleanupRuntimes(@NotNull DivViewFacade divViewFacade) {
        this.warningShown = false;
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().cleanup$div_release(divViewFacade);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void clearBindings(@NotNull DivViewFacade divViewFacade) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().clearBinding(divViewFacade);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionsRuntime getOrCreateRuntime(@NotNull DivStatePath divStatePath, @NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        String fullPath$div_release = divStatePath.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime != null) {
            return expressionsRuntime;
        }
        if (!(expressionResolver instanceof ExpressionResolverImpl)) {
            return getRootRuntime();
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return getRootRuntime();
        }
        if (!getNeedLocalRuntime(div)) {
            this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
            return runtimeWithOrNull;
        }
        ExpressionsRuntime expressionsRuntimeCreateChildRuntime = this.runtimeProvider.createChildRuntime(divStatePath, div.b(), (ExpressionResolverImpl) expressionResolver, this.errorCollector);
        putRuntime$div_release(expressionsRuntimeCreateChildRuntime, fullPath$div_release, runtimeWithOrNull);
        return expressionsRuntimeCreateChildRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionResolver getOrPutItemBuilderResolver(@NotNull String str, @NotNull ExpressionResolver expressionResolver, @NotNull a<? extends ExpressionResolver> aVar) {
        Map<String, ExpressionResolver> map = this.itemBuilderResolvers;
        ExpressionResolver expressionResolverInvoke = map.get(str);
        if (expressionResolverInvoke == null) {
            expressionResolverInvoke = aVar.invoke();
            ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(expressionResolver);
            if (runtimeWithOrNull != null) {
                this.resolverToRuntime.put(expressionResolverInvoke, runtimeWithOrNull);
            }
            map.put(str, expressionResolverInvoke);
        }
        return expressionResolverInvoke;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionsRuntime getRootRuntime() {
        return this.rootRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @Nullable
    public ExpressionsRuntime getRuntimeWithOrNull(@NotNull ExpressionResolver expressionResolver) {
        return this.resolverToRuntime.get(expressionResolver);
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
        return this.tree.getPathToRuntimes();
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void onDetachedFromWindow(@NotNull DivViewFacade divViewFacade) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromWindow(divViewFacade);
        }
    }

    public final void putRuntime$div_release(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull String str, @Nullable ExpressionsRuntime expressionsRuntime2) {
        this.pathToRuntime.put(str, expressionsRuntime);
        this.resolverToRuntime.put(expressionsRuntime.getExpressionResolver(), expressionsRuntime);
        this.allRuntimes.addObserver(expressionsRuntime);
        this.tree.storeRuntime(expressionsRuntime, expressionsRuntime2, str);
        expressionsRuntime.updateSubscriptions();
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @Nullable
    public ExpressionsRuntime resolveRuntimeWith(@Nullable DivViewFacade divViewFacade, @NotNull DivStatePath divStatePath, @NotNull Div div, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        ExpressionsRuntime expressionsRuntime;
        String fullPath$div_release = divStatePath.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime2 = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime2 != null) {
            return expressionsRuntime2;
        }
        if (!(expressionResolver instanceof ExpressionResolverImpl)) {
            return null;
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(expressionResolver2);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return null;
        }
        if (getNeedLocalRuntime(div)) {
            expressionsRuntime = this.runtimeProvider.createChildRuntime(divStatePath, div.b(), (ExpressionResolverImpl) expressionResolver, this.errorCollector);
            putRuntime$div_release(expressionsRuntime, fullPath$div_release, runtimeWithOrNull);
        } else {
            if (p.f(expressionResolver, expressionResolver2)) {
                this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
                return runtimeWithOrNull;
            }
            expressionsRuntime = new ExpressionsRuntime((ExpressionResolverImpl) expressionResolver, null);
            putRuntime$div_release(expressionsRuntime, fullPath$div_release, runtimeWithOrNull);
        }
        return expressionsRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void showWarningIfNeeded(@NotNull e2 e2Var) {
        if (this.warningShown || e2Var.c() == null) {
            return;
        }
        this.warningShown = true;
        this.errorCollector.logWarning(new Throwable("You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute."));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void traverseFrom(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull DivStatePath divStatePath, @NotNull final l<? super ExpressionsRuntime, r> lVar) {
        this.tree.invokeRecursively(expressionsRuntime, divStatePath.getFullPath$div_release(), new l<RuntimeTree.RuntimeNode, r>() { // from class: com.yandex.div.core.expression.local.RuntimeStoreImpl.traverseFrom.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(RuntimeTree.RuntimeNode runtimeNode) {
                invoke2(runtimeNode);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull RuntimeTree.RuntimeNode runtimeNode) {
                lVar.invoke(runtimeNode.getRuntime());
            }
        });
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void updateSubscriptions() {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().updateSubscriptions();
        }
    }
}

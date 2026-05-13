package com.yandex.div.core.actions;

import bn.r;
import cn.f0;
import cn.x;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.expression.RuntimeStoreProviderKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivData;
import com.yandex.div2.DivVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: DivActionTypedSubmitHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionTypedSubmitHandler implements DivActionTypedHandler {

    @NotNull
    private final DivRequestExecutor requestExecutor;

    /* JADX INFO: compiled from: DivActionTypedSubmitHandler.kt */
    public static final class ContainerFinder extends DivTreeVisitor<r> {

        @NotNull
        private final List<DivItemBuilderResult> containers;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f53947id;

        public ContainerFinder(@NotNull String str) {
            super(null, 1, null);
            this.f53947id = str;
            this.containers = new ArrayList();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ r defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(div, bindingContext, divStatePath);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
            if (p.f(div.b().getId(), this.f53947id)) {
                this.containers.add(DivCollectionExtensionsKt.toItemBuilderResult(div, bindingContext.getExpressionResolver()));
            }
        }

        @Nullable
        public final DivItemBuilderResult findContainer(@NotNull Div2View div2View) {
            DivData divData = div2View.getDivData();
            if (divData == null) {
                return null;
            }
            for (DivData.State state : divData.f55082c) {
                visit(state.f55091a, div2View.getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(state));
            }
            if (this.containers.isEmpty()) {
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Error resolving container. Elements that respond to id '" + this.f53947id + "' are not found."));
                return null;
            }
            if (this.containers.size() <= 1) {
                return (DivItemBuilderResult) f0.t0(this.containers);
            }
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Error resolving container. Found multiple elements that respond to id '" + this.f53947id + "'."));
            return null;
        }
    }

    public DivActionTypedSubmitHandler(@NotNull DivRequestExecutor divRequestExecutor) {
        this.requestExecutor = divRequestExecutor;
    }

    private final String createBody(DivItemBuilderResult divItemBuilderResult, Div2View div2View) {
        VariableController variableController;
        List<DivVariable> listC = divItemBuilderResult.getDiv().b().c();
        if ((listC == null || listC.isEmpty()) || (variableController = UtilsKt.getVariableController(divItemBuilderResult.getExpressionResolver())) == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            String name = RuntimeStoreProviderKt.getName((DivVariable) it.next());
            Object obj = variableController.get(name);
            if (obj == null || jSONObject.put(name, obj) == null) {
                DivActionTypedUtilsKt.logError(div2View, new MissingVariableException(name, null, 2, null));
                r rVar = r.f5635a;
            }
        }
        return jSONObject.toString();
    }

    private final DivRequestExecutor.Callback createCallback(final List<DivAction> list, final List<DivAction> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        if (list == null || list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
        }
        return new DivRequestExecutor.Callback() { // from class: com.yandex.div.core.actions.DivActionTypedSubmitHandler.createCallback.1
        };
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        DivActionSubmit divActionSubmitC;
        DivItemBuilderResult divItemBuilderResultFindContainer;
        ArrayList arrayList = null;
        DivActionTyped.s sVar = divActionTyped instanceof DivActionTyped.s ? (DivActionTyped.s) divActionTyped : null;
        if (sVar == null || (divActionSubmitC = sVar.c()) == null || (divItemBuilderResultFindContainer = new ContainerFinder(divActionSubmitC.f54425a.evaluate(expressionResolver)).findContainer(div2View)) == null) {
            return false;
        }
        List<DivActionSubmit.Request.Header> list = divActionSubmitC.f54428d.f54433a;
        if (list != null) {
            arrayList = new ArrayList(x.x(list, 10));
            for (DivActionSubmit.Request.Header header : list) {
                arrayList.add(new DivRequestExecutor.Header(header.f54439a.evaluate(expressionResolver), header.f54440b.evaluate(expressionResolver)));
            }
        }
        div2View.addLoadReference(this.requestExecutor.execute(new DivRequestExecutor.Request(divActionSubmitC.f54428d.f54435c.evaluate(expressionResolver), divActionSubmitC.f54428d.f54434b.evaluate(expressionResolver).toString(), arrayList, createBody(divItemBuilderResultFindContainer, div2View)), createCallback(divActionSubmitC.f54427c, divActionSubmitC.f54426b, div2View, expressionResolver)), div2View);
        return true;
    }
}

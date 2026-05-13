package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;

/* JADX INFO: loaded from: classes11.dex */
public final class ny2 extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu f93053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oh0 f93054b;

    public ny2(qu quVar) {
        this.f93053a = quVar;
    }

    public final void a(oh0 oh0Var) {
        oh0 oh0Var2 = this.f93054b;
        if (oh0Var2 != null) {
            oh0Var2.f93221c.f97577b = null;
        }
        if (oh0Var != null) {
            oh0Var.f93221c.f97577b = this.f93053a;
        }
        this.f93054b = oh0Var;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(ah.c9 c9Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        oh0 oh0Var;
        return super.handleAction(c9Var, divViewFacade, expressionResolver) || ((oh0Var = this.f93054b) != null && oh0Var.handleAction(c9Var, divViewFacade, expressionResolver));
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        oh0 oh0Var;
        return super.handleAction(divAction, divViewFacade, expressionResolver) || ((oh0Var = this.f93054b) != null && oh0Var.handleAction(divAction, divViewFacade, expressionResolver));
    }
}

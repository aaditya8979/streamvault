package yads;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;

/* JADX INFO: loaded from: classes12.dex */
public final class nw extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw f93016a;

    public nw(mw mwVar) {
        this.f93016a = mwVar;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression<Uri> expression = divAction.f54185k;
        boolean z10 = false;
        if (expression != null) {
            String string = expression.evaluate(expressionResolver).toString();
            if (tn.p.f(string, "close_ad")) {
                mw mwVar = this.f93016a;
                ng0.a(mwVar.f92586a);
                mwVar.f92587b.e();
            } else if (tn.p.f(string, "close_dialog")) {
                ng0.a(this.f93016a.f92586a);
            }
            z10 = true;
        }
        return z10 ? z10 : super.handleAction(divAction, divViewFacade, expressionResolver);
    }
}

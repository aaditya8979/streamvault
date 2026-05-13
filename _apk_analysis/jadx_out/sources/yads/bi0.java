package yads;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: loaded from: classes10.dex */
public final class bi0 implements DivExtensionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh0 f88015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final di0 f88016b;

    public /* synthetic */ bi0(zh0 zh0Var) {
        this(zh0Var, new di0());
    }

    public bi0(zh0 zh0Var, di0 di0Var) {
        this.f88015a = zh0Var;
        this.f88016b = di0Var;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ah.e2 e2Var) {
        Context context = view.getContext();
        ci0 ci0VarA = this.f88016b.a(e2Var);
        if (ci0VarA != null) {
            ou ouVar = new ou(context, new ai0(this.f88015a, ci0VarA));
            view.setOnTouchListener(ouVar);
            view.setOnClickListener(ouVar);
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(ah.e2 e2Var) {
        return this.f88016b.a(e2Var) != null;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ah.e2 e2Var) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }
}

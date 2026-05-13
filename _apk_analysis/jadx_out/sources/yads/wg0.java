package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wg0 {
    public static final ny2 a(Div2View div2View) {
        DivActionHandler actionHandler = div2View.getActionHandler();
        ny2 ny2Var = actionHandler instanceof ny2 ? (ny2) actionHandler : null;
        if (ny2Var != null) {
            return ny2Var;
        }
        ny2 ny2Var2 = new ny2(new qu());
        div2View.setActionHandler(ny2Var2);
        return ny2Var2;
    }
}

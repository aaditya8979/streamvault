package yads;

import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;

/* JADX INFO: loaded from: classes3.dex */
public final class zg0 implements DivCustomContainerViewAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivCustomContainerViewAdapter[] f97566a;

    public zg0(DivCustomContainerViewAdapter... divCustomContainerViewAdapterArr) {
        this.f97566a = divCustomContainerViewAdapterArr;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        DivCustomContainerViewAdapter divCustomContainerViewAdapter;
        View viewCreateView;
        DivCustomContainerViewAdapter[] divCustomContainerViewAdapterArr = this.f97566a;
        int length = divCustomContainerViewAdapterArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                divCustomContainerViewAdapter = null;
                break;
            }
            divCustomContainerViewAdapter = divCustomContainerViewAdapterArr[i10];
            if (divCustomContainerViewAdapter.isCustomTypeSupported(divCustom.f55019j)) {
                break;
            }
            i10++;
        }
        return (divCustomContainerViewAdapter == null || (viewCreateView = divCustomContainerViewAdapter.createView(divCustom, div2View, expressionResolver, divStatePath)) == null) ? new View(div2View.getContext()) : viewCreateView;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        for (DivCustomContainerViewAdapter divCustomContainerViewAdapter : this.f97566a) {
            if (divCustomContainerViewAdapter.isCustomTypeSupported(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }
}

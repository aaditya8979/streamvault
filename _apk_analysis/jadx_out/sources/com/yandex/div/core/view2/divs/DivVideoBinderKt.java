package com.yandex.div.core.view2.divs;

import android.net.Uri;
import cn.x;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVideo;
import com.yandex.div2.DivVideoSource;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivVideoBinder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivVideoBinderKt {
    @NotNull
    public static final List<DivVideoSource> createSource(@NotNull DivVideo divVideo, @NotNull ExpressionResolver expressionResolver) {
        List<com.yandex.div2.DivVideoSource> list = divVideo.Q;
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        for (com.yandex.div2.DivVideoSource divVideoSource : list) {
            Uri uriEvaluate = divVideoSource.f58183d.evaluate(expressionResolver);
            String strEvaluate = divVideoSource.f58181b.evaluate(expressionResolver);
            DivVideoSource.Resolution resolution = divVideoSource.f58182c;
            Long lEvaluate = null;
            DivVideoResolution divVideoResolution = resolution != null ? new DivVideoResolution((int) resolution.f58188b.evaluate(expressionResolver).longValue(), (int) resolution.f58187a.evaluate(expressionResolver).longValue()) : null;
            Expression<Long> expression = divVideoSource.f58180a;
            if (expression != null) {
                lEvaluate = expression.evaluate(expressionResolver);
            }
            arrayList.add(new com.yandex.div.core.player.DivVideoSource(uriEvaluate, strEvaluate, divVideoResolution, lEvaluate));
        }
        return arrayList;
    }
}

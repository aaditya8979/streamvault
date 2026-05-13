package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivExtension;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ni0 implements DivExtensionHandler {
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ah.e2 e2Var) {
        Object next;
        JSONObject jSONObject;
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setHyphenationFrequency(2);
            List<DivExtension> extensions = e2Var.getExtensions();
            Locale locale = null;
            if (extensions != null) {
                Iterator<T> it = extensions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (tn.p.f(((DivExtension) next).f55240a, "hyphenation")) {
                            break;
                        }
                    }
                }
                DivExtension divExtension = (DivExtension) next;
                if (divExtension != null && (jSONObject = divExtension.f55241b) != null && (string = jSONObject.getString(CommonUrlParts.LOCALE)) != null) {
                    locale = new Locale(string);
                }
            }
            if (locale != null) {
                textView.setTextLocale(locale);
            }
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(ah.e2 e2Var) {
        List<DivExtension> extensions = e2Var.getExtensions();
        if (extensions != null && !extensions.isEmpty()) {
            Iterator<T> it = extensions.iterator();
            while (it.hasNext()) {
                if (tn.p.f(((DivExtension) it.next()).f55240a, "hyphenation")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ah.e2 e2Var) {
    }
}

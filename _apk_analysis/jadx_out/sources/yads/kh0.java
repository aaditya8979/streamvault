package yads;

import com.yandex.div2.DivExtension;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kh0 {
    public static DivExtension a(ah.e2 e2Var, String str) {
        List<DivExtension> extensions = e2Var.getExtensions();
        if (extensions == null) {
            return null;
        }
        for (DivExtension divExtension : extensions) {
            if (tn.p.f(str, divExtension.f55240a)) {
                return divExtension;
            }
        }
        return null;
    }
}

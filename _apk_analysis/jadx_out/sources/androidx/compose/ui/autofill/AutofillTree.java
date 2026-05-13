package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import bn.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AutofillTree.kt */
/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "Lbn/r;", "plusAssign", "", "id", "", "value", "performAutofill", "(ILjava/lang/String;)Lbn/r;", "", "children", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class AutofillTree {
    public static final int $stable = 8;

    @NotNull
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    @NotNull
    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    @Nullable
    public final r performAutofill(int id2, @NotNull String value) {
        l<String, r> onFill;
        p.k(value, "value");
        AutofillNode autofillNode = this.children.get(Integer.valueOf(id2));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(value);
        return r.f5635a;
    }

    public final void plusAssign(@NotNull AutofillNode autofillNode) {
        p.k(autofillNode, "autofillNode");
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}

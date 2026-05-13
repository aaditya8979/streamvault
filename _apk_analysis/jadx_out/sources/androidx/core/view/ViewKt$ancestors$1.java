package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements sn.l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // sn.l
    public final ViewParent invoke(@NotNull ViewParent viewParent) {
        return viewParent.getParent();
    }
}

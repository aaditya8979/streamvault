package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007J@\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi23Helper;", "", "Landroid/view/ViewStructure;", "structure", "", "index", "newChild", "num", "addChildCount", "id", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "typeName", "entryName", "Lbn/r;", "setId", "left", "top", "scrollX", "scrollY", "width", "height", "setDimens", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class AutofillApi23Helper {

    @NotNull
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final int addChildCount(@NotNull ViewStructure structure, int num) {
        p.k(structure, "structure");
        return structure.addChildCount(num);
    }

    @DoNotInline
    @RequiresApi(23)
    @Nullable
    public final ViewStructure newChild(@NotNull ViewStructure structure, int index) {
        p.k(structure, "structure");
        return structure.newChild(index);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setDimens(@NotNull ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        p.k(viewStructure, "structure");
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setId(@NotNull ViewStructure viewStructure, int i10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        p.k(viewStructure, "structure");
        viewStructure.setId(i10, str, str2, str3);
    }
}

package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.q;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&JH\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "Landroidx/compose/ui/Modifier;", "", "matchTextFieldWidth", "exposedDropdownSize", "expanded", "Lkotlin/Function0;", "Lbn/r;", "onDismissRequest", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenu", "(ZLsn/a;Landroidx/compose/ui/Modifier;Lsn/q;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 6, 0})
@ExperimentalMaterialApi
public interface ExposedDropdownMenuBoxScope {

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
        @androidx.compose.runtime.Composable
        @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void ExposedDropdownMenu(@org.jetbrains.annotations.NotNull final androidx.compose.material.ExposedDropdownMenuBoxScope r23, final boolean r24, @org.jetbrains.annotations.NotNull final sn.a<bn.r> r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.NotNull final sn.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, final int r29, final int r30) {
            /*
                Method dump skipped, instruction units count: 425
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.DefaultImpls.ExposedDropdownMenu(androidx.compose.material.ExposedDropdownMenuBoxScope, boolean, sn.a, androidx.compose.ui.Modifier, sn.q, androidx.compose.runtime.Composer, int, int):void");
        }

        public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z10);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    void ExposedDropdownMenu(boolean z10, @NotNull a<r> aVar, @Nullable Modifier modifier, @NotNull q<? super ColumnScope, ? super Composer, ? super Integer, r> qVar, @Nullable Composer composer, int i10, int i11);

    @NotNull
    Modifier exposedDropdownSize(@NotNull Modifier modifier, boolean z10);
}

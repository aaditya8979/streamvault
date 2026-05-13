package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"getString", "", TypedValues.Custom.S_STRING, "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class Strings_androidKt {
    @Composable
    @NotNull
    /* JADX INFO: renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m1161getString4foXLRw(int i10, @Nullable Composer composer, int i11) {
        String string;
        composer.startReplaceableGroup(-726638443);
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        if (Strings.m1150equalsimpl0(i10, companion.m1158getNavigationMenuUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            p.j(string, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m1150equalsimpl0(i10, companion.m1154getCloseDrawerUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.close_drawer);
            p.j(string, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m1150equalsimpl0(i10, companion.m1155getCloseSheetUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.close_sheet);
            p.j(string, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m1150equalsimpl0(i10, companion.m1156getDefaultErrorMessageUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.default_error_message);
            p.j(string, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m1150equalsimpl0(i10, companion.m1157getExposedDropdownMenuUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            p.j(string, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m1150equalsimpl0(i10, companion.m1160getSliderRangeStartUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.range_start);
            p.j(string, "resources.getString(R.string.range_start)");
        } else if (Strings.m1150equalsimpl0(i10, companion.m1159getSliderRangeEndUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.range_end);
            p.j(string, "resources.getString(R.string.range_end)");
        } else {
            string = "";
        }
        composer.endReplaceableGroup();
        return string;
    }
}

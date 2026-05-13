package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: StringResources.android.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a+\u0010\u000f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"pluralStringResource", "", "id", "", "count", "(IILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "resources", "Landroid/content/res/Resources;", "(Landroidx/compose/runtime/Composer;I)Landroid/content/res/Resources;", "stringArrayResource", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StringResources_androidKt {
    @NotNull
    @Composable
    @ReadOnlyComposable
    @ExperimentalComposeUiApi
    public static final String pluralStringResource(@PluralsRes int i10, int i11, @Nullable Composer composer, int i12) {
        String quantityString = resources(composer, 0).getQuantityString(i10, i11);
        p.j(quantityString, "resources.getQuantityString(id, count)");
        return quantityString;
    }

    @NotNull
    @Composable
    @ReadOnlyComposable
    @ExperimentalComposeUiApi
    public static final String pluralStringResource(@PluralsRes int i10, int i11, @NotNull Object[] objArr, @Nullable Composer composer, int i12) {
        p.k(objArr, "formatArgs");
        String quantityString = resources(composer, 0).getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
        p.j(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
        return quantityString;
    }

    @Composable
    @ReadOnlyComposable
    private static final Resources resources(Composer composer, int i10) {
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        p.j(resources, "LocalContext.current.resources");
        return resources;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String[] stringArrayResource(@ArrayRes int i10, @Nullable Composer composer, int i11) {
        String[] stringArray = resources(composer, 0).getStringArray(i10);
        p.j(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String stringResource(@StringRes int i10, @Nullable Composer composer, int i11) {
        String string = resources(composer, 0).getString(i10);
        p.j(string, "resources.getString(id)");
        return string;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String stringResource(@StringRes int i10, @NotNull Object[] objArr, @Nullable Composer composer, int i11) {
        p.k(objArr, "formatArgs");
        String string = resources(composer, 0).getString(i10, Arrays.copyOf(objArr, objArr.length));
        p.j(string, "resources.getString(id, *formatArgs)");
        return string;
    }
}

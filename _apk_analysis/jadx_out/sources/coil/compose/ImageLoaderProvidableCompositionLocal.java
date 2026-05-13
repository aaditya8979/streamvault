package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.ImageLoader;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;

/* JADX INFO: compiled from: LocalImageLoader.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u001e\b\u0000\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\u0088\u0001\t\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcoil/compose/ImageLoaderProvidableCompositionLocal;", "", "Lcoil/ImageLoader;", "c", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Landroidx/compose/runtime/Composer;I)Lcoil/ImageLoader;", "getCurrent$annotations", "()V", VideoLookHistoryEntry.CURRNET, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "delegate", "a", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "coil-compose-singleton_release"}, k = 1, mv = {1, 7, 1})
public final class ImageLoaderProvidableCompositionLocal {
    @NotNull
    public static ProvidableCompositionLocal<ImageLoader> a(@NotNull ProvidableCompositionLocal<ImageLoader> providableCompositionLocal) {
        return providableCompositionLocal;
    }

    public static /* synthetic */ ProvidableCompositionLocal b(ProvidableCompositionLocal providableCompositionLocal, int i10, i iVar) {
        if ((i10 & 1) != 0) {
            providableCompositionLocal = CompositionLocalKt.staticCompositionLocalOf(new a<ImageLoader>() { // from class: coil.compose.ImageLoaderProvidableCompositionLocal.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @Nullable
                public final ImageLoader invoke() {
                    return null;
                }
            });
        }
        return a(providableCompositionLocal);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final ImageLoader c(ProvidableCompositionLocal<ImageLoader> providableCompositionLocal, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-617597678, i10, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        ImageLoader imageLoaderA = (ImageLoader) composer.consume(providableCompositionLocal);
        if (imageLoaderA == null) {
            imageLoaderA = y.a.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageLoaderA;
    }
}

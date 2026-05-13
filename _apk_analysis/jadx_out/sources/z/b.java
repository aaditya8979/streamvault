package z;

import androidx.compose.runtime.ProvidableCompositionLocal;
import coil.ImageLoader;
import coil.compose.ImageLoaderProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalImageLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"#\u0010\u0006\u001a\u00020\u00008\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0001\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcoil/compose/ImageLoaderProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalImageLoader$annotations", "()V", "LocalImageLoader", "coil-compose-singleton_release"}, k = 2, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ImageLoader> f98123a = ImageLoaderProvidableCompositionLocal.b(null, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<ImageLoader> a() {
        return f98123a;
    }
}

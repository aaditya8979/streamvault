package y;

import android.content.Context;
import coil.ImageLoader;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Coil.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Ly/a;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcoil/ImageLoader;", "a", "b", "Lcoil/ImageLoader;", "imageLoader", "Ly/e;", "c", "Ly/e;", "imageLoaderFactory", "<init>", "()V", "coil-singleton_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f87192a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static ImageLoader imageLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static e imageLoaderFactory;

    @NotNull
    public static final ImageLoader a(@NotNull Context context) {
        ImageLoader imageLoader2 = imageLoader;
        return imageLoader2 == null ? f87192a.b(context) : imageLoader2;
    }

    public final synchronized ImageLoader b(Context context) {
        ImageLoader imageLoaderA;
        ImageLoader imageLoader2 = imageLoader;
        if (imageLoader2 != null) {
            return imageLoader2;
        }
        e eVar = imageLoaderFactory;
        if (eVar == null || (imageLoaderA = eVar.a()) == null) {
            Object applicationContext = context.getApplicationContext();
            e eVar2 = applicationContext instanceof e ? (e) applicationContext : null;
            imageLoaderA = eVar2 != null ? eVar2.a() : f.a(context);
        }
        imageLoaderFactory = null;
        imageLoader = imageLoaderA;
        return imageLoaderA;
    }
}

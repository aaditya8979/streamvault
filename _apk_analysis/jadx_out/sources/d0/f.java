package d0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ImageLoader;
import coil.decode.DataSource;
import d0.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DrawableFetcher.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Ld0/f;", "Ld0/i;", "Ld0/h;", "a", "(Lhn/c;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "data", "Lj0/j;", "b", "Lj0/j;", "options", "<init>", "(Landroid/graphics/drawable/Drawable;Lj0/j;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Drawable data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0.j options;

    /* JADX INFO: compiled from: DrawableFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Ld0/f$a;", "Ld0/i$a;", "Landroid/graphics/drawable/Drawable;", "data", "Lj0/j;", "options", "Lcoil/ImageLoader;", "imageLoader", "Ld0/i;", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements i.a<Drawable> {
        @Override // d0.i.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull Drawable data, @NotNull j0.j options, @NotNull ImageLoader imageLoader) {
            return new f(data, options);
        }
    }

    public f(@NotNull Drawable drawable, @NotNull j0.j jVar) {
        this.data = drawable;
        this.options = jVar;
    }

    @Override // d0.i
    @Nullable
    public Object a(@NotNull hn.c<? super h> cVar) {
        Drawable bitmapDrawable;
        boolean zV = o0.i.v(this.data);
        if (zV) {
            bitmapDrawable = new BitmapDrawable(this.options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String().getResources(), o0.k.f75977a.a(this.data, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
        } else {
            bitmapDrawable = this.data;
        }
        return new g(bitmapDrawable, zV, DataSource.MEMORY);
    }
}

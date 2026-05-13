package d0;

import a0.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import bo.d0;
import bo.z;
import cn.f0;
import coil.ImageLoader;
import coil.decode.DataSource;
import d0.i;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ResourceUriFetcher.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0003\bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Ld0/k;", "Ld0/i;", "Ld0/h;", "a", "(Lhn/c;)Ljava/lang/Object;", "Landroid/net/Uri;", "data", "", "b", "Landroid/net/Uri;", "Lj0/j;", "Lj0/j;", "options", "<init>", "(Landroid/net/Uri;Lj0/j;)V", "c", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Uri data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0.j options;

    /* JADX INFO: compiled from: ResourceUriFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Ld0/k$b;", "Ld0/i$a;", "Landroid/net/Uri;", "data", "Lj0/j;", "options", "Lcoil/ImageLoader;", "imageLoader", "Ld0/i;", "b", "", "c", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements i.a<Uri> {
        @Override // d0.i.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull Uri data, @NotNull j0.j options, @NotNull ImageLoader imageLoader) {
            if (c(data)) {
                return new k(data, options);
            }
            return null;
        }

        public final boolean c(Uri data) {
            return p.f(data.getScheme(), "android.resource");
        }
    }

    public k(@NotNull Uri uri, @NotNull j0.j jVar) {
        this.data = uri;
        this.options = jVar;
    }

    @Override // d0.i
    @Nullable
    public Object a(@NotNull hn.c<? super h> cVar) {
        Integer numR;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (!(!d0.u0(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) f0.G0(this.data.getPathSegments());
                if (str == null || (numR = z.r(str)) == null) {
                    b(this.data);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = numR.intValue();
                Context context = this.options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String();
                Resources resources = p.f(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strK = o0.i.k(MimeTypeMap.getSingleton(), charSequence.subSequence(d0.x0(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!p.f(strK, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new l(a0.l.b(Okio.buffer(Okio.source(resources.openRawResource(iIntValue, typedValue2))), context, new m(authority, iIntValue, typedValue2.density)), strK, DataSource.DISK);
                }
                Drawable drawableA = p.f(authority, context.getPackageName()) ? o0.d.a(context, iIntValue) : o0.d.d(context, resources, iIntValue);
                boolean zV = o0.i.v(drawableA);
                if (zV) {
                    drawableA = new BitmapDrawable(context.getResources(), o0.k.f75977a.a(drawableA, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
                }
                return new g(drawableA, zV, DataSource.DISK);
            }
        }
        b(this.data);
        throw new KotlinNothingValueException();
    }

    public final Void b(Uri data) {
        throw new IllegalStateException("Invalid android.resource URI: " + data);
    }
}

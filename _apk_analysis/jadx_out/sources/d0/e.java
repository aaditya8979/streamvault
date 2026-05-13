package d0;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import coil.ImageLoader;
import coil.decode.DataSource;
import com.ironsource.C3978d4;
import d0.i;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import k0.c;
import kotlin.Metadata;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ContentUriFetcher.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\tJ\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Ld0/e;", "Ld0/i;", "Ld0/h;", "a", "(Lhn/c;)Ljava/lang/Object;", "Landroid/net/Uri;", "data", "", "b", "(Landroid/net/Uri;)Z", "c", "Landroid/os/Bundle;", "d", "Landroid/net/Uri;", "Lj0/j;", "Lj0/j;", "options", "<init>", "(Landroid/net/Uri;Lj0/j;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Uri data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0.j options;

    /* JADX INFO: compiled from: ContentUriFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Ld0/e$a;", "Ld0/i$a;", "Landroid/net/Uri;", "data", "Lj0/j;", "options", "Lcoil/ImageLoader;", "imageLoader", "Ld0/i;", "b", "", "c", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements i.a<Uri> {
        @Override // d0.i.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull Uri data, @NotNull j0.j options, @NotNull ImageLoader imageLoader) {
            if (c(data)) {
                return new e(data, options);
            }
            return null;
        }

        public final boolean c(Uri data) {
            return p.f(data.getScheme(), "content");
        }
    }

    public e(@NotNull Uri uri, @NotNull j0.j jVar) {
        this.data = uri;
        this.options = jVar;
    }

    @Override // d0.i
    @Nullable
    public Object a(@NotNull hn.c<? super h> cVar) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String().getContentResolver();
        if (b(this.data)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.data, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.data + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.data)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.data);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.data + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.data, "image/*", d(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.data + "'.").toString());
            }
        }
        return new l(a0.l.b(Okio.buffer(Okio.source(inputStreamOpenInputStream)), this.options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String(), new a0.b(this.data)), contentResolver.getType(this.data), DataSource.DISK);
    }

    @VisibleForTesting
    public final boolean b(@NotNull Uri data) {
        return p.f(data.getAuthority(), "com.android.contacts") && p.f(data.getLastPathSegment(), "display_photo");
    }

    @VisibleForTesting
    public final boolean c(@NotNull Uri data) {
        List<String> pathSegments;
        int size;
        return p.f(data.getAuthority(), C3978d4.i.I0) && (size = (pathSegments = data.getPathSegments()).size()) >= 3 && p.f(pathSegments.get(size + (-3)), "audio") && p.f(pathSegments.get(size + (-2)), "albums");
    }

    public final Bundle d() {
        k0.c width = this.options.getSize().getWidth();
        c.a aVar = width instanceof c.a ? (c.a) width : null;
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.px;
        k0.c height = this.options.getSize().getHeight();
        c.a aVar2 = height instanceof c.a ? (c.a) height : null;
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.px;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }
}

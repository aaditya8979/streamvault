package d0;

import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import d0.i;
import java.io.File;
import kotlin.Metadata;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileFetcher.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Ld0/j;", "Ld0/i;", "Ld0/h;", "a", "(Lhn/c;)Ljava/lang/Object;", "Ljava/io/File;", "Ljava/io/File;", "data", "<init>", "(Ljava/io/File;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File data;

    /* JADX INFO: compiled from: FileFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Ld0/j$a;", "Ld0/i$a;", "Ljava/io/File;", "data", "Lj0/j;", "options", "Lcoil/ImageLoader;", "imageLoader", "Ld0/i;", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements i.a<File> {
        @Override // d0.i.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull File data, @NotNull j0.j options, @NotNull ImageLoader imageLoader) {
            return new j(data);
        }
    }

    public j(@NotNull File file) {
        this.data = file;
    }

    @Override // d0.i
    @Nullable
    public Object a(@NotNull hn.c<? super h> cVar) {
        return new l(a0.l.d(Path.Companion.get$default(Path.Companion, this.data, false, 1, (Object) null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(on.i.v(this.data)), DataSource.DISK);
    }
}

package g0;

import android.net.Uri;
import bo.d0;
import com.ironsource.C3978d4;
import j0.j;
import java.io.File;
import kotlin.Metadata;
import o0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FileUriMapper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"Lg0/b;", "Lg0/d;", "Landroid/net/Uri;", "Ljava/io/File;", "data", "Lj0/j;", "options", "c", "", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class b implements d<Uri, File> {
    public final boolean b(Uri data) {
        if (!i.r(data)) {
            String scheme = data.getScheme();
            if (scheme == null || p.f(scheme, C3978d4.i.f31327b)) {
                String path = data.getPath();
                if (path == null) {
                    path = "";
                }
                if (d0.Y0(path, '/', false, 2, null) && i.i(data) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g0.d
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(@NotNull Uri data, @NotNull j options) {
        if (!b(data)) {
            return null;
        }
        if (data.getScheme() != null) {
            data = data.buildUpon().scheme(null).build();
        }
        return new File(data.toString());
    }
}

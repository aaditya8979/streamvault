package androidx.core.net;

import android.net.Uri;
import com.ironsource.C3978d4;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Uri.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UriKt {
    @NotNull
    public static final File toFile(@NotNull Uri uri) {
        if (!p.f(uri.getScheme(), C3978d4.i.f31327b)) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @NotNull
    public static final Uri toUri(@NotNull File file) {
        return Uri.fromFile(file);
    }

    @NotNull
    public static final Uri toUri(@NotNull String str) {
        return Uri.parse(str);
    }
}

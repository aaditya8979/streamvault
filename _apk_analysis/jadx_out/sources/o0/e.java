package o0;

import com.ironsource.C3978d4;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileSystems.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"Lokio/FileSystem;", "Lokio/Path;", C3978d4.i.f31327b, "Lbn/r;", "a", "directory", "b", "coil-base_release"}, k = 2, mv = {1, 7, 1})
public final class e {
    public static final void a(@NotNull FileSystem fileSystem, @NotNull Path path) {
        if (fileSystem.exists(path)) {
            return;
        }
        i.d(fileSystem.sink(path));
    }

    public static final void b(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).isDirectory()) {
                        b(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}

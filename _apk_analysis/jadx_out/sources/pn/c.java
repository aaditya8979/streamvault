package pn;

import cn.f0;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
public class c extends b {
    @NotNull
    public static final List<Path> a(@NotNull Path path, @NotNull String str) throws IOException {
        p.k(path, "<this>");
        p.k(str, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            p.h(directoryStreamNewDirectoryStream);
            List<Path> listG1 = f0.g1(directoryStreamNewDirectoryStream);
            on.b.a(directoryStreamNewDirectoryStream, null);
            return listG1;
        } finally {
        }
    }

    public static /* synthetic */ List b(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return a(path, str);
    }
}

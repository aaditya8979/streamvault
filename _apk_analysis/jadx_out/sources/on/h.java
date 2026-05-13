package on;

import java.io.File;
import kotlin.io.FileWalkDirection;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
public class h extends g {
    @NotNull
    public static final d q(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        p.k(file, "<this>");
        p.k(fileWalkDirection, "direction");
        return new d(file, fileWalkDirection);
    }

    public static /* synthetic */ d r(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return q(file, fileWalkDirection);
    }

    @NotNull
    public static final d s(@NotNull File file) {
        p.k(file, "<this>");
        return q(file, FileWalkDirection.TOP_DOWN);
    }
}

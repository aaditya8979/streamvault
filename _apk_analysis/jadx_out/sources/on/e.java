package on;

import bo.d0;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static final int a(String str) {
        int iQ0;
        int iQ02 = d0.q0(str, File.separatorChar, 0, false, 4, null);
        if (iQ02 != 0) {
            if (iQ02 > 0 && str.charAt(iQ02 - 1) == ':') {
                return iQ02 + 1;
            }
            if (iQ02 == -1 && d0.h0(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c10 = File.separatorChar;
            if (cCharAt == c10 && (iQ0 = d0.q0(str, c10, 2, false, 4, null)) >= 0) {
                int iQ03 = d0.q0(str, File.separatorChar, iQ0 + 1, false, 4, null);
                return iQ03 >= 0 ? iQ03 + 1 : str.length();
            }
        }
        return 1;
    }

    public static final boolean b(@NotNull File file) {
        p.k(file, "<this>");
        String path = file.getPath();
        p.j(path, "getPath(...)");
        return a(path) > 0;
    }
}

package ta;

import ab.o;
import android.content.Context;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

/* JADX INFO: compiled from: SandboxFileLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: compiled from: SandboxFileLoader.java */
    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isDirectory();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153 A[PHI: r17
      0x0153: PHI (r17v4 java.io.File[]) = (r17v3 java.io.File[]), (r17v3 java.io.File[]), (r17v3 java.io.File[]), (r17v5 java.io.File[]) binds: [B:76:0x0164, B:73:0x015d, B:68:0x0151, B:81:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> a(android.content.Context r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.e.a(android.content.Context, java.lang.String):java.util.ArrayList");
    }

    public static LocalMediaFolder b(Context context, String str) {
        ArrayList<LocalMedia> arrayListA = a(context, str);
        if (arrayListA == null || arrayListA.size() <= 0) {
            return null;
        }
        o.f(arrayListA);
        LocalMedia localMedia = arrayListA.get(0);
        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
        localMediaFolder.q(localMedia.v());
        localMediaFolder.o(localMedia.w());
        localMediaFolder.p(localMedia.s());
        localMediaFolder.l(localMedia.g());
        localMediaFolder.r(arrayListA.size());
        localMediaFolder.n(arrayListA);
        return localMediaFolder;
    }
}

package r7;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: DataSourceUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    public static void a(@Nullable h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }
}

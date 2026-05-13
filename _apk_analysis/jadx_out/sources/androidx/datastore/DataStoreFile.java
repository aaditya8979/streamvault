package androidx.datastore;

import android.content.Context;
import com.ironsource.Y5;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DataStoreFile.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"dataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", Y5.c.f30724b, "", "datastore_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class DataStoreFile {
    @NotNull
    public static final File dataStoreFile(@NotNull Context context, @NotNull String str) {
        p.k(context, "<this>");
        p.k(str, Y5.c.f30724b);
        return new File(context.getApplicationContext().getFilesDir(), p.t("datastore/", str));
    }
}

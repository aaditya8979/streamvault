package r7;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes5.dex */
public interface h extends f {

    /* JADX INFO: compiled from: DataSource.java */
    public interface a {
        h createDataSource();
    }

    long a(k kVar) throws IOException;

    void b(y yVar);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    @Nullable
    Uri getUri();
}

package vs;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: InputStreamAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c implements d {
    public abstract InputStream a() throws IOException;

    @Override // vs.d
    public void close() {
        ws.b.d().a();
    }

    @Override // vs.d
    public InputStream open() throws IOException {
        return a();
    }
}

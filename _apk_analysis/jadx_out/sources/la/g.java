package la;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: PictureMediaScannerConnection.java */
/* JADX INFO: loaded from: classes11.dex */
public class g implements MediaScannerConnection.MediaScannerConnectionClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaScannerConnection f73758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f73760c;

    /* JADX INFO: compiled from: PictureMediaScannerConnection.java */
    public interface a {
        void a();
    }

    public g(Context context, String str) {
        this.f73759b = str;
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context.getApplicationContext(), this);
        this.f73758a = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public void onMediaScannerConnected() {
        if (TextUtils.isEmpty(this.f73759b)) {
            return;
        }
        this.f73758a.scanFile(this.f73759b, null);
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(String str, Uri uri) {
        this.f73758a.disconnect();
        a aVar = this.f73760c;
        if (aVar != null) {
            aVar.a();
        }
    }
}

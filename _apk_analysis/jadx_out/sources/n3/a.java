package n3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ImageDownloaderAsyncTask.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends AsyncTask<Object, Void, HashMap<String, Drawable>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final k f75077c = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75075a = 10;

    /* JADX INFO: renamed from: n3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageDownloaderAsyncTask.java */
    public class CallableC0894a implements Callable<Drawable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ URL f75078b;

        public CallableC0894a(URL url) {
            this.f75078b = url;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Drawable call() throws Exception {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f75078b.openStream());
            bitmapDecodeStream.setDensity(160);
            return new BitmapDrawable(Resources.getSystem(), bitmapDecodeStream);
        }
    }

    /* JADX INFO: compiled from: ImageDownloaderAsyncTask.java */
    public interface b {
        void a(HashMap<String, Drawable> map);

        void b();
    }

    public a(b bVar) {
        this.f75076b = bVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HashMap<String, Drawable> doInBackground(Object... objArr) {
        Drawable drawableB;
        HashMap map = (HashMap) objArr[0];
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        try {
            if (this.f75077c.b(String.valueOf(map.get("icon_key"))) != null) {
                drawableB = this.f75077c.b(String.valueOf(map.get("icon_key")));
            } else {
                Drawable drawable = b((URL) map.get("icon_key"), executorServiceNewCachedThreadPool).get(this.f75075a, TimeUnit.SECONDS);
                this.f75077c.d(String.valueOf(map.get("icon_key")), drawable);
                drawableB = drawable;
            }
            HashMap<String, Drawable> map2 = new HashMap<>();
            map2.put("icon_key", drawableB);
            return map2;
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final Future<Drawable> b(URL url, ExecutorService executorService) {
        return executorService.submit(new CallableC0894a(url));
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(HashMap<String, Drawable> map) {
        super.onPostExecute(map);
        if (map != null) {
            this.f75076b.a(map);
        } else {
            this.f75076b.b();
        }
    }
}

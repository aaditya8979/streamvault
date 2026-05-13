package vf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* JADX INFO: compiled from: BitmapLoadTask.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f86050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f86051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f86052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f86053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f86054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sf.b f86055f;

    /* JADX INFO: compiled from: BitmapLoadTask.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f86056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public tf.b f86057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Exception f86058c;

        public a(@NonNull Bitmap bitmap, @NonNull tf.b bVar) {
            this.f86056a = bitmap;
            this.f86057b = bVar;
        }

        public a(@NonNull Exception exc) {
            this.f86058c = exc;
        }
    }

    public b(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i10, int i11, sf.b bVar) {
        this.f86050a = new WeakReference<>(context);
        this.f86051b = uri;
        this.f86052c = uri2;
        this.f86053d = i10;
        this.f86054e = i11;
        this.f86055f = bVar;
    }

    @Override // android.os.AsyncTask
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        InputStream inputStreamOpenInputStream;
        Context context = this.f86050a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.f86051b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            d();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(context.getContentResolver().openInputStream(this.f86051b), null, options);
                options.inSampleSize = wf.a.d(options.outWidth, options.outHeight);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            boolean z10 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z10) {
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.f86051b);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    } finally {
                        wf.a.c(inputStreamOpenInputStream);
                    }
                } catch (IOException e11) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e11);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f86051b + C3978d4.j.f31385e, e11));
                } catch (OutOfMemoryError e12) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e12);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f86051b + C3978d4.j.f31385e));
                }
                wf.a.c(inputStreamOpenInputStream);
                if (!wf.a.b(bitmapDecodeStream, options)) {
                    z10 = true;
                }
            }
            if (bitmapDecodeStream == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f86051b + C3978d4.j.f31385e));
            }
            int iH = wf.a.h(context, this.f86051b);
            int iF = wf.a.f(iH);
            int iG = wf.a.g(iH);
            tf.b bVar = new tf.b(iH, iF, iG);
            Matrix matrix = new Matrix();
            if (iF != 0) {
                matrix.preRotate(iF);
            }
            if (iG != 1) {
                matrix.postScale(iG, 1.0f);
            }
            return !matrix.isIdentity() ? new a(wf.a.l(bitmapDecodeStream, matrix), bVar) : new a(bitmapDecodeStream, bVar);
        } catch (IOException | NullPointerException e13) {
            return new a(e13);
        }
    }

    public final void b(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        Closeable closeable;
        Response response;
        Response responseExecute;
        BufferedSource bufferedSourceSource;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.f86050a.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        OkHttpClient okHttpClientA = rf.a.f78901b.a();
        BufferedSource bufferedSource = null;
        try {
            responseExecute = okHttpClientA.newCall(new Request.Builder().url(uri.toString()).build()).execute();
            try {
                bufferedSourceSource = responseExecute.body().source();
            } catch (Throwable th2) {
                th = th2;
                response = responseExecute;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            response = null;
        }
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
            if (outputStreamOpenOutputStream == null) {
                throw new NullPointerException("OutputStream for given output Uri is null");
            }
            Sink sink = Okio.sink(outputStreamOpenOutputStream);
            bufferedSourceSource.readAll(sink);
            wf.a.c(bufferedSourceSource);
            wf.a.c(sink);
            wf.a.c(responseExecute.body());
            okHttpClientA.dispatcher().cancelAll();
            this.f86051b = this.f86052c;
        } catch (Throwable th4) {
            th = th4;
            response = responseExecute;
            closeable = null;
            bufferedSource = bufferedSourceSource;
            wf.a.c(bufferedSource);
            wf.a.c(closeable);
            if (response != null) {
                wf.a.c(response.body());
            }
            okHttpClientA.dispatcher().cancelAll();
            this.f86051b = this.f86052c;
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(@NonNull a aVar) {
        Exception exc = aVar.f86058c;
        if (exc == null) {
            this.f86055f.a(aVar.f86056a, aVar.f86057b, this.f86051b, this.f86052c);
        } else {
            this.f86055f.onFailure(exc);
        }
    }

    public final void d() throws IOException, NullPointerException {
        String scheme = this.f86051b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                b(this.f86051b, this.f86052c);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        }
        if (C3978d4.i.f31327b.equals(scheme) || "content".equals(scheme)) {
            return;
        }
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }
}

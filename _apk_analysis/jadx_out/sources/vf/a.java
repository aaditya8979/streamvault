package vf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import tf.c;
import wf.f;
import wf.j;

/* JADX INFO: compiled from: BitmapCropTask.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f86030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f86031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f86032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f86033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f86034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f86035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f86036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f86037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap.CompressFormat f86038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f86039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f86040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f86041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f86042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f86043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final tf.b f86044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sf.a f86045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f86046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f86047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f86048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f86049t;

    public a(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull c cVar, @NonNull tf.a aVar, @Nullable sf.a aVar2) {
        this.f86030a = new WeakReference<>(context);
        this.f86031b = bitmap;
        this.f86032c = cVar.a();
        this.f86033d = cVar.c();
        this.f86034e = cVar.d();
        this.f86035f = cVar.b();
        this.f86036g = aVar.h();
        this.f86037h = aVar.i();
        this.f86038i = aVar.a();
        this.f86039j = aVar.b();
        this.f86040k = aVar.f();
        this.f86041l = aVar.g();
        this.f86042m = aVar.c();
        this.f86043n = aVar.d();
        this.f86044o = aVar.e();
        this.f86045p = aVar2;
    }

    public final void a() {
        if (this.f86048s < 0) {
            this.f86048s = 0;
            this.f86046q = this.f86031b.getWidth();
        }
        if (this.f86049t < 0) {
            this.f86049t = 0;
            this.f86047r = this.f86031b.getHeight();
        }
    }

    public final void b(Context context) throws Throwable {
        boolean zK = wf.a.k(this.f86042m);
        boolean zK2 = wf.a.k(this.f86043n);
        if (zK && zK2) {
            f.b(context, this.f86046q, this.f86047r, this.f86042m, this.f86043n);
            return;
        }
        if (zK) {
            f.c(context, this.f86046q, this.f86047r, this.f86042m, this.f86041l);
        } else if (zK2) {
            f.d(context, new ExifInterface(this.f86040k), this.f86046q, this.f86047r, this.f86043n);
        } else {
            f.e(new ExifInterface(this.f86040k), this.f86046q, this.f86047r, this.f86041l);
        }
    }

    public final boolean c() throws Throwable {
        Context context = this.f86030a.get();
        if (context == null) {
            return false;
        }
        if (this.f86036g > 0 && this.f86037h > 0) {
            float fWidth = this.f86032c.width() / this.f86034e;
            float fHeight = this.f86032c.height() / this.f86034e;
            int i10 = this.f86036g;
            if (fWidth > i10 || fHeight > this.f86037h) {
                float fMin = Math.min(i10 / fWidth, this.f86037h / fHeight);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f86031b, Math.round(r3.getWidth() * fMin), Math.round(this.f86031b.getHeight() * fMin), false);
                Bitmap bitmap = this.f86031b;
                if (bitmap != bitmapCreateScaledBitmap) {
                    bitmap.recycle();
                }
                this.f86031b = bitmapCreateScaledBitmap;
                this.f86034e /= fMin;
            }
        }
        if (this.f86035f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f86035f, this.f86031b.getWidth() / 2, this.f86031b.getHeight() / 2);
            Bitmap bitmap2 = this.f86031b;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f86031b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.f86031b;
            if (bitmap3 != bitmapCreateBitmap) {
                bitmap3.recycle();
            }
            this.f86031b = bitmapCreateBitmap;
        }
        this.f86048s = Math.round((this.f86032c.left - this.f86033d.left) / this.f86034e);
        this.f86049t = Math.round((this.f86032c.top - this.f86033d.top) / this.f86034e);
        this.f86046q = Math.round(this.f86032c.width() / this.f86034e);
        int iRound = Math.round(this.f86032c.height() / this.f86034e);
        this.f86047r = iRound;
        boolean zG = g(this.f86046q, iRound);
        Log.i("BitmapCropTask", "Should crop: " + zG);
        if (!zG) {
            if (Build.VERSION.SDK_INT < 29 || !j.j(this.f86040k)) {
                j.a(this.f86040k, this.f86041l);
            } else {
                j.v(context.getContentResolver().openInputStream(Uri.parse(this.f86040k)), new FileOutputStream(this.f86041l));
            }
            return false;
        }
        a();
        f(Bitmap.createBitmap(this.f86031b, this.f86048s, this.f86049t, this.f86046q, this.f86047r));
        if (!this.f86038i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        b(context);
        return true;
    }

    @Override // android.os.AsyncTask
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f86031b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f86033d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f86043n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            c();
            this.f86031b = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(@Nullable Throwable th2) {
        sf.a aVar = this.f86045p;
        if (aVar != null) {
            if (th2 != null) {
                aVar.b(th2);
            } else {
                this.f86045p.a(wf.a.k(this.f86043n) ? this.f86043n : Uri.fromFile(new File(this.f86041l)), this.f86048s, this.f86049t, this.f86046q, this.f86047r);
            }
        }
    }

    public final void f(@NonNull Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Context context = this.f86030a.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(this.f86043n);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(this.f86038i, this.f86039j, byteArrayOutputStream);
                    outputStreamOpenOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    wf.a.c(outputStreamOpenOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = outputStreamOpenOutputStream;
                    try {
                        Log.e("BitmapCropTask", e.getLocalizedMessage());
                        wf.a.c(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        wf.a.c(outputStream);
                        wf.a.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = outputStreamOpenOutputStream;
                    wf.a.c(outputStream);
                    wf.a.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
        wf.a.c(byteArrayOutputStream);
    }

    public final boolean g(int i10, int i11) {
        int iRound = Math.round(Math.max(i10, i11) / 1000.0f) + 1;
        if (this.f86036g > 0 && this.f86037h > 0) {
            return true;
        }
        float f10 = iRound;
        return Math.abs(this.f86032c.left - this.f86033d.left) > f10 || Math.abs(this.f86032c.top - this.f86033d.top) > f10 || Math.abs(this.f86032c.bottom - this.f86033d.bottom) > f10 || Math.abs(this.f86032c.right - this.f86033d.right) > f10 || this.f86035f != 0.0f;
    }
}

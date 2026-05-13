package ab;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;

/* JADX INFO: compiled from: MediaUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: compiled from: MediaUtils.java */
    public class a extends PictureThreadUtils.d<pa.b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f3703i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f3704j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ra.d f3705k;

        public a(Context context, String str, ra.d dVar) {
            this.f3703i = context;
            this.f3704j = str;
            this.f3705k = dVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public pa.b g() {
            return j.f(this.f3703i, this.f3704j);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(pa.b bVar) {
            PictureThreadUtils.d(this);
            ra.d dVar = this.f3705k;
            if (dVar != null) {
                dVar.a(bVar);
            }
        }
    }

    /* JADX INFO: compiled from: MediaUtils.java */
    public class b extends PictureThreadUtils.d<pa.b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f3706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f3707j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ra.d f3708k;

        public b(Context context, String str, ra.d dVar) {
            this.f3706i = context;
            this.f3707j = str;
            this.f3708k = dVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public pa.b g() {
            return j.l(this.f3706i, this.f3707j);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(pa.b bVar) {
            PictureThreadUtils.d(this);
            ra.d dVar = this.f3708k;
            if (dVar != null) {
                dVar.a(bVar);
            }
        }
    }

    public static Bundle a(String str, String[] strArr, int i10, int i11, String str2) {
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", str2);
            if (l.f()) {
                bundle.putString("android:query-arg-sql-limit", i10 + " offset " + i11);
            }
        }
        return bundle;
    }

    public static void b(Context context, String str) {
        try {
            if (ma.d.c(str)) {
                context.getContentResolver().delete(Uri.parse(str), null, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String c(String str) {
        File file = new File(str);
        return file.getParentFile() != null ? file.getParentFile().getName() : "Camera";
    }

    public static pa.b d(Context context, String str) {
        pa.b bVar = new pa.b();
        if (ma.d.g(str)) {
            return bVar;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (ma.d.c(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    bVar.d(s.e(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                mediaMetadataRetriever.release();
            }
            return bVar;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.content.Context r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "%"
            r1 = -1
            r2 = 0
            java.lang.String r6 = "_data like ?"
            r9 = 1
            java.lang.String[] r7 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r3.<init>()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r3.append(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r3.append(r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r3.append(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r0 = 0
            r7[r0] = r11     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            boolean r11 = ab.l.f()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r11 == 0) goto L39
            java.lang.String r11 = "_id DESC"
            android.os.Bundle r11 = a(r6, r7, r9, r0, r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            android.database.Cursor r10 = ta.c.a(r10, r0, r2, r11, r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            goto L4a
        L39:
            java.lang.String r8 = "_id DESC limit 1 offset 0"
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r5 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
        L4a:
            r2 = r10
            if (r2 == 0) goto L78
            int r10 = r2.getCount()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r10 <= 0) goto L78
            boolean r10 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r10 == 0) goto L78
            java.lang.String r10 = "_id"
            int r10 = r2.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r10 = r2.getInt(r10)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            java.lang.String r11 = "date_added"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            long r3 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r11 = ab.d.a(r3)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            if (r11 > r9) goto L74
            r1 = r10
        L74:
            r2.close()
            return r1
        L78:
            if (r2 == 0) goto L7d
            r2.close()
        L7d:
            return r1
        L7e:
            r10 = move-exception
            goto L8a
        L80:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L89
            r2.close()
        L89:
            return r1
        L8a:
            if (r2 == 0) goto L8f
            r2.close()
        L8f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.j.e(android.content.Context, java.lang.String):int");
    }

    public static pa.b f(Context context, String str) {
        BitmapFactory.Options options;
        InputStream inputStreamA;
        pa.b bVar = new pa.b();
        if (ma.d.g(str)) {
            return bVar;
        }
        InputStream inputStream = null;
        try {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                inputStreamA = ma.d.c(str) ? la.e.a(context, Uri.parse(str)) : new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            BitmapFactory.decodeStream(inputStreamA, null, options);
            bVar.g(options.outWidth);
            bVar.e(options.outHeight);
            k.a(inputStreamA);
        } catch (Exception e11) {
            inputStream = inputStreamA;
            e = e11;
            e.printStackTrace();
            k.a(inputStream);
        } catch (Throwable th3) {
            inputStream = inputStreamA;
            th = th3;
            k.a(inputStream);
            throw th;
        }
        return bVar;
    }

    public static void g(Context context, String str, ra.d<pa.b> dVar) {
        PictureThreadUtils.h(new a(context, str, dVar));
    }

    public static String h(File file) {
        return URLConnection.getFileNameMap().getContentTypeFor(file.getName());
    }

    public static String i(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = h(new File(str));
        }
        return TextUtils.isEmpty(mimeTypeFromExtension) ? "image/jpeg" : mimeTypeFromExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[PHI: r2
      0x008e: PHI (r2v5 android.database.Cursor) = (r2v3 android.database.Cursor), (r2v6 android.database.Cursor) binds: [B:21:0x008c, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Long[] j(android.content.Context r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "%"
            r1 = 2
            java.lang.Long[] r1 = new java.lang.Long[r1]
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r4 = 1
            r1[r4] = r2
            r2 = 0
            java.lang.String r8 = "_data like ?"
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.<init>()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.append(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.append(r12)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.append(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r9[r3] = r12     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            boolean r12 = ab.l.f()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r0 = "external"
            if (r12 == 0) goto L45
            java.lang.String r12 = "_id DESC"
            android.os.Bundle r12 = a(r8, r9, r4, r3, r12)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.net.Uri r0 = android.provider.MediaStore.Files.getContentUri(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.database.Cursor r11 = ta.c.a(r11, r0, r2, r12, r2)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            goto L54
        L45:
            java.lang.String r10 = "_id DESC limit 1 offset 0"
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.net.Uri r6 = android.provider.MediaStore.Files.getContentUri(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r7 = 0
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L54:
            r2 = r11
            if (r2 == 0) goto L83
            int r11 = r2.getCount()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r11 <= 0) goto L83
            boolean r11 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r11 == 0) goto L83
            java.lang.String r11 = "_id"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            long r11 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r1[r3] = r11     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r11 = "bucket_id"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            long r11 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r1[r4] = r11     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L83:
            if (r2 == 0) goto L91
            goto L8e
        L86:
            r11 = move-exception
            goto L92
        L88:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L91
        L8e:
            r2.close()
        L91:
            return r1
        L92:
            if (r2 == 0) goto L97
            r2.close()
        L97:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.j.j(android.content.Context, java.lang.String):java.lang.Long[]");
    }

    public static String k(long j10, String str) {
        return ContentUris.withAppendedId(ma.d.h(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : ma.d.i(str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : ma.d.d(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external"), j10).toString();
    }

    public static pa.b l(Context context, String str) {
        int iC;
        int iC2;
        pa.b bVar = new pa.b();
        if (ma.d.g(str)) {
            return bVar;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (ma.d.c(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (TextUtils.equals("90", strExtractMetadata) || TextUtils.equals("270", strExtractMetadata)) {
                        int iC3 = s.c(mediaMetadataRetriever.extractMetadata(18));
                        iC = iC3;
                        iC2 = s.c(mediaMetadataRetriever.extractMetadata(19));
                    } else {
                        iC2 = s.c(mediaMetadataRetriever.extractMetadata(18));
                        iC = s.c(mediaMetadataRetriever.extractMetadata(19));
                    }
                    bVar.g(iC2);
                    bVar.e(iC);
                    bVar.f(strExtractMetadata);
                    bVar.d(s.e(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return bVar;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            throw th2;
        }
    }

    public static void m(Context context, String str, ra.d<pa.b> dVar) {
        PictureThreadUtils.h(new b(context, str, dVar));
    }

    public static boolean n(int i10, int i11) {
        return i10 > 0 && i11 > 0 && i11 > i10 * 3;
    }

    public static void o(Context context, int i10) {
        try {
            context.getApplicationContext().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{Long.toString(i10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}

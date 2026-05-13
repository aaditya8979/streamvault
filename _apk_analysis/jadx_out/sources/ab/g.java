package ab;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

/* JADX INFO: compiled from: DownloadFileUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: compiled from: DownloadFileUtils.java */
    public class a extends PictureThreadUtils.d<String> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f3698i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f3699j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f3700k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ra.d f3701l;

        public a(String str, Context context, String str2, ra.d dVar) {
            this.f3698i = str;
            this.f3699j = context;
            this.f3700k = str2;
            this.f3701l = dVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String g() {
            Uri uriInsert;
            try {
                ContentValues contentValues = new ContentValues();
                String strG = s.g(Long.valueOf(System.currentTimeMillis()));
                if (ma.d.d(this.f3698i)) {
                    contentValues.put("_display_name", d.c("AUD_"));
                    contentValues.put("mime_type", (TextUtils.isEmpty(this.f3698i) || this.f3698i.startsWith("video") || this.f3698i.startsWith("image")) ? "audio/mpeg" : this.f3698i);
                    if (l.e()) {
                        contentValues.put("datetaken", strG);
                        contentValues.put("relative_path", Environment.DIRECTORY_MUSIC);
                    } else {
                        contentValues.put("_data", (TextUtils.equals(Environment.getExternalStorageState(), "mounted") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : new File(h.b(this.f3699j, 3))).getAbsolutePath() + File.separator + d.c("AUD_") + ".amr");
                    }
                    uriInsert = this.f3699j.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
                } else if (ma.d.i(this.f3698i)) {
                    contentValues.put("_display_name", d.c("VID_"));
                    contentValues.put("mime_type", (TextUtils.isEmpty(this.f3698i) || this.f3698i.startsWith("audio") || this.f3698i.startsWith("image")) ? "video/mp4" : this.f3698i);
                    if (l.e()) {
                        contentValues.put("datetaken", strG);
                        contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
                    } else {
                        contentValues.put("_data", (TextUtils.equals(Environment.getExternalStorageState(), "mounted") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : new File(h.b(this.f3699j, 2))).getAbsolutePath() + File.separator + d.c("VID_") + ".mp4");
                    }
                    uriInsert = this.f3699j.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                } else {
                    contentValues.put("_display_name", d.c("IMG_"));
                    contentValues.put("mime_type", (TextUtils.isEmpty(this.f3698i) || this.f3698i.startsWith("audio") || this.f3698i.startsWith("video")) ? "image/jpeg" : this.f3698i);
                    if (l.e()) {
                        contentValues.put("datetaken", strG);
                        contentValues.put("relative_path", "DCIM/Camera");
                    } else if (ma.d.f(this.f3698i) || ma.d.m(this.f3700k)) {
                        contentValues.put("_data", (TextUtils.equals(Environment.getExternalStorageState(), "mounted") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) : new File(h.b(this.f3699j, 1))).getAbsolutePath() + File.separator + d.c("IMG_") + ".gif");
                    }
                    uriInsert = this.f3699j.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                }
                if (uriInsert == null) {
                    return null;
                }
                if (k.q(ma.d.g(this.f3700k) ? new URL(this.f3700k).openStream() : ma.d.c(this.f3700k) ? la.e.a(this.f3699j, Uri.parse(this.f3700k)) : new FileInputStream(this.f3700k), la.e.b(this.f3699j, uriInsert))) {
                    return k.h(this.f3699j, uriInsert);
                }
                return null;
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(String str) {
            PictureThreadUtils.d(this);
            ra.d dVar = this.f3701l;
            if (dVar != null) {
                dVar.a(str);
            }
        }
    }

    public static void a(Context context, String str, String str2, ra.d<String> dVar) {
        PictureThreadUtils.h(new a(str2, context, str, dVar));
    }
}

package ta;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.Locale;
import ra.s;
import ra.t;
import ra.u;

/* JADX INFO: compiled from: IBridgeMediaLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f85204c = "a";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f85205d = MediaStore.Files.getContentUri("external");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f85206e = {"_id", "_data", "mime_type", "width", "height", "duration", "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f85207f = {"_id", "_data", "mime_type", "width", "height", "duration", "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation", "COUNT(*) AS count"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f85208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PictureSelectionConfig f85209b;

    public PictureSelectionConfig a() {
        return this.f85209b;
    }

    public String b() {
        return String.format(Locale.CHINA, "%d <%s duration and duration <= %d", Long.valueOf(Math.max(0L, a().f35033s)), "=", Long.valueOf(a().f35031r == 0 ? Long.MAX_VALUE : a().f35031r));
    }

    public String c() {
        return String.format(Locale.CHINA, "%d <%s _size and _size <= %d", Long.valueOf(Math.max(0L, a().f35047z)), "=", Long.valueOf(a().f35045y == 0 ? Long.MAX_VALUE : a().f35045y));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String d() {
        /*
            r10 = this;
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r10.a()
            java.util.List<java.lang.String> r0 = r0.R
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = -1
        L15:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L28
            goto L15
        L28:
            com.luck.picture.lib.config.PictureSelectionConfig r5 = r10.a()
            int r5 = r5.f34999b
            int r6 = ma.e.d()
            java.lang.String r7 = "audio"
            java.lang.String r8 = "image"
            if (r5 != r6) goto L45
            boolean r5 = r4.startsWith(r8)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r7)
            if (r5 == 0) goto L79
            goto L15
        L45:
            com.luck.picture.lib.config.PictureSelectionConfig r5 = r10.a()
            int r5 = r5.f34999b
            int r6 = ma.e.c()
            java.lang.String r9 = "video"
            if (r5 != r6) goto L60
            boolean r5 = r4.startsWith(r7)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r9)
            if (r5 == 0) goto L79
            goto L15
        L60:
            com.luck.picture.lib.config.PictureSelectionConfig r5 = r10.a()
            int r5 = r5.f34999b
            int r6 = ma.e.b()
            if (r5 != r6) goto L79
            boolean r5 = r4.startsWith(r9)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r8)
            if (r5 == 0) goto L79
            goto L15
        L79:
            int r3 = r3 + 1
            if (r3 != 0) goto L80
            java.lang.String r5 = " AND "
            goto L82
        L80:
            java.lang.String r5 = " OR "
        L82:
            r2.append(r5)
            java.lang.String r5 = "mime_type"
            r2.append(r5)
            java.lang.String r5 = "='"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "'"
            r2.append(r4)
            goto L15
        L99:
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r10.a()
            int r0 = r0.f34999b
            int r3 = ma.e.d()
            if (r0 == r3) goto Lbc
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r10.a()
            boolean r0 = r0.F
            if (r0 != 0) goto Lbc
            java.lang.String r0 = ma.d.q()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = " AND (mime_type!='image/gif')"
            r2.append(r0)
        Lbc:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.a.d():java.lang.String");
    }

    public void e(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f85208a = context;
        this.f85209b = pictureSelectionConfig;
    }

    public abstract void f(t<LocalMediaFolder> tVar);

    public abstract void g(s<LocalMediaFolder> sVar);

    public Context getContext() {
        return this.f85208a;
    }

    public abstract void h(long j10, int i10, int i11, u<LocalMedia> uVar);
}

package xa;

import ab.l;
import ma.e;

/* JADX INFO: compiled from: PermissionConfig.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f86887a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f86888b = {"android.permission.CAMERA"};

    public static String[] a(int i10) {
        return l.g() ? i10 == e.c() ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : i10 == e.d() ? new String[]{"android.permission.READ_MEDIA_VIDEO"} : i10 == e.b() ? new String[]{"android.permission.READ_MEDIA_AUDIO"} : new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    public static String[] b(int i10) {
        return l.g() ? i10 == e.c() ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : i10 == e.d() ? new String[]{"android.permission.READ_MEDIA_VIDEO"} : i10 == e.b() ? new String[]{"android.permission.READ_MEDIA_AUDIO"} : new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    }
}

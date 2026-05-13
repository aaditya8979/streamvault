package va;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SelectedManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<LocalMedia> f85933a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList<LocalMedia> f85934b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList<LocalMedia> f85935c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList<LocalMediaFolder> f85936d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static LocalMediaFolder f85937e;

    public static void a(List<LocalMediaFolder> list) {
        if (list != null) {
            e();
            f85936d.addAll(list);
        }
    }

    public static void b(ArrayList<LocalMedia> arrayList) {
        if (arrayList != null) {
            f();
            f85935c.addAll(arrayList);
        }
    }

    public static synchronized void c(LocalMedia localMedia) {
        f85933a.add(localMedia);
    }

    public static void d(ArrayList<LocalMedia> arrayList) {
        g();
        f85934b.addAll(arrayList);
    }

    public static void e() {
        ArrayList<LocalMediaFolder> arrayList = f85936d;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static void f() {
        ArrayList<LocalMedia> arrayList = f85935c;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static void g() {
        ArrayList<LocalMedia> arrayList = f85934b;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static synchronized void h() {
        ArrayList<LocalMedia> arrayList = f85933a;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static ArrayList<LocalMediaFolder> i() {
        return f85936d;
    }

    public static LocalMediaFolder j() {
        return f85937e;
    }

    public static ArrayList<LocalMedia> k() {
        return f85935c;
    }

    public static int l() {
        return f85933a.size();
    }

    public static ArrayList<LocalMedia> m() {
        return f85934b;
    }

    public static synchronized ArrayList<LocalMedia> n() {
        return f85933a;
    }

    public static String o() {
        ArrayList<LocalMedia> arrayList = f85933a;
        return arrayList.size() > 0 ? arrayList.get(0).s() : "";
    }

    public static void p(LocalMediaFolder localMediaFolder) {
        f85937e = localMediaFolder;
    }
}

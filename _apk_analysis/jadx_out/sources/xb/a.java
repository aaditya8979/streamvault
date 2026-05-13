package xb;

import com.mgs.carparking.download.DownloadEntity;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DownloadHistoryCache.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f86889e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Deque<DownloadEntity> f86890a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, List<DownloadEntity>> f86891b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f86892c = "^(.+)(\\(\\d+\\))$";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Pattern f86893d = Pattern.compile("^(.+)(\\(\\d+\\))$");

    public static a a() {
        if (f86889e == null) {
            synchronized (a.class) {
                if (f86889e == null) {
                    f86889e = new a();
                }
            }
        }
        return f86889e;
    }
}

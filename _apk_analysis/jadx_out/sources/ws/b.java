package ws;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import top.zibin.luban.io.BufferedInputStreamWrap;

/* JADX INFO: compiled from: ArrayPoolProvide.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f86696d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<String> f86697a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, BufferedInputStreamWrap> f86698b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f86699c = new g(4194304);

    public static void b(Closeable closeable) {
        if (closeable instanceof Closeable) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static b d() {
        if (f86696d == null) {
            synchronized (b.class) {
                if (f86696d == null) {
                    f86696d = new b();
                }
            }
        }
        return f86696d;
    }

    public void a() {
        for (String str : this.f86697a) {
            b(this.f86698b.get(str));
            this.f86698b.remove(str);
        }
        this.f86697a.clear();
        this.f86699c.a();
    }

    public byte[] c(int i10) {
        return (byte[]) this.f86699c.e(i10, byte[].class);
    }

    public InputStream e(ContentResolver contentResolver, Uri uri) {
        try {
            try {
                BufferedInputStreamWrap bufferedInputStreamWrapH = this.f86698b.get(uri.toString());
                if (bufferedInputStreamWrapH != null) {
                    bufferedInputStreamWrapH.reset();
                } else {
                    bufferedInputStreamWrapH = h(contentResolver, uri);
                }
                return bufferedInputStreamWrapH;
            } catch (Exception e10) {
                e10.printStackTrace();
                return h(contentResolver, uri);
            }
        } catch (Exception unused) {
            return contentResolver.openInputStream(uri);
        }
    }

    public InputStream f(String str) {
        try {
            BufferedInputStreamWrap bufferedInputStreamWrapI = this.f86698b.get(str);
            if (bufferedInputStreamWrapI != null) {
                bufferedInputStreamWrapI.reset();
            } else {
                bufferedInputStreamWrapI = i(str);
            }
            return bufferedInputStreamWrapI;
        } catch (Exception unused) {
            return i(str);
        }
    }

    public void g(byte[] bArr) {
        this.f86699c.n(bArr);
    }

    public final BufferedInputStreamWrap h(ContentResolver contentResolver, Uri uri) {
        BufferedInputStreamWrap bufferedInputStreamWrap;
        BufferedInputStreamWrap bufferedInputStreamWrap2 = null;
        try {
            bufferedInputStreamWrap = new BufferedInputStreamWrap(contentResolver.openInputStream(uri));
        } catch (Exception e10) {
            e = e10;
        }
        try {
            int iAvailable = bufferedInputStreamWrap.available();
            if (iAvailable <= 0) {
                iAvailable = 8388608;
            }
            bufferedInputStreamWrap.mark(iAvailable);
            this.f86698b.put(uri.toString(), bufferedInputStreamWrap);
            this.f86697a.add(uri.toString());
            return bufferedInputStreamWrap;
        } catch (Exception e11) {
            e = e11;
            bufferedInputStreamWrap2 = bufferedInputStreamWrap;
            e.printStackTrace();
            return bufferedInputStreamWrap2;
        }
    }

    public final BufferedInputStreamWrap i(String str) {
        BufferedInputStreamWrap bufferedInputStreamWrap;
        BufferedInputStreamWrap bufferedInputStreamWrap2 = null;
        try {
            bufferedInputStreamWrap = new BufferedInputStreamWrap(new FileInputStream(str));
        } catch (Exception e10) {
            e = e10;
        }
        try {
            int iAvailable = bufferedInputStreamWrap.available();
            if (iAvailable <= 0) {
                iAvailable = 8388608;
            }
            bufferedInputStreamWrap.mark(iAvailable);
            this.f86698b.put(str, bufferedInputStreamWrap);
            this.f86697a.add(str);
            return bufferedInputStreamWrap;
        } catch (Exception e11) {
            e = e11;
            bufferedInputStreamWrap2 = bufferedInputStreamWrap;
            e.printStackTrace();
            return bufferedInputStreamWrap2;
        }
    }
}

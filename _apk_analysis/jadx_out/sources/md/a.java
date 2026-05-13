package md;

import android.content.Context;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: BaseLoader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> implements d<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74111a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f74112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld.a f74113c;

    public a(String str, Context context) {
        this.f74112b = str;
        c(context);
    }

    @Override // md.d
    public <D> List<D> a(String str, Class<D> cls) {
        return null;
    }

    @Override // md.d
    public boolean b(String str, D d10) {
        return false;
    }

    public final void c(Context context) {
        File file = new File(this.f74112b);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            this.f74113c = ld.a.C(file, ld.d.c(context), 1, ServiceProvider.HTTP_CACHE_DISK_SIZE);
            System.out.println("......create DiskLruCache......");
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public String d(String str) {
        ld.d.e(str, "key can't be null");
        return kd.c.b("cache_" + str);
    }
}

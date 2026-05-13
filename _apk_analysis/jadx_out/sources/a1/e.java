package a1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import z0.j;

/* JADX INFO: compiled from: LruDiskUsage.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements a1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f3475a = Executors.newSingleThreadExecutor();

    /* JADX INFO: compiled from: LruDiskUsage.java */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f3476b;

        public a(File file) {
            this.f3476b = file;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            e.this.e(this.f3476b);
            return null;
        }
    }

    @Override // a1.a
    public void a(File file) throws IOException {
        this.f3475a.submit(new a(file));
    }

    public abstract boolean b(File file, long j10, int i10);

    public final long d(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    public final void e(File file) throws IOException {
        d.e(file);
        f(d.a(file.getParentFile()));
    }

    public final void f(List<File> list) {
        long jD = d(list);
        int size = list.size();
        for (File file : list) {
            if (!b(file, jD, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    jD -= length;
                    j.c("Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    j.b("Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }
}

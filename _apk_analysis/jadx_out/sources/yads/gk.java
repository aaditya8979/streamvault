package yads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f90014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f90015b;

    public gk(File file) {
        this.f90014a = file;
        this.f90015b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f90015b.exists()) {
            this.f90014a.delete();
            this.f90015b.renameTo(this.f90014a);
        }
        return new FileInputStream(this.f90014a);
    }

    public final fk b() throws IOException {
        if (this.f90014a.exists()) {
            if (this.f90015b.exists()) {
                this.f90014a.delete();
            } else if (!this.f90014a.renameTo(this.f90015b)) {
                ih1.d("AtomicFile", "Couldn't rename file " + this.f90014a + " to backup file " + this.f90015b);
            }
        }
        try {
            return new fk(this.f90014a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f90014a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f90014a, e10);
            }
            try {
                return new fk(this.f90014a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f90014a, e11);
            }
        }
    }
}

package wq;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: BadResource.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f86658i;

    public a(URL url, String str) {
        super(url, null);
        this.f86658i = str;
    }

    @Override // wq.f, wq.e
    public boolean a() {
        return false;
    }

    @Override // wq.f, wq.e
    public File b() {
        return null;
    }

    @Override // wq.f, wq.e
    public InputStream c() throws IOException {
        throw new FileNotFoundException(this.f86658i);
    }

    @Override // wq.f, wq.e
    public long d() {
        return -1L;
    }

    @Override // wq.f, wq.e
    public boolean delete() throws SecurityException {
        throw new SecurityException(this.f86658i);
    }

    @Override // wq.f
    public String toString() {
        return super.toString() + "; BadResource=" + this.f86658i;
    }
}

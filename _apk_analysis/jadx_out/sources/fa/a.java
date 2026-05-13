package fa;

import android.content.ContentValues;
import ia.f;
import java.util.List;

/* JADX INFO: compiled from: ConnectionModel.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f61624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f61625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f61626e;

    public static long f(List<a> list) {
        long jA = 0;
        for (a aVar : list) {
            jA += aVar.a() - aVar.e();
        }
        return jA;
    }

    public long a() {
        return this.f61625d;
    }

    public long b() {
        return this.f61626e;
    }

    public int c() {
        return this.f61622a;
    }

    public int d() {
        return this.f61623b;
    }

    public long e() {
        return this.f61624c;
    }

    public void g(long j10) {
        this.f61625d = j10;
    }

    public void h(long j10) {
        this.f61626e = j10;
    }

    public void i(int i10) {
        this.f61622a = i10;
    }

    public void j(int i10) {
        this.f61623b = i10;
    }

    public void k(long j10) {
        this.f61624c = j10;
    }

    public ContentValues l() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(this.f61622a));
        contentValues.put("connectionIndex", Integer.valueOf(this.f61623b));
        contentValues.put("startOffset", Long.valueOf(this.f61624c));
        contentValues.put("currentOffset", Long.valueOf(this.f61625d));
        contentValues.put("endOffset", Long.valueOf(this.f61626e));
        return contentValues;
    }

    public String toString() {
        return f.o("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.f61622a), Integer.valueOf(this.f61623b), Long.valueOf(this.f61624c), Long.valueOf(this.f61626e), Long.valueOf(this.f61625d));
    }
}

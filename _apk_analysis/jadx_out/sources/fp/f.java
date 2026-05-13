package fp;

/* JADX INFO: compiled from: Duration.java */
/* JADX INFO: loaded from: classes4.dex */
public class f implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f61802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f61803c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f61804d;

    public f(long j10) {
        this.f61802b = j10;
        this.f61804d = j10;
    }

    public void a(float f10) {
        if (this.f61803c != f10) {
            this.f61803c = f10;
            this.f61804d = (long) (this.f61802b * f10);
        }
    }

    public void b(long j10) {
        this.f61802b = j10;
        this.f61804d = (long) (j10 * this.f61803c);
    }
}

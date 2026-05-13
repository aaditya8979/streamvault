package j2;

/* JADX INFO: compiled from: ChangelessFileNameGenerator.java */
/* JADX INFO: loaded from: classes12.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72174a;

    public a(String str) {
        this.f72174a = str;
    }

    @Override // j2.b
    public String generateFileName(int i10, long j10) {
        return this.f72174a;
    }

    @Override // j2.b
    public boolean isFileNameChangeable() {
        return false;
    }
}

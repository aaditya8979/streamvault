package df;

/* JADX INFO: compiled from: SignalCallbackListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class d<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public af.a f59767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f59768b;

    public d(af.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    public d(af.a aVar, g<T> gVar, f fVar) {
        this.f59767a = aVar;
        this.f59768b = fVar;
    }

    @Override // df.a
    public void a(String str, String str2, T t10) {
        this.f59768b.a(str, str2);
        this.f59767a.b();
    }

    @Override // df.a
    public void onFailure(String str) {
        this.f59768b.d(str);
        this.f59767a.b();
    }
}

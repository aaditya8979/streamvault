package f2;

/* JADX INFO: compiled from: PrinterSet.java */
/* JADX INFO: loaded from: classes3.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b[] f61433a;

    public c(b... bVarArr) {
        this.f61433a = bVarArr;
    }

    @Override // f2.b
    public void a(int i10, String str, String str2) {
        for (b bVar : this.f61433a) {
            bVar.a(i10, str, str2);
        }
    }
}

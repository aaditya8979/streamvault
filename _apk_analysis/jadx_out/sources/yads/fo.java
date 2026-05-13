package yads;

/* JADX INFO: loaded from: classes3.dex */
public class fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb2 f89647a;

    public fo(gw1 gw1Var) {
        this.f89647a = gw1Var;
        gw1Var.setId(2);
    }

    public void a(String str) {
        hb2 hb2Var = this.f89647a;
        hb2Var.loadDataWithBaseURL("https://yandex.ru", hb2Var.a(str), "text/html", "UTF-8", null);
    }
}

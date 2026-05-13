package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class om3 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f93289a = null;

    @Override // yads.up2
    public final void a(Object obj) {
        e82 e82Var = (e82) obj;
        to2 to2Var = this.f93289a;
        if (to2Var != null) {
            to2Var.onSuccess(e82Var);
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        be3 be3Var;
        if (im3Var.f90905b == null) {
            String message = im3Var.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            be3Var = new be3(message);
        } else {
            be3Var = new be3("Ping error");
        }
        to2 to2Var = this.f93289a;
        if (to2Var != null) {
            to2Var.a(be3Var);
        }
    }
}

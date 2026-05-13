package h9;

import k8.j;

/* JADX INFO: compiled from: QRCodeDecoderMetaData.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f63105a;

    public e(boolean z10) {
        this.f63105a = z10;
    }

    public void a(j[] jVarArr) {
        if (!this.f63105a || jVarArr == null || jVarArr.length < 3) {
            return;
        }
        j jVar = jVarArr[0];
        jVarArr[0] = jVarArr[2];
        jVarArr[2] = jVar;
    }
}

package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class I8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f65355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ec f65356b;

    public I8() {
        this(new W7(), new M9(), new C4665b());
    }

    public I8(W7 w72, M9 m92, C4665b c4665b) {
        Ec ec2 = new Ec(w72);
        this.f65355a = ec2;
        ec2.a(J8.NONE, w72);
        ec2.a(J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, m92);
        ec2.a(J8.AES_VALUE_ENCRYPTION, c4665b);
        this.f65356b = new Ec(w72);
    }
}

package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class gm0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gm0 f90035c = new gm0(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90037b;

    public gm0(int i10, String str) {
        this.f90036a = str;
        this.f90037b = i10;
    }

    public final String a() {
        return this.f90036a;
    }

    public final int b() {
        return this.f90037b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return tn.p.f(this.f90036a, gm0Var.f90036a) && this.f90037b == gm0Var.f90037b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90037b) + (this.f90036a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f90036a + ", version=" + this.f90037b + ")";
    }
}

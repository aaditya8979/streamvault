package wl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteArrayPool.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f<byte[]> f86441a = new C1089a();

    /* JADX INFO: renamed from: wl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteArrayPool.kt */
    public static final class C1089a extends d<byte[]> {
        public C1089a() {
            super(128);
        }

        @Override // wl.d
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public byte[] h() {
            return new byte[4096];
        }
    }

    @NotNull
    public static final f<byte[]> a() {
        return f86441a;
    }
}

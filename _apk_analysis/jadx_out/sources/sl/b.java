package sl;

/* JADX INFO: compiled from: ByteChannel.jvm.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final boolean a() {
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }
}

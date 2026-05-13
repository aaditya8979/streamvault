package il;

/* JADX INFO: compiled from: CharArrayPoolJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final boolean a() {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            return Boolean.parseBoolean(property);
        }
        return false;
    }
}

package w4;

import com.google.android.exoplayer.Format;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f86323a = new a();

    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    public class a implements b {
        @Override // w4.b
        public boolean a(Format format) {
            String str = format.f19927j;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
        }

        @Override // w4.b
        public w4.a b(Format format) {
            String str = format.f19927j;
            if (str != null) {
                switch (str) {
                    case "application/x-icy":
                        return new y4.a();
                    case "application/id3":
                        return new z4.b();
                    case "application/x-emsg":
                        return new x4.a();
                    case "application/x-scte35":
                        return new a5.a();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(Format format);

    w4.a b(Format format);
}

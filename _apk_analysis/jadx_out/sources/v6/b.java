package v6;

import com.google.android.exoplayer2.m;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes12.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f85925a = new a();

    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    public class a implements b {
        @Override // v6.b
        public boolean a(m mVar) {
            String str = mVar.f21751m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // v6.b
        public v6.a b(m mVar) {
            String str = mVar.f21751m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new w6.a();
                    case "application/x-icy":
                        return new y6.a();
                    case "application/id3":
                        return new z6.b();
                    case "application/x-emsg":
                        return new x6.a();
                    case "application/x-scte35":
                        return new b7.a();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(m mVar);

    v6.a b(m mVar);
}

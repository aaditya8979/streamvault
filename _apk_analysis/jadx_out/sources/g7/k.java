package g7;

/* JADX INFO: compiled from: SubtitleDecoderFactory.java */
/* JADX INFO: loaded from: classes12.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f62185a = new a();

    /* JADX INFO: compiled from: SubtitleDecoderFactory.java */
    public class a implements k {
        @Override // g7.k
        public boolean a(com.google.android.exoplayer2.m mVar) {
            String str = mVar.f21751m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // g7.k
        public j b(com.google.android.exoplayer2.m mVar) {
            String str = mVar.f21751m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new i7.a(mVar.f21753o);
                    case "application/pgs":
                        return new j7.a();
                    case "application/x-mp4-vtt":
                        return new p7.a();
                    case "text/vtt":
                        return new p7.h();
                    case "application/x-quicktime-tx3g":
                        return new o7.a(mVar.f21753o);
                    case "text/x-ssa":
                        return new l7.a(mVar.f21753o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new h7.a(str, mVar.E, 16000L);
                    case "text/x-exoplayer-cues":
                        return new g();
                    case "application/cea-708":
                        return new h7.c(mVar.E, mVar.f21753o);
                    case "application/x-subrip":
                        return new m7.a();
                    case "application/ttml+xml":
                        return new n7.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(com.google.android.exoplayer2.m mVar);

    j b(com.google.android.exoplayer2.m mVar);
}

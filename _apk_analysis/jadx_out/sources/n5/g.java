package n5;

import com.google.android.exoplayer.Format;

/* JADX INFO: compiled from: SubtitleDecoderFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f75142a = new a();

    /* JADX INFO: compiled from: SubtitleDecoderFactory.java */
    public class a implements g {
        @Override // n5.g
        public boolean a(Format format) {
            String str = format.f19927j;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // n5.g
        public f b(Format format) {
            String str = format.f19927j;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new p5.a(format.f19929l);
                    case "application/pgs":
                        return new q5.a();
                    case "application/x-mp4-vtt":
                        return new v5.b();
                    case "text/vtt":
                        return new v5.g();
                    case "application/x-quicktime-tx3g":
                        return new u5.a(format.f19929l);
                    case "text/x-ssa":
                        return new r5.a(format.f19929l);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new o5.a(str, format.C);
                    case "application/cea-708":
                        return new o5.c(format.C, format.f19929l);
                    case "application/x-subrip":
                        return new s5.a();
                    case "application/ttml+xml":
                        return new t5.a();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(Format format);

    f b(Format format);
}

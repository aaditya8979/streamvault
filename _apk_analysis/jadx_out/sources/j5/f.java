package j5;

import a6.g0;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsExtractorFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f72222a = new c();

    /* JADX INFO: compiled from: HlsExtractorFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4.g f72223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72225c;

        public a(k4.g gVar, boolean z10, boolean z11) {
            this.f72223a = gVar;
            this.f72224b = z10;
            this.f72225c = z11;
        }
    }

    a a(@Nullable k4.g gVar, Uri uri, Format format, @Nullable List<Format> list, g0 g0Var, Map<String, List<String>> map, k4.h hVar) throws InterruptedException, IOException;
}

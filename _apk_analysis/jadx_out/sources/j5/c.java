package j5;

import a6.g0;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.source.hls.HlsTrackMetadataEntry;
import j5.f;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultHlsExtractorFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72196c;

    public c() {
        this(0, true);
    }

    public c(int i10, boolean z10) {
        this.f72195b = i10;
        this.f72196c = z10;
    }

    public static f.a b(k4.g gVar) {
        return new f.a(gVar, (gVar instanceof t4.h) || (gVar instanceof t4.b) || (gVar instanceof t4.e) || (gVar instanceof p4.e), h(gVar));
    }

    @Nullable
    public static f.a c(k4.g gVar, Format format, g0 g0Var) {
        if (gVar instanceof p) {
            return b(new p(format.B, g0Var));
        }
        if (gVar instanceof t4.h) {
            return b(new t4.h());
        }
        if (gVar instanceof t4.b) {
            return b(new t4.b());
        }
        if (gVar instanceof t4.e) {
            return b(new t4.e());
        }
        if (gVar instanceof p4.e) {
            return b(new p4.e());
        }
        return null;
    }

    public static q4.f e(g0 g0Var, Format format, @Nullable List<Format> list) {
        int i10 = g(format) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new q4.f(i10, g0Var, null, list);
    }

    public static t4.g0 f(int i10, boolean z10, Format format, @Nullable List<Format> list, g0 g0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(Format.x(null, "application/cea-608", 0, null)) : Collections.emptyList();
        }
        String str = format.f19924g;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(a6.p.b(str))) {
                i11 |= 2;
            }
            if (!"video/avc".equals(a6.p.k(str))) {
                i11 |= 4;
            }
        }
        return new t4.g0(2, g0Var, new t4.j(i11, list));
    }

    public static boolean g(Format format) {
        Metadata metadata = format.f19925h;
        if (metadata == null) {
            return false;
        }
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            if (metadata.d(i10) instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).f20539d.isEmpty();
            }
        }
        return false;
    }

    public static boolean h(k4.g gVar) {
        return (gVar instanceof t4.g0) || (gVar instanceof q4.f);
    }

    public static boolean i(k4.g gVar, k4.h hVar) throws InterruptedException, IOException {
        try {
            boolean zA = gVar.a(hVar);
            hVar.resetPeekPosition();
            return zA;
        } catch (EOFException unused) {
            hVar.resetPeekPosition();
            return false;
        } catch (Throwable th2) {
            hVar.resetPeekPosition();
            throw th2;
        }
    }

    @Override // j5.f
    public f.a a(@Nullable k4.g gVar, Uri uri, Format format, @Nullable List<Format> list, g0 g0Var, Map<String, List<String>> map, k4.h hVar) throws InterruptedException, IOException {
        if (gVar != null) {
            if (h(gVar)) {
                return b(gVar);
            }
            if (c(gVar, format, g0Var) == null) {
                throw new IllegalArgumentException("Unexpected previousExtractor type: " + gVar.getClass().getSimpleName());
            }
        }
        k4.g gVarD = d(uri, format, list, g0Var);
        hVar.resetPeekPosition();
        if (i(gVarD, hVar)) {
            return b(gVarD);
        }
        if (!(gVarD instanceof p)) {
            p pVar = new p(format.B, g0Var);
            if (i(pVar, hVar)) {
                return b(pVar);
            }
        }
        if (!(gVarD instanceof t4.h)) {
            t4.h hVar2 = new t4.h();
            if (i(hVar2, hVar)) {
                return b(hVar2);
            }
        }
        if (!(gVarD instanceof t4.b)) {
            t4.b bVar = new t4.b();
            if (i(bVar, hVar)) {
                return b(bVar);
            }
        }
        if (!(gVarD instanceof t4.e)) {
            t4.e eVar = new t4.e();
            if (i(eVar, hVar)) {
                return b(eVar);
            }
        }
        if (!(gVarD instanceof p4.e)) {
            p4.e eVar2 = new p4.e(0, 0L);
            if (i(eVar2, hVar)) {
                return b(eVar2);
            }
        }
        if (!(gVarD instanceof q4.f)) {
            q4.f fVarE = e(g0Var, format, list);
            if (i(fVarE, hVar)) {
                return b(fVarE);
            }
        }
        if (!(gVarD instanceof t4.g0)) {
            t4.g0 g0VarF = f(this.f72195b, this.f72196c, format, list, g0Var);
            if (i(g0VarF, hVar)) {
                return b(g0VarF);
            }
        }
        return b(gVarD);
    }

    public final k4.g d(Uri uri, Format format, @Nullable List<Format> list, g0 g0Var) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return ("text/vtt".equals(format.f19927j) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) ? new p(format.B, g0Var) : lastPathSegment.endsWith(".aac") ? new t4.h() : (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) ? new t4.b() : lastPathSegment.endsWith(".ac4") ? new t4.e() : lastPathSegment.endsWith(".mp3") ? new p4.e(0, 0L) : (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() + (-4)) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + (-5)) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() + (-5))) ? e(g0Var, format, list) : f(this.f72195b, this.f72196c, format, list, g0Var);
    }
}
